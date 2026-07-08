package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0w8K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1768940w8K {
    public static final EnumC1768940w8K AFTER_FREEZE_TIME;
    public static final EnumC1768940w8K BADGE_RETRY;
    public static final EnumC1768940w8K BYTESYNC_PUSH_RETRY;
    public static final EnumC1768940w8K FEED_VIDEO_SEARCH;
    public static final EnumC1768940w8K GENERAL_SEARCH;
    public static final EnumC1768940w8K ICON_RETRY;
    public static final /* synthetic */ EnumC1768940w8K[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1768940w8K PITAYA_TRIGGER_IMMEDIATELY;
    public static final EnumC1768940w8K POLLING_REQ;
    public static final EnumC1768940w8K TOOLTIP_RETRY;
    public static final EnumC1768940w8K UG_BACK_FYP_SHOW_BUBBLE;
    public static final EnumC1768940w8K UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1768940w8K> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1768940w8K enumC1768940w8K = new EnumC1768940w8K("BYTESYNC_PUSH_RETRY", 0, "bytesync_push_retry");
        BYTESYNC_PUSH_RETRY = enumC1768940w8K;
        EnumC1768940w8K enumC1768940w8K2 = new EnumC1768940w8K("TOOLTIP_RETRY", 1, "tooltip_retry");
        TOOLTIP_RETRY = enumC1768940w8K2;
        EnumC1768940w8K enumC1768940w8K3 = new EnumC1768940w8K("ICON_RETRY", 2, "icon_retry");
        ICON_RETRY = enumC1768940w8K3;
        EnumC1768940w8K enumC1768940w8K4 = new EnumC1768940w8K("BADGE_RETRY", 3, "badge_retry");
        BADGE_RETRY = enumC1768940w8K4;
        EnumC1768940w8K enumC1768940w8K5 = new EnumC1768940w8K("POLLING_REQ", 4, "polling_req");
        POLLING_REQ = enumC1768940w8K5;
        EnumC1768940w8K enumC1768940w8K6 = new EnumC1768940w8K("FEED_VIDEO_SEARCH", 5, "feed_video_search");
        FEED_VIDEO_SEARCH = enumC1768940w8K6;
        EnumC1768940w8K enumC1768940w8K7 = new EnumC1768940w8K("GENERAL_SEARCH", 6, "general_search");
        GENERAL_SEARCH = enumC1768940w8K7;
        EnumC1768940w8K enumC1768940w8K8 = new EnumC1768940w8K("AFTER_FREEZE_TIME", 7, "after_freeze_time");
        AFTER_FREEZE_TIME = enumC1768940w8K8;
        EnumC1768940w8K enumC1768940w8K9 = new EnumC1768940w8K("PITAYA_TRIGGER_IMMEDIATELY", 8, "pitaya_trigger_immediately");
        PITAYA_TRIGGER_IMMEDIATELY = enumC1768940w8K9;
        EnumC1768940w8K enumC1768940w8K10 = new EnumC1768940w8K("UG_BACK_FYP_SHOW_BUBBLE", 9, "ug_back_fyp_show_bubble");
        UG_BACK_FYP_SHOW_BUBBLE = enumC1768940w8K10;
        EnumC1768940w8K enumC1768940w8K11 = new EnumC1768940w8K("UNKNOWN", 10, "unknown");
        UNKNOWN = enumC1768940w8K11;
        EnumC1768940w8K[] enumC1768940w8KArr = {enumC1768940w8K, enumC1768940w8K2, enumC1768940w8K3, enumC1768940w8K4, enumC1768940w8K5, enumC1768940w8K6, enumC1768940w8K7, enumC1768940w8K8, enumC1768940w8K9, enumC1768940w8K10, enumC1768940w8K11};
        LLILLJJLI = enumC1768940w8KArr;
        LLILLL = new C2254308sP(enumC1768940w8KArr);
    }

    public static EnumC1768940w8K[] values() {
        return (EnumC1768940w8K[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1768940w8K valueOf(String str) {
        return (EnumC1768940w8K) C08FF.LIZ(EnumC1768940w8K.class, str);
    }

    public EnumC1768940w8K(String str, int i, String str2) {
        this.LL = str2;
    }
}
