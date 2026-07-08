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
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0hgB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1213330hgB extends ScrollView implements InterfaceC1213370hgF {
    public C1209260hZc LL;
    public int LLILLJJLI;
    public int LLILLL;
    public LinearLayout LLILZ;
    public TextView LLILZIL;
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
        TextView textView = this.LLILZIL;
        if (textView != null) {
            textView.setTextColor(this.LLJI == 0 ? resources.getColor(R.color.dg) : resources.getColor(R.color.be));
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
        C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.d34, this, true);
        this.LLILZ = (LinearLayout) findViewById(R.id.mde);
        TextView textView = (TextView) findViewById(R.id.zhs);
        this.LLILZIL = textView;
        textView.setText(this.LL.LIZ);
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

    public C1213330hgB(Context context) {
        super(context, null, 0);
        LIZIZ();
        Resources resources = getContext().getResources();
        this.LLILZLL = resources.getDimensionPixelSize(R.dimen.q3);
        this.LLIZ = resources.getDimensionPixelSize(R.dimen.q4);
    }

    @Override // X.InterfaceC1213370hgF
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

    public void setStatus(C1209260hZc c1209260hZc) {
        if (c1209260hZc == null) {
            return;
        }
        this.LL = c1209260hZc;
        if (!TextUtils.isEmpty(c1209260hZc.LIZ)) {
            this.LLIZLLLIL = false;
            if (this.LLILLJJLI > 0) {
                LIZLLL();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("desc text should not be empty String!");
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
            HandlerHook.viewPost(this.LLILZ, new ARunnableS119S0100000_19(this, 214));
        }
    }
}
