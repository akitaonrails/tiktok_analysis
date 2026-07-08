package X;

import Y.ACListenerS159S0100000_25;
import Y.AObjectS206S0300000_25;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.AigcMetadataModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.nows.experiment.AIGCPhotoGenerationOptimization;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.aweme.shortvideo.d4;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.progress.f;
import lnn.q;

/* JADX INFO: renamed from: X.0szy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1648440szy implements InterfaceC1648550t09 {
    public final C1648430szx LIZ;
    public C1648450szz LIZIZ;

    @Override // X.InterfaceC1648550t09
    public final boolean LIZIZ() {
        return false;
    }

    @Override // X.InterfaceC1648550t09
    public final InterfaceC1648710t0P LIZ() {
        return this.LIZ;
    }

    public static boolean LIZJ(q qVar) {
        Effect effectLLILIL;
        if (qVar == null || qVar.C0() == null || (effectLLILIL = qVar.C0().LLILIL()) == null || !C1449600npG.LJIIIIZZ(effectLLILIL)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.0szx, X.0t0P] */
    public C1648440szy(final Scene scene, final InterfaceC1650230t2r interfaceC1650230t2r, final InterfaceC1648570t0B interfaceC1648570t0B, final q qVar, final ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N, final ShortVideoContext shortVideoContext, final ACListenerS159S0100000_25 aCListenerS159S0100000_25, final a aVar) {
        final C19EG c19eg = (C19EG) scene.requireActivity();
        ?? r0 = new InterfaceC1648710t0P() { // from class: X.0szx
            public boolean LIZ = true;
            public long LIZIZ;

            @Override // X.InterfaceC1648710t0P
            public final boolean O0() {
                Context sceneContext = scene.getSceneContext();
                if (sceneContext == null) {
                    return false;
                }
                return C1448730nnr.LIZ(interfaceC1650230t2r, sceneContext);
            }

            @Override // X.InterfaceC1648710t0P
            public final void R2() {
                if (C1621910sJB.LIZ(qVar)) {
                    shortVideoContext.creativeModel.aigcMetadataModel.generationTriggerType = C0LXV.LONG_PRESS_TO_RECORD.getType();
                }
                if (C1648440szy.LIZJ(qVar)) {
                    C1644050sst c1644050sst = new C1644050sst("v2v_long_press");
                    c1644050sst.LJI = true;
                    interfaceC1648570t0B.h81(c1644050sst);
                }
            }

            @Override // X.InterfaceC1648710t0P
            public final void S2() {
                if (C1621910sJB.LIZ(qVar)) {
                    shortVideoContext.creativeModel.aigcMetadataModel.generationTriggerType = C0LXV.CLICK_TO_RECORD.getType();
                }
            }

            @Override // X.InterfaceC1648710t0P
            public final void W2() {
                C1638140sjM.LIZ(EnumC1647590syb.LIGHTENING);
                aCListenerS159S0100000_25.onClick(viewOnTouchListenerC1648690t0N);
            }

            @Override // X.InterfaceC1648710t0P
            public final void p2() {
                viewOnTouchListenerC1648690t0N.setCurrentScaleMode(0);
                interfaceC1650230t2r.j8();
                if (interfaceC1648570t0B.isRecording().LIZJ().booleanValue()) {
                    C1403170mcN c1403170mcN = C1403170mcN.LIZ;
                    ShortVideoContext shortVideoContext2 = shortVideoContext;
                    c1403170mcN.getClass();
                    C1403170mcN.LIZ(shortVideoContext2);
                }
            }

            @Override // X.InterfaceC1648710t0P
            public final void Q2() {
                InterfaceC1642030spd interfaceC1642030spdWk2;
                InterfaceC1648250szf interfaceC1648250szfLIZJ;
                this.LIZIZ = System.currentTimeMillis();
                C1638140sjM.LIZ(EnumC1647590syb.LIGHTENING);
                if (C1448790nnx.LIZ) {
                    C1448790nnx.LIZ = false;
                    C1448790nnx.LIZJ("record_start");
                }
                interfaceC1648570t0B.l60(null);
                C1648450szz c1648450szz = this.LJIIJJI.LIZIZ;
                if (c1648450szz != null) {
                    ImageView imageView = c1648450szz.LIZ.LLLILZ;
                    if (imageView == null) {
                        imageView = null;
                    }
                    C786410Ut5.LJZI(8, imageView);
                    f fVar = c1648450szz.LIZ;
                    AigcMetadataModel aigcMetadataModel = fVar.LLJILJILJ.creativeModel.aigcMetadataModel;
                    if (aigcMetadataModel.isAIGCEffectRedesignEnabled) {
                        if (aigcMetadataModel.isAigcEffect) {
                            ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N2 = fVar.LLLIIL;
                            if (viewOnTouchListenerC1648690t0N2 == null) {
                                viewOnTouchListenerC1648690t0N2 = null;
                            }
                            viewOnTouchListenerC1648690t0N2.setMinDurationForLongPressConsideration(10);
                        } else {
                            ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N3 = fVar.LLLIIL;
                            if (viewOnTouchListenerC1648690t0N3 == null) {
                                viewOnTouchListenerC1648690t0N3 = null;
                            }
                            viewOnTouchListenerC1648690t0N3.setMinDurationForLongPressConsideration(600);
                        }
                    }
                    f fVar2 = c1648450szz.LIZ;
                    ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N4 = fVar2.LLLIIL;
                    if (viewOnTouchListenerC1648690t0N4 == null) {
                        viewOnTouchListenerC1648690t0N4 = null;
                    }
                    CreativeModel creativeModel = fVar2.LLJILJILJ.creativeModel;
                    viewOnTouchListenerC1648690t0N4.setDisableTouchWhenLongPressRecording(creativeModel.aigcMetadataModel.isAigcEffect || creativeModel.aigcOfflineModel.isAttachCountdownEffect);
                    if (d4.LJIL(c1648450szz.LIZ.LLJILJILJ) && (interfaceC1648250szfLIZJ = c1648450szz.LIZ.LLJILJIL.MK().LIZJ()) != null) {
                        interfaceC1648250szfLIZJ.nT0(false);
                    }
                    InterfaceC577400Mkk interfaceC577400MkkLIZJ = c1648450szz.LIZ.LLJILJIL.fJ0().LIZJ();
                    if (interfaceC577400MkkLIZJ == null || (interfaceC1642030spdWk2 = interfaceC577400MkkLIZJ.wk2()) == null) {
                        return;
                    }
                    interfaceC1642030spdWk2.NG2();
                }
            }

            public final void LIZ(C1644050sst c1644050sst) {
                interfaceC1648570t0B.Ak().LIZIZ();
                c1644050sst.LIZ = 5;
                interfaceC1648570t0B.h81(c1644050sst);
                ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N2 = viewOnTouchListenerC1648690t0N;
                int visibility = viewOnTouchListenerC1648690t0N2.getVisibility();
                viewOnTouchListenerC1648690t0N2.setVisibility(8);
                C1602160rnK.LIZIZ(visibility, 8, viewOnTouchListenerC1648690t0N2);
                C1648450szz c1648450szz = this.LJIIJJI.LIZIZ;
                if (c1648450szz != null) {
                    C21408218qG c21408218qG = c1648450szz.LIZ.LLLFF;
                    ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N3 = null;
                    if (c21408218qG == null) {
                        c21408218qG = null;
                    }
                    int visibility2 = c21408218qG.getVisibility();
                    c21408218qG.setVisibility(8);
                    C1602160rnK.LIZIZ(visibility2, 8, c21408218qG);
                    TextView textView = c1648450szz.LIZ.LLLFFI;
                    if (textView == null) {
                        textView = null;
                    }
                    C786410Ut5.LLIL(textView, 8);
                    c1648450szz.LIZ.LLLL = false;
                    AIGCPhotoGenerationOptimization aIGCPhotoGenerationOptimization = AIGCPhotoGenerationOptimization.INSTANCE;
                    if (aIGCPhotoGenerationOptimization.isEnabled() && aIGCPhotoGenerationOptimization.isV2VariantEnabled()) {
                        c1648450szz.LIZ.LLLIZZ(false);
                    }
                    f fVar = c1648450szz.LIZ;
                    if (fVar.LLJILJILJ.creativeModel.aigcMetadataModel.isAIGCEffectRedesignEnabled) {
                        ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N4 = fVar.LLLIIL;
                        if (viewOnTouchListenerC1648690t0N4 != null) {
                            viewOnTouchListenerC1648690t0N3 = viewOnTouchListenerC1648690t0N4;
                        }
                        viewOnTouchListenerC1648690t0N3.setMinDurationForLongPressConsideration(600);
                    }
                }
            }

            @Override // X.InterfaceC1648710t0P
            public final void T2(boolean z) {
                if (d4.LJJII(shortVideoContext)) {
                    new C0ZDN(viewOnTouchListenerC1648690t0N.getContext()).LIZ(0);
                }
                a aVar2 = aVar;
                if (aVar2 != null && aVar2.LJ2() && aVar.X80() != null) {
                    aVar.X80().invoke(new AObjectS206S0300000_25(qVar, interfaceC1648570t0B, shortVideoContext, 0));
                    return;
                }
                qVar.pp2(false, "");
                C1638140sjM.LIZ(EnumC1647590syb.LIGHTENING);
                interfaceC1648570t0B.xB(new C1448290nn9(EnumC1448830no1.CLICK), shortVideoContext.creativeModel.aigcMetadataModel.isAigcEffect);
            }

            @Override // X.InterfaceC1648710t0P
            public final void V2(boolean z) {
                C1644050sst c1644050sst = new C1644050sst("record end");
                c1644050sst.LJI = true;
                if (C1648440szy.LIZJ(qVar)) {
                    if (System.currentTimeMillis() - this.LIZIZ < 1000) {
                        C1644050sst c1644050sst2 = new C1644050sst("v2v_short_press_skip");
                        c1644050sst2.LJI = true;
                        if (d4.LJ(shortVideoContext) && !z) {
                            LIZ(c1644050sst2);
                            return;
                        } else {
                            interfaceC1648570t0B.h81(c1644050sst2);
                            return;
                        }
                    }
                    interfaceC1648570t0B.h81(c1644050sst);
                    return;
                }
                if (d4.LJ(shortVideoContext) && !z) {
                    LIZ(c1644050sst);
                } else {
                    interfaceC1648570t0B.h81(c1644050sst);
                }
            }

            @Override // X.InterfaceC1648710t0P
            public final void y2(EnumC1448830no1 enumC1448830no1) {
                if (((ShortVideoContextViewModel) C1659630tI1.LJIIIIZZ(scene, c19eg, null, 4).get(ShortVideoContextViewModel.class)).vQ2()) {
                    return;
                }
                interfaceC1648570t0B.oa0(new C1448290nn9(enumC1448830no1), false);
            }

            @Override // X.InterfaceC1648710t0P
            public final void U2(float f, float f2) {
                if (this.LIZ && f >= 0.0f) {
                    ShortVideoContext shortVideoContext2 = ((ShortVideoContextViewModel) C1659630tI1.LJFF(scene).get(ShortVideoContextViewModel.class)).LL;
                    if (shortVideoContext2 != null) {
                        C1403170mcN.LIZIZ(1, shortVideoContext2.getCreationId(), shortVideoContext2.shootWay, "press_record_button");
                    }
                    this.LIZ = false;
                }
                interfaceC1650230t2r.Kg1(f, f2);
            }
        };
        this.LIZ = r0;
        viewOnTouchListenerC1648690t0N.setRecordListener(r0);
    }
}
