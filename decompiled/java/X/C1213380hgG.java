package X;

import Y.ARunnableS119S0100000_19;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Space;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0hgG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1213380hgG extends ScrollView implements InterfaceC1213420hgK {
    public C1213390hgH LL;
    public int LLILLJJLI;
    public int LLILLL;
    public LinearLayout LLILZ;
    public C427290GpD LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public boolean LLIZLLLIL;
    public View.OnClickListener LLJ;
    public int LLJI;

    public final void LJ() {
        if (this.LLILZ == null || this.LL == null) {
            return;
        }
        Resources resources = getResources();
        C427290GpD c427290GpD = this.LLILZIL;
        if (c427290GpD != null) {
            c427290GpD.setTextColor(resources.getColor(this.LLJI == 0 ? R.color.dg : R.color.be));
        }
    }

    public final void LIZIZ() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            int i = layoutParams.height;
            if (i >= 0) {
                this.LLILLJJLI = i;
            } else if (i == -2) {
                throw new IllegalArgumentException("DmtDefaultView doesn't support layout_height set to WRAP_CONTENT!");
            }
        }
    }

    public final void LIZJ() {
        int i;
        LIZIZ();
        if (this.LL == null || (i = this.LLILLJJLI) < this.LLILZLL) {
            return;
        }
        ((LinearLayout.LayoutParams) this.LLILZIL.getLayoutParams()).topMargin = (int) ((i * 0.3f) + 0.5f);
        this.LLILZIL.requestLayout();
    }

    public final void LIZLLL() {
        LIZIZ();
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
        setScrollY(0);
        if (this.LL == null || this.LLILLJJLI < this.LLILZLL) {
            return;
        }
        C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.fte, this, true);
        this.LLILZ = (LinearLayout) findViewById(R.id.mde);
        C427290GpD c427290GpD = (C427290GpD) findViewById(R.id.zhs);
        this.LLILZIL = c427290GpD;
        C1213390hgH c1213390hgH = this.LL;
        if (c1213390hgH.LIZIZ) {
            c427290GpD.setText(c1213390hgH.LIZ);
        }
        this.LLILZ.addView(new Space(getContext()), new LinearLayout.LayoutParams(-1, this.LLIZ));
        View.OnClickListener onClickListener = this.LLJ;
        if (onClickListener != null) {
            C786410Ut5.R7(this.LLILZ, onClickListener);
        }
        this.LLIZLLLIL = true;
        LJ();
        if (getLayoutDirection() == 1) {
            setLayoutDirection(0);
            this.LLILZ.setLayoutDirection(1);
        }
        LIZJ();
    }

    public C1213380hgG(Context context) {
        super(context, null, 0);
        C0CHQ.LIZ().getUiService().getClass();
        this.LLJI = 0;
        LIZIZ();
        getContext().getResources();
        this.LLILZLL = C418440Gaw.LIZ(100);
        this.LLIZ = C418440Gaw.LIZ(40);
    }

    @Override // X.InterfaceC1213420hgK
    public final void LIZ(int i) {
        if (this.LLJI != i) {
            this.LLJI = i;
            LJ();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (C788530UwV.LIZ("dispatchScrollViewTouchEvent")) {
            C2188191AkT.LIZLLL();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.LLJ = onClickListener;
        LinearLayout linearLayout = this.LLILZ;
        if (linearLayout != null) {
            C786410Ut5.R7(linearLayout, onClickListener);
        }
    }

    public void setStatus(C1213390hgH c1213390hgH) {
        if (c1213390hgH == null) {
            return;
        }
        this.LL = c1213390hgH;
        if (c1213390hgH.LIZIZ && TextUtils.isEmpty(c1213390hgH.LIZ)) {
            throw new IllegalArgumentException("desc text should not be empty String!");
        }
        this.LLIZLLLIL = false;
        if (this.LLILLJJLI > 0) {
            LIZLLL();
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.LLILLJJLI != i2 || this.LLILLL != i) {
            this.LLILLL = i;
            this.LLILLJJLI = i2;
            if (this.LLILZ == null) {
                if (this.LL != null) {
                    if (this.LLIZLLLIL) {
                        LIZJ();
                        return;
                    } else {
                        LIZLLL();
                        return;
                    }
                }
                return;
            }
            HandlerHook.viewPost(this.LLILZ, new ARunnableS119S0100000_19(this, 124));
        }
    }
}
