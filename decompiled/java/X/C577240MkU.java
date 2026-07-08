package X;

import Y.ACallableS13S0010000_8;
import Y.AObjectS241S0100000_8;
import Y.AObjectS303S0200000_8;
import Y.AObserverS212S0100000_8;
import Y.AfS177S0100000_8;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.commerce.tools.mission.service.ICommerceToolsMissionService;
import com.ss.android.ugc.aweme.creative.model.RecordEffectModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.editeffect.EditEffectAnchorManager;
import com.ss.android.ugc.aweme.services.editeffect.EffectAnchorServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.aweme.shortvideo.d4;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.RecordPageOptionalConfig;
import com.ss.android.ugc.aweme.shortvideo.mediaselector.experiments.EnablePrivateAlbumWithoutPermissionExperiment;
import com.ss.android.ugc.aweme.shortvideo.mediaselector.experiments.PrivateAlbumKeepSecondaryPopupExperiment;
import com.ss.android.ugc.aweme.shortvideo.mediaselector.experiments.PrivateAlbumPartialAuthorizationBottomCTAExperiment;
import com.ss.android.ugc.aweme.shortvideo.mediaselector.experiments.PrivateAlbumSelectPhotosPopupCTAExperiment;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.ui.task.PreloadBitmapTask;
import com.ss.android.ugc.aweme.shortvideo.util.performance.OpenAlbumPanelPerformanceMonitor;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.EnterStoryParam;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.SocMediaPickerService;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editorpro.creationflow.album.EditorProAlbumService;
import com.ss.android.ugc.gamora.recorder.bottom.IBottomTabChangeService;
import com.ss.android.ugc.gamora.recorder.control.h;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import lnn.q;

