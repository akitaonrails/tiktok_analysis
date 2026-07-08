package X;

import Y.ACListenerS151S0100000_16;
import Y.AUListenerS265S0100000_16;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.commercialize.model.IABBottomBarElement;
import com.ss.android.ugc.aweme.feed.model.CommerceAgentHint;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0d6G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1037300d6G extends RelativeLayout implements InterfaceC1036210d4V {
    public TuxIconView LL;
    public TuxIconView LLILLJJLI;
    public TuxIconView LLILLL;
    public TuxIconView LLILZ;
    public View LLILZIL;
    public Animator LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public InterfaceC1037310d6H LLJ;
    public InterfaceC1036080d4I LLJI;

    @Override // X.InterfaceC1036210d4V
    public final void LIZ() {
    }

    @Override // X.InterfaceC1036210d4V
    public final void LIZJ(View view, IABBottomBarElement iABBottomBarElement) {
    }

    @Override // X.InterfaceC1036210d4V
    public final void LJ() {
    }

    @Override // X.InterfaceC1036210d4V
    public final void LJFF(boolean z) {
    }

    @Override // X.InterfaceC1036210d4V
    public final void LJI(List<CommerceAgentHint> list) {
    }

    @Override // X.InterfaceC1036210d4V
    public final void LJIIIIZZ(SparkContext sparkContext, C1016930cZP c1016930cZP, String str, Runnable runnable) {
    }

    @Override // X.InterfaceC1036210d4V
    public final void LJIIJ() {
    }

    @Override // X.InterfaceC1036210d4V
    public final void LJIIJJI(boolean z) {
    }

    @Override // X.InterfaceC1036210d4V
    public final void LJIILIIL() {
    }

    @Override // X.InterfaceC1036210d4V
    public boolean getAnimatorIsRunning() {
        return false;
    }

    @Override // X.InterfaceC1036210d4V
    public View getCheckoutComponent() {
        return null;
    }

    @Override // X.InterfaceC1036210d4V
    public ViewGroup getView() {
        return this;
    }

    public final void LJIILL() {
        if (this.LLIZ) {
            return;
        }
        Animator animator = this.LLILZLL;
        if ((animator == null || !animator.isRunning()) && !this.LLIZLLLIL) {
            this.LLIZ = true;
            this.LLIZLLLIL = true;
            LJIILJJIL(C341940Daq.LIZ(-52.0d), 0);
        }
    }

    public final TuxIconView getPopUpWebNaviGoBackFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rhm);
            this.LL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxIconView getPopUpWebNaviGoBackNewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rhn);
            this.LLILLJJLI = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxIconView getPopUpWebNaviGoForwardFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rho);
            this.LLILLL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxIconView getPopUpWebNaviGoForwardNewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rhp);
            this.LLILZ = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final View getSpaceFromXml() {
        View view = this.LLILZIL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.vr6);
        this.LLILZIL = viewFindViewById;
        return viewFindViewById;
    }

    private final int getBottomMargin() {
        return ((ViewGroup.MarginLayoutParams) getLayoutParams()).bottomMargin;
    }

    @Override // X.InterfaceC1036210d4V
    public final void LJIIL() {
        C786410Ut5.LLLLLLZZ(getPopUpWebNaviGoBackFromXml(), 8);
        C786410Ut5.LLLLLLZZ(getPopUpWebNaviGoForwardFromXml(), 8);
        C786410Ut5.LJLLLLLL(0, getSpaceFromXml());
        C786410Ut5.LLLLLLZZ(getPopUpWebNaviGoBackNewFromXml(), 0);
        C786410Ut5.LLLLLLZZ(getPopUpWebNaviGoForwardNewFromXml(), 0);
        int visibility = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, this);
        LJIILL();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Animator animator = this.LLILZLL;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final InterfaceC1036080d4I getAdWebBottomBarListener() {
        return this.LLJI;
    }

    public final InterfaceC1037310d6H getNaviBarListener() {
        return this.LLJ;
    }

    @Override // X.InterfaceC1036210d4V
    public final void LIZLLL(MotionEvent motionEvent) {
        if (getVisibility() != 8 && motionEvent.getAction() == 0) {
            this.LLIZLLLIL = false;
        }
    }

    @Override // X.InterfaceC1036210d4V
    public final void LJII(boolean z) {
        setGoForwardEnable(z);
    }

    @Override // X.InterfaceC1036210d4V
    public final void LJIIIZ(boolean z) {
        setGoBackEnable(z);
    }

    public final void setAdWebBottomBarListener(InterfaceC1036080d4I interfaceC1036080d4I) {
        this.LLJI = interfaceC1036080d4I;
    }

    public final void setBottomMargin(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.bottomMargin = i;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(marginLayoutParams);
    }

    public final void setGoBackEnable(boolean z) {
        float f;
        TuxIconView popUpWebNaviGoBackFromXml = getPopUpWebNaviGoBackFromXml();
        float f2 = 1.0f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.34f;
        }
        C786410Ut5.x5(popUpWebNaviGoBackFromXml, f);
        TuxIconView popUpWebNaviGoBackNewFromXml = getPopUpWebNaviGoBackNewFromXml();
        if (!z) {
            f2 = 0.34f;
        }
        C786410Ut5.x5(popUpWebNaviGoBackNewFromXml, f2);
    }

    public final void setGoForwardEnable(boolean z) {
        float f;
        TuxIconView popUpWebNaviGoForwardFromXml = getPopUpWebNaviGoForwardFromXml();
        float f2 = 1.0f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.34f;
        }
        C786410Ut5.x5(popUpWebNaviGoForwardFromXml, f);
        TuxIconView popUpWebNaviGoForwardNewFromXml = getPopUpWebNaviGoForwardNewFromXml();
        if (!z) {
            f2 = 0.34f;
        }
        C786410Ut5.x5(popUpWebNaviGoForwardNewFromXml, f2);
    }

    @Override // X.InterfaceC1036210d4V
    public void setListener(InterfaceC1036080d4I interfaceC1036080d4I) {
        this.LLJI = interfaceC1036080d4I;
        C786410Ut5.a9(getPopUpWebNaviGoBackNewFromXml(), new ACListenerS151S0100000_16(interfaceC1036080d4I, 30));
        C786410Ut5.a9(getPopUpWebNaviGoForwardNewFromXml(), new ACListenerS151S0100000_16(interfaceC1036080d4I, 31));
    }

    public final void setNaviBarListener(InterfaceC1037310d6H interfaceC1037310d6H) {
        this.LLJ = interfaceC1037310d6H;
    }

    public final void setPopUpWebNaviGoBackFromXml(TuxIconView tuxIconView) {
        this.LL = tuxIconView;
    }

    public final void setPopUpWebNaviGoBackNewFromXml(TuxIconView tuxIconView) {
        this.LLILLJJLI = tuxIconView;
    }

    public final void setPopUpWebNaviGoForwardFromXml(TuxIconView tuxIconView) {
        this.LLILLL = tuxIconView;
    }

    public final void setPopUpWebNaviGoForwardNewFromXml(TuxIconView tuxIconView) {
        this.LLILZ = tuxIconView;
    }

    public final void setSpaceFromXml(View view) {
        this.LLILZIL = view;
    }

    public C1037300d6G(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.i_z, this, true);
        C786410Ut5.a9(getPopUpWebNaviGoBackFromXml(), new ACListenerS151S0100000_16(this, 32));
        C786410Ut5.a9(getPopUpWebNaviGoBackNewFromXml(), new ACListenerS151S0100000_16(this, 33));
        C786410Ut5.a9(getPopUpWebNaviGoForwardFromXml(), new ACListenerS151S0100000_16(this, 34));
        C786410Ut5.a9(getPopUpWebNaviGoForwardNewFromXml(), new ACListenerS151S0100000_16(this, 35));
    }

    public final void LJIILJJIL(int i, int i2) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS265S0100000_16(this, 52));
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.setInterpolator(new C21388418n4());
        valueAnimatorOfInt.setTarget(this);
        valueAnimatorOfInt.start();
        this.LLILZLL = valueAnimatorOfInt;
    }

    @Override // X.InterfaceC1036210d4V
    public final void LIZIZ(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("visibility ");
        if (getVisibility() == 8) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        if (getVisibility() == 8) {
            return;
        }
        int i5 = i2 - i4;
        if (i5 > 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("delta ");
            sbLIZ2.append(i5);
            sbLIZ2.append(' ');
            sbLIZ2.append(i2);
            sbLIZ2.append(' ');
            sbLIZ2.append(i4);
            sbLIZ2.append(" isShowing ");
            sbLIZ2.append(this.LLIZ);
            sbLIZ2.append(" animator?.isRunning ");
            Animator animator = this.LLILZLL;
            if (animator != null && animator.isRunning()) {
                z2 = true;
            } else {
                z2 = false;
            }
            sbLIZ2.append(z2);
            sbLIZ2.append(" animatedInOneTouch ");
            sbLIZ2.append(this.LLIZLLLIL);
            C2188811AlT.LIZIZ(sbLIZ2);
            if (this.LLIZ) {
                Animator animator2 = this.LLILZLL;
                if ((animator2 != null && animator2.isRunning()) || this.LLIZLLLIL) {
                    return;
                }
                this.LLIZ = false;
                this.LLIZLLLIL = true;
                LJIILJJIL(0, C341940Daq.LIZ(-52.0d));
                return;
            }
            return;
        }
        LJIILL();
    }
}
