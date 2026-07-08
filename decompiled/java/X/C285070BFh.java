package X;

import android.os.Build;

/* JADX INFO: renamed from: X.0BFh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C285070BFh {
    public static final boolean LIZ;

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 33 && C0C64.LJIILLIIL().LJIJ(31744, 0, "player_enable_surface_surfaceview", true) == 1 && C0C64.LJIILLIIL().LJIJ(31744, 0, "surface_enable_single_surface_view", true) == 1) {
            z = true;
        }
        LIZ = z;
    }
}
