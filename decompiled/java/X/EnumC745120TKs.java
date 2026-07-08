package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TKs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC745120TKs {
    public static final EnumC745120TKs AI_SUMMARY_NOT_FETCHED;
    public static final EnumC745120TKs DELAY_TIME_NOT_MEETS;
    public static final EnumC745120TKs EC_ROOM;
    public static final EnumC745120TKs FREQUENCY_CONTROL;
    public static final EnumC745120TKs FREQUENCY_EXIT_14D;
    public static final EnumC745120TKs FREQUENCY_EXIT_24H;
    public static final EnumC745120TKs GAME_ROOM;
    public static final EnumC745120TKs HAS_BOARD;
    public static final EnumC745120TKs LIVE_ROOM_ENTERED;
    public static final /* synthetic */ EnumC745120TKs[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC745120TKs NOT_HIT_EXP;
    public static final EnumC745120TKs NO_USER_INTERACTION;
    public static final EnumC745120TKs OTHER_CARD_SHOW;
    public static final EnumC745120TKs PROGRAMMED_LIVE;
    public static final EnumC745120TKs USER_CLOSE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC745120TKs> getEntries() {
        return LLILLL;
    }

    static {
        EnumC745120TKs enumC745120TKs = new EnumC745120TKs("AI_SUMMARY_NOT_FETCHED", 0, "AlSummaryNotFetched");
        AI_SUMMARY_NOT_FETCHED = enumC745120TKs;
        EnumC745120TKs enumC745120TKs2 = new EnumC745120TKs("LIVE_ROOM_ENTERED", 1, "LiveRoomEntered");
        LIVE_ROOM_ENTERED = enumC745120TKs2;
        EnumC745120TKs enumC745120TKs3 = new EnumC745120TKs("NO_USER_INTERACTION", 2, "NoUserInteraction");
        NO_USER_INTERACTION = enumC745120TKs3;
        EnumC745120TKs enumC745120TKs4 = new EnumC745120TKs("USER_CLOSE", 3, "UserClose");
        USER_CLOSE = enumC745120TKs4;
        EnumC745120TKs enumC745120TKs5 = new EnumC745120TKs("EC_ROOM", 4, "ECRoom");
        EC_ROOM = enumC745120TKs5;
        EnumC745120TKs enumC745120TKs6 = new EnumC745120TKs("PROGRAMMED_LIVE", 5, "programmed_live");
        PROGRAMMED_LIVE = enumC745120TKs6;
        EnumC745120TKs enumC745120TKs7 = new EnumC745120TKs("GAME_ROOM", 6, "GameRoom");
        GAME_ROOM = enumC745120TKs7;
        EnumC745120TKs enumC745120TKs8 = new EnumC745120TKs("OTHER_CARD_SHOW", 7, "OtherCardShow");
        OTHER_CARD_SHOW = enumC745120TKs8;
        EnumC745120TKs enumC745120TKs9 = new EnumC745120TKs("DELAY_TIME_NOT_MEETS", 8, "DelayTimeNotMeets");
        DELAY_TIME_NOT_MEETS = enumC745120TKs9;
        EnumC745120TKs enumC745120TKs10 = new EnumC745120TKs("NOT_HIT_EXP", 9, "NotHitExp");
        NOT_HIT_EXP = enumC745120TKs10;
        EnumC745120TKs enumC745120TKs11 = new EnumC745120TKs("HAS_BOARD", 10, "hasBoard");
        HAS_BOARD = enumC745120TKs11;
        EnumC745120TKs enumC745120TKs12 = new EnumC745120TKs("FREQUENCY_EXIT_24H", 11, "exit_24h");
        FREQUENCY_EXIT_24H = enumC745120TKs12;
        EnumC745120TKs enumC745120TKs13 = new EnumC745120TKs("FREQUENCY_EXIT_14D", 12, "exit_14d");
        FREQUENCY_EXIT_14D = enumC745120TKs13;
        EnumC745120TKs enumC745120TKs14 = new EnumC745120TKs("FREQUENCY_CONTROL", 13, "freq_control");
        FREQUENCY_CONTROL = enumC745120TKs14;
        EnumC745120TKs[] enumC745120TKsArr = {enumC745120TKs, enumC745120TKs2, enumC745120TKs3, enumC745120TKs4, enumC745120TKs5, enumC745120TKs6, enumC745120TKs7, enumC745120TKs8, enumC745120TKs9, enumC745120TKs10, enumC745120TKs11, enumC745120TKs12, enumC745120TKs13, enumC745120TKs14};
        LLILLJJLI = enumC745120TKsArr;
        LLILLL = new C2254308sP(enumC745120TKsArr);
    }

    public static EnumC745120TKs[] values() {
        return (EnumC745120TKs[]) LLILLJJLI.clone();
    }

    public final String getReason() {
        return this.LL;
    }

    public static EnumC745120TKs valueOf(String str) {
        return (EnumC745120TKs) C08FF.LIZ(EnumC745120TKs.class, str);
    }

    public EnumC745120TKs(String str, int i, String str2) {
        this.LL = str2;
    }
}
