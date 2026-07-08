package X;

/* JADX INFO: renamed from: X.04l4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1189604l4<T> {
    public final boolean LIZ;
    public final T LIZIZ;
    public final String LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Result(success=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", resource=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", errorMessage=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1189604l4(Object obj, String str, boolean z) {
        this.LIZ = z;
        this.LIZIZ = obj;
        this.LIZJ = str;
    }
}