/* JADX INFO: renamed from: X.0MkU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C577240MkU extends AbstractC2255721DQs<InterfaceC1648870t0f> implements InterfaceC1648870t0f, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] $$delegatedProperties;
    public static final int $stable;
    public ChooseMediaViewModel chooseMediaViewModel;
    public final C1DRG diContainer;
    public EditEffectAnchorManager editEffectAnchorManager;
    public boolean hasTriggeredBitmapPreloadOnAlbumClick;
    public InterfaceC420801kM hideShowChooseMediaPageStateStateDisposable;
    public boolean isCameraOpenedFromAlbum;
    public final C19A3 parentScene;
    public final InterfaceC1731706qJ activity$delegate = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
    public final InterfaceC1731706qJ avListenableActivityBehaviorRegistry$delegate = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC577370Mkh.class, null);
    public final InterfaceC1731706qJ planCUIApiComponent$delegate = C1664770tQJ.LIZ(getDiContainer(), a.class, null);
    public final InterfaceC1731706qJ recordControlApi$delegate = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648570t0B.class, null);
    public final InterfaceC1731706qJ recordModeApi$delegate = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1621970sJH.class, null);
    public final InterfaceC1731706qJ stickerApiComponent$delegate = C1664770tQJ.LIZIZ(getDiContainer(), q.class, null);
    public final InterfaceC1731706qJ shortVideoContext$delegate = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final InterfaceC1731706qJ cameraApiComponent$delegate = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650230t2r.class, null);
    public final InterfaceC1731706qJ toolbarApi$delegate = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1651080t4E.class, null);
    public final InterfaceC1731706qJ recordPermissionApiComponent$delegate = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1652190t61.class, null);
    public final InterfaceC1731706qJ infiniStickerApi$delegate = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1647520syU.class, null);
    public final InterfaceC1731706qJ recordAdapterApi$delegate = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1647420syK.class, null);
    public final InterfaceC1731706qJ singleSongMusicLoadApi$delegate = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC577340Mke.class, null);
    public final InterfaceC1648870t0f apiComponent = this;
    public final h0<Integer> effectContainerVisibility = new h0<>(8);
    public final C560530Lyd<Unit> dismissSuperEntranceEvent = new C560530Lyd<>();
    public final C560530Lyd<Unit> dismissUploadPopEntranceEvent = new C560530Lyd<>();
    public final h0<Integer> uploadVisibility = new h0<>(8);
    public final C560530Lyd<Unit> needNoTouchListener = new C560530Lyd<>();
    public final MutableLiveData<String> effectCoverImageUrl = new MutableLiveData<>("");
    public final C11NJ compositeDisposable = new C11NJ();
    public C11NJ albumJediCompositeDisposable = new C11NJ();
    public final List<String> bottomTabAllowList = Collections.singletonList(EnumC1647570syZ.RECORD_COMBINE_180.getTag());
    public final C01GW isFullHorizontalCarrouselStyle$delegate = C452501pT.LIZIZ(new AwS552S0100000_8(this, 702));
    public long clickAlbumIconTime = -1;
    public int layoutResId = R.id.sz5;
    public final C01GW fromExteriorRecordScene$delegate = C452501pT.LIZIZ(new AwS552S0100000_8(this, 698));
    public final C01GW hideEffectEntrance$delegate = C452501pT.LIZIZ(new AwS552S0100000_8(this, OppoPermissionPopupMaskDelayExp.DEFAULT));
    public final C01GW hideUploadEntrance$delegate = C452501pT.LIZIZ(new AwS552S0100000_8(this, 701));
    public final C01GW shouldUseOneSideDockBar$delegate = C452501pT.LIZIZ(new AwS552S0100000_8(this, 709));
    public final C01GW oneSideRecordDockBarScene$delegate = C452501pT.LIZIZ(new AwS552S0100000_8(this, 708));
    public final C01GW recordDockBarScene$delegate = C452501pT.LIZIZ(new AwS552S0100000_8(this, 710));
    public final C01GW fullHorizontalCarrouselRecordDockBarScene$delegate = C452501pT.LIZIZ(new AwS552S0100000_8(this, 699));
    public final InterfaceC2253351DHp externalOnInfoCallback = new InterfaceC2253351DHp() { // from class: X.0MkV
        @Override // X.InterfaceC2253351DHp
        public final void LIZ(int i) {
            if (i != 108) {
                if (i == 120) {
                    q stickerApiComponent = this.LIZ.getStickerApiComponent();
                    if (stickerApiComponent != null) {
                        stickerApiComponent.N32();
                    }
                    this.LIZ.getCameraApiComponent().St2().getCameraController().Y3(this);
                    return;
                }
                return;
            }
            q stickerApiComponent2 = this.LIZ.getStickerApiComponent();
            if (stickerApiComponent2 == null) {
                return;
            }
            stickerApiComponent2.fP();
        }
    };
    public final C577290MkZ onTouchEventListener = new InterfaceC1655700tBg() { // from class: X.0MkZ
        @Override // X.InterfaceC1655700tBg
        public final void dispatchTouchEvent(MotionEvent motionEvent) {
            if (motionEvent != null && motionEvent.getAction() == 0) {
                this.LIZ.dismissSuperEntranceEvent();
                this.LIZ.dismissUploadPopEntranceEvent();
                this.LIZ.dismissLivePopupEvent();
            }
        }
    };
    public final C385670FAf<Boolean> albumPageVisibilityState = new h0(Boolean.FALSE);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C577240MkU.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C577240MkU.class, "avListenableActivityBehaviorRegistry", "getAvListenableActivityBehaviorRegistry()Lcom/ss/android/ugc/aweme/saa/activity/AVListenableActivityBehaviorRegistry;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C577240MkU.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C577240MkU.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C577240MkU.class, "recordModeApi", "getRecordModeApi()Lcom/ss/android/ugc/aweme/shortvideo/ui/component/RecordModeApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C577240MkU.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C577240MkU.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C577240MkU.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(C577240MkU.class, "toolbarApi", "getToolbarApi()Lcom/ss/android/ugc/gamora/recorder/toolbar/refactory/ToolbarApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS10 = new C2217381BqS(C577240MkU.class, "recordPermissionApiComponent", "getRecordPermissionApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/ui/permissionmanager/RecordPermissionUIApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS11 = new C2217381BqS(C577240MkU.class, "infiniStickerApi", "getInfiniStickerApi()Lcom/ss/android/ugc/aweme/infinisticker/RecordInfiniStickerApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS12 = new C2217381BqS(C577240MkU.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS13 = new C2217381BqS(C577240MkU.class, "singleSongMusicLoadApi", "getSingleSongMusicLoadApi()Lcom/ss/android/ugc/gamora/recorder/choosemusic/SingleSongMusicLoadComponentApi;", 0);
        c09r3.getClass();
        $$delegatedProperties = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9, c2217381BqS10, c2217381BqS11, c2217381BqS12, c2217381BqS13};
        $stable = 8;
    }

    private final C19EG getActivity() {
        return (C19EG) this.activity$delegate.getValue(this, $$delegatedProperties[0]);
    }

    private final boolean getFromExteriorRecordScene() {
        return ((Boolean) this.fromExteriorRecordScene$delegate.getValue()).booleanValue();
    }

    private final h getFullHorizontalCarrouselRecordDockBarScene() {
        return (h) this.fullHorizontalCarrouselRecordDockBarScene$delegate.getValue();
    }

    private final boolean getHideEffectEntrance() {
        return ((Boolean) this.hideEffectEntrance$delegate.getValue()).booleanValue();
    }

    private final boolean getHideUploadEntrance() {
        return ((Boolean) this.hideUploadEntrance$delegate.getValue()).booleanValue();
    }

    private final InterfaceC1647520syU getInfiniStickerApi() {
        return (InterfaceC1647520syU) this.infiniStickerApi$delegate.getValue(this, $$delegatedProperties[10]);
    }

    private final C1642080spi getOneSideRecordDockBarScene() {
        return (C1642080spi) this.oneSideRecordDockBarScene$delegate.getValue();
    }

    private final InterfaceC1647420syK getRecordAdapterApi() {
        return (InterfaceC1647420syK) this.recordAdapterApi$delegate.getValue(this, $$delegatedProperties[11]);
    }

    private final InterfaceC1621970sJH getRecordModeApi() {
        return (InterfaceC1621970sJH) this.recordModeApi$delegate.getValue(this, $$delegatedProperties[4]);
    }

    private final boolean getShouldUseOneSideDockBar() {
        return ((Boolean) this.shouldUseOneSideDockBar$delegate.getValue()).booleanValue();
    }

    private final InterfaceC577340Mke getSingleSongMusicLoadApi() {
        return (InterfaceC577340Mke) this.singleSongMusicLoadApi$delegate.getValue(this, $$delegatedProperties[12]);
    }

    private final InterfaceC1651080t4E getToolbarApi() {
        return (InterfaceC1651080t4E) this.toolbarApi$delegate.getValue(this, $$delegatedProperties[8]);
    }

    private final boolean isFullHorizontalCarrouselStyle() {
        return ((Boolean) this.isFullHorizontalCarrouselStyle$delegate.getValue()).booleanValue();
    }

    private final void setupForEditEffect() {
        String string;
        Bundle bundleLIZIZ = C565520MFy.LIZIZ(this.parentScene);
        if (bundleLIZIZ == null || (string = bundleLIZIZ.getString("extra_edit_effect_uid")) == null) {
            return;
        }
        this.editEffectAnchorManager = EffectAnchorServiceImpl.createIEffectAnchorServicebyMonsterPlugin(false).getData(string);
    }

    @Override // X.InterfaceC1648870t0f
    public void dismissSuperEntranceEvent() {
        this.dismissSuperEntranceEvent.LJIIJ(Unit.LIZ);
    }

    @Override // X.InterfaceC1648870t0f
    public void dismissUploadPopEntranceEvent() {
        this.dismissUploadPopEntranceEvent.LJIIJ(Unit.LIZ);
    }

    public final InterfaceC577370Mkh getAvListenableActivityBehaviorRegistry() {
        return (InterfaceC577370Mkh) this.avListenableActivityBehaviorRegistry$delegate.getValue(this, $$delegatedProperties[1]);
    }

    public final InterfaceC1650230t2r getCameraApiComponent() {
        return (InterfaceC1650230t2r) this.cameraApiComponent$delegate.getValue(this, $$delegatedProperties[7]);
    }

    public final a getPlanCUIApiComponent() {
        return (a) this.planCUIApiComponent$delegate.getValue(this, $$delegatedProperties[2]);
    }

    public final InterfaceC1648570t0B getRecordControlApi() {
        return (InterfaceC1648570t0B) this.recordControlApi$delegate.getValue(this, $$delegatedProperties[3]);
    }

    public final InterfaceC1652190t61 getRecordPermissionApiComponent() {
        return (InterfaceC1652190t61) this.recordPermissionApiComponent$delegate.getValue(this, $$delegatedProperties[9]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.shortVideoContext$delegate.getValue(this, $$delegatedProperties[6]);
    }

    public final q getStickerApiComponent() {
        return (q) this.stickerApiComponent$delegate.getValue(this, $$delegatedProperties[5]);
    }

    public final void hideUploadAndEffect() {
        setUploadVisibility(8);
        setEffectContainerVisibility(8);
    }

    private final void asyncLoadXml() {
        if (C297760Blm.LIZ()) {
            C523380Kfo.LIZ(C1664590tQ1.LJIIIZ(this), C297780Blo.LIZ());
        }
    }

    private final void registerObservers() {
        C098D c098dLJJJJZ;
        C11NZ<Effect> c11nzH70;
        InterfaceC1624480sNK interfaceC1624480sNKC0;
        InterfaceC1625470sOv interfaceC1625470sOvLJII;
        MutableLiveData mutableLiveDataLJIJJLI;
        C385670FAf<Boolean> c385670FAfNR1;
        C385670FAf<Boolean> c385670FAfL00;
        C385670FAf<Boolean> c385670FAfP7;
        C385670FAf<Boolean> c385670FAfCP1;
        if (C343070Dcf.LIZJ(getDiContainer())) {
            if (getPlanCUIApiComponent().US().LIZJ().floatValue() < 1.0f) {
                View view = m31getRecordDockBarScene().mView;
                if (view != null) {
                    view.setLayerType(2, null);
                }
                getPlanCUIApiComponent().Z40().LIZ(this, new AObjectS241S0100000_8(this, 55));
            }
            getPlanCUIApiComponent().US().LIZ(this, new AObjectS241S0100000_8(this, 56));
        }
        getRecordControlApi().xk1().LJ(this, new AObjectS241S0100000_8(this, 57));
        getPlanCUIApiComponent().RS().LIZ(this, new AObjectS241S0100000_8(this, 58));
        getPlanCUIApiComponent().Cg1().LIZ(this, new AObjectS241S0100000_8(this, 59));
        getRecordControlApi().xM2().LIZ(this, new AObjectS241S0100000_8(this, 60));
        getRecordControlApi().zx2().LIZ(this, new AObjectS241S0100000_8(this, 61));
        InterfaceC1621970sJH recordModeApi = getRecordModeApi();
        if (recordModeApi != null && (c385670FAfCP1 = recordModeApi.CP1()) != null) {
            c385670FAfCP1.LIZ(this, new AObjectS241S0100000_8(this, 62));
        }
        InterfaceC1652190t61 recordPermissionApiComponent = getRecordPermissionApiComponent();
        if (recordPermissionApiComponent != null && (c385670FAfP7 = recordPermissionApiComponent.P7()) != null) {
            c385670FAfP7.LIZ(this, new AObjectS241S0100000_8(this, 63));
        }
        C1DRG diContainer = getDiContainer();
        if (C343070Dcf.LIZ()) {
            ((C0ETY) diContainer.LJII(C0ETY.class, null)).Sd(InterfaceC577400Mkk.class, new AwS587S0100000_8(this, 451));
        } else {
            C05YF c05yf = (C05YF) diContainer.LJIIL(null, InterfaceC577400Mkk.class);
            if (c05yf != null) {
                InterfaceC577400Mkk interfaceC577400Mkk = (InterfaceC577400Mkk) c05yf;
                interfaceC577400Mkk.A3().LIZ(this, new AObjectS303S0200000_8(this, interfaceC577400Mkk, 2));
            }
        }
        if (getShouldUseOneSideDockBar()) {
            C013C c013c = new C013C();
            InterfaceC1652190t61 recordPermissionApiComponent2 = getRecordPermissionApiComponent();
            if (recordPermissionApiComponent2 != null && (c385670FAfL00 = recordPermissionApiComponent2.L00()) != null) {
                c385670FAfL00.LIZ(this, new AObjectS303S0200000_8(this, c013c, 3));
            }
            InterfaceC1652190t61 recordPermissionApiComponent3 = getRecordPermissionApiComponent();
            if (recordPermissionApiComponent3 != null && (c385670FAfNR1 = recordPermissionApiComponent3.NR1()) != null) {
                c385670FAfNR1.LIZ(this, new AObjectS241S0100000_8(this, 54));
            }
            C11PQ c11pqLJLLLLLL = C11PQ.LJLLLLLL("");
            q stickerApiComponent = getStickerApiComponent();
            if (stickerApiComponent != null && (interfaceC1624480sNKC0 = stickerApiComponent.C0()) != null && (interfaceC1625470sOvLJII = interfaceC1624480sNKC0.LJII()) != null && (mutableLiveDataLJIJJLI = interfaceC1625470sOvLJII.LJIJJLI()) != null) {
                mutableLiveDataLJIJJLI.observe(this, new AObserverS212S0100000_8(c11pqLJLLLLLL, 69));
            }
            InterfaceC577400Mkk interfaceC577400Mkk2 = (InterfaceC577400Mkk) getDiContainer().LJIIL(null, InterfaceC577400Mkk.class);
            if (interfaceC577400Mkk2 == null || (c11nzH70 = interfaceC577400Mkk2.h70()) == null || (c098dLJJJJZ = c11nzH70.LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0KyE
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj) {
                    Object objLJJJLL = C13LP.LJJJLL(((Effect) obj).getIconUrl().getUrlList());
                    if (objLJJJLL == null) {
                        return "";
                    }
                    return objLJJJLL;
                }
            }).LJJLIL("")) == null) {
                c098dLJJJJZ = C11NZ.LJJJJZ("");
            }
            this.compositeDisposable.LIZ(C11NZ.LJIIJ(c098dLJJJJZ, c11pqLJLLLLLL, new InterfaceC500500Jk0<T1, T2, R>() { // from class: X.0MkR
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r3v1, types: [R, java.lang.String] */
                @Override // X.InterfaceC500500Jk0
                public final R apply(T1 t1, T2 t2) {
                    ?? r3 = (R) ((String) t2);
                    if (r3.length() == 0) {
                        return t1;
                    }
                    return r3;
                }
            }).LJJIFFI().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS177S0100000_8(this, 46)));
        }
    }

    private final void triggerBitmapPreloadOnAlbumClickIfNeeded() {
        if (AnonymousClass0982.LIZ() && ((Boolean) C23217097v.LIZ.getValue()).booleanValue() && !this.hasTriggeredBitmapPreloadOnAlbumClick) {
            this.hasTriggeredBitmapPreloadOnAlbumClick = true;
            new PreloadBitmapTask(getActivity(), this.parentScene.getLifecycle()).run();
        }
    }

    @Override // X.InterfaceC1648870t0f
    public void dismissLivePopupEvent() {
        InterfaceC1648020szI interfaceC1648020szI = (InterfaceC1648020szI) getDiContainer().LJIIL(null, InterfaceC1648020szI.class);
        if (interfaceC1648020szI != null) {
            interfaceC1648020szI.hidePopupForLiveTab();
        }
    }

    @Override // X.InterfaceC1648870t0f
    public LiveEvent<Unit> getNoBlockTouchEvent() {
        return getShouldUseOneSideDockBar() ? new LiveEvent<>() : isFullHorizontalCarrouselStyle() ? getFullHorizontalCarrouselRecordDockBarScene().LLJJJ : getRecordDockBarScene().LLJJJJ;
    }

    /* JADX INFO: renamed from: getRecordDockBarScene, reason: collision with other method in class */
    public final Scene m31getRecordDockBarScene() {
        return isFullHorizontalCarrouselStyle() ? getFullHorizontalCarrouselRecordDockBarScene() : getShouldUseOneSideDockBar() ? getOneSideRecordDockBarScene() : getRecordDockBarScene();
    }

    public final boolean isInBulletin() {
        if (C577360Mkg.LIZ()) {
            return getShortVideoContext().creativeModel.initialModel.dmCameraModel.isBulletin;
        }
        return false;
    }

    public final boolean needHideUploadAndEffect() {
        if (getShortVideoContext().LJJJJL() || getShortVideoContext().LJJJ() || getShortVideoContext().LJJIL() || getShortVideoContext().LJJIIZI() || getShortVideoContext().LJJIJ() || d4.LJJIII(getShortVideoContext())) {
            return true;
        }
        return (!getShortVideoContext().LJJIIJZLJL() && d4.LJIIIZ(getShortVideoContext())) || getShortVideoContext().creativeModel.albumOpenApiModel != null;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        getRecordAdapterApi().GM1(this);
        C1637850sit.LIZ(this, new AwS552S0100000_8(this, 706));
        setupForEditEffect();
        if (isFullHorizontalCarrouselStyle()) {
            this.parentScene.add(this.layoutResId, getFullHorizontalCarrouselRecordDockBarScene(), "RecordDockBarScene");
        } else if (getShouldUseOneSideDockBar()) {
            this.parentScene.add(this.layoutResId, getOneSideRecordDockBarScene(), "OneSideRecordDockBarScene");
        } else {
            this.parentScene.add(this.layoutResId, getRecordDockBarScene(), "RecordDockBarScene");
        }
        Bundle bundleLIZIZ = C565520MFy.LIZIZ(this.parentScene);
        if (Intrinsics.LJFF(bundleLIZIZ != null ? Boolean.valueOf(bundleLIZIZ.getBoolean("auto_open_album")) : null, Boolean.TRUE)) {
            manualClickUploadButton(false);
        }
        Bundle bundleLIZIZ2 = C565520MFy.LIZIZ(this.parentScene);
        if (bundleLIZIZ2 != null) {
            bundleLIZIZ2.getBoolean("show_private_album");
        }
        registerObservers();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        this.compositeDisposable.dispose();
        InterfaceC577370Mkh avListenableActivityBehaviorRegistry = getAvListenableActivityBehaviorRegistry();
        if (avListenableActivityBehaviorRegistry != null) {
            avListenableActivityBehaviorRegistry.LJIJ(this.onTouchEventListener);
        }
    }

    public final void onEffectEntranceClicked() {
        InterfaceC1624480sNK interfaceC1624480sNKC0;
        q stickerApiComponent = getStickerApiComponent();
        if (stickerApiComponent != null && (interfaceC1624480sNKC0 = stickerApiComponent.C0()) != null) {
            interfaceC1624480sNKC0.LJJLI(System.currentTimeMillis());
        }
        C0CHQ.LIZ().LJJJJI().sceneReport("click_prop_panel");
        boolean z = true;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tools_memory_increase_event", true, false)) {
            C684030QsL.LIZ = null;
            C684030QsL.LIZIZ = false;
            q stickerApiComponent2 = getStickerApiComponent();
            if (stickerApiComponent2 != null && stickerApiComponent2.C0().LLILIL() != null) {
                z = false;
            }
            C15O7.LIZJ(new ACallableS13S0010000_8(z, 0));
        }
        InterfaceC577400Mkk interfaceC577400Mkk = (InterfaceC577400Mkk) getDiContainer().LJIIL(null, InterfaceC577400Mkk.class);
        if (interfaceC577400Mkk != null) {
            interfaceC577400Mkk.SA1();
        }
        C1638140sjM.LIZ(EnumC1647590syb.STICKER_ENTRANCE);
        C0CNO.LIZ(C15O7.LJI, new AwS552S0100000_8(this, 707));
        C0CHQ.LIZ().LJI().LJIIIZ(getShortVideoContext(), "prop");
    }

    public final void openCameraByAlbumClosed() {
        getCameraApiComponent().IU1().LIZIZ(EnumC545560LaU.RECORD_LOCAL_MEDIA_SCENE, C1DPV.LIZIZ.LIZIZ(C1DPW.OPEN_CAMERA_BY_ALBUM_CLOSE, null), Boolean.FALSE);
    }

    @Override // X.InterfaceC1648870t0f
    public C385670FAf<Boolean> getAlbumPageVisibilityState() {
        return this.albumPageVisibilityState;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.apiComponent;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.diContainer;
    }

    @Override // X.InterfaceC1648870t0f
    public /* bridge */ /* synthetic */ C385670FAf getEffectContainerVisibility() {
        return this.effectContainerVisibility;
    }

    public final C19A3 getParentScene() {
        return this.parentScene;
    }

    public final boolean isCameraOpenedFromAlbum() {
        return this.isCameraOpenedFromAlbum;
    }

    private final C1641990spZ getRecordDockBarScene() {
        return (C1641990spZ) this.recordDockBarScene$delegate.getValue();
    }

    @Override // X.AbstractC2255721DQs
    public InterfaceC1648870t0f getApiComponent() {
        return this.apiComponent;
    }

    @Override // X.InterfaceC1648870t0f
    public h0<Integer> getEffectContainerVisibility() {
        return this.effectContainerVisibility;
    }

    @Override // X.InterfaceC1648870t0f
    public void manualClickUploadButton(final boolean z) {
        Effect effectLLILIL;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        InterfaceC1624480sNK interfaceC1624480sNKC0;
        boolean zLJI = MethodIDManager.LJI(71956);
        RecordEffectModel recordEffectModel = getShortVideoContext().creativeModel.recordEffectModel;
        C1446130njf c1446130njf = C1446130njf.LIZ;
        q stickerApiComponent = getStickerApiComponent();
        Integer numValueOf = null;
        if (stickerApiComponent != null && (interfaceC1624480sNKC0 = stickerApiComponent.C0()) != null) {
            effectLLILIL = interfaceC1624480sNKC0.LLILIL();
        } else {
            effectLLILIL = null;
        }
        c1446130njf.getClass();
        recordEffectModel.isAigcPropSelected = C1446130njf.LJIIL(effectLLILIL);
        InterfaceC577380Mki interfaceC577380Mki = (InterfaceC577380Mki) getDiContainer().LJIIL(null, InterfaceC577380Mki.class);
        if (interfaceC577380Mki != null && interfaceC577380Mki.yD(z)) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        q stickerApiComponent2 = getStickerApiComponent();
        if (stickerApiComponent2 != null && stickerApiComponent2.sJ()) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        C524380KhQ.LIZIZ(getShortVideoContext());
        C2288908xz.LIZIZ();
        InterfaceC1651080t4E toolbarApi = getToolbarApi();
        if (toolbarApi != null) {
            toolbarApi.ER(false);
        }
        this.clickAlbumIconTime = System.currentTimeMillis();
        RecordPageOptionalConfig recordPageOptionalConfig = getShortVideoContext().creativeModel.initialModel.recordPageOptionalConfig;
        if (recordPageOptionalConfig != null) {
            numValueOf = Integer.valueOf(recordPageOptionalConfig.exteriorRecordPageType);
        }
        C539630LEj.LIZIZ(numValueOf, C0L9X.START);
        InterfaceC1647520syU infiniStickerApi = getInfiniStickerApi();
        if (infiniStickerApi != null) {
            infiniStickerApi.Qd1();
        }
        if (C0CIU.LIZJ() && !getFromExteriorRecordScene() && !EnablePrivateAlbumWithoutPermissionExperiment.isEnabled()) {
            openAlbum(z);
        } else {
            C523800KgU c523800KgU = new C523800KgU();
            c523800KgU.LIZ = "bpea-tools_request_storage_permission_manual_click_upload_target34";
            c523800KgU.LIZIZ = "bpea-tools_request_storage_permission_manual_click_upload_target33";
            c523800KgU.LIZJ = "bpea-tools_request_storage_permission_manual_click_upload";
            TokenCert tokenCertLIZ = c523800KgU.LIZ().LIZ();
            C540290LGx c540290LGx = C540290LGx.LIZ;
            C19EG activity = getActivity();
            ShortVideoContext shortVideoContext = getShortVideoContext();
            C0LH5 c0lh5 = new C0LH5() { // from class: X.0KiB
                @Override // X.C0LH5
                public final void LIZ(int[] iArr, String[] strArr) {
                    Integer numValueOf2;
                    RecordPageOptionalConfig recordPageOptionalConfig2 = this.LIZ.getShortVideoContext().creativeModel.initialModel.recordPageOptionalConfig;
                    if (recordPageOptionalConfig2 != null) {
                        numValueOf2 = Integer.valueOf(recordPageOptionalConfig2.exteriorRecordPageType);
                    } else {
                        numValueOf2 = null;
                    }
                    C539630LEj.LIZIZ(numValueOf2, C0L9X.SUCCESS);
                    this.LIZ.openAlbum(z);
                }
            };
            if (EnablePrivateAlbumWithoutPermissionExperiment.isEnabled() && !C0CHQ.LIZ().getAccountService().LIZ()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (PrivateAlbumKeepSecondaryPopupExperiment.isEnabled() && !C0CHQ.LIZ().getAccountService().LIZ()) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (PrivateAlbumSelectPhotosPopupCTAExperiment.isEnabled() && !C0CHQ.LIZ().getAccountService().LIZ()) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (PrivateAlbumPartialAuthorizationBottomCTAExperiment.isEnabled() && !C0CHQ.LIZ().getAccountService().LIZ()) {
                z5 = true;
            } else {
                z5 = false;
            }
            String str = getShortVideoContext().creativeModel.shootEnterFrom;
            if (str == null) {
                str = "";
            }
            C540290LGx.LJ(c540290LGx, activity, shortVideoContext, c0lh5, null, new AwS552S0100000_8(this, 703), new AwS552S0100000_8(this, 704), new AwS552S0100000_8(this, 705), null, z2, z3, z4, z5, !C0CHQ.LIZ().getAccountService().LIZ(), "video_shoot_page", str, tokenCertLIZ, false, 65672);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void openAlbum(boolean z) {
        String effectId;
        InterfaceC1624480sNK interfaceC1624480sNKC0;
        Effect effectLLILIL;
        ShootExtraData shootExtraData;
        InterfaceC577340Mke singleSongMusicLoadApi;
        IBottomTabChangeService iBottomTabChangeService = (IBottomTabChangeService) PluggableExtentionKt.pluggableSpi$default(IBottomTabChangeService.class, false, false, false, 14, null);
        if (iBottomTabChangeService != null) {
            iBottomTabChangeService.LIZ();
        }
        asyncLoadXml();
        if (C298080BmI.LIZ() && (shootExtraData = getShortVideoContext().creativeFlowData.getShootExtraData()) != null && Intrinsics.LJFF(shootExtraData.getDownloadMusicInBackground(), Boolean.TRUE)) {
            C1661180tKW.LIZ.getClass();
            h0<AbstractC1652550t6b> h0Var = C1661180tKW.LIZJ;
            if (h0Var.LIZJ() != null && (h0Var.LIZJ() instanceof C1655250tAx) && (singleSongMusicLoadApi = getSingleSongMusicLoadApi()) != null) {
                singleSongMusicLoadApi.VD2();
            }
        }
        if (!getFromExteriorRecordScene()) {
            ICommerceToolsMissionService iCommerceToolsMissionService = (ICommerceToolsMissionService) ServiceManager.get().getService(ICommerceToolsMissionService.class);
            C19EG activity = getActivity();
            ShortVideoContext shortVideoContext = getShortVideoContext();
            q stickerApiComponent = getStickerApiComponent();
            if (stickerApiComponent != null && (interfaceC1624480sNKC0 = stickerApiComponent.C0()) != null && (effectLLILIL = interfaceC1624480sNKC0.LLILIL()) != null) {
                effectId = effectLLILIL.getEffectId();
            } else {
                effectId = null;
            }
            iCommerceToolsMissionService.LJIIJJI(activity, shortVideoContext, effectId);
        }
        C577580Ml2 c577580Ml2 = C577580Ml2.LIZ;
        if (c577580Ml2.LIZIZ()) {
            c577580Ml2.LJI();
        }
        C524780Ki4.LIZ.start(OpenAlbumPanelPerformanceMonitor.INSTANCE, "onClick");
        triggerBitmapPreloadOnAlbumClickIfNeeded();
        C0CHQ.LIZ().LJIIL().updateCurrentScene("album_panel_show", true);
        getShortVideoContext().uploadMethod = "click_button";
        getShortVideoContext().enterAlbumMethod = "click_button";
        pauseShootPageAndToUploadActivity(true, z);
        C1444870nhd c1444870nhd = C1444870nhd.LIZ;
        C19EG activity2 = getActivity();
        ShortVideoContext shortVideoContext2 = getShortVideoContext();
        C1DRG diContainer = getDiContainer();
        EditEffectAnchorManager editEffectAnchorManager = this.editEffectAnchorManager;
        c1444870nhd.getClass();
        C1444870nhd.LIZIZ(activity2, shortVideoContext2, diContainer, editEffectAnchorManager, null);
    }

    public final void setCameraOpenedFromAlbum(boolean z) {
        this.isCameraOpenedFromAlbum = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    @Override // X.InterfaceC1648870t0f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setEffectContainerVisibility(int r5) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C577240MkU.setEffectContainerVisibility(int):void");
    }

    @Override // X.InterfaceC1648870t0f
    public void setNeedNoTouchListener(boolean z) {
        this.needNoTouchListener.LJIIJ(Unit.LIZ);
    }

    @Override // X.InterfaceC1648870t0f
    public void setUploadStartAction(Function1<? super View, Unit> function1) {
        View view = m31getRecordDockBarScene().mView;
        if (view != null) {
            function1.invoke(view);
        }
    }

    @Override // X.InterfaceC1648870t0f
    public void setUploadVisibility(int i) {
        InterfaceC1652190t61 recordPermissionApiComponent;
        C385670FAf<Boolean> c385670FAfL00;
        InterfaceC1652190t61 recordPermissionApiComponent2;
        C385670FAf<Boolean> c385670FAfNR1;
        if (getHideUploadEntrance() || (getShouldUseOneSideDockBar() && (recordPermissionApiComponent = getRecordPermissionApiComponent()) != null && (c385670FAfL00 = recordPermissionApiComponent.L00()) != null && Intrinsics.LJFF(c385670FAfL00.LIZJ(), Boolean.TRUE) && (recordPermissionApiComponent2 = getRecordPermissionApiComponent()) != null && (c385670FAfNR1 = recordPermissionApiComponent2.NR1()) != null && Intrinsics.LJFF(c385670FAfNR1.LIZJ(), Boolean.TRUE))) {
            Integer numLIZJ = this.uploadVisibility.LIZJ();
            if (numLIZJ == null || numLIZJ.intValue() != 8) {
                this.uploadVisibility.LJII(8);
                return;
            }
            return;
        }
        this.uploadVisibility.LJII(Integer.valueOf(i));
    }

    @Override // X.InterfaceC1648870t0f
    public void showDockBar(boolean z) {
        if (needHideUploadAndEffect()) {
            hideUploadAndEffect();
            return;
        }
        int i = 0;
        if (z) {
            if ((getShortVideoContext().LJII() > 0 || getShortVideoContext().isDuetMode || getShortVideoContext().LJJLL() || getShortVideoContext().cameraComponentModel.isRetakeMode || getShortVideoContext().LJJJJLL() || getShortVideoContext().cameraComponentModel.isEditorProRecordMode) && (!d4.LJFF(getShortVideoContext()) || getShortVideoContext().LJII() > 0)) {
                setUploadVisibility(8);
            } else {
                setUploadVisibility(0);
            }
        } else {
            setUploadVisibility(8);
            i = 4;
        }
        setEffectContainerVisibility(i);
    }

    /* JADX WARN: Type inference failed for: r0v56, types: [X.0MkZ] */
    public C577240MkU(C19A3 c19a3, C1DRG c1drg) {
        this.parentScene = c19a3;
        this.diContainer = c1drg;
    }

    private final void pauseShootPageAndToUploadActivity(final boolean z, final boolean z2) {
        Effect effectLLILIL;
        InterfaceC420801kM interfaceC420801kMIR2;
        InterfaceC420801kM interfaceC420801kMIR22;
        q stickerApiComponent;
        InterfaceC21363518j3 interfaceC21363518j3Wt2;
        InterfaceC1624480sNK interfaceC1624480sNKC0;
        if (((Boolean) C0BJ1.LIZ.getValue()).booleanValue()) {
            getCameraApiComponent().St2().getCameraController().o4(this.externalOnInfoCallback);
        }
        C1638140sjM.LIZ(EnumC1647590syb.UPLOAD);
        q stickerApiComponent2 = getStickerApiComponent();
        InterfaceC420801kM interfaceC420801kMIR23 = null;
        if (stickerApiComponent2 != null && (interfaceC1624480sNKC0 = stickerApiComponent2.C0()) != null) {
            effectLLILIL = interfaceC1624480sNKC0.LLILIL();
        } else {
            effectLLILIL = null;
        }
        if (C1624200sMs.LJIILIIL(effectLLILIL)) {
            q stickerApiComponent3 = getStickerApiComponent();
            if (stickerApiComponent3 != null && stickerApiComponent3.Eh2()) {
                q stickerApiComponent4 = getStickerApiComponent();
                if (stickerApiComponent4 != null) {
                    stickerApiComponent4.eN();
                }
            } else {
                getCameraApiComponent().St2().LJLL();
            }
        } else {
            InterfaceC1652470t6T interfaceC1652470t6T = (InterfaceC1652470t6T) getDiContainer().LJIIL(null, InterfaceC1652470t6T.class);
            if (interfaceC1652470t6T != null) {
                interfaceC1652470t6T.rZ0(null, false);
            }
        }
        getCameraApiComponent().c11(new InterfaceC2183551Acz() { // from class: X.0Mkf
            @Override // X.InterfaceC2183551Acz
            public final void onDone(int i) {
                this.LIZ.toUploadActivity(z, z2);
            }
        });
        if (getShortVideoContext().cameraComponentModel.curBackgroundVideo != null && (stickerApiComponent = getStickerApiComponent()) != null && (interfaceC21363518j3Wt2 = stickerApiComponent.wt2()) != null) {
            interfaceC21363518j3Wt2.LJ();
        }
        if (z && !C0CHQ.LIZ().getAccountService().LIZ()) {
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tools_album_avoid_jedi_memory_leaks", true, false)) {
                this.isCameraOpenedFromAlbum = false;
                if (this.chooseMediaViewModel == null) {
                    this.chooseMediaViewModel = (ChooseMediaViewModel) C1659640tI2.LIZLLL(this.parentScene).LIZ(ChooseMediaViewModel.class);
                }
                this.albumJediCompositeDisposable.dispose();
                this.albumJediCompositeDisposable = new C11NJ();
                ChooseMediaViewModel chooseMediaViewModel = this.chooseMediaViewModel;
                if (chooseMediaViewModel != null && (interfaceC420801kMIR22 = BaseJediViewModel.iR2(chooseMediaViewModel, this, new C2217381BqS() { // from class: X.0Krt
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((ChooseMediaState) obj).getOpeningChooseMediaPageState();
                    }
                }, new AwS587S0100000_8(this, 452))) != null) {
                    this.albumJediCompositeDisposable.LIZ(interfaceC420801kMIR22);
                }
                ChooseMediaViewModel chooseMediaViewModel2 = this.chooseMediaViewModel;
                if (chooseMediaViewModel2 != null && (interfaceC420801kMIR2 = BaseJediViewModel.iR2(chooseMediaViewModel2, this, new C2217381BqS() { // from class: X.0KzQ
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((ChooseMediaState) obj).getClosingChooseMediaPageState();
                    }
                }, new AwS587S0100000_8(this, 453))) != null) {
                    this.albumJediCompositeDisposable.LIZ(interfaceC420801kMIR2);
                }
                InterfaceC420801kM interfaceC420801kM = this.hideShowChooseMediaPageStateStateDisposable;
                if (interfaceC420801kM != null) {
                    interfaceC420801kM.dispose();
                }
                ChooseMediaViewModel chooseMediaViewModel3 = this.chooseMediaViewModel;
                if (chooseMediaViewModel3 != null) {
                    interfaceC420801kMIR23 = BaseJediViewModel.iR2(chooseMediaViewModel3, this, new C2217381BqS() { // from class: X.0Krs
                        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                        public final Object get(Object obj) {
                            return ((ChooseMediaState) obj).getHideShowChooseMediaPageState();
                        }
                    }, new AwS587S0100000_8(this, 454));
                }
                this.hideShowChooseMediaPageStateStateDisposable = interfaceC420801kMIR23;
                return;
            }
            BaseJediViewModel baseJediViewModel = (BaseJediViewModel) C1659640tI2.LIZLLL(this.parentScene).LIZ(ChooseMediaViewModel.class);
            BaseJediViewModel.iR2(baseJediViewModel, this, new C2217381BqS() { // from class: X.0Kru
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((ChooseMediaState) obj).getOpeningChooseMediaPageState();
                }
            }, new AwS587S0100000_8(this, 455));
            BaseJediViewModel.iR2(baseJediViewModel, this, new C2217381BqS() { // from class: X.0KzP
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((ChooseMediaState) obj).getClosingChooseMediaPageState();
                }
            }, new AwS374S0200000_8(this, new C013C(), 126));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void toUploadActivity(boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        Bundle bundleLIZIZ;
        C385670FAf<EnumC1448590nnd> c385670FAfDk;
        C563770M9f c563770M9fLIZLLL;
        int i;
        if (d4.LJFF(getShortVideoContext())) {
            RetakeVideoContext retakeVideoContextLJIIZILJ = getShortVideoContext().LJIIZILJ();
            C19EG activity = getActivity();
            C0E48 c0e48 = C0E6V.LIZ;
            boolean z6 = getShortVideoContext().cameraComponentModel.editorProRecordUsedForPip;
            boolean z7 = retakeVideoContextLJIIZILJ.originFromNowsPage;
            long j = retakeVideoContextLJIIZILJ.durationWithSpeed;
            if (c0e48 != null) {
                EditorProAlbumService editorProAlbumService = new EditorProAlbumService();
                if (z7) {
                    i = 31001;
                } else {
                    i = 31000;
                }
                editorProAlbumService.startSelectMediaWithInsertIndex(activity, c0e48, i, new C0LJQ(1, Long.valueOf(j), C0E6K.REPLACE, z6, false, 0, true, true, 208), null, null);
                return;
            }
            return;
        }
        if (d4.LJJII(getShortVideoContext())) {
            SocMediaPickerService socMediaPickerService = (SocMediaPickerService) PluggableExtentionKt.pluggableSpi$default(SocMediaPickerService.class, false, false, false, 14, null);
            if (socMediaPickerService != null && (c563770M9fLIZLLL = socMediaPickerService.LIZLLL()) != null) {
                String str = getShortVideoContext().shootWay;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                String str3 = getShortVideoContext().enterMethod;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = getShortVideoContext().enterFrom;
                if (str4 != null) {
                    str2 = str4;
                }
                String str5 = getShortVideoContext().creativeModel.shootEnterFrom;
                String str6 = getShortVideoContext().enterMethod;
                Object[] objArr = 0 == true ? 1 : 0;
                Object[] objArr2 = 0 == true ? 1 : 0;
                Object[] objArr3 = 0 == true ? 1 : 0;
                Object[] objArr4 = 0 == true ? 1 : 0;
                Object[] objArr5 = 0 == true ? 1 : 0;
                Object[] objArr6 = 0 == true ? 1 : 0;
                Object[] objArr7 = 0 == true ? 1 : 0;
                Object[] objArr8 = 0 == true ? 1 : 0;
                Object[] objArr9 = 0 == true ? 1 : 0;
                c563770M9fLIZLLL.startStoryPublish(getActivity(), new EnterStoryParam(str, str3, str2, getShortVideoContext().getCreationId(), getShortVideoContext().creativeModel.groupId, str5, str6, getShortVideoContext().creativeModel.storyModel.getShootEnterPosition(), null, getShortVideoContext().creativeModel.commonMobModel.isUploadDirectEnter, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0.0f, 0 == true ? 1 : 0, objArr, objArr2, objArr3, objArr4, objArr5, objArr6, true, objArr7, 0 == true ? 1 : 0, objArr8, getShortVideoContext().creativeModel.musicBuzModel, 31456512, objArr9), c563770M9fLIZLLL.chooseBPEAToken("bpea-tools_request_storage_permission_album_init_target34", "bpea-tools_request_storage_permission_album_init_target33", "bpea-tools_request_storage_permission_album_init"));
                return;
            }
            return;
        }
        C579430Mo1 c579430Mo1 = C579430Mo1.LIZ;
        ShortVideoContext shortVideoContext = getShortVideoContext();
        c579430Mo1.getClass();
        if (C579430Mo1.LIZJ(shortVideoContext) && !Intrinsics.LJFF(getShortVideoContext().shootWay, "filter_anchor")) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z) {
            getShortVideoContext().enterFrom = "video_shoot_page";
        }
        C531110KsH c531110KsH = C531110KsH.LIZ;
        Scene sceneM31getRecordDockBarScene = m31getRecordDockBarScene();
        ShortVideoContext shortVideoContext2 = getShortVideoContext();
        long j2 = this.clickAlbumIconTime;
        EnumC1448590nnd enumC1448590nndLIZJ = null;
        InterfaceC1646220swO interfaceC1646220swO = (InterfaceC1646220swO) getDiContainer().LJIIL(null, InterfaceC1646220swO.class);
        if (interfaceC1646220swO != null && (c385670FAfDk = interfaceC1646220swO.dk()) != null) {
            enumC1448590nndLIZJ = c385670FAfDk.LIZJ();
        }
        if (enumC1448590nndLIZJ == EnumC1448590nnd.RATIO_9_16) {
            z4 = true;
        } else {
            z4 = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z4);
        if (z || ((bundleLIZIZ = C565520MFy.LIZIZ(this.parentScene)) != null && bundleLIZIZ.getBoolean("show_private_album"))) {
            z5 = true;
        } else {
            z5 = false;
        }
        C531110KsH.LIZJ(c531110KsH, sceneM31getRecordDockBarScene, shortVideoContext2, z, j2, null, z3, boolValueOf, z2, z5, z, false, 1040);
    }

    public static /* synthetic */ void openAlbum$default(C577240MkU c577240MkU, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            c577240MkU.openAlbum(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openAlbum");
    }

    public static /* synthetic */ void pauseShootPageAndToUploadActivity$default(C577240MkU c577240MkU, boolean z, boolean z2, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = false;
            }
            c577240MkU.pauseShootPageAndToUploadActivity(z, z2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pauseShootPageAndToUploadActivity");
    }
}
