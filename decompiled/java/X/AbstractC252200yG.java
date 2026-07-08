package X;

/* JADX INFO: renamed from: X.00yG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC252200yG<T> {
    public final String toString() {
        if (this instanceof C252300yH) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Success(");
            sbLIZ.append(((C252300yH) this).LIZ);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (!(this instanceof C252400yI)) {
            throw new C1954807lC();
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Failure(");
        sbLIZ2.append(((C252400yI) this).LIZ);
        sbLIZ2.append(')');
        return C2188811AlT.LIZIZ(sbLIZ2);
    }
}
