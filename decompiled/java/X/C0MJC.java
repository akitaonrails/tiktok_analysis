package X;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleKt;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene;
import com.ss.android.ugc.aweme.shortvideo.x2;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.effectmanager.effect.model.AimeEffectExtensionKt;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.Serializable;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.text.a0;
import lnn.q;

/* JADX INFO: renamed from: X.0MJC, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MJC extends AbstractC1622390sJx implements InterfaceC1623110sL7, InterfaceC566130MIh, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public final Activity LLILLJJLI;
    public final LifecycleOwner LLILLL;
    public final C1DRG LLILZ;
    public final InterfaceC1624480sNK LLILZIL;
    public final C0LH1 LLILZLL;
    public final InterfaceC1630630sXF LLIZ;
    public final InterfaceC1652470t6T LLIZLLLIL;
    public final FrameLayout LLJ;
    public final C1664750tQH LLJI;
    public final C1664750tQH LLJIJIL;
    public final C1664750tQH LLJILJIL;
    public Effect LLJILLL;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(139));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 202));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS552S0100000_8(this, 195));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS552S0100000_8(this, 203));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS552S0100000_8(this, 204));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 200));
    public final AwS552S0100000_8 LLJJIJIL = new AwS552S0100000_8(this, 199);
    public final C01GW<InterfaceC566190MIn> LLJJJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 198));
    public String LLJJJJJIL = "";
    public final ViewOnLayoutChangeListenerC580900MqO LLJJJJLIIL = new ViewOnLayoutChangeListenerC580900MqO(this, 1);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0MJC.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0MJC.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0MJC.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        c09r3.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    @Override // X.InterfaceC566130MIh
    public final void LJ() {
    }

    @Override // X.InterfaceC566130MIh
    public final void LJIJI() {
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIFFI() {
        View backgroundView;
        if (this.LLJILLL == null) {
            return;
        }
        if (this.LLJJJ.isInitialized()) {
            InterfaceC566190MIn interfaceC566190MInLJJIIJZLJL = LJJIIJZLJL();
            if (interfaceC566190MInLJJIIJZLJL != null) {
                interfaceC566190MInLJJIIJZLJL.LIZLLL();
            }
            InterfaceC566190MIn interfaceC566190MInLJJIIJZLJL2 = LJJIIJZLJL();
            if (interfaceC566190MInLJJIIJZLJL2 != null && (backgroundView = interfaceC566190MInLJJIIJZLJL2.getBackgroundView()) != null) {
                LJJIIZ().St2().getViewFunction().removeView(backgroundView);
            }
        }
        LJJIIZ().St2().getViewFunction().getView().removeOnLayoutChangeListener(this.LLJJJJLIIL);
        this.LLJILLL = null;
        InterfaceC1630630sXF interfaceC1630630sXF = this.LLIZ;
        if (interfaceC1630630sXF != null) {
            interfaceC1630630sXF.zn1(null);
        }
        FrameLayout frameLayout = this.LLJ;
        if (frameLayout != null) {
            C786410Ut5.LJJJZ((View) this.LLJJIJI.getValue(), frameLayout);
        }
    }

    public final InterfaceC566190MIn LJJIIJZLJL() {
        return this.LLJJJ.getValue();
    }

    public final InterfaceC1650230t2r LJJIIZ() {
        return (InterfaceC1650230t2r) this.LLJILJIL.getValue(this, LLJJL[2]);
    }

    public final q LJJIIZI() {
        return (q) this.LLJIJIL.getValue(this, LLJJL[1]);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC566130MIh
    public final void LJIILIIL(Effect effect) {
        LJIJJ(effect, true);
    }

    @Override // X.AbstractC1622390sJx
    public final boolean LJJI(C1627370sRz c1627370sRz) {
        new Object() { // from class: X.0MJG
        }.getClass();
        if (C1624550sNR.LIZIZ(c1627370sRz.LIZ) && C535390KzB.LIZ() && !C1624200sMs.LIZLLL(c1627370sRz.LIZ)) {
            return true;
        }
        return false;
    }

    public final void LJJIIJ(Effect effect) {
        String propSource;
        ViewGroup viewGroup;
        View backgroundView;
        InterfaceC20520115Rf viewFunction = LJJIIZ().St2().getViewFunction();
        InterfaceC566190MIn interfaceC566190MInLJJIIJZLJL = LJJIIJZLJL();
        if (interfaceC566190MInLJJIIJZLJL != null && (backgroundView = interfaceC566190MInLJJIIJZLJL.getBackgroundView()) != null && backgroundView.getParent() == null) {
            LJJIJ(backgroundView);
            viewFunction.addView(backgroundView);
        }
        LJJIIZ().St2().getViewFunction().getView().addOnLayoutChangeListener(this.LLJJJJLIIL);
        View view = (View) this.LLJJIJI.getValue();
        ViewParent parent = null;
        if (view != null) {
            parent = view.getParent();
        }
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C786410Ut5.LJJJLZIJ((View) this.LLJJIJI.getValue(), viewGroup);
        }
        FrameLayout frameLayout = this.LLJ;
        if (frameLayout != null) {
            frameLayout.addView((View) this.LLJJIJI.getValue(), 0);
        }
        InterfaceC566190MIn interfaceC566190MInLJJIIJZLJL2 = LJJIIJZLJL();
        if (interfaceC566190MInLJJIIJZLJL2 != null) {
            String coverUrl = AimeEffectExtensionKt.getCoverUrl(effect);
            String effectId = effect.getEffectId();
            String resourceId = effect.getResourceId();
            FaceStickerBean faceStickerBeanJr = LJJIIZI().jr();
            if (faceStickerBeanJr == null || (propSource = faceStickerBeanJr.getPropSource()) == null) {
                propSource = "other";
            }
            interfaceC566190MInLJJIIJZLJL2.LJ(coverUrl, effectId, resourceId, propSource);
        }
        InterfaceC1630630sXF interfaceC1630630sXF = this.LLIZ;
        if (interfaceC1630630sXF != null) {
            interfaceC1630630sXF.zn1(new AwS587S0100000_8(this, 119));
        }
    }

    public final void LJJIJ(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        int i2;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        View previewView = LJJIIZ().getPreviewView();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(previewView.getWidth(), previewView.getHeight());
        ViewGroup.LayoutParams layoutParams2 = previewView.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        } else {
            marginLayoutParams = null;
        }
        int i3 = 0;
        if (marginLayoutParams != null) {
            i = marginLayoutParams.topMargin;
        } else {
            i = 0;
        }
        layoutParams.topMargin = i;
        ViewGroup.LayoutParams layoutParams3 = previewView.getLayoutParams();
        if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
            i2 = marginLayoutParams3.leftMargin;
        } else {
            i2 = 0;
        }
        layoutParams.leftMargin = i2;
        ViewGroup.LayoutParams layoutParams4 = previewView.getLayoutParams();
        if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
            i3 = marginLayoutParams2.rightMargin;
        }
        layoutParams.rightMargin = i3;
        if (view != null) {
            C786410Ut5.W5(view, layoutParams);
        }
    }

    @Override // X.InterfaceC566130MIh
    public final void LJIJJ(Effect effect, boolean z) {
        if (!z) {
            LJJIFFI();
            this.LLJILLL = effect;
        } else {
            if (effect == null) {
                return;
            }
            LJJIIJ(effect);
        }
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIII(C1623370sLX c1623370sLX, C1627370sRz c1627370sRz) {
        Effect effect;
        C0MJE c0mje;
        String string;
        Serializable serializable;
        Bundle bundle;
        LJJIFFI();
        this.LLJILLL = c1627370sRz.LIZ;
        Bundle bundle2 = c1627370sRz.LJ;
        boolean z = false;
        if ((bundle2 != null && bundle2.getBoolean("start_scan_face_immediately")) || (((C0MIK) this.LLJJ.getValue()).LJIILLIIL == C0MIP.SCANNING && c1627370sRz.LIZJ == EnumC1448980noG.RECOVER)) {
            ((C0MIK) this.LLJJ.getValue()).LIZ();
            EnumC1448980noG enumC1448980noG = c1627370sRz.LIZJ;
            EnumC1448980noG enumC1448980noG2 = EnumC1448980noG.RECOVER;
            if (enumC1448980noG != enumC1448980noG2 && (bundle = c1627370sRz.LJ) != null) {
                this.LLJJJIL = bundle.getBoolean("is_from_editor_tab");
                this.LLJJJJ = bundle.getBoolean("arg_is_editor_pro_outlinker");
                String string2 = bundle.getString("arg_editor_pro_outlinker");
                if (string2 == null) {
                    string2 = "";
                }
                this.LLJJJJJIL = string2;
            }
            C0MIQ c0miq = (C0MIQ) this.LLJJIII.getValue();
            boolean z2 = this.LLJJJIL;
            boolean z3 = this.LLJJJJ;
            String str = this.LLJJJJJIL;
            Effect effect2 = this.LLJILLL;
            c0miq.getClass();
            String string3 = null;
            if (c1627370sRz.LIZJ != enumC1448980noG2) {
                if (Build.VERSION.SDK_INT >= 33) {
                    Bundle bundle3 = c1627370sRz.LJ;
                    if (bundle3 != null) {
                        c0mje = (C0MJE) bundle3.getSerializable("start_scan_face_entry", C0MJE.class);
                        if (c0mje == null) {
                        }
                    }
                    c0mje = C0MJE.START_SCAN_FACE_ENTRY_EFFECT_PANEL;
                } else {
                    Bundle bundle4 = c1627370sRz.LJ;
                    if (bundle4 != null) {
                        serializable = bundle4.getSerializable("start_scan_face_entry");
                    } else {
                        serializable = null;
                    }
                    if (serializable instanceof C0MJE) {
                        c0mje = (C0MJE) serializable;
                        if (c0mje == null) {
                        }
                    }
                    c0mje = C0MJE.START_SCAN_FACE_ENTRY_EFFECT_PANEL;
                }
            } else {
                c0mje = null;
            }
            Bundle bundle5 = c1627370sRz.LJ;
            if (bundle5 != null) {
                z = bundle5.getBoolean("scan_face_entry_white_t_shirt");
            }
            Bundle bundle6 = c1627370sRz.LJ;
            if (bundle6 != null) {
                string = bundle6.getString("scan_face_entry_source_style_id");
            } else {
                string = null;
            }
            Bundle bundle7 = c1627370sRz.LJ;
            if (bundle7 != null) {
                string3 = bundle7.getString("scan_face_previous_tab_switch_tag");
            }
            C0MIQ.LIZ(c0miq, c0mje, z, string, null, z2, z3, str, string3, effect2, 8);
            return;
        }
        if ((((C0MIK) this.LLJJ.getValue()).LJIILLIIL == C0MIP.GENERATING && c1627370sRz.LIZJ == EnumC1448980noG.RECOVER) || (effect = this.LLJILLL) == null) {
            return;
        }
        LJJIIJ(effect);
    }

    @Override // X.InterfaceC1623110sL7
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        String effectId;
        if (C294080Bfq.LIZ() && !this.LLILLL.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            return;
        }
        TikTokCameraBaseGroupScene tikTokCameraBaseGroupScene = (TikTokCameraBaseGroupScene) this.LLILZ.LJIIL(null, TikTokCameraBaseGroupScene.class);
        if (tikTokCameraBaseGroupScene != null) {
            x2 x2VarLLLLLLZ = tikTokCameraBaseGroupScene.LLLLLLZ();
            if (x2VarLLLLLLZ != null) {
                tikTokCameraBaseGroupScene = x2VarLLLLLLZ;
            }
        } else {
            tikTokCameraBaseGroupScene = null;
        }
        if (C294080Bfq.LIZ() && (tikTokCameraBaseGroupScene == null || tikTokCameraBaseGroupScene.mActivity == null)) {
            return;
        }
        C0MJF c0mjf = (C0MJF) this.LLJJIJIIJIL.getValue();
        Effect effect = this.LLJILLL;
        if (effect != null) {
            effectId = effect.getEffectId();
        } else {
            effectId = null;
        }
        boolean z = this.LLJJJIL;
        boolean z2 = this.LLJJJJ;
        String str2 = this.LLJJJJJIL;
        c0mjf.getClass();
        if (i != 41) {
            if (i == 69 && str != null && effectId != null) {
                C0MIK c0mik = c0mjf.LIZ;
                LifecycleCoroutineScope lifecycleCoroutineScopeAndroidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope = LifecycleKt.androidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope(c0mik.LJFF.getLifecycle());
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(lifecycleCoroutineScopeAndroidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope, C2107308Nj.LIZ, null, new C0MII(c0mik, str, effectId, null), 2);
                return;
            }
            return;
        }
        if (str == null) {
            return;
        }
        if (a0.LJJIIZI(str, "countdown", false)) {
            C566110MIf.LIZ.getClass();
            C566110MIf.LIZIZ(i2);
        } else {
            if (!a0.LJJIIZI(str, "photoTaken", false)) {
                return;
            }
            C566110MIf.LIZ.getClass();
            C566110MIf.LJFF(null, str2, z, z2);
        }
    }

    public C0MJC(C19GS c19gs, LifecycleOwner lifecycleOwner, C1DRG c1drg, InterfaceC1624480sNK interfaceC1624480sNK, C1622460sK4 c1622460sK4, InterfaceC1630630sXF interfaceC1630630sXF, InterfaceC1652470t6T interfaceC1652470t6T, FrameLayout frameLayout) {
        this.LLILLJJLI = c19gs;
        this.LLILLL = lifecycleOwner;
        this.LLILZ = c1drg;
        this.LLILZIL = interfaceC1624480sNK;
        this.LLILZLL = c1622460sK4;
        this.LLIZ = interfaceC1630630sXF;
        this.LLIZLLLIL = interfaceC1652470t6T;
        this.LLJ = frameLayout;
        this.LLJI = C1664770tQJ.LIZ(c1drg, ShortVideoContext.class, null);
        this.LLJIJIL = C1664770tQJ.LIZ(c1drg, q.class, null);
        this.LLJILJIL = C1664770tQJ.LIZ(c1drg, InterfaceC1650230t2r.class, null);
    }
}
