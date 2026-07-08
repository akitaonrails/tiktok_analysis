package X;

/* JADX INFO: renamed from: X.0b7m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C961360b7m extends C955670ayb {
    public final EnumC961230b7Z LJ;
    public EnumC961260b7c LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C961360b7m)) {
            return false;
        }
        C961360b7m c961360b7m = (C961360b7m) obj;
        return this.LJ == c961360b7m.LJ && this.LJFF == c961360b7m.LJFF;
    }

    public final int hashCode() {
        return (this.LJ.hashCode() * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExpandCollapseItem(listType=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", expandState=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C961360b7m(EnumC961230b7Z enumC961230b7Z, EnumC961260b7c enumC961260b7c) {
        this.LJ = enumC961230b7Z;
        this.LJFF = enumC961260b7c;
    }
}
