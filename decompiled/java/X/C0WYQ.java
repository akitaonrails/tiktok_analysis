package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0WYQ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WYQ {
    public static final C01GW LIZ;
    public static final int LIZIZ;

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(4529));
        LIZ = c01gwLIZIZ;
        int length = -1;
        if (-1 != ((Number) c01gwLIZIZ.getValue()).intValue()) {
            length = ((Number) c01gwLIZIZ.getValue()).intValue();
        } else {
            try {
                int iLIZIZ = C0WYP.LIZIZ("/sys/devices/system/cpu/possible");
                if (iLIZIZ == -1) {
                    iLIZIZ = C0WYP.LIZIZ("/sys/devices/system/cpu/present");
                }
                if (iLIZIZ == -1) {
                    length = new C0VSJ("/sys/devices/system/cpu/").listFiles(C0WYP.LIZ).length;
                } else {
                    length = iLIZIZ;
                }
            } catch (NullPointerException e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (SecurityException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        LIZIZ = length;
    }
}
