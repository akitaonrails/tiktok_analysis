package X;

import android.content.Context;
import android.os.Build;
import com.bytedance.keva.Keva;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15iO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20595015iO {
    public static Boolean LIZIZ;
    public static Boolean LIZJ;
    public static Boolean LIZLLL;
    public static boolean LJFF;
    public static boolean LJI;
    public static Boolean LJII;
    public static final C20595015iO LIZ = new C20595015iO();
    public static String LJ = "";

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZJ() {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20595015iO.LIZJ():boolean");
    }

    public static boolean LJ() {
        if (LJII == null) {
            LJII = Boolean.valueOf(!Intrinsics.LJFF(Build.BRAND.toLowerCase(Locale.getDefault()), "samsung") ? false : C1886907aF.LIZ(Build.MODEL.toLowerCase(Locale.getDefault()), new String[]{"sm-f7610", "sm-f761b", "sm-f761be", "sm-f761n", "sm-f761u", "sm-f761u1", "sm-f7660", "sm-f766b", "sm-f766be", "sm-f766d", "sm-f766j", "sm-f766n", "sm-f766q", "sm-f766u", "sm-f766u1", "sm-f766w", "sm-f766z", "sm-f7410", "sm-f741b", "sm-f741be", "sm-f741d", "sm-f741j", "sm-f741n", "sm-f741q", "sm-f741u", "sm-f741u1", "sm-f741w", "sm-w7025", "sm-f7310", "sm-f731b", "sm-f731be", "sc-54d", "scg23", "sm-f731n", "sm-f731u", "sm-f731u1", "sm-f731w", "sc-54b", "sc-54c", "scg12", "scg17", "sm-f7110", "sm-f711b", "sm-f711n", "sm-f711u", "sm-f711u1", "sm-f711w", "sm-f7210", "sm-f721b", "sm-f721be", "sm-f721c", "sm-f721n", "sm-f721u", "sm-f721u1", "sm-f721w", "SM-F776U", "SM-F776U1", "SM-F776W", "SM-F776BE", "SM-F776B", "SM-F776C", "SM-F776D", "SM-F776J", "SM-F776Q", "SM-F776Z", "SM-F776N"}));
        }
        return Intrinsics.LJFF(LJII, Boolean.TRUE);
    }

    public static boolean LJFF() {
        if (LIZLLL == null) {
            LIZLLL = Boolean.valueOf(LIZJ() && Intrinsics.LJFF(LJ, "samsung"));
        }
        return Intrinsics.LJFF(LIZLLL, Boolean.TRUE);
    }

    public static boolean LIZ(Context context) {
        boolean zHasSystemFeature;
        C20593115i5.LIZ.getClass();
        if (!C20593115i5.LIZJ().contains("did_detect_hinge") && context != null) {
            Keva kevaLIZJ = C20593115i5.LIZJ();
            if (Build.VERSION.SDK_INT >= 30) {
                zHasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.sensor.hinge_angle");
            } else {
                zHasSystemFeature = false;
            }
            kevaLIZJ.storeBoolean("did_detect_hinge", zHasSystemFeature);
        }
        return C20593115i5.LIZJ().getBoolean("did_detect_hinge", false);
    }

    public static boolean LIZIZ(Context context) {
        if (((Boolean) C988980bqK.LIZ.getValue()).booleanValue()) {
            if (LJFF) {
                return LJI;
            }
            LJFF = true;
            if (LIZJ()) {
                LJI = true;
                return true;
            }
            boolean zLIZLLL = LIZLLL(context);
            LJI = zLIZLLL;
            return zLIZLLL;
        }
        if (LIZJ()) {
            return true;
        }
        return LIZLLL(context);
    }

    public static boolean LIZLLL(Context context) {
        if (context == null) {
            C844470XAv.LIZ.getClass();
            context = C844470XAv.LIZ();
        }
        if (LIZ(context)) {
            C20593115i5.LIZ.getClass();
            if (C20593115i5.LJIIJ(C20593115i5.LJ(), "ec")) {
                return true;
            }
            return false;
        }
        return false;
    }
}
