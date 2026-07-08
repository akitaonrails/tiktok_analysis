package X;

import Y.AObserverS227S0100000_25;
import Y.ARunnableS94S0200000_25;
import android.app.Activity;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.als.LiveEvent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.Pair;
import kotlin.text.a0;
import lth.o;
import mn3.e0;

/* JADX INFO: renamed from: X.0t2P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1649950t2P extends AbstractC2255721DQs<InterfaceC1645840svm> implements InterfaceC1645840svm, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public static final int LLJIJIL;
    public final C1DRG LL;
    public final C560530Lyd<Pair<Effect, Integer>> LLILLJJLI = new C560530Lyd<>();
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), C565600MGg.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), TikTokCameraBaseGroupScene.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1649090t11.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1648020szI.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), e0.class, null);
    public boolean LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1649950t2P.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1649950t2P.class, "componentizationConfig", "getComponentizationConfig()Lcom/ss/android/ugc/aweme/shortvideo/ui/RecordContainerComponentizationConfig;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1649950t2P.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/shortvideo/ui/TikTokCameraBaseGroupScene;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1649950t2P.class, "surfaceSizeAdapter", "getSurfaceSizeAdapter()Lcom/ss/android/ugc/aweme/utils/SurfaceSizeAdapter;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1649950t2P.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C1649950t2P.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0);
        c09r3.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6};
        LLJIJIL = 8;
    }

    public InterfaceC1645840svm Z1() {
        return this;
    }

    private final InterfaceC1648020szI Op() {
        return (InterfaceC1648020szI) this.LLIZ.getValue(this, LLJI[4]);
    }

    private final void X1() {
        C1645790svh.LIZJ.LIZ(getShortVideoContext().liveSourceParams).observe(this, new AObserverS227S0100000_25(this, 14));
    }

    private final C565600MGg getComponentizationConfig() {
        return (C565600MGg) this.LLILZ.getValue(this, LLJI[1]);
    }

    private final TikTokCameraBaseGroupScene getRootScene() {
        return (TikTokCameraBaseGroupScene) this.LLILZIL.getValue(this, LLJI[2]);
    }

    public final e0 getCameraApiComponent() {
        return (e0) this.LLIZLLLIL.getValue(this, LLJI[5]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLILLL.getValue(this, LLJI[0]);
    }

    public final InterfaceC1649090t11 w2() {
        return (InterfaceC1649090t11) this.LLILZLL.getValue(this, LLJI[3]);
    }

    private final void G2() {
        String str = getShortVideoContext().shootWay;
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("content_type", "normal_type");
        c0lab.LJ("shoot_way", str);
        C2341909Fp.LIZ("shoot_live_tab_alert_show", c0lab.LIZ);
    }

    public final void H2() {
        View previewView = getCameraApiComponent().getPreviewView();
        HandlerHook.viewPost(previewView, new ARunnableS94S0200000_25(previewView, this, 6));
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        TikTokCameraBaseGroupScene rootScene;
        C385670FAf<C1647390syH> bottomTabIndexChangeEvent;
        super.onCreate();
        C565600MGg componentizationConfig = getComponentizationConfig();
        if (componentizationConfig != null && componentizationConfig.LIZ) {
            G2();
            X1();
        }
        TikTokCameraBaseGroupScene rootScene2 = getRootScene();
        if (rootScene2 != null) {
            rootScene2.LJLJJL(new InterfaceC1655690tBf() { // from class: X.0t2Q
                @Override // X.InterfaceC1655690tBf
                public final void onConfigurationChanged(Configuration configuration) {
                    InterfaceC1649090t11 interfaceC1649090t11W2;
                    C1649950t2P c1649950t2P = this.LIZ;
                    if (c1649950t2P.LLJ) {
                        c1649950t2P.H2();
                    } else {
                        if (!C07MV.LIZ() || (interfaceC1649090t11W2 = this.LIZ.w2()) == null) {
                            return;
                        }
                        interfaceC1649090t11W2.LIZ(null, this.LIZ.getCameraApiComponent().getPreviewView(), this.LIZ.getCameraApiComponent().St2().getViewFunction().getView(), true);
                    }
                }
            });
        }
        if (((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).a()) {
            InterfaceC1648020szI interfaceC1648020szIOp = Op();
            if (interfaceC1648020szIOp != null && (bottomTabIndexChangeEvent = interfaceC1648020szIOp.getBottomTabIndexChangeEvent()) != null) {
                bottomTabIndexChangeEvent.LIZ(this, new InterfaceC1441305kZ() { // from class: X.0t25
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Object obj) {
                        CharSequence charSequence;
                        Object obj2 = ((C1647390syH) obj).LIZIZ;
                        if (obj2 instanceof CharSequence) {
                            charSequence = (CharSequence) obj2;
                        } else {
                            charSequence = null;
                        }
                        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).N5(C1647580sya.LIZJ(charSequence));
                    }
                });
            }
            if (TextUtils.isEmpty(getShortVideoContext().liveSourceParams) || !a0.LJJIIZI(getShortVideoContext().liveSourceParams, "live_end_page", false) || (rootScene = getRootScene()) == null) {
                return;
            }
            W1(rootScene);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        C565600MGg componentizationConfig = getComponentizationConfig();
        if (componentizationConfig == null || !componentizationConfig.LIZ) {
            return;
        }
        C1645790svh c1645790svh = C1645790svh.LIZJ;
        c1645790svh.LIZIZ = null;
        InterfaceC1635410sex interfaceC1635410sex = c1645790svh.LIZ;
        if (interfaceC1635410sex != null) {
            interfaceC1635410sex.destroy();
        }
        c1645790svh.LIZ = null;
        o.LJIILL.getClass();
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).P3().LJIIIIZZ();
    }

    @Override // X.InterfaceC1645840svm
    public /* bridge */ /* synthetic */ LiveEvent fB2() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        Z1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C560530Lyd<Pair<Effect, Integer>> o2() {
        return this.LLILLJJLI;
    }

    public C1649950t2P(C1DRG c1drg) {
        this.LL = c1drg;
    }

    public final void W1(Scene scene) {
        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(scene);
        if (navigationSceneLIZ != null && navigationSceneLIZ.LLLLLIL(scene)) {
            navigationSceneLIZ.LLLILZ(scene, EnumC569750MWf.FROM_TRANSLUCENT);
            InterfaceC20597015ii interfaceC20597015iiLJ = C20622515mp.LJ(scene);
            if (interfaceC20597015iiLJ != null) {
                interfaceC20597015iiLJ.ac(scene);
            }
        }
    }

    @Override // X.InterfaceC1645840svm
    public void YC2(boolean z, boolean z2) {
        TikTokCameraBaseGroupScene rootScene;
        TikTokCameraBaseGroupScene rootScene2;
        if (z) {
            H2();
            if (C290640BaI.LIZ() && (rootScene2 = getRootScene()) != null) {
                rootScene2.LLJJL = false;
            }
            this.LLJ = true;
        }
        if (z2) {
            if (C290640BaI.LIZ() && (rootScene = getRootScene()) != null) {
                rootScene.LLJJL = true;
            }
            if (C07MV.LIZ()) {
                Activity activityLIZ = C1388190mED.LIZ(C1664590tQ1.LJIIIZ(this));
                if (activityLIZ != null) {
                    activityLIZ.setRequestedOrientation(-1);
                }
                Activity activityLIZ2 = C1388190mED.LIZ(C1664590tQ1.LJIIIZ(this));
                if (activityLIZ2 != null) {
                    activityLIZ2.setRequestedOrientation(13);
                }
            }
            View previewView = getCameraApiComponent().getPreviewView();
            C786410Ut5.Ob(previewView, 1.0f);
            C786410Ut5.pc(previewView, 1.0f);
            TikTokCameraBaseGroupScene rootScene3 = getRootScene();
            if (rootScene3 != null) {
                rootScene3.LLLLLJIL();
            }
            this.LLJ = false;
        }
    }

    @Override // X.InterfaceC1645840svm
    public void r02(Effect effect, int i) {
        this.LLILLJJLI.LJIIJ(new Pair<>(effect, Integer.valueOf(i)));
    }
}
