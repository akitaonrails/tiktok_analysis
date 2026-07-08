package X;

/* JADX INFO: renamed from: X.0WIS, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0WIS<T> {
    public final Object LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public int LJ;

    public void LIZJ(T t) {
        throw null;
    }

    public void LIZ() {
        if (this.LIZIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("detach() called when detach() had already been called for: ");
            sbLIZ.append(this.LIZ);
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (this.LIZJ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("detach() called when sendResult() had already been called for: ");
            sbLIZ2.append(this.LIZ);
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (!this.LIZLLL) {
            this.LIZIZ = true;
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("detach() called when sendError() had already been called for: ");
        sbLIZ3.append(this.LIZ);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ3));
    }

    public final boolean LIZIZ() {
        return this.LIZIZ || this.LIZJ || this.LIZLLL;
    }

    public C0WIS(Object obj) {
        this.LIZ = obj;
    }

    public final void LIZLLL(T t) {
        if (!this.LIZJ && !this.LIZLLL) {
            this.LIZJ = true;
            LIZJ(t);
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sendResult() called when either sendResult() or sendError() had already been called for: ");
            sbLIZ.append(this.LIZ);
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
