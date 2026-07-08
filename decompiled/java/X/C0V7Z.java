package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0V7Z, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V7Z {
    public static final long[] LJI = {120000, 300000, 600000, 1800000, 3600000};
    public final List<String> LIZ = new ArrayList();
    public final List<String> LIZIZ = new ArrayList();
    public final List<String> LIZJ = new ArrayList();
    public final List<String> LIZLLL = new ArrayList();
    public final List<String> LJ = new ArrayList();
    public C792880V8k LJFF;

    public static long LIZ(int i) {
        int i2 = i - 1;
        if (i2 < 0) {
            return 0L;
        }
        long[] jArr = LJI;
        if (i2 >= 5) {
            return jArr[4];
        }
        return jArr[i2];
    }
}
