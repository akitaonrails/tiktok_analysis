package X;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0VbZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C801030VbZ {
    public static final AtomicLong LIZ = new AtomicLong();
    public static final AtomicLong LIZIZ = new AtomicLong();
    public static final AtomicLong LIZJ = new AtomicLong();

    public static String LIZIZ() {
        AtomicLong atomicLong = LIZ;
        long jIncrementAndGet = atomicLong.incrementAndGet();
        if (jIncrementAndGet > 10000) {
            atomicLong.set(0L);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("");
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append(jIncrementAndGet);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZ(String str, String str2) {
        long jLongValue;
        List listLJJLIIIJILLIZJL;
        String str3;
        Long lLJIILIIL;
        if (str2 != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str2, new String[]{"#"}, 0, 6)) != null && (str3 = (String) C13LP.LJJJLZIJ(1, listLJJLIIIJILLIZJL)) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str3)) != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('#');
        sbLIZ.append(jLongValue + 1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
