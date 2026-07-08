package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cGh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1005330cGh {
    public static final EnumC1005330cGh AD_EXTRA_DATA;
    public static final EnumC1005330cGh AI_AGENT_CONFIG;
    public static final EnumC1005330cGh COMPONENT_TYPE;
    public static final EnumC1005330cGh CROUTER_JUMP_MODEL;
    public static final EnumC1005330cGh C_ROUTER_ENABLE;
    public static final EnumC1005330cGh ENTER_FROM;
    public static final EnumC1005330cGh FIXED_REFER;
    public static final EnumC1005330cGh FIXED_TAG;
    public static final /* synthetic */ EnumC1005330cGh[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1005330cGh REFER;
    public static final EnumC1005330cGh REPORT_CLICK;
    public static final EnumC1005330cGh TAG;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1005330cGh> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1005330cGh enumC1005330cGh = new EnumC1005330cGh("ENTER_FROM", 0, "enterFrom");
        ENTER_FROM = enumC1005330cGh;
        EnumC1005330cGh enumC1005330cGh2 = new EnumC1005330cGh("AI_AGENT_CONFIG", 1, "ai_agent_config");
        AI_AGENT_CONFIG = enumC1005330cGh2;
        EnumC1005330cGh enumC1005330cGh3 = new EnumC1005330cGh("CROUTER_JUMP_MODEL", 2, "crouter_jump_model");
        CROUTER_JUMP_MODEL = enumC1005330cGh3;
        EnumC1005330cGh enumC1005330cGh4 = new EnumC1005330cGh("REFER", 3, "refer");
        REFER = enumC1005330cGh4;
        EnumC1005330cGh enumC1005330cGh5 = new EnumC1005330cGh("TAG", 4, "tag");
        TAG = enumC1005330cGh5;
        EnumC1005330cGh enumC1005330cGh6 = new EnumC1005330cGh("AD_EXTRA_DATA", 5, "ad_extra_data_map");
        AD_EXTRA_DATA = enumC1005330cGh6;
        EnumC1005330cGh enumC1005330cGh7 = new EnumC1005330cGh("REPORT_CLICK", 6, "reportClick");
        REPORT_CLICK = enumC1005330cGh7;
        EnumC1005330cGh enumC1005330cGh8 = new EnumC1005330cGh("C_ROUTER_ENABLE", 7, "enable_c_router");
        C_ROUTER_ENABLE = enumC1005330cGh8;
        EnumC1005330cGh enumC1005330cGh9 = new EnumC1005330cGh("COMPONENT_TYPE", 8, "component_type");
        COMPONENT_TYPE = enumC1005330cGh9;
        EnumC1005330cGh enumC1005330cGh10 = new EnumC1005330cGh("FIXED_TAG", 9, "fixed_tag");
        FIXED_TAG = enumC1005330cGh10;
        EnumC1005330cGh enumC1005330cGh11 = new EnumC1005330cGh("FIXED_REFER", 10, "fixed_refer");
        FIXED_REFER = enumC1005330cGh11;
        EnumC1005330cGh[] enumC1005330cGhArr = {enumC1005330cGh, enumC1005330cGh2, enumC1005330cGh3, enumC1005330cGh4, enumC1005330cGh5, enumC1005330cGh6, enumC1005330cGh7, enumC1005330cGh8, enumC1005330cGh9, enumC1005330cGh10, enumC1005330cGh11};
        LLILLJJLI = enumC1005330cGhArr;
        LLILLL = new C2254308sP(enumC1005330cGhArr);
    }

    public static EnumC1005330cGh[] values() {
        return (EnumC1005330cGh[]) LLILLJJLI.clone();
    }

    public final String getRName() {
        return this.LL;
    }

    public static EnumC1005330cGh valueOf(String str) {
        return (EnumC1005330cGh) C08FF.LIZ(EnumC1005330cGh.class, str);
    }

    public EnumC1005330cGh(String str, int i, String str2) {
        this.LL = str2;
    }
}
