package X;

/* JADX INFO: renamed from: X.0i1o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1226740i1o extends C1226750i1p {
    public final boolean LJFF;
    public final boolean LJI;
    public final EnumC1226770i1r LJII;
    public final C0N0C LJIIIIZZ;

    public C1226740i1o() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1226740i1o)) {
            return false;
        }
        C1226740i1o c1226740i1o = (C1226740i1o) obj;
        return this.LJFF == c1226740i1o.LJFF && this.LJI == c1226740i1o.LJI && this.LJII == c1226740i1o.LJII && this.LJIIIIZZ == c1226740i1o.LJIIIIZZ;
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
        sbLIZ.append("SelectGroupHeaderProtocolConfig(defaultEnable=");
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

    public C1226740i1o(int i) {
        super("id_select_group", true, true, null, null);
        this.LJFF = true;
        this.LJI = true;
        this.LJII = null;
        this.LJIIIIZZ = null;
    }
}
