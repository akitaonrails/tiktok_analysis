package X;

/* JADX INFO: renamed from: X.1Dcx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public enum EnumC2259971Dcx {
    DECIMAL,
    PERCENT,
    CURRENCY,
    UNIT;

    @Override // java.lang.Enum
    public String toString() {
        int i = C2259961Dcw.LIZ[ordinal()];
        if (i == 1) {
            return "decimal";
        }
        if (i == 2) {
            return "percent";
        }
        if (i == 3) {
            return "currency";
        }
        if (i == 4) {
            return "unit";
        }
        throw new IllegalArgumentException();
    }

    public static EnumC2259971Dcx valueOf(String str) {
        return (EnumC2259971Dcx) C08FF.LIZ(EnumC2259971Dcx.class, str);
    }

    public int getInitialNumberFormatStyle(EnumC2259981Dcy enumC2259981Dcy, EnumC2259991Dcz enumC2259991Dcz) throws C20129013pQ {
        int i = C2259961Dcw.LIZ[ordinal()];
        if (i == 2) {
            return 2;
        }
        if (i != 3) {
            if (enumC2259981Dcy == EnumC2259981Dcy.SCIENTIFIC || enumC2259981Dcy == EnumC2259981Dcy.ENGINEERING) {
                return 3;
            }
            return 0;
        }
        if (enumC2259991Dcz == EnumC2259991Dcz.ACCOUNTING) {
            return 7;
        }
        if (enumC2259991Dcz == EnumC2259991Dcz.STANDARD) {
            return 1;
        }
        throw new C20129013pQ("Unrecognized formatting style requested.");
    }
}
