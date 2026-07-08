package X;

/* JADX INFO: renamed from: X.0NnF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C604430NnF<T> extends AbstractC604420NnE<T> {
    public final C00DG LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C604430NnF) && this.LIZJ == ((C604430NnF) obj).LIZJ;
    }

    public final int hashCode() {
        return this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failed(reason=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C604430NnF(C00DG c00dg) {
        super(null, false);
        this.LIZJ = c00dg;
    }
}
