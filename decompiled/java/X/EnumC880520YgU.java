package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0YgU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC880520YgU {
    public static final EnumC880520YgU AI_REPLIED;
    public static final EnumC880520YgU ALL;
    public static final EnumC880520YgU ALL_WITHOUT_STORY_REACTIONS;
    public static final EnumC880520YgU BUSINESS;
    public static final EnumC880520YgU CREATOR;
    public static final EnumC880520YgU HIGH_LEVEL_MEMBER;
    public static final /* synthetic */ EnumC880520YgU[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC880520YgU LONG_TIME_FOLLOWER;
    public static final EnumC880520YgU MESSAGE_REQUEST_SPAM;
    public static final EnumC880520YgU NEW_FOLLOWER;
    public static final EnumC880520YgU ONE_WAY_FOLLOWER;
    public static final EnumC880520YgU PRIORITY;
    public static final EnumC880520YgU RISKY;
    public static final EnumC880520YgU SUBSCRIBER;
    public static final EnumC880520YgU WITH_MUTUAL_FRIEND;
    public final String LL;

    public static InterfaceC2044707zh<EnumC880520YgU> getEntries() {
        return LLILLL;
    }

    static {
        EnumC880520YgU enumC880520YgU = new EnumC880520YgU("ALL", 0, "filter_all");
        ALL = enumC880520YgU;
        EnumC880520YgU enumC880520YgU2 = new EnumC880520YgU("ALL_WITHOUT_STORY_REACTIONS", 1, "filter_all");
        ALL_WITHOUT_STORY_REACTIONS = enumC880520YgU2;
        EnumC880520YgU enumC880520YgU3 = new EnumC880520YgU("PRIORITY", 2, "filter_all");
        PRIORITY = enumC880520YgU3;
        EnumC880520YgU enumC880520YgU4 = new EnumC880520YgU("RISKY", 3, null);
        RISKY = enumC880520YgU4;
        EnumC880520YgU enumC880520YgU5 = new EnumC880520YgU("MESSAGE_REQUEST_SPAM", 4, "message_request_spam");
        MESSAGE_REQUEST_SPAM = enumC880520YgU5;
        EnumC880520YgU enumC880520YgU6 = new EnumC880520YgU("BUSINESS", 5, "filter_business");
        BUSINESS = enumC880520YgU6;
        EnumC880520YgU enumC880520YgU7 = new EnumC880520YgU("CREATOR", 6, "filter_creator");
        CREATOR = enumC880520YgU7;
        EnumC880520YgU enumC880520YgU8 = new EnumC880520YgU("SUBSCRIBER", 7, EnumC880470YgP.SUBSCRIBER.getTabNameMobValue());
        SUBSCRIBER = enumC880520YgU8;
        EnumC880520YgU enumC880520YgU9 = new EnumC880520YgU("HIGH_LEVEL_MEMBER", 8, EnumC880470YgP.HIGH_LEVEL_MEMBER.getTabNameMobValue());
        HIGH_LEVEL_MEMBER = enumC880520YgU9;
        EnumC880520YgU enumC880520YgU10 = new EnumC880520YgU("LONG_TIME_FOLLOWER", 9, EnumC880470YgP.LONG_TIME_FOLLOWER.getTabNameMobValue());
        LONG_TIME_FOLLOWER = enumC880520YgU10;
        EnumC880520YgU enumC880520YgU11 = new EnumC880520YgU("ONE_WAY_FOLLOWER", 10, EnumC880470YgP.ONE_WAY_FOLLOWER.getTabNameMobValue());
        ONE_WAY_FOLLOWER = enumC880520YgU11;
        EnumC880520YgU enumC880520YgU12 = new EnumC880520YgU("WITH_MUTUAL_FRIEND", 11, EnumC880470YgP.WITH_MUTUAL_FRIEND.getTabNameMobValue());
        WITH_MUTUAL_FRIEND = enumC880520YgU12;
        EnumC880520YgU enumC880520YgU13 = new EnumC880520YgU("NEW_FOLLOWER", 12, "filter_follower");
        NEW_FOLLOWER = enumC880520YgU13;
        EnumC880520YgU enumC880520YgU14 = new EnumC880520YgU("AI_REPLIED", 13, "filter_ai_reply");
        AI_REPLIED = enumC880520YgU14;
        EnumC880520YgU[] enumC880520YgUArr = {enumC880520YgU, enumC880520YgU2, enumC880520YgU3, enumC880520YgU4, enumC880520YgU5, enumC880520YgU6, enumC880520YgU7, enumC880520YgU8, enumC880520YgU9, enumC880520YgU10, enumC880520YgU11, enumC880520YgU12, enumC880520YgU13, enumC880520YgU14};
        LLILLJJLI = enumC880520YgUArr;
        LLILLL = new C2254308sP(enumC880520YgUArr);
    }

    public static EnumC880520YgU[] values() {
        return (EnumC880520YgU[]) LLILLJJLI.clone();
    }

    public final String getMobValue() {
        return this.LL;
    }

    public static EnumC880520YgU valueOf(String str) {
        return (EnumC880520YgU) C08FF.LIZ(EnumC880520YgU.class, str);
    }

    public EnumC880520YgU(String str, int i, String str2) {
        this.LL = str2;
    }
}
