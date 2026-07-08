package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0YeL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC879190YeL {
    public static final EnumC879190YeL AGGREGATED_MESSAGE_REQUEST;
    public static final EnumC879190YeL AGGREGATED_MULTI_CONVERSATION;
    public static final EnumC879190YeL AGGREGATED_SINGLE_CONVERSATION;
    public static final /* synthetic */ EnumC879190YeL[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC879190YeL SINGLE_MESSAGE;
    public static final EnumC879190YeL SINGLE_PROPERTY;
    public static final EnumC879190YeL SINGLE_TCM;
    public static final EnumC879190YeL SINGLE_TIP;
    public static final EnumC879190YeL UNKNOWN;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC879190YeL> getEntries() {
        return LLILZ;
    }

    static {
        EnumC879190YeL enumC879190YeL = new EnumC879190YeL("UNKNOWN", 0, 0, "unknown");
        UNKNOWN = enumC879190YeL;
        EnumC879190YeL enumC879190YeL2 = new EnumC879190YeL("SINGLE_MESSAGE", 1, 1, "single_msg");
        SINGLE_MESSAGE = enumC879190YeL2;
        EnumC879190YeL enumC879190YeL3 = new EnumC879190YeL("SINGLE_TIP", 2, 2, "tip");
        SINGLE_TIP = enumC879190YeL3;
        EnumC879190YeL enumC879190YeL4 = new EnumC879190YeL("SINGLE_PROPERTY", 3, 3, "property");
        SINGLE_PROPERTY = enumC879190YeL4;
        EnumC879190YeL enumC879190YeL5 = new EnumC879190YeL("SINGLE_TCM", 4, 4, "tcm");
        SINGLE_TCM = enumC879190YeL5;
        EnumC879190YeL enumC879190YeL6 = new EnumC879190YeL("AGGREGATED_SINGLE_CONVERSATION", 5, 5, "aggregated_single_conv");
        AGGREGATED_SINGLE_CONVERSATION = enumC879190YeL6;
        EnumC879190YeL enumC879190YeL7 = new EnumC879190YeL("AGGREGATED_MULTI_CONVERSATION", 6, 6, "aggregated_multi_conv");
        AGGREGATED_MULTI_CONVERSATION = enumC879190YeL7;
        EnumC879190YeL enumC879190YeL8 = new EnumC879190YeL("AGGREGATED_MESSAGE_REQUEST", 7, 7, "aggregated_message_request");
        AGGREGATED_MESSAGE_REQUEST = enumC879190YeL8;
        EnumC879190YeL[] enumC879190YeLArr = {enumC879190YeL, enumC879190YeL2, enumC879190YeL3, enumC879190YeL4, enumC879190YeL5, enumC879190YeL6, enumC879190YeL7, enumC879190YeL8};
        LLILLL = enumC879190YeLArr;
        LLILZ = new C2254308sP(enumC879190YeLArr);
    }

    public static EnumC879190YeL[] values() {
        return (EnumC879190YeL[]) LLILLL.clone();
    }

    public final String getMobValue() {
        return this.LLILLJJLI;
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC879190YeL valueOf(String str) {
        return (EnumC879190YeL) C08FF.LIZ(EnumC879190YeL.class, str);
    }

    public EnumC879190YeL(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
