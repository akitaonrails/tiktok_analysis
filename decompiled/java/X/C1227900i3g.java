package X;

/* JADX INFO: renamed from: X.0i3g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1227900i3g extends C1226750i1p {
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final EnumC1226770i1r LJIIIIZZ;
    public final C0N0C LJIIIZ;

    public C1227900i3g() {
        this(false, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1227900i3g)) {
            return false;
        }
        C1227900i3g c1227900i3g = (C1227900i3g) obj;
        return this.LJFF == c1227900i3g.LJFF && this.LJI == c1227900i3g.LJI && this.LJII == c1227900i3g.LJII && this.LJIIIIZZ == c1227900i3g.LJIIIIZZ && this.LJIIIZ == c1227900i3g.LJIIIZ;
    }

    public final int hashCode() {
        int iZ2 = ((((C786410Ut5.Z2(this.LJFF) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + C786410Ut5.Z2(this.LJII)) * 31;
        EnumC1226770i1r enumC1226770i1r = this.LJIIIIZZ;
        int iHashCode = (iZ2 + (enumC1226770i1r == null ? 0 : enumC1226770i1r.hashCode())) * 31;
        C0N0C c0n0c = this.LJIIIZ;
        return iHashCode + (c0n0c != null ? c0n0c.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreateCampusGroupHeaderProtocolConfig(withIcon=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", defaultEnable=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", defaultVisible=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", dynamicBehavior=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", dynamicCondition=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C1226750i1p
    public final boolean LIZ() {
        return this.LJI;
    }

    @Override // X.C1226750i1p
    public final boolean LIZIZ() {
        return this.LJII;
    }

    @Override // X.C1226750i1p
    public final EnumC1226770i1r LIZJ() {
        return this.LJIIIIZZ;
    }

    @Override // X.C1226750i1p
    public final C0N0C LIZLLL() {
        return this.LJIIIZ;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1227900i3g(boolean z, int i) {
        boolean z2;
        boolean z3 = z;
        if ((i & 1) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z4 = (i & 2) != 0;
        z3 = (i & 4) != 0 ? true : z3;
        super("id_header_create_campus_group", z4, z3, null, null);
        this.LJFF = z2;
        this.LJI = z4;
        this.LJII = z3;
        this.LJIIIIZZ = null;
        this.LJIIIZ = null;
    }
}
