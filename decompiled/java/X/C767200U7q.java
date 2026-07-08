package X;

import Y.ALAdapterS0S0000000_12;
import Y.ALAdapterS9S0100000_12;
import android.animation.ValueAnimator;
import com.bytedance.android.livesdk.livesetting.effect.LiveAndroidCycleThroughFiltersSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0U7q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C767200U7q implements InterfaceC769240UFm {
    public static final C767200U7q LIZ = new C767200U7q();
    public static final C0U78 LIZIZ = C0UA1.LIZ();
    public static final String LIZJ;
    public static final boolean LIZLLL;
    public static boolean LJ;
    public static boolean LJFF;
    public static LiveEffect LJI;
    public static LiveEffect LJII;
    public static final C0U5Z LJIIIIZZ;
    public static final C767210U7r LJIIIZ;
    public static float LJIIJ;
    public static ValueAnimator LJIIJJI;
    public static ValueAnimator LJIIL;
    public static DataChannel LJIILIIL;
    public static boolean LJIILJJIL;

    static {
        String str = C0UD4.LIZ;
        LIZJ = "livefiltercomposerexperiment";
        LIZLLL = C497740JfY.LJJ();
        LJIIIIZZ = C760630Tsb.LIZ();
        LJIIIZ = C767210U7r.LIZIZ.getValue();
    }

    public static boolean LJIIJJI() {
        return !((ArrayList) LJIIIIZZ.LIZ).isEmpty();
    }

    public static boolean LJIIL() {
        if (LiveAndroidCycleThroughFiltersSetting.INSTANCE.isEnabled()) {
            return false;
        }
        int iLIZJ = LJIIIZ.LIZJ();
        if (C497740JfY.LJJ()) {
            if (LJFF) {
                if (iLIZJ < ((ArrayList) LJIIIIZZ.LIZ).size() - 1) {
                    return false;
                }
            } else if (iLIZJ > 0) {
                return false;
            }
            return true;
        }
        if (LJFF) {
            if (iLIZJ > 0) {
                return false;
            }
        } else if (iLIZJ < ((ArrayList) LJIIIIZZ.LIZ).size() - 1) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC769240UFm
    public final void LJFF() {
        ValueAnimator valueAnimator = LJIIJJI;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        ValueAnimator valueAnimator2 = LJIIL;
        if (valueAnimator2 != null) {
            valueAnimator2.end();
        }
        LJIIJJI = null;
        LJIIL = null;
    }

    @Override // X.InterfaceC769240UFm
    public final int LJII() {
        int iLIZJ = LJIIIZ.LIZJ();
        int i = (!LIZLLL ? LJFF : !LJFF) ? iLIZJ + 1 : iLIZJ - 1;
        boolean zIsEnabled = LiveAndroidCycleThroughFiltersSetting.INSTANCE.isEnabled();
        if (i < 0) {
            if (zIsEnabled) {
                return ((ArrayList) LJIIIIZZ.LIZ).size() - 1;
            }
            return 0;
        }
        if (i < ((ArrayList) LJIIIIZZ.LIZ).size()) {
            return i;
        }
        if (zIsEnabled) {
            return 0;
        }
        return ((ArrayList) r1.LIZ).size() - 1;
    }

    @Override // X.InterfaceC769240UFm
    public final void release() {
        ValueAnimator valueAnimator = LJIIJJI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = LJIIL;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        LJIIJJI = null;
        LJIIL = null;
        LJIILIIL = null;
    }

    @Override // X.InterfaceC769240UFm
    public final boolean LJIIIIZZ() {
        return LJIIJJI();
    }

    @Override // X.InterfaceC769240UFm
    public final void LJIIJ() {
        if (!LJIIJJI() || LJIIL()) {
            return;
        }
        C0U5Z c0u5z = LJIIIIZZ;
        LJII = (LiveEffect) ListProtector.get(c0u5z.LIZ, LJIIIZ.LIZJ());
        LiveEffect liveEffect = (LiveEffect) ListProtector.get(c0u5z.LIZ, LJII());
        LJI = liveEffect;
        if (!c0u5z.LJI(liveEffect)) {
            C770170UJb.LIZJ("ComposerFilterSlideHelper");
            C20441214yg.LIZIZ("effect_log", C770170UJb.LIZ("Filter isn't downloaded yet."));
            C770170UJb.LIZLLL = "";
            return;
        }
        C770170UJb.LIZJ("ComposerFilterSlideHelper");
        C770170UJb.LIZLLL = "prepareNewFilter";
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("slideToRight: ");
        sbLIZ.append(LJFF);
        sbLIZ.append(" current: ");
        sbLIZ.append(LJII);
        sbLIZ.append(" new: ");
        sbLIZ.append(LJI);
        C770170UJb.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        LiveEffect liveEffect2 = LJI;
        if (liveEffect2 == null || !(!liveEffect2.LJJIJIIJI())) {
            return;
        }
        float fLJFF = c0u5z.LJFF(liveEffect2);
        C0U78 c0u78 = LIZIZ;
        String str = LIZJ;
        LiveEffect.ComposerConfig composerConfigLJIIJ = C0U7C.LJIIJ(liveEffect2);
        c0u78.LJI(str, liveEffect2, fLJFF, composerConfigLJIIJ != null ? composerConfigLJIIJ.LIZIZ : 0);
    }

    @Override // X.InterfaceC769240UFm
    public final boolean LIZIZ() {
        return LJ;
    }

    @Override // X.InterfaceC769240UFm
    public final boolean LIZLLL() {
        return LJFF;
    }

    @Override // X.InterfaceC769240UFm
    public final void LIZJ(float f) {
        if (LJIIJJI() && !LJIIL()) {
            LJIIJ = f;
            if (LJFF) {
                LJIILIIL(LJI, LJII, f);
                return;
            } else {
                LJIILIIL(LJII, LJI, f);
                return;
            }
        }
        C20441214yg.LIZIZ("ComposerFilterSlideHelper", "Filter isn't downloaded yet.");
    }

    @Override // X.InterfaceC769240UFm
    public final void LJ(Function0<Unit> function0) {
        float f;
        if (LJIIJJI() && !LJIIL()) {
            C770170UJb.LIZJ("ComposerFilterSlideHelper");
            C770170UJb.LIZLLL = "onFling";
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("newFilter: ");
            sbLIZ.append(LJI);
            C770170UJb.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            float[] fArr = new float[2];
            fArr[0] = LJIIJ;
            if (LJFF) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            fArr[1] = f;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
            valueAnimatorOfFloat.setDuration(300L);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0U7o
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onSlidingInNewFilter value: ");
                    sbLIZ2.append(fFloatValue);
                    C20441214yg.LIZIZ("ComposerFilterSlideHelper", C2188811AlT.LIZIZ(sbLIZ2));
                    C767200U7q.LIZ.LIZJ(fFloatValue);
                }
            });
            valueAnimatorOfFloat.addListener(new ALAdapterS9S0100000_12(function0, 28));
            valueAnimatorOfFloat.start();
            LJIIL = valueAnimatorOfFloat;
        }
    }

    @Override // X.InterfaceC769240UFm
    public final void LJI(boolean z) {
        LJFF = z;
    }

    @Override // X.InterfaceC769240UFm
    public final void LJIIIZ(Function0<Unit> function0) {
        float f;
        if (!LJIIJJI()) {
            return;
        }
        C770170UJb.LIZJ("ComposerFilterSlideHelper");
        C770170UJb.LIZLLL = "rollbackOrSetNewFilter";
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isSlidingFromLeft: ");
        sbLIZ.append(LJFF);
        sbLIZ.append(" ratio: ");
        sbLIZ.append(LJIIJ);
        C770170UJb.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (!LJFF ? LJIIJ < 0.5f : LJIIJ >= 0.5f) {
            LJ(function0);
            return;
        }
        C770170UJb.LIZJ("ComposerFilterSlideHelper");
        C770170UJb.LIZLLL = "rollbackToCurrentFilter";
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("current: ");
        sbLIZ2.append(LJII);
        C770170UJb.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
        float[] fArr = new float[2];
        fArr[0] = LJIIJ;
        if (LJFF) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        fArr[1] = f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0U7p
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C767200U7q.LIZ.LIZJ(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        valueAnimatorOfFloat.addListener(new ALAdapterS0S0000000_12(3));
        valueAnimatorOfFloat.start();
        LJIIJJI = valueAnimatorOfFloat;
    }

    @Override // X.InterfaceC769240UFm
    public final void LIZ(DataChannel dataChannel, boolean z) {
        if (!LJIIJJI()) {
            return;
        }
        LJIILIIL = dataChannel;
        LJ = z;
    }

    public static void LJIILIIL(LiveEffect liveEffect, LiveEffect liveEffect2, float f) {
        String name;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateFilterPosition leftFilter: ");
        String name2 = null;
        if (liveEffect != null) {
            name = liveEffect.getName();
        } else {
            name = null;
        }
        sbLIZ.append(name);
        sbLIZ.append(" rightFilter: ");
        if (liveEffect2 != null) {
            name2 = liveEffect2.getName();
        }
        sbLIZ.append(name2);
        sbLIZ.append(" value: ");
        sbLIZ.append(f);
        C20441214yg.LIZIZ("ComposerFilterSlideHelper", C2188811AlT.LIZIZ(sbLIZ));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (liveEffect != null) {
            arrayList.add(liveEffect);
            arrayList2.add("leftSlidePosition");
        }
        if (liveEffect2 != null) {
            arrayList.add(liveEffect2);
            arrayList2.add("rightSlidePosition");
        }
        LIZIZ.LJII(arrayList, arrayList2, C1697810uHb.LJIIJJI(Float.valueOf(f), Float.valueOf(f)));
    }
}
