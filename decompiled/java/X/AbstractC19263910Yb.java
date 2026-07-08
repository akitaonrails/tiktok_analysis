package X;

/* JADX INFO: renamed from: X.10Yb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public abstract class AbstractC19263910Yb implements InterfaceC19264510Yh {
    public boolean LIZ;

    public abstract void LIZIZ(C1950707kX c1950707kX);

    public boolean LIZJ(C1950707kX c1950707kX) {
        return true;
    }

    public AbstractC19263910Yb(boolean z) {
        this.LIZ = z;
    }

    @Override // X.InterfaceC19264510Yh
    public final void LIZ(C1950707kX c1950707kX, C10YS c10ys) {
        if (LIZJ(c1950707kX)) {
            LIZIZ(c1950707kX);
            if (!this.LIZ) {
                c10ys.LIZIZ(c1950707kX, c10ys);
                return;
            }
            return;
        }
        c10ys.LIZIZ(c1950707kX, c10ys);
    }
}
