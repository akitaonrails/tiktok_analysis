package X;

import Y.ARunnableS77S0200000_8;
import android.app.Activity;
import android.os.Looper;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.aime.IAIMEServices;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene;
import com.ss.android.ugc.aweme.shortvideo.x2;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AwS137S0400000_8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import lnn.q;

/* JADX INFO: renamed from: X.0MIK, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MIK {
    public final C0LH1 LIZ;
    public final InterfaceC1624480sNK LIZIZ;
    public final C1DRG LIZJ;
    public final InterfaceC1650230t2r LIZLLL;
    public final IAIMEServices LJ;
    public final LifecycleOwner LJFF;
    public final q LJI;
    public final InterfaceC566130MIh LJII;
    public final Activity LJIIIIZZ;
    public final ShortVideoContext LJIIIZ;
    public final String LJIIJ;
    public boolean LJIIL;
    public String LJIILIIL;
    public List<C0MI6> LJIILJJIL;
    public Effect LJIILL;
    public C0MIP LJIILLIIL;
    public C0MJE LJIIZILJ;
    public Effect LJIJ;
    public C0MIN LJIJI;
    public boolean LJIJJLI;
    public final C19A3 LJJ;
    public final C19A3 LJJI;
    public final InterfaceC1648020szI LJJIFFI;
    public final C0MIO LJJII;
    public String LJIIJJI = "";
    public Boolean LJIJJ = Boolean.FALSE;
    public String LJIL = "";

    public final void LIZ() {
        NavigationScene navigationSceneLIZ;
        this.LJIJI = null;
        C0MIO c0mio = this.LJJII;
        if (c0mio != null) {
            c0mio.n7();
        }
        C19A3 c19a3 = this.LJJI;
        if (c19a3 == null || (navigationSceneLIZ = C1447800nmM.LIZ(c19a3)) == null || !C523910Kgf.LIZIZ(navigationSceneLIZ, C0MIN.class)) {
            return;
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this.LJFF);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C527740Kmq(navigationSceneLIZ, null), 2);
    }

    public final void LIZIZ() {
        this.LJIILLIIL = C0MIP.FAILED;
        String strJ4 = this.LJIIL ? C786410Ut5.j4(new Regex("\\{1\\}").replace(new StringBuilder(this.LJIIIIZZ.getString(2131825911)), "%s"), Arrays.copyOf(new Object[]{this.LJIIIIZZ.getString(2131825841)}, 1)) : this.LJIIIIZZ.getString(2131825877);
        Activity activity = this.LJIIIIZZ;
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.message(strJ4);
        C1390380mHk.LIZ(activity, 6015, creativeToastBuilder);
    }

    public final void LJ() {
        this.LJIILLIIL = C0MIP.SCANNING;
        C0MIO c0mio = this.LJJII;
        if (c0mio != null) {
            c0mio.n7();
        }
        C0MIO c0mio2 = this.LJJII;
        if (c0mio2 != null) {
            c0mio2.Rn2();
        }
        C0MIN c0min = this.LJIJI;
        if (c0min != null) {
            Integer num = 0;
            ((C13FE) c0min.LLJILLL).setValue(EnumC1668730tWh.DEFAULT_EMPTY_PREVIEW);
            if (num != null) {
                int iIntValue = num.intValue();
                ((C13FE) c0min.LLJJ).setValue(Integer.valueOf(iIntValue));
            }
        }
        this.LIZ.LIZ();
        Effect effect = this.LJIILL;
        if (effect != null) {
            C786410Ut5.LJLIIL(500L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS77S0200000_8(this, effect, 7));
        }
    }

    public final void LIZLLL(InterfaceC566130MIh interfaceC566130MIh) {
        InterfaceC1648020szI interfaceC1648020szI;
        C0MIP c0mip = C0MIP.NOT_STARTED;
        this.LJIILLIIL = c0mip;
        C0MIO c0mio = this.LJJII;
        if (c0mio != null) {
            c0mio.n7();
        }
        this.LIZ.LIZ();
        C0MJE c0mje = this.LJIIZILJ;
        if (c0mje != null) {
            int i = C0MJD.LIZ[c0mje.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        ((AbstractC214814194y) this.LIZJ.LJII(TikTokCameraBaseGroupScene.class, null)).finish();
                        return;
                    }
                    throw new C1954807lC();
                }
                Effect effect = this.LJIJ;
                if (effect != null) {
                    interfaceC566130MIh.LJIILIIL(effect);
                    LJFF(false);
                    return;
                }
                return;
            }
            String str = this.LJIILIIL;
            if (str != null) {
                this.LJIILLIIL = c0mip;
                LIZ();
                if (!Intrinsics.LJFF(this.LJIJJ, Boolean.TRUE) && (interfaceC1648020szI = this.LJJIFFI) != null) {
                    interfaceC1648020szI.showBottomTab(true);
                }
                InterfaceC1648020szI interfaceC1648020szI2 = this.LJJIFFI;
                if (interfaceC1648020szI2 != null) {
                    interfaceC1648020szI2.setCurrentTab(str, false, 1, false);
                }
            }
        }
    }

    public final void LJFF(boolean z) {
        this.LJIILLIIL = C0MIP.NOT_STARTED;
        LIZ();
        if (!Intrinsics.LJFF(this.LJIJJ, Boolean.TRUE) || z) {
            this.LIZLLL.Zl0(new C1663770tOh(true, false, false));
        }
    }

    public final void LIZJ(InterfaceC566130MIh interfaceC566130MIh, NavigationScene navigationScene, InterfaceC1737690vJv interfaceC1737690vJv) {
        String resourceId;
        String str;
        Effect effect;
        if (this.LJIILLIIL == C0MIP.SCANNING) {
            C341540DaC.LIZ(this.LJIIIIZZ, new AwS137S0400000_8(this, interfaceC566130MIh, navigationScene, interfaceC1737690vJv, 4));
            return;
        }
        C566110MIf c566110MIf = C566110MIf.LIZ;
        String str2 = this.LJIIJJI;
        String str3 = this.LJIIIZ.shootWay;
        if (str2.length() > 0 && (effect = this.LJIJ) != null) {
            resourceId = effect.getResourceId();
        } else {
            resourceId = null;
        }
        if (this.LJIILLIIL == C0MIP.GENERATING) {
            str = "generate_page";
        } else {
            str = "fail_page";
        }
        c566110MIf.getClass();
        C566110MIf.LIZ(str2, str2, str3, resourceId, str);
        LIZLLL(interfaceC566130MIh);
        navigationScene.LLLLLLLZIL(interfaceC1737690vJv);
    }

    public C0MIK(C0LH1 c0lh1, InterfaceC1624480sNK interfaceC1624480sNK, C1DRG c1drg, InterfaceC1650230t2r interfaceC1650230t2r, IAIMEServices iAIMEServices, LifecycleOwner lifecycleOwner, q qVar, C0MJC c0mjc, Activity activity, ShortVideoContext shortVideoContext, String str) {
        TikTokCameraBaseGroupScene tikTokCameraBaseGroupSceneLLLLLLLZIL;
        InterfaceC1648020szI interfaceC1648020szI;
        C19EG c19eg;
        AbstractC1650170t2l abstractC1650170t2l;
        C1DRG diContainer;
        this.LIZ = c0lh1;
        this.LIZIZ = interfaceC1624480sNK;
        this.LIZJ = c1drg;
        this.LIZLLL = interfaceC1650230t2r;
        this.LJ = iAIMEServices;
        this.LJFF = lifecycleOwner;
        this.LJI = qVar;
        this.LJII = c0mjc;
        this.LJIIIIZZ = activity;
        this.LJIIIZ = shortVideoContext;
        this.LJIIJ = str;
        C0MIO c0mioLIZJ = null;
        TikTokCameraBaseGroupScene tikTokCameraBaseGroupScene = (TikTokCameraBaseGroupScene) c1drg.LJIIL(null, TikTokCameraBaseGroupScene.class);
        if (tikTokCameraBaseGroupScene != null) {
            x2 x2VarLLLLLLZ = tikTokCameraBaseGroupScene.LLLLLLZ();
            if (x2VarLLLLLLZ != null) {
                tikTokCameraBaseGroupScene = x2VarLLLLLLZ;
            }
        } else {
            tikTokCameraBaseGroupScene = null;
        }
        this.LJJ = tikTokCameraBaseGroupScene;
        boolean z = tikTokCameraBaseGroupScene instanceof x2;
        if (!z || (tikTokCameraBaseGroupSceneLLLLLLLZIL = tikTokCameraBaseGroupScene) == null) {
            TikTokCameraBaseGroupScene tikTokCameraBaseGroupScene2 = (TikTokCameraBaseGroupScene) c1drg.LJIIL(null, TikTokCameraBaseGroupScene.class);
            if (tikTokCameraBaseGroupScene2 != null) {
                tikTokCameraBaseGroupSceneLLLLLLLZIL = tikTokCameraBaseGroupScene2.LLLLLLLZIL();
            } else {
                tikTokCameraBaseGroupSceneLLLLLLLZIL = null;
            }
        }
        this.LJJI = tikTokCameraBaseGroupSceneLLLLLLLZIL;
        if (z && (abstractC1650170t2l = (AbstractC1650170t2l) tikTokCameraBaseGroupScene) != null && (diContainer = abstractC1650170t2l.getDiContainer()) != null) {
            interfaceC1648020szI = (InterfaceC1648020szI) diContainer.LJIIL(null, InterfaceC1648020szI.class);
        } else {
            interfaceC1648020szI = null;
        }
        this.LJJIFFI = interfaceC1648020szI;
        if (tikTokCameraBaseGroupScene != null) {
            Activity activity2 = tikTokCameraBaseGroupScene.mActivity;
            if (activity2 instanceof C19EG) {
                c19eg = (C19EG) activity2;
            } else {
                c19eg = null;
            }
            if (C294080Bfq.LIZ()) {
                if (c19eg != null && iAIMEServices != null) {
                    c0mioLIZJ = iAIMEServices.LJIIL(c19eg, tikTokCameraBaseGroupScene);
                }
            } else if (iAIMEServices != null) {
                c0mioLIZJ = iAIMEServices.LIZJ(tikTokCameraBaseGroupScene);
            }
        }
        this.LJJII = c0mioLIZJ;
    }
}
