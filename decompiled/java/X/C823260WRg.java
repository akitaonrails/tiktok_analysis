package X;

/* JADX INFO: renamed from: X.0WRg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C823260WRg {
    public final boolean LIZ;
    public final int LIZIZ;

    public C823260WRg() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C823260WRg)) {
            return false;
        }
        C823260WRg c823260WRg = (C823260WRg) obj;
        return this.LIZ == c823260WRg.LIZ && this.LIZIZ == c823260WRg.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EventCacheConfig(enable=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", queueMaxLength=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C823260WRg(int i) {
        this(false, 100);
    }

    public C823260WRg(boolean z, int i) {
        this.LIZ = z;
        this.LIZIZ = i;
    }
}
