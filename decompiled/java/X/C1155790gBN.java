package X;

/* JADX INFO: renamed from: X.0gBN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1155790gBN {
    public final int LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1155790gBN)) {
            return false;
        }
        C1155790gBN c1155790gBN = (C1155790gBN) obj;
        return this.LIZ == c1155790gBN.LIZ && this.LIZIZ == c1155790gBN.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TriggerKey(scene=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", event=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1155790gBN(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
