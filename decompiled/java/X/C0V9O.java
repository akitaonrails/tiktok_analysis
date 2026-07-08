package X;

/* JADX INFO: renamed from: X.0V9O, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V9O {
    public boolean LIZ;
    public final C793090V9f LIZIZ = new C793090V9f();
    public C0V9K LIZJ;
    public boolean LIZLLL;
    public long LJ;
    public boolean LJFF;

    public final synchronized boolean LIZ() {
        return this.LIZLLL;
    }

    public final synchronized void LIZIZ(C0V9K c0v9k) {
        if (c0v9k == null) {
            return;
        }
        if (!C792420V6q.LJIILJJIL() && !c0v9k.LJFF) {
            return;
        }
        this.LIZJ = c0v9k;
        if (this.LJFF) {
            if (!this.LIZ) {
                this.LIZ = true;
                this.LIZLLL = true;
                this.LIZIZ.LJFF(c0v9k);
            }
            return;
        }
        if (c0v9k.LIZ) {
            this.LIZ = true;
            this.LIZLLL = true;
            this.LIZIZ.LJFF(c0v9k);
        } else {
            this.LIZ = false;
            this.LIZIZ.LJI();
        }
    }
}
