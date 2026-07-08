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
import com.ss.android.ugc.aweme.tools.sticker.core.lyric.model.LyricStickerModel;
import com.ss.android.vesdk.VESize;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0FEL, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FEL extends C0FFE<LyricStickerModel> {
    public final FrameLayout LJIILIIL;
    public final C0FFO LJIILJJIL;
    public final LifecycleOwner LJIILL;
    public final C390420FSm LJIILLIIL;
    public final InterfaceC388760FMc LJIIZILJ;
    public final InterfaceC386690FEd LJIJ;
    public final C01GW LJIJI;
    public final C01GW LJIJJ;

    @Override // X.C0FFE
    public final View LJJJJJ() {
        return null;
    }

    @Override // X.C0FTJ
    public final void setAlpha(float f) {
    }

    @Override // X.C0FFE
    public final C0FUE LJJJI() {
        return new C0FUF(this, this.LJIILLIIL, (C1664680tQA) this.LJIJJ.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0FTJ
    public final StickerModel LJLI() {
        return (LyricStickerModel) ((C1664690tQB) this.LJIJJ.getValue()).LIZ;
    }

    @Override // X.C0FFE
    public final LifecycleOwner LJJIJIL() {
        return this.LJIILL;
    }

    @Override // X.C0FFE
    public final C0FFO LJJIJLIJ() {
        return this.LJIILJJIL;
    }

    @Override // X.C0FFE, X.C0FTJ
    public final void LJIIJJI(StickerModel stickerModel) {
        LJIL(stickerModel, true);
    }

    @Override // X.C0FFE
    public final void LJJJJIZL(BaseStickerModel baseStickerModel) {
        ((C1664680tQA) this.LJIJJ.getValue()).LIZLLL(new AwS584S0100000_5(baseStickerModel, 920), true);
    }

    @Override // X.C0FFE, X.C0FTJ
    public final void LJIL(StickerModel stickerModel, boolean z) {
        C0ERI c0eri;
        C0FFP c0ffpLJJIL = LJJIL();
        LyricStickerModel lyricStickerModel = null;
        if ((c0ffpLJJIL instanceof C362870EKn) && (c0eri = (C0ERI) c0ffpLJJIL) != null) {
            c0eri.LJIIJ = z;
            if (stickerModel instanceof LyricStickerModel) {
                lyricStickerModel = (LyricStickerModel) stickerModel;
            }
            if (lyricStickerModel != null) {
                ((C1664680tQA) this.LJIJJ.getValue()).LIZLLL(new AwS584S0100000_5(lyricStickerModel, 921), true);
                LJJJLIIL(((LyricStickerModel) stickerModel).getBaseStickerModel());
            }
            super.LJIIJJI(stickerModel);
            c0eri.LJIIJ = true;
        }
    }

    public C0FEL(Context context, LyricStickerModel lyricStickerModel, FrameLayout frameLayout, C0FFO c0ffo, LifecycleOwner lifecycleOwner, final C390420FSm c390420FSm) {
        final C0FK0 c0fk0LJIILLIIL;
        super(context, lyricStickerModel.getBaseStickerModel(), c0ffo, lifecycleOwner, c390420FSm);
        this.LJIILIIL = frameLayout;
        this.LJIILJJIL = c0ffo;
        this.LJIILL = lifecycleOwner;
        this.LJIILLIIL = c390420FSm;
        InterfaceC388760FMc interfaceC388760FMc = (InterfaceC388760FMc) c390420FSm.LIZIZ(C13LE.LIZ(InterfaceC388760FMc.class));
        this.LJIIZILJ = interfaceC388760FMc;
        final InterfaceC386690FEd interfaceC386690FEdLIZIZ = interfaceC388760FMc.LIZIZ();
        this.LJIJ = interfaceC386690FEdLIZIZ;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1118));
        this.LJIJI = c01gwLIZIZ;
        C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS549S0100000_5(lyricStickerModel, 1119));
        this.LJIJJ = c01gwLIZIZ2;
        C362870EKn c362870EKn = new C362870EKn(interfaceC386690FEdLIZIZ, (VESize) c01gwLIZIZ.getValue(), (C1664680tQA) c01gwLIZIZ2.getValue(), LJJIJ(), lifecycleOwner, frameLayout);
        c362870EKn.LJIIJ = false;
        c362870EKn.LJIIIIZZ();
        this.LJIIIZ = c362870EKn;
        LJJJIL();
        final C0FFP c0ffpLJJIL = LJJIL();
        C0FF8 c0ff8LIZ = interfaceC388760FMc.LIZ();
        if (c0ff8LIZ != null) {
            c0fk0LJIILLIIL = c0ff8LIZ.LJIILLIIL();
        } else {
            c0fk0LJIILLIIL = null;
        }
        LIZ(new C0FUG(c390420FSm, c0ffpLJJIL, c0fk0LJIILLIIL, interfaceC386690FEdLIZIZ) { // from class: X.0FER
            public final C390420FSm LL;
            public final C0FFP LLILLJJLI;
            public final C0FK0 LLILLL;
            public final InterfaceC386690FEd LLILZ;
            public float LLILZIL;
            public float LLILZLL;
            public boolean LLIZ;
            public final int LLIZLLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
            public boolean LLJ;

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
            public final void LJIL() {
                this.LLIZ = true;
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
                INLEPlayer playerApi;
                INLEMediaSession iNLEMediaSessionF12;
                INLEMediaSettings mediaSettingApi;
                INLEMediaSession iNLEMediaSessionF13;
                INLEPlayer playerApi2;
                if (this.LLJ) {
                    return;
                }
                this.LLJ = true;
                if (this.LLILLJJLI instanceof C362870EKn) {
                    InterfaceC386690FEd interfaceC386690FEd = this.LLILZ;
                    if (interfaceC386690FEd != null && (iNLEMediaSessionF13 = interfaceC386690FEd.f1()) != null && (playerApi2 = iNLEMediaSessionF13.getPlayerApi()) != null) {
                        playerApi2.setEnableDirectRenderMode(true);
                    }
                    InterfaceC386690FEd interfaceC386690FEd2 = this.LLILZ;
                    if (interfaceC386690FEd2 != null && (iNLEMediaSessionF12 = interfaceC386690FEd2.f1()) != null && (mediaSettingApi = iNLEMediaSessionF12.getMediaSettingApi()) != null) {
                        C0FK0 c0fk0 = this.LLILLL;
                        mediaSettingApi.setPreviewFps(c0fk0 != null ? c0fk0.LJIJ : 60, true);
                    }
                    ((C0ERI) this.LLILLJJLI).LJIIJ = false;
                }
                InterfaceC386690FEd interfaceC386690FEd3 = this.LLILZ;
                if (interfaceC386690FEd3 == null || (iNLEMediaSessionF1 = interfaceC386690FEd3.f1()) == null || (playerApi = iNLEMediaSessionF1.getPlayerApi()) == null) {
                    return;
                }
                playerApi.pause();
            }

            public final void LIZIZ() {
                C0FFP c0ffp = this.LLILLJJLI;
                if (c0ffp instanceof C362870EKn) {
                    ((C0ERI) c0ffp).LJIIJ = false;
                    ((C0ERI) c0ffp).LJIIJ();
                }
            }

            @Override // X.C0FUG
            public final void LJI() {
                LIZ();
            }

            @Override // X.C0FUG
            public final void LJJIII() {
                LIZ();
            }

            @Override // X.C0FUG
            public final void LJII(MotionEvent motionEvent) {
                InterfaceC386690FEd interfaceC386690FEd;
                InterfaceC1452170ntP interfaceC1452170ntPLJII;
                C19656611vQ c19656611vQLIZLLL;
                C1664680tQA<C19656711vR> c1664680tQALJIILIIL;
                C19656711vR c19656711vR;
                INLEMediaSession iNLEMediaSessionF1;
                NLEModel model;
                if (motionEvent != null) {
                    if (motionEvent.getActionMasked() == 0) {
                        this.LLILZIL = motionEvent.getX();
                        this.LLILZLL = motionEvent.getY();
                    }
                    if (motionEvent.getActionMasked() == 2) {
                        if (!this.LLIZ) {
                            return;
                        }
                        if (Math.abs(motionEvent.getX() - this.LLILZIL) < this.LLIZLLLIL && Math.abs(motionEvent.getY() - this.LLILZLL) < this.LLIZLLLIL) {
                            return;
                        } else {
                            LIZ();
                        }
                    }
                    if (motionEvent.getActionMasked() == 1) {
                        this.LLIZ = false;
                        if (this.LLJ) {
                            if (this.LLILLJJLI instanceof C362870EKn) {
                                InterfaceC386690FEd interfaceC386690FEd2 = this.LLILZ;
                                if (interfaceC386690FEd2 != null && (iNLEMediaSessionF1 = interfaceC386690FEd2.f1()) != null) {
                                    iNLEMediaSessionF1.getPlayerApi().setEnableDirectRenderMode(false);
                                    C0FK0 c0fk0 = this.LLILLL;
                                    if (c0fk0 != null) {
                                        int i = c0fk0.LJIIZILJ;
                                        if (i != -1) {
                                            iNLEMediaSessionF1.getMediaSettingApi().setPreviewFps(i, true);
                                        } else {
                                            iNLEMediaSessionF1.getMediaSettingApi().setPreviewFps(-1);
                                            NLEEditor nLEEditorLJI = this.LLILZ.LJI();
                                            if (nLEEditorLJI != null && (model = nLEEditorLJI.getModel()) != null && model.hasThousandFps()) {
                                                iNLEMediaSessionF1.getMediaSettingApi().setPreviewFps(((int) model.getThousandFps()) / LSPassThroughRecordSizeConfig.DEFAULT);
                                            }
                                        }
                                        ((C0ERI) this.LLILLJJLI).LJIIJ = true;
                                        NLEEditor nLEEditorLJI2 = this.LLILZ.LJI();
                                        if (nLEEditorLJI2 != null) {
                                            nLEEditorLJI2.commit();
                                        }
                                    } else {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            }
                            C0FTH c0fth = (C0FTH) this.LL.LIZJ(C13LE.LIZ(C0FTH.class));
                            if (c0fth == null || (c19656611vQLIZLLL = c0fth.LIZLLL()) == null || (c1664680tQALJIILIIL = c19656611vQLIZLLL.LJIILIIL()) == null || (c19656711vR = c1664680tQALJIILIIL.LIZ) == null || !c19656711vR.LIZIZ) {
                                if (this.LLJ && (interfaceC386690FEd = this.LLILZ) != null && (interfaceC1452170ntPLJII = interfaceC386690FEd.LJII()) != null) {
                                    interfaceC1452170ntPLJII.play();
                                }
                                InterfaceC388760FMc interfaceC388760FMc2 = (InterfaceC388760FMc) this.LL.LIZJ(C13LE.LIZ(InterfaceC388760FMc.class));
                                if (interfaceC388760FMc2 != null) {
                                    interfaceC388760FMc2.LJIILJJIL(1);
                                }
                            }
                            this.LLJ = false;
                        }
                    }
                }
            }

            @Override // X.C0FUG
            public final void LJIILL(int i) {
                LIZIZ();
            }

            @Override // X.C0FUG
            public final void LJIIJJI(float f, int i, RectF rectF) {
                LIZIZ();
            }

            {
                this.LL = c390420FSm;
                this.LLILLJJLI = c0ffpLJJIL;
                this.LLILLL = c0fk0LJIILLIIL;
                this.LLILZ = interfaceC386690FEdLIZIZ;
            }

            @Override // X.C0FUG
            public final void LJJI(int i, float f, float f2, RectF rectF) {
                LIZIZ();
            }
        });
    }
}
