package X;

/* JADX INFO: renamed from: X.0CFS, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CFS {
    public final int LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0CFS)) {
            return false;
        }
        C0CFS c0cfs = (C0CFS) obj;
        return this.LIZ == c0cfs.LIZ && this.LIZIZ == c0cfs.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QueueProcessResult(processed=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", needReschedule=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0CFS(int i, boolean z) {
        this.LIZ = i;
        this.LIZIZ = z;
    }
}
