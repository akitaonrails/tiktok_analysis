package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0oHq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1467320oHq {
    public int LIZ;
    public int LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public long LJI;
    public long LJII;

    public final Map LIZ() {
        HashMap map = new HashMap();
        long j = this.LJI;
        if (j > 0) {
            if (j > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.LJII += jCurrentTimeMillis - this.LJI;
                this.LJI = jCurrentTimeMillis;
            }
            map.put("cri_t", Long.valueOf(this.LJII));
        }
        long j2 = this.LJ;
        if (j2 > 0) {
            if (j2 > 0) {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                this.LJFF += jCurrentTimeMillis2 - this.LJ;
                this.LJ = jCurrentTimeMillis2;
            }
            map.put("ser_t", Long.valueOf(this.LJFF));
        }
        if (this.LIZJ > 0) {
            map.put("bu_t", Long.valueOf(this.LIZLLL));
            map.put("bu_l", Integer.valueOf(this.LIZIZ));
        }
        return map;
    }
}
