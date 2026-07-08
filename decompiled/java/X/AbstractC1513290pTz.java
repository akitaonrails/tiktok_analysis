package X;

/* JADX INFO: renamed from: X.0pTz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1513290pTz implements InterfaceC1513360pU6 {
    public boolean LIZ;
    public InterfaceC1513310pU1 LIZIZ;

    public abstract void LIZJ(C1511310pQn c1511310pQn);

    public abstract void LIZLLL();

    public abstract void LJ();

    @Override // X.InterfaceC1513360pU6
    public final void start() {
        if (this.LIZ) {
            return;
        }
        LIZLLL();
        this.LIZ = true;
    }

    @Override // X.InterfaceC1513360pU6
    public final void stop() {
        if (this.LIZ) {
            this.LIZ = false;
            LJ();
        }
    }

    public AbstractC1513290pTz() {
        new C1513270pTx(-1);
    }

    @Override // X.InterfaceC1513360pU6
    public final boolean LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1513360pU6
    public final void LIZIZ(C1511310pQn c1511310pQn) {
        if (!this.LIZ) {
            return;
        }
        LIZJ(c1511310pQn);
    }
}
