package X;

import Y.AComparatorS41S0000000_22;
import Y.AObserverS228S0100000_26;
import Y.ARunnableS129S0100000_29;
import Y.ARunnableS91S0200000_22;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAAnchorService;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.anchor.service.AnchorLock$IAnchorStateService;
import com.ss.android.ugc.aweme.base.AnchorListManager;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.anchor.service.GetLeadsAnchorService;
import com.ss.android.ugc.aweme.compliance.api.interfaces.IFundraiserService;
import com.ss.android.ugc.aweme.creative.model.AnchorTransData;
import com.ss.android.ugc.aweme.creative.model.UploadableDraftEffect;
import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.product.ProductRecommendModel;
import com.ss.android.ugc.aweme.ecommerce.anchor.model.ECAvMusic;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorPublishPermission;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.Lemon8AnchorContentInfo;
import com.ss.android.ugc.aweme.feed.model.Lemon8GeneralAnchorContentInfo;
import com.ss.android.ugc.aweme.feed.model.SeriesCategory;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService;
import com.ss.android.ugc.aweme.liveevent.LiveEventModule;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.opensdkservice.IOpenPlatformService;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.ss.android.ugc.aweme.services.publish.AVPublishExtensionBiz;
import com.ss.android.ugc.aweme.services.publish.AVPublishExtensionVisible;
import com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo;
import com.ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.ss.android.ugc.aweme.services.publish.IAVPublishPageUIRefactorService;
import com.ss.android.ugc.aweme.services.publish.MultiAnchorPublishModel;
import com.ss.android.ugc.aweme.services.publish.PublishOutput;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import com.ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel;
import com.ss.android.ugc.aweme.spark.business.AnchorPublishContext;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS273S0300000_29;
import kotlin.jvm.internal.AwS388S0200000_22;
import kotlin.jvm.internal.AwS41S0001000_29;
import kotlin.jvm.internal.AwS464S0200000_29;
import kotlin.jvm.internal.AwS484S0200000_19;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS643S0100000_29;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.11Va, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19510811Va implements IAVPublishExtension<MultiAnchorPublishModel>, InterfaceC1141530foN {
    public static final int LLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
    public AbstractC19511111Vd LLILLJJLI;
    public Fragment LLILLL;
    public LifecycleOwner LLILZ;
    public View LLILZIL;
    public ExtensionMisc LLILZLL;
    public AVPublishContentType LLIZ;
    public PublishOutput LLIZLLLIL;
    public PublishExtensionModel LLJ;
    public String LLJI;
    public UrlModel LLJIJIL;
    public Integer LLJILJIL;
    public C11G7 LLJILLL;
    public boolean LLJJ;
    public int LLJJI;
    public int LLJJIII;
    public AnchorPublishStruct LLJJIJIIJIL;
    public int LLJJJIL;
    public DialogC849000XSg LLJJJJJIL;
    public List<UploadableDraftEffect> LLJJJJLIIL;
    public List<UploadableMobileEffect> LLJJL;
    public List<AnchorPublishStruct> LLJJLIIIJLLLLLLLZ;
    public List<LiveEventModule> LLJL;
    public IAVPublishExtension.Callback LLJLLIL;
    public boolean LLJLLL;
    public final int LL = 2;
    public boolean LLJILJILJ = true;
    public final AnchorLock$IAnchorStateService LLJJIJI = (AnchorLock$IAnchorStateService) ServiceManager.get().getService(AnchorLock$IAnchorStateService.class);
    public final List<Function0<Unit>> LLJJIJIL = new ArrayList();
    public final List<Function1<Integer, Unit>> LLJJJ = new ArrayList();
    public final C01GW LLJJJJ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(94));
    public final MutableLiveData<C1738590vLN<Unit>> LLJLIL = new MutableLiveData<>();
    public boolean LLJLILLLLZIIL = true;
    public final C01GW LLJLL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(92));
    public final C01GW LLJZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(95));
    public final C19511211Ve LLJZIJLIL = new InterfaceC1164530gPT() { // from class: X.11Ve
        @Override // X.InterfaceC1164530gPT
        public final void onEvent(String str, String str2) throws JSONException {
            AVMusic aVMusic;
            if (Intrinsics.LJFF(str, "ec_anchor_settings_updated")) {
                if (((IECommerceVideoService) ServiceManager.get().getService(IECommerceVideoService.class)).LJIIIZ()) {
                    SettingsManager.LIZLLL().getClass();
                    if (SettingsManager.LJ("ec_publish_post_anchors", 0) == 0) {
                        C19510811Va c19510811Va = this.LL;
                        List<AnchorTransData> value = c19510811Va.LJIILL().extensionDataRepo.getUpdateAnchors().getValue();
                        IECommerceAnchorService iECommerceAnchorService = (IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class);
                        boolean z = c19510811Va.LLJJ;
                        ExtensionMisc extensionMiscLJIILL = c19510811Va.LJIILL();
                        AVMusic aVMusic2 = null;
                        if (extensionMiscLJIILL != null) {
                            aVMusic = extensionMiscLJIILL.currentMusic;
                        } else {
                            aVMusic = null;
                        }
                        c19510811Va.LJJIZ(aVMusic);
                        c19510811Va.LJIILL();
                        List<AnchorTransData> listLJJLJ = iECommerceAnchorService.LJJLJ(value, z, null);
                        if (!Intrinsics.LJFF(listLJJLJ, value)) {
                            c19510811Va.LJIILL().extensionDataRepo.getUpdateAnchors().setValue(listLJJLJ);
                        }
                        IECommerceAnchorService iECommerceAnchorService2 = (IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class);
                        boolean z2 = c19510811Va.LLJJ;
                        ExtensionMisc extensionMiscLJIILL2 = c19510811Va.LJIILL();
                        if (extensionMiscLJIILL2 != null) {
                            aVMusic2 = extensionMiscLJIILL2.currentMusic;
                        }
                        iECommerceAnchorService2.LJJL(listLJJLJ, z2, !c19510811Va.LJJIZ(aVMusic2), c19510811Va.LJIILL().mobParam.creationId, new AwS601S0100000_22(c19510811Va, 293));
                        return;
                    }
                }
                C19510811Va c19510811Va2 = this.LL;
                c19510811Va2.LJJIII(c19510811Va2.LJIILL().extensionDataRepo.getUpdateAnchors().getValue());
            }
        }
    };

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final String getName() {
        return "MultiAnchorPublishExtension";
    }

    public static final boolean LJIIL() {
        IAVPublishPageUIRefactorService iAVPublishPageUIRefactorService = (IAVPublishPageUIRefactorService) PluggableExtentionKt.pluggableSpi$default(IAVPublishPageUIRefactorService.class, false, false, false, 14, null);
        if (iAVPublishPageUIRefactorService == null) {
            return false;
        }
        return iAVPublishPageUIRefactorService.enableToastCenter();
    }

    public final boolean LJI() {
        String strLJJZ;
        List<CreateAnchorInfo> list;
        if (this.LLILZLL == null) {
            return false;
        }
        InterfaceC19511611Vi interfaceC19511611Vi = LJIILL().publishExtensionDataContainer;
        if (interfaceC19511611Vi != null && interfaceC19511611Vi.LJJLI()) {
            return true;
        }
        InterfaceC19511611Vi interfaceC19511611Vi2 = LJIILL().publishExtensionDataContainer;
        if (interfaceC19511611Vi2 != null && (strLJJZ = interfaceC19511611Vi2.LJJZ()) != null && strLJJZ.length() != 0) {
            try {
                list = PublishExtensionModel.fromString(strLJJZ).createAnchorInfos;
                if (list == null) {
                    list = C13BV.INSTANCE;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                list = C13BV.INSTANCE;
            }
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (CreateAnchorInfo createAnchorInfo : list) {
                    if (createAnchorInfo.getType() == EnumC1430380nKG.DONATION_STICKER.getTYPE() && LJIL(createAnchorInfo.getContent())) {
                        return true;
                    }
                }
            }
        }
        List<AnchorTransData> value = LJIILL().extensionDataRepo.getUpdateAnchors().getValue();
        if (value == null) {
            value = C13BV.INSTANCE;
        }
        if (!(value instanceof Collection) || !value.isEmpty()) {
            for (AnchorTransData anchorTransData : value) {
                if (anchorTransData.businessType == EnumC1430380nKG.DONATION_STICKER.getTYPE() && LJIL(anchorTransData.anchorContent)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final ViewGroup LJIILJJIL() {
        AbstractC19511111Vd abstractC19511111Vd = this.LLILLJJLI;
        if (abstractC19511111Vd == null) {
            abstractC19511111Vd = null;
        }
        return abstractC19511111Vd.getAnchorListContent();
    }

    public final ExtensionMisc LJIILL() {
        ExtensionMisc extensionMisc = this.LLILZLL;
        if (extensionMisc != null) {
            return extensionMisc;
        }
        return null;
    }

    public final IAVPublishPageUIRefactorService LJIILLIIL() {
        return (IAVPublishPageUIRefactorService) this.LLJZ.getValue();
    }

    public final void LJJJIL() {
        int size;
        ExtensionDataRepo extensionDataRepo;
        AnchorListManager.LIZ.getClass();
        if ((AnchorListManager.LJII > 0) && this.LLJLILLLLZIIL) {
            AbstractC19511111Vd abstractC19511111Vd = this.LLILLJJLI;
            if (abstractC19511111Vd == null) {
                abstractC19511111Vd = null;
            }
            abstractC19511111Vd.LJIIJJI();
        } else {
            AbstractC19511111Vd abstractC19511111Vd2 = this.LLILLJJLI;
            if (abstractC19511111Vd2 == null) {
                abstractC19511111Vd2 = null;
            }
            abstractC19511111Vd2.LJ();
        }
        AnchorListManager.LJIIJ(AnchorListManager.LJII());
        if (AnchorListManager.LJIIIZ && C0C64.LJIILLIIL().LJIIIZ(31744, "ec_addlink_product_tips_enable", true, false)) {
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "ec_anchor_addlink_guild_enable", true, false)) {
                boolean z = Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").getBoolean("autogenerated_caption_popup_shown_again_extra", false);
                Keva keva = C1257480ipO.LIZ;
                int i = keva.getInt("is_first_show_anchor_guild", -1);
                if (i == 1 || i == 2) {
                    AbstractC19511111Vd abstractC19511111Vd3 = this.LLILLJJLI;
                    if (abstractC19511111Vd3 == null) {
                        abstractC19511111Vd3 = null;
                    }
                    abstractC19511111Vd3.LJIIL(false);
                } else if (z && i == -1) {
                    keva.storeInt("is_first_show_anchor_guild", 1);
                    AbstractC19511111Vd abstractC19511111Vd4 = this.LLILLJJLI;
                    if (abstractC19511111Vd4 == null) {
                        abstractC19511111Vd4 = null;
                    }
                    abstractC19511111Vd4.LJIIL(true);
                } else {
                    AbstractC19511111Vd abstractC19511111Vd5 = this.LLILLJJLI;
                    if (abstractC19511111Vd5 == null) {
                        abstractC19511111Vd5 = null;
                    }
                    abstractC19511111Vd5.LJIIL(false);
                }
            } else {
                AbstractC19511111Vd abstractC19511111Vd6 = this.LLILLJJLI;
                if (abstractC19511111Vd6 == null) {
                    abstractC19511111Vd6 = null;
                }
                abstractC19511111Vd6.LJIIL(false);
            }
            C20684815ws.LJIILLIIL("label_panel_info_show", new C2344009Gk().LIZ);
        } else {
            AbstractC19511111Vd abstractC19511111Vd7 = this.LLILLJJLI;
            if (abstractC19511111Vd7 == null) {
                abstractC19511111Vd7 = null;
            }
            abstractC19511111Vd7.LJI();
        }
        ExtensionMisc extensionMiscLJIILL = LJIILL();
        ProductRecommendModel productRecommendModel = (extensionMiscLJIILL == null || (extensionDataRepo = extensionMiscLJIILL.extensionDataRepo) == null) ? null : extensionDataRepo.getProductRecommendModel();
        if (!((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJIJJ()) {
            if (productRecommendModel != null) {
                productRecommendModel.productIdList = null;
            }
        } else {
            if (productRecommendModel == null || productRecommendModel.productIdList == null) {
                ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJIJIIJI(new AwS608S0100000_29(this, 136));
                return;
            }
            List<String> list = productRecommendModel.productIdList;
            if (list == null || (size = list.size()) <= 0) {
                return;
            }
            AbstractC19511111Vd abstractC19511111Vd8 = this.LLILLJJLI;
            (abstractC19511111Vd8 != null ? abstractC19511111Vd8 : null).LJIILIIL(size);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onAccountUpdate() {
        AnchorListManager anchorListManager = AnchorListManager.LIZ;
        AwS573S0100000_29 awS573S0100000_29 = new AwS573S0100000_29(this, 114);
        anchorListManager.getClass();
        AnchorListManager.LIZLLL(awS573S0100000_29);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final MultiAnchorPublishModel provideExtensionData() {
        return new MultiAnchorPublishModel();
    }

    public final boolean LJJ() {
        AVMusic aVMusic = LJIILL().currentMusic;
        if (aVMusic != null) {
            return aVMusic.isCommerceMusic();
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onDestroy() {
        onUnbindOptionView();
        AnchorListManager.LIZ.getClass();
        Map mapLJII = AnchorListManager.LJII();
        if (mapLJII != null) {
            Iterator it2 = mapLJII.entrySet().iterator();
            while (it2.hasNext()) {
                ((AnchorPublishStruct) ((Map.Entry) it2.next()).getValue()).setOnClickAction(AFwS218S0000000_29.get$arr$(94));
            }
        }
        if (C294110Bft.LIZIZ()) {
            this.LLJJIJI.LIZLLL();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onResume() {
        ExtensionMisc extensionMiscLJIILL;
        ExtensionDataRepo extensionDataRepo;
        MutableLiveData<List<AnchorTransData>> updateAnchors;
        ExtensionMisc extensionMiscLJIILL2;
        ExtensionDataRepo extensionDataRepo2;
        MutableLiveData<List<AnchorTransData>> updateAnchors2;
        String string;
        IAVPublishExtension.DefaultImpls.onResume(this);
        Keva repo = Keva.getRepo("TOOLS_PUBLISH_REPO_NAME");
        if (repo != null && (string = repo.getString("ec_anchor_data", null)) != null) {
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, string, (c1121904a9LIZIZ == null || !c1121904a9LIZIZ.LJII) ? new TypeToken<AnchorTransData>() { // from class: X.11Vm
                }.getType() : C2371409Qy.LIZJ(C13LE.LJII(AnchorTransData.class)));
                if (!(objFromJson instanceof AnchorTransData)) {
                    objFromJson = null;
                }
                AnchorTransData anchorTransData = (AnchorTransData) objFromJson;
                if (anchorTransData != null) {
                    LJIILL().extensionDataRepo.getUpdateAnchors().setValue(LIZIZ(anchorTransData));
                    repo.erase("ec_anchor_data");
                }
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LJ("ec_publish_post_anchors", 0) == 1 && (extensionMiscLJIILL2 = LJIILL()) != null && (extensionDataRepo2 = extensionMiscLJIILL2.extensionDataRepo) != null && (updateAnchors2 = extensionDataRepo2.getUpdateAnchors()) != null) {
            IECommerceAnchorService iECommerceAnchorService = (IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class);
            List value = updateAnchors2.getValue();
            boolean z = this.LLJJ;
            ExtensionMisc extensionMiscLJIILL3 = LJIILL();
            LJJIZ(extensionMiscLJIILL3 != null ? extensionMiscLJIILL3.currentMusic : null);
            LJIILL();
            AbstractC19511111Vd abstractC19511111Vd = this.LLILLJJLI;
            if (abstractC19511111Vd == null) {
                abstractC19511111Vd = null;
            }
            updateAnchors2.setValue(iECommerceAnchorService.LJJLJ(value, z, abstractC19511111Vd));
            ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJL(updateAnchors2.getValue(), this.LLJJ, !LJJIZ(LJIILL() != null ? r0.currentMusic : null), LJIILL().mobParam.creationId, new AwS388S0200000_22((MutableLiveData) updateAnchors2, (MutableLiveData<List<AnchorTransData>>) this, (C19510811Va) 64));
        }
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LJ("ec_publish_post_anchors", 0) != 2 || (extensionMiscLJIILL = LJIILL()) == null || (extensionDataRepo = extensionMiscLJIILL.extensionDataRepo) == null || (updateAnchors = extensionDataRepo.getUpdateAnchors()) == null) {
            return;
        }
        IECommerceAnchorService iECommerceAnchorService2 = (IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class);
        List value2 = updateAnchors.getValue();
        boolean z2 = this.LLJJ;
        ExtensionMisc extensionMiscLJIILL4 = LJIILL();
        LJJIZ(extensionMiscLJIILL4 != null ? extensionMiscLJIILL4.currentMusic : null);
        LJIILL();
        AbstractC19511111Vd abstractC19511111Vd2 = this.LLILLJJLI;
        updateAnchors.setValue(iECommerceAnchorService2.LJJLJ(value2, z2, abstractC19511111Vd2 != null ? abstractC19511111Vd2 : null));
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onUnbindOptionView() {
        InterfaceC19511711Vj interfaceC19511711VjLJIIJ;
        EventBus.LIZLLL().LJJI(this);
        C1548820qPI.LJIIIIZZ("lemon8_add_anchor_event", this);
        C1548820qPI.LJIIIIZZ("music_add_playlist_anchor_event", this);
        C1548820qPI.LJIIIIZZ("ba_product_link_attach_video", this);
        C1548820qPI.LJIIIIZZ("ba_product_link_status_update", this);
        C1548820qPI.LJIIIIZZ("publish_commerce_anchor_event", this);
        C1548820qPI.LJIIIIZZ("addGamePOIAnchorsEvent", this);
        C1548820qPI.LJIIIIZZ("replaceGamePOIAnchorsEvent", this);
        C1548820qPI.LJIIIIZZ("close_suggestions_module", this);
        C1548820qPI.LJIIIIZZ("live_event_create_result", this);
        C1548820qPI.LJIIIIZZ("live_glip_anchor_event", this);
        C1548820qPI.LJIIIIZZ("live_studio_glip_anchor_event", this);
        C1548820qPI.LJIIIIZZ("live_video_clip_campaign_event", this);
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZJ("ec_anchor_settings_updated", this.LLJZIJLIL);
        }
        IECommerceVideoService iECommerceVideoService = (IECommerceVideoService) PluggableExtentionKt.pluggableSpi$default(IECommerceVideoService.class, false, false, false, 14, null);
        if (iECommerceVideoService == null || (interfaceC19511711VjLJIIJ = iECommerceVideoService.LJIIJ()) == null) {
            return;
        }
        interfaceC19511711VjLJIIJ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final Integer getAnchorIconRawId() {
        return this.LLJILJIL;
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final UrlModel getAnchorIconUrl() {
        return this.LLJIJIL;
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final String getAnchorText() {
        return this.LLJI;
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final boolean isDisplayAnchor() {
        return this.LLJILJILJ;
    }

    public static final ECAvMusic LJFF(AVMusic aVMusic) {
        return new ECAvMusic(Boolean.valueOf(aVMusic.isHasCommerceRight()), Boolean.valueOf(aVMusic.isCommerceMusic()), aVMusic.isHasCommerceRightStrict());
    }

    public static final ArrayList<AnchorTransData> LJII(ArrayList<AnchorTransData> arrayList) {
        boolean zLJFF;
        ArrayList<AnchorTransData> arrayList2 = new ArrayList<>();
        for (AnchorTransData anchorTransData : arrayList) {
            Iterator<AnchorTransData> it2 = arrayList2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    AnchorTransData next = it2.next();
                    if (next != null) {
                        int i = anchorTransData.businessType;
                        if (i == EnumC1430380nKG.PAID_COLLECTION.getTYPE()) {
                            zLJFF = Intrinsics.LJFF(anchorTransData.url, next.url);
                        } else if (i != EnumC1430380nKG.PROP.getTYPE() && i != EnumC1430380nKG.TIKTOK_GAME.getTYPE()) {
                            if (!Intrinsics.LJFF(anchorTransData.title, next.title) || !Intrinsics.LJFF(anchorTransData.extra, next.extra)) {
                            }
                        } else {
                            zLJFF = Intrinsics.LJFF(anchorTransData.title, next.title);
                        }
                        if (zLJFF) {
                            break;
                        }
                    }
                } else {
                    arrayList2.add(anchorTransData);
                    break;
                }
            }
        }
        return arrayList2;
    }

    public static boolean LJIJJLI(AnchorPublishStruct anchorPublishStruct) {
        String str = anchorPublishStruct.scheme;
        if (str != null && str.length() > 0) {
            return true;
        }
        return false;
    }

    public static boolean LJIL(String str) {
        if (str.length() == 0) {
            return false;
        }
        try {
            if (new JSONObject(str).optInt("add_from", -1) == 1) {
                return true;
            }
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static void LJJIJIIJI(List list) {
        int i;
        if (C294110Bft.LIZ() == 4) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                AnchorTransData anchorTransData = (AnchorTransData) obj;
                if (anchorTransData.businessType == EnumC1430380nKG.PROP.getTYPE() || anchorTransData.businessType == EnumC1430380nKG.ANCHOR_SOUND_SYNC.getTYPE() || anchorTransData.businessType == EnumC1430380nKG.ANCHOR_PHOTO_MODE_TEMPLATE.getTYPE() || anchorTransData.businessType == EnumC1430380nKG.DONATION_STICKER.getTYPE() || anchorTransData.businessType == EnumC1430380nKG.TTS_VOICE.getTYPE() || anchorTransData.businessType == EnumC1430380nKG.ANCHOR_VOICECONVERSION.getTYPE() || C1394440mOI.LIZJ(anchorTransData.businessType)) {
                    arrayList.add(obj);
                }
            }
            list.removeAll(arrayList);
        }
        if (!list.isEmpty() && list.size() != 1) {
            if (list.size() > 1) {
                C08XD.LJJ(list, new AComparatorS41S0000000_22(4));
            }
            if (list.isEmpty()) {
                i = 0;
            } else {
                Iterator it2 = list.iterator();
                i = 0;
                while (it2.hasNext()) {
                    if (((AnchorTransData) ListProtector.get(list, 0)).businessType == ((AnchorTransData) it2.next()).businessType && (i = i + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
            list.removeAll(C13LP.LJLLI(C13LP.LJLIIL(C13LZ.LJIILJJIL(0, i - 1), C13LZ.LJIILJJIL(i, list.size())), list));
        }
    }

    public final void LIZ(C2344009Gk c2344009Gk) {
        c2344009Gk.LJIIIIZZ("creation_id", LJIILL().mobParam.creationId);
        c2344009Gk.LJIIIIZZ("shoot_way", LJIILL().mobParam.shootWay);
        c2344009Gk.LJIIIIZZ("content_type", LJIILL().mobParam.contentType);
        c2344009Gk.LJIIIIZZ("content_source", LJIILL().mobParam.contentSource);
        c2344009Gk.LJIIIIZZ("shoot_tab_name", LJIILL().mobParam.tabName);
        c2344009Gk.LIZJ(LJIILL().mobParam.isMultiContent() ? 1 : 0, "is_multi_content");
        c2344009Gk.LJFF("enter_from", "video_post_page");
    }

    public final List<AnchorTransData> LIZIZ(AnchorTransData anchorTransData) {
        ExtensionDataRepo extensionDataRepo;
        MutableLiveData<List<AnchorTransData>> updateAnchors;
        List<AnchorTransData> value;
        ArrayList arrayList = new ArrayList();
        ExtensionMisc extensionMiscLJIILL = LJIILL();
        if (extensionMiscLJIILL != null && (extensionDataRepo = extensionMiscLJIILL.extensionDataRepo) != null && (updateAnchors = extensionDataRepo.getUpdateAnchors()) != null && (value = updateAnchors.getValue()) != null) {
            for (AnchorTransData anchorTransData2 : value) {
                int i = anchorTransData.businessType;
                EnumC1430380nKG enumC1430380nKG = EnumC1430380nKG.SERVICE_PLUGIN;
                if (i != enumC1430380nKG.getTYPE() || anchorTransData2.businessType != enumC1430380nKG.getTYPE()) {
                    int i2 = anchorTransData.businessType;
                    EnumC1430380nKG enumC1430380nKG2 = EnumC1430380nKG.GO_LIVE_INCENTIVE_ANCHOR;
                    if (i2 == enumC1430380nKG2.getTYPE() && anchorTransData2.businessType == enumC1430380nKG2.getTYPE()) {
                        SettingsManager.LIZLLL().getClass();
                        if (SettingsManager.LIZ("enable_de_duplicate_live_glip_anchor", true)) {
                        }
                    }
                    arrayList.add(anchorTransData2);
                }
            }
        }
        InterfaceC710290Rtb interfaceC710290RtbLIZ = C19513411Wa.LIZ();
        if (interfaceC710290RtbLIZ != null && ((C19513511Wb) interfaceC710290RtbLIZ).LIZIZ() != null && C19512911Vv.LJ(anchorTransData, arrayList)) {
            return arrayList;
        }
        arrayList.add(anchorTransData);
        return LJII(arrayList);
    }

    public final void LIZJ(AnchorPublishStruct anchorPublishStruct) {
        Fragment fragment = this.LLILLL;
        View view = null;
        if (fragment == null) {
            fragment = null;
        }
        Context context = fragment.getContext();
        if (context == null) {
            return;
        }
        if (LJI()) {
            String string = context.getString(2131834993);
            if (LJIIL()) {
                View view2 = this.LLILZIL;
                if (view2 != null) {
                    view = view2;
                }
                C1389880mGw c1389880mGw = new C1389880mGw(view);
                c1389880mGw.LJIIIZ(string);
                c1389880mGw.LIZ(true);
                c1389880mGw.LJIIJ();
                return;
            }
            View view3 = this.LLILZIL;
            if (view3 != null) {
                view = view3;
            }
            C1389890mGx c1389890mGx = new C1389890mGx(view);
            c1389890mGx.LJIIJ(string);
            c1389890mGx.LJIIJJI();
            return;
        }
        IFundraiserService iFundraiserService = (IFundraiserService) PluggableExtentionKt.pluggableSpi$default(IFundraiserService.class, false, false, false, 14, null);
        if (iFundraiserService != null) {
            iFundraiserService.LJIILIIL(context, null, EnumC1910580zom.VIDEO, EnumC1910570zol.VIDEO_POST_PAGE, false, "", new AwS484S0200000_19(anchorPublishStruct, context, 2));
        }
    }

    public final List<AnchorTransData> LIZLLL(AnchorTransData anchorTransData) {
        ArrayList arrayList = new ArrayList();
        List<AnchorTransData> value = LJIILL().extensionDataRepo.getUpdateAnchors().getValue();
        if (value != null) {
            ArrayList arrayList2 = new ArrayList();
            for (AnchorTransData anchorTransData2 : value) {
                AnchorTransData anchorTransData3 = anchorTransData2;
                if (anchorTransData3.businessType != EnumC1430380nKG.LEMON8_ANCHOR.getTYPE() && !C1067090dsJ.LIZ(anchorTransData3.businessType)) {
                    arrayList2.add(anchorTransData2);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
        arrayList.add(anchorTransData);
        return LJII(arrayList);
    }

    public final void LJ(String str) {
        Unit unit;
        try {
            IAVPublishExtension.Callback callback = this.LLJLLIL;
            if (callback != null) {
                callback.onGameBCToggleStateUpdate(str);
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void LJIIIIZZ(AnchorTransData anchorTransData) {
        SeriesCategory seriesCategory;
        List<AnchorTransData> value;
        int i = anchorTransData.businessType;
        EnumC1430380nKG enumC1430380nKG = EnumC1430380nKG.PAID_COLLECTION;
        boolean z = false;
        if (i == enumC1430380nKG.getTYPE()) {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("creator_m10n_android_paid_content_prevent_non_commercial_music_is_enabled", false) && !LJJ()) {
                return;
            }
        }
        if (anchorTransData.businessType == enumC1430380nKG.getTYPE()) {
            z = true;
        }
        ArrayList arrayList = null;
        if (z && (seriesCategory = anchorTransData.seriesCategory) != null && seriesCategory == SeriesCategory.MINI_DRAMA && (value = LJIILL().extensionDataRepo.getUpdateAnchors().getValue()) != null) {
            ArrayList arrayList2 = new ArrayList(value);
            C19719612Di.LJJIIJ(arrayList2, new AwS601S0100000_22(anchorTransData, 264), true);
            AbstractC19511111Vd abstractC19511111Vd = this.LLILLJJLI;
            if (abstractC19511111Vd == null) {
                abstractC19511111Vd = null;
            }
            abstractC19511111Vd.LIZJ();
            LJIILL().extensionDataRepo.getUpdateAnchors().setValue(arrayList2);
        }
        anchorTransData.setAddTime(Long.valueOf(SystemClock.elapsedRealtime()));
        if (C294110Bft.LIZIZ()) {
            AbstractC19511111Vd abstractC19511111Vd2 = this.LLILLJJLI;
            if (abstractC19511111Vd2 == null) {
                abstractC19511111Vd2 = null;
            }
            abstractC19511111Vd2.LIZJ();
            LJIILL().extensionDataRepo.getUpdateAnchors().setValue(new ArrayList());
        }
        if (anchorTransData.businessType == EnumC1430380nKG.MINIS_ANCHOR.getTYPE()) {
            List<AnchorTransData> value2 = LJIILL().extensionDataRepo.getUpdateAnchors().getValue();
            if (value2 != null) {
                arrayList = new ArrayList(value2);
            }
            List<AnchorTransData> value3 = LJIILL().extensionDataRepo.getUpdateAnchors().getValue();
            if (value3 != null) {
                for (AnchorTransData anchorTransData2 : value3) {
                    if (anchorTransData2.businessType == EnumC1430380nKG.MINIS_ANCHOR.getTYPE() && arrayList != null) {
                        arrayList.remove(anchorTransData2);
                    }
                }
            }
            LJIILL().extensionDataRepo.getUpdateAnchors().setValue(arrayList);
        }
        LJIILL().extensionDataRepo.getUpdateAnchors().setValue(LIZIZ(anchorTransData));
        C20684815ws.LJFF().submit(new ARunnableS91S0200000_22(anchorTransData, this, 4));
    }

    public final void LJIIIZ(AnchorPublishStruct anchorPublishStruct) {
        String strLIZ;
        boolean z = false;
        if (anchorPublishStruct.isNew) {
            anchorPublishStruct.isNew = false;
            AnchorListManager.LIZ.getClass();
            AnchorListManager.LIZIZ();
            C11G7 c11g7 = this.LLJILLL;
            if (c11g7 != null) {
                c11g7.LJLJJI();
            }
            AnchorListManager.LJIIL(anchorPublishStruct);
            LJJJIL();
        }
        String str = LJIILL().mobParam.shootWay;
        String str2 = LJIILL().mobParam.creationId;
        String str3 = anchorPublishStruct.scheme;
        if (str3 != null && str3.length() != 0) {
            Uri uri = UriProtector.parse(anchorPublishStruct.scheme);
            int i = anchorPublishStruct.type;
            EnumC1430380nKG enumC1430380nKG = EnumC1430380nKG.THIRD_PART_GENERAL;
            Fragment fragment = null;
            if (i == enumC1430380nKG.getTYPE() && Intrinsics.LJFF(uri.getHost(), "third_party_common_webview") && (strLIZ = C416901jj.LIZ(uri, "url")) != null && a0.LJJIIZI(strLIZ, "fcp_anchor_spark=1", false)) {
                SparkContext sparkContext = new SparkContext();
                sparkContext.LJJLIIJ(uri.toString());
                String str4 = "";
                if (str == null) {
                    str = "";
                }
                sparkContext.LJJJZ("shoot_way", str);
                if (str2 == null) {
                    str2 = "";
                }
                sparkContext.LJJJZ("creation_id", str2);
                sparkContext.LJJJZ("title", anchorPublishStruct.title);
                sparkContext.LJJJLZIJ(anchorPublishStruct.type, "type");
                String str5 = anchorPublishStruct.subtype;
                if (str5 != null) {
                    str4 = str5;
                }
                sparkContext.LJJJZ("subtype", str4);
                new AnchorPublishContext(sparkContext);
                C1537900q7g c1537900q7g = C1541950qED.LIZJ;
                Fragment fragment2 = this.LLILLL;
                if (fragment2 != null) {
                    fragment = fragment2;
                }
                Context contextRequireContext = fragment.requireContext();
                c1537900q7g.getClass();
                new C1541950qED(contextRequireContext, sparkContext).LIZIZ();
                C11G7 c11g72 = this.LLJILLL;
                if (c11g72 != null) {
                    c11g72.dismiss();
                    C785410UrT.LIZ(c11g72);
                    return;
                }
                return;
            }
            Fragment fragment3 = this.LLILLL;
            if (fragment3 != null) {
                fragment = fragment3;
            }
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(fragment.getContext(), anchorPublishStruct.scheme);
            smartRouteBuildRoute.withParam("shoot_way", str);
            smartRouteBuildRoute.withParam("creation_id", str2);
            smartRouteBuildRoute.withParam("title", anchorPublishStruct.title);
            smartRouteBuildRoute.withParam("type", anchorPublishStruct.type);
            smartRouteBuildRoute.withParam("subtype", anchorPublishStruct.subtype);
            if (AnchorPublishStruct.Companion.isAnchorSourceFromNova(anchorPublishStruct.anchorSource) && anchorPublishStruct.type == enumC1430380nKG.getTYPE()) {
                z = true;
            }
            smartRouteBuildRoute.withParam("anchor_nova_source", z);
            smartRouteBuildRoute.open();
            C11G7 c11g73 = this.LLJILLL;
            if (c11g73 != null) {
                c11g73.dismiss();
                C785410UrT.LIZ(c11g73);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [X.0XSg, android.app.Dialog] */
    public final void LJIIJ(AnchorPublishStruct anchorPublishStruct) {
        IOpenPlatformService iOpenPlatformService = (IOpenPlatformService) ServiceManager.get().getService(IOpenPlatformService.class);
        Fragment fragment = this.LLILLL;
        if (fragment == null) {
            fragment = null;
        }
        Context context = fragment.getContext();
        if (context != null) {
            ?? r1 = new DialogC19728412Gs(context) { // from class: X.0XSg
                public C1390130mHL LL;

                @Override // android.app.Dialog
                public final void onBackPressed() {
                }

                @Override // X.DialogC19728412Gs, android.app.Dialog
                public final void show() throws Throwable {
                    Object obj;
                    C1390130mHL c1390130mHL = this.LL;
                    if (c1390130mHL != null) {
                        C786410Ut5.LLZ(c1390130mHL, 0);
                    }
                    C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KMumYJfBzgaHdJROkCBdNW+fPf+5t3vUbzA=", null);
                    C0WST c0wst = new C0WST();
                    Object[] objArr = new Object[0];
                    C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
                    C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "com/ss/android/ugc/aweme/tux/business/base/GlobalHookDialog", "show", this, objArr, "void", c0wzw);
                    if (c0wsuLIZIZ.LIZ) {
                        c0wst.LIZ(300000, "com/ss/android/ugc/aweme/tux/business/base/GlobalHookDialog", "show", null, objArr, this, c0wzw, false);
                        return;
                    }
                    Object[] objArr2 = c0wsuLIZIZ.LIZJ;
                    DialogC19728412Gs dialogC19728412Gs = (objArr2 == null || (obj = objArr2[0]) == null) ? this : (DialogC19728412Gs) obj;
                    super.show();
                    c0wst.LIZ(300000, "com/ss/android/ugc/aweme/tux/business/base/GlobalHookDialog", "show", null, objArr, dialogC19728412Gs, c0wzw, true);
                }

                @Override // android.app.Dialog
                public final void onCreate(Bundle bundle) {
                    super.onCreate(bundle);
                    setContentView(R.layout.p6);
                    C1390130mHL c1390130mHL = (C1390130mHL) findViewById(R.id.b0v);
                    this.LL = c1390130mHL;
                    if (c1390130mHL != null) {
                        c1390130mHL.setMessage(C20642515q3.LJI(R.string.txr));
                    }
                    C1390130mHL c1390130mHL2 = this.LL;
                    if (c1390130mHL2 != null) {
                        C786410Ut5.LLZ(c1390130mHL2, 0);
                    }
                    setCanceledOnTouchOutside(false);
                }
            };
            this.LLJJJJJIL = r1;
            r1.show();
            C785410UrT.LIZIZ(r1);
            PopupMonitorServiceImpl.LIZ.getClass();
            PopupMonitorServiceImpl.LJJJ(r1);
            C816490W1f.LIZ(r1);
            C2487409ou.LIZLLL(Mp4ScreenVideoLoadTimeout.CONTROL, new ARunnableS129S0100000_29(this, 55));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enter_from=add_link&sub_type=");
        String str = anchorPublishStruct.subtype;
        if (str == null) {
            str = "";
        }
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(anchorPublishStruct.anchorTips);
        sbLIZ2.append('&');
        sbLIZ2.append(strLIZIZ);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(anchorPublishStruct.scheme);
        sbLIZ3.append('&');
        sbLIZ3.append(strLIZIZ);
        iOpenPlatformService.LIZIZ(new C11VZ(anchorPublishStruct, this, strLIZIZ2, C2188811AlT.LIZIZ(sbLIZ3)));
        C11G7 c11g7 = this.LLJILLL;
        if (c11g7 != null) {
            c11g7.dismiss();
            C785410UrT.LIZ(c11g7);
        }
    }

    public final boolean LJIIJJI(AnchorPublishStruct anchorPublishStruct) {
        AnchorPublishPermission anchorPublishPermissionLIZ;
        int i;
        InterfaceC19511711Vj interfaceC19511711VjLJIIJ;
        IECommerceVideoService iECommerceVideoService = (IECommerceVideoService) PluggableExtentionKt.pluggableSpi$default(IECommerceVideoService.class, false, false, false, 14, null);
        if (iECommerceVideoService != null && (interfaceC19511711VjLJIIJ = iECommerceVideoService.LJIIJ()) != null) {
            anchorPublishPermissionLIZ = interfaceC19511711VjLJIIJ.LIZ();
        } else {
            anchorPublishPermissionLIZ = null;
        }
        if (this.LLJJ && anchorPublishPermissionLIZ != null) {
            if (anchorPublishPermissionLIZ.enableMultiAnchor) {
                i = 0;
            } else {
                i = 2;
            }
            this.LLJJJIL = i;
        }
        if (this.LLJJI >= 1) {
            int i2 = this.LLJJJIL;
            if (i2 != 1) {
                if (i2 == 2) {
                    return true;
                }
            } else if (!(!anchorPublishStruct.getEcIncrementalCreator())) {
                return true;
            }
        }
        return false;
    }

    public final void LJIIZILJ(AnchorPublishStruct anchorPublishStruct) {
        String strJ4;
        String string = "";
        AbstractC19511111Vd abstractC19511111Vd = null;
        if (anchorPublishStruct.type == EnumC1430380nKG.LEMON8_ANCHOR.getTYPE()) {
            try {
                Lemon8AnchorContentInfo lemon8AnchorContentInfo = (Lemon8AnchorContentInfo) C7740030o.LIZ().getGson().LJII(anchorPublishStruct.content, Lemon8AnchorContentInfo.class);
                if (lemon8AnchorContentInfo != null) {
                    AbstractC19511111Vd abstractC19511111Vd2 = this.LLILLJJLI;
                    if (abstractC19511111Vd2 != null) {
                        abstractC19511111Vd = abstractC19511111Vd2;
                    }
                    Context context = abstractC19511111Vd.getContext();
                    String selectionUrl = lemon8AnchorContentInfo.getSelectionUrl();
                    if (selectionUrl.length() != 0 && !a0.LJJIIZI(selectionUrl, "playlist_author_openid", false)) {
                        C19512311Vp.LIZ.getClass();
                        String curSecUserId = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurSecUserId();
                        if (curSecUserId == null || curSecUserId.length() == 0) {
                            strJ4 = "";
                        } else {
                            strJ4 = C786410Ut5.j4("music_resso_openid_%s", Arrays.copyOf(new Object[]{curSecUserId}, 1));
                        }
                        if (strJ4.length() != 0) {
                            string = C19512311Vp.LIZIZ.getString(strJ4, "");
                        }
                        if (string.length() != 0) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(selectionUrl);
                            sbLIZ.append("&playlist_author_openid=");
                            sbLIZ.append(string);
                            selectionUrl = C2188811AlT.LIZIZ(sbLIZ);
                        }
                    }
                    SmartRouter.buildRoute(context, selectionUrl).open();
                    return;
                }
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        if (C1067090dsJ.LIZ(anchorPublishStruct.type)) {
            try {
                Lemon8GeneralAnchorContentInfo lemon8GeneralAnchorContentInfo = (Lemon8GeneralAnchorContentInfo) C7740030o.LIZ().getGson().LJII(anchorPublishStruct.content, Lemon8GeneralAnchorContentInfo.class);
                if (lemon8GeneralAnchorContentInfo == null) {
                    return;
                }
                int i = anchorPublishStruct.type;
                String subtype = lemon8GeneralAnchorContentInfo.getSubtype();
                String strLJJIFFI = u.LJJIFFI(lemon8GeneralAnchorContentInfo.getKeyword(), "|", "·", false);
                String str = anchorPublishStruct.content;
                if (str != null) {
                    string = str;
                }
                AnchorTransData anchorTransData = new AnchorTransData(i, string, strLJJIFFI, "", 0, "", null, true, "", "", Long.MAX_VALUE, "", subtype, true, null, null, null, null, 0, -1, null, null);
                anchorTransData.setAddTime(Long.valueOf(SystemClock.elapsedRealtime()));
                LJIILL().extensionDataRepo.getUpdateAnchors().setValue(LIZLLL(anchorTransData));
                LJJIJL(1, "Lemon8 | app");
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    public final void LJIJ(AnchorPublishStruct anchorPublishStruct) {
        LifecycleOwner lifecycleOwner = this.LLILZ;
        if (lifecycleOwner == null) {
            lifecycleOwner = null;
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), C0PEM.LIZJ, null, new C19471711Fz(this, anchorPublishStruct, null), 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0084, code lost:
    
        LJIILL().extensionDataRepo.getOpenPlatformExtraUpdate().postValue("{}");
        r3 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.ss.android.ugc.aweme.creative.model.AnchorTransData> LJIJJ(java.util.List<com.ss.android.ugc.aweme.creative.model.AnchorTransData> r5) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19510811Va.LJIJJ(java.util.List):java.util.List");
    }

    public final void LJJIFFI(AnchorPublishStruct anchorPublishStruct) {
        if (anchorPublishStruct.isNew) {
            anchorPublishStruct.isNew = false;
            AnchorListManager.LIZ.getClass();
            AnchorListManager.LIZIZ();
            C11G7 c11g7 = this.LLJILLL;
            if (c11g7 != null) {
                c11g7.LJLJJI();
            }
            AnchorListManager.LJIIL(anchorPublishStruct);
            LJJJIL();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x042c A[LOOP:7: B:204:0x0426->B:206:0x042c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x017c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0274 A[EDGE_INSN: B:238:0x0274->B:110:0x0274 BREAK  A[LOOP:4: B:105:0x024f->B:240:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x02bd A[EDGE_INSN: B:241:0x02bd->B:123:0x02bd BREAK  A[LOOP:5: B:116:0x0286->B:243:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:251:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0166 A[LOOP:2: B:79:0x0160->B:81:0x0166, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01fe A[LOOP:3: B:93:0x01f8->B:95:0x01fe, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0218  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJII(android.view.View r23) {
        /*
            Method dump skipped, instruction units count: 1208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19510811Va.LJJII(android.view.View):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:154:0x033c A[PHI: r4
      0x033c: PHI (r4v2 java.util.ArrayList) = (r4v1 java.util.ArrayList), (r4v3 java.util.ArrayList) binds: [B:151:0x0337, B:153:0x033a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0366  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIII(java.util.List<com.ss.android.ugc.aweme.creative.model.AnchorTransData> r36) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 874
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19510811Va.LJJIII(java.util.List):void");
    }

    public final void LJJIIJZLJL(View view) {
        ((IBAAnchorService) ServiceManager.get().getService(IBAAnchorService.class)).LJIIL(view.getContext());
        C11G7 c11g7 = this.LLJILLL;
        if (c11g7 != null) {
            c11g7.dismiss();
            C785410UrT.LIZ(c11g7);
        }
    }

    public final void LJJIIZ(InterfaceC1107590evd interfaceC1107590evd) {
        List<Object> list;
        List<AnchorTransData> value;
        Map map;
        String string;
        int type;
        String string2;
        String string3;
        Object c098200Yq;
        Object c098200Yq2;
        String string4;
        String string5;
        Integer numLJIIJJI;
        ExtensionDataRepo extensionDataRepo;
        MutableLiveData<List<AnchorTransData>> updateAnchors;
        String string6 = interfaceC1107590evd.getString("open_platform_extra");
        LJIILL().extensionDataRepo.getOpenPlatformExtraUpdate().postValue(string6);
        InterfaceC1871920yoQ array = interfaceC1107590evd.getArray("anchors_info");
        if (array != null) {
            list = array.toList();
        } else {
            list = null;
        }
        ExtensionMisc extensionMiscLJIILL = LJIILL();
        if (extensionMiscLJIILL == null || (extensionDataRepo = extensionMiscLJIILL.extensionDataRepo) == null || (updateAnchors = extensionDataRepo.getUpdateAnchors()) == null || (value = updateAnchors.getValue()) == null) {
            value = C13BV.INSTANCE;
        }
        if (list != null) {
            Iterator<Object> it2 = list.iterator();
            while (it2.hasNext() && (map = (Map) it2.next()) != null) {
                Object obj = map.get(FollowStatusChangeMethod.PARAM_UID);
                if (obj == null || (string = obj.toString()) == null) {
                    string = "";
                }
                if (value != null) {
                    Iterator<AnchorTransData> it3 = value.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (Intrinsics.LJFF(it3.next().id, string)) {
                                break;
                            }
                        } else {
                            Object obj2 = map.get("type");
                            if (obj2 != null && (string5 = obj2.toString()) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(string5)) != null) {
                                type = numLJIIJJI.intValue();
                            } else {
                                type = EnumC1430380nKG.GAME_LIVE_PARTNER_ANCHOR.getTYPE();
                            }
                            Object obj3 = map.get("subtype");
                            if (obj3 == null || (string2 = obj3.toString()) == null) {
                                string2 = "";
                            }
                            Object obj4 = map.get("url");
                            if (obj4 == null || (string3 = obj4.toString()) == null) {
                                string3 = "";
                            }
                            try {
                                Object obj5 = map.get("extraDic");
                                if (obj5 != null) {
                                    c098200Yq = C1741890vQh.LJIIIIZZ(obj5);
                                } else {
                                    c098200Yq = null;
                                }
                                C189200o6.m2constructorimpl(c098200Yq);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c098200Yq = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq);
                            }
                            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                                c098200Yq = "{}";
                            }
                            String str = (String) c098200Yq;
                            try {
                                c098200Yq2 = new JSONObject(str);
                                C189200o6.m2constructorimpl(c098200Yq2);
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                c098200Yq2 = new C098200Yq(th2);
                                C189200o6.m2constructorimpl(c098200Yq2);
                            }
                            JSONObject jSONObject = new JSONObject();
                            if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                                c098200Yq2 = jSONObject;
                            }
                            JSONObject jSONObject2 = (JSONObject) c098200Yq2;
                            Object obj6 = map.get("keyword");
                            if (obj6 == null || (string4 = obj6.toString()) == null) {
                                string4 = "";
                            }
                            AnchorTransData anchorTransData = new AnchorTransData(type, C786410Ut5.J3(jSONObject2.put("third_id", string)), string4, "", 0, string, null, true, string3, "", Long.MAX_VALUE, str, string2, true, null, null, null, null, 0, -1, null, null);
                            anchorTransData.setAddTime(Long.valueOf(SystemClock.elapsedRealtime()));
                            LJIILL().extensionDataRepo.getUpdateAnchors().setValue(LIZIZ(anchorTransData));
                            LJ(string6);
                            this.LLJLLL = true;
                        }
                    }
                }
            }
        }
    }

    public final void LJJIJ(boolean z) {
        List<LiveEventModule> list = this.LLJL;
        if (list == null) {
            return;
        }
        if (((ArrayList) list).isEmpty()) {
            Fragment fragment = this.LLILLL;
            if (fragment == null) {
                fragment = null;
            }
            C119C.LIZIZ(fragment.getContext(), LJIILL(), "auto");
            return;
        }
        LJJJI(this, z, 1);
    }

    public final void LJJIJLIJ(C419910GdJ c419910GdJ) {
        AbstractC19511111Vd abstractC19511111Vd = this.LLILLJJLI;
        if (abstractC19511111Vd == null) {
            abstractC19511111Vd = null;
        }
        abstractC19511111Vd.setLeftIcon(c419910GdJ);
    }

    public final void LJJIL(C419910GdJ c419910GdJ) {
        AbstractC19511111Vd abstractC19511111Vd = this.LLILLJJLI;
        if (abstractC19511111Vd == null) {
            abstractC19511111Vd = null;
        }
        abstractC19511111Vd.setRightIcon(c419910GdJ);
    }

    public final boolean LJJIZ(AVMusic aVMusic) {
        InterfaceC19511711Vj interfaceC19511711VjLJIIJ;
        AnchorPublishPermission anchorPublishPermissionLIZLLL = null;
        IECommerceVideoService iECommerceVideoService = (IECommerceVideoService) PluggableExtentionKt.pluggableSpi$default(IECommerceVideoService.class, false, false, false, 14, null);
        ECAvMusic eCAvMusicLJFF = null;
        if (iECommerceVideoService != null) {
            interfaceC19511711VjLJIIJ = iECommerceVideoService.LJIIJ();
        } else {
            interfaceC19511711VjLJIIJ = null;
        }
        if (this.LLJJ) {
            if (interfaceC19511711VjLJIIJ != null) {
                anchorPublishPermissionLIZLLL = interfaceC19511711VjLJIIJ.LIZ();
            }
        } else if (interfaceC19511711VjLJIIJ != null) {
            anchorPublishPermissionLIZLLL = interfaceC19511711VjLJIIJ.LIZLLL();
        }
        IECommerceAnchorService iECommerceAnchorService = (IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class);
        if (aVMusic != null) {
            eCAvMusicLJFF = LJFF(aVMusic);
        }
        if (!iECommerceAnchorService.LJLLL(eCAvMusicLJFF) || this.LLJJIII >= 1 || this.LLJJI > 0 || (anchorPublishPermissionLIZLLL != null && !anchorPublishPermissionLIZLLL.enableShopAnchor)) {
            return true;
        }
        return false;
    }

    public final boolean LJJJJ(List<AnchorTransData> list) {
        boolean z = false;
        this.LLJJI = 0;
        this.LLJJIII = 0;
        for (AnchorTransData anchorTransData : (ArrayList) list) {
            if (((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJLJJLL().contains(Integer.valueOf(anchorTransData.businessType))) {
                this.LLJJI++;
                z = true;
            }
            if (((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJJ().contains(Integer.valueOf(anchorTransData.businessType))) {
                this.LLJJIII++;
                z = true;
            }
        }
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().setECCommerceAnchor(z);
        return z;
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void callbackAnchors(List<CreateAnchorInfo> list) {
        if (this.LLILLJJLI == null) {
            return;
        }
        Fragment fragment = this.LLILLL;
        if (fragment == null) {
            fragment = null;
        }
        C19EG activity = fragment.getActivity();
        if (activity != null) {
            activity.runOnUiThread(new ARunnableS91S0200000_22(list, this, 7));
        }
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final boolean haveAnchors(int i) {
        List<AnchorTransData> value = LJIILL().extensionDataRepo.getUpdateAnchors().getValue();
        if (value == null || value.isEmpty()) {
            return false;
        }
        Iterator<AnchorTransData> it2 = value.iterator();
        while (it2.hasNext()) {
            if (it2.next().businessType == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0554  */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r36v10 */
    /* JADX WARN: Type inference failed for: r36v11 */
    /* JADX WARN: Type inference failed for: r36v4 */
    /* JADX WARN: Type inference failed for: r36v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v126 */
    /* JADX WARN: Type inference failed for: r3v127 */
    /* JADX WARN: Type inference failed for: r3v86, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r3v88 */
    /* JADX WARN: Type inference failed for: r3v97, types: [X.11Vd] */
    /* JADX WARN: Type inference failed for: r3v98 */
    /* JADX WARN: Type inference failed for: r4v42, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v44, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r4v63 */
    @Override // X.InterfaceC1141530foN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mh2(X.C262100zr r57) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19510811Va.mh2(X.00zr):void");
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void observeClick(Function0<Unit> function0) {
        this.LLJLIL.observeForever(new AObserverS228S0100000_26(function0, 3));
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onAsyncAnchor(C1799610wvn c1799610wvn) {
        AnchorTransData anchorTransData;
        if (c1799610wvn != null && (anchorTransData = c1799610wvn.LIZ) != null) {
            LJIIIIZZ(anchorTransData);
        }
        C11G7 c11g7 = this.LLJILLL;
        if (c11g7 != null) {
            c11g7.dismiss();
            C785410UrT.LIZ(c11g7);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onAsyncRemoveAnchor(C0YUS c0yus) {
        ArrayList arrayList = new ArrayList();
        List<AnchorTransData> value = LJIILL().extensionDataRepo.getUpdateAnchors().getValue();
        if (value != null) {
            ArrayList arrayList2 = new ArrayList();
            for (AnchorTransData anchorTransData : value) {
                if (anchorTransData.businessType != c0yus.LIZ) {
                    arrayList2.add(anchorTransData);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
        LJIILL().extensionDataRepo.getUpdateAnchors().setValue(LJII(arrayList));
        C11G7 c11g7 = this.LLJILLL;
        if (c11g7 != null) {
            c11g7.dismiss();
            C785410UrT.LIZ(c11g7);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onBackPressed(PublishOutput publishOutput) {
        IAVPublishExtension.DefaultImpls.onBackPressed(this, publishOutput);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onJsBroacastReceiver(C484220Iyq c484220Iyq) {
        C11G7 c11g7;
        C11G7 c11g72;
        C11G7 c11g73;
        try {
            String string = JSONObjectProtectorUtils.getString(c484220Iyq.LIZ, "eventName");
            if (string != null) {
                int iHashCode = string.hashCode();
                if (iHashCode != -1482957736) {
                    if (iHashCode != 972249363) {
                        if (iHashCode == 1746687142 && string.equals("leadsGenStatusChangeNotification") && GetLeadsAnchorService.LJ().LIZIZ(c484220Iyq.LIZ) && (c11g73 = this.LLJILLL) != null) {
                            c11g73.LJLJJLL();
                        }
                    } else if (string.equals("enterGetLeadsPageNotification") && GetLeadsAnchorService.LJ().LIZLLL(c484220Iyq.LIZ) && (c11g72 = this.LLJILLL) != null) {
                        c11g72.LJLJJLL();
                    }
                } else if (string.equals("closeLeadForm") && GetLeadsAnchorService.LJ().LIZJ(5) && (c11g7 = this.LLJILLL) != null) {
                    c11g7.LJLJJLL();
                }
            }
            String string2 = JSONObjectProtectorUtils.getString(c484220Iyq.LIZ, "eventName");
            if (Intrinsics.LJFF(string2, "anchor_merch_pick_content") && string2 != null && c484220Iyq.LIZ.has("data")) {
                String strOptString = c484220Iyq.LIZ.optString("data");
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("jsb_param", strOptString);
                c2344009Gk.LJIIIIZZ("where", "MultiAnchorPublishExtension");
                C20684815ws.LJIILLIIL("rd_tiktokec_shop_anchor_jsb_add_event", c2344009Gk.LIZ);
                JSONObject jSONObject = new JSONObject(strOptString);
                int iOptInt = jSONObject.optInt("type", EnumC1430380nKG.ANCHOR_SHOP_LINK.getTYPE());
                String strOptString2 = jSONObject.optString("keyword", "");
                String strOptString3 = jSONObject.optString("subtype", "");
                String strOptString4 = jSONObject.optString("url", "");
                String strOptString5 = jSONObject.optString("anchor_content", "");
                AnchorTransData anchorTransData = new AnchorTransData(iOptInt, strOptString, strOptString2, "", 1, "", null, true, strOptString4, "", Long.valueOf(SystemClock.elapsedRealtime()), "", strOptString3, true, null, null, null, null, 0, -1, null, null);
                if (strOptString5.length() > 0) {
                    anchorTransData.setAnchorContent(strOptString5);
                }
                if (C294110Bft.LIZIZ()) {
                    LJIILL().extensionDataRepo.getUpdateAnchors().setValue(new ArrayList());
                }
                LJIILL().extensionDataRepo.getUpdateAnchors().setValue(LIZIZ(anchorTransData));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            c2344009Gk2.LJIIIIZZ("e_stack_trace", C08KI.LIZ(e));
            c2344009Gk2.LJ(c484220Iyq.LIZ, "extra_data");
            c2344009Gk2.LJIIIIZZ("where", "MultiAnchorPublishExtension");
            C20684815ws.LJIILLIIL("rd_tiktokec_shop_anchor_exception", c2344009Gk2.LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onJumpToShootFromFypWithPoiData(PoiData poiData) {
        IAVPublishExtension.DefaultImpls.onJumpToShootFromFypWithPoiData(this, poiData);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onPublish(PublishOutput publishOutput) {
        IAVPublishExtension.DefaultImpls.onPublish(this, publishOutput);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onSaveDraft(PublishOutput publishOutput) {
        IAVPublishExtension.DefaultImpls.onSaveDraft(this, publishOutput);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void registerOnAddAnchorListener(Function0<Unit> function0) {
        ((ArrayList) this.LLJJIJIL).add(function0);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void registerOnRemoveAnchorListener(Function1<? super Integer, Unit> function1) {
        ((ArrayList) this.LLJJJ).add(function1);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void unregisterOnAddAnchorListener(Function0<Unit> function0) {
        ((ArrayList) this.LLJJIJIL).remove(function0);
    }

    public static final boolean LJIJI(Integer num, List<AnchorPublishStruct> list) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator<AnchorPublishStruct> it2 = list.iterator();
        while (it2.hasNext()) {
            int i = it2.next().type;
            if (num != null && i == num.intValue()) {
                return true;
            }
        }
        return false;
    }

    public final void LJIILIIL(AnchorPublishStruct anchorPublishStruct, String str) {
        if (anchorPublishStruct.isNew) {
            anchorPublishStruct.isNew = false;
            AnchorListManager.LIZ.getClass();
            AnchorListManager.LIZIZ();
            C11G7 c11g7 = this.LLJILLL;
            if (c11g7 != null) {
                c11g7.LJLJJI();
            }
            AnchorListManager.LJIIL(anchorPublishStruct);
            LJJJIL();
        }
        String str2 = LJIILL().mobParam.shootWay;
        String str3 = LJIILL().mobParam.creationId;
        Fragment fragment = this.LLILLL;
        if (fragment == null) {
            fragment = null;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(fragment.getContext(), str);
        smartRouteBuildRoute.withParam("shoot_way", str2);
        smartRouteBuildRoute.withParam("creation_id", str3);
        smartRouteBuildRoute.withParam("title", anchorPublishStruct.title);
        smartRouteBuildRoute.withParam("type", anchorPublishStruct.type);
        smartRouteBuildRoute.withParam("subtype", anchorPublishStruct.subtype);
        smartRouteBuildRoute.open();
        C11G7 c11g72 = this.LLJILLL;
        if (c11g72 != null) {
            c11g72.dismiss();
            C785410UrT.LIZ(c11g72);
        }
    }

    public final void LJJI(String str, String str2) {
        Collection collectionValues;
        Object next;
        String str3 = LJIILL().mobParam.creationId;
        AnchorListManager.LIZ.getClass();
        Map mapLJII = AnchorListManager.LJII();
        String str4 = null;
        if (mapLJII != null && (collectionValues = mapLJII.values()) != null) {
            Iterator it2 = collectionValues.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (((AnchorPublishStruct) next).type == EnumC1430380nKG.LIVE_EVENT.getTYPE()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            AnchorPublishStruct anchorPublishStruct = (AnchorPublishStruct) next;
            if (anchorPublishStruct != null) {
                str4 = anchorPublishStruct.logExtra;
            }
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("anchor_entry", str);
        c2344009Gk.LJIIIIZZ("enter_from", "video_post_page");
        c2344009Gk.LJIIIIZZ("shoot_way", "live_event");
        c2344009Gk.LJIIIIZZ("creation_id", str3);
        c2344009Gk.LJIIIIZZ("live_event_id", str2);
        c2344009Gk.LIZJ(1, "is_auto");
        LIZ(c2344009Gk);
        if (str4 != null && str4.length() != 0) {
            JSONObject jSONObject = new JSONObject(str4);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next2 = itKeys.next();
                c2344009Gk.LJFF(next2, jSONObject.get(next2).toString());
            }
        }
        C20684815ws.LJIILLIIL("choose_anchor", c2344009Gk.LIZ);
    }

    public final void LJJIIJ(AnchorPublishStruct anchorPublishStruct, View view) {
        ((IBAAnchorService) ServiceManager.get().getService(IBAAnchorService.class)).LIZJ(anchorPublishStruct.baProductLinkState, view.getContext(), new AwS573S0100000_29(this, 145));
    }

    public final void LJJIIZI(AnchorPublishStruct anchorPublishStruct, View view) {
        ((IBAAnchorService) ServiceManager.get().getService(IBAAnchorService.class)).LJIIIIZZ(anchorPublishStruct.getLeadsAnchorState, view.getContext(), new AwS273S0300000_29(view, anchorPublishStruct, this, 4), new AwS573S0100000_29(this, 146));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0273  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJIL(java.util.List<com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct> r32, java.util.List<com.ss.android.ugc.aweme.creative.model.AnchorTransData> r33) {
        /*
            Method dump skipped, instruction units count: 701
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19510811Va.LJJIJIIJIL(java.util.List, java.util.List):void");
    }

    public final void LJJIJL(int i, String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("anchor_type", "Lemon8");
        c2344009Gk.LJIIIIZZ("anchor_name", str);
        c2344009Gk.LIZJ(i, "is_auto_choose");
        LIZ(c2344009Gk);
        C20684815ws.LJIILLIIL("choose_anchor", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onAddHashTag(String str, List<? extends TextExtraStruct> list) {
        IAVPublishExtension.DefaultImpls.onAddHashTag(this, str, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:175:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0760  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0813  */
    /* JADX WARN: Removed duplicated region for block: B:469:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b1  */
    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindOptionView(androidx.fragment.app.Fragment r58, android.view.View r59) {
        /*
            Method dump skipped, instruction units count: 2104
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19510811Va.onBindOptionView(androidx.fragment.app.Fragment, android.view.View):void");
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onExtensionEnable(Map<AVPublishExtensionBiz, ? extends AVPublishExtensionVisible> map, boolean z) {
        IAVPublishExtension.DefaultImpls.onExtensionEnable(this, map, z);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onSoftKeyboardHide(String str, List<? extends TextExtraStruct> list) {
        IAVPublishExtension.DefaultImpls.onSoftKeyboardHide(this, str, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032 A[PHI: r4
      0x0032: PHI (r4v1 com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct) = 
      (r4v0 com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct)
      (r4v7 com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct)
     binds: [B:3:0x0006, B:14:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIJIL(X.C19510811Va r5, int r6, com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct r7) {
        /*
            r4 = r7
            r2 = r5
            r2.getClass()
            r5 = 0
            if (r4 != 0) goto L32
            com.ss.android.ugc.aweme.base.AnchorListManager r0 = com.ss.android.ugc.aweme.base.AnchorListManager.LIZ
            r0.getClass()
            java.util.Map r0 = com.ss.android.ugc.aweme.base.AnchorListManager.LJII()
            if (r0 == 0) goto L4f
            java.util.Collection r0 = r0.values()
            if (r0 == 0) goto L4f
            java.util.Iterator r1 = r0.iterator()
        L1d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L4d
            java.lang.Object r4 = r1.next()
            r0 = r4
            com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct r0 = (com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct) r0
            int r0 = r0.type
            if (r0 != r6) goto L1d
        L2e:
            com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct r4 = (com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct) r4
            if (r4 == 0) goto L3d
        L32:
            com.ss.android.ugc.aweme.base.AnchorListManager r0 = com.ss.android.ugc.aweme.base.AnchorListManager.LIZ
            r0.getClass()
            java.lang.String r3 = com.ss.android.ugc.aweme.base.AnchorListManager.LJIIIIZZ(r4)
            if (r3 != 0) goto L3f
        L3d:
            java.lang.String r3 = ""
        L3f:
            java.util.concurrent.ExecutorService r0 = X.C20684815ws.LJFF()
            Y.ARunnableS21S1300000_27 r1 = new Y.ARunnableS21S1300000_27
            r6 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            r0.submit(r1)
            return
        L4d:
            r4 = r5
            goto L2e
        L4f:
            r4 = r5
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19510811Va.LJJIJIL(X.11Va, int, com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct):void");
    }

    public static void LJJJ(Context context, int i, int i2) {
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LJFF(i);
        c1397580mTM.LIZ(i2);
        C985403tE.LIZ(c1397580mTM, new AwS41S0001000_29(0));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    public static void LJJJI(C19510811Va c19510811Va, boolean z, int i) {
        int i2;
        ILiveOuterService iLiveOuterService;
        ILiveEventOuterService iLiveEventOuterServiceK5;
        if ((i & 1) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        List<LiveEventModule> list = c19510811Va.LLJL;
        if (list != null && (iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)) != null && (iLiveEventOuterServiceK5 = iLiveOuterService.K5()) != null) {
            Fragment fragment = c19510811Va.LLILLL;
            if (fragment == null) {
                fragment = null;
            }
            iLiveEventOuterServiceK5.showLiveEventSelectionDialog(fragment.getContext(), GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, list), true, 0.5f, i2, new AwS464S0200000_29((List) list, (List<LiveEventModule>) c19510811Va, (C19510811Va) 1), new AwS643S0100000_29(c19510811Va, 19), new AwS643S0100000_29(c19510811Va, 21), AFwS273S0000000_29.get$arr$(38));
            if (!z) {
                C1206830hVh c1206830hVh = C1206830hVh.LIZ;
                int size = ((ArrayList) list).size();
                ExtensionMisc extensionMiscLJIILL = c19510811Va.LJIILL();
                c1206830hVh.getClass();
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJII(C1206830hVh.LIZ(extensionMiscLJIILL));
                c2344009Gk.LJIIIIZZ("promote_type", "anchor");
                c2344009Gk.LIZJ(size, "active_event_num");
                c2344009Gk.LJIIIIZZ("anchor_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
                C20684815ws.LJIILLIIL("livesdk_live_event_quickcreate_list_show", c2344009Gk.LIZ);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onActivityResult(int i, int i2, Intent intent) {
        IAVPublishExtension.DefaultImpls.onActivityResult(this, i, i2, intent);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final View onCreateOptionView(Context context, ViewGroup viewGroup, View view) {
        AbstractC19511111Vd c19471511Fx;
        Context context2;
        boolean zLJFF;
        ExtensionDataRepo extensionDataRepo;
        MutableLiveData<Boolean> mutableLiveDataIsFromCreateTemplate;
        if (view instanceof AbstractC19511111Vd) {
            c19471511Fx = (AbstractC19511111Vd) view;
        } else {
            ExtensionMisc extensionMiscLJIILL = LJIILL();
            if (extensionMiscLJIILL != null && (context2 = extensionMiscLJIILL.sceneContext) != null) {
                context = context2;
            }
            if (C294110Bft.LIZIZ()) {
                c19471511Fx = new C19471611Fy(context);
            } else {
                c19471511Fx = new C19471511Fx(context);
            }
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19471511Fx);
            c19471511Fx.setLayoutParams(layoutParams);
        }
        this.LLILLJJLI = c19471511Fx;
        ExtensionMisc extensionMiscLJIILL2 = LJIILL();
        if (extensionMiscLJIILL2 != null && (extensionDataRepo = extensionMiscLJIILL2.extensionDataRepo) != null && (mutableLiveDataIsFromCreateTemplate = extensionDataRepo.isFromCreateTemplate()) != null) {
            zLJFF = Intrinsics.LJFF(mutableLiveDataIsFromCreateTemplate.getValue(), Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        if (zLJFF) {
            AbstractC19511111Vd abstractC19511111Vd = this.LLILLJJLI;
            if (abstractC19511111Vd == null) {
                abstractC19511111Vd = null;
            }
            abstractC19511111Vd.setClickable(false);
            AbstractC19511111Vd abstractC19511111Vd2 = this.LLILLJJLI;
            if (abstractC19511111Vd2 == null) {
                abstractC19511111Vd2 = null;
            }
            abstractC19511111Vd2.setEnabled(false);
            AbstractC19511111Vd abstractC19511111Vd3 = this.LLILLJJLI;
            if (abstractC19511111Vd3 == null) {
                abstractC19511111Vd3 = null;
            }
            abstractC19511111Vd3.LJFF();
            AbstractC19511111Vd abstractC19511111Vd4 = this.LLILLJJLI;
            if (abstractC19511111Vd4 == null) {
                abstractC19511111Vd4 = null;
            }
            abstractC19511111Vd4.LIZ();
            AbstractC19511111Vd abstractC19511111Vd5 = this.LLILLJJLI;
            if (abstractC19511111Vd5 == null) {
                abstractC19511111Vd5 = null;
            }
            abstractC19511111Vd5.setDisableClickListener(AFwS218S0000000_29.get$arr$(93));
            AbstractC19511111Vd abstractC19511111Vd6 = this.LLILLJJLI;
            if (abstractC19511111Vd6 == null) {
                abstractC19511111Vd6 = null;
            }
            abstractC19511111Vd6.setFromCreateTemplate(true);
        } else {
            AbstractC19511111Vd abstractC19511111Vd7 = this.LLILLJJLI;
            if (abstractC19511111Vd7 == null) {
                abstractC19511111Vd7 = null;
            }
            AnchorListManager.LIZ.getClass();
            abstractC19511111Vd7.setClickable(true ^ ((ArrayList) AnchorListManager.LJI()).isEmpty());
            AbstractC19511111Vd abstractC19511111Vd8 = this.LLILLJJLI;
            if (abstractC19511111Vd8 == null) {
                abstractC19511111Vd8 = null;
            }
            abstractC19511111Vd8.setOnAddClickListener(new C19511311Vf(this));
            AbstractC19511111Vd abstractC19511111Vd9 = this.LLILLJJLI;
            if (abstractC19511111Vd9 == null) {
                abstractC19511111Vd9 = null;
            }
            abstractC19511111Vd9.setOnAddClickListener(new AwS608S0100000_29(this, 134));
        }
        IAVPublishPageUIRefactorService iAVPublishPageUIRefactorServiceLJIILLIIL = LJIILLIIL();
        if (iAVPublishPageUIRefactorServiceLJIILLIIL != null) {
            if (iAVPublishPageUIRefactorServiceLJIILLIIL.isRefactorNewUserAddLinkGuideEnable()) {
                this.LLJLILLLLZIIL = false;
            }
            if (iAVPublishPageUIRefactorServiceLJIILLIIL.enableRefactorAddLinkECommerceGuide()) {
                AbstractC19511111Vd abstractC19511111Vd10 = this.LLILLJJLI;
                if (abstractC19511111Vd10 == null) {
                    abstractC19511111Vd10 = null;
                }
                abstractC19511111Vd10.LIZ();
            }
        }
        AbstractC19511111Vd abstractC19511111Vd11 = this.LLILLJJLI;
        if (abstractC19511111Vd11 == null) {
            return null;
        }
        return abstractC19511111Vd11;
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onJumpToShootFromLynxWithPoiData(PoiData poiData, Integer num, String str) {
        IAVPublishExtension.DefaultImpls.onJumpToShootFromLynxWithPoiData(this, poiData, num, str);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onCreate(Fragment fragment, View view, LifecycleOwner lifecycleOwner, Bundle bundle, AVPublishContentType aVPublishContentType, PublishOutput publishOutput, ExtensionMisc extensionMisc, IAVPublishExtension.Callback callback, View view2) {
        onCreateMultiViewPublish(fragment, view, lifecycleOwner, bundle, aVPublishContentType, publishOutput, null, null, extensionMisc, callback, view2);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onCreateMultiViewPublish(final Fragment fragment, View view, final LifecycleOwner lifecycleOwner, Bundle bundle, AVPublishContentType aVPublishContentType, PublishOutput publishOutput, List<UploadableDraftEffect> list, List<UploadableMobileEffect> list2, final ExtensionMisc extensionMisc, final IAVPublishExtension.Callback callback, View view2) {
        InterfaceC19511711Vj interfaceC19511711VjLJIIJ;
        this.LLILLL = fragment;
        this.LLILZIL = view;
        this.LLILZ = lifecycleOwner;
        this.LLILZLL = extensionMisc;
        this.LLIZ = aVPublishContentType;
        this.LLIZLLLIL = publishOutput;
        this.LLJJ = extensionMisc.isImageMode();
        IECommerceVideoService iECommerceVideoService = (IECommerceVideoService) PluggableExtentionKt.pluggableSpi$default(IECommerceVideoService.class, false, false, false, 14, null);
        if (iECommerceVideoService != null && (interfaceC19511711VjLJIIJ = iECommerceVideoService.LJIIJ()) != null) {
            interfaceC19511711VjLJIIJ.LIZJ();
        }
        this.LLJJJIL = ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJLJLLL();
        this.LLJJJJLIIL = list;
        this.LLJJL = list2;
        this.LLJLLIL = callback;
        extensionMisc.extensionDataRepo.getUpdateAnchors().observe(lifecycleOwner, new Observer() { // from class: X.11Vc
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:45:0x0129  */
            /* JADX WARN: Removed duplicated region for block: B:70:0x0177  */
            /* JADX WARN: Type inference failed for: r1v5, types: [X.11Vn] */
            @Override // androidx.lifecycle.Observer
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onChanged(java.lang.Object r23) throws org.json.JSONException {
                /*
                    Method dump skipped, instruction units count: 927
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C19511011Vc.onChanged(java.lang.Object):void");
            }
        });
    }
}
