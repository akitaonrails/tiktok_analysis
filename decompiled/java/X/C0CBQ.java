package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: renamed from: X.0CBQ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CBQ {
    public static List<String> LIZ;

    public static List LIZ() {
        try {
            List<String> list = LIZ;
            if (list != null) {
                return list;
            }
            if (!((Boolean) C0CCJ.LJII.getValue()).booleanValue()) {
                C13BV c13bv = C13BV.INSTANCE;
                LIZ = c13bv;
                return c13bv;
            }
            if (C1940407is.LIZ() == null) {
                C13BV c13bv2 = C13BV.INSTANCE;
                LIZ = c13bv2;
                return c13bv2;
            }
            if (C2251971DCh.LIZ()) {
                List<String> listLLIIII = C13LP.LLIIII(C1940407is.LIZ());
                LIZ = listLLIIII;
                return listLLIIII;
            }
            C13BV c13bv3 = C13BV.INSTANCE;
            LIZ = c13bv3;
            return c13bv3;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C13BV.INSTANCE;
        }
    }

    public static boolean LIZIZ(String str) {
        try {
            if (!((Boolean) C0CCJ.LJIIIZ.getValue()).booleanValue() || C1487405s0.LIZ() == null) {
                return false;
            }
            return C1487405s0.LIZ().contains(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
