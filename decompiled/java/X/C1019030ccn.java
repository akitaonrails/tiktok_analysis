package X;

import Y.ARunnableS24S0400000_16;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.IAdReRankServiceManagerService;
import com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService;
import com.bytedance.ies.ugc.aweme.commercialize.search.setting.CommerceSearchAdConfigSetting;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAAnchorService;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.n;
import com.google.gson.p;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.ad.feed.experiment.VSAProductIdRecordSetting;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.commercialize.AwemeContextServiceImpl;
import com.ss.android.ugc.aweme.commercialize.appmeasurement.IAppMeasurementProvider;
import com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper;
import com.ss.android.ugc.aweme.commercialize.measurement.IMeasurementService;
import com.ss.android.ugc.aweme.commercialize.model.LinkData;
import com.ss.android.ugc.aweme.commercialize.model.OmVast;
import com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService;
import com.ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl;
import com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService;
import com.ss.android.ugc.aweme.commercialize.service.IAwemeContextService;
import com.ss.android.ugc.aweme.commercialize.track.RawURLGetter;
import com.ss.android.ugc.aweme.feed.model.AdLive;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS630S0100000_16;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ccn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1019030ccn {
    public static final List<String> LIZ = Arrays.asList("jump_sdk_otherclick", "jump_sdk_click", "pause", "resume", "skip", "click", "buffer_start", "buffer_end", "slide", "splash_click", "otherclick");
    public static final List<String> LIZIZ = Arrays.asList("draw_ad", "result_ad");
    public static final List<String> LIZJ = Arrays.asList("click", "otherclick", "music_click");
    public static final IAppMeasurementProvider LIZLLL = (IAppMeasurementProvider) PluggableExtentionKt.pluggableSpi(IAppMeasurementProvider.class);

    public static void LIZ(C1022820ciu c1022820ciu) {
        InterfaceC1603020roi interfaceC1603020roiLIZIZ;
        IAdReRankServiceManagerService iAdReRankServiceManagerService = (IAdReRankServiceManagerService) PluggableExtentionKt.pluggableSpi(IAdReRankServiceManagerService.class);
        if (iAdReRankServiceManagerService != null) {
            interfaceC1603020roiLIZIZ = iAdReRankServiceManagerService.LIZIZ(EnumC584610MwN.FEED);
            if (interfaceC1603020roiLIZIZ != null) {
                c1022820ciu.LIZIZ(Long.valueOf(interfaceC1603020roiLIZIZ.N4()), "last_ad_show_time");
            }
        } else {
            interfaceC1603020roiLIZIZ = null;
        }
        PluggableExtentionKt.pluggableSpi(ICommerceService.class);
        if (interfaceC1603020roiLIZIZ != null) {
            c1022820ciu.LIZIZ(Long.valueOf(interfaceC1603020roiLIZIZ.X4()), "last_ad_end_showtime");
        }
    }

    public static JSONObject LIZLLL(long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            HashMap map = new HashMap();
            map.put("launchduration", Long.valueOf(j));
            jSONObject.put("ad_extra_data", GsonProtectorUtils.toJson(new Gson(), map));
            jSONObject.put("is_ad_event", "1");
            return jSONObject;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            return jSONObject;
        }
    }

    public static Map<String, String> LJ(int i) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map2.put("play_order", Integer.valueOf(i));
        map.put("ad_extra_data", GsonProtectorUtils.toJson(new Gson(), map2));
        return map;
    }

    public static Map<String, String> LJFF(Map<String, Object> map) {
        HashMap map2 = new HashMap();
        map2.put("ad_extra_data", GsonProtectorUtils.toJson(new Gson(), map));
        return map2;
    }

    public static String LJI(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        if (AwemeSaaSExtKt.isLive(aweme)) {
            if (aweme.getRoomFeedCellStruct() != null && aweme.getRoomFeedCellStruct().getNewLiveRoomData() != null) {
                return String.valueOf(aweme.getRoomFeedCellStruct().getNewLiveRoomData().getAnchorId());
            }
        } else if (aweme.getAuthor() != null && (aweme.getAuthor().isLive() || C1017070cZd.LJIIIIZZ(aweme))) {
            return String.valueOf(aweme.getAuthor().getUid());
        }
        return null;
    }

    public static String LJII(AwemeRawAd awemeRawAd) {
        Long creativeId = awemeRawAd.getCreativeId();
        if (creativeId == null) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        return String.valueOf(creativeId);
    }

    public static long LJIILJJIL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        Long groupId;
        if (!AwemeExtKt.isAdTraffic(aweme) || (awemeRawAd = aweme.getAwemeRawAd()) == null || (groupId = awemeRawAd.getGroupId()) == null) {
            return 0L;
        }
        return groupId.longValue();
    }

    public static Map<String, Object> LJIILL(Aweme aweme) {
        long jLJI = C1045340dJE.LJIJI().LJI();
        int i = C1045340dJE.LJIJI().LJIIJ + 1;
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(jLJI));
        map.put("play_order", Integer.valueOf(i));
        String strLIZIZ = C735610StL.LIZIZ(aweme);
        if (strLIZIZ != null && !strLIZIZ.isEmpty()) {
            map.put("bsh_video_id", strLIZIZ);
        }
        return map;
    }

    public static String LJIIZILJ(Aweme aweme) {
        AdLive adLive;
        User redirectLiveAuthor;
        Long lValueOf;
        if (aweme == null) {
            return null;
        }
        if (AwemeSaaSExtKt.isLive(aweme)) {
            if (aweme.getRoomFeedCellStruct() != null && aweme.getRoomFeedCellStruct().getNewLiveRoomData() != null) {
                return String.valueOf(aweme.getRoomFeedCellStruct().getNewLiveRoomData().id);
            }
        } else {
            if (C1017070cZd.LJIIIIZZ(aweme)) {
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                if (awemeRawAd == null || (adLive = awemeRawAd.getAdLive()) == null || (redirectLiveAuthor = adLive.getRedirectLiveAuthor()) == null || (lValueOf = Long.valueOf(redirectLiveAuthor.roomId)) == null) {
                    return null;
                }
                return String.valueOf(lValueOf);
            }
            if (aweme.getAuthor() != null && aweme.getAuthor().isLive()) {
                return String.valueOf(aweme.getAuthor().roomId);
            }
        }
        return null;
    }

    public static boolean LJIJ(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null || aweme.getAwemeRawAd().getReusableExtraParam("aweme_updated") == null) {
            return false;
        }
        return true;
    }

    public static JSONObject LJIIIZ(Context context, Aweme aweme) {
        return LJIIJJI(context, aweme, false, null);
    }

    public static boolean LJIJI(Context context, Aweme aweme) {
        if (context == null || aweme == null) {
            return false;
        }
        return AwemeExtKt.isAdTraffic(aweme);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIJJ(android.content.Context r13, X.C1019060ccq r14) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1019030ccn.LJIJJ(android.content.Context, X.0ccq):void");
    }

    public static void LJJ(Context context, Aweme aweme) {
        LJJJIL(context, "replay", aweme, LJIIJ(context, aweme, "button"));
        if (C1017070cZd.LJJLIIJ(aweme)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            C2201701BEy c2201701BEy = C2201701BEy.LIZ;
            UrlModel playTrackUrlList = awemeRawAd.getPlayTrackUrlList();
            Long creativeId = awemeRawAd.getCreativeId();
            String logExtra = awemeRawAd.getLogExtra();
            c2201701BEy.getClass();
            C2201701BEy.LIZ("play", playTrackUrlList, creativeId, logExtra);
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("background_ad", "replay", aweme.getAwemeRawAd());
            c1022820ciuLIZLLL.LIZJ("button", "refer");
            c1022820ciuLIZLLL.LIZIZ(0, "is_lynx");
            c1022820ciuLIZLLL.LJIIIIZZ();
        }
    }

    public static void LJJIJ(Context context, final Aweme aweme) {
        Integer numLJIIJJI;
        boolean z;
        boolean z2;
        Integer num;
        int i;
        Integer num2;
        JSONObject jSONObject;
        OmVast omVast;
        C1045270dJ7 c1045270dJ7;
        Set<String> set;
        String studyId;
        if (aweme != null) {
            HashMap map = new HashMap();
            AwemeCommerceStruct commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo();
            if (commerceVideoAuthInfo != null && (studyId = commerceVideoAuthInfo.getStudyId()) != null) {
                numLJIIJJI = C2095008Iq.LJIIJJI(studyId);
            } else {
                numLJIIJJI = null;
            }
            IAppMeasurementProvider iAppMeasurementProvider = LIZLLL;
            if (iAppMeasurementProvider != null && iAppMeasurementProvider.LIZJ(aweme, "RawAdShow")) {
                z = true;
            } else {
                z = false;
            }
            boolean zLJFF = C2264471DkD.LJFF();
            boolean zLJ = C2264471DkD.LJ();
            boolean zLIZJ = C2264471DkD.LIZJ();
            if (zLJ && z) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                AwemeRawAd awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme);
                if (awemeRawAdLJJIJLIJ != null) {
                    awemeRawAdLJJIJLIJ.removeReusableExtraParam("expose_from");
                    awemeRawAdLJJIJLIJ.removeReusableExtraParam("expose_page");
                }
            } else if (C1017070cZd.LLIZLLLIL(aweme)) {
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                HashMap map2 = new HashMap();
                try {
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    if (C0C64.LJIILLIIL().LJIIIZ(31744, "topview_valid_time", true, false)) {
                        map2 = new HashMap();
                        try {
                            map2.put("validTimeDiff", Long.valueOf(C2212161Bi2.LJII() - System.currentTimeMillis()));
                            map2.put("useTime", Long.valueOf(C2212161Bi2.LJII()));
                            map2.put("clientTime", Long.valueOf(System.currentTimeMillis()));
                            int i2 = C2212161Bi2.LIZ;
                            if (i2 == -1) {
                                i2 = -1;
                            }
                            map2.put("validTimeDebugCode", Integer.valueOf(i2));
                            map2.put("preRemoteTime", Long.valueOf(C2212141Bi0.LJIIIIZZ().LJIIJ()));
                            map2.put("preLaunchTime", Long.valueOf(C2212141Bi0.LJIIIIZZ().LJIIIZ()));
                            map2.put("curLaunchTime", Long.valueOf(SystemClock.elapsedRealtime()));
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            C0VO0.LIZ("error in putting data into json");
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    TryCatchGuardChecker.doCheck(th);
                    C1AF0.LJ(th);
                }
                C588810N7n.LIZ.getClass();
                if (!C588810N7n.LJFF) {
                    i = 2;
                } else {
                    i = 1;
                }
                if (!TextUtils.isEmpty(C1030680cva.LJIIIIZZ)) {
                    map2.put("splash_req_id", C1030680cva.LJIIIIZZ);
                    C1030680cva.LJIIIIZZ = null;
                }
                map2.put("awemelaunch", String.valueOf(i));
                ISplashAdService iSplashAdService = (ISplashAdService) ServiceManager.get().getService(ISplashAdService.class);
                if (iSplashAdService != null) {
                    map2.put("ad_sequence", Integer.valueOf(iSplashAdService.LJJIJIIJIL()));
                    C0TT1 c0tt1LJJIZ = iSplashAdService.LJJIZ();
                    if (c0tt1LJJIZ != null) {
                        map2.put("open_times", Integer.valueOf(c0tt1LJJIZ.LIZLLL()));
                    }
                }
                C0CF8.LIZ.getClass();
                map2.put("device_overall_score", Float.valueOf(C0CF8.LIZ()));
                map.put("ad_extra_data", GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), map2));
                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "show", aweme.getAwemeRawAd());
                c1022820ciuLIZLLL.LIZIZ(String.valueOf(i), "awemelaunch");
                c1022820ciuLIZLLL.LIZ(map2);
                c1022820ciuLIZLLL.LIZJ(numLJIIJJI, "study_id");
                if (awemeRawAd != null && awemeRawAd.isReshowAd()) {
                    c1022820ciuLIZLLL.LIZIZ(1, "is_reshow");
                }
                String str = C1019270cdB.LIZ;
                c1022820ciuLIZLLL.LIZIZ(C1019270cdB.LIZIZ(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId()), "user_session");
                c1022820ciuLIZLLL.LIZIZ(C1019270cdB.LIZ(aweme.getAid()), "impression_frequency");
                if (LJIJ(aweme)) {
                    num2 = 1;
                } else {
                    num2 = null;
                }
                c1022820ciuLIZLLL.LIZIZ(num2, "aweme_updated");
                LIZ(c1022820ciuLIZLLL);
                LJJIZ(c1022820ciuLIZLLL, aweme);
                c1022820ciuLIZLLL.LJIIIIZZ();
                if (awemeRawAd != null) {
                    awemeRawAd.setReportTopviewShown(true);
                }
            } else if (AwemeExtKt.isAdTraffic(aweme) || C1017070cZd.LLILII(aweme)) {
                AwemeRawAd awemeRawAdLJJIJLIJ2 = C1017070cZd.LJJIJLIJ(aweme);
                awemeRawAdLJJIJLIJ2.getReusableExtraParam("expose_page");
                C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("draw_ad", "show", awemeRawAdLJJIJLIJ2);
                String str2 = "1";
                if (C1017070cZd.LLILII(aweme)) {
                    C2268371DqV.LIZ.getClass();
                    c1022820ciuLIZLLL2.LIZIZ("1", C2268371DqV.LIZLLL.LIZ);
                    c1022820ciuLIZLLL2.LIZIZ(awemeRawAdLJJIJLIJ2.getPageFrom(), "enter_from");
                    if (((IBAAnchorService) ServiceManager.get().getService(IBAAnchorService.class)).LJII(aweme)) {
                        c1022820ciuLIZLLL2.LIZIZ(1, "has_ba_anchor");
                    }
                }
                c1022820ciuLIZLLL2.LIZJ(numLJIIJJI, "study_id");
                c1022820ciuLIZLLL2.LIZIZ(LJI(aweme), "anchor_id");
                c1022820ciuLIZLLL2.LIZIZ(LJIIZILJ(aweme), "room_id");
                C0CF8.LIZ.getClass();
                c1022820ciuLIZLLL2.LIZIZ(Float.valueOf(C0CF8.LIZ()), "device_overall_score");
                if (awemeRawAdLJJIJLIJ2.isReshowAd()) {
                    c1022820ciuLIZLLL2.LIZIZ(1, "is_reshow");
                }
                if (C1017070cZd.LLIIL(aweme)) {
                    c1022820ciuLIZLLL2.LIZJ("image", "refer");
                }
                if (C707230Rof.LIZLLL(aweme)) {
                    c1022820ciuLIZLLL2.LIZ(C707230Rof.LIZIZ(aweme));
                }
                if (z) {
                    if (zLIZJ) {
                        c1022820ciuLIZLLL2.LIZIZ("1", "ams_also_reported");
                    }
                    if (zLJFF) {
                        c1022820ciuLIZLLL2.LIZIZ("1", "track_from_online_in_ams");
                    }
                }
                if (C1017180cZo.LJIJJLI(awemeRawAdLJJIJLIJ2)) {
                    c1022820ciuLIZLLL2.LIZJ("search_iac", "refer");
                }
                String str3 = C1019270cdB.LIZ;
                c1022820ciuLIZLLL2.LIZIZ(C1019270cdB.LIZIZ(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId()), "user_session");
                c1022820ciuLIZLLL2.LIZIZ(C1019270cdB.LIZ(aweme.getAid()), "impression_frequency");
                c1022820ciuLIZLLL2.LIZIZ(C1045340dJE.LJIIZILJ(aweme), "bsh_video_id");
                c1022820ciuLIZLLL2.LIZIZ(C1045340dJE.LJ(aweme), "bsh_card_area");
                if (LJIJ(aweme)) {
                    num = 1;
                } else {
                    num = null;
                }
                c1022820ciuLIZLLL2.LIZIZ(num, "aweme_updated");
                LJJIZ(c1022820ciuLIZLLL2, aweme);
                AwemeRawAd awemeRawAdLJJIJLIJ3 = C1017070cZd.LJJIJLIJ(aweme);
                if (awemeRawAdLJJIJLIJ3 != null) {
                    String incentiveInfo = awemeRawAdLJJIJLIJ3.getIncentiveInfo();
                    if (!TextUtils.isEmpty(incentiveInfo)) {
                        c1022820ciuLIZLLL2.LIZIZ(incentiveInfo, "coupon_info");
                    }
                }
                AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                if (awemeRawAd2 != null && C1017180cZo.LJIILJJIL(awemeRawAd2)) {
                    C1048110dNh.LIZLLL.getClass();
                    c1022820ciuLIZLLL2.LIZIZ(Integer.valueOf(C1048110dNh.LIZIZ().LIZLLL()), "playable_loading_status");
                }
                C1048110dNh.LIZLLL.getClass();
                new C1019670cdp();
                Map<String, String> mapLIZIZ = C1019670cdp.LIZIZ(aweme);
                if (mapLIZIZ != null && !mapLIZIZ.isEmpty()) {
                    for (Map.Entry<String, String> entry : mapLIZIZ.entrySet()) {
                        if (!"1".equals(entry.getValue()) && !CardStruct.IStatusCode.DEFAULT.equals(entry.getValue())) {
                            c1022820ciuLIZLLL2.LIZIZ(entry.getValue(), entry.getKey());
                        } else {
                            c1022820ciuLIZLLL2.LIZIZ(C2088108Fz.LIZ(entry.getValue()), entry.getKey());
                        }
                    }
                }
                LIZ(c1022820ciuLIZLLL2);
                AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
                if (awemeRawAd3 != null && "homepage_hot".equals(awemeRawAd3.getReusableExtraParam("expose_page"))) {
                    C1879340z0O c1879340z0OLIZ = C1619720sFe.LIZ.LIZ(76);
                    if (c1879340z0OLIZ instanceof C1009500cNQ) {
                        if (!((C1009500cNQ) c1879340z0OLIZ).LIZJ()) {
                            str2 = CardStruct.IStatusCode.DEFAULT;
                        }
                        c1022820ciuLIZLLL2.LIZIZ(str2, "disable_feed_incentive_ads");
                    }
                }
                c1022820ciuLIZLLL2.LJIIIIZZ();
            }
            AwemeRawAd awemeRawAdLJJIJLIJ4 = C1017070cZd.LJJIJLIJ(aweme);
            if (AwemeExtKt.isAdTraffic(aweme) && awemeRawAdLJJIJLIJ4 != null) {
                C2201701BEy c2201701BEy = C2201701BEy.LIZ;
                UrlModel trackUrlList = awemeRawAdLJJIJLIJ4.getTrackUrlList();
                Long creativeId = awemeRawAdLJJIJLIJ4.getCreativeId();
                String logExtra = awemeRawAdLJJIJLIJ4.getLogExtra();
                c2201701BEy.getClass();
                C2201701BEy.LIZ("show", trackUrlList, creativeId, logExtra);
            }
            C1045220dJ2 c1045220dJ2 = C1045220dJ2.LIZ;
            AwemeRawAd awemeRawAd4 = aweme.getAwemeRawAd();
            if (awemeRawAd4 != null && (omVast = awemeRawAd4.getOmVast()) != null && (c1045270dJ7 = omVast.vast) != null && (set = c1045270dJ7.impressionSet) != null) {
                C08QT c08qt = new C08QT(C09RB.LJIIIZ(new C1939607ik(set), AFwS229S0000000_2.get$arr$(569)));
                while (c08qt.hasNext()) {
                    final String str4 = (String) c08qt.next();
                    final long jCurrentTimeMillis = System.currentTimeMillis();
                    RawURLGetter.LIZ(str4, new C0XI1() { // from class: X.0O0a
                        @Override // X.C0XI1
                        public final void LIZ(int i3, boolean z3, Exception exc) {
                            String message;
                            if (!z3) {
                                C1020020ceO c1020020ceOLIZ = C1020030ceP.LIZ();
                                c1020020ceOLIZ.LJ(aweme);
                                c1020020ceOLIZ.LIZ = "draw_ad";
                                c1020020ceOLIZ.LIZIZ = "load_failed";
                                Pair[] pairArr = new Pair[3];
                                pairArr[0] = new Pair("error_message", "vast_imp_tracker_bad_response");
                                pairArr[1] = new Pair("error_code", Integer.valueOf(i3));
                                String message2 = null;
                                if (exc != null) {
                                    message = exc.getMessage();
                                } else {
                                    message = null;
                                }
                                pairArr[2] = new Pair("error_detail", message);
                                c1020020ceOLIZ.LIZ(C2097608Jq.LJIIIIZZ(pairArr));
                                c1020020ceOLIZ.LJIIJ(null);
                                C1022820ciu c1022820ciuLIZLLL3 = C2184171Adz.LIZLLL("draw_ad", "load_failed", aweme.getAwemeRawAd());
                                c1022820ciuLIZLLL3.LIZIZ("vast_imp_tracker_bad_response", "error_message");
                                c1022820ciuLIZLLL3.LIZIZ(Integer.valueOf(i3), "error_code");
                                if (exc != null) {
                                    message2 = exc.getMessage();
                                }
                                c1022820ciuLIZLLL3.LIZIZ(message2, "error_detail");
                                c1022820ciuLIZLLL3.LJIIIIZZ();
                            }
                            C1045220dJ2.LJIIJJI(C1045220dJ2.LIZ, str4, String.valueOf(i3), jCurrentTimeMillis, "show", aweme, null, 32);
                        }
                    });
                }
            }
            JSONObject jSONObjectLJIIIZ = LJIIIZ(context, aweme);
            try {
                new p();
                n nVarLJIILIIL = p.LIZJ(JSONObjectProtectorUtils.getString(jSONObjectLJIIIZ, "log_extra")).LJIILIIL();
                jSONObject = new JSONObject();
                if (nVarLJIILIIL.LJJIIZ("rit") != null) {
                    jSONObject.put("ctr_rit", nVarLJIILIIL.LJJIIZ("rit").LJIL());
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                C1AF0.LJ(e2);
                jSONObject = null;
            }
            C794420VEi.LIZIZ("ctr_monitor", "ctr_show", jSONObject);
        }
    }

    public static void LJJIJIIJIL(Context context, Aweme aweme) {
        HashMap map = new HashMap();
        map.put("render_type", "lynx");
        LJJJJ(context, "open_url_h5", aweme, LJIIJJI(context, aweme, false, LJFF(map)));
    }

    public static void LJJIL(Context context, Aweme aweme) {
        C1020020ceO c1020020ceOLIZ = C1020030ceP.LIZ();
        c1020020ceOLIZ.LIZ = "homepage_ad";
        c1020020ceOLIZ.LIZIZ = "resume";
        c1020020ceOLIZ.LJ(aweme);
        c1020020ceOLIZ.LJIIJ(context);
        if (aweme != null) {
            C2184171Adz.LIZLLL("homepage_ad", "resume", aweme.getAwemeRawAd()).LJIIIIZZ();
        }
    }

    public static void LJJIZ(C1022820ciu c1022820ciu, Aweme aweme) {
        Object obj;
        Object obj2;
        Object obj3 = "live";
        if (AwemeSaaSExtKt.isLive(aweme)) {
            obj = "live";
        } else {
            obj = "video";
        }
        c1022820ciu.LIZIZ(obj, "content_type");
        c1022820ciu.LIZIZ(LJIIZILJ(aweme), "room_id");
        c1022820ciu.LIZIZ(aweme.getAid(), "item_id");
        IAwemeContextService iAwemeContextServiceLIZ = AwemeContextServiceImpl.LIZ();
        if (iAwemeContextServiceLIZ != null && iAwemeContextServiceLIZ.LLLLII(aweme.getAid())) {
            Aweme awemeLLLJIL = iAwemeContextServiceLIZ.LLLJIL();
            if (awemeLLLJIL != null) {
                if (AwemeSaaSExtKt.isLive(awemeLLLJIL)) {
                    obj2 = "live";
                } else {
                    obj2 = "video";
                }
                c1022820ciu.LIZIZ(obj2, "before_content_type");
                c1022820ciu.LIZIZ(LJIIZILJ(awemeLLLJIL), "before_room_id");
                c1022820ciu.LIZIZ(awemeLLLJIL.getAid(), "before_item_id");
            }
            Aweme awemeLLLJ = iAwemeContextServiceLIZ.LLLJ();
            if (awemeLLLJ != null) {
                if (!AwemeSaaSExtKt.isLive(awemeLLLJ)) {
                    obj3 = "video";
                }
                c1022820ciu.LIZIZ(obj3, "after_content_type");
                c1022820ciu.LIZIZ(LJIIZILJ(awemeLLLJ), "after_room_id");
                c1022820ciu.LIZIZ(awemeLLLJ.getAid(), "after_item_id");
                return;
            }
            return;
        }
        if (C1030680cva.LJ) {
            String str = C1030680cva.LJIJJ;
            if (!TextUtils.isEmpty(str)) {
                c1022820ciu.LIZIZ(str, "after_item_id");
                c1022820ciu.LIZIZ("video", "after_content_type");
            }
        }
    }

    public static void LJJJJL(Aweme aweme, Map map) {
        if (C1010120cOQ.LJIJI(aweme)) {
            if (C1022030chd.LJIILL()) {
                map.put("single_column_switch", 1);
            }
            if (C1022030chd.LJIJJLI()) {
                map.put("is_single", 1);
            }
            if (C1022030chd.LJFF()) {
                map.put("is_inner", 1);
                map.put("inner_g_pos", Integer.valueOf(((ISearchAdMainService) ServiceManager.get().getService(ISearchAdMainService.class)).LJIIIIZZ().LJIIIZ(aweme)));
            }
        }
    }

    public static void LIZIZ(Aweme aweme, C581980Ms8 c581980Ms8, int i) {
        boolean z;
        boolean z2;
        int videoLength;
        int iMin;
        Object objLIZIZ;
        if (aweme != null) {
            if ((AwemeExtKt.isAdTraffic(aweme) || C1017070cZd.LLILII(aweme)) && !C1017070cZd.LLIIL(aweme)) {
                AwemeRawAd awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme);
                HashMap map = new HashMap();
                IAppMeasurementProvider iAppMeasurementProvider = LIZLLL;
                if (iAppMeasurementProvider != null && iAppMeasurementProvider.LIZJ(aweme, "RawAdBreak")) {
                    z = true;
                } else {
                    z = false;
                }
                boolean zLJFF = C2264471DkD.LJFF();
                boolean zLJ = C2264471DkD.LJ();
                boolean zLIZJ = C2264471DkD.LIZJ();
                if (zLJ && z) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    if (z) {
                        if (zLIZJ) {
                            map.put("ams_also_reported", "1");
                        }
                        if (zLJFF) {
                            map.put("track_from_online_in_ams", "1");
                        }
                    }
                    map.put("stay_duration", Long.valueOf(C987970boh.LIZ()));
                    map.put("play_order", Integer.valueOf(LJIILLIIL(map, aweme, i, false)));
                    if (C988820bq4.LJII(aweme)) {
                        map.put("is_pre_valid_action", Integer.valueOf(C988820bq4.LIZLLL(aweme) ? 1 : 0));
                    }
                    if (C1030680cva.LJIIJJI(aweme)) {
                        if (C07H7.LIZ() && C739330SzL.LIZ(aweme)) {
                            map.put("topview_skip", Boolean.TRUE);
                        }
                        map.put("launch_type", Integer.valueOf(C1030680cva.LJ ? 1 : 0));
                    }
                    C0CF8.LIZ.getClass();
                    map.put("device_overall_score", Float.valueOf(C0CF8.LIZ()));
                    if (awemeRawAdLJJIJLIJ != null && awemeRawAdLJJIJLIJ.isReshowAd()) {
                        map.put("is_reshow", 1);
                    }
                    if (C1017070cZd.LLILII(aweme)) {
                        C2268311DqP.LIZ.getClass();
                        map.put(C2268311DqP.LIZIZ.LIZ, "1");
                    }
                    if (aweme.getVideo() != null) {
                        videoLength = aweme.getVideo().getVideoLength();
                    } else {
                        videoLength = 0;
                    }
                    long j = c581980Ms8.LIZIZ;
                    if (videoLength > 0 && j > 0) {
                        iMin = Math.min((int) ((100 * j) / ((long) videoLength)), 100);
                    } else {
                        iMin = 0;
                    }
                    C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "break", awemeRawAdLJJIJLIJ);
                    c1022820ciuLIZLLL.LIZJ(Long.valueOf(j), "duration");
                    c1022820ciuLIZLLL.LIZJ(Integer.valueOf(iMin), "percent");
                    Object obj = null;
                    c1022820ciuLIZLLL.LIZJ(null, "break_reason");
                    c1022820ciuLIZLLL.LIZJ(Integer.valueOf(videoLength), "video_length");
                    if (TextUtils.equals("break", "play_break")) {
                        objLIZIZ = C1024180cl6.LIZIZ();
                    } else {
                        objLIZIZ = null;
                    }
                    c1022820ciuLIZLLL.LIZJ(objLIZIZ, "user_id");
                    c1022820ciuLIZLLL.LIZ(map);
                    c1022820ciuLIZLLL.LIZIZ(Long.valueOf(j), "player_duration");
                    c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(c581980Ms8.LIZ), "duration_flag");
                    c1022820ciuLIZLLL.LIZIZ(Long.valueOf(c581980Ms8.LIZJ), "duration_from_player_manager_cache");
                    c1022820ciuLIZLLL.LIZIZ(Long.valueOf(c581980Ms8.LIZLLL), "duration_from_realtime");
                    c1022820ciuLIZLLL.LIZIZ(LJI(aweme), "anchor_id");
                    c1022820ciuLIZLLL.LIZIZ(LJIIZILJ(aweme), "room_id");
                    if (LJIJ(aweme)) {
                        obj = 1;
                    }
                    c1022820ciuLIZLLL.LIZIZ(obj, "aweme_updated");
                    c1022820ciuLIZLLL.LIZIZ(C1045340dJE.LJIIZILJ(aweme), "bsh_video_id");
                    c1022820ciuLIZLLL.LIZIZ(C1045340dJE.LJ(aweme), "bsh_card_area");
                    c1022820ciuLIZLLL.LJIIIIZZ();
                }
                long j2 = c581980Ms8.LIZIZ;
                if (AwemeExtKt.isAdTraffic(aweme)) {
                    if (j2 >= C988820bq4.LIZ(aweme)) {
                        C988820bq4 c988820bq4 = C988820bq4.LIZ;
                        c988820bq4.getClass();
                        if ((C988820bq4.LIZJ(c988820bq4, aweme) & 2) == 0) {
                            if (C988820bq4.LJII(aweme)) {
                                C988820bq4.LJ(aweme, "play");
                            } else {
                                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                                if (awemeRawAd != null) {
                                    UrlModel effectivePlayTrackUrlList = awemeRawAd.getEffectivePlayTrackUrlList();
                                    Long creativeId = awemeRawAd.getCreativeId();
                                    String logExtra = awemeRawAd.getLogExtra();
                                    new AwS630S0100000_16(awemeRawAd, 107);
                                    C2201691BEx.LIZ("play_valid", effectivePlayTrackUrlList, creativeId, logExtra);
                                }
                            }
                        }
                    }
                    C988820bq4.LIZ.getClass();
                    C988820bq4.LIZIZ().remove(aweme);
                }
                C1045220dJ2.LJIILLIIL(aweme, "pause", "play_break");
            }
        }
    }

    public static JSONObject LJIIJ(Context context, Aweme aweme, String str) {
        JSONObject jSONObjectLJIIJJI = LJIIJJI(context, aweme, false, null);
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObjectLJIIJJI.put("refer", str);
                return jSONObjectLJIIJJI;
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
        return jSONObjectLJIIJJI;
    }

    public static JSONObject LJIILIIL(Context context, JSONObject jSONObject, Aweme aweme) {
        if (!LJIJI(context, aweme)) {
            return jSONObject;
        }
        try {
            LJJJJJL(context, aweme.getAwemeRawAd().getLogExtra(), jSONObject);
            return jSONObject;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            C2344809Gs.LIZ(e);
            return jSONObject;
        }
    }

    public static void LJJI(Context context, Aweme aweme, int i) {
        HashMap map = new HashMap();
        map.put("playervol", Float.valueOf(0.0f));
        map.put("play_order", Integer.valueOf(i));
        LJJJJ(context, "mute", aweme, LJIIJJI(context, aweme, false, LJFF(map)));
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIFFI(android.content.Context r5, com.ss.android.ugc.aweme.feed.model.Aweme r6, int r7) {
        /*
            android.content.Context r1 = X.C786410Ut5.N3(r5)
            java.lang.String r0 = "audio"
            java.lang.Object r4 = X.C786410Ut5.H2(r1, r0)
            android.media.AudioManager r4 = (android.media.AudioManager) r4
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r1 = 3
            r2 = -1
            if (r4 == 0) goto L1a
            int r0 = r4.getStreamVolume(r1)     // Catch: java.lang.Exception -> L1c
            goto L26
        L1a:
            r1 = 0
            goto L31
        L1c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.C1AF0.LJ(r0)
            r0 = -1
            if (r4 == 0) goto L2a
        L26:
            int r2 = X.C786410Ut5.Z3(r4, r1)
        L2a:
            if (r0 <= 0) goto L1a
            if (r2 <= 0) goto L1a
            float r1 = (float) r0
            float r0 = (float) r2
            float r1 = r1 / r0
        L31:
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 * r0
            int r0 = (int) r1
            float r2 = (float) r0
            r0 = 981668463(0x3a83126f, float:0.001)
            float r2 = r2 * r0
            java.lang.String r1 = "playervol"
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
            r3.put(r1, r0)
            java.lang.String r1 = "play_order"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r3.put(r1, r0)
            java.util.Map r1 = LJFF(r3)
            r0 = 0
            org.json.JSONObject r1 = LJIIJJI(r5, r6, r0, r1)
            java.lang.String r0 = "unmute"
            LJJJJ(r5, r0, r6, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1019030ccn.LJJIFFI(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, int):void");
    }

    public static void LJJIIJZLJL(Context context, AwemeRawAd awemeRawAd, String str) {
        boolean z = true;
        JSONObject jSONObjectLJIIL = LJIIL(context, awemeRawAd, true, null);
        if (str != null) {
            try {
                jSONObjectLJIIL.put("refer", str);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
        }
        if (context == null) {
            z = false;
        }
        if (z) {
            LJJJJJ(context, awemeRawAd, "draw_ad", "click", jSONObjectLJIIL);
        }
        C2201701BEy c2201701BEy = C2201701BEy.LIZ;
        UrlModel clickTrackUrlList = awemeRawAd.getClickTrackUrlList();
        Long creativeId = awemeRawAd.getCreativeId();
        String logExtra = awemeRawAd.getLogExtra();
        c2201701BEy.getClass();
        C2201701BEy.LIZ("click", clickTrackUrlList, creativeId, logExtra);
    }

    public static void LJJIIZ(Context context, Aweme aweme, FollowStatus followStatus) {
        int i;
        HashMap map = new HashMap();
        if (C1017070cZd.LLF(aweme)) {
            int followStatus2 = 1;
            if (followStatus != null && followStatus.isCheating()) {
                i = 1;
            } else {
                i = 0;
            }
            map.put("is_cheated_follow", Integer.valueOf(i));
            if (followStatus != null) {
                followStatus2 = followStatus.getFollowStatus();
            }
            map.put("follow_status", Integer.valueOf(followStatus2));
        }
        map.put("anchor_id", LJI(aweme));
        map.put("room_id", LJIIZILJ(aweme));
        LJJJJ(context, "follow", aweme, LJIIJJI(context, aweme, false, LJFF(map)));
    }

    public static void LJJIIZI(Context context, Aweme aweme, String str) {
        JSONObject jSONObjectLJIIJJI = LJIIJJI(context, aweme, false, null);
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObjectLJIIJJI.put("refer", str);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
        }
        LJJJJ(context, "otherclick", aweme, jSONObjectLJIIJJI);
    }

    public static void LJJIJIIJI(Context context, Aweme aweme, String str) {
        JSONObject jSONObjectLJIIIZ = LJIIIZ(context, aweme);
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObjectLJIIIZ.put("refer", str);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
        }
        HashMap map = new HashMap();
        map.put("anchor_id", LJI(aweme));
        map.put("room_id", LJIIZILJ(aweme));
        try {
            jSONObjectLJIIIZ.put("ad_extra_data", GsonProtectorUtils.toJson(new Gson(), map));
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
            C1AF0.LJ(e2);
        }
        LJJJJ(context, "slide", aweme, jSONObjectLJIIIZ);
        if (aweme != null) {
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "slide", aweme.getAwemeRawAd());
            if (C1017070cZd.LJJIJIL(aweme, "draw_ad", "slide") != null) {
                c1022820ciuLIZLLL = C1017070cZd.LJJIJIL(aweme, "draw_ad", "slide");
            }
            if (c1022820ciuLIZLLL != null) {
                c1022820ciuLIZLLL.LIZIZ(str, "refer");
                c1022820ciuLIZLLL.LIZIZ(LJIIZILJ(aweme), "room_id");
                c1022820ciuLIZLLL.LIZIZ(LJI(aweme), "anchor_id");
                c1022820ciuLIZLLL.LJIIIIZZ();
            }
        }
        if (C1017070cZd.LLF(aweme)) {
            LJJJJ(context, "click", aweme, LJIIIZ(context, aweme));
        }
    }

    public static void LJJIJL(Context context, Aweme aweme, Map<String, String> map) {
        LJJJJIZL(context, "click", aweme, LJIIJJI(context, aweme, true, map));
        if (C1017070cZd.LJJLIIJ(aweme)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            C2201701BEy c2201701BEy = C2201701BEy.LIZ;
            UrlModel clickTrackUrlList = awemeRawAd.getClickTrackUrlList();
            Long creativeId = awemeRawAd.getCreativeId();
            String logExtra = awemeRawAd.getLogExtra();
            c2201701BEy.getClass();
            C2201701BEy.LIZ("click", clickTrackUrlList, creativeId, logExtra);
        }
    }

    public static void LJJIJLIJ(Context context, Aweme aweme, Map map) {
        C1020020ceO c1020020ceOLIZ = C1020030ceP.LIZ();
        c1020020ceOLIZ.LIZ = "homepage_ad";
        c1020020ceOLIZ.LIZIZ = "otherclick";
        c1020020ceOLIZ.LJIIIZ("title");
        c1020020ceOLIZ.LJ(aweme);
        c1020020ceOLIZ.LJIIJ(context);
        if (aweme != null) {
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("homepage_ad", "otherclick", aweme.getAwemeRawAd());
            c1022820ciuLIZLLL.LIZJ("title", "refer");
            c1022820ciuLIZLLL.LIZ(map);
            c1022820ciuLIZLLL.LJIIIIZZ();
        }
    }

    public static void LJJJ(String str, String str2, JSONObject jSONObject) {
        int iLIZ;
        JSONObject jSONObject2;
        int iLIZ2;
        if (C583160Mu2.LIZLLL && TextUtils.equals(str, "background_ad") && (TextUtils.equals(str2, "otherclick") || TextUtils.equals(str2, "click"))) {
            int i = C2187451AjH.LIZ;
            return;
        }
        if ((TextUtils.equals(str, "draw_ad") && LIZ.contains(str2)) || (InterfaceC1019140ccy.LIZIZ.contains(str2) && InterfaceC1019140ccy.LIZ.contains(str))) {
            long jLJI = C1045340dJE.LJIJI().LJI();
            if (C583160Mu2.LIZLLL) {
                iLIZ = C583160Mu2.LIZ();
            } else {
                iLIZ = C1045340dJE.LJIJI().LJIIJ;
            }
            int i2 = iLIZ + 1;
            if (jLJI < 0) {
                if (C1045340dJE.LJIJI().LJIIZILJ < 0) {
                    jLJI = C1045340dJE.LJIJI().LJJ;
                } else {
                    jLJI = C1045340dJE.LJIJI().LJIIZILJ;
                }
            }
            if (TextUtils.equals(str, "background_ad")) {
                jLJI = C1045340dJE.LJIJI().LJIIIIZZ();
                if (C583160Mu2.LIZLLL) {
                    iLIZ2 = C583160Mu2.LIZ();
                } else {
                    iLIZ2 = C1045340dJE.LJIJI().LJIIJ;
                }
                i2 = (iLIZ2 + 1) - 1;
            }
            if (jLJI >= 0) {
                try {
                    String strOptString = jSONObject.optString("ad_extra_data");
                    if (TextUtils.isEmpty(strOptString)) {
                        jSONObject2 = new JSONObject();
                    } else {
                        jSONObject2 = new JSONObject(strOptString);
                    }
                    if (!((HashSet) InterfaceC1019140ccy.LIZJ).contains(str2)) {
                        jSONObject2.put("duration", jLJI);
                    }
                    jSONObject2.put("play_order", i2);
                    jSONObject.put("ad_extra_data", C786410Ut5.J3(jSONObject2));
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LJ(e);
                }
            }
        }
    }

    public static void LJJJI(Context context, String str, String str2) {
        InterfaceC585680My6 interfaceC585680My6LIZLLL;
        if (C293490Bet.LIZIZ && (interfaceC585680My6LIZLLL = ((IMeasurementService) ServiceManager.get().getService(IMeasurementService.class)).LIZLLL()) != null) {
            if (interfaceC585680My6LIZLLL.getAweme() != null && interfaceC585680My6LIZLLL.LJIILIIL() != null && LIZIZ.contains(str) && LIZJ.contains(str2)) {
                Aweme aweme = interfaceC585680My6LIZLLL.getAweme();
                interfaceC585680My6LIZLLL.LJIILIIL();
                interfaceC585680My6LIZLLL.LJJIII(context, aweme);
            } else {
                return;
            }
        }
        InterfaceC1019050ccp interfaceC1019050ccpLIZIZ = ((IMeasurementService) ServiceManager.get().getService(IMeasurementService.class)).LIZIZ();
        if ((interfaceC1019050ccpLIZIZ instanceof InterfaceC1031390cwj) && TextUtils.equals(str, "draw_ad") && TextUtils.equals(str2, "click")) {
            ((InterfaceC1031390cwj) interfaceC1019050ccpLIZIZ).LIZ(context);
        }
        if (C1045340dJE.LJIJI().LJIJI != null && C1045340dJE.LJIJI().LIZLLL() != null && LIZIZ.contains(str) && LIZJ.contains(str2)) {
            C1045340dJE.LJIJI();
            if (!CommerceSearchAdConfigSetting.LIZ().enableDedupShowAndOmsdk && ("result_ad".equals(str) || "result_ad_bg".equals(str))) {
                return;
            }
            C1045340dJE c1045340dJELJIJI = C1045340dJE.LJIJI();
            Aweme aweme2 = C1045340dJE.LJIJI().LJIJI;
            View viewLIZLLL = C1045340dJE.LJIJI().LIZLLL();
            if (aweme2 != null) {
                if (!c1045340dJELJIJI.LJIILL) {
                    C1045340dJE.LJIJJLI(aweme2, "onClick");
                    if (!C1045340dJE.LJJIJIL(aweme2)) {
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            C1045770dJv c1045770dJvLJIIJJI = c1045340dJELJIJI.LJIIJJI(context, viewLIZLLL, aweme2);
                            if (c1045770dJvLJIIJJI != null) {
                                c1045770dJvLJIIJJI.LIZ(EnumC1999407sO.CLICK);
                                return;
                            }
                            return;
                        }
                        C786410Ut5.LJJZZIII(c1045340dJELJIJI.LJIIJJI, new ARunnableS24S0400000_16(context, viewLIZLLL, c1045340dJELJIJI, aweme2, 7));
                        return;
                    }
                    return;
                }
                return;
            }
            c1045340dJELJIJI.getClass();
        }
    }

    public static JSONObject LJJJJJL(Context context, String str, JSONObject jSONObject) throws JSONException {
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("log_extra", str);
        }
        jSONObject.put("is_ad_event", "1");
        String strC3 = C786410Ut5.c3(context);
        if (!C2093608Ic.LJ(strC3)) {
            jSONObject.put("nt", strC3);
        }
        return jSONObject;
    }

    public static void LJJJJLI(long j, String str, Map map) {
        AdSessionPositionHelper.LIZ.getClass();
        AdSessionPositionHelper.LJIILLIIL(j, str);
        map.put("session_id", AdSessionPositionHelper.LJIIIZ(str));
        map.put("absolute_session_position", Integer.valueOf(AdSessionPositionHelper.LIZ(str)));
        map.put("relative_session_position", Integer.valueOf(AdSessionPositionHelper.LJFF(str)));
        map.put("absolute_session_position_with_cross_tab", Integer.valueOf(AdSessionPositionHelper.LIZIZ(str)));
        map.put("request_index_within_session", Integer.valueOf(AdSessionPositionHelper.LJII(str)));
        if (TextUtils.equals(AdSessionPositionHelper.LIZJ(str), "fyp")) {
            map.put("first_timestamp_of_enter_session", String.valueOf(AdSessionPositionHelper.LIZIZ));
            map.put("timestamp_of_first_ad_with_show", String.valueOf(AdSessionPositionHelper.LIZJ));
            map.put("timestamp_of_first_ad_with_click", String.valueOf(AdSessionPositionHelper.LIZLLL));
            map.put("last_timestamp_of_ad_with_show", String.valueOf(AdSessionPositionHelper.LJIIIIZZ));
            map.put("last_timestamp_of_ad_with_click", String.valueOf(AdSessionPositionHelper.LJIIIZ));
            map.put("last_relative_position_of_ad_with_show", Integer.valueOf(AdSessionPositionHelper.LJ(str)));
            map.put("last_relative_position_of_ad_with_click", Integer.valueOf(AdSessionPositionHelper.LIZLLL(str)));
            map.put("all_relative_position_of_last_request", AdSessionPositionHelper.LJI(str));
        }
        AdSessionPositionHelper.LJIIZILJ(str);
        if (TextUtils.equals(AdSessionPositionHelper.LIZJ(str), "fyp")) {
            AdSessionPositionHelper.LJIIIZ = j;
        }
    }

    public static JSONObject LJIIIIZZ(Context context, LinkData linkData, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            LJJJJJL(context, linkData.logExtra, jSONObject);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("refer", str);
                jSONObject.put("item_id", str2);
                return jSONObject;
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
        return jSONObject;
    }

    public static JSONObject LJIIJJI(Context context, Aweme aweme, boolean z, Map map) {
        if (!LJIJI(context, aweme)) {
            return new JSONObject();
        }
        return LJIIL(context, aweme.getAwemeRawAd(), z, map);
    }

    public static JSONObject LJIIL(Context context, AwemeRawAd awemeRawAd, boolean z, Map map) {
        JSONObject jSONObject = new JSONObject();
        if (awemeRawAd == null) {
            return jSONObject;
        }
        try {
            LJJJJJL(context, awemeRawAd.getLogExtra(), jSONObject);
            if (z) {
                jSONObject.put("has_v3", "1");
            }
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            C2344809Gs.LIZ(e);
        }
        return jSONObject;
    }

    public static int LJIILLIIL(HashMap<String, Object> map, Aweme aweme, int i, boolean z) {
        if (C583160Mu2.LIZIZ(aweme)) {
            int iLIZ = C583160Mu2.LIZ();
            if (!z) {
                iLIZ++;
            }
            map.put("story_video_type", Integer.valueOf(C583160Mu2.LIZIZ));
            return iLIZ;
        }
        return i;
    }

    public static void LJJII(Context context, Aweme aweme, String str, Map<String, Object> map) {
        Map<String, String> mapLJFF;
        if (map == null) {
            mapLJFF = null;
        } else {
            mapLJFF = LJFF(map);
        }
        JSONObject jSONObjectLJIIJJI = LJIIJJI(context, aweme, false, mapLJFF);
        if (str != null) {
            try {
                jSONObjectLJIIJJI.put("refer", str);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
        }
        LJJJJ(context, "click_source", aweme, jSONObjectLJIIJJI);
    }

    public static void LJJIII(Context context, Aweme aweme, Map<String, Object> map, String str) {
        LJJIIJ(context, aweme, map, str, "draw_ad");
    }

    public static void LJJIJIL(Context context, Aweme aweme, String str, Map map) {
        HashMap map2;
        JSONObject jSONObjectLJIIJJI = LJIIJJI(context, aweme, true, null);
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObjectLJIIJJI.put("refer", str);
            }
            if (map != null) {
                map2 = new HashMap(map);
            } else {
                map2 = new HashMap();
            }
            map2.put("anchor_id", LJI(aweme));
            map2.put("room_id", LJIIZILJ(aweme));
            C1017160cZm.LIZ(aweme, map2, str, false);
            LJJJJL(aweme, map2);
            if (aweme.isAd() && !C1017070cZd.LLIZLLLIL(aweme) && !C1010120cOQ.LJIJI(aweme) && aweme.getAwemeRawAd().getRollType() != 1) {
                LJJJJLI(System.currentTimeMillis(), aweme.getAwemeRawAd().getCreativeIdStr(), map2);
            }
            jSONObjectLJIIJJI.put("ad_extra_data", GsonProtectorUtils.toJson(new Gson(), map2));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
        LJJJJIZL(context, "click", aweme, jSONObjectLJIIJJI);
        if (C1017070cZd.LJJLIIJ(aweme)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            C2201701BEy c2201701BEy = C2201701BEy.LIZ;
            UrlModel clickTrackUrlList = awemeRawAd.getClickTrackUrlList();
            Long creativeId = awemeRawAd.getCreativeId();
            String logExtra = awemeRawAd.getLogExtra();
            c2201701BEy.getClass();
            C2201701BEy.LIZ("click", clickTrackUrlList, creativeId, logExtra);
        }
    }

    public static void LJJJIL(Context context, String str, Aweme aweme, JSONObject jSONObject) {
        if (!LJIJI(context, aweme)) {
            return;
        }
        LJJJJJ(context, aweme.getAwemeRawAd(), "background_ad", str, jSONObject);
    }

    public static void LJJJJ(Context context, String str, Aweme aweme, JSONObject jSONObject) {
        if (!LJIJI(context, aweme)) {
            return;
        }
        LJJJJJ(context, aweme.getAwemeRawAd(), "draw_ad", str, jSONObject);
    }

    public static void LJJJJIZL(Context context, String str, Aweme aweme, JSONObject jSONObject) {
        if (!LJIJI(context, aweme)) {
            return;
        }
        LJJJJJ(context, aweme.getAwemeRawAd(), "homepage_ad", str, jSONObject);
    }

    public static void LJIJJLI(String str, Context context, LinkData linkData, Aweme aweme, boolean z) {
        LJIL(str, context, linkData, aweme, z, true);
    }

    public static void LJJIIJ(Context context, Aweme aweme, Map<String, Object> map, String str, String str2) {
        HashMap map2;
        String str3;
        C1017230cZt c1017230cZtLIZ;
        Map<String, Object> map3;
        JSONObject jSONObjectLJIIJJI = LJIIJJI(context, aweme, true, null);
        if (str != null) {
            try {
                jSONObjectLJIIJJI.put("refer", str);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
        }
        if (map != null) {
            map2 = new HashMap(map);
        } else {
            map2 = new HashMap();
        }
        map2.put("anchor_id", LJI(aweme));
        map2.put("room_id", LJIIZILJ(aweme));
        LJJJJL(aweme, map2);
        if (aweme != null && aweme.getAwemeRawAd() != null) {
            map2.put("charge_type", Integer.valueOf(aweme.getAwemeRawAd().getChargeType()));
            map2.put("system_origin", Integer.valueOf(aweme.getAwemeRawAd().getSystemOrigin()));
            map2.put("pack_content_type", aweme.getAwemeRawAd().getType());
            if (((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZIZ().LJ() != null && (c1017230cZtLIZ = ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZIZ().LJ().LJIL().LIZ(aweme.getAwemeRawAd())) != null && (map3 = c1017230cZtLIZ.LIZJ) != null) {
                map2.put("product_id", map3.get("productId"));
                map2.put("product_url", c1017230cZtLIZ.LIZ);
                map2.put("product_counts", c1017230cZtLIZ.LIZJ.get("productIndex"));
            }
        }
        C1017160cZm.LIZ(aweme, map2, str, false);
        IAdPhotoModeService iAdPhotoModeService = (IAdPhotoModeService) ServiceManager.get().getService(IAdPhotoModeService.class);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (C1017070cZd.LLIIL(aweme) && iAdPhotoModeService != null && (TextUtils.equals(str, "button") || TextUtils.equals(str, "image") || TextUtils.equals(str, "name") || TextUtils.equals(str, "title") || TextUtils.equals(str, "photo") || TextUtils.equals(str, "slide"))) {
            C1017160cZm.LIZ(aweme, map2, str, false);
            int iLJJIJIIJIL = iAdPhotoModeService.LJJIJIIJIL();
            if (C1009740cNo.LJIIL(aweme)) {
                str3 = "page_location";
            } else {
                str3 = "image_location";
            }
            map2.put(str3, Integer.valueOf(iLJJIJIIJIL + 1));
            map2.putAll(iAdPhotoModeService.LIZLLL(aweme));
            map2.put("image_show_count", iAdPhotoModeService.LJIJJ(iLJJIJIIJIL, aweme));
            if (aweme.getPhotoModeImageInfo() != null && aweme.getPhotoModeImageInfo().getImageList() != null) {
                map2.put("image_cnt", Integer.valueOf(aweme.getPhotoModeImageInfo().getImageList().size()));
            }
            map2.put("enter_method", iAdPhotoModeService.getEnterMethod());
            map2.put("first_slide_duration", Long.valueOf(jCurrentTimeMillis - iAdPhotoModeService.LJJII()));
            if (str != null && str.equals("button") && C1017070cZd.LJLLLL(aweme)) {
                map2.putAll(iAdPhotoModeService.LJJIIJ(aweme));
            }
            if (C1017070cZd.LJI(aweme)) {
                map2.putAll(iAdPhotoModeService.LJJIIJ(aweme));
            }
            String strLIZ = ((C1011220cQC) ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZIZ().LJFF()).LIZ(iLJJIJIIJIL, aweme);
            if (strLIZ != null) {
                map2.put("product_id", strLIZ);
            }
        }
        IFeedAdService iFeedAdService = (IFeedAdService) ServiceManager.get().getService(IFeedAdService.class);
        String productId = iFeedAdService.getProductId();
        if (!TextUtils.isEmpty(productId) && (TextUtils.equals(str, "button") || TextUtils.equals(str, "name") || TextUtils.equals(str, "title") || TextUtils.equals(str, "photo"))) {
            map2.put("product_id", productId);
        }
        if (aweme.isAd() && !C1017070cZd.LLIZLLLIL(aweme) && !C1010120cOQ.LJIJI(aweme) && aweme.getAwemeRawAd().getRollType() != 1) {
            LJJJJLI(jCurrentTimeMillis, aweme.getAwemeRawAd().getCreativeIdStr(), map2);
        }
        if (str != null) {
            if (str.equals("button")) {
                map2.put("is_lynx", 0);
                map2.put("button_type", 2);
                map2.put("show_type", iFeedAdService.LJJJJJ());
            }
            if (str.equals("slide")) {
                map2.put("is_under_guide", Integer.valueOf(C0SQJ.LIZJ ? 1 : 0));
                String str4 = C1019070ccr.LIZ;
                C1019070ccr.LIZ = null;
                if (str4 == null) {
                    str4 = "others";
                }
                map2.put("trigger_reasons", str4);
            }
        }
        try {
            jSONObjectLJIIJJI.put("ad_extra_data", GsonProtectorUtils.toJson(new Gson(), map2));
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
            C1AF0.LJ(e2);
        }
        LJJJJI(context, str2, "click", aweme, jSONObjectLJIIJJI);
        if (C1017070cZd.LJJLIIJ(aweme)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            C2201701BEy c2201701BEy = C2201701BEy.LIZ;
            UrlModel clickTrackUrlList = awemeRawAd.getClickTrackUrlList();
            Long creativeId = awemeRawAd.getCreativeId();
            String logExtra = awemeRawAd.getLogExtra();
            c2201701BEy.getClass();
            C2201701BEy.LIZ("click", clickTrackUrlList, creativeId, logExtra);
        }
    }

    public static void LJJJJI(Context context, String str, String str2, Aweme aweme, JSONObject jSONObject) {
        if (!LJIJI(context, aweme)) {
            return;
        }
        LJJJJJ(context, aweme.getAwemeRawAd(), str, str2, jSONObject);
    }

    public static void LJJJJJ(Context context, final AwemeRawAd awemeRawAd, String str, String str2, JSONObject jSONObject) {
        JSONObject jSONObject2;
        long jLongValue;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        String str3;
        JSONObject jSONObject5;
        String str4 = str;
        String pageFrom = awemeRawAd.getPageFrom();
        if (TextUtils.equals(pageFrom, "challenge") || TextUtils.equals(pageFrom, "challenge_fresh")) {
            if (TextUtils.equals(str4, "background_ad")) {
                str4 = "background_ads";
            } else {
                str4 = "topic_ads";
            }
        }
        if (TextUtils.equals(str4, "background_ad") && (TextUtils.equals(str2, "click") || TextUtils.equals(str2, "othershow") || TextUtils.equals(str2, "replay"))) {
            try {
                String strOptString = jSONObject.optString("ad_extra_data");
                if (TextUtils.isEmpty(strOptString)) {
                    jSONObject5 = new JSONObject();
                } else {
                    jSONObject5 = new JSONObject(strOptString);
                }
                jSONObject5.put("is_lynx", 0);
                jSONObject.put("ad_extra_data", C786410Ut5.J3(jSONObject5));
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
        }
        if (TextUtils.equals("click", str2)) {
            C1045220dJ2.LIZ.getClass();
            C1045060dIm c1045060dImLJI = C1045220dJ2.LJI(awemeRawAd);
            if (c1045060dImLJI != null) {
                Set<String> set = c1045060dImLJI.clickTracking;
                if (set != null && !set.isEmpty()) {
                    C08QT c08qt = new C08QT(C09RB.LJIIIZ(new C1939607ik(c1045060dImLJI.clickTracking), AFwS229S0000000_2.get$arr$(567)));
                    while (c08qt.hasNext()) {
                        final String str5 = (String) c08qt.next();
                        final long jCurrentTimeMillis = System.currentTimeMillis();
                        RawURLGetter.LIZ(str5, new C0XI1() { // from class: X.0O0b
                            @Override // X.C0XI1
                            public final void LIZ(int i, boolean z, Exception exc) {
                                String message;
                                if (!z) {
                                    C1020020ceO c1020020ceOLIZ = C1020030ceP.LIZ();
                                    c1020020ceOLIZ.LJFF(awemeRawAd);
                                    c1020020ceOLIZ.LIZ = "draw_ad";
                                    c1020020ceOLIZ.LIZIZ = "load_failed";
                                    Pair[] pairArr = new Pair[3];
                                    pairArr[0] = new Pair("error_message", "vast_click_tracker_bad_response");
                                    pairArr[1] = new Pair("error_code", Integer.valueOf(i));
                                    String message2 = null;
                                    if (exc != null) {
                                        message = exc.getMessage();
                                    } else {
                                        message = null;
                                    }
                                    pairArr[2] = new Pair("error_detail", message);
                                    c1020020ceOLIZ.LIZ(C2097608Jq.LJIIIIZZ(pairArr));
                                    c1020020ceOLIZ.LJIIJ(null);
                                    C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "load_failed", awemeRawAd);
                                    c1022820ciuLIZLLL.LIZIZ("vast_click_tracker_bad_response", "error_message");
                                    c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i), "error_code");
                                    if (exc != null) {
                                        message2 = exc.getMessage();
                                    }
                                    c1022820ciuLIZLLL.LIZIZ(message2, "error_detail");
                                    c1022820ciuLIZLLL.LJIIIIZZ();
                                }
                                C1045220dJ2.LJIIJJI(C1045220dJ2.LIZ, str5, String.valueOf(i), jCurrentTimeMillis, "click", null, awemeRawAd, 16);
                            }
                        });
                    }
                } else {
                    OmVast omVast = awemeRawAd.getOmVast();
                    if (omVast != null && omVast.providerType == 2 && (str3 = c1045060dImLJI.clickThrough) != null && str3.length() != 0) {
                        RawURLGetter.LIZ(c1045060dImLJI.clickThrough, new C0XI1() { // from class: X.0O0c
                            @Override // X.C0XI1
                            public final void LIZ(int i, boolean z, Exception exc) {
                                String message;
                                if (!z) {
                                    C1020020ceO c1020020ceOLIZ = C1020030ceP.LIZ();
                                    c1020020ceOLIZ.LJFF(awemeRawAd);
                                    c1020020ceOLIZ.LIZ = "draw_ad";
                                    c1020020ceOLIZ.LIZIZ = "load_failed";
                                    Pair[] pairArr = new Pair[3];
                                    pairArr[0] = new Pair("error_message", "vast_clickthru_bad_response");
                                    pairArr[1] = new Pair("error_code", Integer.valueOf(i));
                                    String message2 = null;
                                    if (exc != null) {
                                        message = exc.getMessage();
                                    } else {
                                        message = null;
                                    }
                                    pairArr[2] = new Pair("error_detail", message);
                                    c1020020ceOLIZ.LIZ(C2097608Jq.LJIIIIZZ(pairArr));
                                    c1020020ceOLIZ.LJIIJ(null);
                                    C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "load_failed", awemeRawAd);
                                    c1022820ciuLIZLLL.LIZIZ("vast_clickthru_bad_response", "error_message");
                                    c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i), "error_code");
                                    if (exc != null) {
                                        message2 = exc.getMessage();
                                    }
                                    c1022820ciuLIZLLL.LIZIZ(message2, "error_detail");
                                    c1022820ciuLIZLLL.LJIIIIZZ();
                                }
                            }
                        });
                    }
                }
            }
            try {
                C1022030chd.LIZJ = JSONObjectProtectorUtils.getString(jSONObject, "refer");
                C1022030chd.LIZLLL = str4;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            String incentiveInfo = awemeRawAd.getIncentiveInfo();
            if (!TextUtils.isEmpty(incentiveInfo)) {
                try {
                    String strOptString2 = jSONObject.optString("ad_extra_data");
                    if (TextUtils.isEmpty(strOptString2)) {
                        jSONObject4 = new JSONObject();
                    } else {
                        jSONObject4 = new JSONObject(strOptString2);
                    }
                    jSONObject4.put("coupon_info", incentiveInfo);
                    jSONObject.put("ad_extra_data", C786410Ut5.J3(jSONObject4));
                } catch (JSONException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
            }
            try {
                if (((VSAProductIdRecordSetting.VSAProductIdRecordParam) VSAProductIdRecordSetting.LIZIZ.getValue()).enable && "draw_ad".equals(str4)) {
                    String strOptString3 = jSONObject.optString("refer");
                    if (!"slide".equals(strOptString3)) {
                        String strOptString4 = jSONObject.optString("ad_extra_data");
                        if (TextUtils.isEmpty(strOptString4)) {
                            jSONObject3 = new JSONObject();
                        } else {
                            jSONObject3 = new JSONObject(strOptString4);
                        }
                        String strOptString5 = jSONObject3.optString("product_id");
                        if (!TextUtils.isEmpty(strOptString5)) {
                            C1048110dNh.LIZLLL.getClass();
                            C1048110dNh.LJ().LIZ(strOptString5, strOptString3);
                        }
                    }
                }
            } catch (Exception e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
        }
        if (C1017180cZo.LJJIFFI(awemeRawAd)) {
            try {
                String strOptString6 = jSONObject.optString("ad_extra_data");
                if (TextUtils.isEmpty(strOptString6)) {
                    jSONObject2 = new JSONObject();
                } else {
                    jSONObject2 = new JSONObject(strOptString6);
                }
                jSONObject2.put("anchor_id", awemeRawAd.getSplashInfo().anchorId);
                jSONObject.put("ad_extra_data", C786410Ut5.J3(jSONObject2));
            } catch (JSONException e5) {
                TryCatchGuardChecker.doCheck(e5);
                C1AF0.LJ(e5);
            }
        }
        String strLJII = LJII(awemeRawAd);
        Long groupId = awemeRawAd.getGroupId();
        if (groupId == null) {
            jLongValue = 0;
        } else {
            jLongValue = groupId.longValue();
        }
        LIZJ(jLongValue, context, str4, str2, strLJII, jSONObject);
    }

    public static void LIZJ(long j, Context context, String str, String str2, String str3, JSONObject jSONObject) {
        LJJJ(str, str2, jSONObject);
        String strLJJ = C0C64.LJIILLIIL().LJJ(31744, "enable_send_staging_adlog", "v3", true);
        if (TextUtils.equals(strLJJ, "v1") || TextUtils.equals(str2, "click")) {
            LJJJI(context, str, str2);
        }
        if (!TextUtils.equals(str2, "click")) {
            if (TextUtils.equals(strLJJ, "v3")) {
                return;
            }
            if (TextUtils.equals(strLJJ, "all")) {
                try {
                    jSONObject.put("_ad_staging_flag", "1");
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LJ(e);
                }
            }
        }
        ITalentAdRevenueShareService iTalentAdRevenueShareServiceLJIIL = TalentAdRevenueShareServiceImpl.LJIIL();
        if (iTalentAdRevenueShareServiceLJIIL != null) {
            iTalentAdRevenueShareServiceLJIIL.LIZLLL(str3, jSONObject);
        }
        if (TextUtils.equals("click", str2)) {
            C988820bq4.LJFF(str3);
            C1022500ciO.LIZJ(str, str3, jSONObject, j);
            C12865051r.LIZIZ(jSONObject, "has_v3", 1);
        }
        C20684815ws.LJIIJ(j, str, str2, str3, jSONObject);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIL(java.lang.String r12, android.content.Context r13, com.ss.android.ugc.aweme.commercialize.model.LinkData r14, com.ss.android.ugc.aweme.feed.model.Aweme r15, boolean r16, boolean r17) {
        /*
            r7 = r13
            if (r7 == 0) goto L7b
            if (r14 == 0) goto L7b
            if (r17 != 0) goto L10
            if (r15 == 0) goto Lf
            boolean r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.isAdTraffic(r15)
            if (r0 != 0) goto L10
        Lf:
            return
        L10:
            if (r16 != 0) goto L78
            int r1 = r14.feedShowType
            r0 = 1
            if (r1 == r0) goto L75
            r0 = 2
            if (r1 != r0) goto L78
            java.lang.String r2 = "link_bar"
        L1c:
            if (r17 == 0) goto L68
            java.lang.String r0 = r15.getAid()
            org.json.JSONObject r11 = LJIIIIZZ(r7, r14, r2, r0)
            java.lang.String r10 = r14.creativeId
        L28:
            java.lang.String r4 = "comment_ad"
            java.lang.String r0 = "draw_ad"
            if (r16 == 0) goto L66
            r8 = r4
        L2f:
            long r5 = LJIILJJIL(r15)
            r9 = r12
            LIZJ(r5, r7, r8, r9, r10, r11)
            if (r16 != 0) goto L3a
            r4 = r0
        L3a:
            boolean r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.isAdTraffic(r15)
            if (r0 == 0) goto L63
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r15.getAwemeRawAd()
            if (r0 == 0) goto L63
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r15.getAwemeRawAd()
            java.lang.String r3 = r0.getLogExtra()
        L4e:
            long r0 = LJIILJJIL(r15)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            X.0ciu r1 = X.C2184171Adz.LJ(r4, r9, r10, r3, r0)
            java.lang.String r0 = "refer"
            r1.LIZJ(r2, r0)
            r1.LJIIIIZZ()
            return
        L63:
            java.lang.String r3 = ""
            goto L4e
        L66:
            r8 = r0
            goto L2f
        L68:
            org.json.JSONObject r11 = LJIIJ(r7, r15, r2)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r15.getAwemeRawAd()
            java.lang.String r10 = LJII(r0)
            goto L28
        L75:
            java.lang.String r2 = "link_logo"
            goto L1c
        L78:
            java.lang.String r2 = "link"
            goto L1c
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1019030ccn.LJIL(java.lang.String, android.content.Context, com.ss.android.ugc.aweme.commercialize.model.LinkData, com.ss.android.ugc.aweme.feed.model.Aweme, boolean, boolean):void");
    }
}
