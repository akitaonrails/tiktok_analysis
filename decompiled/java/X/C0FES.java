package X;

import android.graphics.RectF;
import android.view.MotionEvent;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEMediaSettings;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0FES, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FES implements C0FUG {
    public final C390420FSm LL;
    public final C1664690tQB<TextStickerModel> LLILLJJLI;
    public final C0FFP LLILLL;
    public final C0FK0 LLILZ;
    public final InterfaceC386690FEd LLILZIL;
    public float LLIZ;
    public float LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJIJIL;
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1120));
    public final int LLJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));

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
        this.LLJ = true;
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
        InterfaceC386690FEd interfaceC386690FEd;
        INLEMediaSession iNLEMediaSessionF1;
        INLEPlayer playerApi;
        INLEMediaSession iNLEMediaSessionF12;
        INLEMediaSettings mediaSettingApi;
        INLEMediaSession iNLEMediaSessionF13;
        INLEPlayer playerApi2;
        if (this.LLJIJIL) {
            return;
        }
        this.LLJIJIL = true;
        if (this.LLILLL instanceof C0ERO) {
            InterfaceC386690FEd interfaceC386690FEd2 = this.LLILZIL;
            if (interfaceC386690FEd2 != null && (iNLEMediaSessionF13 = interfaceC386690FEd2.f1()) != null && (playerApi2 = iNLEMediaSessionF13.getPlayerApi()) != null) {
                playerApi2.setEnableDirectRenderMode(true);
            }
            InterfaceC386690FEd interfaceC386690FEd3 = this.LLILZIL;
            if (interfaceC386690FEd3 != null && (iNLEMediaSessionF12 = interfaceC386690FEd3.f1()) != null && (mediaSettingApi = iNLEMediaSessionF12.getMediaSettingApi()) != null) {
                C0FK0 c0fk0 = this.LLILZ;
                mediaSettingApi.setPreviewFps(c0fk0 != null ? c0fk0.LJIJ : 60, true);
            }
            ((C0ERI) this.LLILLL).LJIIJ = false;
        }
        if (!C0F8Y.LJIIIIZZ(this.LLILLJJLI.LIZ) || (interfaceC386690FEd = this.LLILZIL) == null || (iNLEMediaSessionF1 = interfaceC386690FEd.f1()) == null || (playerApi = iNLEMediaSessionF1.getPlayerApi()) == null) {
            return;
        }
        playerApi.pause();
    }

    public final void LIZIZ() {
        C0FFP c0ffp = this.LLILLL;
        if (c0ffp instanceof C0ERO) {
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
        C0FGR c0fgrLIZJ;
        if (motionEvent != null) {
            if (motionEvent.getActionMasked() == 0) {
                this.LLIZ = motionEvent.getX();
                this.LLIZLLLIL = motionEvent.getY();
            }
            if (motionEvent.getActionMasked() == 2) {
                if (!this.LLJ) {
                    return;
                }
                if (Math.abs(motionEvent.getX() - this.LLIZ) < this.LLJI && Math.abs(motionEvent.getY() - this.LLIZLLLIL) < this.LLJI) {
                    return;
                } else {
                    LIZ();
                }
            }
            if (motionEvent.getActionMasked() == 1) {
                this.LLJ = false;
                if (this.LLJIJIL) {
                    C0FF8 c0ff8 = (C0FF8) this.LLILZLL.getValue();
                    if (c0ff8 != null && (c0fgrLIZJ = c0ff8.LIZJ()) != null) {
                        c0fgrLIZJ.LJIIJ(this.LLILLJJLI.LIZ);
                    }
                    if (this.LLILLL instanceof C0ERO) {
                        InterfaceC386690FEd interfaceC386690FEd2 = this.LLILZIL;
                        if (interfaceC386690FEd2 != null && (iNLEMediaSessionF1 = interfaceC386690FEd2.f1()) != null) {
                            iNLEMediaSessionF1.getPlayerApi().setEnableDirectRenderMode(false);
                            C0FK0 c0fk0 = this.LLILZ;
                            if (c0fk0 != null) {
                                int i = c0fk0.LJIIZILJ;
                                if (i != -1) {
                                    iNLEMediaSessionF1.getMediaSettingApi().setPreviewFps(i, true);
                                } else {
                                    iNLEMediaSessionF1.getMediaSettingApi().setPreviewFps(-1);
                                    NLEEditor nLEEditorLJI = this.LLILZIL.LJI();
                                    if (nLEEditorLJI != null && (model = nLEEditorLJI.getModel()) != null && model.hasThousandFps()) {
                                        iNLEMediaSessionF1.getMediaSettingApi().setPreviewFps(((int) model.getThousandFps()) / LSPassThroughRecordSizeConfig.DEFAULT);
                                    }
                                }
                                ((C0ERI) this.LLILLL).LJIIJ = true;
                                NLEEditor nLEEditorLJI2 = this.LLILZIL.LJI();
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
                        if (this.LLJIJIL && C0F8Y.LJIIIIZZ(this.LLILLJJLI.LIZ) && (interfaceC386690FEd = this.LLILZIL) != null && (interfaceC1452170ntPLJII = interfaceC386690FEd.LJII()) != null) {
                            interfaceC1452170ntPLJII.play();
                        }
                        InterfaceC388760FMc interfaceC388760FMc = (InterfaceC388760FMc) this.LL.LIZJ(C13LE.LIZ(InterfaceC388760FMc.class));
                        if (interfaceC388760FMc != null) {
                            interfaceC388760FMc.LJIILJJIL(1);
                        }
                    }
                    this.LLJIJIL = false;
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

    @Override // X.C0FUG
    public final void LJJI(int i, float f, float f2, RectF rectF) {
        LIZIZ();
    }

    public C0FES(C390420FSm c390420FSm, C1664680tQA c1664680tQA, C0FFP c0ffp, C0FK0 c0fk0, InterfaceC386690FEd interfaceC386690FEd) {
        this.LL = c390420FSm;
        this.LLILLJJLI = c1664680tQA;
        this.LLILLL = c0ffp;
        this.LLILZ = c0fk0;
        this.LLILZIL = interfaceC386690FEd;
    }
}
