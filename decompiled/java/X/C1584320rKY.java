package X;

import android.os.Looper;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.ss.android.ugc.aweme.mob.event.IHomePageMobProvider;
import com.ss.android.ugc.aweme.mob.event.LiveHomePageMobProvider;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0rKY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1584320rKY {
    public static WeakReference<List<InterfaceC1583870rJp>> LIZJ;
    public static String LJ;
    public static String LJFF;
    public static String LJI;
    public static String LJII;
    public static String LJIIIIZZ;
    public static String LJIIIZ;
    public static boolean LJIIJ;
    public static final C1584320rKY LIZ = new C1584320rKY();
    public static List<? extends BottomTabProtocol> LIZIZ = C13BV.INSTANCE;
    public static boolean LIZLLL = true;
    public static final Set<String> LJIIJJI = C13LQ.LJLIIL(new String[]{"FRIENDS_TAB", "FRIENDS_FEED"});

    public static void LJ() {
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0rKa
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("HomePageMobHelper@3016.resetLogPublish$1");
                try {
                    C1584320rKY.LJIIJ = false;
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("HomePageMobHelper@3016.resetLogPublish$1");
            }
        });
    }

    public static String LJFF(String str) {
        if (Intrinsics.LJFF(str, EnumC1584360rKc.HOT.getKey())) {
            return "homepage_hot";
        }
        if (Intrinsics.LJFF(str, EnumC1584360rKc.FOLLOWING.getKey())) {
            return "homepage_follow";
        }
        if (Intrinsics.LJFF(str, EnumC1584360rKc.FRIENDS.getKey())) {
            return "homepage_friends";
        }
        if (Intrinsics.LJFF(str, EnumC1584360rKc.NEARBY.getKey())) {
            return "homepage_nearby";
        }
        if (Intrinsics.LJFF(str, EnumC1584360rKc.EXPLORE.getKey())) {
            return "homepage_explore";
        }
        if (Intrinsics.LJFF(str, EnumC1584360rKc.MALL.getKey())) {
            return "homepage_shop_mall";
        }
        if (Intrinsics.LJFF(str, EnumC1584360rKc.PROFILE.getKey())) {
            return "personal_homepage";
        }
        if (Intrinsics.LJFF(str, EnumC1584360rKc.INBOX.getKey())) {
            return "notification_page";
        }
        if (Intrinsics.LJFF(str, EnumC1584360rKc.POPULAR.getKey())) {
            return "homepage_popular";
        }
        if (Intrinsics.LJFF(str, EnumC1584360rKc.STEM.getKey())) {
            return "homepage_topic_stem";
        }
        if (Intrinsics.LJFF(str, EnumC1584360rKc.LIVE.getKey())) {
            return "homepage_live";
        }
        if (Intrinsics.LJFF(str, EnumC1584360rKc.DISCOVER.getKey())) {
            return "discover";
        }
        if (Intrinsics.LJFF(str, EnumC1584360rKc.TOP_LIVE.getKey())) {
            return "homepage_live_icon";
        }
        if (Intrinsics.LJFF(str, EnumC1584360rKc.SHOP_CART.getKey())) {
            return "homepage_shop_icon";
        }
        if (Intrinsics.LJFF(str, EnumC1584360rKc.SEARCH.getKey())) {
            return "homepage_search_icon";
        }
        if (Intrinsics.LJFF(str, EnumC1584360rKc.TOPIC0.getKey())) {
            return "homepage_topic_0";
        }
        if (Intrinsics.LJFF(str, EnumC1584360rKc.TOPIC1.getKey())) {
            return "homepage_topic_1";
        }
        if (Intrinsics.LJFF(str, EnumC1584360rKc.TOPIC2.getKey())) {
            return "homepage_topic_2";
        }
        if (Intrinsics.LJFF(str, EnumC1584360rKc.TOPIC3.getKey())) {
            return "homepage_topic_3";
        }
        if (Intrinsics.LJFF(str, EnumC1584360rKc.SHOOT.getKey())) {
            return "video_shoot_page";
        }
        if (Intrinsics.LJFF(str, EnumC1584360rKc.TAKO.getKey())) {
            return "homepage_tako_icon";
        }
        if (Intrinsics.LJFF(str, EnumC1584360rKc.SERIES_DISCOVER.getKey())) {
            return "series_discover";
        }
        if (Intrinsics.LJFF(str, "other_profile")) {
            return "others_homepage";
        }
        return "null";
    }

    public static String LJI(String str) {
        if (!Intrinsics.LJFF(str, "For You")) {
            if (Intrinsics.LJFF(str, "Following")) {
                return "homepage_follow";
            }
            if (!Intrinsics.LJFF(str, "FRIENDS_TAB") && !Intrinsics.LJFF(str, "FRIENDS_FEED")) {
                if (Intrinsics.LJFF(str, "Nearby")) {
                    return "homepage_nearby";
                }
                String str2 = "homepage_explore";
                if (!Intrinsics.LJFF(str, "homepage_explore")) {
                    if (!Intrinsics.LJFF(str, "SHOP_MALL") && !Intrinsics.LJFF(str, "Shop")) {
                        if (!Intrinsics.LJFF(str, "USER")) {
                            if (!Intrinsics.LJFF(str, "NOTIFICATION")) {
                                if (Intrinsics.LJFF(str, "Popular")) {
                                    return "homepage_popular";
                                }
                                if (Intrinsics.LJFF(str, "Stem")) {
                                    return "homepage_topic_stem";
                                }
                                if (!Intrinsics.LJFF(str, "Live")) {
                                    if (Intrinsics.LJFF(str, "DISCOVER")) {
                                        return "discover";
                                    }
                                    if (Intrinsics.LJFF(str, "SERIES_DISCOVER")) {
                                        return "series_discover";
                                    }
                                    str2 = "video_post_page";
                                    if (!Intrinsics.LJFF(str, "video_post_page")) {
                                        if (Intrinsics.LJFF(str, "REPOST_FEED")) {
                                            return "repost_feed";
                                        }
                                        if (Intrinsics.LJFF(str, "Playmode_Top")) {
                                            return "homepage_playmode_top";
                                        }
                                        if (Intrinsics.LJFF(str, "Playmode_New")) {
                                            return "homepage_playmode_new";
                                        }
                                        if (Intrinsics.LJFF(str, "Playmode_Moodboost")) {
                                            return "homepage_playmode_moodboost";
                                        }
                                        if (Intrinsics.LJFF(str, "Activity")) {
                                            return C1586050rNL.LIZIZ.LIZ(str);
                                        }
                                        if (Intrinsics.LJFF(str, "Drama")) {
                                            return "homepage_series";
                                        }
                                        if (!Intrinsics.LJFF(str, "PUBLISH")) {
                                            if (Intrinsics.LJFF(str, "INCENTIVE_COIN")) {
                                                return "coin";
                                            }
                                            if (!Intrinsics.LJFF(str, "HOME")) {
                                                if (!Intrinsics.LJFF(str, EnumC1584350rKb.INBOX.getTag())) {
                                                    if (!Intrinsics.LJFF(str, EnumC1584350rKb.MY_PROFILE.getTag())) {
                                                        if (Intrinsics.LJFF(str, EnumC1584350rKb.SEARCH.getTag())) {
                                                            return "homepage_search_icon";
                                                        }
                                                        if (!Intrinsics.LJFF(str, EnumC1584350rKb.LIVE.getTag())) {
                                                            if (!Intrinsics.LJFF(str, EnumC1584350rKb.PUBLISH.getTag())) {
                                                                if (str != null) {
                                                                    return str;
                                                                }
                                                                return "be_null";
                                                            }
                                                            return "shoot";
                                                        }
                                                        return "homepage_live";
                                                    }
                                                    return "personal_homepage";
                                                }
                                                return "notification_page";
                                            }
                                            return "homepage_hot";
                                        }
                                        return "shoot";
                                    }
                                } else {
                                    return "homepage_live";
                                }
                            } else {
                                return "notification_page";
                            }
                        } else {
                            return "personal_homepage";
                        }
                    } else {
                        return "homepage_shop_mall";
                    }
                }
                return str2;
            }
            return "homepage_friends";
        }
        return "homepage_hot";
    }

    public static EnumC1584360rKc LJII(String str) {
        if (Intrinsics.LJFF(str, "For You")) {
            return EnumC1584360rKc.HOT;
        }
        if (Intrinsics.LJFF(str, "Following")) {
            return EnumC1584360rKc.FOLLOWING;
        }
        if (!Intrinsics.LJFF(str, "FRIENDS_TAB") && !Intrinsics.LJFF(str, "FRIENDS_FEED")) {
            if (Intrinsics.LJFF(str, "Nearby")) {
                return EnumC1584360rKc.NEARBY;
            }
            if (Intrinsics.LJFF(str, "homepage_explore")) {
                return EnumC1584360rKc.EXPLORE;
            }
            if (!Intrinsics.LJFF(str, "SHOP_MALL") && !Intrinsics.LJFF(str, "Shop")) {
                if (Intrinsics.LJFF(str, "USER")) {
                    return EnumC1584360rKc.PROFILE;
                }
                if (Intrinsics.LJFF(str, "NOTIFICATION")) {
                    return EnumC1584360rKc.INBOX;
                }
                if (Intrinsics.LJFF(str, "Popular")) {
                    return EnumC1584360rKc.POPULAR;
                }
                if (Intrinsics.LJFF(str, "Stem")) {
                    return EnumC1584360rKc.STEM;
                }
                if (Intrinsics.LJFF(str, "Drama")) {
                    return EnumC1584360rKc.SERIES;
                }
                if (Intrinsics.LJFF(str, "Live")) {
                    return EnumC1584360rKc.LIVE;
                }
                if (Intrinsics.LJFF(str, "PUBLISH")) {
                    return EnumC1584360rKc.SHOOT;
                }
                if (Intrinsics.LJFF(str, EnumC1584350rKb.LIVE.getTag())) {
                    return EnumC1584360rKc.TOP_LIVE;
                }
                if (Intrinsics.LJFF(str, EnumC1584350rKb.SEARCH.getTag())) {
                    return EnumC1584360rKc.SEARCH;
                }
                if (Intrinsics.LJFF(str, EnumC1584350rKb.STORY.getTag())) {
                    return EnumC1584360rKc.STORY;
                }
                if (Intrinsics.LJFF(str, EnumC1584350rKb.STORY_CAMERA.getTag())) {
                    return EnumC1584360rKc.STORY_CAMERA;
                }
                if (Intrinsics.LJFF(str, EnumC1584350rKb.PUBLISH.getTag())) {
                    return EnumC1584360rKc.SHOOT;
                }
                if (Intrinsics.LJFF(str, EnumC1584350rKb.SHOP_CART.getTag())) {
                    return EnumC1584360rKc.SHOP_CART;
                }
                if (Intrinsics.LJFF(str, "DISCOVER")) {
                    return EnumC1584360rKc.DISCOVER;
                }
                if (Intrinsics.LJFF(str, EnumC1584350rKb.TAKO.getTag())) {
                    return EnumC1584360rKc.TAKO;
                }
                return null;
            }
            return EnumC1584360rKc.MALL;
        }
        return EnumC1584360rKc.FRIENDS;
    }

    public static EnumC1584360rKc LJIIIIZZ(String str) {
        if (Intrinsics.LJFF(str, "For You")) {
            return EnumC1584360rKc.HOT;
        }
        if (Intrinsics.LJFF(str, "Following")) {
            return EnumC1584360rKc.FOLLOWING;
        }
        if (!Intrinsics.LJFF(str, "FRIENDS_TAB") && !Intrinsics.LJFF(str, "FRIENDS_FEED")) {
            if (Intrinsics.LJFF(str, "Nearby")) {
                return EnumC1584360rKc.NEARBY;
            }
            if (Intrinsics.LJFF(str, "homepage_explore")) {
                return EnumC1584360rKc.EXPLORE;
            }
            if (!Intrinsics.LJFF(str, "SHOP_MALL") && !Intrinsics.LJFF(str, "Shop")) {
                if (Intrinsics.LJFF(str, "USER")) {
                    return EnumC1584360rKc.PROFILE;
                }
                if (Intrinsics.LJFF(str, "NOTIFICATION")) {
                    return EnumC1584360rKc.INBOX;
                }
                if (Intrinsics.LJFF(str, "Popular")) {
                    return EnumC1584360rKc.POPULAR;
                }
                if (Intrinsics.LJFF(str, "Stem")) {
                    return EnumC1584360rKc.STEM;
                }
                if (Intrinsics.LJFF(str, "Drama")) {
                    return EnumC1584360rKc.SERIES;
                }
                if (Intrinsics.LJFF(str, "Live")) {
                    return EnumC1584360rKc.LIVE;
                }
                if (Intrinsics.LJFF(str, "PUBLISH")) {
                    return EnumC1584360rKc.SHOOT;
                }
                if (Intrinsics.LJFF(str, "HOME")) {
                    return EnumC1584360rKc.HOME;
                }
                if (Intrinsics.LJFF(str, EnumC1584350rKb.LIVE.getTag())) {
                    return EnumC1584360rKc.TOP_LIVE;
                }
                if (Intrinsics.LJFF(str, EnumC1584350rKb.SEARCH.getTag())) {
                    return EnumC1584360rKc.SEARCH;
                }
                if (Intrinsics.LJFF(str, EnumC1584350rKb.STORY.getTag())) {
                    return EnumC1584360rKc.STORY;
                }
                if (Intrinsics.LJFF(str, EnumC1584350rKb.STORY_CAMERA.getTag())) {
                    return EnumC1584360rKc.STORY_CAMERA;
                }
                if (Intrinsics.LJFF(str, EnumC1584350rKb.PUBLISH.getTag())) {
                    return EnumC1584360rKc.SHOOT;
                }
                if (Intrinsics.LJFF(str, EnumC1584350rKb.SHOP_CART.getTag())) {
                    return EnumC1584360rKc.SHOP_CART;
                }
                if (Intrinsics.LJFF(str, "DISCOVER")) {
                    return EnumC1584360rKc.DISCOVER;
                }
                if (Intrinsics.LJFF(str, EnumC1584350rKb.TAKO.getTag())) {
                    return EnumC1584360rKc.TAKO;
                }
                if (Intrinsics.LJFF(str, "SERIES_DISCOVER")) {
                    return EnumC1584360rKc.SERIES_DISCOVER;
                }
                return null;
            }
            return EnumC1584360rKc.MALL;
        }
        return EnumC1584360rKc.FRIENDS;
    }

    public static String LJIIIZ(EnumC1584360rKc enumC1584360rKc) {
        switch (C1584310rKX.LIZ[enumC1584360rKc.ordinal()]) {
            case 1:
                return "homepage_hot";
            case 2:
                return "homepage_follow";
            case 3:
                return "homepage_friends";
            case 4:
                return "homepage_nearby";
            case 5:
                return "homepage_explore";
            case 6:
                return "homepage_shop_mall";
            case 7:
                return "personal_homepage";
            case 8:
                return "notification_page";
            case BdTuring.TYPE_ECAF /* 9 */:
                return "homepage_popular";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return "homepage_topic_stem";
            case BdTuring.TYPE_EMAIL /* 11 */:
                return "homepage_live";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return "homepage_live_icon";
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return "homepage_search_icon";
            case 14:
            case 15:
            default:
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("homepage_");
                sbLIZ.append(enumC1584360rKc.getKey());
                return C2188811AlT.LIZIZ(sbLIZ);
            case 16:
                return "shoot";
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return "homepage_shop_icon";
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return "discover";
            case 19:
                return "homepage_tako_icon";
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return "series_discover";
            case 21:
                return "homepage_topic_0";
            case 22:
                return "homepage_topic_1";
            case 23:
                return "homepage_topic_2";
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return "homepage_topic_3";
        }
    }

    public static String LJIIJ(EnumC1584360rKc enumC1584360rKc) {
        switch (C1584310rKX.LIZ[enumC1584360rKc.ordinal()]) {
            case 1:
                return "For You";
            case 2:
                return "Following";
            case 3:
                C1585070rLl c1585070rLl = C1585070rLl.LIZ;
                EnumC1584360rKc enumC1584360rKc2 = EnumC1584360rKc.FRIENDS;
                c1585070rLl.getClass();
                if (C1585070rLl.LJIIJJI(enumC1584360rKc2)) {
                    return "FRIENDS_TAB";
                }
                return "FRIENDS_FEED";
            case 4:
                return "Nearby";
            case 5:
                return "homepage_explore";
            case 6:
                C1585070rLl c1585070rLl2 = C1585070rLl.LIZ;
                EnumC1584360rKc enumC1584360rKc3 = EnumC1584360rKc.MALL;
                c1585070rLl2.getClass();
                if (C1585070rLl.LJIIJJI(enumC1584360rKc3)) {
                    return "Shop";
                }
                return "SHOP_MALL";
            case 7:
                return "USER";
            case 8:
                return "NOTIFICATION";
            case BdTuring.TYPE_ECAF /* 9 */:
                return "Popular";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return "Stem";
            case BdTuring.TYPE_EMAIL /* 11 */:
                return "Live";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return EnumC1584350rKb.LIVE.getTag();
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return EnumC1584350rKb.SEARCH.getTag();
            case 14:
                return EnumC1584350rKb.STORY.getTag();
            case 15:
                return EnumC1584350rKb.STORY_CAMERA.getTag();
            case 16:
                return EnumC1584350rKb.PUBLISH.getTag();
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return EnumC1584350rKb.SHOP_CART.getTag();
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return "DISCOVER";
            case 19:
                return EnumC1584350rKb.TAKO.getTag();
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return "SERIES_DISCOVER";
            default:
                return "be_null";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.Pair LIZIZ(X.C19EG r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1584320rKY.LIZIZ(X.19EG, java.lang.String):kotlin.Pair");
    }

    public static void LIZLLL(C19EG c19eg, String str) throws JSONException {
        if (LJIIJ || c19eg == null) {
            return;
        }
        Pair pairLIZIZ = LIZIZ(c19eg, str);
        LJ = "publish_landing";
        LIZJ("video_post_page", str, null, (String) pairLIZIZ.getFirst(), ((Boolean) pairLIZIZ.getSecond()).booleanValue(), c19eg);
        LJIIJ = true;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [X.04zy] */
    public static void LIZ(String str, C19EG c19eg, JSONObject jSONObject) throws JSONException {
        List listLIZIZ;
        Map<String, Object> mapKeyParams;
        if (c19eg != null && (listLIZIZ = C1554610qYd.LIZIZ(C1558360qeg.LJI(c19eg, null), IHomePageMobProvider.class, false)) != null) {
            for (IHomePageMobProvider iHomePageMobProvider : (ArrayList) listLIZIZ) {
                LIZ.getClass();
                if (iHomePageMobProvider instanceof LiveHomePageMobProvider) {
                    if (Intrinsics.LJFF(str, "homepage_live")) {
                        iHomePageMobProvider.getClass();
                        for (Map.Entry entry : ((LinkedHashMap) LiveHomePageMobProvider.LIZ().keyParams()).entrySet()) {
                            jSONObject.put((String) entry.getKey(), entry.getValue());
                        }
                    }
                } else {
                    ?? param = iHomePageMobProvider.getParam();
                    if (param != 0 && (mapKeyParams = param.keyParams()) != null) {
                        for (Map.Entry<String, Object> entry2 : mapKeyParams.entrySet()) {
                            jSONObject.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0123  */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v19, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(java.lang.String r20, final java.lang.String r21, final java.lang.String r22, final java.lang.String r23, boolean r24, final X.C19EG r25) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1584320rKY.LIZJ(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, X.19EG):void");
    }
}
