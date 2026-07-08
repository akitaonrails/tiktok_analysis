package X;

/* JADX INFO: renamed from: X.07WU, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07WU {
    public int LIZ;

    public C07WU() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C07WU) && this.LIZ == ((C07WU) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DeltaCounter(count=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07WU(int i) {
        this.LIZ = 0;
    }
}
