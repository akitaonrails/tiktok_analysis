package X;

import Y.AObserverS221S0100000_17;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.toolbar.TBViewModel;
import com.bytedance.android.livesdk.livesetting.other.ToolBarButtonWithTextExperiment;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0ejF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1099910ejF {
    public static final /* synthetic */ int LIZ = 0;

    public static ViewGroup.MarginLayoutParams LIZ(EnumC1099930ejH enumC1099930ejH) {
        C1099990ejN layoutParams = enumC1099930ejH.getLayoutStyle().getLayoutParams();
        Pair pairLIZIZ = LIZIZ(enumC1099930ejH);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams((int) C497740JfY.LIZIZ(((Number) pairLIZIZ.getFirst()).floatValue()), (int) C497740JfY.LIZIZ(((Number) pairLIZIZ.getSecond()).floatValue()));
        layoutParams.getClass();
        marginLayoutParams.setMarginStart((int) C497740JfY.LIZIZ(0.0f));
        marginLayoutParams.setMarginEnd((int) C497740JfY.LIZIZ(0.0f));
        marginLayoutParams.topMargin = (int) C497740JfY.LIZIZ(0.0f);
        marginLayoutParams.bottomMargin = (int) C497740JfY.LIZIZ(0.0f);
        return marginLayoutParams;
    }

    public static Pair LIZIZ(EnumC1099930ejH enumC1099930ejH) {
        float f;
        Float fValueOf = Float.valueOf(C1099730eix.LIZ(enumC1099930ejH));
        int i = C1099920ejG.LIZ[enumC1099930ejH.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                f = 64.0f;
            } else {
                throw new C1954807lC();
            }
        } else {
            f = 56.0f;
        }
        return new Pair(fValueOf, Float.valueOf(f));
    }

    public static float LIZJ(EnumC1094650eal enumC1094650eal) {
        int i = C1094660eam.LIZ[enumC1094650eal.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 16.0f;
            }
            throw new C1954807lC();
        }
        return 12.0f;
    }

    public static float LJFF(EnumC1094650eal enumC1094650eal) {
        EnumC1088870eRR enumC1088870eRR = EnumC1088870eRR.LEFT;
        float fLJ = LJ(enumC1094650eal, enumC1088870eRR, true, false);
        EnumC1088870eRR enumC1088870eRR2 = EnumC1088870eRR.RIGHT;
        return fLJ + LJ(enumC1094650eal, enumC1088870eRR2, false, false) + LJ(enumC1094650eal, enumC1088870eRR, false, false) + LJ(enumC1094650eal, enumC1088870eRR2, true, false);
    }

    public static void LIZLLL(C1099960ejK c1099960ejK, View view, TBViewModel tBViewModel) {
        LifecycleOwner lifecycleOwner = c1099960ejK.LIZIZ;
        tBViewModel.LLIZ.observe(lifecycleOwner, new AObserverS221S0100000_17(view, 46));
        tBViewModel.LLJ.observe(lifecycleOwner, new AObserverS221S0100000_17(view, 47));
        tBViewModel.LLILZLL.observe(lifecycleOwner, new AObserverS221S0100000_17(view, 48));
        tBViewModel.LLIZLLLIL.observe(lifecycleOwner, new AObserverS221S0100000_17(view, 49));
    }

    public static float LJ(EnumC1094650eal enumC1094650eal, EnumC1088870eRR enumC1088870eRR, boolean z, boolean z2) {
        EnumC1099930ejH enumC1099930ejH;
        float fLIZLLL;
        float fLIZJ;
        float fLIZLLL2;
        int i = C1094660eam.LIZ[enumC1094650eal.ordinal()];
        if (i != 1) {
            if (i == 2) {
                enumC1099930ejH = EnumC1099930ejH.LANDSCAPE_ICON;
            } else {
                throw new C1954807lC();
            }
        } else if (ToolBarButtonWithTextExperiment.hasText()) {
            enumC1099930ejH = EnumC1099930ejH.ICON_WITH_TEXT;
        } else {
            enumC1099930ejH = EnumC1099930ejH.ICON;
        }
        if ((enumC1088870eRR == EnumC1088870eRR.LEFT && z) || (enumC1088870eRR == EnumC1088870eRR.RIGHT && !z)) {
            if (enumC1094650eal == EnumC1094650eal.PORTRAIT && !z2 && C497740JfY.LJJ()) {
                fLIZLLL = C1099730eix.LIZLLL(enumC1099930ejH);
                return fLIZLLL / 2;
            }
            fLIZJ = LIZJ(enumC1094650eal);
            fLIZLLL2 = C1099730eix.LIZLLL(enumC1099930ejH);
            return fLIZJ - (fLIZLLL2 / 2);
        }
        if (enumC1094650eal == EnumC1094650eal.PORTRAIT && !z2 && C497740JfY.LJJ()) {
            fLIZJ = LIZJ(enumC1094650eal);
            fLIZLLL2 = C1099730eix.LIZLLL(enumC1099930ejH);
            return fLIZJ - (fLIZLLL2 / 2);
        }
        fLIZLLL = C1099730eix.LIZLLL(enumC1099930ejH);
        return fLIZLLL / 2;
    }
}
