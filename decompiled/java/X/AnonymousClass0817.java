package X;

import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.0817, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0817 {
    public static boolean LIZ;
    public static Class<?> LIZIZ;
    public static Method LIZJ;
    public static Object LIZLLL;

    public AnonymousClass0817() throws Throwable {
        synchronized (AnonymousClass0817.class) {
            try {
                if (!LIZ) {
                    try {
                        int i = Build.VERSION.SDK_INT;
                        if (i == 29) {
                            Class<?> clsLIZ = C1959207lu.LIZ("android.scrollerboostmanager.ScrollerBoostManager");
                            LIZIZ = clsLIZ;
                            LIZJ = C1959207lu.LIZJ(clsLIZ, "listFling", Integer.TYPE);
                        } else if (i == 28 || i == 27 || i == 26) {
                            Class<?> clsLIZ2 = C1959207lu.LIZ("android.iawareperf.UniPerf");
                            LIZIZ = clsLIZ2;
                            LIZJ = C1959207lu.LIZJ(clsLIZ2, "uniPerfEvent", Integer.TYPE, String.class, int[].class);
                            C2207231Ba5.LIZ(4);
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("CHRYBoostFramework() : Exception_1 = ");
                        sbLIZ.append(e);
                        C2188811AlT.LIZIZ(sbLIZ);
                        C2207231Ba5.LIZ(6);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        try {
            if (LIZIZ != null) {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 == 29) {
                    LIZLLL = C2204961BRm.a0(C1959207lu.LIZJ(LIZIZ, "getInstance", new Class[0]), LIZIZ, new Object[0], new C0WZX("dTF6Tg0zW4TPRhkiSh/KcASDDRsBmUXBDg==", null));
                    C2204961BRm.a0(C1959207lu.LIZJ(LIZIZ, "init", new Class[0]), LIZLLL, new Object[0], new C0WZX("dTF6Tg0zW4TPRhkiSh/KcASDDRsBmUXBDg==", null));
                } else if (i2 != 28 && i2 != 27 && i2 != 26) {
                    return;
                } else {
                    LIZLLL = C2204961BRm.a0(C1959207lu.LIZJ(LIZIZ, "getInstance", new Class[0]), null, new Object[0], new C0WZX("dTF6Tg0zW4TPRhkiSh/KcASDDRsBmUXBDg==", null));
                }
                LIZ = true;
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            e2.toString();
            C2207231Ba5.LIZ(6);
        }
    }

    public static void LIZ(long j) {
        StringBuilder sbLIZ;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i != 29) {
                if (i == 28 || i == 27 || i == 26) {
                    int iIntValue = ((Integer) C2204961BRm.a0(LIZJ, LIZLLL, new Object[]{4099, "canBoost=true|screenOn=1", new int[0]}, new C0WZX("dTF6Tg0zW4TPRhkiSh/KcASDDRsBmUXBDg==", null))).intValue();
                    sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("invoke uniPerfEvent result ");
                    sbLIZ.append(iIntValue);
                    sbLIZ.append(" for ");
                    sbLIZ.append(j);
                } else {
                    return;
                }
            } else {
                C2204961BRm.a0(LIZJ, LIZLLL, new Object[]{Integer.valueOf((int) j)}, new C0WZX("dTF6Tg0zW4TPRhkiSh/KcASDDRsBmUXBDg==", null));
                sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("invoke listFling result  for ");
                sbLIZ.append(j);
            }
            C2188811AlT.LIZIZ(sbLIZ);
            C2207231Ba5.LIZ(4);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            th.getMessage();
            C2207231Ba5.LIZ(5);
        }
    }
}
