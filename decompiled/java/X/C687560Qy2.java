package X;

/* JADX INFO: renamed from: X.0Qy2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C687560Qy2 {
    public long LIZ = 0;
    public long LIZIZ = 0;
    public int LIZJ = 0;
    public String LIZLLL = "";
    public int LJ = 0;

    public final long LIZ() {
        if (this.LIZIZ <= 0) {
            this.LIZIZ = System.currentTimeMillis();
        }
        return this.LIZIZ - this.LIZ;
    }

    public final void LIZIZ() {
        this.LIZ = 0L;
        this.LIZIZ = 0L;
        this.LIZJ = 0;
        this.LIZLLL = "";
        this.LJ = 0;
    }
}
