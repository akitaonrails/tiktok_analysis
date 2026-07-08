package X;

import android.os.Debug;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.09NZ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09NZ {
    public static final List<String> LIZ = C1697810uHb.LJIIJJI("summary.native-heap", "summary.stack", "summary.private-other", "summary.system", "summary.total-pss", "summary.total-swap");
    public static final int[] LIZIZ = {6, 7, 8, 9, 10, 11, 23, 24};
    public static final int[] LIZJ = {17, 18, 19, 20};
    public static final int[] LIZLLL = {4, 14, 15};

    public static Map LIZ(boolean z) {
        int iIntValue;
        int[] iArrLIZIZ;
        int iIntValue2;
        int iIntValue3;
        Integer numLJIIJJI;
        Integer numLJIIJJI2;
        Integer numLJIIJJI3;
        Integer numLJIIJJI4;
        try {
            Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
            Debug.getMemoryInfo(memoryInfo);
            Map<String, String> memoryStats = memoryInfo.getMemoryStats();
            C13DA c13da = new C13DA();
            Iterator<String> it2 = LIZ.iterator();
            while (true) {
                iIntValue = 0;
                if (!it2.hasNext()) {
                    break;
                }
                String next = it2.next();
                String str = memoryStats.get(next);
                if (str != null && (numLJIIJJI4 = C2095008Iq.LJIIJJI(str)) != null) {
                    iIntValue = numLJIIJJI4.intValue();
                }
                c13da.put(next, new Pair(Integer.valueOf(iIntValue), C2097608Jq.LJ()));
            }
            if (!z) {
                iArrLIZIZ = new int[0];
            } else {
                iArrLIZIZ = C1962107mN.LIZIZ(memoryInfo, true);
            }
            String str2 = memoryStats.get("summary.java-heap");
            if (str2 != null && (numLJIIJJI3 = C2095008Iq.LJIIJJI(str2)) != null) {
                iIntValue2 = numLJIIJJI3.intValue();
            } else {
                iIntValue2 = 0;
            }
            c13da.put("summary.java-heap", new Pair(Integer.valueOf(iIntValue2), LIZLLL(iArrLIZIZ)));
            String str3 = memoryStats.get("summary.code");
            if (str3 != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(str3)) != null) {
                iIntValue3 = numLJIIJJI2.intValue();
            } else {
                iIntValue3 = 0;
            }
            c13da.put("summary.code", new Pair(Integer.valueOf(iIntValue3), LIZIZ(iArrLIZIZ)));
            String str4 = memoryStats.get("summary.graphics");
            if (str4 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str4)) != null) {
                iIntValue = numLJIIJJI.intValue();
            }
            c13da.put("summary.graphics", new Pair(Integer.valueOf(iIntValue), LIZJ(iArrLIZIZ)));
            return c13da.build();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return C2097608Jq.LJ();
        }
    }

    public static Map LIZIZ(int[] iArr) {
        boolean z;
        if (iArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return C2097608Jq.LJ();
        }
        try {
            C13DA c13da = new C13DA();
            for (int i : LIZIZ) {
                c13da.put(Integer.valueOf(i), Integer.valueOf(C1962107mN.LIZ(i, iArr)));
            }
            return c13da.build();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return C2097608Jq.LJ();
        }
    }

    public static Map LIZJ(int[] iArr) {
        boolean z;
        if (iArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return C2097608Jq.LJ();
        }
        try {
            C13DA c13da = new C13DA();
            for (int i : LIZLLL) {
                c13da.put(Integer.valueOf(i), Integer.valueOf(C1962107mN.LIZ(i, iArr)));
            }
            return c13da.build();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return C2097608Jq.LJ();
        }
    }

    public static Map LIZLLL(int[] iArr) {
        boolean z;
        int i;
        if (iArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return C2097608Jq.LJ();
        }
        try {
            C13DA c13da = new C13DA();
            for (int i2 : LIZJ) {
                Integer numValueOf = Integer.valueOf(i2);
                Field field = C1962107mN.LIZ;
                try {
                    i = iArr[(i2 * 9) + 3];
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    i = 0;
                }
                c13da.put(numValueOf, Integer.valueOf(i));
            }
            c13da.put(12, Integer.valueOf(C1962107mN.LIZ(12, iArr)));
            return c13da.build();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            return C2097608Jq.LJ();
        }
    }
}
