package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.156t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC204669156t {
    public static final EnumC204669156t ANCHOR_FILTER;
    public static final EnumC204669156t FCP_AVOID;
    public static final EnumC204669156t FCP_FILTER_INVALID;
    public static final /* synthetic */ EnumC204669156t[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC204669156t NO_FILTER;
    public static final EnumC204669156t SERVER_DATA;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC204669156t> getEntries() {
        return LLILZ;
    }

    static {
        EnumC204669156t enumC204669156t = new EnumC204669156t("SERVER_DATA", 0, 0, "anchor_server_data_status");
        SERVER_DATA = enumC204669156t;
        EnumC204669156t enumC204669156t2 = new EnumC204669156t("FCP_FILTER_INVALID", 1, 1, "anchor_fcp_filter_invalid_status");
        FCP_FILTER_INVALID = enumC204669156t2;
        EnumC204669156t enumC204669156t3 = new EnumC204669156t("ANCHOR_FILTER", 2, 2, "anchor_filter_status");
        ANCHOR_FILTER = enumC204669156t3;
        EnumC204669156t enumC204669156t4 = new EnumC204669156t("FCP_AVOID", 3, 3, "anchor_fcp_avoid_status");
        FCP_AVOID = enumC204669156t4;
        EnumC204669156t enumC204669156t5 = new EnumC204669156t("NO_FILTER", 4, -1, "");
        NO_FILTER = enumC204669156t5;
        EnumC204669156t[] enumC204669156tArr = {enumC204669156t, enumC204669156t2, enumC204669156t3, enumC204669156t4, enumC204669156t5};
        LLILLL = enumC204669156tArr;
        LLILZ = new C2254308sP(enumC204669156tArr);
    }

    public static EnumC204669156t[] values() {
        return (EnumC204669156t[]) LLILLL.clone();
    }

    public final String getStepName() {
        return this.LLILLJJLI;
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC204669156t valueOf(String str) {
        return (EnumC204669156t) C08FF.LIZ(EnumC204669156t.class, str);
    }

    public EnumC204669156t(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
