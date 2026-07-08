package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0r9O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1577400r9O {
    public static final EnumC1577400r9O FEED_CARD_REQUEST;
    public static final EnumC1577400r9O FEED_CARD_RESPONSE;
    public static final EnumC1577400r9O FINAL_DESTINATION;
    public static final EnumC1577400r9O FLOW_STARTED;
    public static final /* synthetic */ EnumC1577400r9O[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1577400r9O NUJ_FINISHED;
    public static final EnumC1577400r9O QUALIFIED_DATA_REQUEST;
    public static final EnumC1577400r9O REMOVE_CARD;
    public static final EnumC1577400r9O TAB_CONFIG_REQUEST;
    public static final EnumC1577400r9O TAB_CONFIG_RESPONSE;
    public static final EnumC1577400r9O VIDEO_PLAY;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1577400r9O> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1577400r9O enumC1577400r9O = new EnumC1577400r9O("FLOW_STARTED", 0, "flow_started");
        FLOW_STARTED = enumC1577400r9O;
        EnumC1577400r9O enumC1577400r9O2 = new EnumC1577400r9O("QUALIFIED_DATA_REQUEST", 1, "qualified_data_request");
        QUALIFIED_DATA_REQUEST = enumC1577400r9O2;
        EnumC1577400r9O enumC1577400r9O3 = new EnumC1577400r9O("FEED_CARD_REQUEST", 2, "feed_card_request");
        FEED_CARD_REQUEST = enumC1577400r9O3;
        EnumC1577400r9O enumC1577400r9O4 = new EnumC1577400r9O("FEED_CARD_RESPONSE", 3, "feed_card_response");
        FEED_CARD_RESPONSE = enumC1577400r9O4;
        EnumC1577400r9O enumC1577400r9O5 = new EnumC1577400r9O("NUJ_FINISHED", 4, "nuj_finished");
        NUJ_FINISHED = enumC1577400r9O5;
        EnumC1577400r9O enumC1577400r9O6 = new EnumC1577400r9O("FINAL_DESTINATION", 5, "final_destination");
        FINAL_DESTINATION = enumC1577400r9O6;
        EnumC1577400r9O enumC1577400r9O7 = new EnumC1577400r9O("REMOVE_CARD", 6, "remove_card");
        REMOVE_CARD = enumC1577400r9O7;
        EnumC1577400r9O enumC1577400r9O8 = new EnumC1577400r9O("VIDEO_PLAY", 7, "video_play");
        VIDEO_PLAY = enumC1577400r9O8;
        EnumC1577400r9O enumC1577400r9O9 = new EnumC1577400r9O("TAB_CONFIG_REQUEST", 8, "tab_config_request");
        TAB_CONFIG_REQUEST = enumC1577400r9O9;
        EnumC1577400r9O enumC1577400r9O10 = new EnumC1577400r9O("TAB_CONFIG_RESPONSE", 9, "tab_config_response");
        TAB_CONFIG_RESPONSE = enumC1577400r9O10;
        EnumC1577400r9O[] enumC1577400r9OArr = {enumC1577400r9O, enumC1577400r9O2, enumC1577400r9O3, enumC1577400r9O4, enumC1577400r9O5, enumC1577400r9O6, enumC1577400r9O7, enumC1577400r9O8, enumC1577400r9O9, enumC1577400r9O10};
        LLILLJJLI = enumC1577400r9OArr;
        LLILLL = new C2254308sP(enumC1577400r9OArr);
    }

    public static EnumC1577400r9O[] values() {
        return (EnumC1577400r9O[]) LLILLJJLI.clone();
    }

    public final String getStage() {
        return this.LL;
    }

    public static EnumC1577400r9O valueOf(String str) {
        return (EnumC1577400r9O) C08FF.LIZ(EnumC1577400r9O.class, str);
    }

    public EnumC1577400r9O(String str, int i, String str2) {
        this.LL = str2;
    }
}
