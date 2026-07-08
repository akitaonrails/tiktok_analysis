package X;

/* JADX INFO: renamed from: X.0fhf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1137370fhf {
    public final int LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1137370fhf)) {
            return false;
        }
        C1137370fhf c1137370fhf = (C1137370fhf) obj;
        return this.LIZ == c1137370fhf.LIZ && this.LIZIZ == c1137370fhf.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RemoteTrayIndividualContainerHeightEvent(trayIndex=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", containerHeight=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1137370fhf(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
