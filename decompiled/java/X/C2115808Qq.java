package X;

import android.os.Build;

/* JADX INFO: renamed from: X.08Qq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2115808Qq {
    public static Integer LIZ;
    public static Integer LIZIZ;
    public static volatile Integer LIZJ;

    public static int LIZ() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "4130_app_init_preload_opt", true);
    }

    public static int LIZIZ(boolean z) {
        Integer numValueOf = LIZ;
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(C2116408Qw.LIZ(0, "4130_app_init_preload_opt", z));
            LIZ = numValueOf;
        }
        return numValueOf.intValue();
    }

    public static void LIZJ(boolean z) {
        C2116408Qw.LIZJ("app_init_CAN_DO_PRELOAD_WEBVIEW_PACKAGE", z ? 1 : 0);
    }

    public static void LIZLLL(boolean z) {
        C2116408Qw.LIZJ("app_init_LESS_MADVISE_WEBVIEW_PACKAGE", z ? 1 : 0);
    }

    public static void LJ(int i) {
        C2116408Qw.LIZJ("class_preload_dex_image_size_threshold", i);
    }

    public static void LJFF(int i) {
        C2116408Qw.LIZJ("cold_boot_class_record_delay_duration", i);
    }

    public static void LJI(int i) {
        C2116408Qw.LIZJ("cold_boot_gson_record_delay_duration", i);
    }

    public static void LJII(int i) {
        C2116408Qw.LIZJ("cold_boot_class_mark_no_cinit", i);
    }

    public static void LJIIIIZZ(boolean z) {
        if (Build.VERSION.SDK_INT >= 35) {
            C2116408Qw.LIZJ("app_init_PRELOAD_WEBVIEW_PACKAGE_WITH_RES_FIX", z ? 1 : 0);
        }
    }
}
