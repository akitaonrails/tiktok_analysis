package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07pN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1980707pN {
    public static final EnumC1980707pN ARRAY_END;
    public static final EnumC1980707pN ARRAY_SEPARATOR;
    public static final EnumC1980707pN ARRAY_START;
    public static final EnumC1980707pN IDENTIFIER;
    public static final /* synthetic */ EnumC1980707pN[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1980707pN NUMBER;
    public static final EnumC1980707pN OPERATOR;
    public static final EnumC1980707pN STRING;

    public static InterfaceC2044707zh<EnumC1980707pN> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1980707pN enumC1980707pN = new EnumC1980707pN("NUMBER", 0);
        NUMBER = enumC1980707pN;
        EnumC1980707pN enumC1980707pN2 = new EnumC1980707pN("STRING", 1);
        STRING = enumC1980707pN2;
        EnumC1980707pN enumC1980707pN3 = new EnumC1980707pN("OPERATOR", 2);
        OPERATOR = enumC1980707pN3;
        EnumC1980707pN enumC1980707pN4 = new EnumC1980707pN("IDENTIFIER", 3);
        IDENTIFIER = enumC1980707pN4;
        EnumC1980707pN enumC1980707pN5 = new EnumC1980707pN("ARRAY_START", 4);
        ARRAY_START = enumC1980707pN5;
        EnumC1980707pN enumC1980707pN6 = new EnumC1980707pN("ARRAY_SEPARATOR", 5);
        ARRAY_SEPARATOR = enumC1980707pN6;
        EnumC1980707pN enumC1980707pN7 = new EnumC1980707pN("ARRAY_END", 6);
        ARRAY_END = enumC1980707pN7;
        EnumC1980707pN[] enumC1980707pNArr = {enumC1980707pN, enumC1980707pN2, enumC1980707pN3, enumC1980707pN4, enumC1980707pN5, enumC1980707pN6, enumC1980707pN7};
        LL = enumC1980707pNArr;
        LLILLJJLI = new C2254308sP(enumC1980707pNArr);
    }

    public static EnumC1980707pN[] values() {
        return (EnumC1980707pN[]) LL.clone();
    }

    public static EnumC1980707pN valueOf(String str) {
        return (EnumC1980707pN) C08FF.LIZ(EnumC1980707pN.class, str);
    }

    public EnumC1980707pN(String str, int i) {
    }
}
