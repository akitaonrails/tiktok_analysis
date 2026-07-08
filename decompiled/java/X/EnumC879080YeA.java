package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0YeA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC879080YeA {
    public static final EnumC879080YeA AD;
    public static final EnumC879080YeA FILTERED_MSG;
    public static final EnumC879080YeA LEAD;
    public static final /* synthetic */ EnumC879080YeA[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC879080YeA MESSAGE_REQUEST_SPAM;
    public static final EnumC879080YeA PRIMARY;
    public static final EnumC879080YeA SECONDARY;
    public static final EnumC879080YeA SPAM;
    public static final EnumC879080YeA STARRED;
    public final String LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC879080YeA> getEntries() {
        return LLILZ;
    }

    static {
        EnumC879080YeA enumC879080YeA = new EnumC879080YeA("PRIMARY", 0, "_primary_", "primary");
        PRIMARY = enumC879080YeA;
        EnumC879080YeA enumC879080YeA2 = new EnumC879080YeA("SECONDARY", 1, "_secondary_", "secondary");
        SECONDARY = enumC879080YeA2;
        EnumC879080YeA enumC879080YeA3 = new EnumC879080YeA("SPAM", 2, "_spam_", "spam");
        SPAM = enumC879080YeA3;
        EnumC879080YeA enumC879080YeA4 = new EnumC879080YeA("FILTERED_MSG", 3, "_filtered_", "filtered_msg");
        FILTERED_MSG = enumC879080YeA4;
        EnumC879080YeA enumC879080YeA5 = new EnumC879080YeA("STARRED", 4, "_starred_", "starred");
        STARRED = enumC879080YeA5;
        EnumC879080YeA enumC879080YeA6 = new EnumC879080YeA("LEAD", 5, "_lead_", "lead");
        LEAD = enumC879080YeA6;
        EnumC879080YeA enumC879080YeA7 = new EnumC879080YeA("AD", 6, "_ad_", "ad");
        AD = enumC879080YeA7;
        EnumC879080YeA enumC879080YeA8 = new EnumC879080YeA("MESSAGE_REQUEST_SPAM", 7, "_message_request_spam_", "message_request_spam");
        MESSAGE_REQUEST_SPAM = enumC879080YeA8;
        EnumC879080YeA[] enumC879080YeAArr = {enumC879080YeA, enumC879080YeA2, enumC879080YeA3, enumC879080YeA4, enumC879080YeA5, enumC879080YeA6, enumC879080YeA7, enumC879080YeA8};
        LLILLL = enumC879080YeAArr;
        LLILZ = new C2254308sP(enumC879080YeAArr);
    }

    public static EnumC879080YeA[] values() {
        return (EnumC879080YeA[]) LLILLL.clone();
    }

    public final String getFuzzyMatchStrForLegacyQuery() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('\\');
        sbLIZ.append(this.LL.substring(0, r2.length() - 1));
        sbLIZ.append("\\_");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getMobValue() {
        return this.LLILLJJLI;
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC879080YeA valueOf(String str) {
        return (EnumC879080YeA) C08FF.LIZ(EnumC879080YeA.class, str);
    }

    public EnumC879080YeA(String str, int i, String str2, String str3) {
        this.LL = str2;
        this.LLILLJJLI = str3;
    }
}
