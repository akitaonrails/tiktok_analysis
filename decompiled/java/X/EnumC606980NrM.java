package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NrM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC606980NrM {
    public static final EnumC606980NrM ABOUT_TO_REACH_BOTTOM;
    public static final EnumC606980NrM ALREADY_TRIGGERED;
    public static final EnumC606980NrM AWEME_TYPE_MISMATCH;
    public static final EnumC606980NrM BACKGROUND;
    public static final EnumC606980NrM BACK_SLIDE;
    public static final EnumC606980NrM CACHE_EXHAUSTED;
    public static final EnumC606980NrM CONTEXT_INCOMPLETE;
    public static final EnumC606980NrM DUPLICATE_IN_FEED;
    public static final EnumC606980NrM FREQUENCY_CHECK;
    public static final /* synthetic */ EnumC606980NrM[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC606980NrM NEAR_OTHER_CACHE;
    public static final EnumC606980NrM NEXT_ITEM_MISMATCH;
    public static final EnumC606980NrM PAGE_SCROLLING;
    public static final EnumC606980NrM PAGE_SLIDE_QUICKLY;
    public static final EnumC606980NrM REQUEST_LOCKED;
    public static final EnumC606980NrM SAME_ITEM;
    public static final EnumC606980NrM SCORE_NOT_ENOUGH;
    public static final EnumC606980NrM SESSION_ENDED;
    public final String LL;

    public static InterfaceC2044707zh<EnumC606980NrM> getEntries() {
        return LLILLL;
    }

    static {
        EnumC606980NrM enumC606980NrM = new EnumC606980NrM("CONTEXT_INCOMPLETE", 0, "context_incomplete");
        CONTEXT_INCOMPLETE = enumC606980NrM;
        EnumC606980NrM enumC606980NrM2 = new EnumC606980NrM("NEXT_ITEM_MISMATCH", 1, "no_next_item_id");
        NEXT_ITEM_MISMATCH = enumC606980NrM2;
        EnumC606980NrM enumC606980NrM3 = new EnumC606980NrM("SCORE_NOT_ENOUGH", 2, "not_in_score_threshold");
        SCORE_NOT_ENOUGH = enumC606980NrM3;
        EnumC606980NrM enumC606980NrM4 = new EnumC606980NrM("FREQUENCY_CHECK", 3, "still_in_frequency_range");
        FREQUENCY_CHECK = enumC606980NrM4;
        EnumC606980NrM enumC606980NrM5 = new EnumC606980NrM("AWEME_TYPE_MISMATCH", 4, "in_forbid_type");
        AWEME_TYPE_MISMATCH = enumC606980NrM5;
        EnumC606980NrM enumC606980NrM6 = new EnumC606980NrM("PAGE_SCROLLING", 5, "in_scrolling");
        PAGE_SCROLLING = enumC606980NrM6;
        EnumC606980NrM enumC606980NrM7 = new EnumC606980NrM("PAGE_SLIDE_QUICKLY", 6, "quick_slide");
        PAGE_SLIDE_QUICKLY = enumC606980NrM7;
        EnumC606980NrM enumC606980NrM8 = new EnumC606980NrM("BACK_SLIDE", 7, "back_slide");
        BACK_SLIDE = enumC606980NrM8;
        EnumC606980NrM enumC606980NrM9 = new EnumC606980NrM("NEAR_OTHER_CACHE", 8, "near_exist_cache");
        NEAR_OTHER_CACHE = enumC606980NrM9;
        EnumC606980NrM enumC606980NrM10 = new EnumC606980NrM("ABOUT_TO_REACH_BOTTOM", 9, "near_bottoming");
        ABOUT_TO_REACH_BOTTOM = enumC606980NrM10;
        EnumC606980NrM enumC606980NrM11 = new EnumC606980NrM("CACHE_EXHAUSTED", 10, "no_more_cache");
        CACHE_EXHAUSTED = enumC606980NrM11;
        EnumC606980NrM enumC606980NrM12 = new EnumC606980NrM("SAME_ITEM", 11, "same_item");
        SAME_ITEM = enumC606980NrM12;
        EnumC606980NrM enumC606980NrM13 = new EnumC606980NrM("BACKGROUND", 12, "background");
        BACKGROUND = enumC606980NrM13;
        EnumC606980NrM enumC606980NrM14 = new EnumC606980NrM("SESSION_ENDED", 13, "session_ended");
        SESSION_ENDED = enumC606980NrM14;
        EnumC606980NrM enumC606980NrM15 = new EnumC606980NrM("DUPLICATE_IN_FEED", 14, "duplicate_in_feed");
        DUPLICATE_IN_FEED = enumC606980NrM15;
        EnumC606980NrM enumC606980NrM16 = new EnumC606980NrM("ALREADY_TRIGGERED", 15, "already_triggered");
        ALREADY_TRIGGERED = enumC606980NrM16;
        EnumC606980NrM enumC606980NrM17 = new EnumC606980NrM("REQUEST_LOCKED", 16, "request_locked");
        REQUEST_LOCKED = enumC606980NrM17;
        EnumC606980NrM[] enumC606980NrMArr = {enumC606980NrM, enumC606980NrM2, enumC606980NrM3, enumC606980NrM4, enumC606980NrM5, enumC606980NrM6, enumC606980NrM7, enumC606980NrM8, enumC606980NrM9, enumC606980NrM10, enumC606980NrM11, enumC606980NrM12, enumC606980NrM13, enumC606980NrM14, enumC606980NrM15, enumC606980NrM16, enumC606980NrM17};
        LLILLJJLI = enumC606980NrMArr;
        LLILLL = new C2254308sP(enumC606980NrMArr);
    }

    public static EnumC606980NrM[] values() {
        return (EnumC606980NrM[]) LLILLJJLI.clone();
    }

    public final String getDescription() {
        return this.LL;
    }

    public static EnumC606980NrM valueOf(String str) {
        return (EnumC606980NrM) C08FF.LIZ(EnumC606980NrM.class, str);
    }

    public EnumC606980NrM(String str, int i, String str2) {
        this.LL = str2;
    }
}
