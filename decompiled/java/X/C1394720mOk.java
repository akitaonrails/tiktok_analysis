package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedList;
import java.util.Queue;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS160S0101000_21;
import kotlin.jvm.internal.AwS170S1100000_21;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0mOk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1394720mOk extends FrameLayout {
    public static final /* synthetic */ int LLILZLL = 0;
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public boolean LLILZ;
    public final Queue<Function0<Unit>> LLILZIL;

    public int LIZ() {
        return R.layout.cv2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.LLILZ = false;
        super.onDetachedFromWindow();
    }

    private final TextView getSubTitleView() {
        return (TextView) this.LLILLJJLI.getValue();
    }

    private final TextView getTitleView() {
        return (TextView) this.LL.getValue();
    }

    public final SmartImageView getIconView() {
        return (SmartImageView) this.LLILLL.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLILZ = true;
        C786410Ut5.Td(C786410Ut5.ne(getContext()), LIZ(), this, true);
        while (((LinkedList) this.LLILZIL).peek() != null) {
            ((Function0) ((LinkedList) this.LLILZIL).poll()).invoke();
        }
        CharSequence text = getSubTitleView().getText();
        if (text == null || text.length() == 0) {
            C786410Ut5.LLIL(getSubTitleView(), 8);
            TextView titleView = getTitleView();
            ViewGroup.LayoutParams layoutParams = titleView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            C19ME c19me = (C19ME) layoutParams;
            c19me.bottomToBottom = 0;
            ((ViewGroup.MarginLayoutParams) c19me).topMargin = 0;
            C786410Ut5.W5(titleView, c19me);
        }
    }

    public final boolean getAttached() {
        return this.LLILZ;
    }

    public final Queue<Function0<Unit>> getPendingSetting() {
        return this.LLILZIL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        InterfaceC1197130hG3 interfaceC1197130hG3;
        AbstractC1066910ds1 abstractC1066910ds1;
        C1361910lXp c1361910lXp;
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (C04UD.LIZ() && motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null && numValueOf.intValue() != 0 && numValueOf.intValue() != 2) {
            if (numValueOf.intValue() == 1) {
                Object tag = getTag(R.id.b09);
                if (tag instanceof InterfaceC1197130hG3) {
                    interfaceC1197130hG3 = (InterfaceC1197130hG3) tag;
                } else {
                    interfaceC1197130hG3 = null;
                }
                Object tag2 = getTag(R.id.b0j);
                if ((tag2 instanceof AbstractC1066890drz) && (abstractC1066910ds1 = (AbstractC1066910ds1) tag2) != null && (c1361910lXp = (C1361910lXp) C1361900lXo.LIZ("event_enter_detail")) != null) {
                    c1361910lXp.LIZJ = "click_list";
                    if (interfaceC1197130hG3 != null) {
                        interfaceC1197130hG3.kF(c1361910lXp, abstractC1066910ds1);
                    }
                }
            } else {
                numValueOf.intValue();
                return zDispatchTouchEvent;
            }
        }
        return zDispatchTouchEvent;
    }

    public final void setAttached(boolean z) {
        this.LLILZ = z;
    }

    public final void setIcon(UrlModel urlModel) {
        float fLIZJ;
        if (urlModel == null) {
            return;
        }
        if (!this.LLILZ) {
            ((LinkedList) this.LLILZIL).offer(new AwS422S0200000_21(this, urlModel, 46));
            return;
        }
        float fLIZJ2 = C12ES.LIZJ(64.0f, getContext());
        try {
            fLIZJ = C12ES.LIZJ((urlModel.getHeight() * 64) / urlModel.getWidth(), getContext());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            fLIZJ = C12ES.LIZJ(64.0f, getContext());
        }
        ViewGroup.LayoutParams layoutParams = getIconView().getLayoutParams();
        layoutParams.width = (int) fLIZJ2;
        layoutParams.height = (int) fLIZJ;
        C786410Ut5.G6(getIconView(), layoutParams);
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
        c1331670kl3LJIIIIZZ.LJIL = Bitmap.Config.ARGB_8888;
        c1331670kl3LJIIIIZZ.LJJ(getIconView());
        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
    }

    public final void setIconRes(int i) {
        if (!this.LLILZ) {
            ((LinkedList) this.LLILZIL).offer(new AwS160S0101000_21(this, i, 1));
            return;
        }
        getIconView().setImageResource(i);
    }

    public final void setSubTitle(String str) {
        if (!this.LLILZ) {
            ((LinkedList) this.LLILZIL).offer(new AwS170S1100000_21(this, str, 1));
            return;
        }
        getSubTitleView().setText(str);
    }

    public final void setTitle(String str) {
        if (!this.LLILZ) {
            ((LinkedList) this.LLILZIL).offer(new AwS170S1100000_21(this, str, 2));
            return;
        }
        getTitleView().setText(str);
    }

    public C1394720mOk(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1394720mOk(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 704));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 703));
        this.LLILLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 702));
        this.LLILZIL = new LinkedList();
    }
}
