package X;

import android.app.Activity;

/* JADX INFO: renamed from: X.0HxG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C457760HxG {
    public static boolean LIZJ() {
        return (C00RB.LIZ.contains(Integer.valueOf(C2213981Bky.LIZIZ.getAppId())) ? C00AP.DYNAMIC_FEATURE : C00AP.BUILT_IN) == C00AP.DYNAMIC_FEATURE;
    }

    public static void LIZ(Activity activity) {
        if (LIZJ() && LIZIZ(false) && activity != null) {
            C2274381E0m.LIZIZ.LJI(activity);
        }
    }

    public static boolean LIZIZ(boolean z) {
        if (!LIZJ() || (C0C64.LJIILLIIL().LJIJ(31744, 0, "im_sticker_df_mock", true) != 1 && C2274381E0m.LIZIZ.LIZJ(z, false))) {
            return true;
        }
        return false;
    }
}
