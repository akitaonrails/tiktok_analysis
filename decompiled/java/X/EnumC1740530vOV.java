package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vOV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1740530vOV {
    public static final EnumC1740530vOV ARRAY;
    public static final EnumC1740530vOV BOOLEAN;
    public static final EnumC1740530vOV DOUBLE;
    public static final EnumC1740530vOV INT;
    public static final EnumC1740530vOV INT_ARRAY;
    public static final EnumC1740530vOV JSON;
    public static final /* synthetic */ EnumC1740530vOV[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1740530vOV LONG;
    public static final EnumC1740530vOV NULL;
    public static final EnumC1740530vOV OBJECT;
    public static final EnumC1740530vOV STRING;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1740530vOV> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1740530vOV enumC1740530vOV = new EnumC1740530vOV("INT", 0, "int");
        INT = enumC1740530vOV;
        EnumC1740530vOV enumC1740530vOV2 = new EnumC1740530vOV("LONG", 1, "long");
        LONG = enumC1740530vOV2;
        EnumC1740530vOV enumC1740530vOV3 = new EnumC1740530vOV("DOUBLE", 2, "double");
        DOUBLE = enumC1740530vOV3;
        EnumC1740530vOV enumC1740530vOV4 = new EnumC1740530vOV("STRING", 3, "string");
        STRING = enumC1740530vOV4;
        EnumC1740530vOV enumC1740530vOV5 = new EnumC1740530vOV("BOOLEAN", 4, "boolean");
        BOOLEAN = enumC1740530vOV5;
        EnumC1740530vOV enumC1740530vOV6 = new EnumC1740530vOV("ARRAY", 5, "array");
        ARRAY = enumC1740530vOV6;
        EnumC1740530vOV enumC1740530vOV7 = new EnumC1740530vOV("INT_ARRAY", 6, "int_array");
        INT_ARRAY = enumC1740530vOV7;
        EnumC1740530vOV enumC1740530vOV8 = new EnumC1740530vOV("OBJECT", 7, "object");
        OBJECT = enumC1740530vOV8;
        EnumC1740530vOV enumC1740530vOV9 = new EnumC1740530vOV("JSON", 8, "json");
        JSON = enumC1740530vOV9;
        EnumC1740530vOV enumC1740530vOV10 = new EnumC1740530vOV("NULL", 9, "null");
        NULL = enumC1740530vOV10;
        EnumC1740530vOV[] enumC1740530vOVArr = {enumC1740530vOV, enumC1740530vOV2, enumC1740530vOV3, enumC1740530vOV4, enumC1740530vOV5, enumC1740530vOV6, enumC1740530vOV7, enumC1740530vOV8, enumC1740530vOV9, enumC1740530vOV10};
        LLILLJJLI = enumC1740530vOVArr;
        LLILLL = new C2254308sP(enumC1740530vOVArr);
    }

    public static EnumC1740530vOV[] values() {
        return (EnumC1740530vOV[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC1740530vOV valueOf(String str) {
        return (EnumC1740530vOV) C08FF.LIZ(EnumC1740530vOV.class, str);
    }

    public EnumC1740530vOV(String str, int i, String str2) {
        this.LL = str2;
    }
}
