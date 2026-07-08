package X;

/* JADX INFO: renamed from: X.0i28, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1226940i28 extends C1226750i1p {
    public final boolean LJFF;
    public final boolean LJI;
    public final EnumC1226770i1r LJII;
    public final C0N0C LJIIIIZZ;

    public C1226940i28() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1226940i28)) {
            return false;
        }
        C1226940i28 c1226940i28 = (C1226940i28) obj;
        return this.LJFF == c1226940i28.LJFF && this.LJI == c1226940i28.LJI && this.LJII == c1226940i28.LJII && this.LJIIIIZZ == c1226940i28.LJIIIIZZ;
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
        sbLIZ.append("FindFriendsHeaderProtocolConfig(defaultEnable=");
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

    public C1226940i28(int i) {
        super("id_header_find_friend", true, false, null, null);
        this.LJFF = true;
        this.LJI = false;
        this.LJII = null;
        this.LJIIIIZZ = null;
    }
}
