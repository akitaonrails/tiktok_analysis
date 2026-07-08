package X;

/* JADX INFO: renamed from: X.0Y9R, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y9R {
    public static final /* synthetic */ int LIZIZ = 0;
    public final int LIZ;

    public C0Y9R() {
        this(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0Y9R) && this.LIZ == ((C0Y9R) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DeletedStatusFilter(value=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0Y9R(int i) {
        this.LIZ = i;
    }
}
