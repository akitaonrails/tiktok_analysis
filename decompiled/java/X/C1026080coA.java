package X;

import Y.ARunnableS116S0100000_16;
import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.crash.Npth;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.tux.sheet.sheet.TuxSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.IAnoleManager;
import com.ss.android.ugc.aweme.IAnoleService;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.ad.log.PageStayDurationHelper;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.AdlpExtraModel;
import com.ss.android.ugc.aweme.commercialize.model.AdStyleActionModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.feed.model.AutoPullUpConfig;
import com.ss.android.ugc.aweme.feed.model.AutoPullUpTriggerType;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.NativeAuthorInfo;
import com.ss.android.ugc.aweme.feed.model.ad.AdOneStopLandingPageConfig;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.landpage.popup.IAdLandingPagePopUpService;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS81S0100100_16;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0coA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1026080coA implements InterfaceC1034510d1l {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final InterfaceC1026140coG LL;
    public IAnoleManager LLILZ;
    public ViewGroup LLILZIL;
    public AnonymousClass0956 LLILZLL;
    public final C997320c3m LLILLJJLI = new C997320c3m(AFwS252S0000000_16.get$arr$(456));
    public final C997320c3m LLILLL = new C997320c3m(AFwS252S0000000_16.get$arr$(455));
    public final C1026190coL LLIZ = new C1026190coL();
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 727));
    public final PageStayDurationHelper LLJ = new PageStayDurationHelper(new C1030210cup());
    public final C1026200coM LLJI = (C1026200coM) C452501pT.LIZIZ(new AwS417S0200000_16(new C1026190coL(), this, 59)).getValue();
    public final C01GW LLJIJIL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(390));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1026080coA.class, "context", "getContext()Landroid/content/Context;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1026080coA.class, "aweme", "getAweme()Lcom/ss/android/ugc/aweme/feed/model/Aweme;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public final Aweme LIZIZ() {
        C997320c3m c997320c3m = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (Aweme) c997320c3m.LIZ(this);
    }

    public final Context LIZJ() {
        C997320c3m c997320c3m = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (Context) c997320c3m.LIZ(this);
    }

    public final C1026200coM LIZLLL() {
        return (C1026200coM) this.LLIZLLLIL.getValue();
    }

    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
        String aid = LIZIZ().getAid();
        AwemeRawAd awemeRawAd = LIZIZ().getAwemeRawAd();
        if (aid == null || awemeRawAd == null) {
            return;
        }
        this.LLILZ = ((IAnoleService) ServiceManager.get().getService(IAnoleService.class)).LJI(LIZJ(), null, new C1009340cNA(aid, LIZIZ().getGroupId(), LIZIZ(), awemeRawAd, null, null, null, 112), new InterfaceC1007910cKr() { // from class: X.0cO1
            @Override // X.InterfaceC1007910cKr
            public final void LIZIZ(AbstractC991850bux abstractC991850bux, InterfaceC1007930cKt interfaceC1007930cKt) {
            }

            @Override // X.InterfaceC1007910cKr
            public final void LJJLIIJ() {
            }

            @Override // X.InterfaceC1007910cKr
            public final long LJJLIL() {
                return 0L;
            }

            @Override // X.InterfaceC1007910cKr
            public final int LLJILLL() {
                return 0;
            }

            @Override // X.InterfaceC1007910cKr
            public final void LLJJIII(String str, View.OnLayoutChangeListener onLayoutChangeListener) {
            }

            @Override // X.InterfaceC1007910cKr
            public final C1014410cVL LLJJIJI(String str) {
                return null;
            }

            @Override // X.InterfaceC1007910cKr
            public final C1014390cVJ LLJJIJIIJIL() {
                return null;
            }

            @Override // X.InterfaceC1007910cKr
            public final void P() {
            }

            @Override // X.InterfaceC1007910cKr
            public final void U2() {
            }

            @Override // X.InterfaceC1007910cKr
            public final JSONObject V2() {
                return null;
            }

            @Override // X.InterfaceC1007910cKr
            public final void X2(String str, ViewOnLayoutChangeListenerC1014330cVD viewOnLayoutChangeListenerC1014330cVD) {
            }

            @Override // X.InterfaceC1007910cKr
            public final HashMap<String, Object> Z2() {
                return null;
            }

            @Override // X.InterfaceC1007910cKr
            public final boolean a3(String str, Runnable runnable, int i) {
                return true;
            }

            @Override // X.InterfaceC1007910cKr
            public final ViewGroup b3() {
                return null;
            }

            @Override // X.InterfaceC1007910cKr
            public final boolean d3() {
                return true;
            }

            @Override // X.InterfaceC1007910cKr
            public final boolean e3() {
                return false;
            }

            @Override // X.InterfaceC1007910cKr
            public final void f3(long j, String str, String str2, AwS81S0100100_16 awS81S0100100_16) {
            }

            @Override // X.InterfaceC1007910cKr
            public final void g3(int i) {
            }

            @Override // X.InterfaceC1007910cKr
            public final boolean h3(String str, InterfaceC1007930cKt interfaceC1007930cKt, AnoleComponentAppearModel anoleComponentAppearModel) {
                return true;
            }

            @Override // X.InterfaceC1007910cKr
            public final Integer i3() {
                return null;
            }

            @Override // X.InterfaceC1007910cKr
            public final void o0() {
            }

            @Override // X.InterfaceC1007910cKr
            public final void pauseVideo() {
            }

            @Override // X.InterfaceC1007910cKr
            public final long r1() {
                return 0L;
            }

            @Override // X.InterfaceC1007910cKr
            public final C1014390cVJ Y2() {
                double width = this.LIZ.LLILZIL != null ? r0.getWidth() : 0.0d;
                double height = this.LIZ.LLILZIL != null ? r0.getHeight() : 0.0d;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getDisplayInfo  width= ");
                sbLIZ.append(width);
                sbLIZ.append(" height= ");
                sbLIZ.append(height);
                C2188811AlT.LIZIZ(sbLIZ);
                double d = 2;
                return new C1014390cVJ(new C1009390cNF(width, height), new PointF((float) (width / d), (float) (height / d)));
            }

            @Override // X.InterfaceC1007910cKr
            public final C1008080cL8 c3() {
                return ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJJIIZI(this.LIZ.LIZJ(), this.LIZ.LIZIZ(), null);
            }

            @Override // X.InterfaceC1007910cKr
            public final C1009390cNF W2(String str) {
                return C1008220cLM.LIZ();
            }
        }, null);
    }

    @Override // X.InterfaceC1034510d1l
    public final void onPagePause() {
        C1022620cia.LIZ("CommerceProfilePageModule", "onPagePause");
        this.LLIZ.LIZIZ = true;
        if (LIZIZ().isAd()) {
            this.LLJ.LL.LIZ();
            this.LLJ.LIZ(false);
        }
    }

    public final boolean LJFF() {
        C1017200cZq c1017200cZqLJIL;
        InterfaceC1008930cMV interfaceC1008930cMVLJ = ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZIZ().LJ();
        return (interfaceC1008930cMVLJ == null || (c1017200cZqLJIL = interfaceC1008930cMVLJ.LJIL()) == null || !c1017200cZqLJIL.LIZIZ(LIZIZ().getAwemeRawAd())) ? false : true;
    }

    @Override // X.InterfaceC1034510d1l
    public final void Ou2() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hostDisDisappear: pullUpJobHadExecute -> ");
        sbLIZ.append(this.LLIZ.LIZJ);
        C1022620cia.LIZ("CommerceProfilePageModule", C2188811AlT.LIZIZ(sbLIZ));
        if (LIZIZ().isAd()) {
            this.LLJ.LL.LIZ();
            this.LLJ.LIZ(false);
        }
        IAnoleManager iAnoleManager = this.LLILZ;
        if (iAnoleManager != null) {
            iAnoleManager.LIZ();
        }
        IAnoleManager iAnoleManager2 = this.LLILZ;
        if (iAnoleManager2 != null) {
            iAnoleManager2.LJIIJJI("tt_profile_full_screen");
        }
        this.LLILZIL = null;
        this.LLIZ.LIZLLL = false;
        AnonymousClass0956 anonymousClass0956 = this.LLILZLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLILZLL = null;
        if (!C1017180cZo.LIZJ(LIZIZ().getAwemeRawAd()) || this.LLIZ.LIZJ) {
            return;
        }
        LIZLLL().logAd(C1026320coY.LIZ);
    }

    @Override // X.InterfaceC1010530cP5
    public final /* bridge */ /* synthetic */ InterfaceC1026140coG Mh() {
        return this.LL;
    }

    public C1026080coA(C1026220coO c1026220coO) {
        this.LL = c1026220coO;
    }

    public final Map<String, String> LIZ(Boolean bool) {
        Integer numValueOf;
        String string;
        String string2;
        Pair[] pairArr = new Pair[8];
        pairArr[0] = new Pair("enterTime", String.valueOf(this.LLIZ.LIZ));
        pairArr[1] = new Pair("isVisibleToUser", String.valueOf(this.LLIZ.LIZLLL));
        pairArr[2] = new Pair("pullUpJobHadExecute", String.valueOf(this.LLIZ.LIZJ));
        pairArr[3] = new Pair("isPagePaused", String.valueOf(this.LLIZ.LIZIZ));
        AutoPullUpConfig autoPullUpConfigLJIJJ = C1017070cZd.LJIJJ(LIZIZ().getAwemeRawAd());
        if (autoPullUpConfigLJIJJ != null) {
            numValueOf = Integer.valueOf(autoPullUpConfigLJIJJ.getTriggerType());
        } else {
            numValueOf = null;
        }
        pairArr[4] = new Pair("triggerType", String.valueOf(numValueOf));
        AnonymousClass0956 anonymousClass0956 = this.LLILZLL;
        String str = "null";
        if (anonymousClass0956 == null || (string = Boolean.valueOf(anonymousClass0956.isActive()).toString()) == null) {
            string = "null";
        }
        pairArr[5] = new Pair("jumpJobIsActive", string);
        AnonymousClass0956 anonymousClass09562 = this.LLILZLL;
        if (anonymousClass09562 != null && (string2 = Boolean.valueOf(anonymousClass09562.isCompleted()).toString()) != null) {
            str = string2;
        }
        pairArr[6] = new Pair("jumpJobCompleted", str);
        pairArr[7] = new Pair("fragmentVisible", String.valueOf(bool));
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(int r39) {
        /*
            Method dump skipped, instruction units count: 731
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1026080coA.LJ(int):void");
    }

    public final void LJIIIIZZ(AutoPullUpTriggerType autoPullUpTriggerType) {
        Integer numValueOf;
        if (LJFF() || !C1017180cZo.LIZJ(LIZIZ().getAwemeRawAd())) {
            return;
        }
        AutoPullUpConfig autoPullUpConfigLJIJJ = C1017070cZd.LJIJJ(LIZIZ().getAwemeRawAd());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("triggerFullScreenJump: timerType ->  ");
        sbLIZ.append(autoPullUpTriggerType.getValue());
        sbLIZ.append(", configType -> ");
        if (autoPullUpConfigLJIJJ != null) {
            numValueOf = Integer.valueOf(autoPullUpConfigLJIJJ.getTriggerType());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C1022620cia.LIZ("CommerceProfilePageModule", C2188811AlT.LIZIZ(sbLIZ));
        if (autoPullUpConfigLJIJJ != null && autoPullUpTriggerType.getValue() == autoPullUpConfigLJIJJ.getTriggerType()) {
            AnonymousClass0956 anonymousClass0956 = this.LLILZLL;
            if (anonymousClass0956 != null && anonymousClass0956.isActive()) {
                return;
            }
            AnonymousClass0956 anonymousClass09562 = this.LLILZLL;
            if (anonymousClass09562 != null && anonymousClass09562.isCompleted()) {
                return;
            }
            this.LLILZLL = C23250099c.LIZLLL(C2296808zG.LIZIZ(), null, null, new C1026090coB(autoPullUpConfigLJIJJ, this, null), 3);
        }
    }

    @Override // X.InterfaceC1034510d1l
    public final void LZ(AbstractC1026180coK abstractC1026180coK) {
        String type;
        if (Intrinsics.LJFF(abstractC1026180coK, C1026270coT.LIZ)) {
            C1022620cia.LIZ("CommerceProfilePageModule", "onUserInfoLoaded");
            LJIIIIZZ(AutoPullUpTriggerType.USER_DATA_READY);
            return;
        }
        if (Intrinsics.LJFF(abstractC1026180coK, C1026260coS.LIZ)) {
            C1022620cia.LIZ("CommerceProfilePageModule", "onPageCompleteLoaded");
            LJIIIIZZ(AutoPullUpTriggerType.USER_AND_POST_DATA_READY);
            return;
        }
        if (Intrinsics.LJFF(abstractC1026180coK, C1026240coQ.LIZ)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onBannerClicked: adType -> ");
            AwemeRawAd awemeRawAd = LIZIZ().getAwemeRawAd();
            Integer numValueOf = null;
            if (awemeRawAd != null) {
                numValueOf = Integer.valueOf(awemeRawAd.getAdType());
            }
            sbLIZ.append(numValueOf);
            C1022620cia.LIZ("CommerceProfilePageModule", C2188811AlT.LIZIZ(sbLIZ));
            C1029590ctp.LIZLLL().LJJIIZ(LIZJ(), LIZIZ());
            AwemeRawAd awemeRawAd2 = LIZIZ().getAwemeRawAd();
            if (awemeRawAd2 != null && (type = awemeRawAd2.getType()) != null) {
                int iHashCode = type.hashCode();
                if (iHashCode != 117588) {
                    if (iHashCode == 954925063 && type.equals("message")) {
                        C1026200coM c1026200coMLIZLLL = LIZLLL();
                        C1026110coD.LIZ.getClass();
                        c1026200coMLIZLLL.logAd(C1026110coD.LIZJ);
                    }
                } else if (type.equals("web")) {
                    C1026200coM c1026200coMLIZLLL2 = LIZLLL();
                    C1026110coD.LIZ.getClass();
                    c1026200coMLIZLLL2.logAd(C1026110coD.LIZIZ);
                }
            }
            LJ(8);
            return;
        }
        if (Intrinsics.LJFF(abstractC1026180coK, C1026250coR.LIZ)) {
            C1022620cia.LIZ("CommerceProfilePageModule", "onBannerShow");
            LIZLLL().logAd(C1004240cEw.LIZ);
            return;
        }
        throw new C1954807lC();
    }

    @Override // X.InterfaceC1034510d1l
    public final void s41(ViewGroup viewGroup) {
        C1022620cia.LIZ("CommerceProfilePageModule", "hostWillAppear");
        C1026190coL c1026190coL = this.LLIZ;
        c1026190coL.getClass();
        c1026190coL.LIZ = System.currentTimeMillis();
        c1026190coL.LIZIZ = false;
        c1026190coL.LIZJ = false;
        c1026190coL.LIZLLL = true;
        this.LLILZIL = viewGroup;
        IAnoleManager iAnoleManager = this.LLILZ;
        if (iAnoleManager != null) {
            iAnoleManager.mount(viewGroup, "tt_profile_full_screen", null);
        }
        IAnoleManager iAnoleManager2 = this.LLILZ;
        if (iAnoleManager2 != null) {
            iAnoleManager2.LIZJ();
        }
        if (LIZIZ().isAd()) {
            this.LLJ.LIZ(true);
            PageStayDurationHelper.LIZIZ(this.LLJ, this.LLJI, "homepage_ad", "profile_staytime", LIZIZ().getAwemeRawAd());
        }
        LJIIIIZZ(AutoPullUpTriggerType.TEMPLATE_READY);
    }

    @Override // X.InterfaceC1034510d1l
    public final void xt2(Boolean bool) {
        NativeAuthorInfo nativeAuthorInfo;
        C1022620cia.LIZ("CommerceProfilePageModule", "onPageResume");
        this.LLIZ.LIZIZ = false;
        try {
            if (((Boolean) C0A9P.LIZ.getValue()).booleanValue() && !LJFF() && C1017180cZo.LIZJ(LIZIZ().getAwemeRawAd()) && !this.LLIZ.LIZJ) {
                Map<String, String> mapLIZ = LIZ(bool);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("pageState", this.LLIZ);
                AwemeRawAd awemeRawAd = LIZIZ().getAwemeRawAd();
                if (awemeRawAd != null) {
                    nativeAuthorInfo = awemeRawAd.getNativeAuthorInfo();
                } else {
                    nativeAuthorInfo = null;
                }
                jSONObject.put("nativeAuthorInfo", nativeAuthorInfo);
                jSONObject.put("fragmentVisible", bool);
                try {
                    C1227904rF.LIZ.getClass();
                    String strLJI = C1227904rF.LJI(jSONObject);
                    Npth.reportBizException("spark_ads_profile_auto_iab", new Throwable(strLJI), strLJI, mapLIZ, true);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LJ(e);
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C1AF0.LJ(e2);
        }
        if (LIZIZ().isAd()) {
            this.LLJ.LIZ(true);
            PageStayDurationHelper.LIZIZ(this.LLJ, this.LLJI, "homepage_ad", "profile_staytime", LIZIZ().getAwemeRawAd());
        }
    }

    public final void LJI(final boolean z, C1026310coX c1026310coX, int i) {
        AdStyleActionModel adStyleActionModel;
        AdOneStopLandingPageConfig adOneStopLandingPageConfig;
        Integer style;
        C1022620cia.LIZ("CommerceProfilePageModule", "openWebWithDragDown");
        if (C1017070cZd.LLIIIJ(LIZIZ())) {
            C1029590ctp.LIZIZ();
            C0SQ9.LIZ(LIZJ(), LIZIZ(), i, null);
            return;
        }
        if (C1017070cZd.LLILLIZIL(LIZIZ())) {
            C1029590ctp.LIZIZ();
            C0SQ9.LIZ(LIZJ(), LIZIZ(), i, null);
            return;
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(LIZJ());
        if (c19egLIZIZ == null) {
            return;
        }
        AwemeRawAd awemeRawAd = LIZIZ().getAwemeRawAd();
        if (awemeRawAd != null && (adStyleActionModel = awemeRawAd.getAdStyleActionModel()) != null && (adOneStopLandingPageConfig = adStyleActionModel.landingPageConfig) != null && (style = adOneStopLandingPageConfig.getStyle()) != null && style.intValue() == 1) {
            AdlpExtraModel adlpExtraModel = c1026310coX.getAdlpExtraModel();
            if (adlpExtraModel != null) {
                adlpExtraModel.setEnterScene("profile_bottom_banner");
            }
            c1026310coX.getTuxSheetConfig().setHasOverlay(Boolean.FALSE);
        }
        AdlpExtraModel adlpExtraModel2 = c1026310coX.getAdlpExtraModel();
        if (adlpExtraModel2 != null) {
            adlpExtraModel2.setAlphaLoadingEffectiveScene(2);
        }
        ((IAdLandingPagePopUpService) ServiceManager.get().getService(IAdLandingPagePopUpService.class)).LJIIJ(i, c19egLIZIZ, new InterfaceC1036270d4b() { // from class: X.0cuP
            @Override // X.InterfaceC1036270d4b
            public final void Gn(MotionEvent motionEvent) {
            }

            @Override // X.InterfaceC1036270d4b
            public final void LLLFFI(TuxSheet tuxSheet, float f) {
            }

            @Override // X.InterfaceC1036270d4b
            public final void LLLLIIIILLL(TuxSheet tuxSheet, int i2) {
            }

            @Override // X.InterfaceC1036270d4b
            public final void Pu(InterfaceC1034470d1h interfaceC1034470d1h) {
            }

            @Override // X.InterfaceC1036270d4b
            public final void Rg(InterfaceC1034470d1h interfaceC1034470d1h) {
            }

            @Override // X.InterfaceC1036270d4b
            public final void V() {
            }

            @Override // X.InterfaceC1036270d4b
            public final void Yc() {
            }

            @Override // X.InterfaceC1036270d4b
            public final void ha(TuxSheet tuxSheet, InterfaceC1034470d1h interfaceC1034470d1h, String str, String str2) {
            }

            @Override // X.InterfaceC1036270d4b
            public final void ni(TuxSheet tuxSheet, InterfaceC1034470d1h interfaceC1034470d1h) {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC1036270d4b
            public final void s8(TuxSheet tuxSheet, InterfaceC1034470d1h interfaceC1034470d1h, String str) {
                InterfaceC1058150ddt interfaceC1058150ddt;
                BottomSheetBehavior bottomSheetBehavior;
                TuxSheetBehavior tuxSheetBehavior;
                if (!(interfaceC1034470d1h instanceof Fragment)) {
                    return;
                }
                String str2 = TuxSheet._pnsPageId;
                Fragment fragment = (Fragment) interfaceC1034470d1h;
                C16BC c16bcLJIIIZ = C1391190mJ3.LJIIIZ(fragment);
                if (c16bcLJIIIZ != null) {
                    boolean z2 = z;
                    if (C299110Bnx.LIZ()) {
                        if ((c16bcLJIIIZ instanceof TuxSheetBehavior) && (tuxSheetBehavior = (TuxSheetBehavior) c16bcLJIIIZ) != null) {
                            tuxSheetBehavior.LJIJI = z2;
                        }
                    } else if ((c16bcLJIIIZ instanceof BottomSheetBehavior) && (bottomSheetBehavior = (BottomSheetBehavior) c16bcLJIIIZ) != null) {
                        bottomSheetBehavior.setDraggable(z2);
                    }
                }
                View view = fragment.getView();
                if (view != null) {
                    HandlerHook.viewPost(view, new ARunnableS116S0100000_16(interfaceC1034470d1h, 136));
                }
                if ((interfaceC1034470d1h instanceof InterfaceC1058150ddt) && (interfaceC1058150ddt = (InterfaceC1058150ddt) interfaceC1034470d1h) != null && tuxSheet != null) {
                    interfaceC1058150ddt.LLLFFI(tuxSheet, 1.0f);
                }
            }
        }, c1026310coX, null);
    }
}
