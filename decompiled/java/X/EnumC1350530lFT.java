package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lFT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1350530lFT {
    public static final EnumC1350530lFT DATA_INVALID;
    public static final /* synthetic */ EnumC1350530lFT[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1350530lFT NEW_COMPONENT_PRIORITY_NOT_MATCH;
    public static final EnumC1350530lFT NOT_MEET_BUSINESS_CONDITION;
    public static final EnumC1350530lFT NOT_MEET_NEW_COMPONENT_CONDITION;
    public static final EnumC1350530lFT NOT_MEET_STRATEGY;
    public static final EnumC1350530lFT NO_NEW_COMPONENT;
    public static final EnumC1350530lFT NO_NEW_COMPONENT_LIST;
    public static final EnumC1350530lFT NO_NEW_COMPONENT_V2;
    public static final EnumC1350530lFT NO_OLD_COMPONENT;
    public static final EnumC1350530lFT OUT_OF_SETTINGS_CONFIG;
    public static final EnumC1350530lFT USE_OLD_COMPONENT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1350530lFT> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1350530lFT enumC1350530lFT = new EnumC1350530lFT("USE_OLD_COMPONENT", 0, 1001);
        USE_OLD_COMPONENT = enumC1350530lFT;
        EnumC1350530lFT enumC1350530lFT2 = new EnumC1350530lFT("DATA_INVALID", 1, 1002);
        DATA_INVALID = enumC1350530lFT2;
        EnumC1350530lFT enumC1350530lFT3 = new EnumC1350530lFT("NOT_MEET_STRATEGY", 2, 1003);
        NOT_MEET_STRATEGY = enumC1350530lFT3;
        EnumC1350530lFT enumC1350530lFT4 = new EnumC1350530lFT("OUT_OF_SETTINGS_CONFIG", 3, 1004);
        OUT_OF_SETTINGS_CONFIG = enumC1350530lFT4;
        EnumC1350530lFT enumC1350530lFT5 = new EnumC1350530lFT("NOT_MEET_BUSINESS_CONDITION", 4, 1005);
        NOT_MEET_BUSINESS_CONDITION = enumC1350530lFT5;
        EnumC1350530lFT enumC1350530lFT6 = new EnumC1350530lFT("NO_OLD_COMPONENT", 5, 1006);
        NO_OLD_COMPONENT = enumC1350530lFT6;
        EnumC1350530lFT enumC1350530lFT7 = new EnumC1350530lFT("NO_NEW_COMPONENT", 6, 1007);
        NO_NEW_COMPONENT = enumC1350530lFT7;
        EnumC1350530lFT enumC1350530lFT8 = new EnumC1350530lFT("NOT_MEET_NEW_COMPONENT_CONDITION", 7, 1008);
        NOT_MEET_NEW_COMPONENT_CONDITION = enumC1350530lFT8;
        EnumC1350530lFT enumC1350530lFT9 = new EnumC1350530lFT("NEW_COMPONENT_PRIORITY_NOT_MATCH", 8, 1009);
        NEW_COMPONENT_PRIORITY_NOT_MATCH = enumC1350530lFT9;
        EnumC1350530lFT enumC1350530lFT10 = new EnumC1350530lFT("NO_NEW_COMPONENT_LIST", 9, 1010);
        NO_NEW_COMPONENT_LIST = enumC1350530lFT10;
        EnumC1350530lFT enumC1350530lFT11 = new EnumC1350530lFT("NO_NEW_COMPONENT_V2", 10, 1011);
        NO_NEW_COMPONENT_V2 = enumC1350530lFT11;
        EnumC1350530lFT[] enumC1350530lFTArr = {enumC1350530lFT, enumC1350530lFT2, enumC1350530lFT3, enumC1350530lFT4, enumC1350530lFT5, enumC1350530lFT6, enumC1350530lFT7, enumC1350530lFT8, enumC1350530lFT9, enumC1350530lFT10, enumC1350530lFT11};
        LLILLJJLI = enumC1350530lFTArr;
        LLILLL = new C2254308sP(enumC1350530lFTArr);
    }

    public static EnumC1350530lFT[] values() {
        return (EnumC1350530lFT[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1350530lFT valueOf(String str) {
        return (EnumC1350530lFT) C08FF.LIZ(EnumC1350530lFT.class, str);
    }

    public EnumC1350530lFT(String str, int i, int i2) {
        this.LL = i2;
    }
}
