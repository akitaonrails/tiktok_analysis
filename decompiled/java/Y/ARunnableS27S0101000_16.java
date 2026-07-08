package Y;

import X.AbstractC1000970c9f;
import X.C07J1;
import X.C0C64;
import X.C0SCL;
import X.C1000880c9W;
import X.C1003080cD4;
import X.C1003240cDK;
import X.C1004960cG6;
import X.C1005030cGD;
import X.C1005750cHN;
import X.C1014700cVo;
import X.C1014730cVr;
import X.C1017070cZd;
import X.C1022620cia;
import X.C1022820ciu;
import X.C1029590ctp;
import X.C1032140cxw;
import X.C1044470dHp;
import X.C1046310dKn;
import X.C1048150dNl;
import X.C1064720doU;
import X.C1427210nF9;
import X.C1619980sG4;
import X.C1C7U;
import X.C2097608Jq;
import X.C214855196n;
import X.C2184171Adz;
import X.C2188811AlT;
import X.C305310Bxx;
import X.C305320Bxy;
import X.C443120HZe;
import X.C989550brF;
import X.C998440c5a;
import X.EnumC1004970cG7;
import X.InterfaceC1004990cG9;
import X.InterfaceC1008930cMV;
import X.InterfaceC1023400cjq;
import X.InterfaceC1046330dKp;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.animation.ValueAnimator;
import android.content.Context;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.preload.gecko.GeckoPreloadServiceImpl;
import com.ss.android.ugc.aweme.autofill.setting.AdAutofillConfigSettings;
import com.ss.android.ugc.aweme.component.ctacomponent.AnolFeedCtaButtonData;
import com.ss.android.ugc.aweme.component.ctacomponent.AnoleFeedCTAData;
import com.ss.android.ugc.aweme.ecommerce.base.sku.powercells.salepropselection.SkuTextSpecCell;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.hybridkit.task.WebViewStartChromiumTask;
import com.ss.android.ugc.aweme.poi.mapdetail.assem.PoiMapDetailAreaFilterAssem;
import com.ss.android.ugc.aweme.poi.mapmode.assem.PoiMapModeFilterAssem;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS124S0101000_16;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class ARunnableS27S0101000_16 implements Runnable {
    public final int $t;
    public int i1;
    public Object l0;

    public static final void run$14(ARunnableS27S0101000_16 aRunnableS27S0101000_16) {
        AbstractC1000970c9f.LIZJ((AbstractC1000970c9f) aRunnableS27S0101000_16.l0, aRunnableS27S0101000_16.i1);
    }

    public final void LIZ$4() {
        final Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("progress", String.valueOf(this.i1)), new Pair("type", "3d_video_interaction_block"));
        ((C1005750cHN) this.l0).LLILLL.LJIJ(new C989550brF(new Object(mapLJIIIIZZ) { // from class: X.0cHL
            public final Map<String, String> LIZ;

            {
                this.LIZ = mapLJIIIIZZ;
            }
        }), (C1005750cHN) this.l0);
    }

    public final void LIZ$5() {
        final Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("progress", String.valueOf(this.i1)), new Pair("type", "3d_video_interaction_resume"));
        ((C1005750cHN) this.l0).LLILLL.LJIJ(new C989550brF(new Object(mapLJIIIIZZ) { // from class: X.0cHM
            public final Map<String, String> LIZ;

            {
                this.LIZ = mapLJIIIIZZ;
            }
        }), (C1005750cHN) this.l0);
    }

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
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                run$13(this);
                break;
            case 14:
                run$14(this);
                break;
            case 15:
                run$15(this);
                break;
            case 16:
                run$16(this);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                run$17(this);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                run$18(this);
                break;
            case 19:
                run$19(this);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                run$20(this);
                break;
            case 21:
                run$21(this);
                break;
            case 22:
                run$22(this);
                break;
            case 23:
                run$23(this);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                run$24(this);
                break;
            case 25:
                run$25(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        if (((GeckoPreloadServiceImpl) this.l0).LIZ) {
            return;
        }
        int i = this.i1;
        ArrayList arrayList = new ArrayList();
        if ((!C0C64.LJIILLIIL().LJIIIZ(31744, "autofill_noneffective_android", true, false) || i != 1) && (C305310Bxx.LIZ() || (C305320Bxy.LIZ() && !C07J1.LIZ()))) {
            Iterator<String> it2 = AdAutofillConfigSettings.LIZ().channelList.iterator();
            while (it2.hasNext()) {
                arrayList.add(new C1048150dNl(it2.next(), "global", true, false, false));
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((GeckoPreloadServiceImpl) this.l0).LJ((C1048150dNl) it3.next());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$1() throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS27S0101000_16.LIZ$1():void");
    }

    public final void LIZ$2() throws JSONException {
        if (((Context) this.l0) != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C1064720doU.LIZIZ((Context) this.l0);
            WebViewStartChromiumTask.LL.getClass();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", System.currentTimeMillis() - jCurrentTimeMillis);
            jSONObject.put("type", "start_chromium");
            ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
            if (iSparkHostApi != null) {
                iSparkHostApi.onEventV3("webview_warm_up_duration", jSONObject);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("start chromium, delay = ");
            sbLIZ.append(this.i1);
            sbLIZ.append(" ms, cost = ");
            sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
            sbLIZ.append(" ms");
            C2188811AlT.LIZIZ(sbLIZ);
        }
        WebViewStartChromiumTask.LL.getClass();
        WebViewStartChromiumTask.LLILLJJLI = true;
    }

    public final void LIZ$3() {
        C1003080cD4 c1003080cD4 = (C1003080cD4) this.l0;
        int i = this.i1;
        c1003080cD4.getClass();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("index", i);
            c1003080cD4.LLJLIL.LJIIZILJ(new C0SCL(jSONObject));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sendIndexSwitch index=");
            sbLIZ.append(i);
            C1022620cia.LIZIZ("AnoleNativeProgressBarComponent", C2188811AlT.LIZIZ(sbLIZ));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LIZ$6() {
        AnolFeedCtaButtonData ctaButtonData;
        C1004960cG6 c1004960cG6 = (C1004960cG6) this.l0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("trigger playProgress=");
        sbLIZ.append(this.i1);
        c1004960cG6.LJJIIJZLJL("registerChangeButtonColor_observer", C2188811AlT.LIZIZ(sbLIZ));
        C1004960cG6 c1004960cG62 = (C1004960cG6) this.l0;
        int i = this.i1;
        c1004960cG62.getClass();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("playProgress=");
        sbLIZ2.append(i);
        c1004960cG62.LJJIIJZLJL("changeButtonColor_enter", C2188811AlT.LIZIZ(sbLIZ2));
        if (c1004960cG62.LLJLLIL) {
            c1004960cG62.LJJIIJZLJL("changeButtonColor_skip", "already changed");
            return;
        }
        if (c1004960cG62.LLJLIL == null) {
            c1004960cG62.LJJIIJZLJL("changeButtonColor_skip", "buttonView is null");
            return;
        }
        InterfaceC1004990cG9 interfaceC1004990cG9 = c1004960cG62.LLLF;
        if (interfaceC1004990cG9 != null && interfaceC1004990cG9.LIZLLL()) {
            c1004960cG62.LJJIIJZLJL("changeButtonColor_skip", "cip downloading");
            return;
        }
        AnoleFeedCTAData anoleFeedCTADataLJJIIJ = c1004960cG62.LJJIIJ();
        if (anoleFeedCTADataLJJIIJ == null) {
            c1004960cG62.LJJIIJZLJL("changeButtonColor_skip", "initialBackgroundColor is null");
            return;
        }
        int initialBackgroundColor = anoleFeedCTADataLJJIIJ.getInitialBackgroundColor();
        AnoleFeedCTAData anoleFeedCTADataLJJIIJ2 = c1004960cG62.LJJIIJ();
        if (anoleFeedCTADataLJJIIJ2 == null) {
            c1004960cG62.LJJIIJZLJL("changeButtonColor_skip", "backgroundColor is null");
            return;
        }
        int backgroundColor = anoleFeedCTADataLJJIIJ2.getBackgroundColor();
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(initialBackgroundColor, backgroundColor);
        valueAnimatorOfArgb.addUpdateListener(new AUListenerS265S0100000_16(c1004960cG62, 55));
        valueAnimatorOfArgb.setDuration(300L);
        valueAnimatorOfArgb.setInterpolator(C1619980sG4.LJIIJJI());
        valueAnimatorOfArgb.start();
        c1004960cG62.LLJLLIL = true;
        c1004960cG62.LLJZ = EnumC1004970cG7.LLILLL;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("playProgress=");
        sbLIZ3.append(i);
        sbLIZ3.append(",initialBackgroundColor=");
        sbLIZ3.append(initialBackgroundColor);
        sbLIZ3.append(",backgroundColor=");
        sbLIZ3.append(backgroundColor);
        c1004960cG62.LJJIIJZLJL("changeButtonColor_exit", C2188811AlT.LIZIZ(sbLIZ3));
        C1005030cGD c1005030cGD = (C1005030cGD) c1004960cG62.LLLFZ.getValue();
        AnoleFeedCTAData anoleFeedCTADataLJJIIJ3 = c1004960cG62.LJJIIJ();
        c1005030cGD.logAd((InterfaceC1023400cjq<C443120HZe<String, String, String>>) c1005030cGD.LJ.getValue(), new AwS124S0101000_16(i, (anoleFeedCTADataLJJIIJ3 == null || (ctaButtonData = anoleFeedCTADataLJJIIJ3.getCtaButtonData()) == null) ? null : ctaButtonData.buttonType, 19));
    }

    public static final void run$0(ARunnableS27S0101000_16 aRunnableS27S0101000_16) {
        boolean zLIZ;
        C1C7U.LIZ("PoiMapDetailAreaFilterAssem@38f4.areaScrollToPosition$1$1");
        try {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = ((PoiMapDetailAreaFilterAssem) aRunnableS27S0101000_16.l0).LLJILLL;
            if (viewOnAttachStateChangeListenerC20604515jv != null) {
                viewOnAttachStateChangeListenerC20604515jv.scrollToPosition(aRunnableS27S0101000_16.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiMapDetailAreaFilterAssem@38f4.areaScrollToPosition$1$1");
    }

    public static final void run$1(ARunnableS27S0101000_16 aRunnableS27S0101000_16) {
        boolean zLIZ;
        C1C7U.LIZ("PoiMapDetailAreaFilterAssem@38f4.optionsScrollToPosition$1$1");
        try {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = ((PoiMapDetailAreaFilterAssem) aRunnableS27S0101000_16.l0).LLJJ;
            if (viewOnAttachStateChangeListenerC20604515jv != null) {
                viewOnAttachStateChangeListenerC20604515jv.scrollToPosition(aRunnableS27S0101000_16.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiMapDetailAreaFilterAssem@38f4.optionsScrollToPosition$1$1");
    }

    public static final void run$10(ARunnableS27S0101000_16 aRunnableS27S0101000_16) {
        boolean zLIZ;
        C1C7U.LIZ("CommerceCarouselTagAdapterModule@8c82.onHolderSelected$1");
        try {
            ((C1000880c9W) aRunnableS27S0101000_16.l0).LIZIZ(aRunnableS27S0101000_16.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommerceCarouselTagAdapterModule@8c82.onHolderSelected$1");
    }

    public static final void run$11(ARunnableS27S0101000_16 aRunnableS27S0101000_16) {
        boolean zLIZ;
        C1C7U.LIZ("CommerceCarouselTagAdapterModule@8c82.onPhotoHolderSelected$2");
        try {
            ((C1000880c9W) aRunnableS27S0101000_16.l0).LIZIZ(aRunnableS27S0101000_16.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommerceCarouselTagAdapterModule@8c82.onPhotoHolderSelected$2");
    }

    public static final void run$12(ARunnableS27S0101000_16 aRunnableS27S0101000_16) {
        boolean zLIZ;
        C1C7U.LIZ("ImageVoiceHostAdapter@9153.deferThumbnailResizeUnlock$1");
        try {
            C214855196n c214855196n = (C214855196n) aRunnableS27S0101000_16.l0;
            if (c214855196n.LJIJI == aRunnableS27S0101000_16.i1) {
                c214855196n.LJFF.invoke(Boolean.FALSE, null);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ImageVoiceHostAdapter@9153.deferThumbnailResizeUnlock$1");
    }

    public static final void run$13(ARunnableS27S0101000_16 aRunnableS27S0101000_16) {
        AbstractC1000970c9f abstractC1000970c9f = (AbstractC1000970c9f) aRunnableS27S0101000_16.l0;
        int i = aRunnableS27S0101000_16.i1;
        abstractC1000970c9f.getClass();
        C1C7U.LIZ("BaseAdBottomLabelView@6b7.showAfterSeconds$1L");
        if (C1017070cZd.LJJLIIJ(abstractC1000970c9f.LLJILLL) && !abstractC1000970c9f.LJJIIJZLJL() && !abstractC1000970c9f.isShown()) {
            abstractC1000970c9f.setLabelVisibility(0);
            abstractC1000970c9f.LJ(abstractC1000970c9f, new ARunnableS27S0101000_16(i, abstractC1000970c9f, 15), true);
        }
        C1029590ctp.LIZJ();
        C998440c5a.LIZ(abstractC1000970c9f.LL, 0, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, true);
        C1C7U.LIZIZ("BaseAdBottomLabelView@6b7.showAfterSeconds$1L");
    }

    public static final void run$15(ARunnableS27S0101000_16 aRunnableS27S0101000_16) {
        InterfaceC1008930cMV interfaceC1008930cMVLJ;
        AbstractC1000970c9f abstractC1000970c9f = (AbstractC1000970c9f) aRunnableS27S0101000_16.l0;
        int i = aRunnableS27S0101000_16.i1;
        abstractC1000970c9f.getClass();
        C1C7U.LIZ("BaseAdBottomLabelView@6b7.showAfterSeconds$1L$1L");
        if (abstractC1000970c9f.LLJILLL == null) {
            C1C7U.LIZIZ("BaseAdBottomLabelView@6b7.showAfterSeconds$1L$1L");
            return;
        }
        C1029590ctp.LIZLLL().LJJIJIIJI(abstractC1000970c9f.LLJILJIL, abstractC1000970c9f.LLJILLL);
        C2184171Adz.LIZLLL("draw_ad", "button_show", abstractC1000970c9f.LLJILLL.getAwemeRawAd()).LJIIIIZZ();
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "othershow", abstractC1000970c9f.LLJILLL.getAwemeRawAd());
        c1022820ciuLIZLLL.LIZJ("button", "refer");
        c1022820ciuLIZLLL.LIZIZ(0, "is_lynx");
        c1022820ciuLIZLLL.LIZIZ(2, "button_type");
        c1022820ciuLIZLLL.LIZIZ(Long.valueOf(((long) i) - abstractC1000970c9f.LLJJJJLIIL), "button_show_time");
        c1022820ciuLIZLLL.LIZIZ("normal", "show_type");
        c1022820ciuLIZLLL.LJIIIIZZ();
        ICommerceService iCommerceService = (ICommerceService) PluggableExtentionKt.pluggableSpi(ICommerceService.class);
        if (iCommerceService != null && iCommerceService.LIZIZ() != null && (interfaceC1008930cMVLJ = iCommerceService.LIZIZ().LJ()) != null) {
            interfaceC1008930cMVLJ.LJII("client_old_cta");
        }
        if (!abstractC1000970c9f.LJJIII()) {
            abstractC1000970c9f.LJJIFFI(1300L);
        }
        HandlerHook.viewPostDelay(abstractC1000970c9f, new ARunnableS116S0100000_16(abstractC1000970c9f, 158), 300L);
        C1C7U.LIZIZ("BaseAdBottomLabelView@6b7.showAfterSeconds$1L$1L");
    }

    public static final void run$16(ARunnableS27S0101000_16 aRunnableS27S0101000_16) {
        boolean zLIZ;
        C1C7U.LIZ("AnoleHybridComponent@5fba.registerPlayback$1$1");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("progress", Integer.valueOf(aRunnableS27S0101000_16.i1));
            C1014700cVo.LIZ((C1014730cVr) aRunnableS27S0101000_16.l0, "isPlaying", jSONObject);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AnoleHybridComponent@5fba.registerPlayback$1$1");
    }

    public static final void run$17(ARunnableS27S0101000_16 aRunnableS27S0101000_16) {
        boolean zLIZ;
        C1C7U.LIZ("PoiMapModeFilterAssem@3cf.distanceScrollToPosition$1$1");
        try {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = ((PoiMapModeFilterAssem) aRunnableS27S0101000_16.l0).LLJJ;
            if (viewOnAttachStateChangeListenerC20604515jv != null) {
                viewOnAttachStateChangeListenerC20604515jv.scrollToPosition(aRunnableS27S0101000_16.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiMapModeFilterAssem@3cf.distanceScrollToPosition$1$1");
    }

    public static final void run$18(ARunnableS27S0101000_16 aRunnableS27S0101000_16) {
        boolean zLIZ;
        C1C7U.LIZ("PoiMapModeFilterAssem@3cf.distanceScrollToPosition$2");
        try {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = ((PoiMapModeFilterAssem) aRunnableS27S0101000_16.l0).LLJJ;
            if (viewOnAttachStateChangeListenerC20604515jv != null) {
                viewOnAttachStateChangeListenerC20604515jv.scrollToPosition(aRunnableS27S0101000_16.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiMapModeFilterAssem@3cf.distanceScrollToPosition$2");
    }

    public static final void run$19(ARunnableS27S0101000_16 aRunnableS27S0101000_16) {
        boolean zLIZ;
        C1C7U.LIZ("PoiMapModeFilterAssem@3cf.landmarkScrollToPosition$1$1");
        try {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = ((PoiMapModeFilterAssem) aRunnableS27S0101000_16.l0).LLJILLL;
            if (viewOnAttachStateChangeListenerC20604515jv != null) {
                viewOnAttachStateChangeListenerC20604515jv.scrollToPosition(aRunnableS27S0101000_16.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiMapModeFilterAssem@3cf.landmarkScrollToPosition$1$1");
    }

    public static final void run$2(ARunnableS27S0101000_16 aRunnableS27S0101000_16) {
        boolean zLIZ;
        C1C7U.LIZ("GeckoPreloadServiceImpl@c068.fetchAdAutofillGeckoResource$1");
        try {
            aRunnableS27S0101000_16.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GeckoPreloadServiceImpl@c068.fetchAdAutofillGeckoResource$1");
    }

    public static final void run$20(ARunnableS27S0101000_16 aRunnableS27S0101000_16) {
        boolean zLIZ;
        C1C7U.LIZ("ReportFeedUIUtils@7608.handleAutoAdDisclaimer$1$onPreDraw$1$1");
        try {
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "othershow", (AwemeRawAd) aRunnableS27S0101000_16.l0);
            c1022820ciuLIZLLL.LIZJ("auto_disclaimer", "refer");
            c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(aRunnableS27S0101000_16.i1), "DisclaimerType");
            c1022820ciuLIZLLL.LJII();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ReportFeedUIUtils@7608.handleAutoAdDisclaimer$1$onPreDraw$1$1");
    }

    public static final void run$21(ARunnableS27S0101000_16 aRunnableS27S0101000_16) {
        boolean zLIZ;
        C1C7U.LIZ("PhotoCarouselController@1a68.attach$2$onPageScrollStateChanged$1$1");
        try {
            C1032140cxw.LJII((C1032140cxw) aRunnableS27S0101000_16.l0, aRunnableS27S0101000_16.i1 - 2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PhotoCarouselController@1a68.attach$2$onPageScrollStateChanged$1$1");
    }

    public static final void run$22(ARunnableS27S0101000_16 aRunnableS27S0101000_16) {
        boolean zLIZ;
        C1C7U.LIZ("PhotoCarouselController@1a68.attach$2$onPageScrollStateChanged$2$1");
        try {
            C1032140cxw.LJII((C1032140cxw) aRunnableS27S0101000_16.l0, aRunnableS27S0101000_16.i1 - 2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PhotoCarouselController@1a68.attach$2$onPageScrollStateChanged$2$1");
    }

    public static final void run$23(ARunnableS27S0101000_16 aRunnableS27S0101000_16) {
        InterfaceC1046330dKp interfaceC1046330dKp = (InterfaceC1046330dKp) aRunnableS27S0101000_16.l0;
        int i = aRunnableS27S0101000_16.i1;
        if (interfaceC1046330dKp != null) {
            int i2 = C1046310dKn.LIZIZ;
            if (i2 == 0) {
                if (i > 0) {
                    interfaceC1046330dKp.LIZIZ();
                    return;
                }
            } else if (i2 > 0 && i == 0) {
                interfaceC1046330dKp.LIZ();
                return;
            }
            interfaceC1046330dKp.LJIIJ();
        }
    }

    public static final void run$24(ARunnableS27S0101000_16 aRunnableS27S0101000_16) {
        boolean zLIZ;
        C1C7U.LIZ("AnoleCTAComponent@69db.registerChangeButtonColor$1");
        try {
            aRunnableS27S0101000_16.LIZ$6();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AnoleCTAComponent@69db.registerChangeButtonColor$1");
    }

    public static final void run$25(ARunnableS27S0101000_16 aRunnableS27S0101000_16) {
        boolean zLIZ;
        C1C7U.LIZ("AnoleDanmakuComponent@1929.mount$facade$1$1$1");
        try {
            ((C1044470dHp) aRunnableS27S0101000_16.l0).Mk(new C1003240cDK(aRunnableS27S0101000_16.i1));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AnoleDanmakuComponent@1929.mount$facade$1$1$1");
    }

    public static final void run$3(ARunnableS27S0101000_16 aRunnableS27S0101000_16) {
        boolean zLIZ;
        C1C7U.LIZ("CommercePhotoModeAssem@4183.preloadLoadingFormatGecko$1");
        try {
            aRunnableS27S0101000_16.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommercePhotoModeAssem@4183.preloadLoadingFormatGecko$1");
    }

    public static final void run$4(ARunnableS27S0101000_16 aRunnableS27S0101000_16) {
        boolean zLIZ;
        C1C7U.LIZ("EffectSearchResultListAdapter@4e28.selectEffect$1");
        try {
            ((C1427210nF9) aRunnableS27S0101000_16.l0).LLILLL.scrollToPosition(aRunnableS27S0101000_16.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EffectSearchResultListAdapter@4e28.selectEffect$1");
    }

    public static final void run$5(ARunnableS27S0101000_16 aRunnableS27S0101000_16) {
        boolean zLIZ;
        C1C7U.LIZ("WebViewStartChromiumTask@7f09.run$1");
        try {
            aRunnableS27S0101000_16.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("WebViewStartChromiumTask@7f09.run$1");
    }

    public static final void run$6(ARunnableS27S0101000_16 aRunnableS27S0101000_16) {
        boolean zLIZ;
        C1C7U.LIZ("SkuTextSpecCell@f744.select$1$1$1");
        try {
            ((SkuTextSpecCell) aRunnableS27S0101000_16.l0).U5().scrollToPosition(aRunnableS27S0101000_16.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SkuTextSpecCell@f744.select$1$1$1");
    }

    public static final void run$7(ARunnableS27S0101000_16 aRunnableS27S0101000_16) {
        boolean zLIZ;
        C1C7U.LIZ("AnoleNativeProgressBarComponent@218d.registerPlayback$1$1");
        try {
            aRunnableS27S0101000_16.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AnoleNativeProgressBarComponent@218d.registerPlayback$1$1");
    }

    public static final void run$8(ARunnableS27S0101000_16 aRunnableS27S0101000_16) {
        boolean zLIZ;
        C1C7U.LIZ("AnoleForegroundVideoComponent@dc8f.initProgressObserver$1$1$1");
        try {
            aRunnableS27S0101000_16.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AnoleForegroundVideoComponent@dc8f.initProgressObserver$1$1$1");
    }

    public static final void run$9(ARunnableS27S0101000_16 aRunnableS27S0101000_16) {
        boolean zLIZ;
        C1C7U.LIZ("AnoleForegroundVideoComponent@dc8f.initProgressObserver$1$2$1");
        try {
            aRunnableS27S0101000_16.LIZ$5();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AnoleForegroundVideoComponent@dc8f.initProgressObserver$1$2$1");
    }

    public ARunnableS27S0101000_16(PoiMapModeFilterAssem poiMapModeFilterAssem, int i) {
        this.$t = i;
        this.l0 = poiMapModeFilterAssem;
        this.i1 = 0;
    }

    public ARunnableS27S0101000_16(int i, Object obj, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
