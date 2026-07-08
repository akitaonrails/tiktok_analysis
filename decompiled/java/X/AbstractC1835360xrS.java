package X;

/* JADX INFO: renamed from: X.0xrS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public abstract class AbstractC1835360xrS<P, R> extends C1BRD<P, R> {
    public boolean LLILLJJLI = true;
    public InterfaceC1807620x8i LLILLL;
    public C2204771BQt LLILZ;

    public abstract void LJII(P p, C2204771BQt c2204771BQt);

    public void LJIIIIZZ() {
        this.LLILLJJLI = false;
        this.LLILZ = null;
    }

    public abstract void LJIIIZ();

    public final boolean LJ() {
        if (this.LLILLJJLI) {
            return true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Jsb async call already finished: ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", hashcode: ");
        sbLIZ.append(hashCode());
        IllegalStateException illegalStateException = new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        if (C1835380xrU.LIZ) {
            throw illegalStateException;
        }
        return false;
    }

    public final void LJFF() {
        if (LJ()) {
            this.LLILLL.onFailed();
            LJIIIIZZ();
        }
    }

    public final void LJI(R r) {
        if (LJ()) {
            this.LLILLL.LIZ(r);
            LJIIIIZZ();
        }
    }
}
