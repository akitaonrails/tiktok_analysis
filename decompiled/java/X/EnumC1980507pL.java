package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07pL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1980507pL {
    public static final /* synthetic */ EnumC1980507pL[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1980507pL PARAM_RULE;
    public static final EnumC1980507pL PATH_RULE;
    public static final EnumC1980507pL REGEX_RULE;

    public static InterfaceC2044707zh<EnumC1980507pL> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1980507pL enumC1980507pL = new EnumC1980507pL("PATH_RULE", 0);
        PATH_RULE = enumC1980507pL;
        EnumC1980507pL enumC1980507pL2 = new EnumC1980507pL("PARAM_RULE", 1);
        PARAM_RULE = enumC1980507pL2;
        EnumC1980507pL enumC1980507pL3 = new EnumC1980507pL("REGEX_RULE", 2);
        REGEX_RULE = enumC1980507pL3;
        EnumC1980507pL[] enumC1980507pLArr = {enumC1980507pL, enumC1980507pL2, enumC1980507pL3};
        LL = enumC1980507pLArr;
        LLILLJJLI = new C2254308sP(enumC1980507pLArr);
    }

    public static EnumC1980507pL[] values() {
        return (EnumC1980507pL[]) LL.clone();
    }

    public static EnumC1980507pL valueOf(String str) {
        return (EnumC1980507pL) C08FF.LIZ(EnumC1980507pL.class, str);
    }

    public EnumC1980507pL(String str, int i) {
    }
}
