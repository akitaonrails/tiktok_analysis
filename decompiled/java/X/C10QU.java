package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10QU, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10QU {
    public static final C10QX Companion;
    public static final /* synthetic */ C10QU[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public static final C10QU STRATEGY_AF_SPEED_UP;
    public static final C10QU STRATEGY_PRELOAD_SHARE_VIDEO;
    public static final C10QU STRATEGY_SCENE_AD_FREE_TRIAL;
    public static final C10QU STRATEGY_SCENE_APP_LANGUAGE;
    public static final C10QU STRATEGY_SCENE_CONSENT_BOX_DIALOG;
    public static final C10QU STRATEGY_SCENE_CONTENT_LANGUAGE;
    public static final C10QU STRATEGY_SCENE_DEEPLINK_FRAMEWORK;
    public static final C10QU STRATEGY_SCENE_FEED_SWIPE_UP_PAGE;
    public static final C10QU STRATEGY_SCENE_FILTER_MIGRATION;
    public static final C10QU STRATEGY_SCENE_FORCE_FINISH_NUJ;
    public static final C10QU STRATEGY_SCENE_FORECAST_GROUP_CONFIG;
    public static final C10QU STRATEGY_SCENE_FORECAST_LOGIN;
    public static final C10QU STRATEGY_SCENE_INTENTION_MARK;
    public static final C10QU STRATEGY_SCENE_INTEREST_SELECTION_PAGE;
    public static final C10QU STRATEGY_SCENE_LIVE_DIRECT;
    public static final C10QU STRATEGY_SCENE_NUJ_AGE_GATE;
    public static final C10QU STRATEGY_SCENE_NUJ_CONSENT_BOX_PAGE;
    public static final C10QU STRATEGY_SCENE_NUJ_DEEPLINK_NODE;
    public static final C10QU STRATEGY_SCENE_NUJ_FLOW;
    public static final C10QU STRATEGY_SCENE_NUJ_FOLLOW_TRENDING_CREATORS_PAGE;
    public static final C10QU STRATEGY_SCENE_NUJ_KMP_CONFIG;
    public static final C10QU STRATEGY_SCENE_NUJ_LOGIN;
    public static final C10QU STRATEGY_SCENE_NUJ_PAGE;
    public static final C10QU STRATEGY_SCENE_NUJ_PUSH_PERMISSION_BACKGROUND;
    public static final C10QU STRATEGY_SCENE_NUJ_SKIPPABLE_LOGIN;
    public static final C10QU STRATEGY_SCENE_NUJ_SLOGAN_CONSENT_BOX_PAGE;
    public static final C10QU STRATEGY_SCENE_NUJ_SWIPE_UP;
    public static final C10QU STRATEGY_SCENE_NU_STRATEGY_CENTER;
    public static final C10QU STRATEGY_SCENE_PERSONAL_AD_CHOICE;
    public static final C10QU STRATEGY_SCENE_PICK_AD_PLAN;
    public static final C10QU STRATEGY_SCENE_PRIVACY_FOR_TEENS;
    public static final C10QU STRATEGY_SCENE_PRIVATE_ACCOUNT;
    public static final C10QU STRATEGY_SCENE_PUSH_DIALOG;
    public static final C10QU STRATEGY_SCENE_SECOND_PUSH_DIALOG;
    public static final C10QU STRATEGY_SCENE_SHORT_TO_LONG;
    public static final C10QU STRATEGY_SCENE_SLOGAN_PAGE;
    public static final C10QU STRATEGY_SCENE_SMART_LOCK;
    public static final C10QU STRATEGY_TTS_SEA_AB;
    public static final C10QU STRATEGY_TTS_SEA_EMPTY_AB;
    public static final C10QU STRATEGY_TTS_SEA_SPEED_UP_AB;
    public static final Map<Integer, C10QU> idToSceneMap;
    public final int LL;
    public final C10QV LLILLJJLI;
    public final String LLILLL;

    public static InterfaceC2044707zh<C10QU> getEntries() {
        return LLILZIL;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.10QX] */
    static {
        C10QU c10qu = new C10QU("STRATEGY_SCENE_NUJ_FLOW", 0, 101, C10QV.FLOW, "nuj_flow.json");
        STRATEGY_SCENE_NUJ_FLOW = c10qu;
        C10QV c10qv = C10QV.CONFIG;
        C10QU c10qu2 = new C10QU("STRATEGY_SCENE_NUJ_SWIPE_UP", 1, 102, c10qv, "nuj_swipe_up.json");
        STRATEGY_SCENE_NUJ_SWIPE_UP = c10qu2;
        C10QU c10qu3 = new C10QU("STRATEGY_SCENE_FORECAST_LOGIN", 2, 103, C10QV.TASKS, "forecast_login.json");
        STRATEGY_SCENE_FORECAST_LOGIN = c10qu3;
        C10QU c10qu4 = new C10QU("STRATEGY_SCENE_SMART_LOCK", 3, 104, c10qv, "smart_lock.json");
        STRATEGY_SCENE_SMART_LOCK = c10qu4;
        C10QU c10qu5 = new C10QU("STRATEGY_SCENE_NUJ_CONSENT_BOX_PAGE", 4, 106, c10qv, "nuj_consent_box_page.json");
        STRATEGY_SCENE_NUJ_CONSENT_BOX_PAGE = c10qu5;
        C10QU c10qu6 = new C10QU("STRATEGY_SCENE_FORECAST_GROUP_CONFIG", 5, 107, c10qv, "forecast_group_config.json");
        STRATEGY_SCENE_FORECAST_GROUP_CONFIG = c10qu6;
        C10QU c10qu7 = new C10QU("STRATEGY_SCENE_NUJ_PAGE", 6, 108, c10qv, "nuj_page.json");
        STRATEGY_SCENE_NUJ_PAGE = c10qu7;
        C10QU c10qu8 = new C10QU("STRATEGY_SCENE_SLOGAN_PAGE", 7, 109, c10qv, "slogan_page.json");
        STRATEGY_SCENE_SLOGAN_PAGE = c10qu8;
        C10QU c10qu9 = new C10QU("STRATEGY_SCENE_INTEREST_SELECTION_PAGE", 8, 110, c10qv, "interest_selection_page.json");
        STRATEGY_SCENE_INTEREST_SELECTION_PAGE = c10qu9;
        C10QU c10qu10 = new C10QU("STRATEGY_SCENE_FEED_SWIPE_UP_PAGE", 9, 111, c10qv, "feed_swipe_up_page.json");
        STRATEGY_SCENE_FEED_SWIPE_UP_PAGE = c10qu10;
        C10QU c10qu11 = new C10QU("STRATEGY_SCENE_NUJ_SLOGAN_CONSENT_BOX_PAGE", 10, 112, c10qv, "slogan_consent_box.json");
        STRATEGY_SCENE_NUJ_SLOGAN_CONSENT_BOX_PAGE = c10qu11;
        C10QU c10qu12 = new C10QU("STRATEGY_SCENE_NU_STRATEGY_CENTER", 11, 113, c10qv, "nu_strategy_center.json");
        STRATEGY_SCENE_NU_STRATEGY_CENTER = c10qu12;
        C10QU c10qu13 = new C10QU("STRATEGY_SCENE_NUJ_AGE_GATE", 12, 115, c10qv, "nuj_age_gate.json");
        STRATEGY_SCENE_NUJ_AGE_GATE = c10qu13;
        C10QU c10qu14 = new C10QU("STRATEGY_SCENE_NUJ_LOGIN", 13, 116, c10qv, "nuj_login.json");
        STRATEGY_SCENE_NUJ_LOGIN = c10qu14;
        C10QU c10qu15 = new C10QU("STRATEGY_SCENE_NUJ_SKIPPABLE_LOGIN", 14, 117, c10qv, "nuj_skippable_login.json");
        STRATEGY_SCENE_NUJ_SKIPPABLE_LOGIN = c10qu15;
        C10QU c10qu16 = new C10QU("STRATEGY_SCENE_CONTENT_LANGUAGE", 15, 118, c10qv, "nuj_content_language.json");
        STRATEGY_SCENE_CONTENT_LANGUAGE = c10qu16;
        C10QU c10qu17 = new C10QU("STRATEGY_SCENE_APP_LANGUAGE", 16, 119, c10qv, "nuj_app_language.json");
        STRATEGY_SCENE_APP_LANGUAGE = c10qu17;
        C10QU c10qu18 = new C10QU("STRATEGY_SCENE_NUJ_DEEPLINK_NODE", 17, 120, c10qv, "nuj_deeplink_node.json");
        STRATEGY_SCENE_NUJ_DEEPLINK_NODE = c10qu18;
        C10QU c10qu19 = new C10QU("STRATEGY_SCENE_PRIVACY_FOR_TEENS", 18, 121, c10qv, "nuj_privacy_for_teens.json");
        STRATEGY_SCENE_PRIVACY_FOR_TEENS = c10qu19;
        C10QU c10qu20 = new C10QU("STRATEGY_SCENE_PRIVATE_ACCOUNT", 19, 122, c10qv, "nuj_private_account.json");
        STRATEGY_SCENE_PRIVATE_ACCOUNT = c10qu20;
        C10QU c10qu21 = new C10QU("STRATEGY_SCENE_PICK_AD_PLAN", 20, 123, c10qv, "nuj_pick_ad_plan.json");
        STRATEGY_SCENE_PICK_AD_PLAN = c10qu21;
        C10QU c10qu22 = new C10QU("STRATEGY_SCENE_AD_FREE_TRIAL", 21, 124, c10qv, "nuj_ad_free_trial.json");
        STRATEGY_SCENE_AD_FREE_TRIAL = c10qu22;
        C10QU c10qu23 = new C10QU("STRATEGY_SCENE_PERSONAL_AD_CHOICE", 22, 125, c10qv, "nuj_ad_choice.json");
        STRATEGY_SCENE_PERSONAL_AD_CHOICE = c10qu23;
        C10QU c10qu24 = new C10QU("STRATEGY_SCENE_CONSENT_BOX_DIALOG", 23, 126, c10qv, "nuj_consent_box_dialog.json");
        STRATEGY_SCENE_CONSENT_BOX_DIALOG = c10qu24;
        C10QU c10qu25 = new C10QU("STRATEGY_SCENE_PUSH_DIALOG", 24, 127, c10qv, "nuj_push_dialog.json");
        STRATEGY_SCENE_PUSH_DIALOG = c10qu25;
        C10QU c10qu26 = new C10QU("STRATEGY_SCENE_SECOND_PUSH_DIALOG", 25, 128, c10qv, "nuj_second_push_dialog.json");
        STRATEGY_SCENE_SECOND_PUSH_DIALOG = c10qu26;
        C10QU c10qu27 = new C10QU("STRATEGY_SCENE_FILTER_MIGRATION", 26, 129, c10qv, "filter_migration.json");
        STRATEGY_SCENE_FILTER_MIGRATION = c10qu27;
        C10QU c10qu28 = new C10QU("STRATEGY_SCENE_DEEPLINK_FRAMEWORK", 27, 130, C10QV.DEEP, "");
        STRATEGY_SCENE_DEEPLINK_FRAMEWORK = c10qu28;
        C10QU c10qu29 = new C10QU("STRATEGY_SCENE_SHORT_TO_LONG", 28, 131, c10qv, "short_to_long.json");
        STRATEGY_SCENE_SHORT_TO_LONG = c10qu29;
        C10QU c10qu30 = new C10QU("STRATEGY_SCENE_FORCE_FINISH_NUJ", 29, 132, c10qv, "force_finish_nuj.json");
        STRATEGY_SCENE_FORCE_FINISH_NUJ = c10qu30;
        C10QU c10qu31 = new C10QU("STRATEGY_TTS_SEA_AB", 30, 133, c10qv, "tts_sea_ab.json");
        STRATEGY_TTS_SEA_AB = c10qu31;
        C10QU c10qu32 = new C10QU("STRATEGY_TTS_SEA_SPEED_UP_AB", 31, 134, c10qv, "tts_sea_speed_up_ab.json");
        STRATEGY_TTS_SEA_SPEED_UP_AB = c10qu32;
        C10QU c10qu33 = new C10QU("STRATEGY_PRELOAD_SHARE_VIDEO", 32, 135, c10qv, "preload_share_video.json");
        STRATEGY_PRELOAD_SHARE_VIDEO = c10qu33;
        C10QU c10qu34 = new C10QU("STRATEGY_AF_SPEED_UP", 33, 136, c10qv, "af_speed_up_ab.json");
        STRATEGY_AF_SPEED_UP = c10qu34;
        C10QU c10qu35 = new C10QU("STRATEGY_TTS_SEA_EMPTY_AB", 34, 137, c10qv, "tts_sea_empty_ab.json");
        STRATEGY_TTS_SEA_EMPTY_AB = c10qu35;
        C10QU c10qu36 = new C10QU("STRATEGY_SCENE_NUJ_PUSH_PERMISSION_BACKGROUND", 35, 138, c10qv, "nuj_push_permission_background.json");
        STRATEGY_SCENE_NUJ_PUSH_PERMISSION_BACKGROUND = c10qu36;
        C10QU c10qu37 = new C10QU("STRATEGY_SCENE_INTENTION_MARK", 36, 139, C10QV.CUSTOM, "");
        STRATEGY_SCENE_INTENTION_MARK = c10qu37;
        C10QU c10qu38 = new C10QU("STRATEGY_SCENE_LIVE_DIRECT", 37, 141, c10qv, "live_direct.json");
        STRATEGY_SCENE_LIVE_DIRECT = c10qu38;
        C10QU c10qu39 = new C10QU("STRATEGY_SCENE_NUJ_FOLLOW_TRENDING_CREATORS_PAGE", 38, 142, c10qv, "follow_trending_creators_page.json");
        STRATEGY_SCENE_NUJ_FOLLOW_TRENDING_CREATORS_PAGE = c10qu39;
        C10QU c10qu40 = new C10QU("STRATEGY_SCENE_NUJ_KMP_CONFIG", 39, 143, c10qv, "nuj_swipe_up_kmp.json");
        STRATEGY_SCENE_NUJ_KMP_CONFIG = c10qu40;
        C10QU[] c10quArr = {c10qu, c10qu2, c10qu3, c10qu4, c10qu5, c10qu6, c10qu7, c10qu8, c10qu9, c10qu10, c10qu11, c10qu12, c10qu13, c10qu14, c10qu15, c10qu16, c10qu17, c10qu18, c10qu19, c10qu20, c10qu21, c10qu22, c10qu23, c10qu24, c10qu25, c10qu26, c10qu27, c10qu28, c10qu29, c10qu30, c10qu31, c10qu32, c10qu33, c10qu34, c10qu35, c10qu36, c10qu37, c10qu38, c10qu39, c10qu40};
        LLILZ = c10quArr;
        LLILZIL = new C2254308sP(c10quArr);
        Companion = new Object() { // from class: X.10QX
        };
        InterfaceC2044707zh<C10QU> entries = getEntries();
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(entries, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ >= 16 ? iLIZIZ : 16);
        for (C10QU c10qu41 : entries) {
            linkedHashMap.put(Integer.valueOf(c10qu41.LL), c10qu41);
        }
        idToSceneMap = linkedHashMap;
    }

    public static C10QU[] values() {
        return (C10QU[]) LLILZ.clone();
    }

    public final String getDefaultJson() {
        return this.LLILLL;
    }

    public final int getId() {
        return this.LL;
    }

    public final C10QV getType() {
        return this.LLILLJJLI;
    }

    public static C10QU valueOf(String str) {
        return (C10QU) C08FF.LIZ(C10QU.class, str);
    }

    public C10QU(String str, int i, int i2, C10QV c10qv, String str2) {
        this.LL = i2;
        this.LLILLJJLI = c10qv;
        this.LLILLL = str2;
    }
}
