package X;

import java.util.List;

/* JADX INFO: renamed from: X.0bSr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C974430bSr {
    public final C981480beE LIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public List<Long> LIZIZ = C13BV.INSTANCE;
    public boolean LJFF = true;

    public C974430bSr(C981480beE c981480beE) {
        this.LIZ = c981480beE;
    }

    public final void LIZ(long j) {
        if (this.LIZLLL == j) {
            return;
        }
        if (j == C950220apo.LJ()) {
            this.LJ = C158B.LIZIZ();
        } else {
            if (this.LJ > 0) {
                C973920bS2.LJ += C158B.LIZIZ() - this.LJ;
                C973920bS2.LIZLLL++;
            }
            this.LJ = 0L;
        }
        this.LIZLLL = j;
    }
}
