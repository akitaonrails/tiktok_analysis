package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QBA, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QBA {
    public static final C0QBA CLICKABLE_BANNER;
    public static final C0QBA CONTENT_PREFERENCE_INLINE_NOTICE;
    public static final C0QBA DEFAULT;
    public static final /* synthetic */ C0QBA[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final C0QBA MANAGE_FEEDS_POPUP;
    public static final C0QBA SEARCH_LYNX;
    public static final C0QBA SEARCH_SETTINGS;
    public static final C0QBA SEARCH_TOAST;
    public final String LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<C0QBA> getEntries() {
        return LLILZ;
    }

    static {
        C0QBA c0qba = new C0QBA("CLICKABLE_BANNER", 0, "permissions-vpc-dsa-recommendation_fyf_banner", "fyf_banner");
        CLICKABLE_BANNER = c0qba;
        C0QBA c0qba2 = new C0QBA("CONTENT_PREFERENCE_INLINE_NOTICE", 1, "permissions-vpc-dsa-recommendation_setting_banner", "setting_banner");
        CONTENT_PREFERENCE_INLINE_NOTICE = c0qba2;
        C0QBA c0qba3 = new C0QBA("MANAGE_FEEDS_POPUP", 2, "permissions-vpc-dsa-recommendation_long_hold", "long_hold");
        MANAGE_FEEDS_POPUP = c0qba3;
        C0QBA c0qba4 = new C0QBA("SEARCH_TOAST", 3, "permissions-vpc-dsa-recommendation_search_banner", "search_banner");
        SEARCH_TOAST = c0qba4;
        C0QBA c0qba5 = new C0QBA("SEARCH_SETTINGS", 4, "permissions-vpc-dsa-recommendation_search_menu", "search_menu");
        SEARCH_SETTINGS = c0qba5;
        C0QBA c0qba6 = new C0QBA("SEARCH_LYNX", 5, "permissions-vpc-dsa-recommendation_search_lynx", "search_lynx");
        SEARCH_LYNX = c0qba6;
        C0QBA c0qba7 = new C0QBA(LivePreviewCTASmartDisplayManager.DEFAULT, 6, "permissions-vpc-dsa-recommendation", "");
        DEFAULT = c0qba7;
        C0QBA[] c0qbaArr = {c0qba, c0qba2, c0qba3, c0qba4, c0qba5, c0qba6, c0qba7};
        LLILLL = c0qbaArr;
        LLILZ = new C2254308sP(c0qbaArr);
    }

    public static C0QBA[] values() {
        return (C0QBA[]) LLILLL.clone();
    }

    public final String getEnterFrom() {
        return this.LLILLJJLI;
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0QBA valueOf(String str) {
        return (C0QBA) C08FF.LIZ(C0QBA.class, str);
    }

    public C0QBA(String str, int i, String str2, String str3) {
        this.LL = str2;
        this.LLILLJJLI = str3;
    }
}
