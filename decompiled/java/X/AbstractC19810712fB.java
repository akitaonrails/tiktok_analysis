package X;

/* JADX INFO: renamed from: X.12fB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19810712fB extends C19791712c7 {
    public boolean LIZIZ;

    public abstract boolean LJII();

    public final void LJFF() {
        if (!this.LIZIZ) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void LJI() {
        if (this.LIZIZ) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (LJII()) {
            return;
        }
        this.LIZ.LJJIJ.incrementAndGet();
        this.LIZIZ = true;
    }

    public AbstractC19810712fB(C19804712eD c19804712eD) {
        super(c19804712eD);
        this.LIZ.LJJIIZ++;
    }
}
