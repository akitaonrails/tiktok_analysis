package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0yUL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1859470yUL {
    public static final EnumC1859470yUL ARABIC;
    public static final EnumC1859470yUL CJK;
    public static final EnumC1859470yUL CYRILLIC;
    public static final EnumC1859470yUL LATIN;
    public static final /* synthetic */ EnumC1859470yUL[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1859470yUL MIXED;
    public static final EnumC1859470yUL UNKNOWN;

    public static InterfaceC2044707zh<EnumC1859470yUL> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1859470yUL enumC1859470yUL = new EnumC1859470yUL("CJK", 0);
        CJK = enumC1859470yUL;
        EnumC1859470yUL enumC1859470yUL2 = new EnumC1859470yUL("LATIN", 1);
        LATIN = enumC1859470yUL2;
        EnumC1859470yUL enumC1859470yUL3 = new EnumC1859470yUL("ARABIC", 2);
        ARABIC = enumC1859470yUL3;
        EnumC1859470yUL enumC1859470yUL4 = new EnumC1859470yUL("CYRILLIC", 3);
        CYRILLIC = enumC1859470yUL4;
        EnumC1859470yUL enumC1859470yUL5 = new EnumC1859470yUL("MIXED", 4);
        MIXED = enumC1859470yUL5;
        EnumC1859470yUL enumC1859470yUL6 = new EnumC1859470yUL("UNKNOWN", 5);
        UNKNOWN = enumC1859470yUL6;
        EnumC1859470yUL[] enumC1859470yULArr = {enumC1859470yUL, enumC1859470yUL2, enumC1859470yUL3, enumC1859470yUL4, enumC1859470yUL5, enumC1859470yUL6};
        LL = enumC1859470yULArr;
        LLILLJJLI = new C2254308sP(enumC1859470yULArr);
    }

    public static EnumC1859470yUL[] values() {
        return (EnumC1859470yUL[]) LL.clone();
    }

    public static EnumC1859470yUL valueOf(String str) {
        return (EnumC1859470yUL) C08FF.LIZ(EnumC1859470yUL.class, str);
    }

    public EnumC1859470yUL(String str, int i) {
    }
}
