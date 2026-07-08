package X;

/* JADX INFO: renamed from: X.12f9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19810512f9 extends C19807912ej {
    public boolean LIZIZ;

    public abstract boolean LJIILL();

    public final void LJIIJJI() {
        if (!this.LIZIZ) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void LJIILIIL() {
        if (this.LIZIZ) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (LJIILL()) {
            return;
        }
        this.LIZ.LJJIJ.incrementAndGet();
        this.LIZIZ = true;
    }

    public AbstractC19810512f9(C19804712eD c19804712eD) {
        super(c19804712eD);
        this.LIZ.LJJIIZ++;
    }
}
