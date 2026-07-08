package X;

import Y.ALAdapterS23S0200000_29;
import Y.AUListenerS152S0300000_17;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.bytedance.android.live.base.model.user.User;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.security.SecureRandom;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.159u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204748159u extends FrameLayout implements C15BS, C15AU {
    public ViewGroup LL;
    public String LLILLJJLI;
    public final boolean LLILLL;
    public final C1324720kZq LLILZ;
    public final C1295960jpS LLILZIL;
    public C1087140eOe LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public final C11NJ LLJ;
    public Animator LLJI;
    public final C01GW LLJIJIL;
    public C15A1 LLJILJIL;
    public final float LLJILJILJ;
    public C20475515Ab LLJILLL;
    public Function2<? super Boolean, ? super String, Unit> LLJJ;

    private final C16HX getAvatarImageLoadListener() {
        return (C16HX) this.LLJIJIL.getValue();
    }

    @Override // X.C15AJ
    public final boolean LLIIII() {
        return getParent() != null;
    }

    @Override // X.C15AJ
    public final void g() {
        if (!Intrinsics.LJFF(getParent(), getRoot())) {
            C15AI.LJII(this);
            getRoot().addView(this);
        }
        C500260Jjc.LJLJLJ(this, true);
    }

    @Override // android.view.View, X.C15AJ
    public String getTag() {
        C15A0 c15a0LJI;
        User user;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getGeniusId());
        sbLIZ.append('_');
        C20475515Ab geniusModel = getGeniusModel();
        sbLIZ.append((geniusModel == null || (c15a0LJI = geniusModel.LJI()) == null || (user = c15a0LJI.LIZJ) == null) ? null : user.getDisplayId());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (LLIIII()) {
            C15AI.LJFF(this, "onDetachedFromWindow return parent is also alive");
            return;
        }
        setActionSuccess(null);
        this.LLJ.LJ();
        LIZIZ(true);
    }

    @Override // X.C15AJ
    public final void LJIIJ() {
        C15AI.LJII(this);
    }

    @Override // X.C15AJ
    public final void LLLIILIL() {
        C15AI.LIZ(this);
    }

    @Override // X.C15AJ
    public final boolean LLZZLLIL() {
        return this.LLILLL;
    }

    @Override // X.C15AU
    public Function2<Boolean, String, Unit> getActionSuccess() {
        return this.LLJJ;
    }

    public final float getAmplitudePx() {
        return this.LLJILJILJ;
    }

    @Override // X.C15AJ
    public String getGeniusId() {
        return this.LLILLJJLI;
    }

    @Override // X.C15AJ
    public ViewGroup getRoot() {
        return this.LL;
    }

    @Override // X.C15AJ
    public C20475515Ab getGeniusModel() {
        return this.LLJILLL;
    }

    private final void setWiggleAnimator(Animator animator) {
        this.LLJI = animator;
        if (animator == null) {
            this.LLILZLL = null;
        }
    }

    public final void LIZIZ(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stopAnimation stopLottie:");
        sbLIZ.append(z);
        C15AI.LJFF(this, C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            this.LLILZIL.cancelAnimation();
            this.LLILZIL.removeAllAnimatorListeners();
            C500260Jjc.LJLJLJ(this.LLILZIL, false);
            this.LLJILJIL = null;
        }
        Animator animator = this.LLJI;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.LLJI;
        if (animator2 != null) {
            animator2.removeAllListeners();
        }
        setWiggleAnimator(null);
    }

    public final void LJ(C20475515Ab c20475515Ab) {
        float f;
        Animator animator;
        C15A0 c15a0LJI = c20475515Ab.LJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateLottieByGeniusModel id:");
        sbLIZ.append(c20475515Ab.LIZIZ);
        sbLIZ.append(" config:");
        sbLIZ.append(c15a0LJI);
        C15AI.LJFF(this, C2188811AlT.LIZIZ(sbLIZ));
        float f2 = 0.0f;
        float f3 = 1.0f;
        if (this.LLILLL) {
            int i = 1;
            if (c15a0LJI != null && (c15a0LJI.LIZIZ || c15a0LJI.LIZ)) {
                C1324720kZq c1324720kZq = this.LLILZ;
                if (c15a0LJI.LIZIZ) {
                    f2 = this.LLJILJILJ;
                }
                if (c15a0LJI.LIZ) {
                    f = 0.875f;
                    f3 = 1.125f;
                } else {
                    f = 1.0f;
                }
                C1087140eOe c1087140eOe = new C1087140eOe(f2, f, f3, 1);
                if (Intrinsics.LJFF(c1087140eOe, this.LLILZLL)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("wiggleInfo is the same as curWiggleInfo ");
                    sbLIZ2.append(c1087140eOe);
                    C15AI.LJFF(this, C2188811AlT.LIZIZ(sbLIZ2));
                    return;
                }
                this.LLILZLL = c1087140eOe;
                Animator animator2 = this.LLJI;
                if (animator2 != null && animator2.isRunning() && (animator = this.LLJI) != null) {
                    animator.cancel();
                }
                float f4 = c1087140eOe.LIZ;
                c1324720kZq.setPivotX(c1324720kZq.getMeasuredWidth() / 2.0f);
                c1324720kZq.setPivotY(c1324720kZq.getMeasuredHeight() / 2.0f);
                SecureRandom secureRandom = new SecureRandom();
                long j = (long) (LSPassThroughRecordSizeConfig.DEFAULT / f4);
                C118300cf c118300cf = new C118300cf();
                if (!secureRandom.nextBoolean()) {
                    i = -1;
                }
                c118300cf.element = i;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.setStartDelay(C13LZ.LJIIJJI(AbstractC19994813Le.Default, new C354710DvR(0L, 300L)));
                valueAnimatorOfFloat.setDuration(j);
                valueAnimatorOfFloat.setRepeatCount(-1);
                valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                valueAnimatorOfFloat.addUpdateListener(new AUListenerS152S0300000_17(c1087140eOe, c118300cf, c1324720kZq, 0));
                valueAnimatorOfFloat.addListener(new ALAdapterS23S0200000_29(c118300cf, secureRandom, 11));
                valueAnimatorOfFloat.start();
                setWiggleAnimator(valueAnimatorOfFloat);
                return;
            }
        }
        Animator animator3 = this.LLJI;
        if (animator3 != null) {
            animator3.cancel();
        }
        Animator animator4 = this.LLJI;
        if (animator4 != null) {
            animator4.removeAllListeners();
        }
        setWiggleAnimator(null);
        C786410Ut5.Yb(this.LLILZ, 1.0f);
        C786410Ut5.xc(this.LLILZ, 1.0f);
        C786410Ut5.Qc(this.LLILZ, 0.0f);
        C786410Ut5.md(this.LLILZ, 0.0f);
    }

    public final void LJFF(C15A1 c15a1) {
        FrameLayout.LayoutParams layoutParams;
        C1295960jpS c1295960jpS = this.LLILZIL;
        ViewGroup.LayoutParams layoutParams2 = c1295960jpS.getLayoutParams();
        FrameLayout.LayoutParams layoutParams3 = null;
        if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
            C20476115Ah c20476115Ah = c15a1.LIZIZ;
            layoutParams.width = c20476115Ah.LIZJ;
            layoutParams.height = c20476115Ah.LIZLLL;
            layoutParams.gravity = 8388659;
            layoutParams.setMarginStart(c20476115Ah.LIZ);
            layoutParams.topMargin = c15a1.LIZIZ.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("try start lottie,config's value curPlayingLottieConfig:");
            sbLIZ.append(this.LLJILJIL);
            sbLIZ.append(" topMargin:");
            sbLIZ.append(layoutParams.topMargin);
            sbLIZ.append(" marginStart:");
            sbLIZ.append(layoutParams.getMarginStart());
            C15AI.LJFF(this, C2188811AlT.LIZIZ(sbLIZ));
            layoutParams3 = layoutParams;
        }
        C786410Ut5.s6(c1295960jpS, layoutParams3);
    }

    @Override // X.C15AJ
    public final ViewGroup.LayoutParams LLIIIZ(Rect rect) {
        return C15AI.LIZIZ(this, rect);
    }

    @Override // X.C15AJ
    public final void LLIIL(View view) {
        C15AI.LJIIIIZZ(this, view);
    }

    @Override // X.C15AJ
    public final void W(InterfaceC20476615Am interfaceC20476615Am) {
        C15AI.LJ(this, interfaceC20476615Am);
        C500260Jjc.LJLJLJ(this, false);
    }

    @Override // X.C15AJ
    public final void log(String str) {
        C15AI.LJFF(this, str);
    }

    @Override // X.C15AU
    public void setActionSuccess(Function2<? super Boolean, ? super String, Unit> function2) {
        this.LLJJ = function2;
    }

    public void setGeniusId(String str) {
        this.LLILLJJLI = str;
    }

    @Override // X.C15AJ
    public void setRoot(ViewGroup viewGroup) {
        this.LL = viewGroup;
    }

    @Override // X.C15AJ
    public void setGeniusModel(C20475515Ab c20475515Ab) {
        this.LLJILLL = c20475515Ab;
    }

    public static final int LIZJ(boolean z, C20475515Ab c20475515Ab) {
        float f;
        PointF pointF;
        if (z) {
            C15A0 c15a0LJI = c20475515Ab.LJI();
            if (c15a0LJI != null && (pointF = c15a0LJI.LJFF) != null) {
                f = pointF.x;
            } else {
                f = 0.0f;
            }
            return (int) f;
        }
        return c20475515Ab.LIZ.LIZ;
    }

    public static final int LIZLLL(boolean z, C20475515Ab c20475515Ab) {
        float f;
        PointF pointF;
        if (z) {
            C15A0 c15a0LJI = c20475515Ab.LJI();
            if (c15a0LJI != null && (pointF = c15a0LJI.LJFF) != null) {
                f = pointF.y;
            } else {
                f = 0.0f;
            }
            return (int) f;
        }
        return c20475515Ab.LIZ.LIZIZ;
    }

    public C204748159u(ViewGroup viewGroup, String str, boolean z) {
        super(viewGroup.getContext());
        this.LL = viewGroup;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLIZ = "";
        this.LLIZLLLIL = "";
        this.LLJ = new C11NJ();
        this.LLJIJIL = C292401Bi.LIZ(new AwS575S0100000_31(this, 1335));
        C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.ha5, this, true);
        this.LLILZ = (C1324720kZq) findViewById(R.id.bkz);
        this.LLILZIL = (C1295960jpS) findViewById(R.id.h01);
        ViewGroup.LayoutParams layoutParamsLLIIIZ = LLIIIZ(new Rect());
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParamsLLIIIZ);
        getRoot().setClipChildren(false);
        this.LLJILJILJ = C418440Gaw.LIZIZ(2);
    }

    @Override // X.C15AJ
    public final void LJLL(List list, InterfaceC20476615Am interfaceC20476615Am, Function2 function2) {
        C15AI.LJIIIZ(this, list, interfaceC20476615Am, function2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0287  */
    @Override // X.C15AJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJJIJIL(java.util.List r16, X.InterfaceC20476615Am r17, kotlin.jvm.functions.Function2 r18) {
        /*
            Method dump skipped, instruction units count: 725
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204748159u.LLJJIJIL(java.util.List, X.15Am, kotlin.jvm.functions.Function2):void");
    }

    @Override // X.C15AJ
    public final void LLJLILLLLZIIL(InterfaceC20476615Am interfaceC20476615Am, String str, Function2 function2) {
        C15AI.LJI(this, interfaceC20476615Am, str, function2);
    }

    @Override // X.C15AU
    public final void LIZ(Function2<? super Boolean, ? super String, Unit> function2, C1295960jpS c1295960jpS, C15AO c15ao, C1294720jnS c1294720jnS) {
        C15AS.LIZIZ(this, function2, c1295960jpS, c15ao, c1294720jnS);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0162  */
    @Override // X.C15AJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLZZIL(X.InterfaceC20476615Am r8, java.lang.String r9, boolean r10, kotlin.jvm.functions.Function2 r11) {
        /*
            Method dump skipped, instruction units count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204748159u.LLLZZIL(X.15Am, java.lang.String, boolean, kotlin.jvm.functions.Function2):void");
    }
}
