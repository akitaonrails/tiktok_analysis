package X;

/* JADX INFO: renamed from: X.06hA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1675006hA {
    public static final /* synthetic */ int LIZ = 0;

    public static C1675206hC LIZ(InterfaceC1677406hY interfaceC1677406hY) {
        int i;
        int iOrdinal;
        if (interfaceC1677406hY instanceof InterfaceC1675606hG) {
            i = 0;
        } else if (interfaceC1677406hY instanceof EnumC1641806bo) {
            i = 1;
        } else if (interfaceC1677406hY instanceof EnumC1670906gV) {
            i = 2;
        } else {
            i = 3;
        }
        if (interfaceC1677406hY instanceof EnumC1674706h7) {
            iOrdinal = ((EnumC1674706h7) interfaceC1677406hY).ordinal();
        } else if (interfaceC1677406hY instanceof EnumC1674806h8) {
            iOrdinal = ((EnumC1674806h8) interfaceC1677406hY).ordinal() + EnumC1674706h7.values().length;
        } else if (interfaceC1677406hY instanceof EnumC1641806bo) {
            iOrdinal = ((EnumC1641806bo) interfaceC1677406hY).ordinal();
        } else if (interfaceC1677406hY instanceof EnumC1670906gV) {
            iOrdinal = ((EnumC1670906gV) interfaceC1677406hY).ordinal();
        } else if (interfaceC1677406hY instanceof EnumC1674506h5) {
            iOrdinal = ((EnumC1674506h5) interfaceC1677406hY).ordinal();
        } else {
            iOrdinal = -1;
        }
        return new C1675206hC(i, iOrdinal);
    }

    public static boolean LIZIZ(InterfaceC1677406hY interfaceC1677406hY, InterfaceC1677406hY interfaceC1677406hY2) {
        C1675206hC c1675206hCLIZ = LIZ(interfaceC1677406hY);
        C1675206hC c1675206hCLIZ2 = LIZ(interfaceC1677406hY2);
        int i = c1675206hCLIZ.LIZ;
        int i2 = c1675206hCLIZ2.LIZ;
        if (i < i2) {
            return true;
        }
        if (i <= i2 && c1675206hCLIZ.LIZIZ < c1675206hCLIZ2.LIZIZ) {
            return true;
        }
        return false;
    }
}
