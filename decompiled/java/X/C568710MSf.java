package X;

import Y.AObserverS212S0100000_8;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.scene.group.UserVisibleHintGroupScene;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.creative.model.EditPostModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import dmt.av.video.VEPreviewParams;
import kotlin.jvm.internal.AwS552S0100000_8;
import wh6.AbS690S0100000_8;

/* JADX INFO: renamed from: X.0MSf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C568710MSf extends UserVisibleHintGroupScene {
    public int LLJJIJIIJIL;
    public int LLJJIJIL;
    public SurfaceView LLJJJ;
    public RadiusLayout LLJJJIL;
    public View LLJJJJ;
    public C1295960jpS LLJJJJJIL;
    public C09AY LLJJJJLIIL;
    public C19A3 LLJJL;
    public VideoPublishEditModel LLJJLIIIJLLLLLLLZ;
    public C0MQU LLJL;
    public int LLJLIL;
    public C568720MSg LLJLILLLLZIIL;
    public NLEModel LLJLL;
    public boolean LLJLLIL;

    public final C568720MSg LLLLIILL() {
        if (this.LLJLILLLLZIIL == null) {
            VideoPublishEditModel videoPublishEditModel = this.LLJJLIIIJLLLLLLLZ;
            this.LLJLILLLLZIIL = videoPublishEditModel == null ? null : new C568720MSg(this.LLJJIJIL, this.LLJJIJIIJIL, videoPublishEditModel);
        }
        return this.LLJLILLLLZIIL;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        C568720MSg c568720MSgLLLLIILL = LLLLIILL();
        if (c568720MSgLLLLIILL != null) {
            c568720MSgLLLLIILL.LJII = true;
            c568720MSgLLLLIILL.LIZLLL.LIZJ();
        }
        this.LLJLILLLLZIIL = null;
    }

    @Override // com.bytedance.scene.Scene
    public final void onPause() {
        super.onPause();
        C201955140j.LIZJ(C554890LpX.LIZIZ, "CeleTempPreview, onPause");
        C568720MSg c568720MSgLLLLIILL = LLLLIILL();
        if (c568720MSgLLLLIILL != null) {
            c568720MSgLLLLIILL.LIZ();
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        C201955140j.LIZJ(C554890LpX.LIZIZ, "CeleTempPreview, onResume");
        C568720MSg c568720MSgLLLLIILL = LLLLIILL();
        if (c568720MSgLLLLIILL != null) {
            c568720MSgLLLLIILL.LIZJ();
        }
    }

    public final void LLLLILI(C1294720jnS c1294720jnS) {
        View view = this.LLJJJJ;
        if (view != null) {
            C368610Ecl.LIZIZ(view);
        }
        C1295960jpS c1295960jpS = this.LLJJJJJIL;
        if (c1295960jpS != null) {
            C786410Ut5.LJLLLLLL(0, c1295960jpS);
        }
        C1295960jpS c1295960jpS2 = this.LLJJJJJIL;
        if (c1295960jpS2 != null) {
            c1295960jpS2.setComposition(c1294720jnS);
        }
        C1295960jpS c1295960jpS3 = this.LLJJJJJIL;
        if (c1295960jpS3 != null) {
            c1295960jpS3.playAnimation();
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C0CHQ.LIZ().LJJIZ();
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [X.09AY, kotlin.jvm.functions.Function0] */
    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLJJJ = (SurfaceView) findViewById(R.id.video_view);
        this.LLJJJIL = (RadiusLayout) findViewById(R.id.deb);
        this.LLJJJJJIL = (C1295960jpS) findViewById(R.id.nrr);
        this.LLJJJJ = findViewById(R.id.dei);
        NLEModel nLEModel = this.LLJLL;
        if (nLEModel != null) {
            LLLLIL(nLEModel, true, null);
        }
        if (C0MQ1.LJI(this.LLJLIL)) {
            SurfaceView surfaceView = this.LLJJJ;
            if (surfaceView != null) {
                C786410Ut5.I7(new AbS690S0100000_8(this, 6, 42), surfaceView);
            }
            C201955140j.LIZLLL(C554890LpX.LIZIZ, "OnThisDayVideoPreviewScene", "set click listener on SurfaceView with callback");
        }
        ?? r0 = this.LLJJJJLIIL;
        if (r0 != 0) {
            r0.invoke();
        }
        this.LLJJJJLIIL = null;
        if (this.LLJLIL == 2 && C0C64.LJIILLIIL().LJIIIZ(31744, "enable_eoy_ui_preview_background", true, false)) {
            RadiusLayout radiusLayout = this.LLJJJIL;
            if (radiusLayout != null) {
                radiusLayout.LIZJ(false);
            }
            SurfaceView surfaceView2 = this.LLJJJ;
            if (surfaceView2 != null) {
                surfaceView2.setZOrderOnTop(true);
            }
            SurfaceView surfaceView3 = this.LLJJJ;
            if (surfaceView3 != null) {
                surfaceView3.setZOrderMediaOverlay(true);
            }
        }
    }

    public final void LLLLIL(NLEModel nLEModel, boolean z, ViewGroup viewGroup) {
        C19A3 c19a3;
        Context sceneContext;
        C568720MSg c568720MSgLLLLIILL;
        boolean z2;
        SurfaceView surfaceView;
        InterfaceC1452170ntP interfaceC1452170ntP;
        this.LLJLL = nLEModel;
        if (z && this.LLJLLIL) {
            return;
        }
        if (this.LLJJJ == null && this.mView == null && viewGroup != null) {
            this.LLJJJ = (SurfaceView) viewGroup.findViewById(R.id.video_view);
        }
        if (this.LLJJJ == null || (c19a3 = this.LLJJL) == null || this.LLJJIJIL == 0 || (sceneContext = c19a3.getSceneContext()) == null) {
            return;
        }
        C554890LpX c554890LpX = C554890LpX.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CeleTempPreview, setupPlayer: nleModel = ");
        sbLIZ.append(nLEModel.hashCode());
        sbLIZ.append(", isInit = ");
        sbLIZ.append(z);
        C201955140j.LIZJ(c554890LpX, C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            if (this.LLJLIL == 2 && C0C64.LJIILLIIL().LJIIIZ(31744, "enable_eoy_ui_preview_background", true, false)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                View view = this.LLJJJJ;
                if (view != null) {
                    C368610Ecl.LIZIZ(view);
                }
                if (this.LLJJJJ == null) {
                    this.LLJJJJLIIL = new AwS552S0100000_8(this, 889);
                }
            } else {
                String str = C0MQ1.LJ().previewLottie;
                if (str.length() <= 0) {
                    str = null;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("play lottie, celebrationType = ");
                sbLIZ2.append(this.LLJLIL);
                sbLIZ2.append(", url = ");
                sbLIZ2.append(str);
                C201955140j.LIZLLL(c554890LpX, "CeleTempPreview", C2188811AlT.LIZIZ(sbLIZ2));
                if (str != null) {
                    C1295960jpS c1295960jpS = this.LLJJJJJIL;
                    if (c1295960jpS != null) {
                        C786410Ut5.LJLLLLLL(0, c1295960jpS);
                    }
                    C1292030jj7<C1294720jnS> c1292030jj7LJIIJJI = C1294250jmh.LJIIJJI(C1383370m6R.LIZ, str);
                    c1292030jj7LJIIJJI.LIZIZ(new C581210Mqt(this, 3));
                    c1292030jj7LJIIJJI.LIZ(new C581210Mqt(this, 4));
                }
            }
            C19A3 c19a32 = this.LLJJL;
            if (c19a32 != null) {
                C568720MSg c568720MSgLLLLIILL2 = LLLLIILL();
                if (c568720MSgLLLLIILL2 != null) {
                    int i = this.LLJJIJIL;
                    int i2 = this.LLJJIJIIJIL;
                    c568720MSgLLLLIILL2.LIZIZ = i;
                    c568720MSgLLLLIILL2.LIZJ = i2;
                    VEPreviewParams value = c568720MSgLLLLIILL2.LJIIIIZZ.getValue();
                    if (value != null) {
                        value.mCanvasWidth = i;
                        value.mCanvasHeight = i2;
                        EditPostModel editPostModel = c568720MSgLLLLIILL2.LIZ.creativeModel.editPostModel;
                        if (editPostModel != null) {
                            editPostModel.setVideoCanvasWidth(i);
                        }
                        EditPostModel editPostModel2 = c568720MSgLLLLIILL2.LIZ.creativeModel.editPostModel;
                        if (editPostModel2 != null) {
                            editPostModel2.setVideoCanvasHeight(value.mCanvasHeight);
                        }
                    }
                }
                C568720MSg c568720MSgLLLLIILL3 = LLLLIILL();
                if (c568720MSgLLLLIILL3 != null && (surfaceView = this.LLJJJ) != null) {
                    C201955140j.LIZJ(c554890LpX, "CelePlayer, setData");
                    VEPreviewParams vEPreviewParamsLJII = C571500MbE.LJII(c568720MSgLLLLIILL3.LIZ, 0, 0, 7);
                    vEPreviewParamsLJII.interceptAutoPlay = true;
                    int i3 = c568720MSgLLLLIILL3.LIZIZ;
                    vEPreviewParamsLJII.mCanvasWidth = i3;
                    vEPreviewParamsLJII.mCanvasHeight = c568720MSgLLLLIILL3.LIZJ;
                    vEPreviewParamsLJII.mPageMode = 100;
                    EditPostModel editPostModel3 = c568720MSgLLLLIILL3.LIZ.creativeModel.editPostModel;
                    if (editPostModel3 != null) {
                        editPostModel3.setVideoCanvasWidth(i3);
                    }
                    EditPostModel editPostModel4 = c568720MSgLLLLIILL3.LIZ.creativeModel.editPostModel;
                    if (editPostModel4 != null) {
                        editPostModel4.setVideoCanvasHeight(vEPreviewParamsLJII.mCanvasHeight);
                    }
                    c568720MSgLLLLIILL3.LJIIIIZZ.setValue(vEPreviewParamsLJII);
                    C1441830ncj c1441830ncj = c568720MSgLLLLIILL3.LIZLLL;
                    c1441830ncj.LJIJI = nLEModel;
                    c1441830ncj.LIZLLL = c568720MSgLLLLIILL3.LJIIIIZZ;
                    c1441830ncj.LIZIZ(sceneContext, c19a32, surfaceView, c568720MSgLLLLIILL3.LIZ);
                    Object obj = c568720MSgLLLLIILL3.LIZLLL.LJIILJJIL;
                    if ((obj instanceof InterfaceC1452170ntP) && (interfaceC1452170ntP = (InterfaceC1452170ntP) obj) != null) {
                        interfaceC1452170ntP.jg();
                        interfaceC1452170ntP.of();
                    }
                    c568720MSgLLLLIILL3.LJFF = true;
                    c568720MSgLLLLIILL3.LJI = true;
                    c568720MSgLLLLIILL3.LIZLLL.LJIIL.observe(c19a32, new AObserverS212S0100000_8(c568720MSgLLLLIILL3, 78));
                    c568720MSgLLLLIILL3.LIZJ();
                }
                this.LLJLLIL = true;
                return;
            }
            return;
        }
        if (this.LLJJL == null || (c568720MSgLLLLIILL = LLLLIILL()) == null) {
            return;
        }
        if (c568720MSgLLLLIILL.LJ) {
            InterfaceC1452170ntP interfaceC1452170ntP2 = c568720MSgLLLLIILL.LIZLLL.LJIIIZ;
            if (interfaceC1452170ntP2 != null) {
                interfaceC1452170ntP2.stop();
            }
            c568720MSgLLLLIILL.LJ = false;
        }
        c568720MSgLLLLIILL.LIZLLL.LJIIIIZZ(nLEModel);
        c568720MSgLLLLIILL.LJFF = true;
        c568720MSgLLLLIILL.LJI = true;
        c568720MSgLLLLIILL.LIZJ();
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C201955140j.LIZJ(C554890LpX.LIZIZ, "CeleTempPreview, onCreateView");
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.er0, viewGroup, false);
    }
}
