package X;

/* JADX INFO: renamed from: X.0rxq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1608680rxq {
    public static final int LIZIZ(EnumC1607270rvZ enumC1607270rvZ, EnumC1608710rxt enumC1608710rxt, String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(enumC1607270rvZ.getString());
        sbLIZ.append(enumC1608710rxt.getString());
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ).hashCode();
    }

    public static String LIZ(EnumC1607270rvZ enumC1607270rvZ, EnumC1608710rxt enumC1608710rxt, InterfaceC1609020ryO interfaceC1609020ryO, InterfaceC1606880ruw interfaceC1606880ruw) {
        String str;
        C1609230ryj c1609230ryj;
        C1609250ryl c1609250ryl;
        String string = null;
        if ((!(interfaceC1609020ryO instanceof C1609250ryl) || (c1609250ryl = (C1609250ryl) interfaceC1609020ryO) == null || (str = c1609250ryl.LJIIIZ) == null) && (!(interfaceC1609020ryO instanceof C1609230ryj) || (c1609230ryj = (C1609230ryj) interfaceC1609020ryO) == null || (str = c1609230ryj.LJIJI) == null)) {
            str = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(enumC1607270rvZ.getString());
        sbLIZ.append(enumC1608710rxt.getString());
        if (interfaceC1606880ruw != null) {
            string = interfaceC1606880ruw.getString();
        }
        sbLIZ.append(string);
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final int LIZJ(EnumC1607270rvZ enumC1607270rvZ, EnumC1608710rxt enumC1608710rxt, InterfaceC1609020ryO interfaceC1609020ryO, String str) {
        C1609230ryj c1609230ryj;
        C1609250ryl c1609250ryl;
        if (str == null && ((!(interfaceC1609020ryO instanceof C1609250ryl) || (c1609250ryl = (C1609250ryl) interfaceC1609020ryO) == null || (str = c1609250ryl.LJIIIZ) == null) && (!(interfaceC1609020ryO instanceof C1609230ryj) || (c1609230ryj = (C1609230ryj) interfaceC1609020ryO) == null || (str = c1609230ryj.LJIJI) == null))) {
            str = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(enumC1607270rvZ.getString());
        sbLIZ.append(enumC1608710rxt.getString());
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ).hashCode();
    }
}
