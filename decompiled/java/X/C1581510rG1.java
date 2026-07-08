package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.experiment.TopTabUiAlignmentConfig;

/* JADX INFO: renamed from: X.0rG1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1581510rG1 {
    public static final TopTabUiAlignmentConfig LIZ = new TopTabUiAlignmentConfig(2, 1, 1, 200, 0, 200, 1);

    public static boolean LIZ() {
        TopTabUiAlignmentConfig topTabUiAlignmentConfig = LIZ;
        return topTabUiAlignmentConfig != null && topTabUiAlignmentConfig.tabMarginRuleOpt > 0;
    }

    public static boolean LIZIZ() {
        TopTabUiAlignmentConfig topTabUiAlignmentConfig = LIZ;
        return topTabUiAlignmentConfig != null && topTabUiAlignmentConfig.tabMarginRuleOpt == 1;
    }

    public static boolean LIZJ() {
        TopTabUiAlignmentConfig topTabUiAlignmentConfig = LIZ;
        return topTabUiAlignmentConfig != null && topTabUiAlignmentConfig.tabMarginRuleOpt >= 0 && topTabUiAlignmentConfig != null && topTabUiAlignmentConfig.tabHitAreaRuleOpt == 1 && LIZ();
    }

    public static boolean LIZLLL() {
        TopTabUiAlignmentConfig topTabUiAlignmentConfig = LIZ;
        if (topTabUiAlignmentConfig != null) {
            return topTabUiAlignmentConfig.tabTopThemeAnimatorDuration > 0 || (topTabUiAlignmentConfig != null && topTabUiAlignmentConfig.tabBottomThemeAnimatorDuration > 0);
        }
        return false;
    }

    public static boolean LJ() {
        TopTabUiAlignmentConfig topTabUiAlignmentConfig = LIZ;
        return topTabUiAlignmentConfig != null && topTabUiAlignmentConfig.tabTopIconAnimatorDuration > 0;
    }

    public static void LJFF(View view) {
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        if (LIZIZ()) {
            LJIIIIZZ(iLIZIZ, view, false);
        }
    }

    public static void LJI(View view) {
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        if (LIZIZ()) {
            LJIIIIZZ(iLIZIZ, view, false);
        }
    }

    public static void LJII(View view) {
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        if (LIZIZ()) {
            LJIIIIZZ(iLIZIZ, view, false);
        }
    }

    public static void LJIIIIZZ(int i, View view, boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = null;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null || marginLayoutParams.topMargin == i) {
            return;
        }
        marginLayoutParams.topMargin = i;
        if (z) {
            view.requestLayout();
        }
    }
}
