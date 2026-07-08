package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.11fj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19559311fj {
    public int LIZ;
    public long LIZIZ = -1;
    public long LIZJ = -1;
    public final Map<String, Long> LIZLLL = new LinkedHashMap();
    public final Map<String, Long> LJ = new LinkedHashMap();
    public boolean LJFF;

    public final void LIZIZ(int i) {
        if (this.LIZ != i) {
            this.LIZ = i;
            this.LIZIZ = 0L;
            this.LIZJ = 0L;
            ((LinkedHashMap) this.LIZLLL).clear();
            ((LinkedHashMap) this.LJ).clear();
            LIZJ(false);
        }
    }

    public final void LIZJ(boolean z) {
        this.LJFF = z;
        if (!z) {
            ((LinkedHashMap) this.LIZLLL).clear();
            ((LinkedHashMap) this.LJ).clear();
        }
    }

    public final void LIZ(int i, int i2) {
        long j = this.LIZIZ;
        if (j >= 0 && j > 0) {
            long j2 = i;
            if (j < 0) {
                j = 0;
            }
            this.LIZIZ = j2 - j;
        }
        long j3 = this.LIZJ;
        if (j3 > 0) {
            this.LIZJ = ((long) i2) - j3;
        }
    }
}
