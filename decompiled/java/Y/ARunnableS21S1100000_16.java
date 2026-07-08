package Y;

import X.AbstractC1591090rVT;
import X.C08JS;
import X.C0CQT;
import X.C0X52;
import X.C0X9S;
import X.C1001410cAN;
import X.C1001420cAO;
import X.C1017070cZd;
import X.C1019100ccu;
import X.C1022820ciu;
import X.C1041070dCL;
import X.C1042640dEs;
import X.C1042650dEt;
import X.C1104820erA;
import X.C1274810jHL;
import X.C1325420kay;
import X.C1331660kl2;
import X.C1440005kM;
import X.C1490740otc;
import X.C1499850p8J;
import X.C1AF0;
import X.C1C7U;
import X.C20684815ws;
import X.C2105908Mv;
import X.C2184171Adz;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C259800zU;
import X.C341940Daq;
import X.C786410Ut5;
import X.C988570bpf;
import X.C988880bqA;
import X.C999500c7I;
import X.EnumC1001380cAK;
import X.EnumC1036640d5C;
import X.EnumC1490770otf;
import X.EnumC599900Nfw;
import X.InterfaceC1034470d1h;
import X.InterfaceC1041500dD2;
import X.InterfaceC1541990qEH;
import X.InterfaceC442640HXi;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tiktok.homepage.mainpagefragment.assem.MainPageBusinessAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.ad.feed.card.FeedAdLynxCard;
import com.ss.android.ugc.aweme.ad.network.CommonApi;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.api.component.mask.AnoleMaskAssem;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.botpage.components.videogeneration.TakoVideoGenProgressAssem;
import com.ss.android.ugc.effectmanager.common.utils.JsonExtKt;
import com.tts.oecverify.BdTuring;
import java.io.File;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class ARunnableS21S1100000_16 implements Runnable {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                run$12(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        TextView textView = ((SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) this.l1).LLJJL;
        if (textView != null) {
            textView.setText(this.s0);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) this.l1;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLL > 0) {
            C786410Ut5.LJJLIIIIJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLJJL, sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) this.l1;
            TextView textView2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.LLJJL;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 83;
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.addView(textView2, layoutParams);
        }
    }

    public final void LIZ$1() {
        String str;
        CommonApi commonApi;
        C0X9S<String> c0x9sDoGet;
        C0X52<String> c0x52Execute;
        String str2 = "";
        try {
            IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class);
            if (iRetrofitFactory != null) {
                C988570bpf.LIZ.getClass();
                if (C1041070dCL.LIZ() == null || (str = C0CQT.LIZJ) == null) {
                    str = "";
                }
                C1499850p8J c1499850p8JCreateBuilder = iRetrofitFactory.createBuilder(str);
                if (c1499850p8JCreateBuilder != null && (commonApi = (CommonApi) c1499850p8JCreateBuilder.build().retrofit.LIZ(CommonApi.class)) != null && (c0x9sDoGet = commonApi.doGet(this.s0)) != null && (c0x52Execute = c0x9sDoGet.execute()) != null) {
                    String str3 = c0x52Execute.LIZIZ;
                    if (str3 != null) {
                        str2 = str3;
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
        if (C2105908Mv.LIZ(str2)) {
            return;
        }
        AdLandPagePreloadServiceImpl adLandPagePreloadServiceImpl = (AdLandPagePreloadServiceImpl) this.l1;
        adLandPagePreloadServiceImpl.LJFF.storeString(adLandPagePreloadServiceImpl.LIZLLL, this.s0);
        AdLandPagePreloadServiceImpl adLandPagePreloadServiceImpl2 = (AdLandPagePreloadServiceImpl) this.l1;
        adLandPagePreloadServiceImpl2.LJ = str2;
        adLandPagePreloadServiceImpl2.LJFF.storeString(adLandPagePreloadServiceImpl2.LIZJ, str2);
    }

    public final void LIZ$2() {
        String strOptString = ((JSONObject) this.l1).optString("tag");
        String strOptString2 = ((JSONObject) this.l1).optString("value");
        Map map = null;
        String strOptString3 = ((JSONObject) this.l1).has("log_extra") ? ((JSONObject) this.l1).optString("log_extra") : null;
        String strOptString4 = ((JSONObject) this.l1).has("group_id") ? ((JSONObject) this.l1).optString("group_id") : null;
        try {
            map = (Map) C08JS.LIZIZ().LJIIIIZZ(((JSONObject) this.l1).optString("ad_extra_data"), new TypeToken<Map<String, ? extends Object>>() { // from class: X.0dmw
            }.getType());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
        C1022820ciu c1022820ciuLJ = C2184171Adz.LJ(strOptString, this.s0, strOptString2, strOptString3, strOptString4);
        c1022820ciuLJ.LIZLLL(JsonExtKt.toMap((JSONObject) this.l1));
        c1022820ciuLJ.LIZ(map);
        c1022820ciuLJ.LJII();
    }

    public final void LIZ$3() {
        String realCreativeIdStr;
        Set set;
        Map<String, Pair<Set<String>, Set<String>>> map = C1042640dEs.LLILLJJLI;
        InterfaceC1041500dD2 interfaceC1041500dD2 = (InterfaceC1041500dD2) this.l1;
        if (interfaceC1041500dD2 == null || (realCreativeIdStr = interfaceC1041500dD2.getRealCreativeIdStr()) == null) {
            realCreativeIdStr = "";
        }
        Pair pair = (Pair) ((LinkedHashMap) map).get(realCreativeIdStr);
        if (pair != null && (set = (Set) pair.getSecond()) != null) {
            set.add(this.s0);
        }
        C1490740otc c1490740otc = C1490740otc.LIZ;
        EnumC1490770otf enumC1490770otf = EnumC1490770otf.I;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onGeckoPreloadStatus ");
        sbLIZ.append(this.s0);
        c1490740otc.LIZ(C2188811AlT.LIZIZ(sbLIZ), enumC1490770otf, "CommerceLandPageTTWebModule_");
    }

    public final void LIZ$4() throws JSONException {
        String strGenerateAdLynxLogExtra;
        InterfaceC1541990qEH kitView;
        AwemeCommerceStruct commerceVideoAuthInfo;
        ((C999500c7I) this.l1).LLJIJIL = true;
        C1440005kM.LIZ(new C988880bqA(true));
        FeedAdLynxCard feedAdLynxCard = ((C999500c7I) this.l1).LLILZIL;
        if (feedAdLynxCard != null) {
            feedAdLynxCard.LJIILIIL(0);
        }
        C999500c7I c999500c7I = (C999500c7I) this.l1;
        FrameLayout frameLayout = c999500c7I.LLILLL;
        if (frameLayout != null) {
            C786410Ut5.U4(frameLayout, 0.0f);
            if (!c999500c7I.LLJJI) {
                C786410Ut5.LJZ(0, frameLayout);
            }
            C786410Ut5.fd(frameLayout, C341940Daq.LIZ(15.0d));
            frameLayout.animate().alpha(1.0f).translationY(0.0f).setInterpolator(new LinearInterpolator()).setDuration(290L).start();
        }
        FeedAdLynxCard feedAdLynxCard2 = ((C999500c7I) this.l1).LLILZIL;
        if (feedAdLynxCard2 != null) {
            String str = this.s0;
            if (str == null) {
                str = "normal";
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appearCount", feedAdLynxCard2.LLJZ);
            feedAdLynxCard2.LJIIJ("event_card_show", jSONObject);
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "othershow", feedAdLynxCard2.LLILZ);
            c1022820ciuLIZLLL.LIZJ("card", "refer");
            c1022820ciuLIZLLL.LIZIZ(C1019100ccu.LJ(feedAdLynxCard2.LLILLL), "room_id");
            c1022820ciuLIZLLL.LIZIZ(C1019100ccu.LIZLLL(feedAdLynxCard2.LLILLL), "anchor_id");
            c1022820ciuLIZLLL.LIZIZ(str, "show_type");
            C1001410cAN c1001410cAN = C1001410cAN.LIZIZ;
            c1022820ciuLIZLLL.LIZIZ(c1001410cAN.LIZIZ() ? "1" : CardStruct.IStatusCode.DEFAULT, "use_idle_preload");
            if (c1001410cAN.LIZIZ()) {
                Aweme aweme = feedAdLynxCard2.LLILLL;
                C1001420cAO c1001420cAOLJIIIIZZ = c1001410cAN.LJIIIIZZ(aweme != null ? aweme.getAid() : null, EnumC1001380cAK.CARD_OPERATION, EnumC599900Nfw.FEED);
                c1022820ciuLIZLLL.LIZIZ((c1001420cAOLJIIIIZZ == null || !c1001420cAOLJIIIIZZ.LIZ()) ? CardStruct.IStatusCode.DEFAULT : "1", "idle_preload_status");
            }
            c1022820ciuLIZLLL.LJII();
            if (feedAdLynxCard2.LLILZLL != -100 || feedAdLynxCard2.LLIZ != -100) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LIZJ(feedAdLynxCard2.LLILZLL, "original_time");
                c2344009Gk.LIZJ(feedAdLynxCard2.LLIZ, "real_time");
                c2344009Gk.LIZJ(3, "tag");
                Aweme aweme2 = feedAdLynxCard2.LLILLL;
                c2344009Gk.LJIIIIZZ("group_id", aweme2 != null ? aweme2.getAid() : null);
                Aweme aweme3 = feedAdLynxCard2.LLILLL;
                c2344009Gk.LJIIIIZZ("request_id", aweme3 != null ? aweme3.getRequestId() : null);
                c2344009Gk.LIZJ(feedAdLynxCard2.LLIZLLLIL, "is_adjusted");
                C20684815ws.LJIILLIIL("ad_ui_adjust", c2344009Gk.LIZ);
            }
            if (feedAdLynxCard2.LLILLL != null && (!TextUtils.isEmpty(C1017070cZd.LJJJJ(r0)))) {
                C2344009Gk c2344009Gk2 = new C2344009Gk();
                Aweme aweme4 = feedAdLynxCard2.LLILLL;
                c2344009Gk2.LJIIIIZZ("cid", (aweme4 == null || (commerceVideoAuthInfo = aweme4.getCommerceVideoAuthInfo()) == null) ? null : commerceVideoAuthInfo.getCreativeId());
                Aweme aweme5 = feedAdLynxCard2.LLILLL;
                c2344009Gk2.LJIIIIZZ("enter_method", aweme5 != null ? C1017070cZd.LJJJJ(aweme5) : null);
                C20684815ws.LJIILLIIL("ad_feedback_other_show", c2344009Gk2.LIZ);
            }
            if (feedAdLynxCard2.LLILZ == null) {
                C20684815ws.onEventV3("card_scoring_show");
            }
        }
        Aweme aweme6 = ((C999500c7I) this.l1).LLJI;
        if (aweme6 != null) {
            String strGenerateTrackId = ((IECommerceService) ServiceManager.get().getService(IECommerceService.class)).generateTrackId(aweme6);
            ((IECommerceService) ServiceManager.get().getService(IECommerceService.class)).reportAdVideoLog(aweme6, true, 3, strGenerateTrackId);
            strGenerateAdLynxLogExtra = ((IECommerceService) ServiceManager.get().getService(IECommerceService.class)).generateAdLynxLogExtra(aweme6, strGenerateTrackId);
        } else {
            strGenerateAdLynxLogExtra = "";
        }
        FeedAdLynxCard feedAdLynxCard3 = ((C999500c7I) this.l1).LLILZIL;
        if (feedAdLynxCard3 != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("aweme_log", strGenerateAdLynxLogExtra);
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = feedAdLynxCard3.LLJJJIL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB == null || (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) == null) {
                return;
            }
            kitView.X0("sendAwemeLogEvent", Collections.singletonList(jSONObject2));
        }
    }

    public static final void run$0(ARunnableS21S1100000_16 aRunnableS21S1100000_16) {
        boolean zLIZ;
        C1C7U.LIZ("SparkView@faa0.refreshDebugInfo$3");
        try {
            aRunnableS21S1100000_16.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SparkView@faa0.refreshDebugInfo$3");
    }

    public static final void run$1(ARunnableS21S1100000_16 aRunnableS21S1100000_16) {
        boolean zLIZ;
        C1C7U.LIZ("AdLandPagePreloadServiceImpl@7476.fetchPreloadAnalyticsString$1");
        try {
            aRunnableS21S1100000_16.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AdLandPagePreloadServiceImpl@7476.fetchPreloadAnalyticsString$1");
    }

    public static final void run$10(ARunnableS21S1100000_16 aRunnableS21S1100000_16) {
        String str = aRunnableS21S1100000_16.s0;
        InterfaceC442640HXi interfaceC442640HXi = (InterfaceC442640HXi) aRunnableS21S1100000_16.l1;
        C1C7U.LIZ("LightenHelper@aa44.isImageDownloadedAsync$2L");
        C1325420kay.LIZLLL(new ARunnableS35S0110000_16(interfaceC442640HXi, C1325420kay.LIZIZ(str), 7));
        C1C7U.LIZIZ("LightenHelper@aa44.isImageDownloadedAsync$2L");
    }

    public static final void run$11(ARunnableS21S1100000_16 aRunnableS21S1100000_16) {
        boolean zLIZ;
        C1C7U.LIZ("TakoVideoGenProgressAssem@c279.scheduleTimeout$r$1");
        try {
            if (Intrinsics.LJFF(((TakoVideoGenProgressAssem) aRunnableS21S1100000_16.l1).LLJLLIL, aRunnableS21S1100000_16.s0)) {
                ((TakoVideoGenProgressAssem) aRunnableS21S1100000_16.l1).sp();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoVideoGenProgressAssem@c279.scheduleTimeout$r$1");
    }

    public static final void run$12(ARunnableS21S1100000_16 aRunnableS21S1100000_16) {
        boolean zLIZ;
        C1C7U.LIZ("AnoleMaskAssem@df96.createIABAndAttach$1$1$2$1$1");
        try {
            InterfaceC1034470d1h interfaceC1034470d1h = ((AnoleMaskAssem) aRunnableS21S1100000_16.l1).LLJJJJ;
            if (interfaceC1034470d1h != null) {
                interfaceC1034470d1h.ge(EnumC1036640d5C.PAGE_SELECT);
            }
            InterfaceC1034470d1h interfaceC1034470d1h2 = ((AnoleMaskAssem) aRunnableS21S1100000_16.l1).LLJJJJ;
            if (interfaceC1034470d1h2 != null) {
                interfaceC1034470d1h2.LJJ(aRunnableS21S1100000_16.s0);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AnoleMaskAssem@df96.createIABAndAttach$1$1$2$1$1");
    }

    public static final void run$2(ARunnableS21S1100000_16 aRunnableS21S1100000_16) {
        boolean zLIZ;
        C1C7U.LIZ("TrackSDKHelper@a239.initTracker$1$1$reportRunnable$1");
        try {
            aRunnableS21S1100000_16.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TrackSDKHelper@a239.initTracker$1$1$reportRunnable$1");
    }

    public static final void run$3(ARunnableS21S1100000_16 aRunnableS21S1100000_16) {
        boolean zLIZ;
        C1C7U.LIZ("CommerceLandPageSSPContext@54b7.onPrefetchErrorStatus$1");
        try {
            ((C1042650dEt) aRunnableS21S1100000_16.l1).LJIL.add(aRunnableS21S1100000_16.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommerceLandPageSSPContext@54b7.onPrefetchErrorStatus$1");
    }

    public static final void run$4(ARunnableS21S1100000_16 aRunnableS21S1100000_16) {
        boolean zLIZ;
        C1C7U.LIZ("CommerceLandPageTTWebModule@fad7.onGeckoPreloadStatus$1");
        try {
            aRunnableS21S1100000_16.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommerceLandPageTTWebModule@fad7.onGeckoPreloadStatus$1");
    }

    public static final void run$5(ARunnableS21S1100000_16 aRunnableS21S1100000_16) {
        boolean zLIZ;
        C1C7U.LIZ("MainPageBusinessAssem@2e4b.performToTab$1");
        try {
            AbstractC1591090rVT abstractC1591090rVTNo = ((MainPageBusinessAssem) aRunnableS21S1100000_16.l1).No();
            if (abstractC1591090rVTNo != null) {
                abstractC1591090rVTNo.LJJIJ(aRunnableS21S1100000_16.s0);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MainPageBusinessAssem@2e4b.performToTab$1");
    }

    public static final void run$6(ARunnableS21S1100000_16 aRunnableS21S1100000_16) {
        boolean zLIZ;
        C1C7U.LIZ("FeedAdCardDelegate@b34a.show$showRunnable$1$1");
        try {
            aRunnableS21S1100000_16.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FeedAdCardDelegate@b34a.show$showRunnable$1$1");
    }

    public static final void run$7(ARunnableS21S1100000_16 aRunnableS21S1100000_16) {
        boolean zLIZ;
        C1C7U.LIZ("VirtualTicketCrossRoomGuidePresenter@d6d0.scheduleFlushAfterMvpSettle$runnable$1");
        try {
            C1104820erA c1104820erA = (C1104820erA) aRunnableS21S1100000_16.l1;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(aRunnableS21S1100000_16.s0);
            sbLIZ.append("_settled");
            C2188811AlT.LIZIZ(sbLIZ);
            c1104820erA.LIZJ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VirtualTicketCrossRoomGuidePresenter@d6d0.scheduleFlushAfterMvpSettle$runnable$1");
    }

    public static final void run$8(ARunnableS21S1100000_16 aRunnableS21S1100000_16) {
        boolean zLIZ;
        C1C7U.LIZ("ClientImpl@5fd5.destroyAuxStreamVideoRender$1");
        try {
            ((C1274810jHL) aRunnableS21S1100000_16.l1).LJLIIL(aRunnableS21S1100000_16.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ClientImpl@5fd5.destroyAuxStreamVideoRender$1");
    }

    public static final void run$9(ARunnableS21S1100000_16 aRunnableS21S1100000_16) {
        String str = aRunnableS21S1100000_16.s0;
        InterfaceC442640HXi interfaceC442640HXi = (InterfaceC442640HXi) aRunnableS21S1100000_16.l1;
        C1C7U.LIZ("LightenHelper@aa44.getImageFilePathAsync$2L");
        File fileLIZLLL = C1331660kl2.LIZJ().LIZLLL(UriProtector.parse(str));
        if (fileLIZLLL == null) {
            C1325420kay.LIZLLL(new ARunnableS116S0100000_16(interfaceC442640HXi, 249));
        } else {
            C1325420kay.LIZLLL(new ARunnableS85S0200000_16(interfaceC442640HXi, fileLIZLLL, 70));
        }
        C1C7U.LIZIZ("LightenHelper@aa44.getImageFilePathAsync$2L");
    }

    public ARunnableS21S1100000_16(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }

    public ARunnableS21S1100000_16(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, String str, boolean z, String str2, String str3, String str4, C259800zU c259800zU, int i) {
        this.$t = i;
        this.l1 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        this.s0 = str;
    }
}
