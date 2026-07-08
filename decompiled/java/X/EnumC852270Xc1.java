package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Xc1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC852270Xc1 {
    public static final EnumC852270Xc1 ALL_CHARS_VALID_RULE;
    public static final EnumC852270Xc1 LENGTH_RANGE_RULE;
    public static final EnumC852270Xc1 LETTER_NUMBER_SPECIAL_CHAR_CONTAINED;
    public static final /* synthetic */ EnumC852270Xc1[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC852270Xc1> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC852270Xc1 enumC852270Xc1 = new EnumC852270Xc1("ALL_CHARS_VALID_RULE", 0);
        ALL_CHARS_VALID_RULE = enumC852270Xc1;
        EnumC852270Xc1 enumC852270Xc12 = new EnumC852270Xc1("LENGTH_RANGE_RULE", 1);
        LENGTH_RANGE_RULE = enumC852270Xc12;
        EnumC852270Xc1 enumC852270Xc13 = new EnumC852270Xc1("LETTER_NUMBER_SPECIAL_CHAR_CONTAINED", 2);
        LETTER_NUMBER_SPECIAL_CHAR_CONTAINED = enumC852270Xc13;
        EnumC852270Xc1[] enumC852270Xc1Arr = {enumC852270Xc1, enumC852270Xc12, enumC852270Xc13};
        LL = enumC852270Xc1Arr;
        LLILLJJLI = new C2254308sP(enumC852270Xc1Arr);
    }

    public static EnumC852270Xc1[] values() {
        return (EnumC852270Xc1[]) LL.clone();
    }

    public static EnumC852270Xc1 valueOf(String str) {
        return (EnumC852270Xc1) C08FF.LIZ(EnumC852270Xc1.class, str);
    }

    public EnumC852270Xc1(String str, int i) {
    }
}
