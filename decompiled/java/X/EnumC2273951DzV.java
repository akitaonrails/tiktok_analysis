package X;

/* JADX INFO: renamed from: X.1DzV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public enum EnumC2273951DzV {
    MAIN_BUSINESS("main_business_data_in_tools_line"),
    SOCIAL("social_data_in_tools_line"),
    COMMERCE("commerce_data_in_tools_line"),
    UG("ug_data_in_tools_line"),
    TECH("tech_data_in_tools_line"),
    GLOBAL("global_data_in_tools_line");

    public final String intentKey;

    public static EnumC2273951DzV valueOf(String str) {
        return (EnumC2273951DzV) C08FF.LIZ(EnumC2273951DzV.class, str);
    }

    EnumC2273951DzV(String str) {
        this.intentKey = str;
    }
}
