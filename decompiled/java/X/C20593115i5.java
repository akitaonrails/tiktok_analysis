package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Insets;
import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.bytedance.keva.Keva;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.15i5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20593115i5 {
    public static Boolean LIZLLL;
    public static Boolean LJ;
    public static final C20593115i5 LIZ = new C20593115i5();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C20321714fP());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C20327514gL());
    public static final ArrayList<String> LJFF = C1697810uHb.LJ("aries_10");
    public static String LJI = "";

    static {
        final boolean zLJIILIIL = LJIILIIL();
        final boolean zLJIIIIZZ = LJIIIIZZ(null);
        C20591715hr.LIZIZ = new InterfaceC20592015hu() { // from class: X.15hs
            @Override // X.InterfaceC20592015hu
            public final boolean LJ(EnumC1390870mIX enumC1390870mIX) {
                return false;
            }

            @Override // X.InterfaceC20592015hu
            public final boolean isDebug() {
                return false;
            }

            @Override // X.InterfaceC20592015hu
            public final EnumC1284990jXl LIZJ() {
                C20593115i5.LIZ.getClass();
                return C20593115i5.LJIIIIZZ(null) ? EnumC1284990jXl.UNKNOWN : EnumC1284990jXl.DEFAULT;
            }

            @Override // X.InterfaceC20592015hu
            public final boolean LIZ() {
                return zLJIIIIZZ;
            }

            @Override // X.InterfaceC20592015hu
            public final InterfaceC1391140mIy LIZIZ() {
                return C20590415he.LIZ;
            }

            @Override // X.InterfaceC20592015hu
            public final boolean isPad() {
                return zLJIILIIL;
            }

            @Override // X.InterfaceC20592015hu
            public final EnumC19380610s0 LIZLLL(Activity activity) {
                C20593115i5.LIZ.getClass();
                int iLIZIZ = C20593115i5.LIZIZ(activity);
                if (iLIZIZ != -1) {
                    if (iLIZIZ != 0) {
                        if (iLIZIZ != 1) {
                            return EnumC19380610s0.UNKNOWN;
                        }
                        return EnumC19380610s0.FLAT;
                    }
                    return EnumC19380610s0.FOLD;
                }
                return EnumC19380610s0.UNKNOWN;
            }
        };
    }

    public static Keva LIZJ() {
        return (Keva) LIZJ.getValue();
    }

    public static int LIZLLL() {
        WindowManager windowManager;
        WindowMetrics windowMetricsLLILZ;
        WindowInsets windowInsets;
        Insets insetsIgnoringVisibility;
        int i = 0;
        if (Build.VERSION.SDK_INT < 30) {
            if (((Context) LIZIZ.getValue()).getResources() == null) {
                return 0;
            }
            LIZ.getClass();
            return C341940Daq.LIZIZ(C14KQ.LIZLLL((Context) r1.getValue()));
        }
        Object objH2 = C786410Ut5.H2((Context) LIZIZ.getValue(), "window");
        if ((objH2 instanceof WindowManager) && (windowManager = (WindowManager) objH2) != null && (windowMetricsLLILZ = C2204961BRm.LLILZ(windowManager, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6pYZPLyHyxbBiYphYiXmTP5ECwzFNPPHc0oNlOtvLy0kuUwd1tdg==", null))) != null && (windowInsets = windowMetricsLLILZ.getWindowInsets()) != null && (insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars())) != null) {
            i = insetsIgnoringVisibility.bottom;
        }
        return C341940Daq.LIZIZ(i);
    }

    public static String LJ() {
        if (LIZJ().contains("pad_max_size")) {
            return LIZJ().getString("pad_max_size", "mc");
        }
        C1389350mG5 c1389350mG5LIZJ = C1389340mG4.LIZJ(null, null);
        return LJFF(c1389350mG5LIZJ.LIZIZ(), c1389350mG5LIZJ.LIZ());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIILIIL() {
        /*
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.Boolean r0 = X.C20593115i5.LIZLLL
            if (r0 != 0) goto L45
            java.util.ArrayList<java.lang.String> r2 = X.C20593115i5.LJFF
            java.lang.String r1 = android.os.Build.MODEL
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r1.toLowerCase(r0)
            boolean r0 = r2.contains(r0)
            r4 = 2
            r3 = 1
            r2 = 0
            if (r0 != 0) goto L4e
            X.15iD r0 = X.C20593915iD.LIZIZ
            int r0 = r0.LIZ()
            if (r0 == 0) goto L4e
            if (r0 != r4) goto L91
        L25:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            X.C20593115i5.LIZLLL = r0
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "isTablet check duration:"
            r2.append(r0)
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r5
            r2.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r2)
            java.lang.String r0 = "DeviceAuth"
            X.C1909520zn4.LIZIZ(r0, r1)
        L45:
            java.lang.Boolean r1 = X.C20593115i5.LIZLLL
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            return r0
        L4e:
            com.bytedance.ies.abmock.SettingsManager r1 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r0 = "tablet_auth_reset"
            r1.getClass()     // Catch: java.lang.Throwable -> L5e
            boolean r0 = com.bytedance.ies.abmock.SettingsManager.LIZ(r0, r2)     // Catch: java.lang.Throwable -> L5e
            if (r0 == 0) goto L65
            goto L7b
        L5e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Exception -> L6c
            X.C1AF0.LJ(r0)     // Catch: java.lang.Exception -> L6c
        L65:
            X.15iB r0 = X.C20593715iB.LIZIZ     // Catch: java.lang.Exception -> L6c
            int r0 = r0.LIZ()     // Catch: java.lang.Exception -> L6c
            goto L76
        L6c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.15iB r0 = X.C20593715iB.LIZIZ
            int r0 = r0.LIZ()
        L76:
            if (r0 == 0) goto L7b
            if (r0 != r3) goto L91
            goto L25
        L7b:
            X.15iM r0 = X.C20594815iM.LIZ
            r0.getClass()
            boolean r0 = X.C20594815iM.LIZ()
            if (r0 == 0) goto L8c
            X.15iB r0 = X.C20593715iB.LIZIZ
            r0.LIZIZ(r3)
            goto L25
        L8c:
            X.15iB r0 = X.C20593715iB.LIZIZ
            r0.LIZIZ(r4)
        L91:
            r3 = 0
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20593115i5.LJIILIIL():boolean");
    }

    public static int LIZ(Activity activity) {
        C1389350mG5 c1389350mG5LIZJ = C1389340mG4.LIZJ(activity, null);
        if (LJII(activity)) {
            if (LJIIJ(LJFF(c1389350mG5LIZJ.LIZIZ(), c1389350mG5LIZJ.LIZ()), "cc")) {
                return 1;
            }
            return 0;
        }
        return -1;
    }

    public static int LIZIZ(Context context) {
        C1389350mG5 c1389350mG5LIZJ = C1389340mG4.LIZJ(context, null);
        if (LJIIIIZZ(context)) {
            if (LJIIJ(LJFF(c1389350mG5LIZJ.LIZIZ(), c1389350mG5LIZJ.LIZ()), "ec")) {
                return 1;
            }
            return 0;
        }
        return -1;
    }

    public static int LJI(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != 3230) {
            if (iHashCode != 3232) {
                if (iHashCode != 3240) {
                    if (iHashCode != 3478) {
                        if (iHashCode == 3488 && str.equals("mm")) {
                            return 4;
                        }
                        return 1;
                    }
                    if (str.equals("mc")) {
                        return 2;
                    }
                    return 1;
                }
                if (str.equals("em")) {
                    return 5;
                }
                return 1;
            }
            if (str.equals("ee")) {
                return 6;
            }
            return 1;
        }
        if (str.equals("ec")) {
            return 3;
        }
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJII(android.content.Context r3) {
        /*
            java.lang.Boolean r0 = X.C20593115i5.LJ
            if (r0 != 0) goto L45
            X.15iO r0 = X.C20595015iO.LIZ
            r0.getClass()
            boolean r0 = X.C20595015iO.LIZ(r3)
            r3 = 1
            if (r0 == 0) goto L60
            X.15i5 r0 = X.C20593115i5.LIZ
            r0.getClass()
            java.lang.String r1 = LJ()
            java.lang.String r0 = "mm"
            boolean r0 = LJIIJ(r0, r1)
            if (r0 == 0) goto L60
            com.bytedance.keva.Keva r0 = LIZJ()
            java.lang.String r2 = "pad_min_size"
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L4e
            com.bytedance.keva.Keva r1 = LIZJ()
            java.lang.String r0 = "mc"
            java.lang.String r1 = r1.getString(r2, r0)
        L37:
            java.lang.String r0 = "cc"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L60
        L3f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            X.C20593115i5.LJ = r0
        L45:
            java.lang.Boolean r1 = X.C20593115i5.LJ
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            return r0
        L4e:
            r0 = 0
            X.0mG5 r0 = X.C1389340mG4.LIZJ(r0, r0)
            int r1 = r0.LIZIZ()
            int r0 = r0.LIZ()
            java.lang.String r1 = LJFF(r1, r0)
            goto L37
        L60:
            boolean r0 = X.C20595015iO.LJ()
            if (r0 != 0) goto L3f
            r3 = 0
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20593115i5.LJII(android.content.Context):boolean");
    }

    public static boolean LJIIIIZZ(Context context) {
        C20595015iO.LIZ.getClass();
        return C20595015iO.LIZIZ(context);
    }

    public static boolean LJIIL(Activity activity) {
        if (!LJIILIIL()) {
            return false;
        }
        C1389350mG5 c1389350mG5LIZJ = C1389340mG4.LIZJ(activity, null);
        return LJIIJJI(c1389350mG5LIZJ.LIZIZ(), c1389350mG5LIZJ.LIZ());
    }

    public static String LJFF(int i, int i2) {
        int i3;
        String str;
        int iLIZLLL = i2 + LIZLLL();
        if (i > iLIZLLL) {
            i3 = iLIZLLL;
        } else {
            i3 = i;
        }
        if (i <= iLIZLLL) {
            i = iLIZLLL;
        }
        String str2 = "m";
        if (i3 < 600) {
            str = "c";
        } else if (i3 < 840) {
            str = "m";
        } else {
            str = "e";
        }
        if (i < 683) {
            str2 = "c";
        } else if (i >= 900) {
            str2 = "e";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static boolean LJIIJ(String str, String str2) {
        if (str.length() >= 2 && str2.length() >= 2 && LJI(str) > LJI(str2)) {
            return true;
        }
        return false;
    }

    public static boolean LJIIJJI(int i, int i2) {
        if (i > i2) {
            int iLIZLLL = i2 + LIZLLL();
            i2 = i;
            i = iLIZLLL;
        }
        if (i >= 600 && i2 >= 683) {
            return true;
        }
        return false;
    }
}
