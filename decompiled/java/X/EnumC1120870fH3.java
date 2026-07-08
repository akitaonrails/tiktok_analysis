package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fH3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1120870fH3 {
    public static final EnumC1120870fH3 COLOR_GIFT;
    public static final EnumC1120870fH3 EVENT;
    public static final EnumC1120870fH3 FANS_CLUB_LEVEL_GIFT;
    public static final EnumC1120870fH3 FANS_CLUB_START_GIFT;
    public static final EnumC1120870fH3 GIFT_GUIDE;
    public static final /* synthetic */ EnumC1120870fH3[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1120870fH3 NONE;
    public static final EnumC1120870fH3 POPULARITY_RANKING_BONUS_TIME_BUBBLE_GUIDE;
    public static final EnumC1120870fH3 RANDOM_FIREWORKS;
    public static final EnumC1120870fH3 RANDOM_GIFT;
    public static final EnumC1120870fH3 UNLOCK;
    public static final EnumC1120870fH3 UNLOCK_TEAM_CHALLENGE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1120870fH3> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1120870fH3 enumC1120870fH3 = new EnumC1120870fH3("NONE", 0, "");
        NONE = enumC1120870fH3;
        EnumC1120870fH3 enumC1120870fH32 = new EnumC1120870fH3("UNLOCK", 1, "gift_unlock");
        UNLOCK = enumC1120870fH32;
        EnumC1120870fH3 enumC1120870fH33 = new EnumC1120870fH3("UNLOCK_TEAM_CHALLENGE", 2, "team_challenge_exclusive_gift_unlock");
        UNLOCK_TEAM_CHALLENGE = enumC1120870fH33;
        EnumC1120870fH3 enumC1120870fH34 = new EnumC1120870fH3("COLOR_GIFT", 3, "color_change");
        COLOR_GIFT = enumC1120870fH34;
        EnumC1120870fH3 enumC1120870fH35 = new EnumC1120870fH3("EVENT", 4, "gift_event");
        EVENT = enumC1120870fH35;
        EnumC1120870fH3 enumC1120870fH36 = new EnumC1120870fH3("GIFT_GUIDE", 5, "gift_guide");
        GIFT_GUIDE = enumC1120870fH36;
        EnumC1120870fH3 enumC1120870fH37 = new EnumC1120870fH3("RANDOM_GIFT", 6, "random_effect_gift");
        RANDOM_GIFT = enumC1120870fH37;
        EnumC1120870fH3 enumC1120870fH38 = new EnumC1120870fH3("RANDOM_FIREWORKS", 7, "fireworks");
        RANDOM_FIREWORKS = enumC1120870fH38;
        EnumC1120870fH3 enumC1120870fH39 = new EnumC1120870fH3("FANS_CLUB_START_GIFT", 8, "creator_user_first_guide");
        FANS_CLUB_START_GIFT = enumC1120870fH39;
        EnumC1120870fH3 enumC1120870fH310 = new EnumC1120870fH3("FANS_CLUB_LEVEL_GIFT", 9, "level_up_gift_unlock");
        FANS_CLUB_LEVEL_GIFT = enumC1120870fH310;
        EnumC1120870fH3 enumC1120870fH311 = new EnumC1120870fH3("POPULARITY_RANKING_BONUS_TIME_BUBBLE_GUIDE", 10, "send_popular_vote_to_team_rank_up");
        POPULARITY_RANKING_BONUS_TIME_BUBBLE_GUIDE = enumC1120870fH311;
        EnumC1120870fH3[] enumC1120870fH3Arr = {enumC1120870fH3, enumC1120870fH32, enumC1120870fH33, enumC1120870fH34, enumC1120870fH35, enumC1120870fH36, enumC1120870fH37, enumC1120870fH38, enumC1120870fH39, enumC1120870fH310, enumC1120870fH311};
        LLILLJJLI = enumC1120870fH3Arr;
        LLILLL = new C2254308sP(enumC1120870fH3Arr);
    }

    public static EnumC1120870fH3[] values() {
        return (EnumC1120870fH3[]) LLILLJJLI.clone();
    }

    public final String getDesc() {
        return this.LL;
    }

    public static EnumC1120870fH3 valueOf(String str) {
        return (EnumC1120870fH3) C08FF.LIZ(EnumC1120870fH3.class, str);
    }

    public EnumC1120870fH3(String str, int i, String str2) {
        this.LL = str2;
    }
}
