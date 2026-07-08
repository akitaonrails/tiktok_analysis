package X;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEMediaSettings;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.info.InfoStickerModel;
import com.ss.android.vesdk.VESize;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS20S0010000_5;
import kotlin.jvm.internal.AwS3S0000001_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0FEO, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FEO extends C0FFE<InfoStickerModel> {
    public final FrameLayout LJIILIIL;
    public final C0FFO LJIILJJIL;
    public final LifecycleOwner LJIILL;
    public final C390420FSm LJIILLIIL;
    public final C01GW LJIIZILJ;
    public final ArrayList<C0FUG> LJIJ;
    public final ArrayList<C0FUD> LJIJI;
    public final InterfaceC388760FMc LJIJJ;
    public final InterfaceC386690FEd LJIJJLI;
    public final C01GW LJIL;

    @Override // X.C0FFE
    public final View LJJJJJ() {
        return null;
    }

    @Override // X.C0FFE
    public final C0FUE LJJJI() {
        C0FEQ c0feqLJFF;
        C0FFP c0ffpLJJIL = LJJIL();
        C1664680tQA<BaseStickerModel> c1664680tQALJJIJ = LJJIJ();
        C390420FSm c390420FSm = this.LJIILLIIL;
        C1664680tQA<C0FFO> c1664680tQALJJIJL = LJJIJL();
        InterfaceC388760FMc interfaceC388760FMc = this.LJIJJ;
        return new C390750FTt(c0ffpLJJIL, c1664680tQALJJIJ, c390420FSm, c1664680tQALJJIJL, (interfaceC388760FMc == null || (c0feqLJFF = interfaceC388760FMc.LJFF()) == null) ? null : c0feqLJFF.LIZJ(), LJJJLL());
    }

    public final C1664680tQA<InfoStickerModel> LJJJLL() {
        return (C1664680tQA) this.LJIIZILJ.getValue();
    }

    @Override // X.C0FFE
    public final void LJJJ() {
        InterfaceC388760FMc interfaceC388760FMc;
        C0FEQ c0feqLJFF;
        C0EPF c0epfLIZJ;
        if (!LJJIJL().LIZ.LJIILJJIL || (interfaceC388760FMc = this.LJIJJ) == null || (c0feqLJFF = interfaceC388760FMc.LJFF()) == null || (c0epfLIZJ = c0feqLJFF.LIZJ()) == null || !c0epfLIZJ.LIZ) {
            return;
        }
        LIZ(new C0FEP(new AwS549S0100000_5(this, 1611), new AwS549S0100000_5(this, 1612)));
    }

    @Override // X.C0FTJ
    /* JADX INFO: renamed from: LJJJLZIJ, reason: merged with bridge method [inline-methods] */
    public final InfoStickerModel LJLI() {
        return LJJJLL().LIZ;
    }

    @Override // X.C0FFE
    public final LifecycleOwner LJJIJIL() {
        return this.LJIILL;
    }

    @Override // X.C0FFE
    public final C0FFO LJJIJLIJ() {
        return this.LJIILJJIL;
    }

    @Override // X.C0FFE
    public final void LIZ(C0FUG c0fug) {
        super.LIZ(c0fug);
        if (this.LJIJ.contains(c0fug)) {
            return;
        }
        this.LJIJ.add(c0fug);
    }

    @Override // X.C0FFE, X.C0FTJ
    public final void LJIIJJI(StickerModel stickerModel) {
        LJIL(stickerModel, true);
    }

    @Override // X.C0FFE
    public final void LJJIIZ(C0FUD c0fud) {
        super.LJJIIZ(c0fud);
        if (this.LJIJI.contains(c0fud)) {
            return;
        }
        this.LJIJI.add(c0fud);
    }

    @Override // X.C0FFE
    public final void LJJJJIZL(BaseStickerModel baseStickerModel) {
        LJJJLL().LIZLLL(new AwS584S0100000_5(baseStickerModel, 1153), true);
    }

    @Override // X.C0FFE
    public final void LJJJJL(C0FUG c0fug) {
        super.LJJJJL(c0fug);
        if (!this.LJIJ.contains(c0fug)) {
            return;
        }
        this.LJIJ.remove(c0fug);
    }

    @Override // X.C0FFE
    public final void LJJJJLI(C0FUD c0fud) {
        super.LJJJJLI(c0fud);
        if (!this.LJIJI.contains(c0fud)) {
            return;
        }
        this.LJIJI.remove(c0fud);
    }

    @Override // X.C0FFE, X.C0FTJ
    public final void LLD(boolean z) {
        super.LLD(z);
        this.LJIJI.clear();
        this.LJIJ.clear();
    }

    @Override // X.C0FTJ
    public final void setAlpha(float f) {
        LJJIJ().LIZLLL(new AwS3S0000001_5(f, 21), true);
    }

    @Override // X.C0FFE, X.C0FTJ
    public final void setVisible(boolean z) {
        LJJIJ().LIZLLL(new AwS20S0010000_5(z, 66), true);
        LJJJLL().LIZLLL(new AwS20S0010000_5(z, 67), true);
    }

    @Override // X.C0FFE, X.C0FTJ
    public final void LJIL(StickerModel stickerModel, boolean z) {
        InfoStickerModel infoStickerModel;
        super.LJIIJJI(stickerModel);
        if ((stickerModel instanceof InfoStickerModel) && (infoStickerModel = (InfoStickerModel) stickerModel) != null) {
            LJJJLL().LIZLLL(new AwS584S0100000_5(infoStickerModel, 1154), true);
            LJJJLIIL(((InfoStickerModel) stickerModel).getBaseStickerModel());
        }
    }

    public C0FEO(Context context, InfoStickerModel infoStickerModel, FrameLayout frameLayout, C0FFO c0ffo, LifecycleOwner lifecycleOwner, C390420FSm c390420FSm) {
        final InterfaceC386690FEd interfaceC386690FEdLIZIZ;
        C0FEQ c0feqLJFF;
        C0FEQ c0feqLJFF2;
        super(context, infoStickerModel.getBaseStickerModel(), c0ffo, lifecycleOwner, c390420FSm);
        this.LJIILIIL = frameLayout;
        this.LJIILJJIL = c0ffo;
        this.LJIILL = lifecycleOwner;
        this.LJIILLIIL = c390420FSm;
        this.LJIIZILJ = C452501pT.LIZIZ(new AwS549S0100000_5(infoStickerModel, 1614));
        this.LJIJ = new ArrayList<>();
        this.LJIJI = new ArrayList<>();
        InterfaceC388760FMc interfaceC388760FMc = (InterfaceC388760FMc) c390420FSm.LIZJ(C13LE.LIZ(InterfaceC388760FMc.class));
        this.LJIJJ = interfaceC388760FMc;
        final C0EPF c0epfLIZJ = null;
        if (interfaceC388760FMc != null) {
            interfaceC386690FEdLIZIZ = interfaceC388760FMc.LIZIZ();
        } else {
            interfaceC386690FEdLIZIZ = null;
        }
        this.LJIJJLI = interfaceC386690FEdLIZIZ;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1613));
        this.LJIL = c01gwLIZIZ;
        VESize vESize = (VESize) c01gwLIZIZ.getValue();
        C1664680tQA<InfoStickerModel> c1664680tQALJJJLL = LJJJLL();
        C1664680tQA<BaseStickerModel> c1664680tQALJJIJ = LJJIJ();
        if (interfaceC388760FMc != null && (c0feqLJFF2 = interfaceC388760FMc.LJFF()) != null) {
            c0feqLJFF2.LIZJ();
        }
        C363850EOh c363850EOh = new C363850EOh(interfaceC386690FEdLIZIZ, vESize, c1664680tQALJJJLL, c1664680tQALJJIJ, lifecycleOwner, frameLayout);
        c363850EOh.LJIIJ = false;
        this.LJIIIZ = c363850EOh;
        LJJJIL();
        LJJJ();
        LJJJLL();
        final C0FFP c0ffpLJJIL = LJJIL();
        if (interfaceC388760FMc != null && (c0feqLJFF = interfaceC388760FMc.LJFF()) != null) {
            c0epfLIZJ = c0feqLJFF.LIZJ();
        }
        LIZ(new C0FUG(c0ffpLJJIL, c0epfLIZJ, interfaceC386690FEdLIZIZ) { // from class: X.0EPE
            public final C0FFP LL;
            public final C0EPF LLILLJJLI;
            public final InterfaceC386690FEd LLILLL;
            public boolean LLILZ;

            @Override // X.C0FUG
            public final void LIZJ() {
            }

            @Override // X.C0FUG
            public final void LJIIIIZZ(int i) {
            }

            @Override // X.C0FUG
            public final void LJIIJ(int i) {
            }

            @Override // X.C0FUG
            public final void LJIILLIIL(int i) {
            }

            @Override // X.C0FUG
            public final void LJIIZILJ() {
            }

            @Override // X.C0FUG
            public final void LJIJ(int i, EnumC1466150oFx enumC1466150oFx) {
            }

            @Override // X.C0FUG
            public final void LJIJI(int i, boolean z) {
            }

            @Override // X.C0FUG
            public final void LJJ(int i, EnumC1466150oFx enumC1466150oFx, float f, float f2) {
            }

            @Override // X.C0FUG
            public final void LJJIIJZLJL() {
            }

            @Override // X.C0FUG
            public final void LJJIIZ(int i, EnumC1466150oFx enumC1466150oFx, float f, float f2, RectF rectF, float f3) {
            }

            @Override // X.C0FUG
            public final void LJJIJ() {
            }

            @Override // X.C0FUG
            public final void LJJIJIIJI(int i) {
            }

            @Override // X.C0FUG
            public final int getPriority() {
                return 100;
            }

            public final void LIZ() {
                INLEMediaSession iNLEMediaSessionF1;
                INLEMediaSettings mediaSettingApi;
                INLEMediaSession iNLEMediaSessionF12;
                INLEPlayer playerApi;
                if (this.LLILZ) {
                    return;
                }
                this.LLILZ = true;
                if (this.LL instanceof C363850EOh) {
                    InterfaceC386690FEd interfaceC386690FEd = this.LLILLL;
                    if (interfaceC386690FEd != null && (iNLEMediaSessionF12 = interfaceC386690FEd.f1()) != null && (playerApi = iNLEMediaSessionF12.getPlayerApi()) != null) {
                        playerApi.setEnableDirectRenderMode(true);
                    }
                    InterfaceC386690FEd interfaceC386690FEd2 = this.LLILLL;
                    if (interfaceC386690FEd2 != null && (iNLEMediaSessionF1 = interfaceC386690FEd2.f1()) != null && (mediaSettingApi = iNLEMediaSessionF1.getMediaSettingApi()) != null) {
                        C0EPF c0epf = this.LLILLJJLI;
                        mediaSettingApi.setPreviewFps(c0epf != null ? c0epf.LIZLLL : 60, true);
                    }
                    ((C0ERI) this.LL).LJIIJ = false;
                }
            }

            public final void LIZIZ() {
                C0FFP c0ffp = this.LL;
                if (c0ffp instanceof C363850EOh) {
                    ((C0ERI) c0ffp).LJIIJ = false;
                    ((C0ERI) c0ffp).LJIIJ();
                }
            }

            @Override // X.C0FUG
            public final void LJI() {
                LIZ();
            }

            @Override // X.C0FUG
            public final void LJIL() {
                LIZ();
            }

            @Override // X.C0FUG
            public final void LJJIII() {
                LIZ();
            }

            @Override // X.C0FUG
            public final void LJII(MotionEvent motionEvent) {
                INLEMediaSession iNLEMediaSessionF1;
                NLEModel model;
                if (motionEvent != null && motionEvent.getAction() == 1 && this.LLILZ) {
                    if ((this.LL instanceof C363850EOh) && this.LLILLJJLI != null) {
                        InterfaceC386690FEd interfaceC386690FEd = this.LLILLL;
                        if (interfaceC386690FEd != null && (iNLEMediaSessionF1 = interfaceC386690FEd.f1()) != null) {
                            iNLEMediaSessionF1.getPlayerApi().setEnableDirectRenderMode(false);
                            if (this.LLILLJJLI.LIZIZ != -1) {
                                iNLEMediaSessionF1.getMediaSettingApi().setPreviewFps(this.LLILLJJLI.LIZIZ, true);
                            } else {
                                iNLEMediaSessionF1.getMediaSettingApi().setPreviewFps(-1);
                                NLEEditor nLEEditorLJI = this.LLILLL.LJI();
                                if (nLEEditorLJI != null && (model = nLEEditorLJI.getModel()) != null && model.hasThousandFps()) {
                                    iNLEMediaSessionF1.getMediaSettingApi().setPreviewFps(((int) model.getThousandFps()) / LSPassThroughRecordSizeConfig.DEFAULT);
                                }
                            }
                            ((C0ERI) this.LL).LJIIJ = true;
                            NLEEditor nLEEditorLJI2 = this.LLILLL.LJI();
                            if (nLEEditorLJI2 != null) {
                                nLEEditorLJI2.commit();
                            }
                        } else {
                            return;
                        }
                    }
                    this.LLILZ = false;
                }
            }

            @Override // X.C0FUG
            public final void LJIILL(int i) {
                LIZIZ();
            }

            {
                this.LL = c0ffpLJJIL;
                this.LLILLJJLI = c0epfLIZJ;
                this.LLILLL = interfaceC386690FEdLIZIZ;
            }

            @Override // X.C0FUG
            public final void LJIIJJI(float f, int i, RectF rectF) {
                LIZIZ();
            }

            @Override // X.C0FUG
            public final void LJJI(int i, float f, float f2, RectF rectF) {
                LIZIZ();
            }
        });
    }
}
