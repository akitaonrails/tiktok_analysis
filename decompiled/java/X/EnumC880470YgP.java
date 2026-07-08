package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0YgP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC880470YgP {
    public static final EnumC880470YgP HIGHLY_ENGAGED_FOLLOWER;
    public static final EnumC880470YgP HIGH_LEVEL_MEMBER;
    public static final EnumC880470YgP LIVE_GIFTER;
    public static final /* synthetic */ EnumC880470YgP[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public static final EnumC880470YgP LONG_TIME_FOLLOWER;
    public static final EnumC880470YgP MAF;
    public static final EnumC880470YgP ONE_WAY_FOLLOWER;
    public static final EnumC880470YgP SHOP_CUSTOMER;
    public static final EnumC880470YgP SUBSCRIBER;
    public static final EnumC880470YgP WITH_MUTUAL_FRIEND;
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;

    public static InterfaceC2044707zh<EnumC880470YgP> getEntries() {
        return LLILZIL;
    }

    static {
        EnumC880470YgP enumC880470YgP = new EnumC880470YgP("ONE_WAY_FOLLOWER", 0, "one_way_follower", "filter_one_way_follower", "one_way_follower");
        ONE_WAY_FOLLOWER = enumC880470YgP;
        EnumC880470YgP enumC880470YgP2 = new EnumC880470YgP("SUBSCRIBER", 1, "subscriber", "filter_subscriber", "subscriber");
        SUBSCRIBER = enumC880470YgP2;
        EnumC880470YgP enumC880470YgP3 = new EnumC880470YgP("HIGH_LEVEL_MEMBER", 2, "fans_level", "filter_high_level_member", "high_level_member");
        HIGH_LEVEL_MEMBER = enumC880470YgP3;
        EnumC880470YgP enumC880470YgP4 = new EnumC880470YgP("LONG_TIME_FOLLOWER", 3, "follower_year", "filter_long_time_follower", "long_time_follower");
        LONG_TIME_FOLLOWER = enumC880470YgP4;
        EnumC880470YgP enumC880470YgP5 = new EnumC880470YgP("WITH_MUTUAL_FRIEND", 4, "shared_mutual_friends", "filter_with_mutual_friend", "with_mutual_friend");
        WITH_MUTUAL_FRIEND = enumC880470YgP5;
        EnumC880470YgP enumC880470YgP6 = new EnumC880470YgP("LIVE_GIFTER", 5, "live_gifter", "", "live_gifter");
        LIVE_GIFTER = enumC880470YgP6;
        EnumC880470YgP enumC880470YgP7 = new EnumC880470YgP("SHOP_CUSTOMER", 6, "shop_customer", "", "tts_customer");
        SHOP_CUSTOMER = enumC880470YgP7;
        EnumC880470YgP enumC880470YgP8 = new EnumC880470YgP("HIGHLY_ENGAGED_FOLLOWER", 7, "highly_engaged_follower", "", "engaged_follower");
        HIGHLY_ENGAGED_FOLLOWER = enumC880470YgP8;
        EnumC880470YgP enumC880470YgP9 = new EnumC880470YgP("MAF", 8, "maf", "", "people_you_may_know");
        MAF = enumC880470YgP9;
        EnumC880470YgP[] enumC880470YgPArr = {enumC880470YgP, enumC880470YgP2, enumC880470YgP3, enumC880470YgP4, enumC880470YgP5, enumC880470YgP6, enumC880470YgP7, enumC880470YgP8, enumC880470YgP9};
        LLILZ = enumC880470YgPArr;
        LLILZIL = new C2254308sP(enumC880470YgPArr);
    }

    public static EnumC880470YgP[] values() {
        return (EnumC880470YgP[]) LLILZ.clone();
    }

    public final String getLabelMobValue() {
        return this.LLILLL;
    }

    public final String getSerializedName() {
        return this.LL;
    }

    public final String getTabNameMobValue() {
        return this.LLILLJJLI;
    }

    public static EnumC880470YgP valueOf(String str) {
        return (EnumC880470YgP) C08FF.LIZ(EnumC880470YgP.class, str);
    }

    public EnumC880470YgP(String str, int i, String str2, String str3, String str4) {
        this.LL = str2;
        this.LLILLJJLI = str3;
        this.LLILLL = str4;
    }
}
