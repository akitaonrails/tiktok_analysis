package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0XVH, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XVH {
    public static final C0XVH ACCOUNT_COMMON_GENERAL_PRIORITY_HOOK;
    public static final C0XVH ACCOUNT_COMMON_HIGH_PRIORITY_HOOK;
    public static final C0XVH COMPLIANCE_HOOK;
    public static final C0XVH CUSTOMIZE_HOOK;
    public static final C0XVH DISMISS_CONSENT_BOX_HOOK;
    public static final C0XVH FEED_PRELOAD_HOOK;
    public static final C0XVH FLUSH_COOKIE_HOOK;
    public static final C0XVH KR_MARKETING_NOTIFICATION_UPLOAD_HOOK;
    public static final C0XVH LAUNCH_AFTER_LOGIN_SCHEMA_HOOK;
    public static final /* synthetic */ C0XVH[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0XVH LOGIN_RESTART_HOOK;
    public static final C0XVH NEW_USER_DIALOG_CLEAN_HOOK;
    public static final C0XVH PASSPORT_POPUP_CONFIG_HOOK;
    public static final C0XVH REFRESH_AWEME_USER;
    public static final C0XVH SOCIAL_AUTH_KEVA_UPDATE_HOOK;
    public static final C0XVH SOCIAL_RECOMMEND_FRIENDS_FLOW_HOOK;
    public static final C0XVH UPDATE_ATTRIBUTION_HOOK;
    public static final C0XVH UPDATE_USER_CONTEXT_HOOK;
    public final int LL;

    public static InterfaceC2044707zh<C0XVH> getEntries() {
        return LLILLL;
    }

    static {
        C0XVH c0xvh = new C0XVH("ACCOUNT_COMMON_HIGH_PRIORITY_HOOK", 0, 1);
        ACCOUNT_COMMON_HIGH_PRIORITY_HOOK = c0xvh;
        C0XVH c0xvh2 = new C0XVH("FLUSH_COOKIE_HOOK", 1, 1);
        FLUSH_COOKIE_HOOK = c0xvh2;
        C0XVH c0xvh3 = new C0XVH("REFRESH_AWEME_USER", 2, 1);
        REFRESH_AWEME_USER = c0xvh3;
        C0XVH c0xvh4 = new C0XVH("UPDATE_ATTRIBUTION_HOOK", 3, 1);
        UPDATE_ATTRIBUTION_HOOK = c0xvh4;
        C0XVH c0xvh5 = new C0XVH("CUSTOMIZE_HOOK", 4, 5);
        CUSTOMIZE_HOOK = c0xvh5;
        C0XVH c0xvh6 = new C0XVH("ACCOUNT_COMMON_GENERAL_PRIORITY_HOOK", 5, 6);
        ACCOUNT_COMMON_GENERAL_PRIORITY_HOOK = c0xvh6;
        C0XVH c0xvh7 = new C0XVH("COMPLIANCE_HOOK", 6, 10);
        COMPLIANCE_HOOK = c0xvh7;
        C0XVH c0xvh8 = new C0XVH("DISMISS_CONSENT_BOX_HOOK", 7, 10);
        DISMISS_CONSENT_BOX_HOOK = c0xvh8;
        C0XVH c0xvh9 = new C0XVH("FEED_PRELOAD_HOOK", 8, 10);
        FEED_PRELOAD_HOOK = c0xvh9;
        C0XVH c0xvh10 = new C0XVH("KR_MARKETING_NOTIFICATION_UPLOAD_HOOK", 9, 10);
        KR_MARKETING_NOTIFICATION_UPLOAD_HOOK = c0xvh10;
        C0XVH c0xvh11 = new C0XVH("NEW_USER_DIALOG_CLEAN_HOOK", 10, 10);
        NEW_USER_DIALOG_CLEAN_HOOK = c0xvh11;
        C0XVH c0xvh12 = new C0XVH("PASSPORT_POPUP_CONFIG_HOOK", 11, 10);
        PASSPORT_POPUP_CONFIG_HOOK = c0xvh12;
        C0XVH c0xvh13 = new C0XVH("SOCIAL_AUTH_KEVA_UPDATE_HOOK", 12, 10);
        SOCIAL_AUTH_KEVA_UPDATE_HOOK = c0xvh13;
        C0XVH c0xvh14 = new C0XVH("SOCIAL_RECOMMEND_FRIENDS_FLOW_HOOK", 13, 10);
        SOCIAL_RECOMMEND_FRIENDS_FLOW_HOOK = c0xvh14;
        C0XVH c0xvh15 = new C0XVH("UPDATE_USER_CONTEXT_HOOK", 14, 10);
        UPDATE_USER_CONTEXT_HOOK = c0xvh15;
        C0XVH c0xvh16 = new C0XVH("LAUNCH_AFTER_LOGIN_SCHEMA_HOOK", 15, 999);
        LAUNCH_AFTER_LOGIN_SCHEMA_HOOK = c0xvh16;
        C0XVH c0xvh17 = new C0XVH("LOGIN_RESTART_HOOK", 16, 999);
        LOGIN_RESTART_HOOK = c0xvh17;
        C0XVH[] c0xvhArr = {c0xvh, c0xvh2, c0xvh3, c0xvh4, c0xvh5, c0xvh6, c0xvh7, c0xvh8, c0xvh9, c0xvh10, c0xvh11, c0xvh12, c0xvh13, c0xvh14, c0xvh15, c0xvh16, c0xvh17};
        LLILLJJLI = c0xvhArr;
        LLILLL = new C2254308sP(c0xvhArr);
    }

    public static C0XVH[] values() {
        return (C0XVH[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0XVH valueOf(String str) {
        return (C0XVH) C08FF.LIZ(C0XVH.class, str);
    }

    public C0XVH(String str, int i, int i2) {
        this.LL = i2;
    }
}
