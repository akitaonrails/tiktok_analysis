package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0bKE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
@InterfaceC1294060jmO
public final class C969080bKE {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C969100bKG());

    public static String LIZJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC1303240k1C.BIZ.getValue());
        sbLIZ.append('_');
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZ(final String str, final String str2) {
        try {
            new Runnable() { // from class: X.0bKF
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LinkMicSdkLogger@42d2.e$1");
                    try {
                        if (str.length() != 0) {
                            String strLIZJ = C969080bKE.LIZJ(str);
                            String str3 = str2;
                            if (str3 == null) {
                                str3 = "";
                            }
                            C1AZW.LJFF(strLIZJ, str3, null, null);
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LinkMicSdkLogger@42d2.e$1");
                }
            }.run();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1CC2.LIZ("LinkMicSdkLogger Error", th);
        }
    }

    public static void LIZIZ(final String str, final String str2) {
        try {
            new Runnable() { // from class: X.0bKD
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LinkMicSdkLogger@42d2.i$1");
                    try {
                        if (str.length() != 0) {
                            C1AZW.LJIIJ(12, C969080bKE.LIZJ(str), str2, null, null);
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LinkMicSdkLogger@42d2.i$1");
                }
            }.run();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1CC2.LIZ("LinkMicSdkLogger Error", th);
        }
    }
}
