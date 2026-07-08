package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DdV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC343590DdV {
    public static final EnumC343590DdV CLIENT_DIFF_FILTER_RULES;
    public static final EnumC343590DdV CLIENT_FCP_CONFIG_INVALID;
    public static final EnumC343590DdV CLIENT_TAB_FRAMEWORK_BACKUP;
    public static final EnumC343590DdV CLIENT_TAB_FRAMEWORK_XTAB;
    public static final /* synthetic */ EnumC343590DdV[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC343590DdV NEW_USER;
    public static final EnumC343590DdV NEW_USER_SECOND_LAUNCH;
    public static final EnumC343590DdV SERVER_DIFF_FILTER_RULES;
    public static final EnumC343590DdV SERVER_HIT_DIFF_TAB_EXPERIMENT_BY_ACCOUNT;
    public static final EnumC343590DdV SERVER_HIT_DIFF_TAB_EXPERIMENT_BY_DIFF_CONDITIONS;
    public static final EnumC343590DdV SERVER_HIT_DIFF_TAB_EXPERIMENT_BY_OTHER;
    public static final EnumC343590DdV SERVER_OTHER;
    public static final EnumC343590DdV SERVER_TAB_FRAMEWORK_PERSONALIZE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC343590DdV> getEntries() {
        return LLILLL;
    }

    static {
        EnumC343590DdV enumC343590DdV = new EnumC343590DdV("NEW_USER", 0, "new_user");
        NEW_USER = enumC343590DdV;
        EnumC343590DdV enumC343590DdV2 = new EnumC343590DdV("SERVER_HIT_DIFF_TAB_EXPERIMENT_BY_DIFF_CONDITIONS", 1, "server_hit_diff_tab_experiment_by_diff_conditions");
        SERVER_HIT_DIFF_TAB_EXPERIMENT_BY_DIFF_CONDITIONS = enumC343590DdV2;
        EnumC343590DdV enumC343590DdV3 = new EnumC343590DdV("SERVER_HIT_DIFF_TAB_EXPERIMENT_BY_ACCOUNT", 2, "server_hit_diff_tab_experiment_by_account");
        SERVER_HIT_DIFF_TAB_EXPERIMENT_BY_ACCOUNT = enumC343590DdV3;
        EnumC343590DdV enumC343590DdV4 = new EnumC343590DdV("SERVER_HIT_DIFF_TAB_EXPERIMENT_BY_OTHER", 3, "server_hit_diff_tab_experiment_by_other");
        SERVER_HIT_DIFF_TAB_EXPERIMENT_BY_OTHER = enumC343590DdV4;
        EnumC343590DdV enumC343590DdV5 = new EnumC343590DdV("SERVER_TAB_FRAMEWORK_PERSONALIZE", 4, "server_tab_framework_personalize");
        SERVER_TAB_FRAMEWORK_PERSONALIZE = enumC343590DdV5;
        EnumC343590DdV enumC343590DdV6 = new EnumC343590DdV("SERVER_OTHER", 5, "server_other");
        SERVER_OTHER = enumC343590DdV6;
        EnumC343590DdV enumC343590DdV7 = new EnumC343590DdV("SERVER_DIFF_FILTER_RULES", 6, "server_diff_filter_rules");
        SERVER_DIFF_FILTER_RULES = enumC343590DdV7;
        EnumC343590DdV enumC343590DdV8 = new EnumC343590DdV("CLIENT_FCP_CONFIG_INVALID", 7, "client_fcp_config_invalid");
        CLIENT_FCP_CONFIG_INVALID = enumC343590DdV8;
        EnumC343590DdV enumC343590DdV9 = new EnumC343590DdV("CLIENT_DIFF_FILTER_RULES", 8, "client_diff_filter_rules");
        CLIENT_DIFF_FILTER_RULES = enumC343590DdV9;
        EnumC343590DdV enumC343590DdV10 = new EnumC343590DdV("CLIENT_TAB_FRAMEWORK_BACKUP", 9, "client_tab_framework_backup");
        CLIENT_TAB_FRAMEWORK_BACKUP = enumC343590DdV10;
        EnumC343590DdV enumC343590DdV11 = new EnumC343590DdV("CLIENT_TAB_FRAMEWORK_XTAB", 10, "client_tab_framework_xtab");
        CLIENT_TAB_FRAMEWORK_XTAB = enumC343590DdV11;
        EnumC343590DdV enumC343590DdV12 = new EnumC343590DdV("NEW_USER_SECOND_LAUNCH", 11, "new_user_second_launch");
        NEW_USER_SECOND_LAUNCH = enumC343590DdV12;
        EnumC343590DdV[] enumC343590DdVArr = {enumC343590DdV, enumC343590DdV2, enumC343590DdV3, enumC343590DdV4, enumC343590DdV5, enumC343590DdV6, enumC343590DdV7, enumC343590DdV8, enumC343590DdV9, enumC343590DdV10, enumC343590DdV11, enumC343590DdV12};
        LLILLJJLI = enumC343590DdVArr;
        LLILLL = new C2254308sP(enumC343590DdVArr);
    }

    public static EnumC343590DdV[] values() {
        return (EnumC343590DdV[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC343590DdV valueOf(String str) {
        return (EnumC343590DdV) C08FF.LIZ(EnumC343590DdV.class, str);
    }

    public EnumC343590DdV(String str, int i, String str2) {
        this.LL = str2;
    }
}
