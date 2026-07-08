package X;

/* JADX INFO: renamed from: X.0qbn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1556570qbn {
    public final int LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1556570qbn)) {
            return false;
        }
        C1556570qbn c1556570qbn = (C1556570qbn) obj;
        return this.LIZ == c1556570qbn.LIZ && this.LIZIZ == c1556570qbn.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaFocusTabActionNew(toContentListIndex=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", scroll=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1556570qbn(int i, boolean z) {
        this.LIZ = i;
        this.LIZIZ = z;
    }
}
