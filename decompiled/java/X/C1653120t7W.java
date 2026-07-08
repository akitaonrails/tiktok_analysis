package X;

import Y.AObjectS185S0300000_25;
import Y.AObjectS246S0100000_25;
import Y.AObjectS306S0200000_25;
import Y.ARunnableS58S0300000_25;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.bytedance.keva.Keva;
import com.bytedance.scene.Scene;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene;
import com.ss.android.ugc.aweme.shortvideo.widget.TabHost;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.bottom.IBottomTabChangeService;
import com.ss.android.ugc.gamora.recorder.bottom.r0;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS139S1100000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import lnn.q;
import mn3.e0;

/* JADX INFO: renamed from: X.0t7W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1653120t7W extends AbstractC1171700gb2 {
    public static final C1653230t7h LLLILZJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLILZLLLI;
    public static final int LLLIZZ;
    public final C19A3 LLILLJJLI;
    public final C1DRG LLILLL;
    public final List<InterfaceC1653190t7d> LLILZ;
    public final List<InterfaceC1653190t7d> LLILZIL;
    public final boolean LLILZLL;
    public final InterfaceC1648020szI LLIZ = this;
    public final a LLIZLLLIL;
    public final InterfaceC1731706qJ LLJ;
    public final InterfaceC1731706qJ LLJI;
    public final InterfaceC1731706qJ LLJIJIL;
    public final InterfaceC1731706qJ LLJILJIL;
    public final InterfaceC1731706qJ LLJILJILJ;
    public final InterfaceC1731706qJ LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final InterfaceC1731706qJ LLJJJ;
    public a6n.a LLJJJIL;
    public final h0<C1647390syH> LLJJJJ;
    public final C560530Lyd<String> LLJJJJJIL;
    public final C385670FAf<C1647390syH> LLJJJJLIIL;
    public final LiveEvent<String> LLJJL;
    public final h0<Integer> LLJJLIIIJLLLLLLLZ;
    public final C1653210t7f LLJL;
    public final List<String> LLJLIL;
    public final C1653170t7b LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C560530Lyd<Boolean> LLJLLIL;
    public final C538770LBb<Integer> LLJLLL;
    public final C560530Lyd<Integer> LLJZ;
    public final C560530Lyd<Integer> LLJZIJLIL;
    public final r0 LLL;
    public final C01GW LLLF;
    public final Keva LLLFF;
    public final C01GW LLLFFI;
    public boolean LLLFZ;
    public boolean LLLI;
    public boolean LLLII;
    public volatile boolean LLLIIII;
    public final C01GW LLLIIIIL;
    public final C01GW LLLIIIL;
    public boolean LLLIIL;
    public boolean LLLIILIL;
    public boolean LLLIL;
    public final C01GW LLLILZ;

    private final boolean Q3(C19A3 c19a3, C1653090t7T c1653090t7T) {
        return true;
    }

    public final void onStartRecord() {
        showBottomTab(false);
        if (!this.LLILZLL) {
            H4(false);
        }
        this.LLJLILLLLZIIL.LIZJ(false);
        if (!this.LLILZLL) {
            G2().LIZJ(false);
        }
        ShortVideoContext shortVideoContext = getShortVideoContext();
        int i = shortVideoContext.shootedShootMode;
        int i2 = shortVideoContext.shootMode;
        if (i != i2) {
            shortVideoContext.shootedShootMode = i2;
            C1439190nYT.LJIIIZ(i2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [X.0t7h] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1653120t7W.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLLILZLLLI = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1653120t7W.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new C2217381BqS(C1653120t7W.class, "recordModeApi", "getRecordModeApi()Lcom/ss/android/ugc/aweme/shortvideo/ui/component/RecordModeApiComponent;", 0), new C2217381BqS(C1653120t7W.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new C2217381BqS(C1653120t7W.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0), new C2217381BqS(C1653120t7W.class, "recordPermissionApiComponent", "getRecordPermissionApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/ui/permissionmanager/RecordPermissionUIApiComponent;", 0), new C2217381BqS(C1653120t7W.class, "gestureApiComponent", "getGestureApiComponent()Lcom/bytedance/creativex/recorder/gesture/api/GestureApiComponent;", 0), new C2217381BqS(C1653120t7W.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0), new C2217381BqS(C1653120t7W.class, "stickerPanelComponent", "getStickerPanelComponent()Lcom/bytedance/creativex/recorder/sticker/api/StickerPanelApiComponent;", 0), new C2217381BqS(C1653120t7W.class, "liveApiComponent", "getLiveApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/live/LiveApiComponent;", 0), new C2217381BqS(C1653120t7W.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0), new C2217381BqS(C1653120t7W.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/shortvideo/ui/TikTokCameraBaseGroupScene;", 0), new C2217381BqS(C1653120t7W.class, "componentizationConfig", "getComponentizationConfig()Lcom/ss/android/ugc/aweme/shortvideo/ui/RecordContainerComponentizationConfig;", 0)};
        LLLILZJ = new Object() { // from class: X.0t7h
        };
        LLLIZZ = 8;
    }

    private final InterfaceC579050MnP Gp() {
        return (InterfaceC579050MnP) this.LLJJIII.getValue(this, LLLILZLLLI[8]);
    }

    private final void K4() {
        Iterator it2 = ((ArrayList) this.LLJLILLLLZIIL.LIZLLL).iterator();
        while (it2.hasNext()) {
            this.LLJLILLLLZIIL.LJIIL(((C1653090t7T) it2.next()).LIZ.LIZIZ);
        }
        this.LLJLILLLLZIIL.LIZIZ(-1, new C1653090t7T(new C1653330t7r(getActivity().getString(2131845844), "DUET_MODE_CAMERA_RECORD", "direct_shoot", false, null, null, false, null, null, 496), null));
        setCurrentTab("DUET_MODE_CAMERA_RECORD", true, 5, false);
    }

    private final AbstractC21664519qV W2() {
        return new AbstractC21664519qV() { // from class: X.0t7a
            @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                Integer numLIZJ;
                if (this.LL.getCameraApiComponent().St2().I4() || this.LL.getCameraApiComponent().yC() || this.LL.LLIZLLLIL.HF1() || (numLIZJ = this.LL.LLJJLIIIJLLLLLLLZ.LIZJ()) == null || numLIZJ.intValue() != 0) {
                    return false;
                }
                if (motionEvent != null && motionEvent2 != null) {
                    if (this.LL.getShortVideoContext().LJII() != 0) {
                        return false;
                    }
                    AbstractC21664519qV abstractC21664519qVZk1 = this.LL.getGestureApiComponent().zk1(1);
                    if (abstractC21664519qVZk1 != null && abstractC21664519qVZk1.onFling(motionEvent, motionEvent2, f, f2)) {
                        return true;
                    }
                    AbstractC21664519qV abstractC21664519qVZk12 = this.LL.getGestureApiComponent().zk1(6);
                    if (abstractC21664519qVZk12 != null && abstractC21664519qVZk12.onFling(motionEvent, motionEvent2, f, f2)) {
                        return true;
                    }
                    C1653120t7W c1653120t7W = this.LL;
                    if (!c1653120t7W.LLILZLL) {
                        TabHost tabHost = c1653120t7W.H2().LLJJIII;
                        if (tabHost == null) {
                            tabHost = null;
                        }
                        C444960Hcc.LIZJ(this.LL.getActivity());
                        if (motionEvent2.getX() > motionEvent.getX() && Math.abs(motionEvent.getX() - motionEvent2.getX()) > Math.abs(motionEvent.getY() - motionEvent2.getY())) {
                            this.LL.X1(tabHost);
                            return true;
                        }
                        if (motionEvent.getX() > motionEvent2.getX() && Math.abs(motionEvent2.getX() - motionEvent.getX()) > Math.abs(motionEvent.getY() - motionEvent2.getY())) {
                            this.LL.q3(tabHost);
                            return true;
                        }
                    }
                    return false;
                }
                return this instanceof r1k.a;
            }

            @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                Integer numLIZJ;
                if (this.LL.getCameraApiComponent().St2().I4() || this.LL.getCameraApiComponent().yC() || this.LL.LLIZLLLIL.HF1() || (numLIZJ = this.LL.LLJJLIIIJLLLLLLLZ.LIZJ()) == null || numLIZJ.intValue() != 0 || motionEvent == null || motionEvent2 == null || this.LL.getShortVideoContext().LJII() != 0) {
                    return false;
                }
                AbstractC21664519qV abstractC21664519qVZk1 = this.LL.getGestureApiComponent().zk1(1);
                if (abstractC21664519qVZk1 != null && abstractC21664519qVZk1.onScroll(motionEvent, motionEvent2, f, f2)) {
                    return true;
                }
                AbstractC21664519qV abstractC21664519qVZk12 = this.LL.getGestureApiComponent().zk1(6);
                if ((abstractC21664519qVZk12 == null || !abstractC21664519qVZk12.onScroll(motionEvent, motionEvent2, f, f2)) && Math.abs(motionEvent.getX() - motionEvent2.getX()) <= Math.abs(motionEvent.getY() - motionEvent2.getY())) {
                    return false;
                }
                return true;
            }
        };
    }

    private final C1653250t7j c3() {
        return (C1653250t7j) this.LLLIIIIL.getValue();
    }

    private final InterfaceC1647420syK getRecordAdapterApi() {
        return (InterfaceC1647420syK) this.LLJJI.getValue(this, LLLILZLLLI[7]);
    }

    private final InterfaceC1648570t0B getRecordControlApi() {
        return (InterfaceC1648570t0B) this.LLJI.getValue(this, LLLILZLLLI[1]);
    }

    private final InterfaceC1621970sJH getRecordModeApi() {
        return (InterfaceC1621970sJH) this.LLJIJIL.getValue(this, LLLILZLLLI[2]);
    }

    private final C1649450t1b getSwitchDurationConfigFactory() {
        return (C1649450t1b) this.LLLILZ.getValue();
    }

    private final void handleBackFromTextMode() {
        if (Intrinsics.LJFF(this.LLJLILLLLZIIL.LJI(), "RecordLighteningText")) {
            String strDefaultBottomTab = defaultBottomTab();
            if (strDefaultBottomTab != null) {
                r0 r0Var = this.LLL;
                TabHost tabHost = r0Var.LLJILLL;
                if (tabHost == null) {
                    tabHost = null;
                }
                tabHost.LJ(true, r0Var.LLLIIIIL(strDefaultBottomTab), 7, true);
            } else {
                this.LLL.LLLLIILL();
            }
        }
        if (this.LLILZLL || !Intrinsics.LJFF(G2().LJI(), "RecordLighteningText")) {
            return;
        }
        switchToPreviousTab();
    }

    private final TuxTextView i3() {
        return (TuxTextView) this.LLLFFI.getValue();
    }

    private final String o2() {
        C1653090t7T next;
        C1653330t7r c1653330t7r;
        Iterator<C1653090t7T> it2 = this.LLJLILLLLZIIL.LIZLLL.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            C1653070t7R.Companion.getClass();
            if (C1653070t7R.recordModelTags.contains(next.LIZ.LIZIZ)) {
                break;
            }
        }
        C1653090t7T c1653090t7T = next;
        if (c1653090t7T == null || (c1653330t7r = c1653090t7T.LIZ) == null) {
            return null;
        }
        return c1653330t7r.LIZIZ;
    }

    private final void o4() {
        this.LLJLILLLLZIIL.LIZJ(true);
        if (!this.LLILZLL) {
            G2().LIZJ(true);
        }
        showBottomTab(true);
        if (this.LLILZLL) {
            return;
        }
        H4(true);
    }

    private final RectF w2() {
        TabHost tabHost = this.LLL.LLJILLL;
        if (tabHost == null) {
            tabHost = null;
        }
        return C1428310nGv.LIZLLL(tabHost);
    }

    public final C1653170t7b G2() {
        return (C1653170t7b) this.LLJLL.getValue();
    }

    public final C1646700sxA H2() {
        return (C1646700sxA) this.LLLF.getValue();
    }

    @Override // X.InterfaceC1648020szI
    public int bottomTabSize() {
        return ((ArrayList) this.LLJLILLLLZIIL.LIZLLL).size();
    }

    @Override // X.InterfaceC1648020szI
    public String defaultBottomTab() {
        List<C1653090t7T> list = this.LLJLILLLLZIIL.LIZLLL;
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

    public final C19EG getActivity() {
        return (C19EG) this.LLJJIJIIJIL.getValue(this, LLLILZLLLI[10]);
    }

    public final e0 getCameraApiComponent() {
        return (e0) this.LLJ.getValue(this, LLLILZLLLI[0]);
    }

    public final C565600MGg getComponentizationConfig() {
        return (C565600MGg) this.LLJJJ.getValue(this, LLLILZLLLI[12]);
    }

    @Override // X.InterfaceC1648020szI
    public C1653330t7r getCurrentBottomTabItem() {
        return this.LLJLILLLLZIIL.LJFF();
    }

    @Override // X.InterfaceC1648020szI
    public C1653330t7r getCurrentBottomTabItemBeforeOnTabChanged() {
        C1653330t7r c1653330t7r = this.LLJLILLLLZIIL.LJIIL;
        return c1653330t7r == null ? getCurrentBottomTabItem() : c1653330t7r;
    }

    @Override // X.InterfaceC1647930sz9
    public String getCurrentBottomTag() {
        return this.LLJLILLLLZIIL.LJI();
    }

    @Override // X.InterfaceC1648020szI
    public List<C1653090t7T> getExistingTabs() {
        return this.LLJLILLLLZIIL.LIZLLL;
    }

    public final InterfaceC1648510t05 getGestureApiComponent() {
        return (InterfaceC1648510t05) this.LLJJ.getValue(this, LLLILZLLLI[6]);
    }

    public final InterfaceC1645840svm getLiveApiComponent() {
        return (InterfaceC1645840svm) this.LLJJIJI.getValue(this, LLLILZLLLI[9]);
    }

    public final InterfaceC1652190t61 getRecordPermissionApiComponent() {
        return (InterfaceC1652190t61) this.LLJILLL.getValue(this, LLLILZLLLI[5]);
    }

    public final TikTokCameraBaseGroupScene getRootScene() {
        return (TikTokCameraBaseGroupScene) this.LLJJIJIL.getValue(this, LLLILZLLLI[11]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLJILJIL.getValue(this, LLLILZLLLI[3]);
    }

    public final q getStickerApiComponent() {
        return (q) this.LLJILJILJ.getValue(this, LLLILZLLLI[4]);
    }

    @Override // X.InterfaceC1648020szI
    public void hidePopupForLiveTab() {
        C1653300t7o c1653300t7o = this.LLJLILLLLZIIL.LJI;
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
        return !C12WG.LIZIZ(this.LLILLJJLI);
    }

    public final InterfaceC1649550t1l m3() {
        return (InterfaceC1649550t1l) this.LLLIIIL.getValue();
    }

    @Override // X.InterfaceC1647930sz9
    public a6n.a provideRecordEnv() {
        a6n.a aVar = this.LLJJJIL;
        if (aVar == null) {
            return null;
        }
        return aVar;
    }

    @Override // X.InterfaceC1648020szI
    public void selectDefaultSubTab() {
        if (this.LLILZLL) {
            return;
        }
        z4(this.LLILLJJLI, G2().LIZLLL);
    }

    @Override // X.InterfaceC1648020szI
    public void showAllTabsAndExitDuetMode() {
        this.LLJLILLLLZIIL.LJIIL("DUET_MODE_CAMERA_RECORD");
        int i = 0;
        for (Object obj : (ArrayList) this.LLJLILLLLZIIL.LIZLLL) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            this.LLJLILLLLZIIL.LIZIZ(i, (C1653090t7T) obj);
            i = i2;
        }
        setCurrentTab("record_mode_duet", true, 6, false);
    }

    @Override // X.InterfaceC1648020szI
    public void switchToPreviousTab() {
        if (this.LLILZLL) {
            return;
        }
        TabHost tabHost = H2().LLJJIII;
        if (tabHost == null) {
            tabHost = null;
        }
        TabHost tabHost2 = H2().LLJJIII;
        tabHost.LIZLLL((tabHost2 != null ? tabHost2 : null).getLastIndex(), 7, true);
    }

    @Override // X.InterfaceC1648020szI
    public void tryShowPopupForLiveTab() {
        this.LLJLILLLLZIIL.LJIILL();
    }

    private final void O3() {
        getRecordControlApi().EP().LIZ(this, new AObjectS246S0100000_25(this, 348));
        getRecordControlApi().rr0().LIZ(this, new AObjectS246S0100000_25(this, 349));
    }

    private final EnumC560450LyV getCurrentBottomTab() {
        String currentBottomTag = getCurrentBottomTag();
        return (isRecordTab(currentBottomTag) || isStoryOrPhotoTab(currentBottomTag)) ? EnumC560450LyV.RECORD : Intrinsics.LJFF(currentBottomTag, "record_mode_editor_tab") ? EnumC560450LyV.CREATE : EnumC560450LyV.OTHERS;
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
        InterfaceC566960MLm storyService;
        C385670FAf<Boolean> c385670FAfCP1;
        super.onCreate();
        getRecordAdapterApi().eH1(this);
        Object objLJ = this.LLILLJJLI.getScope().LJ("record_env_context");
        if (objLJ == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        a6n.a aVar = (a6n.a) objLJ;
        this.LLJJJIL = aVar;
        this.LLJLILLLLZIIL.LJIIIZ(aVar, this.LLILZ, this.LLJJJJ, this.LLJJJJJIL);
        if (this.LLILZLL) {
            for (InterfaceC1653190t7d interfaceC1653190t7d : this.LLILZIL) {
                a6n.a aVar2 = this.LLJJJIL;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                interfaceC1653190t7d.initialize(aVar2);
            }
        } else {
            C1653170t7b c1653170t7bG2 = G2();
            a6n.a aVar3 = this.LLJJJIL;
            if (aVar3 == null) {
                aVar3 = null;
            }
            c1653170t7bG2.LJIIIZ(aVar3, this.LLILZIL, this.LLJJJJ, this.LLJJJJJIL);
        }
        List<C1653090t7T> list = this.LLJLILLLLZIIL.LIZLLL;
        if (onlyShowLiveTab(this.LLILLJJLI)) {
            return;
        }
        ArrayList<C1653090t7T> arrayList = (ArrayList) list;
        for (C1653090t7T c1653090t7T : arrayList) {
            if (c1653090t7T.LIZIZ != null && Q3(this.LLILLJJLI, c1653090t7T)) {
                C19A3 c19a3 = this.LLILLJJLI;
                AbstractC1653180t7c abstractC1653180t7c = c1653090t7T.LIZIZ;
                C1658150tFd.LIZ(c19a3, R.id.sz5, abstractC1653180t7c, abstractC1653180t7c.getTag());
            }
        }
        this.LLILLJJLI.add(R.id.sz5, this.LLL, "RecordBottomTabScene");
        init(this.LLILLJJLI, arrayList);
        r0 r0Var = this.LLL;
        boolean zLIZIZ = C539900LFk.LIZIZ(getShortVideoContext());
        TabHost tabHost = r0Var.LLJILLL;
        (tabHost != null ? tabHost : null).setTabHostDisableParentScroll(zLIZIZ);
        if (!this.LLILZLL) {
            ArrayList<C1653090t7T> arrayList2 = (ArrayList) G2().LIZLLL;
            for (C1653090t7T c1653090t7T2 : arrayList2) {
                if (c1653090t7T2.LIZIZ != null && Q3(this.LLILLJJLI, c1653090t7T2)) {
                    C19A3 c19a32 = this.LLILLJJLI;
                    AbstractC1653180t7c abstractC1653180t7c2 = c1653090t7T2.LIZIZ;
                    C1658150tFd.LIZ(c19a32, R.id.sz5, abstractC1653180t7c2, abstractC1653180t7c2.getTag());
                }
            }
            this.LLILLJJLI.add(R.id.sz5, H2(), "ComplexLighteningTabScene");
            v3(this.LLILLJJLI, arrayList2);
        }
        if (C1443960ngA.LJIIIZ(getShortVideoContext())) {
            showBottomTab(false);
        }
        this.LLJJL.LIZ(this, new AObjectS246S0100000_25(this, 359));
        getBottomTabIndexChangeEvent().LIZ(this, new AObjectS246S0100000_25(this, 360));
        getRecordControlApi().xk1().LJ(this, new AObjectS246S0100000_25(this, 361));
        getRecordControlApi().cJ0().LIZ(this, new AObjectS246S0100000_25(this, 362));
        this.LLJZ.LIZ(this, new AObjectS246S0100000_25(this, 363));
        this.LLJZIJLIL.LIZ(this, new AObjectS246S0100000_25(this, 350));
        getRecordControlApi().pU1().LIZ(this, new AObjectS246S0100000_25(this, 351));
        getRecordControlApi().xM2().LIZ(this, new AObjectS246S0100000_25(this, 352));
        getRecordControlApi().zx2().LIZ(this, new AObjectS246S0100000_25(this, 353));
        InterfaceC1621970sJH recordModeApi = getRecordModeApi();
        if (recordModeApi != null && (c385670FAfCP1 = recordModeApi.CP1()) != null) {
            c385670FAfCP1.LIZ(this, new AObjectS246S0100000_25(this, 354));
        }
        getCameraApiComponent().bu2().LIZ(this, new AObjectS246S0100000_25(this, 355));
        getCameraApiComponent().Dm2().LIZ(this, new AObjectS246S0100000_25(this, 356));
        getRecordAdapterApi().fJ0().LIZ(this, new AObjectS246S0100000_25(this, 357));
        IAVServiceProxy iAVServiceProxy = (IAVServiceProxy) PluggableExtentionKt.pluggableSpi$default(IAVServiceProxy.class, false, false, false, 14, null);
        if (iAVServiceProxy != null && (storyService = iAVServiceProxy.getStoryService()) != null && storyService.LJI()) {
            getGestureApiComponent().AL1(W2(), 4, 200);
        }
        this.LLL.LLJILJILJ.LIZ(this, new AObjectS246S0100000_25(this, 358));
        O3();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        getRecordAdapterApi().eH1(null);
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        super.onPause();
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", "LighteningBottomTabComponent onPause");
        C560380LyO.LJIIZILJ = getCurrentBottomTab();
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", "LighteningBottomTabComponent onResume");
        EnumC560450LyV currentBottomTab = getCurrentBottomTab();
        C560380LyO.LJIIZILJ(currentBottomTab, getShortVideoContext(), null);
        C560380LyO.LJIILLIIL(new C560470LyX(currentBottomTab, System.currentTimeMillis()));
    }

    @Override // X.AbstractC2255721DQs
    public void onStart() {
        super.onStart();
        setDefaultSelectedTab(this.LLILLJJLI, this.LLJLILLLLZIIL.LIZLLL);
        handleBackFromTextMode();
    }

    private final h0<Integer> T2() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC1647930sz9
    public C385670FAf<C1647390syH> getBottomTabIndexChangeEvent() {
        return this.LLJJJJLIIL;
    }

    @Override // X.AbstractC1171700gb2, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLL;
    }

    public final C19A3 getParentScene() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1648020szI
    public List<String> getPrevTabTags() {
        return this.LLJLIL;
    }

    @Override // X.AbstractC1171700gb2, X.InterfaceC1648020szI
    public boolean isBottomTabThemeDarkMode() {
        return this.LLLII;
    }

    @Override // X.AbstractC2255721DQs
    public InterfaceC1648020szI getApiComponent() {
        return this.LLIZ;
    }

    private final void F4(int i) {
        this.LLJLLL.LJII(Integer.valueOf(i));
    }

    private final void e4(String str) {
        this.LLJJJJJIL.LJIIJ(str);
    }

    private final void mobDefaultBottomTabChange(String str) {
        InterfaceC1638550sk1 interfaceC1638550sk1 = (InterfaceC1638550sk1) getDiContainer().LJIIL(null, InterfaceC1638550sk1.class);
        if (interfaceC1638550sk1 != null && interfaceC1638550sk1.hy()) {
            return;
        }
        Integer numLIZJ = this.LLJJLIIIJLLLLLLLZ.LIZJ();
        if (numLIZJ != null && numLIZJ.intValue() == 0) {
            return;
        }
        H3(new C1647390syH("by_default", str, 0, false, false, false, null, false, false, 504));
    }

    private final boolean onlyShowLiveTab(C19A3 c19a3) {
        C1653090t7T next;
        List<C1653090t7T> list = this.LLJLILLLLZIIL.LIZLLL;
        if (!getShortVideoContext().onlyShowLiveTab) {
            return false;
        }
        Iterator<C1653090t7T> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.LIZ.LIZIZ, "record_mode_live")) {
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
            C1658150tFd.LIZ(c19a3, R.id.sz5, this.LLL, "RecordBottomTabScene");
            c19a3.add(R.id.sz5, abstractC1653180t7c, abstractC1653180t7c.getTag());
        }
        changeToDefaultTab(this, c19a3, c1653090t7T, false);
        this.LLJLILLLLZIIL.LJIILJJIL(c1653090t7T);
        mobDefaultBottomTabChange(c1653090t7T.LIZ.LIZIZ);
        return true;
    }

    public final boolean E3(C1647390syH c1647390syH) {
        if (C330830Cy1.LIZ() && TextUtils.equals("AISelf", String.valueOf(c1647390syH.LIZ))) {
            return c1647390syH.LJ;
        }
        return true;
    }

    public final void H3(C1647390syH c1647390syH) {
        Object next;
        C1653330t7r c1653330t7r;
        String str;
        C1653330t7r c1653330t7r2;
        C1653330t7r c1653330t7r3;
        if (c1647390syH.LIZLLL) {
            if (c1647390syH.LJII && c1647390syH.LIZ != null) {
                return;
            }
            Object obj = null;
            if (this.LLILZLL) {
                Iterator it2 = ((ArrayList) this.LLJLILLLLZIIL.LIZLLL).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next2 = it2.next();
                    if (Intrinsics.LJFF(((C1653090t7T) next2).LIZ.LIZIZ, c1647390syH.LIZIZ)) {
                        obj = next2;
                        break;
                    }
                }
                C1653090t7T c1653090t7T = (C1653090t7T) obj;
                if (c1653090t7T == null || (c1653330t7r3 = c1653090t7T.LIZ) == null || (str = c1653330t7r3.LIZJ) == null) {
                    return;
                }
            } else {
                Iterator it3 = ((ArrayList) G2().LIZLLL).iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next = it3.next();
                        if (Intrinsics.LJFF(((C1653090t7T) next).LIZ.LIZIZ, c1647390syH.LIZIZ)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C1653090t7T c1653090t7T2 = (C1653090t7T) next;
                if (c1653090t7T2 == null || (c1653330t7r2 = c1653090t7T2.LIZ) == null || (str = c1653330t7r2.LIZJ) == null) {
                    Iterator it4 = ((ArrayList) this.LLJLILLLLZIIL.LIZLLL).iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        Object next3 = it4.next();
                        if (Intrinsics.LJFF(((C1653090t7T) next3).LIZ.LIZIZ, c1647390syH.LIZIZ)) {
                            obj = next3;
                            break;
                        }
                    }
                    C1653090t7T c1653090t7T3 = (C1653090t7T) obj;
                    if (c1653090t7T3 == null || (c1653330t7r = c1653090t7T3.LIZ) == null) {
                        return;
                    } else {
                        str = c1653330t7r.LIZJ;
                    }
                }
            }
            C1446240njq c1446240njq = C1446240njq.LIZ;
            ShortVideoContext shortVideoContext = getShortVideoContext();
            int i = c1647390syH.LIZJ;
            boolean z = c1647390syH.LJII;
            c1446240njq.getClass();
            C1446240njq.LIZJ(shortVideoContext, i, str, z);
        }
    }

    public final void H4(boolean z) {
        if (Intrinsics.LJFF(getCurrentBottomTag(), "RecordLightening") || (Intrinsics.LJFF(getCurrentBottomTag(), "RecordBottomDMCamera") && C294760Bgw.LIZ())) {
            H2().LLLILZ(z);
        }
    }

    public final void X1(TabHost tabHost) {
        if (tabHost.getCurrentIndex() > 0) {
            tabHost.LIZLLL(tabHost.getCurrentIndex() - 1, 3, true);
        }
    }

    public final void Z1(boolean z) {
        InterfaceC566960MLm storyService;
        IAVServiceProxy iAVServiceProxy = (IAVServiceProxy) PluggableExtentionKt.pluggableSpi$default(IAVServiceProxy.class, false, false, false, 14, null);
        if (iAVServiceProxy != null && (storyService = iAVServiceProxy.getStoryService()) != null && storyService.LJI()) {
            if (!z) {
                if (!this.LLLIIII) {
                    getGestureApiComponent().WL(c3());
                    this.LLLIIII = true;
                    return;
                }
                return;
            }
            if (!this.LLLIIII) {
                return;
            }
            getGestureApiComponent().eL2(c3());
            this.LLLIIII = false;
        }
    }

    @Override // X.InterfaceC1648020szI
    public void clearAIBrandTextByTag(String str) {
        this.LLL.LLLIL(str);
    }

    @Override // X.InterfaceC1648020szI
    public void configSwitchDuration(C1648150szV c1648150szV) {
        getSwitchDurationConfigFactory().onEvent(c1648150szV);
    }

    @Override // X.InterfaceC1648020szI
    public C1653090t7T findBottomTabByTag(String str) {
        return this.LLJLILLLLZIIL.LIZLLL(str);
    }

    @Override // X.InterfaceC1648020szI
    public View getHostViewByIndex(int i) {
        TabHost tabHost = this.LLL.LLJILLL;
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
        return this.LLL.LLLIIIIL(str);
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
        InterfaceC1626180sQ4 interfaceC1626180sQ4BG0;
        q stickerApiComponent = getStickerApiComponent();
        if (stickerApiComponent != null) {
            C1624010sMZ.LJII(stickerApiComponent, null);
        }
        q stickerApiComponent2 = getStickerApiComponent();
        if (stickerApiComponent2 != null && (interfaceC1626180sQ4BG0 = stickerApiComponent2.bG0()) != null) {
            interfaceC1626180sQ4BG0.LIZIZ();
        }
        getShortVideoContext().LJJLIIIJL(false);
        this.LLIZLLLIL.m10(true);
        getRecordControlApi().xP1(true, false, true);
        this.LLIZLLLIL.oL1();
    }

    public final boolean isRecordTab(String str) {
        if (!Intrinsics.LJFF(str, "RecordShoot15s") && !Intrinsics.LJFF(str, "RecordShoot60s") && !Intrinsics.LJFF(str, "RecordShoot180s") && !Intrinsics.LJFF(str, "RecordShoot600s") && !Intrinsics.LJFF(str, "RecordNow") && !Intrinsics.LJFF(str, "record_mode_combine") && !Intrinsics.LJFF(str, "record_mode_shoot")) {
            return false;
        }
        return true;
    }

    public final boolean isStoryOrPhotoTab(String str) {
        return C13LP.LJJJJ(str, C1697810uHb.LJIIJJI(getActivity().getString(2131845852), getActivity().getString(2131845854), getActivity().getString(2131845851), getActivity().getString(2131845850), getActivity().getString(2131845859), getActivity().getString(2131845861), "RecordBottomStory", "RecordBottomDMCamera"));
    }

    @Override // X.InterfaceC1648020szI
    public void notifyBottomTabIndexChange(C1647390syH c1647390syH) {
        this.LLJJJJ.LJII(c1647390syH);
        IBottomTabChangeService iBottomTabChangeService = (IBottomTabChangeService) PluggableExtentionKt.pluggableSpi$default(IBottomTabChangeService.class, false, false, false, 14, null);
        if (iBottomTabChangeService != null) {
            iBottomTabChangeService.LIZLLL(this.LLJJJJ.LIZJ().LIZIZ);
        }
    }

    public final void q3(TabHost tabHost) {
        if (tabHost.getCurrentIndex() < tabHost.getTabCount() - 1) {
            tabHost.LIZLLL(tabHost.getCurrentIndex() + 1, 3, true);
        }
    }

    @Override // X.InterfaceC1648020szI
    public void resetToCurTab(String str) {
        int iLLLIIIIL;
        if ((!C300070BpV.LIZ() || !Intrinsics.LJFF(this.LLL.LLLII(), str)) && (iLLLIIIIL = this.LLL.LLLIIIIL(str)) >= 0) {
            this.LLL.LLLIZZ(iLLLIIIIL, false, false);
        }
    }

    @Override // X.InterfaceC1648020szI
    public void setBottomTabEndMargin(int i) {
        this.LLJZIJLIL.LJIIJ(Integer.valueOf(i));
    }

    @Override // X.InterfaceC1648020szI
    public void setBottomTabStartMargin(int i) {
        this.LLJZ.LJIIJ(Integer.valueOf(i));
    }

    @Override // X.InterfaceC1648020szI
    public void setBottomTabWidgetGestureListener(InterfaceC1653650t8N interfaceC1653650t8N) {
        TabHost tabHost = this.LLL.LLJILLL;
        if (tabHost == null) {
            tabHost = null;
        }
        tabHost.setBottomTabWidgetGestureListener(interfaceC1653650t8N);
    }

    @Override // X.InterfaceC1648020szI
    public void setTabSwitchEnabled(boolean z) {
        this.LLL.setTabSwitchEnabled(z);
    }

    @Override // X.InterfaceC1648020szI
    public void showBottomTab(boolean z) {
        C1402840mbq c1402840mbq;
        q stickerApiComponent;
        q stickerApiComponent2;
        Effect effectLLILIL;
        LiveEvent<Boolean> liveEventDN1;
        this.LLLI = z;
        if ((getShortVideoContext().LJJJJZ() && !getShortVideoContext().LJJIJIIJI()) || getShortVideoContext().LJJJ() || getShortVideoContext().creativeModel.editorProAIGCInfoModel.aiPlaygroundCameraModel.fromAiPlayground || (((c1402840mbq = getShortVideoContext().shareContext) != null && c1402840mbq.isLinkShare) || getShortVideoContext().LJJIIJZLJL() || (((stickerApiComponent = getStickerApiComponent()) != null && (liveEventDN1 = stickerApiComponent.dN1()) != null && Intrinsics.LJFF(liveEventDN1.LJI(), Boolean.TRUE)) || this.LLLFZ || getShortVideoContext().LJJIJ() || getShortVideoContext().creativeModel.aigcOfflineModel.isOfflineAIGCEffectGenerating || C539900LFk.LJI(getShortVideoContext()) || ((Intrinsics.LJFF(this.LLIZLLLIL.RS().LIZJ(), Boolean.FALSE) && (stickerApiComponent2 = getStickerApiComponent()) != null && (effectLLILIL = stickerApiComponent2.C0().LLILIL()) != null && C1624550sNR.LIZIZ(effectLLILIL)) || C1649780t28.LIZ(getShortVideoContext()) || C1649780t28.LIZIZ(getShortVideoContext()))))) {
            this.LLJLLIL.LJIIJ(Boolean.FALSE);
            return;
        }
        TuxTextView tuxTextViewI3 = i3();
        if (tuxTextViewI3 != null) {
            C786410Ut5.LLLLZLL(tuxTextViewI3, 8);
        }
        this.LLJLLIL.LJIIJ(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1648020szI
    public void showComplexTab(boolean z) {
        if (!this.LLILZLL) {
            H2().LLLILZ(z);
        }
    }

    public final void showExitSharedARSessionDialog(String str) {
        C1397620mTQ c1397620mTQ = new C1397620mTQ(getActivity());
        c1397620mTQ.LJFF(2131848040, new AwS139S1100000_25(this, str, 5));
        c1397620mTQ.LJII(2131830038, AFwS266S0000000_25.get$arr$(280));
        C1397580mTM c1397580mTM = new C1397580mTM(getActivity());
        c1397580mTM.LJFF(2131848042);
        c1397580mTM.LIZ(2131848041);
        c1397580mTM.LJIIL = c1397620mTQ;
        c1397580mTM.LJII = false;
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    public final boolean skipPermissionCheck(C1647390syH c1647390syH) {
        if (c1647390syH.LIZ == null) {
            if (Intrinsics.LJFF("template_schema", getShortVideoContext().creativeModel.templateSchemaData.schemaTag) || Intrinsics.LJFF("editor_tab", getShortVideoContext().creativeModel.landingModel.landingTab)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1648020szI
    public void switchDarkLightThemeMode(boolean z) {
        this.LLL.LLLLIIIILLL(z);
        this.LLLII = z;
    }

    @Override // X.InterfaceC1648020szI
    public void updateBottomDotRes(int i) {
        this.LLL.LLLLILI(i);
    }

    @Override // X.InterfaceC1648020szI
    public void updateDotVisibility(boolean z) {
        this.LLL.LLLLIL(z);
    }

    private final void init(C19A3 c19a3, List<C1653090t7T> list) {
        String str;
        C1653090t7T next;
        C1653090t7T next2;
        C1653330t7r c1653330t7r;
        Iterator<C1653090t7T> it2 = list.iterator();
        while (it2.hasNext()) {
            observeBottomTabVisibility(c19a3, it2.next());
        }
        this.LLJLLIL.LIZ(c19a3, new AObjectS306S0200000_25((Object) new C259800zU(), (Object) c19a3, (InterfaceC1648570t0B) 11));
        Iterator<C1653090t7T> it3 = list.iterator();
        while (true) {
            str = null;
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
            if (!Intrinsics.LJFF(((C1653090t7T) C13LP.LJJJJZI(list)).LIZ.LIZIZ, "AISelf")) {
                Iterator<C1653090t7T> it4 = list.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        next2 = it4.next();
                        if (next2.LIZ.LIZLLL) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                C1653090t7T c1653090t7T2 = next2;
                if (c1653090t7T2 != null && (c1653330t7r = c1653090t7T2.LIZ) != null) {
                    str = c1653330t7r.LIZIZ;
                }
                if (!Intrinsics.LJFF("record_mode_editor_tab", str)) {
                    changeToDefaultTab(this, c19a3, c1653090t7T, true);
                    return;
                }
            }
            changeToDefaultTab(this, c19a3, c1653090t7T, false);
        }
    }

    private final void observeBottomTabVisibility(C19A3 c19a3, C1653090t7T c1653090t7T) {
        if (!C12WG.LIZIZ(c19a3) && !c19a3.mViewDestroyed) {
            c1653090t7T.LIZJ.observe(C1447800nmM.LIZIZ(c19a3), new AObjectS185S0300000_25(c19a3, c1653090t7T, this, 14));
        }
    }

    private final void setDefaultSelectedTab(C19A3 c19a3, List<C1653090t7T> list) {
        C1653090t7T next;
        if (this.LLLIILIL) {
            return;
        }
        this.LLLIILIL = true;
        this.LLLIL = false;
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
            changeToDefaultTab(this, c19a3, c1653090t7T, false);
            this.LLJLILLLLZIIL.LJIILJJIL(c1653090t7T);
        }
    }

    private final void v3(C19A3 c19a3, List<C1653090t7T> list) {
        Iterator<C1653090t7T> it2 = list.iterator();
        while (it2.hasNext()) {
            observeBottomTabVisibility(c19a3, it2.next());
        }
    }

    private final void z4(C19A3 c19a3, List<C1653090t7T> list) {
        C1653090t7T next;
        if (this.LLLIL) {
            return;
        }
        this.LLLIL = true;
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
            changeToDefaultTab(this, c19a3, c1653090t7T, false);
            G2().LJIILJJIL(c1653090t7T);
        }
    }

    @Override // X.InterfaceC1647930sz9
    public void setBottomSelectedTextColor(int i, int i2) {
        TabHost tabHost = this.LLL.LLJILLL;
        if (tabHost == null) {
            tabHost = null;
        }
        tabHost.LJIIIIZZ(i, i2, false);
    }

    @Override // X.InterfaceC1648020szI
    public void showAIBrandTextByTag(String str, C1655280tB0 c1655280tB0) {
        this.LLL.LLLJL(str, c1655280tB0);
    }

    @Override // X.InterfaceC1648020szI
    public void showComplexTab(int i, C1647390syH c1647390syH) {
        if (!this.LLILZLL) {
            H2().LLJJIJIL = c1647390syH;
            this.LLJJLIIIJLLLLLLLZ.LJII(Integer.valueOf(i));
        }
    }

    private final void B3(int i, InterfaceC1653190t7d interfaceC1653190t7d, int i2) {
        a6n.a aVar;
        C19A3 c19a3 = this.LLILLJJLI;
        Iterator it2 = ((ArrayList) this.LLJLILLLLZIIL.LIZLLL).iterator();
        while (true) {
            aVar = null;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (Intrinsics.LJFF(((C1653090t7T) next).LIZ.LIZIZ, EnumC1647570syZ.LIVE.getTag())) {
                if (next != null) {
                    C1653320t7q.LIZ.getClass();
                    C1653320t7q.LIZ(211, "addLiveBottomTab");
                    return;
                }
            }
        }
        C1653170t7b c1653170t7b = this.LLJLILLLLZIIL;
        a6n.a aVar2 = this.LLJJJIL;
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
            C12WG.LIZLLL(c19a3, new ARunnableS58S0300000_25(this, c19a3, c1653090t7TLIZ, 6), 500L);
        }
    }

    @Override // X.InterfaceC1648020szI
    public void addLiveBottomTab(int i, InterfaceC1653190t7d interfaceC1653190t7d, int i2) {
        B3(i, interfaceC1653190t7d, i2);
    }

    public static final void changeToDefaultTab(C1653120t7W c1653120t7W, C19A3 c19a3, C1653090t7T c1653090t7T, boolean z) {
        Scene sceneFindSceneByTag = c19a3.findSceneByTag("RecordBottomTabScene");
        if (sceneFindSceneByTag != null) {
            r0 r0Var = (r0) sceneFindSceneByTag;
            int iLLLIIIIL = r0Var.LLLIIIIL(c1653090t7T.LIZ.LIZIZ);
            if (iLLLIIIIL >= 0) {
                r0Var.LLLIZZ(iLLLIIIIL, z, true);
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.InterfaceC1648020szI
    public void setCurrentTab(String str, boolean z, int i, boolean z2) {
        this.LLJLILLLLZIIL.LJIILIIL(str, z, i, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1653120t7W(C19A3 c19a3, C1DRG c1drg, List<? extends InterfaceC1653190t7d> list, List<? extends InterfaceC1653190t7d> list2, boolean z) {
        this.LLILLJJLI = c19a3;
        this.LLILLL = c1drg;
        this.LLILZ = list;
        this.LLILZIL = list2;
        this.LLILZLL = z;
        a aVar = (a) getDiContainer().LJII(a.class, null);
        this.LLIZLLLIL = aVar;
        this.LLJ = C1664770tQJ.LIZ(getDiContainer(), e0.class, null);
        this.LLJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648570t0B.class, null);
        this.LLJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1621970sJH.class, null);
        this.LLJILJIL = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
        this.LLJILJILJ = C1664770tQJ.LIZIZ(getDiContainer(), q.class, null);
        this.LLJILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1652190t61.class, null);
        this.LLJJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648510t05.class, null);
        this.LLJJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1647420syK.class, null);
        this.LLJJIII = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC579050MnP.class, null);
        this.LLJJIJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1645840svm.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZ(getDiContainer(), TikTokCameraBaseGroupScene.class, null);
        this.LLJJJ = C1664770tQJ.LIZIZ(getDiContainer(), C565600MGg.class, null);
        h0<C1647390syH> h0Var = new h0<>(new C1647390syH(null, "RecordShoot15s", 0, false, false, false, null, false, true, 240));
        this.LLJJJJ = h0Var;
        C560530Lyd<String> c560530Lyd = new C560530Lyd<>();
        this.LLJJJJJIL = c560530Lyd;
        this.LLJJJJLIIL = h0Var;
        this.LLJJL = c560530Lyd;
        this.LLJJLIIIJLLLLLLLZ = new h0<>(8);
        this.LLJL = new C1653210t7f(0);
        this.LLJLIL = new ArrayList();
        C1653170t7b c1653170t7b = new C1653170t7b(getCameraApiComponent(), LifecycleOwnerKt.getLifecycleScope(c19a3));
        this.LLJLILLLLZIIL = c1653170t7b;
        this.LLJLL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 517));
        this.LLJLLIL = new C560530Lyd<>();
        this.LLJLLL = new C538770LBb<>(null);
        this.LLJZ = new C560530Lyd<>();
        this.LLJZIJLIL = new C560530Lyd<>();
        this.LLL = new r0(getShortVideoContext(), c1653170t7b, aVar.va());
        this.LLLF = C452501pT.LIZIZ(new AwS569S0100000_25(this, 519));
        this.LLLFF = Keva.getRepo("repo_story_show_guide_hint");
        this.LLLFFI = C452501pT.LIZIZ(new AwS569S0100000_25(this, 520));
        this.LLLI = true;
        this.LLLII = true;
        this.LLLIIIIL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(272));
        this.LLLIIIL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(273));
        this.LLLILZ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS569S0100000_25(this, 518));
    }
}
