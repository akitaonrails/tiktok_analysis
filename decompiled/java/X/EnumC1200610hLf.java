package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hLf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1200610hLf {
    public static final EnumC1200610hLf ACCOUNT_BAN;
    public static final EnumC1200610hLf CLAIM_COUNT_LIMIT;
    public static final C1200730hLr Companion;
    public static final /* synthetic */ EnumC1200610hLf[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1200610hLf NOT_IN_EXPERIMENT;
    public static final EnumC1200610hLf POI_HAS_CLAIMED;
    public static final EnumC1200610hLf POI_IS_B_END;
    public static final EnumC1200610hLf REDUNDANT_SUBMIT;
    public static final EnumC1200610hLf SUCCESS;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1200610hLf> getEntries() {
        return LLILZ;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0hLr] */
    static {
        EnumC1200610hLf enumC1200610hLf = new EnumC1200610hLf("SUCCESS", 0, 0, null);
        SUCCESS = enumC1200610hLf;
        EnumC1200610hLf enumC1200610hLf2 = new EnumC1200610hLf("CLAIM_COUNT_LIMIT", 1, 9001, "claim_count_limit");
        CLAIM_COUNT_LIMIT = enumC1200610hLf2;
        EnumC1200610hLf enumC1200610hLf3 = new EnumC1200610hLf("POI_HAS_CLAIMED", 2, 9002, "poi_has_claimed");
        POI_HAS_CLAIMED = enumC1200610hLf3;
        EnumC1200610hLf enumC1200610hLf4 = new EnumC1200610hLf("POI_IS_B_END", 3, 9003, "poi_is_b_end");
        POI_IS_B_END = enumC1200610hLf4;
        EnumC1200610hLf enumC1200610hLf5 = new EnumC1200610hLf("ACCOUNT_BAN", 4, 9004, "account_ban");
        ACCOUNT_BAN = enumC1200610hLf5;
        EnumC1200610hLf enumC1200610hLf6 = new EnumC1200610hLf("REDUNDANT_SUBMIT", 5, 9006, "redundant_submit");
        REDUNDANT_SUBMIT = enumC1200610hLf6;
        EnumC1200610hLf enumC1200610hLf7 = new EnumC1200610hLf("NOT_IN_EXPERIMENT", 6, 9008, "not_in_experiment");
        NOT_IN_EXPERIMENT = enumC1200610hLf7;
        EnumC1200610hLf[] enumC1200610hLfArr = {enumC1200610hLf, enumC1200610hLf2, enumC1200610hLf3, enumC1200610hLf4, enumC1200610hLf5, enumC1200610hLf6, enumC1200610hLf7};
        LLILLL = enumC1200610hLfArr;
        LLILZ = new C2254308sP(enumC1200610hLfArr);
        Companion = new Object() { // from class: X.0hLr
        };
    }

    public static EnumC1200610hLf[] values() {
        return (EnumC1200610hLf[]) LLILLL.clone();
    }

    public final String getErrorType() {
        return this.LLILLJJLI;
    }

    public final int getResultCode() {
        return this.LL;
    }

    public static EnumC1200610hLf valueOf(String str) {
        return (EnumC1200610hLf) C08FF.LIZ(EnumC1200610hLf.class, str);
    }

    public EnumC1200610hLf(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
