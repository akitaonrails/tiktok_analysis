package X;

/* JADX INFO: renamed from: X.0i27, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1226930i27 extends C1226750i1p {
    public final boolean LJFF;
    public final boolean LJI;
    public final EnumC1226770i1r LJII;
    public final C0N0C LJIIIIZZ;

    public C1226930i27() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1226930i27)) {
            return false;
        }
        C1226930i27 c1226930i27 = (C1226930i27) obj;
        return this.LJFF == c1226930i27.LJFF && this.LJI == c1226930i27.LJI && this.LJII == c1226930i27.LJII && this.LJIIIIZZ == c1226930i27.LJIIIIZZ;
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.LJFF) * 31) + C786410Ut5.Z2(this.LJI)) * 31;
        EnumC1226770i1r enumC1226770i1r = this.LJII;
        int iHashCode = (iZ2 + (enumC1226770i1r == null ? 0 : enumC1226770i1r.hashCode())) * 31;
        C0N0C c0n0c = this.LJIIIIZZ;
        return iHashCode + (c0n0c != null ? c0n0c.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreateBBHeaderProtocolConfig(defaultEnable=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", defaultVisible=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", dynamicBehavior=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", dynamicCondition=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C1226750i1p
    public final boolean LIZ() {
        return this.LJFF;
    }

    @Override // X.C1226750i1p
    public final boolean LIZIZ() {
        return this.LJI;
    }

    @Override // X.C1226750i1p
    public final EnumC1226770i1r LIZJ() {
        return this.LJII;
    }

    @Override // X.C1226750i1p
    public final C0N0C LIZLLL() {
        return this.LJIIIIZZ;
    }

    public /* synthetic */ C1226930i27(int i) {
        this(true, true, null, null);
    }

    public C1226930i27(boolean z, boolean z2, EnumC1226770i1r enumC1226770i1r, C0N0C c0n0c) {
        super("id_header_bulletin_board", z, z2, enumC1226770i1r, c0n0c);
        this.LJFF = z;
        this.LJI = z2;
        this.LJII = enumC1226770i1r;
        this.LJIIIIZZ = c0n0c;
    }
}
