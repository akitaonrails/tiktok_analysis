package X;

/* JADX INFO: renamed from: X.0gDs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1157340gDs {
    public final EnumC1342430l2P LIZ;
    public final EnumC1342610l2h LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1157340gDs)) {
            return false;
        }
        C1157340gDs c1157340gDs = (C1157340gDs) obj;
        return this.LIZ == c1157340gDs.LIZ && this.LIZIZ == c1157340gDs.LIZIZ;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        EnumC1342610l2h enumC1342610l2h = this.LIZIZ;
        return iHashCode + (enumC1342610l2h == null ? 0 : enumC1342610l2h.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PostModeFullPageFooterStatus(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", height=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1157340gDs(EnumC1342430l2P enumC1342430l2P, EnumC1342610l2h enumC1342610l2h) {
        this.LIZ = enumC1342430l2P;
        this.LIZIZ = enumC1342610l2h;
    }
}
