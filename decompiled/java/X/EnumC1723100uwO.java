package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0uwO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1723100uwO {
    public static final EnumC1723100uwO ALPHABETIC;
    public static final EnumC1723100uwO ALPHANUMERIC;
    public static final EnumC1723100uwO ALPHANUMERIC_SPECIAL;
    public static final EnumC1723100uwO BINARY;
    public static final EnumC1723100uwO COMPRESSED_NUMERIC;
    public static final /* synthetic */ EnumC1723100uwO[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1723100uwO NUMERIC;

    public static InterfaceC2044707zh<EnumC1723100uwO> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1723100uwO enumC1723100uwO = new EnumC1723100uwO("NUMERIC", 0);
        NUMERIC = enumC1723100uwO;
        EnumC1723100uwO enumC1723100uwO2 = new EnumC1723100uwO("COMPRESSED_NUMERIC", 1);
        COMPRESSED_NUMERIC = enumC1723100uwO2;
        EnumC1723100uwO enumC1723100uwO3 = new EnumC1723100uwO("ALPHABETIC", 2);
        ALPHABETIC = enumC1723100uwO3;
        EnumC1723100uwO enumC1723100uwO4 = new EnumC1723100uwO("ALPHANUMERIC", 3);
        ALPHANUMERIC = enumC1723100uwO4;
        EnumC1723100uwO enumC1723100uwO5 = new EnumC1723100uwO("ALPHANUMERIC_SPECIAL", 4);
        ALPHANUMERIC_SPECIAL = enumC1723100uwO5;
        EnumC1723100uwO enumC1723100uwO6 = new EnumC1723100uwO("BINARY", 5);
        BINARY = enumC1723100uwO6;
        EnumC1723100uwO[] enumC1723100uwOArr = {enumC1723100uwO, enumC1723100uwO2, enumC1723100uwO3, enumC1723100uwO4, enumC1723100uwO5, enumC1723100uwO6};
        LL = enumC1723100uwOArr;
        LLILLJJLI = new C2254308sP(enumC1723100uwOArr);
    }

    public static EnumC1723100uwO[] values() {
        return (EnumC1723100uwO[]) LL.clone();
    }

    public static EnumC1723100uwO valueOf(String str) {
        return (EnumC1723100uwO) C08FF.LIZ(EnumC1723100uwO.class, str);
    }

    public EnumC1723100uwO(String str, int i) {
    }
}
