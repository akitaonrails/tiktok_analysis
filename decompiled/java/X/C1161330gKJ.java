package X;

/* JADX INFO: renamed from: X.0gKJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1161330gKJ {
    public final EnumC1160590gJ7 LIZ = EnumC1160590gJ7.LIST;
    public final int LIZIZ = 1;
    public final int LIZJ = 0;
    public final int LIZLLL = 0;
    public final int LJ = 0;
    public final int LJFF = 0;
    public final int LJI = 0;
    public final int LJII = 0;
    public final int LJIIIIZZ = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1161330gKJ)) {
            return false;
        }
        C1161330gKJ c1161330gKJ = (C1161330gKJ) obj;
        return this.LIZ == c1161330gKJ.LIZ && this.LIZIZ == c1161330gKJ.LIZIZ && this.LIZJ == c1161330gKJ.LIZJ && this.LIZLLL == c1161330gKJ.LIZLLL && this.LJ == c1161330gKJ.LJ && this.LJFF == c1161330gKJ.LJFF && this.LJI == c1161330gKJ.LJI && this.LJII == c1161330gKJ.LJII && this.LJIIIIZZ == c1161330gKJ.LJIIIIZZ;
    }

    public final int hashCode() {
        return (((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ) * 31) + this.LJFF) * 31) + this.LJI) * 31) + this.LJII) * 31) + this.LJIIIIZZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BodyGroupLayoutOverride(layoutType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", column=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", gap=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", paddingLeft=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", paddingRight=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", paddingTop=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", paddingBottom=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", backgroundColor=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", backgroundColorDark=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
