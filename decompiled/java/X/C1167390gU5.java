package X;

/* JADX INFO: renamed from: X.0gU5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1167390gU5 {
    public final int LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1167390gU5)) {
            return false;
        }
        C1167390gU5 c1167390gU5 = (C1167390gU5) obj;
        return this.LIZ == c1167390gU5.LIZ && this.LIZIZ == c1167390gU5.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubOnlySnapshot(count=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isAccurate=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1167390gU5(int i, boolean z) {
        this.LIZ = i;
        this.LIZIZ = z;
    }
}
