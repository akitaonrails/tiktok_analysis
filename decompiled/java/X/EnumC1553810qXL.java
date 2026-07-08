package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0qXL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1553810qXL {
    public static final EnumC1553810qXL ARRAY;
    public static final EnumC1553810qXL BOOLEAN;
    public static final EnumC1553810qXL DOUBLE;
    public static final EnumC1553810qXL INT;
    public static final EnumC1553810qXL JSON;
    public static final /* synthetic */ EnumC1553810qXL[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1553810qXL LONG;
    public static final EnumC1553810qXL STRING;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1553810qXL> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1553810qXL enumC1553810qXL = new EnumC1553810qXL("INT", 0, "int");
        INT = enumC1553810qXL;
        EnumC1553810qXL enumC1553810qXL2 = new EnumC1553810qXL("LONG", 1, "long");
        LONG = enumC1553810qXL2;
        EnumC1553810qXL enumC1553810qXL3 = new EnumC1553810qXL("DOUBLE", 2, "double");
        DOUBLE = enumC1553810qXL3;
        EnumC1553810qXL enumC1553810qXL4 = new EnumC1553810qXL("STRING", 3, "string");
        STRING = enumC1553810qXL4;
        EnumC1553810qXL enumC1553810qXL5 = new EnumC1553810qXL("BOOLEAN", 4, "boolean");
        BOOLEAN = enumC1553810qXL5;
        EnumC1553810qXL enumC1553810qXL6 = new EnumC1553810qXL("ARRAY", 5, "array");
        ARRAY = enumC1553810qXL6;
        EnumC1553810qXL enumC1553810qXL7 = new EnumC1553810qXL("JSON", 6, "json");
        JSON = enumC1553810qXL7;
        EnumC1553810qXL[] enumC1553810qXLArr = {enumC1553810qXL, enumC1553810qXL2, enumC1553810qXL3, enumC1553810qXL4, enumC1553810qXL5, enumC1553810qXL6, enumC1553810qXL7};
        LLILLJJLI = enumC1553810qXLArr;
        LLILLL = new C2254308sP(enumC1553810qXLArr);
    }

    public static EnumC1553810qXL[] values() {
        return (EnumC1553810qXL[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC1553810qXL valueOf(String str) {
        return (EnumC1553810qXL) C08FF.LIZ(EnumC1553810qXL.class, str);
    }

    public EnumC1553810qXL(String str, int i, String str2) {
        this.LL = str2;
    }
}
