package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cMq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1009140cMq {
    public static final EnumC1009140cMq ANOLE_ALL_INTERACT;
    public static final EnumC1009140cMq ANOLE_BOTTOM_INTERACT;
    public static final EnumC1009140cMq ANOLE_LEFT_INTERACT;
    public static final EnumC1009140cMq ANOLE_LIVE_PREVIEW_INTERACTIVES;
    public static final EnumC1009140cMq ANOLE_REWARD_BOTTOM_INTERACT_VIEW;
    public static final EnumC1009140cMq ANOLE_REWARD_BOTTOM_NATIVE_BASE_VIEW;
    public static final EnumC1009140cMq ANOLE_RIGHT_INTERACT;
    public static final EnumC1009140cMq ANOLE_SEARCH_CONTENT_AREA;
    public static final EnumC1009140cMq ANOLE_STATUS_BAR;
    public static final EnumC1009140cMq ANOLE_TOP_LEFT_INTERACT;
    public static final /* synthetic */ EnumC1009140cMq[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1009140cMq> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1009140cMq enumC1009140cMq = new EnumC1009140cMq("ANOLE_ALL_INTERACT", 0, "tt_interactive");
        ANOLE_ALL_INTERACT = enumC1009140cMq;
        EnumC1009140cMq enumC1009140cMq2 = new EnumC1009140cMq("ANOLE_TOP_LEFT_INTERACT", 1, "tt_top_left_interactive");
        ANOLE_TOP_LEFT_INTERACT = enumC1009140cMq2;
        EnumC1009140cMq enumC1009140cMq3 = new EnumC1009140cMq("ANOLE_LEFT_INTERACT", 2, "tt_left_interactive");
        ANOLE_LEFT_INTERACT = enumC1009140cMq3;
        EnumC1009140cMq enumC1009140cMq4 = new EnumC1009140cMq("ANOLE_RIGHT_INTERACT", 3, "tt_right_interactive");
        ANOLE_RIGHT_INTERACT = enumC1009140cMq4;
        EnumC1009140cMq enumC1009140cMq5 = new EnumC1009140cMq("ANOLE_BOTTOM_INTERACT", 4, "tt_bottom_interactive");
        ANOLE_BOTTOM_INTERACT = enumC1009140cMq5;
        EnumC1009140cMq enumC1009140cMq6 = new EnumC1009140cMq("ANOLE_STATUS_BAR", 5, "tt_status_bar");
        ANOLE_STATUS_BAR = enumC1009140cMq6;
        EnumC1009140cMq enumC1009140cMq7 = new EnumC1009140cMq("ANOLE_REWARD_BOTTOM_NATIVE_BASE_VIEW", 6, "tt_reward_bottom_native_base_view");
        ANOLE_REWARD_BOTTOM_NATIVE_BASE_VIEW = enumC1009140cMq7;
        EnumC1009140cMq enumC1009140cMq8 = new EnumC1009140cMq("ANOLE_REWARD_BOTTOM_INTERACT_VIEW", 7, "tt_reward_ad_bottom_interact");
        ANOLE_REWARD_BOTTOM_INTERACT_VIEW = enumC1009140cMq8;
        EnumC1009140cMq enumC1009140cMq9 = new EnumC1009140cMq("ANOLE_LIVE_PREVIEW_INTERACTIVES", 8, "tt_live_preview_interactives");
        ANOLE_LIVE_PREVIEW_INTERACTIVES = enumC1009140cMq9;
        EnumC1009140cMq enumC1009140cMq10 = new EnumC1009140cMq("ANOLE_SEARCH_CONTENT_AREA", 9, "tt_search_content_area");
        ANOLE_SEARCH_CONTENT_AREA = enumC1009140cMq10;
        EnumC1009140cMq[] enumC1009140cMqArr = {enumC1009140cMq, enumC1009140cMq2, enumC1009140cMq3, enumC1009140cMq4, enumC1009140cMq5, enumC1009140cMq6, enumC1009140cMq7, enumC1009140cMq8, enumC1009140cMq9, enumC1009140cMq10};
        LLILLJJLI = enumC1009140cMqArr;
        LLILLL = new C2254308sP(enumC1009140cMqArr);
    }

    public static EnumC1009140cMq[] values() {
        return (EnumC1009140cMq[]) LLILLJJLI.clone();
    }

    public final String getInteractName() {
        return this.LL;
    }

    public static EnumC1009140cMq valueOf(String str) {
        return (EnumC1009140cMq) C08FF.LIZ(EnumC1009140cMq.class, str);
    }

    public EnumC1009140cMq(String str, int i, String str2) {
        this.LL = str2;
    }
}
