package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mlk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1408980mlk {
    public static final EnumC1408980mlk BIZ_CASE_ID;
    public static final EnumC1408980mlk FIRST_INSTALL;
    public static final EnumC1408980mlk IS_EXPERIMENT_ON;
    public static final EnumC1408980mlk IS_SUCCESS;
    public static final /* synthetic */ EnumC1408980mlk[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1408980mlk OLD_POLICY_URL;
    public static final EnumC1408980mlk POLICY_KEY;
    public static final EnumC1408980mlk POLICY_URL;
    public static final EnumC1408980mlk REQUEST_TYPE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1408980mlk> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1408980mlk enumC1408980mlk = new EnumC1408980mlk("BIZ_CASE_ID", 0, "biz_case");
        BIZ_CASE_ID = enumC1408980mlk;
        EnumC1408980mlk enumC1408980mlk2 = new EnumC1408980mlk("POLICY_KEY", 1, "policy_key");
        POLICY_KEY = enumC1408980mlk2;
        EnumC1408980mlk enumC1408980mlk3 = new EnumC1408980mlk("POLICY_URL", 2, "policy_url");
        POLICY_URL = enumC1408980mlk3;
        EnumC1408980mlk enumC1408980mlk4 = new EnumC1408980mlk("OLD_POLICY_URL", 3, "old_policy_url");
        OLD_POLICY_URL = enumC1408980mlk4;
        EnumC1408980mlk enumC1408980mlk5 = new EnumC1408980mlk("IS_SUCCESS", 4, "is_success");
        IS_SUCCESS = enumC1408980mlk5;
        EnumC1408980mlk enumC1408980mlk6 = new EnumC1408980mlk("IS_EXPERIMENT_ON", 5, "is_experiment");
        IS_EXPERIMENT_ON = enumC1408980mlk6;
        EnumC1408980mlk enumC1408980mlk7 = new EnumC1408980mlk("FIRST_INSTALL", 6, "is_first_install");
        FIRST_INSTALL = enumC1408980mlk7;
        EnumC1408980mlk enumC1408980mlk8 = new EnumC1408980mlk("REQUEST_TYPE", 7, "request_type");
        REQUEST_TYPE = enumC1408980mlk8;
        EnumC1408980mlk[] enumC1408980mlkArr = {enumC1408980mlk, enumC1408980mlk2, enumC1408980mlk3, enumC1408980mlk4, enumC1408980mlk5, enumC1408980mlk6, enumC1408980mlk7, enumC1408980mlk8};
        LLILLJJLI = enumC1408980mlkArr;
        LLILLL = new C2254308sP(enumC1408980mlkArr);
    }

    public static EnumC1408980mlk[] values() {
        return (EnumC1408980mlk[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1408980mlk valueOf(String str) {
        return (EnumC1408980mlk) C08FF.LIZ(EnumC1408980mlk.class, str);
    }

    public EnumC1408980mlk(String str, int i, String str2) {
        this.LL = str2;
    }
}
