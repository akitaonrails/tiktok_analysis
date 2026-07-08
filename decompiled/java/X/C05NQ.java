package X;

/* JADX INFO: renamed from: X.05NQ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05NQ<T> implements C05NR<T> {
    public final int LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C05NQ) && this.LIZ == ((C05NQ) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Loading(value=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C05NQ(int i) {
        this.LIZ = i;
    }
}
