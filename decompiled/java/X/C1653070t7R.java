package X;

import Y.AObjectS185S0300000_25;
import Y.AObjectS246S0100000_25;
import Y.AObjectS306S0200000_25;
import Y.ARunnableS58S0300000_25;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene;
import com.ss.android.ugc.aweme.shortvideo.widget.TabHost;
import com.ss.android.ugc.gamora.recorder.bottom.IBottomTabChangeService;
import com.ss.android.ugc.gamora.recorder.bottom.r0;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS139S1100000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import lnn.q;
import mn3.e0;

/* JADX INFO: renamed from: X.0t7R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1653070t7R extends AbstractC2255721DQs<InterfaceC1648020szI> implements InterfaceC1166920gTK, InterfaceC1648020szI, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] $$delegatedProperties;
    public static final int $stable;
    public static final C1649140t16 Companion;
    public static final List<String> recordModelTags;
    public final h0<C1647390syH> _bottomTabIndexChangeEvent;
    public final C560530Lyd<String> _sharedARTabIndexChangeEvent;
    public final InterfaceC1731706qJ activity$delegate;
    public final InterfaceC1648020szI apiComponent = this;
    public final C385670FAf<C1647390syH> bottomTabIndexChangeEvent;
    public final C1653170t7b bottomTabManager;
    public final r0 bottomTabScene;
    public final List<InterfaceC1653190t7d> bottoms;
    public final InterfaceC1731706qJ cameraApiComponent$delegate;
    public final InterfaceC1731706qJ componentizationConfig$delegate;
    public final C1DRG diContainer;
    public boolean hasSelectDefaultTab;
    public boolean isCurrentForbidAudioTab;
    public final InterfaceC1731706qJ liveApiComponent$delegate;
    public final C19A3 parentScene;
    public final a planCUiApiComponent;
    public final List<String> prevTagTags;
    public final InterfaceC1731706qJ recordAdapterApi$delegate;
    public final InterfaceC1731706qJ recordControlApi$delegate;
    public a6n.a recordEnv;
    public final InterfaceC1731706qJ recordModeApi$delegate;
    public final InterfaceC1731706qJ recordPermissionApiComponent$delegate;
    public final InterfaceC1731706qJ rootScene$delegate;
    public final C560530Lyd<Integer> setBottomTabEndMargin;
    public final C560530Lyd<Integer> setBottomTabStartMargin;
    public final LiveEvent<String> sharedARTabIndexChangeEvent;
    public final InterfaceC1731706qJ shortVideoContext$delegate;
    public final C560530Lyd<Boolean> showBottomTabEvent;
    public final C538770LBb<Integer> showLiveTagState;
    public final InterfaceC1731706qJ stickerApiComponent$delegate;
    public final C01GW switchDurationConfigFactory$delegate;

    @Override // X.InterfaceC960503pD, X.C11E6
    public LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.C11DL
    public InterfaceC960503pD getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC1648020szI
    public C1653370t7v getTooltipCoordinator() {
        return null;
    }

    @Override // X.C11E9
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // X.InterfaceC1648020szI
    public boolean isBottomTabThemeDarkMode() {
        return true;
    }

    @Override // X.InterfaceC1648020szI
    public void selectDefaultSubTab() {
    }

    @Override // X.InterfaceC1648020szI
    public void showComplexTab(int i, C1647390syH c1647390syH) {
    }

    @Override // X.InterfaceC1648020szI
    public void showComplexTab(boolean z) {
    }

    @Override // X.InterfaceC1648020szI
    public void switchToPreviousTab() {
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1653070t7R.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0);
        C13LE.LIZ.getClass();
        $$delegatedProperties = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1653070t7R.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new C2217381BqS(C1653070t7R.class, "recordModeApi", "getRecordModeApi()Lcom/ss/android/ugc/aweme/shortvideo/ui/component/RecordModeApiComponent;", 0), new C2217381BqS(C1653070t7R.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new C2217381BqS(C1653070t7R.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0), new C2217381BqS(C1653070t7R.class, "recordPermissionApiComponent", "getRecordPermissionApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/ui/permissionmanager/RecordPermissionUIApiComponent;", 0), new C2217381BqS(C1653070t7R.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0), new C2217381BqS(C1653070t7R.class, "liveApiComponent", "getLiveApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/live/LiveApiComponent;", 0), new C2217381BqS(C1653070t7R.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0), new C2217381BqS(C1653070t7R.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/shortvideo/ui/TikTokCameraBaseGroupScene;", 0), new C2217381BqS(C1653070t7R.class, "componentizationConfig", "getComponentizationConfig()Lcom/ss/android/ugc/aweme/shortvideo/ui/RecordContainerComponentizationConfig;", 0)};
        Companion = new C1649140t16();
        $stable = 8;
        recordModelTags = C1697810uHb.LJIIJJI(C0CHQ.LIZ.getString(2131845848), C0CHQ.LIZ.getString(2131845845), C0CHQ.LIZ.getString(2131845846));
    }

    private final C19EG getActivity() {
        return (C19EG) this.activity$delegate.getValue(this, $$delegatedProperties[8]);
    }

    private final e0 getCameraApiComponent() {
        return (e0) this.cameraApiComponent$delegate.getValue(this, $$delegatedProperties[0]);
    }

    private final InterfaceC1647420syK getRecordAdapterApi() {
        return (InterfaceC1647420syK) this.recordAdapterApi$delegate.getValue(this, $$delegatedProperties[6]);
    }

    private final InterfaceC1648570t0B getRecordControlApi() {
        return (InterfaceC1648570t0B) this.recordControlApi$delegate.getValue(this, $$delegatedProperties[1]);
    }

    private final InterfaceC1621970sJH getRecordModeApi() {
        return (InterfaceC1621970sJH) this.recordModeApi$delegate.getValue(this, $$delegatedProperties[2]);
    }

    private final C1649450t1b getSwitchDurationConfigFactory() {
        return (C1649450t1b) this.switchDurationConfigFactory$delegate.getValue();
    }

    @Override // X.InterfaceC1648020szI
    public int bottomTabSize() {
        return ((ArrayList) this.bottomTabManager.LIZLLL).size();
    }

    @Override // X.InterfaceC1648020szI
    public String defaultBottomTab() {
        List<C1653090t7T> list = this.bottomTabManager.LIZLLL;
        if (C086I.LIZIZ(list)) {
            return null;
        }
        Iterator<C1653090t7T> it2 = list.iterator();
        while (it2.hasNext()) {
            C1653330t7r c1653330t7r = it2.next().LIZ;
            if (c1653330t7r.LIZLLL) {
                return c1653330t7r.LIZIZ;
            }
        }
        return null;
    }

    public final C565600MGg getComponentizationConfig() {
        return (C565600MGg) this.componentizationConfig$delegate.getValue(this, $$delegatedProperties[10]);
    }

    @Override // X.InterfaceC1648020szI
    public C1653330t7r getCurrentBottomTabItem() {
        return this.bottomTabManager.LJFF();
    }

    @Override // X.InterfaceC1648020szI
    public C1653330t7r getCurrentBottomTabItemBeforeOnTabChanged() {
        C1653330t7r c1653330t7r = this.bottomTabManager.LJIIL;
        return c1653330t7r == null ? getCurrentBottomTabItem() : c1653330t7r;
    }

    @Override // X.InterfaceC1647930sz9
    public String getCurrentBottomTag() {
        return this.bottomTabManager.LJI();
    }

    @Override // X.InterfaceC1648020szI
    public List<C1653090t7T> getExistingTabs() {
        return this.bottomTabManager.LIZLLL;
    }

    public final InterfaceC1645840svm getLiveApiComponent() {
        return (InterfaceC1645840svm) this.liveApiComponent$delegate.getValue(this, $$delegatedProperties[7]);
    }

    public final InterfaceC1652190t61 getRecordPermissionApiComponent() {
        return (InterfaceC1652190t61) this.recordPermissionApiComponent$delegate.getValue(this, $$delegatedProperties[5]);
    }

    public final TikTokCameraBaseGroupScene getRootScene() {
        return (TikTokCameraBaseGroupScene) this.rootScene$delegate.getValue(this, $$delegatedProperties[9]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.shortVideoContext$delegate.getValue(this, $$delegatedProperties[3]);
    }

    public final q getStickerApiComponent() {
        return (q) this.stickerApiComponent$delegate.getValue(this, $$delegatedProperties[4]);
    }

    @Override // X.InterfaceC1648020szI
    public void hidePopupForLiveTab() {
        C1653300t7o c1653300t7o = this.bottomTabManager.LJI;
        if (c1653300t7o == null) {
            c1653300t7o = null;
        }
        C0P0T c0p0t = c1653300t7o.LIZLLL;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
    }

    @Override // X.InterfaceC1648020szI
    public boolean isValid() {
        return !C12WG.LIZIZ(this.parentScene);
    }

    public final void onStartRecord() {
        this.bottomTabManager.LIZJ(false);
        showBottomTab(false);
        ShortVideoContext shortVideoContext = getShortVideoContext();
        int i = shortVideoContext.shootedShootMode;
        int i2 = shortVideoContext.shootMode;
        if (i != i2) {
            shortVideoContext.shootedShootMode = i2;
            C1439190nYT.LJIIIZ(i2);
        }
    }

    @Override // X.InterfaceC1647930sz9
    public a6n.a provideRecordEnv() {
        a6n.a aVar = this.recordEnv;
        if (aVar == null) {
            return null;
        }
        return aVar;
    }

    @Override // X.InterfaceC1648020szI
    public void showAllTabsAndExitDuetMode() {
        this.bottomTabManager.LJIIL("DUET_MODE_CAMERA_RECORD");
        int i = 0;
        for (Object obj : (ArrayList) this.bottomTabManager.LIZLLL) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            this.bottomTabManager.LIZIZ(i, (C1653090t7T) obj);
            i = i2;
        }
        setCurrentTab("record_mode_duet", true, 6, false);
    }

    @Override // X.InterfaceC1648020szI
    public void tryShowPopupForLiveTab() {
        this.bottomTabManager.LJIILL();
    }

    private final EnumC560450LyV getCurrentBottomTab() {
        String currentBottomTag = getCurrentBottomTag();
        return (isRecordTab(currentBottomTag) || isStoryOrPhotoTab(currentBottomTag)) ? EnumC560450LyV.RECORD : Intrinsics.LJFF(currentBottomTag, "record_mode_editor_tab") ? EnumC560450LyV.CREATE : EnumC560450LyV.OTHERS;
    }

    private final void handleBackFromTextMode() {
        if (Intrinsics.LJFF(this.bottomTabManager.LJI(), getActivity().getString(2131845853))) {
            String strDefaultBottomTab = defaultBottomTab();
            if (strDefaultBottomTab == null) {
                this.bottomTabScene.LLLLIILL();
                return;
            }
            r0 r0Var = this.bottomTabScene;
            TabHost tabHost = r0Var.LLJILLL;
            if (tabHost == null) {
                tabHost = null;
            }
            tabHost.LJ(true, r0Var.LLLIIIIL(strDefaultBottomTab), 7, true);
        }
    }

    private final void refreshStickerCategoriesForEffectTemplate() {
        InterfaceC1624480sNK interfaceC1624480sNKC0;
        InterfaceC1627350sRx stickerRepository;
        if (C0CHS.LIZ() || C1656550tD3.LIZ()) {
            List<String> list = C579450Mo3.LIZ;
            if (C579450Mo3.LIZ(getShortVideoContext())) {
                return;
            }
            C1633080sbC c1633080sbC = new C1633080sbC(null, false, false, 1023);
            c1633080sbC.LJIIJ = C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tools_redundant_network_calls_removal", true, false);
            q stickerApiComponent = getStickerApiComponent();
            if (stickerApiComponent == null || (interfaceC1624480sNKC0 = stickerApiComponent.C0()) == null || (stickerRepository = interfaceC1624480sNKC0.getStickerRepository()) == null) {
                return;
            }
            stickerRepository.LJIIIZ(c1633080sbC);
        }
    }

    @Override // X.InterfaceC1647930sz9
    public boolean couldShowToolbar() {
        return (TextUtils.equals(getCurrentBottomTag(), "record_mode_duet") || TextUtils.equals(getCurrentBottomTag(), "record_mode_live") || TextUtils.equals(getCurrentBottomTag(), "record_mode_mv") || TextUtils.equals(getCurrentBottomTag(), "record_mode_editor_tab") || TextUtils.equals(getCurrentBottomTag(), "AISelf")) ? false : true;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        C385670FAf<Boolean> c385670FAfCP1;
        super.onCreate();
        getRecordAdapterApi().eH1(this);
        a6n.a aVar = (a6n.a) this.parentScene.getScope().LJ("record_env_context");
        this.recordEnv = aVar;
        this.bottomTabManager.LJIIIZ(aVar, this.bottoms, this._bottomTabIndexChangeEvent, this._sharedARTabIndexChangeEvent);
        List<C1653090t7T> list = this.bottomTabManager.LIZLLL;
        if (onlyShowLiveTab(this.parentScene)) {
            return;
        }
        Iterator<C1653090t7T> it2 = list.iterator();
        while (it2.hasNext()) {
            AbstractC1653180t7c abstractC1653180t7c = it2.next().LIZIZ;
            if (abstractC1653180t7c != null) {
                C1658150tFd.LIZ(this.parentScene, R.id.sz5, abstractC1653180t7c, abstractC1653180t7c.getTag());
            }
        }
        this.parentScene.add(R.id.sz5, this.bottomTabScene, "RecordBottomTabScene");
        init(this.parentScene, list);
        this.sharedARTabIndexChangeEvent.LIZ(this, new AObjectS246S0100000_25(this, 370));
        getBottomTabIndexChangeEvent().LIZ(this, new AObjectS246S0100000_25(this, 371));
        getRecordControlApi().xk1().LJ(this, new AObjectS246S0100000_25(this, 372));
        getRecordControlApi().cJ0().LIZ(this, new AObjectS246S0100000_25(this, 373));
        this.setBottomTabStartMargin.LIZ(this, new AObjectS246S0100000_25(this, 374));
        this.setBottomTabEndMargin.LIZ(this, new AObjectS246S0100000_25(this, 375));
        getRecordControlApi().pU1().LIZ(this, new AObjectS246S0100000_25(this, 376));
        getRecordControlApi().xM2().LIZ(this, new AObjectS246S0100000_25(this, 365));
        getRecordControlApi().zx2().LIZ(this, new AObjectS246S0100000_25(this, 366));
        InterfaceC1621970sJH recordModeApi = getRecordModeApi();
        if (recordModeApi != null && (c385670FAfCP1 = recordModeApi.CP1()) != null) {
            c385670FAfCP1.LIZ(this, new AObjectS246S0100000_25(this, 367));
        }
        getCameraApiComponent().bu2().LIZ(this, new AObjectS246S0100000_25(this, 368));
        getCameraApiComponent().Dm2().LIZ(this, new AObjectS246S0100000_25(this, 369));
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        getRecordAdapterApi().eH1(null);
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        super.onPause();
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", "RecordBottomTabComponent onPause");
        C560380LyO.LJIIZILJ = getCurrentBottomTab();
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", "RecordBottomTabComponent onResume");
        EnumC560450LyV currentBottomTab = getCurrentBottomTab();
        C560380LyO.LJIIZILJ(currentBottomTab, getShortVideoContext(), null);
        C560380LyO.LJIILLIIL(new C560470LyX(currentBottomTab, System.currentTimeMillis()));
    }

    @Override // X.AbstractC2255721DQs
    public void onStart() {
        super.onStart();
        setDefaultSelectedTab(this.parentScene, this.bottomTabManager.LIZLLL);
        handleBackFromTextMode();
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.apiComponent;
    }

    @Override // X.InterfaceC1647930sz9
    public C385670FAf<C1647390syH> getBottomTabIndexChangeEvent() {
        return this.bottomTabIndexChangeEvent;
    }

    public final List<InterfaceC1653190t7d> getBottoms() {
        return this.bottoms;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.diContainer;
    }

    public final C19A3 getParentScene() {
        return this.parentScene;
    }

    @Override // X.InterfaceC1648020szI
    public List<String> getPrevTabTags() {
        return this.prevTagTags;
    }

    @Override // X.C11DL
    public /* bridge */ /* synthetic */ InterfaceC874803bO getReceiver() {
        getReceiver();
        return this;
    }

    @Override // X.AbstractC2255721DQs
    public InterfaceC1648020szI getApiComponent() {
        return this.apiComponent;
    }

    private final boolean isRecordTab(String str) {
        if (!Intrinsics.LJFF(str, "RecordShoot15s") && !Intrinsics.LJFF(str, "RecordShoot60s") && !Intrinsics.LJFF(str, "RecordShoot180s") && !Intrinsics.LJFF(str, "RecordShoot600s") && !Intrinsics.LJFF(str, "RecordNow") && !Intrinsics.LJFF(str, "record_mode_combine") && !Intrinsics.LJFF(str, "record_mode_shoot")) {
            return false;
        }
        return true;
    }

    private final boolean isStoryOrPhotoTab(String str) {
        return C13LP.LJJJJ(str, C1697810uHb.LJIIJJI(getActivity().getString(2131845852), getActivity().getString(2131845854), getActivity().getString(2131845851), getActivity().getString(2131845850), getActivity().getString(2131845859), getActivity().getString(2131845861), "RecordBottomStory", "RecordBottomDMCamera"));
    }

    private final void mobDefaultBottomTabChange(String str) {
        if (C577980Mlg.LIZ() == 1 && !getShortVideoContext().LJJLL()) {
            return;
        }
        mobBottomTabIndexChangeEvent(new C1647390syH("by_default", str, 0, false, false, false, null, false, false, 504));
    }

    private final boolean onlyShowLiveTab(C19A3 c19a3) {
        C1653090t7T next;
        List<C1653090t7T> list = this.bottomTabManager.LIZLLL;
        if (!getShortVideoContext().onlyShowLiveTab) {
            return false;
        }
        Iterator<C1653090t7T> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.LIZ.LIZIZ, C0MTD.LIZ(2131845855))) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1653090t7T c1653090t7T = next;
        if (c1653090t7T == null) {
            return false;
        }
        observeBottomTabVisibility(c19a3, c1653090t7T);
        AbstractC1653180t7c abstractC1653180t7c = c1653090t7T.LIZIZ;
        if (abstractC1653180t7c != null) {
            C1658150tFd.LIZ(c19a3, R.id.sz5, this.bottomTabScene, "RecordBottomTabScene");
            c19a3.add(R.id.sz5, abstractC1653180t7c, abstractC1653180t7c.getTag());
        }
        changeToDefaultTab(c19a3, c1653090t7T, false);
        this.bottomTabManager.LJIILJJIL(c1653090t7T);
        mobDefaultBottomTabChange(c1653090t7T.LIZ.LIZIZ);
        return true;
    }

    @Override // X.InterfaceC1648020szI
    public void clearAIBrandTextByTag(String str) {
        this.bottomTabScene.LLLIL(str);
    }

    @Override // X.InterfaceC1648020szI
    public void configSwitchDuration(C1648150szV c1648150szV) {
        getSwitchDurationConfigFactory().onEvent(c1648150szV);
    }

    @Override // X.InterfaceC1648020szI
    public C1653090t7T findBottomTabByTag(String str) {
        return this.bottomTabManager.LIZLLL(str);
    }

    @Override // X.InterfaceC1648020szI
    public View getHostViewByIndex(int i) {
        TabHost tabHost = this.bottomTabScene.LLJILLL;
        if (tabHost == null) {
            tabHost = null;
        }
        LinearLayout linearLayout = tabHost.LLIZ;
        if (linearLayout == null) {
            return null;
        }
        return linearLayout.getChildAt(i);
    }

    @Override // X.InterfaceC1648020szI
    public int getIndexByTag(String str) {
        return this.bottomTabScene.LLLIIIIL(str);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I> S1 getState(VM1 vm1) {
        return (S1) C1170060gYO.LIZ(this, vm1);
    }

    public final void handleBottomTabChangedEvent(C1647390syH c1647390syH) {
        String string;
        C565600MGg componentizationConfig = getComponentizationConfig();
        if (componentizationConfig != null && componentizationConfig.LIZ) {
            String string2 = c1647390syH.LIZIZ.toString();
            boolean zIsRecordTab = isRecordTab(string2);
            q stickerApiComponent = getStickerApiComponent();
            if (stickerApiComponent != null) {
                C1622510sK9.LIZ(stickerApiComponent, zIsRecordTab);
            }
            Object obj = c1647390syH.LIZ;
            if (obj != null) {
                string = obj.toString();
            } else {
                string = null;
            }
            if (isStoryOrPhotoTab(string) || isStoryOrPhotoTab(string2)) {
                getShortVideoContext().isStoryOrPhotoTab = isStoryOrPhotoTab(string2);
                refreshStickerCategoriesForEffectTemplate();
            }
        }
    }

    public final void handleLeaveSharedARSession(String str) {
        C1624010sMZ.LJII(getStickerApiComponent(), null);
        getStickerApiComponent().bG0().LIZIZ();
        getShortVideoContext().LJJLIIIJL(false);
        this.planCUiApiComponent.m10(true);
        getRecordControlApi().xP1(true, false, true);
        this.planCUiApiComponent.oL1();
    }

    public final void mobBottomTabIndexChangeEvent(C1647390syH c1647390syH) {
        if (!c1647390syH.LIZLLL) {
            return;
        }
        String str = "";
        String str2 = "";
        for (C1653090t7T c1653090t7T : (ArrayList) this.bottomTabManager.LIZLLL) {
            if (TextUtils.equals((CharSequence) c1647390syH.LIZIZ, c1653090t7T.LIZ.LIZIZ)) {
                str2 = c1653090t7T.LIZ.LIZJ;
            }
        }
        if (TextUtils.equals(str2, "")) {
            return;
        }
        if (TextUtils.equals(str2, "video_15") && C577980Mlg.LIZ() == 1) {
            str2 = "camera";
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", getShortVideoContext().getCreationId());
        c0lab.LJ("shoot_way", getShortVideoContext().shootWay);
        c0lab.LIZ(getShortVideoContext().draftId, "draft_id");
        c0lab.LJ("to_status", str2);
        c0lab.LJ("from_status", C1646520sws.LIZ(c1647390syH.LIZ));
        c0lab.LJ("shoot_tab_name", str2);
        c0lab.LJ("shoot_enter_from", getShortVideoContext().enterFrom);
        c0lab.LJ("shoot_enter_method", getShortVideoContext().enterMethod);
        c0lab.LJ("enter_method", getShortVideoContext().enterMethod);
        if (TextUtils.equals(str2, "text")) {
            int i = c1647390syH.LIZJ;
            if (i != 1) {
                if (i == 2 || i == 3) {
                    str = "slide";
                }
            } else {
                str = "click";
            }
            c0lab.LJ("text_mode_enter_method", str);
        }
        c0lab.LJ("enter_from", "video_shoot_page");
        c0lab.LJ("enter_dm", getShortVideoContext().creativeModel.initialModel.dmCameraModel.enterDM);
        String str3 = getShortVideoContext().creativeModel.initialModel.dmCameraModel.searchSessionId;
        if (str3 != null) {
            c0lab.LJ("search_session_id", str3);
        }
        if (getShortVideoContext().creativeModel.initialModel.dmCameraModel.isFromEffectButton) {
            c0lab.LJ("is_chat_page_icon_effect", "1");
        }
        int i2 = getShortVideoContext().creativeModel.initialModel.dmCameraModel.chatType;
        if (i2 != -1) {
            c0lab.LJ("chat_type", C912070ZqH.LIZIZ.LJFF().LJIJI(Integer.valueOf(i2)));
        }
        C20684815ws.LJIILLIIL("change_record_mode", c0lab.LIZ);
    }

    @Override // X.InterfaceC1648020szI
    public void notifyBottomTabIndexChange(C1647390syH c1647390syH) {
        this._bottomTabIndexChangeEvent.LJII(c1647390syH);
        IBottomTabChangeService iBottomTabChangeService = (IBottomTabChangeService) PluggableExtentionKt.pluggableSpi$default(IBottomTabChangeService.class, false, false, false, 14, null);
        if (iBottomTabChangeService != null) {
            iBottomTabChangeService.LIZLLL(this._bottomTabIndexChangeEvent.LIZJ().LIZIZ);
        }
    }

    @Override // X.InterfaceC1648020szI
    public void resetToCurTab(String str) {
        int iLLLIIIIL;
        if ((!C300070BpV.LIZ() || !Intrinsics.LJFF(this.bottomTabScene.LLLII(), str)) && (iLLLIIIIL = this.bottomTabScene.LLLIIIIL(str)) >= 0) {
            this.bottomTabScene.LLLIZZ(iLLLIIIIL, false, false);
        }
    }

    @Override // X.InterfaceC1648020szI
    public void setBottomTabEndMargin(int i) {
        this.setBottomTabEndMargin.LJIIJ(Integer.valueOf(i));
    }

    @Override // X.InterfaceC1648020szI
    public void setBottomTabStartMargin(int i) {
        this.setBottomTabStartMargin.LJIIJ(Integer.valueOf(i));
    }

    @Override // X.InterfaceC1648020szI
    public void setBottomTabWidgetGestureListener(InterfaceC1653650t8N interfaceC1653650t8N) {
        TabHost tabHost = this.bottomTabScene.LLJILLL;
        if (tabHost == null) {
            tabHost = null;
        }
        tabHost.setBottomTabWidgetGestureListener(interfaceC1653650t8N);
    }

    @Override // X.InterfaceC1648020szI
    public void setTabSwitchEnabled(boolean z) {
        this.bottomTabScene.setTabSwitchEnabled(z);
    }

    @Override // X.InterfaceC1648020szI
    public void showBottomTab(boolean z) {
        this.showBottomTabEvent.LJIIJ(Boolean.valueOf(z));
    }

    public final void showExitSharedARSessionDialog(String str) {
        C1397620mTQ c1397620mTQ = new C1397620mTQ(getActivity());
        c1397620mTQ.LJFF(2131848040, new AwS139S1100000_25(this, str, 6));
        c1397620mTQ.LJII(2131830038, AFwS266S0000000_25.get$arr$(281));
        C1397580mTM c1397580mTM = new C1397580mTM(getActivity());
        c1397580mTM.LJFF(2131848042);
        c1397580mTM.LIZ(2131848041);
        c1397580mTM.LJIIL = c1397620mTQ;
        c1397580mTM.LJII = false;
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    public final boolean skipPermissionCheck(C1647390syH c1647390syH) {
        if (c1647390syH.LIZ == null) {
            if (Intrinsics.LJFF(getShortVideoContext().creativeModel.templateSchemaData.schemaTag, "template_schema") || Intrinsics.LJFF(getShortVideoContext().creativeModel.landingModel.landingTab, "editor_tab")) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1648020szI
    public void switchDarkLightThemeMode(boolean z) {
        this.bottomTabScene.LLLLIIIILLL(z);
    }

    @Override // X.InterfaceC1648020szI
    public void updateBottomDotRes(int i) {
        this.bottomTabScene.LLLLILI(i);
    }

    @Override // X.InterfaceC1648020szI
    public void updateDotVisibility(boolean z) {
        this.bottomTabScene.LLLLIL(z);
    }

    private final void init(C19A3 c19a3, List<C1653090t7T> list) {
        C1653090t7T next;
        Iterator<C1653090t7T> it2 = list.iterator();
        while (it2.hasNext()) {
            observeBottomTabVisibility(c19a3, it2.next());
        }
        this.showBottomTabEvent.LIZ(c19a3, new AObjectS306S0200000_25((Object) new C259800zU(), (Object) c19a3, (InterfaceC1648570t0B) 12));
        Iterator<C1653090t7T> it3 = list.iterator();
        while (true) {
            if (it3.hasNext()) {
                next = it3.next();
                if (next.LIZ.LIZLLL) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1653090t7T c1653090t7T = next;
        if (c1653090t7T != null) {
            changeToDefaultTab$default(this, c19a3, c1653090t7T, false, 2, null);
        }
    }

    private final void observeBottomTabVisibility(C19A3 c19a3, C1653090t7T c1653090t7T) {
        c1653090t7T.LIZJ.observe(C1447800nmM.LIZIZ(c19a3), new AObjectS185S0300000_25(c19a3, c1653090t7T, this, 15));
    }

    private final void setDefaultSelectedTab(C19A3 c19a3, List<C1653090t7T> list) {
        C1653090t7T next;
        if (this.hasSelectDefaultTab) {
            return;
        }
        this.hasSelectDefaultTab = true;
        Iterator<C1653090t7T> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LIZ.LIZLLL) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1653090t7T c1653090t7T = next;
        if (c1653090t7T != null) {
            changeToDefaultTab(c19a3, c1653090t7T, false);
            this.bottomTabManager.LJIILJJIL(c1653090t7T);
            mobDefaultBottomTabChange(c1653090t7T.LIZ.LIZIZ);
        }
    }

    @Override // X.InterfaceC1647930sz9
    public void setBottomSelectedTextColor(int i, int i2) {
        TabHost tabHost = this.bottomTabScene.LLJILLL;
        if (tabHost == null) {
            tabHost = null;
        }
        tabHost.LJIIIIZZ(i, i2, false);
    }

    @Override // X.InterfaceC1648020szI
    public void showAIBrandTextByTag(String str, C1655280tB0 c1655280tB0) {
        this.bottomTabScene.LLLJL(str, c1655280tB0);
    }

    @Override // X.C11E9
    public <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, Function1<? super PROP1, ? extends R> function1) {
        return (R) C1171740gb6.LJIIIIZZ(c11e5, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1653070t7R(C19A3 c19a3, C1DRG c1drg, List<? extends InterfaceC1653190t7d> list) {
        this.parentScene = c19a3;
        this.diContainer = c1drg;
        this.bottoms = list;
        a aVar = (a) getDiContainer().LJII(a.class, null);
        this.planCUiApiComponent = aVar;
        this.cameraApiComponent$delegate = C1664770tQJ.LIZ(getDiContainer(), e0.class, null);
        this.recordControlApi$delegate = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648570t0B.class, null);
        this.recordModeApi$delegate = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1621970sJH.class, null);
        this.shortVideoContext$delegate = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
        this.stickerApiComponent$delegate = C1664770tQJ.LIZ(getDiContainer(), q.class, null);
        this.recordPermissionApiComponent$delegate = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1652190t61.class, null);
        this.recordAdapterApi$delegate = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1647420syK.class, null);
        this.liveApiComponent$delegate = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1645840svm.class, null);
        this.activity$delegate = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
        this.rootScene$delegate = C1664770tQJ.LIZIZ(getDiContainer(), TikTokCameraBaseGroupScene.class, null);
        this.componentizationConfig$delegate = C1664770tQJ.LIZIZ(getDiContainer(), C565600MGg.class, null);
        this.prevTagTags = new ArrayList();
        h0<C1647390syH> h0Var = new h0<>(new C1647390syH(null, "RecordShoot15s", 0, false, false, false, null, false, true, 240));
        this._bottomTabIndexChangeEvent = h0Var;
        C560530Lyd<String> c560530Lyd = new C560530Lyd<>();
        this._sharedARTabIndexChangeEvent = c560530Lyd;
        this.bottomTabIndexChangeEvent = h0Var;
        this.sharedARTabIndexChangeEvent = c560530Lyd;
        C1653170t7b c1653170t7b = new C1653170t7b(getCameraApiComponent(), LifecycleOwnerKt.getLifecycleScope(c19a3));
        this.bottomTabManager = c1653170t7b;
        this.showBottomTabEvent = new C560530Lyd<>();
        this.showLiveTagState = new C538770LBb<>(null);
        this.setBottomTabStartMargin = new C560530Lyd<>();
        this.setBottomTabEndMargin = new C560530Lyd<>();
        this.bottomTabScene = new r0(getShortVideoContext(), c1653170t7b, aVar.va());
        this.switchDurationConfigFactory$delegate = C452501pT.LIZ(EnumC452301pR.NONE, new AwS569S0100000_25(this, 523));
    }

    private final void changeToDefaultTab(C19A3 c19a3, C1653090t7T c1653090t7T, boolean z) {
        r0 r0Var = (r0) c19a3.findSceneByTag("RecordBottomTabScene");
        int iLLLIIIIL = r0Var.LLLIIIIL(c1653090t7T.LIZ.LIZIZ);
        if (iLLLIIIIL >= 0) {
            r0Var.LLLIZZ(iLLLIIIIL, z, false);
        }
    }

    @Override // X.InterfaceC1648020szI
    public void addLiveBottomTab(int i, InterfaceC1653190t7d interfaceC1653190t7d, int i2) {
        a6n.a aVar;
        C19A3 c19a3 = this.parentScene;
        Iterator<C1653090t7T> it2 = this.bottomTabManager.LIZLLL.iterator();
        while (true) {
            aVar = null;
            if (!it2.hasNext()) {
                break;
            }
            C1653090t7T next = it2.next();
            if (Intrinsics.LJFF(next.LIZ.LIZIZ, EnumC1647570syZ.LIVE.getTag())) {
                if (next != null) {
                    return;
                }
            }
        }
        C1653170t7b c1653170t7b = this.bottomTabManager;
        a6n.a aVar2 = this.recordEnv;
        if (aVar2 != null) {
            aVar = aVar2;
        }
        C1653090t7T c1653090t7TLIZ = c1653170t7b.LIZ(aVar, i, interfaceC1653190t7d);
        observeBottomTabVisibility(c19a3, c1653090t7TLIZ);
        AbstractC1653180t7c abstractC1653180t7c = c1653090t7TLIZ.LIZIZ;
        if (abstractC1653180t7c != null) {
            C1658150tFd.LIZ(c19a3, R.id.sz6, abstractC1653180t7c, abstractC1653180t7c.getTag());
        }
        if (c1653090t7TLIZ.LIZ.LIZLLL) {
            C12WG.LIZLLL(c19a3, new ARunnableS58S0300000_25(this, c19a3, c1653090t7TLIZ, 7), 500L);
        }
    }

    @Override // X.C11E9
    public <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I, VM2 extends JediViewModel<S2>, S2 extends C004I, R> R withState(VM1 vm1, VM2 vm2, Function2<? super S1, ? super S2, ? extends R> function2) {
        return (R) C1171740gb6.LIZLLL(vm1, vm2, function2);
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, M2 extends C11E5<S2, PROP2>, PROP2 extends C004I, S2 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, C11E5<S2, PROP2> c11e52, Function2<? super PROP1, ? super PROP2, ? extends R> function2) {
        return (R) C1171740gb6.LJII(c11e5, c11e52, function2);
    }

    @Override // X.InterfaceC1166920gTK
    public <S extends C004I, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.InterfaceC1648020szI
    public void setCurrentTab(String str, boolean z, int i, boolean z2) {
        this.bottomTabManager.LJIILIIL(str, z, i, z2);
    }

    @Override // X.InterfaceC1166920gTK
    public <S extends C004I, A> void subscribeEvent(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends C0LCS<? extends A>> interfaceC2217241BqE, C1765020w20<C11EC<C0LCS<A>>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZLLL(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I, VM2 extends JediViewModel<S2>, S2 extends C004I, VM3 extends JediViewModel<S3>, S3 extends C004I, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, InterfaceC1631620sYq<? super S1, ? super S2, ? super S3, ? extends R> interfaceC1631620sYq) {
        return (R) C1171740gb6.LIZJ(vm1, vm2, vm3, interfaceC1631620sYq);
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, M2 extends C11E5<S2, PROP2>, PROP2 extends C004I, S2 extends C004I, M3 extends C11E5<S3, PROP3>, PROP3 extends C004I, S3 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, C11E5<S2, PROP2> c11e52, C11E5<S3, PROP3> c11e53, InterfaceC1631620sYq<? super PROP1, ? super PROP2, ? super PROP3, ? extends R> interfaceC1631620sYq) {
        return (R) C1171740gb6.LJI(c11e5, c11e52, c11e53, interfaceC1631620sYq);
    }

    @Override // X.C11E9
    public <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I, VM2 extends JediViewModel<S2>, S2 extends C004I, VM3 extends JediViewModel<S3>, S3 extends C004I, VM4 extends JediViewModel<S4>, S4 extends C004I, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, VM4 vm4, InterfaceC1631630sYr<? super S1, ? super S2, ? super S3, ? super S4, ? extends R> interfaceC1631630sYr) {
        return (R) C1171740gb6.LIZIZ(vm1, vm2, vm3, vm4, interfaceC1631630sYr);
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, M2 extends C11E5<S2, PROP2>, PROP2 extends C004I, S2 extends C004I, M3 extends C11E5<S3, PROP3>, PROP3 extends C004I, S3 extends C004I, M4 extends C11E5<S4, PROP4>, PROP4 extends C004I, S4 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, C11E5<S2, PROP2> c11e52, C11E5<S3, PROP3> c11e53, C11E5<S4, PROP4> c11e54, InterfaceC1631630sYr<? super PROP1, ? super PROP2, ? super PROP3, ? super PROP4, ? extends R> interfaceC1631630sYr) {
        return (R) C1171740gb6.LJFF(c11e5, c11e52, c11e53, c11e54, interfaceC1631630sYr);
    }

    public static /* synthetic */ void changeToDefaultTab$default(C1653070t7R c1653070t7R, C19A3 c19a3, C1653090t7T c1653090t7T, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            c1653070t7R.changeToDefaultTab(c19a3, c1653090t7T, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: changeToDefaultTab");
    }

    @Override // X.C11E9
    public <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I, VM2 extends JediViewModel<S2>, S2 extends C004I, VM3 extends JediViewModel<S3>, S3 extends C004I, VM4 extends JediViewModel<S4>, S4 extends C004I, VM5 extends JediViewModel<S5>, S5 extends C004I, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, VM4 vm4, VM5 vm5, InterfaceC1685420txc<? super S1, ? super S2, ? super S3, ? super S4, ? super S5, ? extends R> interfaceC1685420txc) {
        return (R) C1171740gb6.LIZ(vm1, vm2, vm3, vm4, vm5, interfaceC1685420txc);
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, M2 extends C11E5<S2, PROP2>, PROP2 extends C004I, S2 extends C004I, M3 extends C11E5<S3, PROP3>, PROP3 extends C004I, S3 extends C004I, M4 extends C11E5<S4, PROP4>, PROP4 extends C004I, S4 extends C004I, M5 extends C11E5<S5, PROP5>, PROP5 extends C004I, S5 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, C11E5<S2, PROP2> c11e52, C11E5<S3, PROP3> c11e53, C11E5<S4, PROP4> c11e54, C11E5<S5, PROP5> c11e55, InterfaceC1685420txc<? super PROP1, ? super PROP2, ? super PROP3, ? super PROP4, ? super PROP5, ? extends R> interfaceC1685420txc) {
        return (R) C1171740gb6.LJ(c11e5, c11e52, c11e53, c11e54, c11e55, interfaceC1685420txc);
    }

    @Override // X.C11E9
    public <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }

    public <S extends C004I, A, B, C, D, E> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1765020w20<C11EE<A, B, C, D, E>> c1765020w20, InterfaceC1685430txd<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C11EA.LIZJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1765020w20, interfaceC1685430txd);
    }
}
