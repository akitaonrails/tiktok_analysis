package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vOT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1740510vOT {
    public static final EnumC1740510vOT ARRAY;
    public static final EnumC1740510vOT BOOLEAN;
    public static final EnumC1740510vOT DOUBLE;
    public static final EnumC1740510vOT INT;
    public static final EnumC1740510vOT JSON;
    public static final /* synthetic */ EnumC1740510vOT[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1740510vOT LONG;
    public static final EnumC1740510vOT NULL;
    public static final EnumC1740510vOT OBJECT;
    public static final EnumC1740510vOT STRING;
    public static final EnumC1740510vOT UUID;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1740510vOT> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1740510vOT enumC1740510vOT = new EnumC1740510vOT("INT", 0, "int");
        INT = enumC1740510vOT;
        EnumC1740510vOT enumC1740510vOT2 = new EnumC1740510vOT("LONG", 1, "long");
        LONG = enumC1740510vOT2;
        EnumC1740510vOT enumC1740510vOT3 = new EnumC1740510vOT("DOUBLE", 2, "double");
        DOUBLE = enumC1740510vOT3;
        EnumC1740510vOT enumC1740510vOT4 = new EnumC1740510vOT("STRING", 3, "string");
        STRING = enumC1740510vOT4;
        EnumC1740510vOT enumC1740510vOT5 = new EnumC1740510vOT("BOOLEAN", 4, "boolean");
        BOOLEAN = enumC1740510vOT5;
        EnumC1740510vOT enumC1740510vOT6 = new EnumC1740510vOT("ARRAY", 5, "array");
        ARRAY = enumC1740510vOT6;
        EnumC1740510vOT enumC1740510vOT7 = new EnumC1740510vOT("OBJECT", 6, "object");
        OBJECT = enumC1740510vOT7;
        EnumC1740510vOT enumC1740510vOT8 = new EnumC1740510vOT("JSON", 7, "json");
        JSON = enumC1740510vOT8;
        EnumC1740510vOT enumC1740510vOT9 = new EnumC1740510vOT("NULL", 8, "null");
        NULL = enumC1740510vOT9;
        EnumC1740510vOT enumC1740510vOT10 = new EnumC1740510vOT("UUID", 9, "uuid");
        UUID = enumC1740510vOT10;
        EnumC1740510vOT[] enumC1740510vOTArr = {enumC1740510vOT, enumC1740510vOT2, enumC1740510vOT3, enumC1740510vOT4, enumC1740510vOT5, enumC1740510vOT6, enumC1740510vOT7, enumC1740510vOT8, enumC1740510vOT9, enumC1740510vOT10};
        LLILLJJLI = enumC1740510vOTArr;
        LLILLL = new C2254308sP(enumC1740510vOTArr);
    }

    public static EnumC1740510vOT[] values() {
        return (EnumC1740510vOT[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC1740510vOT valueOf(String str) {
        return (EnumC1740510vOT) C08FF.LIZ(EnumC1740510vOT.class, str);
    }

    public EnumC1740510vOT(String str, int i, String str2) {
        this.LL = str2;
    }
}
