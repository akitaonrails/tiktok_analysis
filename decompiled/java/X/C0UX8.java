package X;

/* JADX INFO: renamed from: X.0UX8, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public enum C0UX8 {
    EVENT_PAGE_WATCH_LIVE("", false),
    EVENT_PAGE_BROADCAST("live_take_detail", true),
    EVENT_PAGE_BROADCAST_PREVIEW("live_take_page", true),
    EVENT_PAGE_CLOSE_BROADCAST("close_broadcast_page", true),
    EVENT_PAGE_TRY_MODE_BROADCAST("live_trymode", true),
    EVENT_PAGE_MULTI_GUEST("multi_guest", false),
    EVENT_PAGE_SUBSCRIBE_SETTING_PAGE("host_sub_setting_page", true);

    public boolean isAnchor;
    public String page;

    public static C0UX8 valueOf(String str) {
        return (C0UX8) C08FF.LIZ(C0UX8.class, str);
    }

    C0UX8(String str, boolean z) {
        this.page = str;
        this.isAnchor = z;
    }
}
