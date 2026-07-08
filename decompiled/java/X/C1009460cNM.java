package X;

import Y.ARunnableS103S0100000_3;
import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.bytedance.hox.Hox;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.IAnoleManager;
import com.ss.android.ugc.aweme.IAnoleService;
import com.ss.android.ugc.aweme.ad.feed.IRepetitiveVideoQuestionnaireService;
import com.ss.android.ugc.aweme.ad.feed.liveshopping.ICommerceLiveShoppingManager;
import com.ss.android.ugc.aweme.ad.feed.mask.IAnoleMaskAbility;
import com.ss.android.ugc.aweme.api.IFeedService;
import com.ss.android.ugc.aweme.api.brand.likeeffect.ILikeEffectService;
import com.ss.android.ugc.aweme.api.carousel.ICarouselFeedService;
import com.ss.android.ugc.aweme.api.series.ICommerceFeedSeriesService;
import com.ss.android.ugc.aweme.autofill.IAdAutofillService;
import com.ss.android.ugc.aweme.commercialize.ad.service.ICommercializeAdService;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentRelationModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.commercialize.model.CoinRewardData;
import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselInfoStruct;
import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselProductStruct;
import com.ss.android.ugc.aweme.commercialize.model.VideoPlaybackConfig;
import com.ss.android.ugc.aweme.commercialize.quickconversion.api.shopify.IShopifySkuCheckoutService;
import com.ss.android.ugc.aweme.commercialize.service.IComponentShowStatusExamine;
import com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager;
import com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.aweme.feed.model.AdLive;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.ad.QuickActionModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.screenshot.IScreenshotService;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS225S0300000_16;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS452S0200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS81S0100100_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cNM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1009460cNM implements InterfaceC1008930cMV, InterfaceC1007910cKr, InterfaceC1009610cNb {
    public final Aweme LIZ;
    public final String LIZIZ;
    public final Context LIZJ;
    public AbstractC2361009My LJIILIIL;
    public C1009680cNi LJIILJJIL;
    public boolean LJIILL;
    public final IAnoleManager LJIIZILJ;
    public final C0SM6 LJIJ;
    public View LJIJI;
    public boolean LJIJJ;
    public boolean LJIJJLI;
    public boolean LJIL;
    public boolean LJJ;
    public C1001520cAY LJJIFFI;
    public C1898420zVA LJJIII;
    public IComponentShowStatusExamine LJJIIJZLJL;
    public boolean LJJIIZ;
    public boolean LJJIIZI;
    public InterfaceC1009510cNR LJJIJ;
    public InterfaceC990760btC LJJIJIIJI;
    public IAnoleMaskAbility LJJIJIIJIL;
    public InterfaceC990750btB LJJIJIL;
    public JSONObject LJJIJL;
    public InterfaceC1009570cNX LJJIJLIJ;
    public final C01GW LJJIL;
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(612));
    public final C01GW LJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(506));
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(514));
    public final C01GW LJI = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(512));
    public final C01GW LJII = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(510));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1339));
    public final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(517));
    public final C01GW LJIIJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(516));
    public final C01GW LJIIJJI = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(509));
    public final C01GW LJIIL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(508));
    public final C01GW LJIILLIIL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(507));
    public long LJJI = 1;
    public final Set<String> LJJII = new LinkedHashSet();
    public final C01GW LJJIIJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 958));

    @Override // X.InterfaceC1008930cMV
    public final void LJJIII() {
        IAnoleService iAnoleService;
        C1009520cNS c1009520cNSLJII;
        this.LJIILL = false;
        ((Handler) this.LIZLLL.getValue()).removeCallbacksAndMessages(null);
        C622680Oba.LIZLLL(this);
        C1022620cia.LJ("FeedItemModuleImpl", "onViewHolderUnSelected EventBus.getDefault().unregister");
        IAnoleManager iAnoleManager = this.LJIIZILJ;
        if (iAnoleManager != null) {
            iAnoleManager.LIZ();
        }
        LJJJJI().reset();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onViewHolderUnSelected,aweme = ");
        sbLIZ.append(this.LIZ.getAid());
        C2188811AlT.LIZIZ(sbLIZ);
        C1009490cNP c1009490cNP = (C1009490cNP) this.LJFF.getValue();
        c1009490cNP.LIZ = "initial";
        c1009490cNP.LIZIZ = "non_clicked";
        c1009490cNP.LIZJ = "close";
        c1009490cNP.LJI = 0;
        ((IVideoPlayTaskManager) c1009490cNP.LJII.getValue()).reset();
        c1009490cNP.LIZLLL = null;
        c1009490cNP.LJFF = null;
        ((C1017200cZq) this.LJI.getValue()).LIZJ(null, this.LIZ.getAwemeRawAd());
        this.LJJIJIIJI = null;
        LJJIJIL(null);
        this.LJJI = 1L;
        C1009470cNN c1009470cNNLJJJI = LJJJI();
        if (c1009470cNNLJJJI != null && (iAnoleService = (IAnoleService) c1009470cNNLJJJI.LJI.getValue()) != null && (c1009520cNSLJII = iAnoleService.LJII()) != null) {
            ViewGroup viewGroupLIZ = c1009520cNSLJII.LIZ(null);
            if (viewGroupLIZ != null) {
                C786410Ut5.LJLZ(8, viewGroupLIZ);
            }
            c1009520cNSLJII.LIZIZ(false);
            c1009520cNSLJII.LIZJ((C1009580cNY) c1009470cNNLJJJI.LJII.getValue());
            c1009470cNNLJJJI.LIZ.LJIIJJI(EnumC696280RSw.TT_FEED_ABOVE_CELL.getSlotName());
            c1009470cNNLJJJI.LJ = false;
            c1009470cNNLJJJI.LIZLLL = false;
            c1009470cNNLJJJI.LIZJ = false;
            c1009470cNNLJJJI.LJFF = false;
        }
        InterfaceC1009590cNZ interfaceC1009590cNZ = (InterfaceC1009590cNZ) this.LJIIJJI.getValue();
        if (interfaceC1009590cNZ != null) {
            interfaceC1009590cNZ.LIZLLL(this.LIZ.getAid());
        }
        C0SM6 c0sm6 = this.LJIJ;
        if (c0sm6 != null) {
            c0sm6.LJFF();
        }
        ((InterfaceC1013940cUa) this.LJIILLIIL.getValue()).LIZJ();
        AbstractC2361009My abstractC2361009My = this.LJIILIIL;
        if (abstractC2361009My != null) {
            ((IScreenshotService) ServiceManager.get().getService(IScreenshotService.class)).LIZLLL(abstractC2361009My);
        }
        LJJJJ().unPageSelected();
        this.LJIILIIL = null;
        this.LJIILJJIL = null;
        this.LJJIJL = null;
        IComponentShowStatusExamine iComponentShowStatusExamine = this.LJJIIJZLJL;
        if (iComponentShowStatusExamine != null) {
            iComponentShowStatusExamine.clear();
        }
    }

    @Override // X.InterfaceC1007910cKr
    public final void LJJLIIJ() {
    }

    @Override // X.InterfaceC1007910cKr
    public final void g3(int i) {
    }

    @Override // X.InterfaceC1007910cKr
    public final void pauseVideo() {
    }

    public static C1009500cNQ LJJJIL() {
        return (C1009500cNQ) C1619720sFe.LIZ.LIZ(76);
    }

    @Override // X.InterfaceC1008930cMV
    public final void LJFF() {
        IAnoleManager iAnoleManager = this.LJIIZILJ;
        if (iAnoleManager != null) {
            iAnoleManager.LJFF();
        }
        C622680Oba.LIZLLL(this);
        if (((Boolean) C1051710dTV.LIZLLL.getValue()).booleanValue()) {
            LJJJJI().reset();
        }
        this.LJJIIZI = false;
        C1022620cia.LJ("FeedItemModuleImpl", "releasePanel");
    }

    @Override // X.InterfaceC1008930cMV
    public final void LJI() {
        List<IAnoleManager> listLJI;
        IAnoleManager iAnoleManager = this.LJIIZILJ;
        if (iAnoleManager != null) {
            iAnoleManager.clear();
        }
        C0SM6 c0sm6 = this.LJIJ;
        if (c0sm6 != null && (listLJI = c0sm6.LJI()) != null) {
            Iterator<IAnoleManager> it2 = listLJI.iterator();
            while (it2.hasNext()) {
                it2.next().clear();
            }
        }
        this.LJJIIZI = false;
    }

    @Override // X.InterfaceC1009610cNb
    public final boolean LJIIJ() {
        return this.LJIJJ || this.LJIJJLI;
    }

    @Override // X.InterfaceC1009610cNb
    public final void LJIILIIL() {
        InterfaceC990760btC interfaceC990760btC = this.LJJIJIIJI;
        if (interfaceC990760btC != null) {
            interfaceC990760btC.LJIIJJI();
        }
    }

    @Override // X.InterfaceC1008930cMV
    public final C1009490cNP LJIILJJIL() {
        return (C1009490cNP) this.LJFF.getValue();
    }

    @Override // X.InterfaceC1008930cMV
    public final void LJIJJ() {
        Aweme aweme = this.LIZ;
        if (C1017070cZd.LJJJZ(aweme)) {
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "otherclick", aweme.getAwemeRawAd());
            c1022820ciuLIZLLL.LIZJ("ad_hashtag", "refer");
            c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(!AwemeBizExtKt.isDesMoreTextShow(aweme) ? 0 : 1), "if_title_collapsed");
            c1022820ciuLIZLLL.LJII();
        }
    }

    @Override // X.InterfaceC1008930cMV
    public final C1017200cZq LJIL() {
        return (C1017200cZq) this.LJI.getValue();
    }

    @Override // X.InterfaceC1008930cMV
    public final void LJJIIJZLJL() {
        IScreenshotService iScreenshotService;
        AbstractC2361009My abstractC2361009My = this.LJIILIIL;
        if (abstractC2361009My == null || (iScreenshotService = (IScreenshotService) PluggableExtentionKt.pluggableSpi$default(IScreenshotService.class, false, false, false, 14, null)) == null) {
            return;
        }
        iScreenshotService.LIZLLL(abstractC2361009My);
    }

    @Override // X.InterfaceC1008930cMV
    public final void LJJIIZ() {
        Aweme aweme = this.LIZ;
        if (C1017070cZd.LLILLIZIL(aweme) && aweme != null) {
            ((ICommerceFeedSeriesService) this.LJIIIIZZ.getValue()).fA(this.LIZ);
        }
        if (this.LIZ.isAd()) {
            this.LJIILJJIL = new C1009680cNi(this.LIZ);
            AbstractC2361009My c1009660cNg = this.LJIILIIL;
            if (c1009660cNg == null) {
                c1009660cNg = new C1009660cNg(this);
            }
            this.LJIILIIL = c1009660cNg;
            IScreenshotService iScreenshotService = (IScreenshotService) PluggableExtentionKt.pluggableSpi$default(IScreenshotService.class, false, false, false, 14, null);
            if (iScreenshotService != null) {
                iScreenshotService.LJFF(c1009660cNg);
            }
        }
    }

    @Override // X.InterfaceC1008930cMV
    public final InterfaceC736670Sv3 LJJIJLIJ() {
        return (InterfaceC736670Sv3) this.LJJIL.getValue();
    }

    public final List<?> LJJIL() {
        AnoleModel anoleModel;
        Map<String, AnoleComponentModel> map;
        AwemeRawAd awemeRawAd;
        AnoleModel anoleModel2;
        Map<String, AnoleComponentRelationModel> map2;
        AnoleComponentRelationModel anoleComponentRelationModel;
        AnoleComponentRelationModel anoleComponentRelationModel2;
        List<AnoleComponentAppearModel> list;
        AwemeRawAd awemeRawAd2 = this.LIZ.getAwemeRawAd();
        if (awemeRawAd2 == null || (anoleModel = awemeRawAd2.getAnoleModel()) == null || (map = anoleModel.components) == null || (awemeRawAd = this.LIZ.getAwemeRawAd()) == null || (anoleModel2 = awemeRawAd.getAnoleModel()) == null || (map2 = anoleModel2.componentRelations) == null) {
            return null;
        }
        for (Map.Entry<String, AnoleComponentModel> entry : map.entrySet()) {
            C1008990cMb c1008990cMb = EnumC1008920cMU.Companion;
            String str = entry.getValue().type;
            c1008990cMb.getClass();
            if (C1008990cMb.LIZ(str) && (anoleComponentRelationModel = map2.get(entry.getValue().type)) != null && anoleComponentRelationModel.showModels != null && (anoleComponentRelationModel2 = map2.get(entry.getValue().type)) != null && (list = anoleComponentRelationModel2.showModels) != null) {
                for (AnoleComponentAppearModel anoleComponentAppearModel : list) {
                    if (Intrinsics.LJFF(anoleComponentAppearModel.type, EnumC1008360cLa.CAROUSEL_IMAGE_STAY.getType())) {
                        Map<String, Object> bussinessPreconditions = anoleComponentAppearModel.getBussinessPreconditions();
                        return (List) (bussinessPreconditions != null ? bussinessPreconditions.get("carousel_endlayer_dependencies") : null);
                    }
                }
            }
        }
        return null;
    }

    public final String LJJJ() {
        Object c098200Yq;
        AwemeRawAd awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(this.LIZ);
        if (awemeRawAdLJJIJLIJ == null) {
            return null;
        }
        User author = this.LIZ.getAuthor();
        Long lValueOf = author != null ? Long.valueOf(author.roomId) : null;
        if (!(lValueOf == null || lValueOf.longValue() != 0)) {
            lValueOf = null;
        }
        if (lValueOf == null) {
            AdLive adLive = awemeRawAdLJJIJLIJ.getAdLive();
            lValueOf = adLive != null ? adLive.getOriginalRoomId() : null;
        }
        if (lValueOf == null) {
            return null;
        }
        lValueOf.longValue();
        AdLiveEnterRoomConfig adLiveEnterRoomConfigLIZJ = C1019100ccu.LIZJ(this.LIZ, awemeRawAdLJJIJLIJ);
        AdLiveEnterRoomConfig adLiveEnterRoomConfig = new AdLiveEnterRoomConfig(adLiveEnterRoomConfigLIZJ.liveAdType, adLiveEnterRoomConfigLIZJ.creativeId, adLiveEnterRoomConfigLIZJ.value, adLiveEnterRoomConfigLIZJ.logExtra, adLiveEnterRoomConfigLIZJ.groupId, adLiveEnterRoomConfigLIZJ.trafficFromPosition, adLiveEnterRoomConfigLIZJ.aid, adLiveEnterRoomConfigLIZJ.adId, adLiveEnterRoomConfigLIZJ.advId, lValueOf.toString(), adLiveEnterRoomConfigLIZJ.authorId, adLiveEnterRoomConfigLIZJ.dislikeInfo, adLiveEnterRoomConfigLIZJ.isPseudoAd, adLiveEnterRoomConfigLIZJ.liveAdScene, adLiveEnterRoomConfigLIZJ.ttclId, adLiveEnterRoomConfigLIZJ.adReportInfo, adLiveEnterRoomConfigLIZJ.isLeadsAdsTraffic);
        try {
            C1227904rF.LIZ.getClass();
            c098200Yq = C1227904rF.LJI(adLiveEnterRoomConfig);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        return (String) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
    }

    public final C1009470cNN LJJJI() {
        return (C1009470cNN) this.LJJIIJ.getValue();
    }

    public final ICommerceLiveShoppingManager LJJJJ() {
        return (ICommerceLiveShoppingManager) this.LJIIJ.getValue();
    }

    public final IVideoPlayTaskManager LJJJJI() {
        return (IVideoPlayTaskManager) this.LJ.getValue();
    }

    public final void LJJJJIZL() {
        IAnoleManager iAnoleManager = this.LJIIZILJ;
        if (iAnoleManager == null || !iAnoleManager.LJIILL()) {
            return;
        }
        EnumC1001380cAK enumC1001380cAK = EnumC1001380cAK.ANOLE_COMPONENT_OPERATION;
        C1001520cAY c1001520cAY = new C1001520cAY(enumC1001380cAK.getTaskIdWithType(this.LIZ.getAid()), EnumC599900Nfw.FEED);
        c1001520cAY.LIZJ = new AwS417S0200000_16(this, c1001520cAY, 113);
        c1001520cAY.LJ = EnumC1001450cAR.DIRECT_DISCARD;
        c1001520cAY.LIZLLL = enumC1001380cAK;
        c1001520cAY.LJI = C0NO3.MAIN;
        C1001410cAN.LIZIZ.LJI(c1001520cAY);
        this.LJJIFFI = c1001520cAY;
    }

    @Override // X.InterfaceC1007910cKr
    public final int LLJILLL() {
        IAnoleMaskAbility iAnoleMaskAbility = this.LJJIJIIJIL;
        if (iAnoleMaskAbility != null) {
            return iAnoleMaskAbility.LLJILLL();
        }
        return 0;
    }

    @Override // X.InterfaceC1007910cKr
    public final C1014390cVJ LLJJIJIIJIL() {
        InterfaceC1009510cNR interfaceC1009510cNR = this.LJJIJ;
        if (interfaceC1009510cNR != null) {
            return interfaceC1009510cNR.LLJJIJIIJIL();
        }
        return null;
    }

    @Override // X.InterfaceC1007910cKr
    public final void P() {
        IAnoleMaskAbility iAnoleMaskAbility = this.LJJIJIIJIL;
        if (iAnoleMaskAbility != null) {
            iAnoleMaskAbility.P();
        }
    }

    @Override // X.InterfaceC1007910cKr
    public final void U2() {
        IAnoleMaskAbility iAnoleMaskAbility = this.LJJIJIIJIL;
        if (iAnoleMaskAbility != null) {
            iAnoleMaskAbility.U2();
        }
    }

    @Override // X.InterfaceC1007910cKr
    public final C1014390cVJ Y2() {
        if (this.LJIJI != null) {
            return new C1014390cVJ(new C1009390cNF(r6.getWidth(), r6.getHeight()), new PointF(r6.getWidth() / 2, r6.getHeight() / 2));
        }
        return null;
    }

    @Override // X.InterfaceC1007910cKr
    public final HashMap<String, Object> Z2() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("play_order", Long.valueOf(this.LJJI));
        return map;
    }

    @Override // X.InterfaceC1007910cKr
    public final ViewGroup b3() {
        Activity activityLIZ = C1388190mED.LIZ(this.LIZJ);
        if (activityLIZ == null) {
            activityLIZ = ActivityStack.getTopActivity();
            if (!(activityLIZ instanceof InterfaceC1603190roz)) {
                activityLIZ = null;
            }
        }
        return C1009190cMv.LIZ(activityLIZ);
    }

    @Override // X.InterfaceC1007910cKr
    public final C1008080cL8 c3() {
        InterfaceC1000280c8Y interfaceC1000280c8Y;
        String strLIZ = C1014230cV3.LIZ("scene_anole_format");
        C1020420cf2 c1020420cf2 = new C1020420cf2();
        Bundle bundle = new Bundle();
        InterfaceC988500bpY interfaceC988500bpYQ = ((ICommercializeAdService) ServiceManager.get().getService(ICommercializeAdService.class)).Q(17);
        if ((interfaceC988500bpYQ instanceof InterfaceC1000280c8Y) && (interfaceC1000280c8Y = (InterfaceC1000280c8Y) interfaceC988500bpYQ) != null) {
            interfaceC1000280c8Y.LJIJJ(this.LIZJ, bundle, this.LIZ);
        }
        return new C1008080cL8(bundle, strLIZ, c1020420cf2, new AwS595S0100000_16(this, 418), 16);
    }

    @Override // X.InterfaceC1007910cKr
    public final boolean d3() {
        String str;
        Activity activityLIZ = C1388190mED.LIZ(this.LIZJ);
        if (activityLIZ == null) {
            activityLIZ = ActivityStack.getTopActivity();
            if (!(activityLIZ instanceof InterfaceC1603190roz)) {
                activityLIZ = null;
            }
        }
        C19EG c19eg = activityLIZ instanceof C19EG ? (C19EG) activityLIZ : null;
        if (c19eg == null) {
            return false;
        }
        String str2 = this.LIZIZ;
        if (Intrinsics.LJFF(str2, "homepage_hot")) {
            str = "For You";
        } else {
            if (!Intrinsics.LJFF(str2, "homepage_follow")) {
                return false;
            }
            str = "Following";
        }
        return Hox.LLJILJIL.LIZ(c19eg).KQ2(str) && c19eg.getLifecycle().getCurrentState() == Lifecycle.State.RESUMED;
    }

    @Override // X.InterfaceC1007910cKr
    public final boolean e3() {
        return this.LJIJJ || this.LJIJJLI || this.LJJ;
    }

    @Override // X.InterfaceC1007910cKr
    public final Integer i3() {
        Video video = this.LIZ.getVideo();
        if (video != null) {
            return Integer.valueOf(video.getDuration());
        }
        return null;
    }

    @Override // X.InterfaceC1007910cKr
    public final void o0() {
        IAnoleMaskAbility iAnoleMaskAbility = this.LJJIJIIJIL;
        if (iAnoleMaskAbility != null) {
            iAnoleMaskAbility.o0();
        }
    }

    @Override // X.InterfaceC1007910cKr
    public final long r1() {
        if (this.LJIILL) {
            return C1483410ohn.LJLJJI().getCurrentPosition();
        }
        return 0L;
    }

    @Override // X.InterfaceC1008930cMV
    public final void LIZ() {
        Object c098200Yq;
        C622680Oba.LIZLLL(this);
        C0SM6 c0sm6 = this.LJIJ;
        if (c0sm6 != null) {
            c0sm6.LJIIIZ();
        }
        LJJJJ().unBind();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unbind,aweme = ");
        sbLIZ.append(this.LIZ.getAid());
        C1022620cia.LJ("FeedItemModuleImpl", C2188811AlT.LIZIZ(sbLIZ));
        AwemeRawAd awemeRawAd = this.LIZ.getAwemeRawAd();
        if (awemeRawAd == null || !awemeRawAd.isGlobalEnableQuickAction()) {
            return;
        }
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("shopify_quick_preload_enable", true)) {
            try {
                IShopifySkuCheckoutService iShopifySkuCheckoutService = (IShopifySkuCheckoutService) PluggableExtentionKt.pluggableSpi$default(IShopifySkuCheckoutService.class, false, false, false, 14, null);
                c098200Yq = null;
                if (iShopifySkuCheckoutService != null) {
                    iShopifySkuCheckoutService.LJFF(null, null);
                    c098200Yq = Unit.LIZ;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C1AF0.LJFF(thM5exceptionOrNullimpl, "quick_action_clear_failed");
            }
        }
    }

    @Override // X.InterfaceC1008930cMV
    public final void LIZJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preloadResource aweme = ");
        sbLIZ.append(this.LIZ.getAid());
        C2188811AlT.LIZIZ(sbLIZ);
        AwemeRawAd awemeRawAd = this.LIZ.getAwemeRawAd();
        String aid = this.LIZ.getAid();
        if (awemeRawAd == null || aid == null) {
            return;
        }
        ((IAnoleService) this.LJII.getValue()).LJFF(new C1009340cNA(aid, this.LIZ.getGroupId(), this.LIZ, awemeRawAd, null, null, null, 112));
    }

    @Override // X.InterfaceC1008930cMV
    public final void LIZLLL() {
        List<IAnoleManager> listLJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[prerender] aweme = ");
        sbLIZ.append(this.LIZ.getAid());
        sbLIZ.append(", ");
        C2188811AlT.LIZIZ(sbLIZ);
        if (C1051600dTK.LIZIZ(this.LIZ, ((Boolean) C1051600dTK.LIZJ.getValue()).booleanValue()) && this.LJJIIZI) {
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[prerender] real execute aweme = ");
        sbLIZ2.append(this.LIZ.getAid());
        sbLIZ2.append(", ");
        C2188811AlT.LIZIZ(sbLIZ2);
        IAnoleManager iAnoleManager = this.LJIIZILJ;
        if (iAnoleManager != null) {
            iAnoleManager.LIZLLL();
        }
        LJJJJIZL();
        C0SM6 c0sm6 = this.LJIJ;
        if (c0sm6 != null && (listLJI = c0sm6.LJI()) != null) {
            Iterator<IAnoleManager> it2 = listLJI.iterator();
            while (it2.hasNext()) {
                it2.next().LIZLLL();
            }
        }
        this.LJJIIZI = true;
    }

    @Override // X.InterfaceC1008930cMV
    public final void LJJIFFI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPagerResume,aweme = ");
        sbLIZ.append(this.LIZ.getAid());
        C2188811AlT.LIZIZ(sbLIZ);
        C1009500cNQ c1009500cNQLJJJIL = LJJJIL();
        if (c1009500cNQLJJJIL != null) {
            c1009500cNQLJJJIL.LJFF(this.LJJIII);
        }
        Aweme aweme = this.LIZ;
        if (!C1017070cZd.LLILLIZIL(aweme) || aweme == null) {
            return;
        }
        ((ICommerceFeedSeriesService) this.LJIIIIZZ.getValue()).fA(this.LIZ);
    }

    @Override // X.InterfaceC1008930cMV
    public final void LJJIIJ() {
        C622680Oba.LIZLLL(this);
        IAnoleManager iAnoleManager = this.LJIIZILJ;
        if (iAnoleManager != null) {
            iAnoleManager.LIZ();
        }
        C0SM6 c0sm6 = this.LJIJ;
        if (c0sm6 != null) {
            c0sm6.LJJIIJ();
        }
        this.LJJIIZI = false;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onHostDestroy,aweme = ");
        sbLIZ.append(this.LIZ.getAid());
        C1022620cia.LJ("FeedItemModuleImpl", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1008930cMV
    public final void LJJIIZI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPagerPause,aweme = ");
        sbLIZ.append(this.LIZ.getAid());
        C2188811AlT.LIZIZ(sbLIZ);
        C1009500cNQ c1009500cNQLJJJIL = LJJJIL();
        if (c1009500cNQLJJJIL != null) {
            c1009500cNQLJJJIL.LJI(this.LJJIII);
        }
    }

    @Override // X.InterfaceC1008930cMV
    public final void onDestroyView() {
        C622680Oba.LIZLLL(this);
        this.LJJIIZI = false;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDestroyView,aweme = ");
        sbLIZ.append(this.LIZ.getAid());
        C1022620cia.LJ("FeedItemModuleImpl", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1008930cMV
    public final void preload() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preload aweme = ");
        sbLIZ.append(this.LIZ.getAid());
        C2188811AlT.LIZIZ(sbLIZ);
        AwemeRawAd awemeRawAd = this.LIZ.getAwemeRawAd();
        String aid = this.LIZ.getAid();
        if (awemeRawAd == null || aid == null) {
            return;
        }
        C1015470cX3.LIZ((IAnoleService) this.LJII.getValue(), new C1009340cNA(aid, this.LIZ.getGroupId(), this.LIZ, awemeRawAd, null, null, null, 112));
    }

    @Override // X.InterfaceC1008930cMV
    public final Aweme LJIIIIZZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1008930cMV
    public final InterfaceC1009510cNR LJIIIZ() {
        return this.LJJIJ;
    }

    @Override // X.InterfaceC1008930cMV
    public final C0SM6 LJJI() {
        return this.LJIJ;
    }

    @Override // X.InterfaceC1007910cKr
    public final long LJJLIL() {
        return this.LJJI;
    }

    @Override // X.InterfaceC1008930cMV
    public final IAnoleManager Ri() {
        return this.LJIIZILJ;
    }

    @Override // X.InterfaceC1007910cKr
    public final JSONObject V2() {
        return this.LJJIJL;
    }

    @Override // X.InterfaceC1008930cMV
    public final void LJ(View view) {
        AwemeRawAd awemeRawAd;
        List<QuickActionModel> quickActionPreloadList;
        AwemeRawAd awemeRawAd2;
        List<QuickActionModel> quickActionPreloadList2;
        Object c098200Yq;
        this.LJIJI = view;
        C0SM6 c0sm6 = this.LJIJ;
        if (c0sm6 != null) {
            c0sm6.LJII();
        }
        LJJJJ().bind();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bind,aweme = ");
        sbLIZ.append(this.LIZ.getAid());
        C2188811AlT.LIZIZ(sbLIZ);
        IComponentShowStatusExamine iComponentShowStatusExamine = (IComponentShowStatusExamine) PluggableExtentionKt.pluggableSpi$default(IComponentShowStatusExamine.class, false, false, false, 14, null);
        if (iComponentShowStatusExamine != null) {
            iComponentShowStatusExamine.Ys(view);
        } else {
            iComponentShowStatusExamine = null;
        }
        this.LJJIIJZLJL = iComponentShowStatusExamine;
        AwemeRawAd awemeRawAd3 = this.LIZ.getAwemeRawAd();
        if (awemeRawAd3 != null && awemeRawAd3.isGlobalEnableQuickAction() && (awemeRawAd = this.LIZ.getAwemeRawAd()) != null && (quickActionPreloadList = awemeRawAd.getQuickActionPreloadList()) != null && !quickActionPreloadList.isEmpty()) {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("shopify_quick_preload_enable", true) && (awemeRawAd2 = this.LIZ.getAwemeRawAd()) != null && (quickActionPreloadList2 = awemeRawAd2.getQuickActionPreloadList()) != null) {
                for (QuickActionModel quickActionModel : quickActionPreloadList2) {
                    try {
                        IShopifySkuCheckoutService iShopifySkuCheckoutService = (IShopifySkuCheckoutService) PluggableExtentionKt.pluggableSpi$default(IShopifySkuCheckoutService.class, false, false, false, 14, null);
                        if (iShopifySkuCheckoutService != null) {
                            iShopifySkuCheckoutService.LIZLLL(this.LIZ.getAwemeRawAd(), quickActionModel.getPdpUrl(), quickActionModel.getShopifyPid());
                            c098200Yq = Unit.LIZ;
                        } else {
                            c098200Yq = null;
                        }
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                    if (thM5exceptionOrNullimpl != null) {
                        C1AF0.LJFF(thM5exceptionOrNullimpl, "quick_action_preload_failed");
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC1008930cMV
    public final void LJII(String str) {
        Long lValueOf;
        Double dLJII;
        List<?> listLJJIL = LJJIL();
        if (listLJJIL == null) {
            return;
        }
        Iterator<?> it2 = listLJJIL.iterator();
        while (it2.hasNext()) {
            Map map = (Map) it2.next();
            Object obj = map.get("component_type");
            Object obj2 = map.get("duration");
            if (obj2 instanceof Number) {
                lValueOf = Long.valueOf(((Number) obj2).longValue());
            } else if ((obj2 instanceof String) && (dLJII = C2327809Ae.LJII((String) obj2)) != null) {
                lValueOf = Long.valueOf((long) dLJII.doubleValue());
            } else {
                lValueOf = null;
            }
            if (Intrinsics.LJFF(obj, str) && lValueOf != null && lValueOf.longValue() >= 0) {
                C786410Ut5.LJLIIL(lValueOf.longValue(), (Handler) this.LIZLLL.getValue(), new ARunnableS103S0100000_3(this, 145));
            }
        }
    }

    @Override // X.InterfaceC1008930cMV
    public final void LJIIJJI(IAnoleMaskAbility iAnoleMaskAbility) {
        this.LJJIJIIJIL = iAnoleMaskAbility;
    }

    @Override // X.InterfaceC1008930cMV
    public final void LJIIL(C1009150cMr c1009150cMr) {
        this.LJJIJLIJ = c1009150cMr;
    }

    @Override // X.InterfaceC1008930cMV
    public final void LJIILL(AbstractC1007980cKy abstractC1007980cKy) {
        boolean z;
        List<IAnoleManager> listLJI;
        if (abstractC1007980cKy instanceof C697010RVr) {
            this.LJIJJ = ((C697010RVr) abstractC1007980cKy).LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CommentDialogStatus = ");
            sbLIZ.append(this.LJIJJ);
            C2188811AlT.LIZIZ(sbLIZ);
        } else if (abstractC1007980cKy instanceof C988750bpx) {
            this.LJIJJLI = ((C988750bpx) abstractC1007980cKy).LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("ShareDialogStatus = ");
            sbLIZ2.append(this.LJIJJLI);
            C2188811AlT.LIZIZ(sbLIZ2);
        } else if (abstractC1007980cKy instanceof C988760bpy) {
            this.LJJ = ((C988760bpy) abstractC1007980cKy).LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("MaskVisibilityChanged = ");
            sbLIZ3.append(this.LJJ);
            C2188811AlT.LIZIZ(sbLIZ3);
        } else if (abstractC1007980cKy instanceof C692050RCp) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("HostVisibilityChanged = ");
            sbLIZ4.append(abstractC1007980cKy);
            sbLIZ4.append(".visibility");
            C2188811AlT.LIZIZ(sbLIZ4);
            C692050RCp c692050RCp = (C692050RCp) abstractC1007980cKy;
            if (c692050RCp.LIZ) {
                ((C584800Mwg) C1048110dNh.LIZLLL.LIZ()).LIZIZ = null;
            }
            C1009470cNN c1009470cNNLJJJI = LJJJI();
            if (c1009470cNNLJJJI != null && c1009470cNNLJJJI.LIZLLL != (z = c692050RCp.LIZ)) {
                c1009470cNNLJJJI.LIZLLL = z;
                if (c1009470cNNLJJJI.LJFF) {
                    c1009470cNNLJJJI.LIZLLL();
                }
            }
        }
        IAnoleManager iAnoleManager = this.LJIIZILJ;
        if (iAnoleManager != null) {
            iAnoleManager.LJIIZILJ(abstractC1007980cKy);
        }
        InterfaceC1009590cNZ interfaceC1009590cNZ = (InterfaceC1009590cNZ) this.LJIIJJI.getValue();
        if (interfaceC1009590cNZ != null) {
            interfaceC1009590cNZ.LIZ(this.LIZ.getAid());
        }
        C0SM6 c0sm6 = this.LJIJ;
        if (c0sm6 != null && (listLJI = c0sm6.LJI()) != null) {
            Iterator<IAnoleManager> it2 = listLJI.iterator();
            while (it2.hasNext()) {
                it2.next().LJIIZILJ(abstractC1007980cKy);
            }
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("handleEvent,AnoleFromBusinessEvent= ");
        sbLIZ5.append(abstractC1007980cKy.getClass().getSimpleName());
        C2188811AlT.LIZIZ(sbLIZ5);
    }

    @Override // X.InterfaceC1008930cMV
    public final void LJIILLIIL(InterfaceC990760btC interfaceC990760btC) {
        this.LJJIJIIJI = interfaceC990760btC;
    }

    @Override // X.InterfaceC1008930cMV
    public final void LJIIZILJ(boolean z) {
        C1009470cNN c1009470cNNLJJJI = LJJJI();
        if (c1009470cNNLJJJI != null && c1009470cNNLJJJI.LJ != z) {
            c1009470cNNLJJJI.LJ = z;
            if (c1009470cNNLJJJI.LJFF) {
                c1009470cNNLJJJI.LIZLLL();
            }
        }
    }

    @Override // X.InterfaceC1008930cMV
    public final void LJIJI(boolean z) {
        Aweme aweme = this.LIZ;
        if (AwemeExtKt.isTextMoreAd(aweme)) {
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "othershow", aweme.getAwemeRawAd());
            c1022820ciuLIZLLL.LIZJ("title", "refer");
            c1022820ciuLIZLLL.LJII();
            if (z) {
                C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("draw_ad", "othershow", aweme.getAwemeRawAd());
                c1022820ciuLIZLLL2.LIZJ("title_more", "refer");
                c1022820ciuLIZLLL2.LJII();
            }
        }
        Aweme aweme2 = this.LIZ;
        if (C1017070cZd.LJJJZ(aweme2)) {
            AwemeBizExtKt.setDesMoreTextShow(aweme2, z);
            C1022820ciu c1022820ciuLIZLLL3 = C2184171Adz.LIZLLL("draw_ad", "othershow", aweme2.getAwemeRawAd());
            c1022820ciuLIZLLL3.LIZJ("ads_title", "refer");
            c1022820ciuLIZLLL3.LIZIZ(Integer.valueOf(z ? 1 : 0), "if_title_collapsed");
            c1022820ciuLIZLLL3.LJII();
        }
    }

    @Override // X.InterfaceC1008930cMV
    public final void LJIJJLI(InterfaceC1009510cNR interfaceC1009510cNR) {
        this.LJJIJ = interfaceC1009510cNR;
    }

    @Override // X.InterfaceC1008930cMV
    public final void LJJII(AbstractC997470c41 abstractC997470c41) {
        Integer numValueOf;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        InterfaceC1009610cNb interfaceC1009610cNb;
        List<IAnoleManager> listLJI;
        InterfaceC1009590cNZ interfaceC1009590cNZ;
        ILikeEffectService iLikeEffectService;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("playStateChanged, playState = ");
        sbLIZ.append(abstractC997470c41);
        C2188811AlT.LIZIZ(sbLIZ);
        if (abstractC997470c41 instanceof C995850c1P) {
            LJJJJI().LL();
            LJJJJ().requestLiveProductInfoIfNeeded(this.LIZ, this.LIZJ, "request_from_anole");
            if (C1017070cZd.LLIZLLLIL(this.LIZ) && C1017070cZd.LJLLL(this.LIZ) && (iLikeEffectService = (ILikeEffectService) PluggableExtentionKt.pluggableSpi$default(ILikeEffectService.class, false, false, false, 14, null)) != null) {
                iLikeEffectService.LJIILL(this.LIZJ, this.LIZ);
            }
        } else if (abstractC997470c41 instanceof C997510c45) {
            LJJJJI().LLD();
        } else if (abstractC997470c41 instanceof C997490c43) {
            LJJJJI().LLFF();
        } else if (abstractC997470c41 instanceof C997480c42) {
            this.LJJI++;
            LJJJJI().LJJIJIIJIL();
            C1009490cNP c1009490cNP = (C1009490cNP) this.LJFF.getValue();
            Context context = this.LIZJ;
            c1009490cNP.LJI++;
            Aweme aweme = c1009490cNP.LIZLLL;
            if (aweme != null && (awemeRawAd2 = aweme.getAwemeRawAd()) != null && C1017180cZo.LJIIJ(awemeRawAd2) == c1009490cNP.LJI) {
                if (!Intrinsics.LJFF(c1009490cNP.LIZJ, "open")) {
                    InterfaceC1009610cNb interfaceC1009610cNb2 = c1009490cNP.LJFF;
                    if (interfaceC1009610cNb2 != null && interfaceC1009610cNb2.LJIIJ()) {
                        c1009490cNP.LIZLLL();
                    } else {
                        String str = c1009490cNP.LIZ;
                        int iHashCode = str.hashCode();
                        if (iHashCode == 1496859991 ? str.equals("is_auto_showed") : !(iHashCode == 1652144296 ? !str.equals("is_user_clicked") : !(iHashCode == 1948342084 && str.equals("initial")))) {
                            InterfaceC1000280c8Y interfaceC1000280c8YLIZ = C988590bph.LIZ();
                            if (interfaceC1000280c8YLIZ != null && interfaceC1000280c8YLIZ.LJJIII(context, c1009490cNP.LIZLLL, "is_showed_after_video_completed")) {
                                c1009490cNP.LIZJ = "open";
                                c1009490cNP.LIZJ(context);
                            } else {
                                Aweme aweme2 = c1009490cNP.LIZLLL;
                                if (aweme2 != null && (awemeRawAd3 = aweme2.getAwemeRawAd()) != null && awemeRawAd3.getOverlayNativeConfig() != null && (interfaceC1009610cNb = c1009490cNP.LJFF) != null) {
                                    interfaceC1009610cNb.LJIILIIL();
                                }
                            }
                        }
                    }
                }
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("registerVideoPlayComplete() videoPlayTimes = ");
                sbLIZ2.append(c1009490cNP.LJI);
                sbLIZ2.append(",limitTimes = ");
                Aweme aweme3 = c1009490cNP.LIZLLL;
                if (aweme3 != null && (awemeRawAd = aweme3.getAwemeRawAd()) != null) {
                    numValueOf = Integer.valueOf(C1017180cZo.LJIIJ(awemeRawAd));
                } else {
                    numValueOf = null;
                }
                sbLIZ2.append(numValueOf);
                sbLIZ2.append(",condition don't match");
                C2188811AlT.LIZIZ(sbLIZ2);
            }
            C1009470cNN c1009470cNNLJJJI = LJJJI();
            if (c1009470cNNLJJJI != null && c1009470cNNLJJJI.LIZJ) {
                c1009470cNNLJJJI.LIZIZ();
            }
        }
        IAnoleManager iAnoleManager = this.LJIIZILJ;
        if (iAnoleManager != null) {
            iAnoleManager.LJIIZILJ(abstractC997470c41);
        }
        if ((abstractC997470c41 instanceof C997490c43) && (interfaceC1009590cNZ = (InterfaceC1009590cNZ) this.LJIIJJI.getValue()) != null) {
            interfaceC1009590cNZ.LIZ(this.LIZ.getAid());
        }
        C0SM6 c0sm6 = this.LJIJ;
        if (c0sm6 != null && (listLJI = c0sm6.LJI()) != null) {
            Iterator<IAnoleManager> it2 = listLJI.iterator();
            while (it2.hasNext()) {
                it2.next().LJIIZILJ(abstractC997470c41);
            }
        }
    }

    @Override // X.InterfaceC1008930cMV
    public final void LJJIJ(C0RA7 c0ra7) {
        LJJJJI().LLFII(c0ra7);
    }

    @Override // X.InterfaceC1008930cMV
    public final void LJJIJIIJI(JSONObject jSONObject) {
        this.LJJIJL = jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c5  */
    @Override // X.InterfaceC1008930cMV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJIL(int r11) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1009460cNM.LJJIJIIJIL(int):void");
    }

    @Override // X.InterfaceC1008930cMV
    public final void LJJIJIL(InterfaceC990750btB interfaceC990750btB) {
        this.LJJIJIL = interfaceC990750btB;
        C1009470cNN c1009470cNNLJJJI = LJJJI();
        if (c1009470cNNLJJJI != null) {
            c1009470cNNLJJJI.LIZIZ = this.LJJIJIL;
        }
    }

    @Override // X.InterfaceC1008930cMV
    public final void LJJIJL(int i) throws JSONException {
        PhotoCarouselProductStruct photoCarouselProductStruct;
        String productId;
        PhotoCarouselInfoStruct photoCarouselInfo;
        List<PhotoCarouselProductStruct> productList;
        if (i < 0) {
            return;
        }
        AwemeRawAd awemeRawAd = this.LIZ.getAwemeRawAd();
        if (awemeRawAd != null && (photoCarouselInfo = awemeRawAd.getPhotoCarouselInfo()) != null && (productList = photoCarouselInfo.getProductList()) != null) {
            photoCarouselProductStruct = (PhotoCarouselProductStruct) C13LP.LJJJLZIJ(i, productList);
        } else {
            photoCarouselProductStruct = null;
        }
        JSONObject jSONObject = new JSONObject();
        if (photoCarouselProductStruct == null || (productId = photoCarouselProductStruct.getProductId()) == null) {
            productId = "";
        }
        jSONObject.put("carousel_product_id", productId);
        jSONObject.put("carousel_page_index", i);
        IAnoleManager iAnoleManager = this.LJIIZILJ;
        if (iAnoleManager != null) {
            iAnoleManager.LJIIZILJ(new C0SCL(jSONObject));
        }
    }

    public final void LJJIZ(CoinRewardData coinRewardData) {
        Long creativeId;
        if (this.LJJIII == null && coinRewardData != null) {
            String aid = this.LIZ.getAid();
            String str = coinRewardData.taskEventKey;
            int i = coinRewardData.rewards;
            int i2 = coinRewardData.rewardDuration;
            AwemeRawAd awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(this.LIZ);
            Integer numValueOf = null;
            if (awemeRawAdLJJIJLIJ != null) {
                creativeId = awemeRawAdLJJIJLIJ.getCreativeId();
            } else {
                creativeId = null;
            }
            String strValueOf = String.valueOf(creativeId);
            String requestId = this.LIZ.getRequestId();
            AwemeRawAd awemeRawAdLJJIJLIJ2 = C1017070cZd.LJJIJLIJ(this.LIZ);
            if (awemeRawAdLJJIJLIJ2 != null) {
                numValueOf = Integer.valueOf(awemeRawAdLJJIJLIJ2.getRit());
            }
            this.LJJIII = new C1898420zVA(aid, str, i, i2, strValueOf, requestId, String.valueOf(numValueOf));
        }
    }

    @Override // X.InterfaceC1007910cKr
    public final C1014410cVL LLJJIJI(String str) {
        InterfaceC1009510cNR interfaceC1009510cNR = this.LJJIJ;
        if (interfaceC1009510cNR != null) {
            return interfaceC1009510cNR.LLJJIJI(str);
        }
        return null;
    }

    @Override // X.InterfaceC1007910cKr
    public final C1009390cNF W2(String str) {
        int iLJIILJJIL;
        if (Intrinsics.LJFF(str, EnumC696280RSw.ANOLE_BELOW_INTERACTIVE_SLOT.getSlotName())) {
            iLJIILJJIL = C418440Gaw.LJFF(C497820Jfg.LIZIZ(r1), this.LIZJ);
        } else if (Intrinsics.LJFF(str, EnumC696280RSw.FEED_ANOLE_ABOVE_INTERACTIVE_SLOT.getSlotName())) {
            iLJIILJJIL = C12ES.LJIIJ(this.LIZJ);
        } else {
            iLJIILJJIL = C12ES.LJIILJJIL((C12ES.LJIIJ(r2) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100)), this.LIZJ);
        }
        return new C1009390cNF(iLJIILJJIL, -1.0d);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onLandingPageShowEvent(C1009540cNU c1009540cNU) {
        C1009500cNQ c1009500cNQLJJJIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLandingPageShowEvent,isShow = ");
        sbLIZ.append(c1009540cNU.LIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        if (c1009540cNU.LIZ && (c1009500cNQLJJJIL = LJJJIL()) != null) {
            c1009500cNQLJJJIL.LJFF(this.LJJIII);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0c8e, X.0c8f] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC1007910cKr
    public final void LIZIZ(AbstractC991850bux abstractC991850bux, InterfaceC1007930cKt interfaceC1007930cKt) {
        final String type;
        String renderStrategy;
        Integer numValueOf;
        C1001520cAY c1001520cAY;
        AnoleComponentModel anoleComponentModelAk;
        String str;
        AnoleComponentModel anoleComponentModelAk2;
        C1009470cNN c1009470cNNLJJJI;
        Integer num;
        Float fLIZ;
        C1017230cZt c1017230cZt;
        String type2 = null;
        Integer numValueOf2 = null;
        if (abstractC991850bux instanceof C989580brI) {
            C989580brI c989580brI = (C989580brI) abstractC991850bux;
            T t = c989580brI.LIZ;
            if (t instanceof C1017230cZt) {
                C1017200cZq c1017200cZq = (C1017200cZq) this.LJI.getValue();
                T t2 = c989580brI.LIZ;
                if (t2 instanceof C1017230cZt) {
                    c1017230cZt = (C1017230cZt) t2;
                } else {
                    c1017230cZt = null;
                }
                c1017200cZq.LIZJ(c1017230cZt, this.LIZ.getAwemeRawAd());
            } else if (t instanceof C1009000cMc) {
                C1009000cMc c1009000cMc = (C1009000cMc) t;
                if (Intrinsics.LJFF(c1009000cMc.LIZJ, "multiContentSwitch") && (c1009470cNNLJJJI = LJJJI()) != null) {
                    String str2 = c1009000cMc.LIZLLL;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("handleMultiContentSwitch fe to native params=");
                    sbLIZ.append(str2);
                    C1022620cia.LIZIZ("AnoleMultiContentHelper", C2188811AlT.LIZIZ(sbLIZ));
                    try {
                        Object obj = new JSONObject(str2).get("index");
                        if ((obj instanceof Integer) && (num = (Integer) obj) != null && num.intValue() >= 0 && (fLIZ = c1009470cNNLJJJI.LIZ(num.intValue())) != null) {
                            if (c1009470cNNLJJJI.LIZJ) {
                                InterfaceC990750btB interfaceC990750btB = c1009470cNNLJJJI.LIZIZ;
                                if (interfaceC990750btB != null) {
                                    interfaceC990750btB.LJIILIIL(fLIZ.floatValue() * 100.0f);
                                }
                            } else {
                                c1009470cNNLJJJI.LIZ.LJIIZILJ(new C991280bu2(num.intValue()));
                                c1009470cNNLJJJI.LIZ.LJIIZILJ(new C709590RsT(num.intValue(), fLIZ.floatValue()));
                            }
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }
        }
        if (interfaceC1007930cKt == null || (type = interfaceC1007930cKt.getType()) == null) {
            type = "";
        }
        ?? r1 = new AbstractC1000340c8e(type) { // from class: X.0c8f
        };
        if (abstractC991850bux instanceof C991590buX) {
            C991590buX c991590buX = (C991590buX) abstractC991850bux;
            boolean z = true;
            if (c991590buX.LIZ != 1) {
                z = false;
            }
            String str3 = c991590buX.LIZIZ;
            if (interfaceC1007930cKt != null && (anoleComponentModelAk2 = interfaceC1007930cKt.Ak()) != null) {
                renderStrategy = anoleComponentModelAk2.getRenderStrategy();
            } else {
                renderStrategy = null;
            }
            if (Intrinsics.LJFF(renderStrategy, "idle_prerender")) {
                if (z) {
                    if (interfaceC1007930cKt != null && (anoleComponentModelAk = interfaceC1007930cKt.Ak()) != null && (str = anoleComponentModelAk.type) != null) {
                        this.LJJII.add(str);
                    }
                    Set<String> set = this.LJJII;
                    if (set != null) {
                        numValueOf = Integer.valueOf(set.size());
                    } else {
                        numValueOf = null;
                    }
                    Set<AnoleComponentModel> setLIZ = C0PR2.LIZ(this.LIZ);
                    if (setLIZ != null) {
                        numValueOf2 = Integer.valueOf(setLIZ.size());
                    }
                    if (Intrinsics.LJFF(numValueOf, numValueOf2) && (c1001520cAY = this.LJJIFFI) != null) {
                        c1001520cAY.LIZJ();
                    }
                } else if (!Intrinsics.LJFF(str3, "prerender_not_invoke") && !Intrinsics.LJFF(str3, "prerender_time_limit_exceeded")) {
                    LJJJJIZL();
                } else {
                    C1001520cAY c1001520cAY2 = this.LJJIFFI;
                    if (c1001520cAY2 != null) {
                        c1001520cAY2.LJFF = EnumC1001490cAV.CANCELLED;
                    }
                }
            }
        } else if (abstractC991850bux instanceof C989570brH) {
            LJJ(r1, ((C989570brH) abstractC991850bux).LIZ);
        } else if (abstractC991850bux instanceof C991860buy) {
            IComponentShowStatusExamine iComponentShowStatusExamine = this.LJJIIJZLJL;
            if (iComponentShowStatusExamine != 0) {
                iComponentShowStatusExamine.Zs(r1);
            }
        } else if (abstractC991850bux instanceof C991870buz) {
            if (interfaceC1007930cKt != null) {
                type2 = interfaceC1007930cKt.getType();
            }
            LJII(type2);
        }
        InterfaceC1009510cNR interfaceC1009510cNR = this.LJJIJ;
        if (interfaceC1009510cNR != null) {
            interfaceC1009510cNR.zk(abstractC991850bux, interfaceC1007930cKt);
        }
        InterfaceC1009570cNX interfaceC1009570cNX = this.LJJIJLIJ;
        if (interfaceC1009570cNX != null) {
            interfaceC1009570cNX.LIZIZ(abstractC991850bux, interfaceC1007930cKt);
        }
    }

    @Override // X.InterfaceC1008930cMV
    public final void LJIJ(Aweme aweme, C19EG c19eg) {
        LJJJJ().requestLiveProductInfoIfNeeded(aweme, c19eg, "request_from_anchor");
    }

    @Override // X.InterfaceC1008930cMV
    public final void LJJ(AbstractC1000340c8e abstractC1000340c8e, View view) {
        IComponentShowStatusExamine iComponentShowStatusExamine = this.LJJIIJZLJL;
        if (iComponentShowStatusExamine != null) {
            iComponentShowStatusExamine.at(abstractC1000340c8e, view, new AwS225S0300000_16(this, abstractC1000340c8e, view, 24));
        }
    }

    @Override // X.InterfaceC1007910cKr
    public final void LLJJIII(String str, View.OnLayoutChangeListener onLayoutChangeListener) {
        InterfaceC1009510cNR interfaceC1009510cNR = this.LJJIJ;
        if (interfaceC1009510cNR != null) {
            interfaceC1009510cNR.LLJJIII(str, onLayoutChangeListener);
        }
    }

    @Override // X.InterfaceC1007910cKr
    public final void X2(String str, ViewOnLayoutChangeListenerC1014330cVD viewOnLayoutChangeListenerC1014330cVD) {
        InterfaceC1009510cNR interfaceC1009510cNR = this.LJJIJ;
        if (interfaceC1009510cNR != null) {
            interfaceC1009510cNR.xk(str, viewOnLayoutChangeListenerC1014330cVD);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1009460cNM(Context context, Aweme aweme, String str) {
        Boolean boolValueOf;
        C1009480cNO c1009480cNO;
        AnoleModel anoleModel;
        Map<String, AnoleComponentModel> map;
        Set<String> setKeySet;
        IFeedService iFeedServiceLIZIZ;
        InterfaceC1017820caq interfaceC1017820caqLJIILIIL;
        AwemeRawAd awemeRawAdLJJIJLIJ;
        Object c098200Yq;
        this.LIZ = aweme;
        this.LIZIZ = str;
        this.LIZJ = context;
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        String aid = aweme.getAid();
        if (awemeRawAd != null && aid != null) {
            String groupId = aweme.getGroupId();
            n nVar = new n();
            if (C1009740cNo.LJIIIIZZ(aweme)) {
                IECommerceService iECommerceService = (IECommerceService) ServiceManager.get().getService(IECommerceService.class);
                nVar.LJJIIJ("aweme_log", iECommerceService.generateAdLynxLogExtra(aweme, iECommerceService.generateTrackId(aweme)));
            }
            nVar.LJJIII(1, "isAutoFillEnable");
            nVar.LJJIII(Integer.valueOf(C305310Bxx.LIZ() ? 1 : 0), "enableAutofillV2");
            nVar.LJJIFFI("autoFillInfo", ((IAdAutofillService) ServiceManager.get().getService(IAdAutofillService.class)).LIZLLL());
            if (C1017070cZd.LJIIIIZZ(aweme) && (awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme)) != null) {
                AdLiveEnterRoomConfig adLiveEnterRoomConfigLIZJ = C1019100ccu.LIZJ(aweme, awemeRawAdLJJIJLIJ);
                try {
                    C1227904rF.LIZ.getClass();
                    c098200Yq = C1227904rF.LJI(adLiveEnterRoomConfigLIZJ);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                String str2 = (String) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
                if (str2 != null) {
                    nVar.LJJIIJ("adRedirectLiveJson", str2);
                }
            }
            String strLJJJ = LJJJ();
            if (strLJJJ != null) {
                nVar.LJJIIJ("adLiveJson", strLJJJ);
            }
            ICommerceService iCommerceService = (ICommerceService) PluggableExtentionKt.pluggableSpi$default(ICommerceService.class, false, false, false, 14, null);
            if (iCommerceService != null && (iFeedServiceLIZIZ = iCommerceService.LIZIZ()) != null && (interfaceC1017820caqLJIILIIL = iFeedServiceLIZIZ.LJIILIIL()) != null) {
                interfaceC1017820caqLJIILIIL.LJI(nVar, C1017070cZd.LJJIJLIJ(this.LIZ));
            }
            C1009340cNA c1009340cNA = new C1009340cNA(aid, groupId, aweme, awemeRawAd, nVar, null, this.LIZIZ, 32);
            AwemeRawAd awemeRawAd2 = this.LIZ.getAwemeRawAd();
            if (awemeRawAd2 != null && (anoleModel = awemeRawAd2.getAnoleModel()) != null && (map = anoleModel.components) != null && (setKeySet = map.keySet()) != null) {
                boolValueOf = Boolean.valueOf(setKeySet.contains(EnumC1008920cMU.COIN_WIDGET.getType()));
            } else {
                boolValueOf = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("createAnoleCoinCounterDelegate, containCoinWidget = ");
            sbLIZ.append(boolValueOf);
            C2188811AlT.LIZIZ(sbLIZ);
            if (boolValueOf != null && !Intrinsics.LJFF(boolValueOf, Boolean.FALSE)) {
                c1009480cNO = new InterfaceC1008890cMR() { // from class: X.0cNO
                    @Override // X.InterfaceC1008890cMR
                    public final void LIZ(CoinRewardData coinRewardData) {
                        this.LIZ.LJJIZ(coinRewardData);
                        this.LIZ.getClass();
                        C1009500cNQ c1009500cNQLJJJIL = C1009460cNM.LJJJIL();
                        if (c1009500cNQLJJJIL != null) {
                            c1009500cNQLJJJIL.LJI(this.LIZ.LJJIII);
                        }
                    }

                    @Override // X.InterfaceC1008890cMR
                    public final boolean LIZIZ(CoinRewardData coinRewardData) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("shouldShowTimerPendantView,model = ");
                        sbLIZ2.append(coinRewardData);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        this.LIZ.LJJIZ(coinRewardData);
                        this.LIZ.getClass();
                        C1009500cNQ c1009500cNQLJJJIL = C1009460cNM.LJJJIL();
                        if (c1009500cNQLJJJIL != null && c1009500cNQLJJJIL.LIZLLL(this.LIZ.LJJIII)) {
                            return true;
                        }
                        return false;
                    }

                    @Override // X.InterfaceC1008890cMR
                    public final void LIZJ(CoinRewardData coinRewardData) {
                        this.LIZ.LJJIZ(coinRewardData);
                        this.LIZ.getClass();
                        C1009500cNQ c1009500cNQLJJJIL = C1009460cNM.LJJJIL();
                        if (c1009500cNQLJJJIL != null) {
                            c1009500cNQLJJJIL.LJFF(this.LIZ.LJJIII);
                        }
                    }

                    @Override // X.InterfaceC1008890cMR
                    public final Map<String, String> LIZLLL(CoinRewardData coinRewardData) {
                        this.LIZ.LJJIZ(coinRewardData);
                        this.LIZ.getClass();
                        C1009500cNQ c1009500cNQLJJJIL = C1009460cNM.LJJJIL();
                        if (c1009500cNQLJJJIL != null) {
                            return c1009500cNQLJJJIL.LIZIZ(this.LIZ.LJJIII);
                        }
                        return null;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v7, types: [X.0cMS] */
                    @Override // X.InterfaceC1008890cMR
                    public final void LJ(LifecycleOwner lifecycleOwner, ViewGroup viewGroup, CoinRewardData coinRewardData, int i, int i2) {
                        Integer numValueOf;
                        C1009620cNc c1009620cNc;
                        this.LIZ.LJJIZ(coinRewardData);
                        C1009460cNM c1009460cNM = this.LIZ;
                        C1898420zVA c1898420zVA = c1009460cNM.LJJIII;
                        if (c1898420zVA != null) {
                            int iLIZJ = (int) C12ES.LIZJ(i, c1009460cNM.LIZJ);
                            C12ES.LIZJ(i2, c1009460cNM.LIZJ);
                            c1898420zVA.LIZJ = new C1009620cNc(iLIZJ);
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("showTimerPendantView,pos topMargin = ");
                        C1898420zVA c1898420zVA2 = this.LIZ.LJJIII;
                        if (c1898420zVA2 != null && (c1009620cNc = c1898420zVA2.LIZJ) != null) {
                            numValueOf = Integer.valueOf(c1009620cNc.LIZ);
                        } else {
                            numValueOf = null;
                        }
                        sbLIZ2.append(numValueOf);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        this.LIZ.getClass();
                        C1009500cNQ c1009500cNQLJJJIL = C1009460cNM.LJJJIL();
                        if (c1009500cNQLJJJIL != 0) {
                            final C1009460cNM c1009460cNM2 = this.LIZ;
                            c1009500cNQLJJJIL.LJ(viewGroup, lifecycleOwner, new InterfaceC1899340zWe() { // from class: X.0cMS
                                @Override // X.InterfaceC1899340zWe
                                public final void LIZIZ() throws JSONException {
                                    C1009460cNM c1009460cNM3 = c1009460cNM2;
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("coin_task_event_type", "taskCompleted");
                                    c1009460cNM3.LJIILL(new C0SCL(jSONObject));
                                }

                                @Override // X.InterfaceC1899340zWe
                                public final void LIZ(boolean z) throws JSONException {
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("rewardCompleted isSuccess = ");
                                    sbLIZ3.append(z);
                                    C2188811AlT.LIZIZ(sbLIZ3);
                                    C1009460cNM c1009460cNM3 = c1009460cNM2;
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("coin_task_event_type", "rewardCompleted");
                                    jSONObject.put("isSuccess", z);
                                    c1009460cNM3.LJIILL(new C0SCL(jSONObject));
                                }
                            }, c1009460cNM2.LJJIII);
                        }
                    }
                };
            } else {
                c1009480cNO = 0;
            }
            C1008160cLG c1008160cLG = new C1008160cLG(null, c1009480cNO, null, null, null, 29);
            this.LJIIZILJ = ((IAnoleService) this.LJII.getValue()).LJI(this.LIZJ, null, c1009340cNA, this, c1008160cLG);
            ICarouselFeedService iCarouselFeedService = (ICarouselFeedService) PluggableExtentionKt.pluggableSpi$default(ICarouselFeedService.class, false, false, false, 14, null);
            this.LJIJ = iCarouselFeedService != null ? iCarouselFeedService.LIZ(this.LIZJ, this.LIZ, c1009340cNA, this, c1008160cLG) : null;
        }
        this.LJJIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 957));
    }

    @Override // X.InterfaceC1007910cKr
    public final boolean a3(String str, Runnable runnable, int i) {
        AwemeRawAd awemeRawAd;
        VideoPlaybackConfig videoPlaybackConfig;
        Integer num;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("registerPlayProgressObserver,token = ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (((Boolean) C275530Ar1.LIZ.getValue()).booleanValue() && a0.LJJIIZI(str, EnumC1008920cMU.ONESTOP_NATIVE_CTABUTTON.getType(), false)) {
            return C786410Ut5.LJLIIL(i, (Handler) this.LIZLLL.getValue(), runnable);
        }
        Aweme aweme = this.LIZ;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (videoPlaybackConfig = awemeRawAd.getVideoPlaybackConfig()) != null && (num = videoPlaybackConfig.componentDisplayTiming) != null && num.intValue() == 2) {
            return C786410Ut5.LJLIIL(i, (Handler) this.LIZLLL.getValue(), runnable);
        }
        if (AwemeSaaSExtKt.isLive(this.LIZ)) {
            return C786410Ut5.LJLIIL(i, (Handler) this.LIZLLL.getValue(), runnable);
        }
        Video video = this.LIZ.getVideo();
        if (video == null) {
            return false;
        }
        int duration = video.getDuration();
        IVideoPlayTaskManager iVideoPlayTaskManagerLJJJJI = LJJJJI();
        C988300bpE c988300bpE = new C988300bpE(str);
        c988300bpE.LIZIZ(duration);
        c988300bpE.LIZJ = i;
        c988300bpE.LIZLLL = runnable;
        c988300bpE.LJ = true;
        iVideoPlayTaskManagerLJJJJI.LLIFFJFJJ(c988300bpE.LIZ());
        return true;
    }

    @Override // X.InterfaceC1007910cKr
    public final boolean h3(String str, InterfaceC1007930cKt interfaceC1007930cKt, AnoleComponentAppearModel anoleComponentAppearModel) {
        InterfaceC1009570cNX interfaceC1009570cNX;
        Object obj;
        Boolean bool;
        Boolean bool2;
        String type = interfaceC1007930cKt.getType();
        boolean z = false;
        if (!Intrinsics.LJFF(type, EnumC1008920cMU.LYNX_END_LAYER.getType()) && !Intrinsics.LJFF(type, EnumC1008920cMU.NATIVE_END_LAYER.getType())) {
            if (Intrinsics.LJFF(type, EnumC1008920cMU.EXTEND_LAYER.getType())) {
                return true;
            }
            if (Intrinsics.LJFF(type, EnumC1008920cMU.QXPX_STICKER.getType())) {
                if (this.LJIL || LJIIJ()) {
                    return false;
                }
                return true;
            }
            if (Intrinsics.LJFF(type, EnumC1008920cMU.COIN_WIDGET_GUIDE.getType())) {
                C1009500cNQ c1009500cNQLJJJIL = LJJJIL();
                if (c1009500cNQLJJJIL != null && c1009500cNQLJJJIL.LIZLLL(this.LJJIII)) {
                    z = true;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("shouldShowADComponent = ");
                sbLIZ.append(interfaceC1007930cKt.getType());
                sbLIZ.append(" , result = ");
                sbLIZ.append(z);
                C2188811AlT.LIZIZ(sbLIZ);
                return z;
            }
            Object objValueOf = null;
            if (Intrinsics.LJFF(type, EnumC1008920cMU.TTPLUS_BOTTOM_BANNER.getType())) {
                IComplianceSettingsService iComplianceSettingsService = (IComplianceSettingsService) PluggableExtentionKt.pluggableSpi$default(IComplianceSettingsService.class, false, false, false, 14, null);
                if (iComplianceSettingsService != null && !iComplianceSettingsService.LJJ()) {
                    return false;
                }
                IRepetitiveVideoQuestionnaireService iRepetitiveVideoQuestionnaireService = (IRepetitiveVideoQuestionnaireService) PluggableExtentionKt.pluggableSpi$default(IRepetitiveVideoQuestionnaireService.class, false, false, false, 14, null);
                if (iRepetitiveVideoQuestionnaireService != null) {
                    objValueOf = Boolean.valueOf(iRepetitiveVideoQuestionnaireService.LJFF(this.LIZ.getAid()));
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("[shouldShowADComponent] showQuestionaireBottomBanner=");
                sbLIZ2.append(objValueOf);
                C1022620cia.LIZ("FeedItemModuleImpl", C2188811AlT.LIZIZ(sbLIZ2));
                return Intrinsics.LJFF(objValueOf, Boolean.FALSE);
            }
            if (Intrinsics.LJFF(type, EnumC1008920cMU.LIVE_REDIRECT_BANNER.getType())) {
                Map<String, Object> bussinessPreconditions = anoleComponentAppearModel.getBussinessPreconditions();
                if (bussinessPreconditions != null) {
                    obj = bussinessPreconditions.get("author_is_living");
                } else {
                    obj = null;
                }
                if (obj instanceof Boolean) {
                    bool = (Boolean) obj;
                } else {
                    bool = null;
                }
                boolean zLLD = C1017070cZd.LLD(this.LIZ);
                if (bool != null) {
                    if (!bool.booleanValue() || !zLLD) {
                        return false;
                    }
                    return true;
                }
                Map<String, Object> bussinessPreconditions2 = anoleComponentAppearModel.getBussinessPreconditions();
                if (bussinessPreconditions2 != null) {
                    objValueOf = bussinessPreconditions2.get("author_is_not_living");
                }
                if (!(objValueOf instanceof Boolean) || (bool2 = (Boolean) objValueOf) == null) {
                    return true;
                }
                if (!bool2.booleanValue() || zLLD) {
                    return false;
                }
                return true;
            }
            if (Intrinsics.LJFF(C0RQ7.ANOLE_LIVE_PREVIEW_ABOVE_INTERACTIVE.getSlotName(), str) && AwemeSaaSExtKt.isLive(this.LIZ) && (interfaceC1009570cNX = this.LJJIJLIJ) != null && !interfaceC1009570cNX.LJJJIL()) {
                return false;
            }
            return !LJIIJ();
        }
        IAnoleMaskAbility iAnoleMaskAbility = this.LJJIJIIJIL;
        if (iAnoleMaskAbility == null) {
            return false;
        }
        return iAnoleMaskAbility.Vg();
    }

    @Override // X.InterfaceC1007910cKr
    public final void f3(long j, String str, String str2, AwS81S0100100_16 awS81S0100100_16) {
        this.LJJIIZ = false;
        InterfaceC1009510cNR interfaceC1009510cNR = this.LJJIJ;
        if (interfaceC1009510cNR != null) {
            interfaceC1009510cNR.Ak(j, str, str2, new AwS452S0200000_16(this, awS81S0100100_16, 11));
        }
    }
}
