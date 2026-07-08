package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0qXD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1553730qXD {
    public static final EnumC1553730qXD ARRAY;
    public static final EnumC1553730qXD BOOL;
    public static final C1201920hNm Companion;
    public static final EnumC1553730qXD DOUBLE;
    public static final EnumC1553730qXD FLOAT;
    public static final EnumC1553730qXD INT32;
    public static final /* synthetic */ EnumC1553730qXD[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1553730qXD LONG;
    public static final EnumC1553730qXD NUMBER;
    public static final EnumC1553730qXD OBJECT;
    public static final EnumC1553730qXD STRING;
    public static final EnumC1553730qXD UNSUPPORTED;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1553730qXD> getEntries() {
        return LLILLL;
    }

    public static final EnumC1553730qXD getValueByType(String str) {
        Companion.getClass();
        return C1201920hNm.LIZ(str);
    }

    static {
        EnumC1553730qXD enumC1553730qXD = new EnumC1553730qXD("STRING", 0, "string");
        STRING = enumC1553730qXD;
        EnumC1553730qXD enumC1553730qXD2 = new EnumC1553730qXD("BOOL", 1, "bool");
        BOOL = enumC1553730qXD2;
        EnumC1553730qXD enumC1553730qXD3 = new EnumC1553730qXD("NUMBER", 2, "number");
        NUMBER = enumC1553730qXD3;
        EnumC1553730qXD enumC1553730qXD4 = new EnumC1553730qXD("OBJECT", 3, "object");
        OBJECT = enumC1553730qXD4;
        EnumC1553730qXD enumC1553730qXD5 = new EnumC1553730qXD("ARRAY", 4, "array");
        ARRAY = enumC1553730qXD5;
        EnumC1553730qXD enumC1553730qXD6 = new EnumC1553730qXD("INT32", 5, "int32");
        INT32 = enumC1553730qXD6;
        EnumC1553730qXD enumC1553730qXD7 = new EnumC1553730qXD("LONG", 6, "long");
        LONG = enumC1553730qXD7;
        EnumC1553730qXD enumC1553730qXD8 = new EnumC1553730qXD("FLOAT", 7, "float");
        FLOAT = enumC1553730qXD8;
        EnumC1553730qXD enumC1553730qXD9 = new EnumC1553730qXD("DOUBLE", 8, "double");
        DOUBLE = enumC1553730qXD9;
        EnumC1553730qXD enumC1553730qXD10 = new EnumC1553730qXD("UNSUPPORTED", 9, null);
        UNSUPPORTED = enumC1553730qXD10;
        EnumC1553730qXD[] enumC1553730qXDArr = {enumC1553730qXD, enumC1553730qXD2, enumC1553730qXD3, enumC1553730qXD4, enumC1553730qXD5, enumC1553730qXD6, enumC1553730qXD7, enumC1553730qXD8, enumC1553730qXD9, enumC1553730qXD10};
        LLILLJJLI = enumC1553730qXDArr;
        LLILLL = new C2254308sP(enumC1553730qXDArr);
        Companion = new C1201920hNm();
    }

    public static EnumC1553730qXD[] values() {
        return (EnumC1553730qXD[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC1553730qXD valueOf(String str) {
        return (EnumC1553730qXD) C08FF.LIZ(EnumC1553730qXD.class, str);
    }

    public EnumC1553730qXD(String str, int i, String str2) {
        this.LL = str2;
    }
}
