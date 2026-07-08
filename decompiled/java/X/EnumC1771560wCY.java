package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wCY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1771560wCY {
    public static final EnumC1771560wCY BACK_FROM_SPLIT_SCREEN;
    public static final EnumC1771560wCY BACK_FROM_SUBPAGE;
    public static final EnumC1771560wCY BACK_FROM_TAB;
    public static final EnumC1771560wCY COLD_START;
    public static final EnumC1771560wCY FAIL_RETRY;
    public static final /* synthetic */ EnumC1771560wCY[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1771560wCY LOAD_MORE;
    public static final EnumC1771560wCY NONE;
    public static final EnumC1771560wCY OTHER;
    public static final EnumC1771560wCY PULL_DOWN;
    public static final EnumC1771560wCY RE_CLICK_MALL_TAB;
    public static final EnumC1771560wCY SWITCH_ACCOUNT;
    public static final EnumC1771560wCY SWITCH_FEED_TAB;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1771560wCY> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1771560wCY enumC1771560wCY = new EnumC1771560wCY("COLD_START", 0, "cold_start");
        COLD_START = enumC1771560wCY;
        EnumC1771560wCY enumC1771560wCY2 = new EnumC1771560wCY("PULL_DOWN", 1, "pull_down");
        PULL_DOWN = enumC1771560wCY2;
        EnumC1771560wCY enumC1771560wCY3 = new EnumC1771560wCY("LOAD_MORE", 2, "load_more");
        LOAD_MORE = enumC1771560wCY3;
        EnumC1771560wCY enumC1771560wCY4 = new EnumC1771560wCY("BACK_FROM_TAB", 3, "back_from_tab");
        BACK_FROM_TAB = enumC1771560wCY4;
        EnumC1771560wCY enumC1771560wCY5 = new EnumC1771560wCY("BACK_FROM_SUBPAGE", 4, "back_from_subpage");
        BACK_FROM_SUBPAGE = enumC1771560wCY5;
        EnumC1771560wCY enumC1771560wCY6 = new EnumC1771560wCY("BACK_FROM_SPLIT_SCREEN", 5, "back_from_splitscreen");
        BACK_FROM_SPLIT_SCREEN = enumC1771560wCY6;
        EnumC1771560wCY enumC1771560wCY7 = new EnumC1771560wCY("RE_CLICK_MALL_TAB", 6, "reclick_mall_tab");
        RE_CLICK_MALL_TAB = enumC1771560wCY7;
        EnumC1771560wCY enumC1771560wCY8 = new EnumC1771560wCY("FAIL_RETRY", 7, "fail_retry");
        FAIL_RETRY = enumC1771560wCY8;
        EnumC1771560wCY enumC1771560wCY9 = new EnumC1771560wCY("SWITCH_FEED_TAB", 8, "switch_feed_tab");
        SWITCH_FEED_TAB = enumC1771560wCY9;
        EnumC1771560wCY enumC1771560wCY10 = new EnumC1771560wCY("SWITCH_ACCOUNT", 9, "switch_account");
        SWITCH_ACCOUNT = enumC1771560wCY10;
        EnumC1771560wCY enumC1771560wCY11 = new EnumC1771560wCY("OTHER", 10, "other");
        OTHER = enumC1771560wCY11;
        EnumC1771560wCY enumC1771560wCY12 = new EnumC1771560wCY("NONE", 11, "none");
        NONE = enumC1771560wCY12;
        EnumC1771560wCY[] enumC1771560wCYArr = {enumC1771560wCY, enumC1771560wCY2, enumC1771560wCY3, enumC1771560wCY4, enumC1771560wCY5, enumC1771560wCY6, enumC1771560wCY7, enumC1771560wCY8, enumC1771560wCY9, enumC1771560wCY10, enumC1771560wCY11, enumC1771560wCY12};
        LLILLJJLI = enumC1771560wCYArr;
        LLILLL = new C2254308sP(enumC1771560wCYArr);
    }

    public static EnumC1771560wCY[] values() {
        return (EnumC1771560wCY[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1771560wCY valueOf(String str) {
        return (EnumC1771560wCY) C08FF.LIZ(EnumC1771560wCY.class, str);
    }

    public EnumC1771560wCY(String str, int i, String str2) {
        this.LL = str2;
    }
}
