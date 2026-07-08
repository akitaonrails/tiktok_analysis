package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rM8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1585300rM8 {
    public static final EnumC1585300rM8 ERROR_REASON;
    public static final EnumC1585300rM8 ERROR_STAGE;
    public static final EnumC1585300rM8 ERROR_TAB_PART;
    public static final EnumC1585300rM8 FCP_ORIGIN_DATA;
    public static final EnumC1585300rM8 HIT_FCP_TAB_EXP;
    public static final /* synthetic */ EnumC1585300rM8[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1585300rM8 OPERATION_TYPE;
    public static final EnumC1585300rM8 TAB_DUPLICATE_LOG;
    public static final EnumC1585300rM8 USE_FCP_SUCCESS;
    public static final EnumC1585300rM8 USE_PRELOAD_SUCCESS;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1585300rM8> getEntries() {
        return LLILZ;
    }

    static {
        EnumC1585300rM8 enumC1585300rM8 = new EnumC1585300rM8("ERROR_REASON", 0, 1, "error_reason");
        ERROR_REASON = enumC1585300rM8;
        EnumC1585300rM8 enumC1585300rM82 = new EnumC1585300rM8("ERROR_STAGE", 1, 2, "error_stage");
        ERROR_STAGE = enumC1585300rM82;
        EnumC1585300rM8 enumC1585300rM83 = new EnumC1585300rM8("FCP_ORIGIN_DATA", 2, 3, "fcp_origin_data");
        FCP_ORIGIN_DATA = enumC1585300rM83;
        EnumC1585300rM8 enumC1585300rM84 = new EnumC1585300rM8("ERROR_TAB_PART", 3, 5, "error_tab_part");
        ERROR_TAB_PART = enumC1585300rM84;
        EnumC1585300rM8 enumC1585300rM85 = new EnumC1585300rM8("OPERATION_TYPE", 4, 6, "operation_type");
        OPERATION_TYPE = enumC1585300rM85;
        EnumC1585300rM8 enumC1585300rM86 = new EnumC1585300rM8("USE_FCP_SUCCESS", 5, 7, "use_fcp_success");
        USE_FCP_SUCCESS = enumC1585300rM86;
        EnumC1585300rM8 enumC1585300rM87 = new EnumC1585300rM8("USE_PRELOAD_SUCCESS", 6, 8, "use_preload_success");
        USE_PRELOAD_SUCCESS = enumC1585300rM87;
        EnumC1585300rM8 enumC1585300rM88 = new EnumC1585300rM8("HIT_FCP_TAB_EXP", 7, 9, "hit_fcp_tab_exp");
        HIT_FCP_TAB_EXP = enumC1585300rM88;
        EnumC1585300rM8 enumC1585300rM89 = new EnumC1585300rM8("TAB_DUPLICATE_LOG", 8, 14, "tab_duplicate_log");
        TAB_DUPLICATE_LOG = enumC1585300rM89;
        EnumC1585300rM8[] enumC1585300rM8Arr = {enumC1585300rM8, enumC1585300rM82, enumC1585300rM83, enumC1585300rM84, enumC1585300rM85, enumC1585300rM86, enumC1585300rM87, enumC1585300rM88, enumC1585300rM89};
        LLILLL = enumC1585300rM8Arr;
        LLILZ = new C2254308sP(enumC1585300rM8Arr);
    }

    public static EnumC1585300rM8[] values() {
        return (EnumC1585300rM8[]) LLILLL.clone();
    }

    public final String getCateGoryStr() {
        return this.LLILLJJLI;
    }

    public final int getCategoryCode() {
        return this.LL;
    }

    public static EnumC1585300rM8 valueOf(String str) {
        return (EnumC1585300rM8) C08FF.LIZ(EnumC1585300rM8.class, str);
    }

    public EnumC1585300rM8(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
