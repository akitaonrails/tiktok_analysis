package X;

/* JADX INFO: renamed from: X.0n4V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1420610n4V<T> {
    public static final /* synthetic */ int LIZJ = 0;
    public final int LIZ;
    public final T LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InterceptResult(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", result=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1420610n4V(Object obj, int i) {
        this.LIZ = i;
        this.LIZIZ = obj;
    }
}
