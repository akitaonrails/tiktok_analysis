package X;

import Y.ARunnableS108S0100000_8;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene;
import com.ss.android.ugc.aweme.shortvideo.x2;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS409S0200000_8;
import lnn.q;

/* JADX INFO: renamed from: X.0MIl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C566170MIl extends AbstractC2255721DQs<InterfaceC566220MIq> implements InterfaceC566220MIq, InterfaceC379610EuV {
    public static final C566200MIo LLJIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public static final int LLJILJILJ;
    public final C1DRG LL;
    public final InterfaceC566190MIn LLILLJJLI;
    public final InterfaceC566130MIh LLILLL;
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), q.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650230t2r.class, null);
    public final x2 LLILZLL;
    public final C19A3 LLIZ;
    public Effect LLIZLLLIL;
    public final C581250Mqx LLJ;
    public C0MIN LLJI;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0MIo] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C566170MIl.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C566170MIl.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0)};
        LLJIJIL = new Object() { // from class: X.0MIo
        };
        LLJILJILJ = 8;
    }

    public InterfaceC566220MIq W1() {
        return this;
    }

    private final q getStickerApiComponent() {
        return (q) this.LLILZ.getValue(this, LLJILJIL[0]);
    }

    public final InterfaceC1650230t2r getCameraApiComponent() {
        return (InterfaceC1650230t2r) this.LLILZIL.getValue(this, LLJILJIL[1]);
    }

    public final void o2() {
        NavigationScene navigationSceneLIZ;
        C19A3 c19a3 = this.LLIZ;
        if (c19a3 == null || (navigationSceneLIZ = C1447800nmM.LIZ(c19a3)) == null) {
            return;
        }
        navigationSceneLIZ.LLLLLL();
        getCameraApiComponent().Zl0(new C1663770tOh(true, false, false));
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    private final void X1(NavigationScene navigationScene) {
        InterfaceC1623190sLF interfaceC1623190sLFU;
        if (!C523910Kgf.LIZIZ(navigationScene, C0MIN.class)) {
            InterfaceC1623190sLF interfaceC1623190sLFU2 = getStickerApiComponent().U();
            if (interfaceC1623190sLFU2 != null && interfaceC1623190sLFU2.isShowing() && (interfaceC1623190sLFU = getStickerApiComponent().U()) != null) {
                interfaceC1623190sLFU.V0();
            }
            x2 x2Var = this.LLILZLL;
            if (x2Var != null) {
                C12WG.LIZLLL(x2Var, new ARunnableS108S0100000_8(this, 23), 200L);
            }
        }
    }

    @Override // X.InterfaceC566220MIq
    public void Ey(Effect effect) {
        View view;
        LifecycleOwner lifecycleOwner;
        NavigationScene navigationSceneLIZ;
        this.LLIZLLLIL = effect;
        C19A3 c19a3 = this.LLIZ;
        if (c19a3 != null && (navigationSceneLIZ = C1447800nmM.LIZ(c19a3)) != null) {
            X1(navigationSceneLIZ);
            w2(navigationSceneLIZ, effect.getName());
        }
        C0MIN c0min = this.LLJI;
        if (c0min != null && (view = c0min.mView) != null && (lifecycleOwner = ViewTreeLifecycleOwner.get(view)) != null) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new C566180MIm(this, null), 3);
        }
    }

    private final void w2(NavigationScene navigationScene, String str) {
        ViewGroup viewGroupLJFF;
        if (!C523910Kgf.LIZIZ(navigationScene, C0MIN.class)) {
            C0MIN c0min = new C0MIN();
            AwS409S0200000_8 awS409S0200000_8 = new AwS409S0200000_8(this, navigationScene, 31);
            AFwS194S0000000_8 aFwS194S0000000_8 = AFwS194S0000000_8.get$arr$(137);
            InterfaceC566190MIn interfaceC566190MIn = this.LLILLJJLI;
            if (interfaceC566190MIn != null) {
                viewGroupLJFF = interfaceC566190MIn.LJFF();
            } else {
                viewGroupLJFF = null;
            }
            c0min.LLJJI = awS409S0200000_8;
            c0min.LLJJIII = null;
            c0min.LLJJIJI = aFwS194S0000000_8;
            c0min.LLJJIJIIJIL = str;
            c0min.LLJJIJIL = viewGroupLJFF;
            c0min.LLJJJ = false;
            this.LLJI = c0min;
            navigationScene.LLLLLLLLLL(c0min, null);
        }
    }

    public final void Z1(InterfaceC566130MIh interfaceC566130MIh, NavigationScene navigationScene) {
        this.LLJI = null;
        Effect effect = this.LLIZLLLIL;
        if (effect != null) {
            interfaceC566130MIh.LJIILIIL(effect);
            o2();
        }
        navigationScene.LLLLLLLZIL(this.LLJ);
    }

    public C566170MIl(C1DRG c1drg, InterfaceC566190MIn interfaceC566190MIn, InterfaceC566130MIh interfaceC566130MIh) {
        x2 x2VarLLLLLLZ;
        this.LL = c1drg;
        this.LLILLJJLI = interfaceC566190MIn;
        this.LLILLL = interfaceC566130MIh;
        C19A3 c19a3LLLLLLLZIL = null;
        TikTokCameraBaseGroupScene tikTokCameraBaseGroupScene = (TikTokCameraBaseGroupScene) getDiContainer().LJIIL(null, TikTokCameraBaseGroupScene.class);
        if (tikTokCameraBaseGroupScene != null) {
            x2VarLLLLLLZ = tikTokCameraBaseGroupScene.LLLLLLZ();
        } else {
            x2VarLLLLLLZ = null;
        }
        this.LLILZLL = x2VarLLLLLLZ;
        if (x2VarLLLLLLZ != null) {
            c19a3LLLLLLLZIL = x2VarLLLLLLZ;
        } else {
            TikTokCameraBaseGroupScene tikTokCameraBaseGroupScene2 = (TikTokCameraBaseGroupScene) getDiContainer().LJIIL(null, TikTokCameraBaseGroupScene.class);
            if (tikTokCameraBaseGroupScene2 != null) {
                c19a3LLLLLLLZIL = tikTokCameraBaseGroupScene2.LLLLLLLZIL();
            }
        }
        this.LLIZ = c19a3LLLLLLLZIL;
        this.LLJ = new C581250Mqx(this, 1);
    }
}
