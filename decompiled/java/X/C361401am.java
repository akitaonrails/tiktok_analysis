package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.01am, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C361401am {
    public static final Map<String, byte[]> LIZ = new LinkedHashMap();

    public static byte[] LIZ(C0VSJ c0vsj, String str) throws Throwable {
        boolean z;
        Map<String, byte[]> map = LIZ;
        byte[] bArr = (byte[]) ((LinkedHashMap) map).get(str);
        boolean z2 = false;
        if (bArr != null) {
            if (bArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                z2 = true;
            }
        }
        if (z2) {
            return bArr;
        }
        try {
            byte[] bArrLJ = C09BH.LJ(c0vsj);
            map.put(str, bArrLJ);
            return bArrLJ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "parse gecko failed");
            return null;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            C1AF0.LJFF(e2, "oom when parse gecko");
            return null;
        }
    }
}
