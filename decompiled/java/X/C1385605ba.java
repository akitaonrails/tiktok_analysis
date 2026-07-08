package X;

import Y.ARunnableS71S0200000_2;
import android.os.SystemClock;
import java.util.HashMap;

/* JADX INFO: renamed from: X.05ba, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1385605ba {
    public static long LIZIZ;
    public final HashMap<String, int[]> LIZ = new HashMap<>();

    public C1385605ba() {
        LIZIZ = SystemClock.uptimeMillis();
    }

    public final void LIZ(int i, Object obj) {
        if (i != 0 && i != 1) {
            return;
        }
        int iLIZ = C2187711Ajh.LIZ(obj);
        String name = obj.getClass().getName();
        int[] iArr = this.LIZ.get(name);
        if (iArr == null) {
            iArr = new int[]{0, 0, iLIZ};
            this.LIZ.put(name, iArr);
        }
        iArr[i] = iArr[i] + 1;
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis - LIZIZ > 180000) {
            LIZIZ = jUptimeMillis;
            HashMap map = new HashMap(this.LIZ);
            this.LIZ.clear();
            C823050WQl.LIZLLL().execute(new ARunnableS71S0200000_2(this, map, 12));
        }
    }
}
