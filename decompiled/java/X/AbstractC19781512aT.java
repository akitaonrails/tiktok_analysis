package X;

/* JADX INFO: renamed from: X.12aT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19781512aT extends C19777212Zm {
    public boolean LIZJ;

    public abstract boolean LJIIJ();

    public final void LJIIIIZZ() {
        if (!this.LIZJ) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void LJIIIZ() {
        if (this.LIZJ) {
            throw new IllegalStateException("Can't initialize twice");
        }
        LJIIJ();
        this.LIZIZ.LJIJ++;
        this.LIZJ = true;
    }

    public AbstractC19781512aT(C12Z4 c12z4) {
        super(c12z4);
        this.LIZIZ.LJIIZILJ++;
    }
}
