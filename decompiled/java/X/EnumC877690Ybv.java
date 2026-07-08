package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ybv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC877690Ybv {
    public static final EnumC877690Ybv ACCEPT_RATE;
    public static final EnumC877690Ybv COLLABORATION_INVITES;
    public static final C877700Ybw Companion;
    public static final EnumC877690Ybv FOLLOWER_NUM;
    public static final /* synthetic */ EnumC877690Ybv[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC877690Ybv MOCK_ACCEPT_RATE_BY_LABEL;
    public static final EnumC877690Ybv PENDING_CLIENT_AI_INIT;
    public static final EnumC877690Ybv POTENTIAL_PAID_OFFERS;
    public static final EnumC877690Ybv PRIORITY_SCORE;
    public static final EnumC877690Ybv PRIORITY_SHOW_COUNT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC877690Ybv> getEntries() {
        return LLILLL;
    }

    static {
        EnumC877690Ybv enumC877690Ybv = new EnumC877690Ybv("FOLLOWER_NUM", 0, "message_request_follower_num");
        FOLLOWER_NUM = enumC877690Ybv;
        EnumC877690Ybv enumC877690Ybv2 = new EnumC877690Ybv("PRIORITY_SCORE", 1, "message_request_priority_score");
        PRIORITY_SCORE = enumC877690Ybv2;
        EnumC877690Ybv enumC877690Ybv3 = new EnumC877690Ybv("ACCEPT_RATE", 2, "message_request_accept_rate");
        ACCEPT_RATE = enumC877690Ybv3;
        EnumC877690Ybv enumC877690Ybv4 = new EnumC877690Ybv("MOCK_ACCEPT_RATE_BY_LABEL", 3, "mock_accept_rate_by_label");
        MOCK_ACCEPT_RATE_BY_LABEL = enumC877690Ybv4;
        EnumC877690Ybv enumC877690Ybv5 = new EnumC877690Ybv("POTENTIAL_PAID_OFFERS", 4, "potential_paid_offers");
        POTENTIAL_PAID_OFFERS = enumC877690Ybv5;
        EnumC877690Ybv enumC877690Ybv6 = new EnumC877690Ybv("COLLABORATION_INVITES", 5, "collaboration_invites");
        COLLABORATION_INVITES = enumC877690Ybv6;
        EnumC877690Ybv enumC877690Ybv7 = new EnumC877690Ybv("PRIORITY_SHOW_COUNT", 6, "message_request_priority_show_count");
        PRIORITY_SHOW_COUNT = enumC877690Ybv7;
        EnumC877690Ybv enumC877690Ybv8 = new EnumC877690Ybv("PENDING_CLIENT_AI_INIT", 7, "message_request_pending_client_ai_init");
        PENDING_CLIENT_AI_INIT = enumC877690Ybv8;
        EnumC877690Ybv[] enumC877690YbvArr = {enumC877690Ybv, enumC877690Ybv2, enumC877690Ybv3, enumC877690Ybv4, enumC877690Ybv5, enumC877690Ybv6, enumC877690Ybv7, enumC877690Ybv8};
        LLILLJJLI = enumC877690YbvArr;
        LLILLL = new C2254308sP(enumC877690YbvArr);
        Companion = new C877700Ybw();
    }

    public static EnumC877690Ybv[] values() {
        return (EnumC877690Ybv[]) LLILLJJLI.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    public static EnumC877690Ybv valueOf(String str) {
        return (EnumC877690Ybv) C08FF.LIZ(EnumC877690Ybv.class, str);
    }

    public EnumC877690Ybv(String str, int i, String str2) {
        this.LL = str2;
    }
}
