package X;

/* JADX INFO: renamed from: X.0krH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1335530krH {
    public boolean LIZ;
    public long LIZIZ = -1;
    public long LIZJ = -1;

    public final synchronized long LIZ() {
        return this.LIZJ;
    }

    public final synchronized long LIZIZ() {
        return this.LIZIZ;
    }

    public final synchronized void LIZLLL() {
        this.LIZ = false;
        this.LIZJ = -1L;
        this.LIZIZ = -1L;
    }

    public final synchronized void LIZJ(long j, long j2) {
        if (this.LIZ) {
            this.LIZIZ += j;
            this.LIZJ += j2;
        }
    }
}
