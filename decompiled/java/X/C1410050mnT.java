package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.ShortVideoCommonParams;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: renamed from: X.0mnT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1410050mnT extends AbstractC381020Ewm<InterfaceC1410060mnU> implements InterfaceC1410060mnU, C05YF, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final C1DRG LLILLL;
    public final Scene LLILZ;
    public final InterfaceC1462140o9U LLILZIL;
    public final Function0<C1462070o9N> LLILZLL;
    public final InterfaceC1731706qJ LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public boolean LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1410050mnT.class, "povPanelUIComponentApi", "getPovPanelUIComponentApi()Lcom/ss/android/ugc/gamora/editor/sticker/pov/panel/PovPanelUIComponentApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1410050mnT.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public InterfaceC1410060mnU X1() {
        return this;
    }

    @Override // X.InterfaceC1410060mnU
    public C0FL9 LJIIJ() {
        return new C0FL9() { // from class: X.0mnV
            @Override // X.C0FL9
            public final boolean LIZ() {
                return C342460Dbg.LIZ(this.LIZ.LJJJLIIL());
            }

            @Override // X.C0FL9
            public final void LIZIZ() {
                if (C342460Dbg.LIZ(this.LIZ.LJJJLIIL())) {
                    C1410050mnT c1410050mnT = this.LIZ;
                    if (c1410050mnT.LLJ) {
                        c1410050mnT.LLJ = false;
                        C1421430n5p c1421430n5p = C1421430n5p.LIZ;
                        ShortVideoCommonParams shortVideoCommonParams = new ShortVideoCommonParams(c1410050mnT.LJJJLIIL().mShootWay, C1428470nHB.LJIILIIL(this.LIZ.LJJJLIIL()), C1428470nHB.LJIILL(this.LIZ.LJJJLIIL()), this.LIZ.LJJJLIIL().getCreationId(), 0, 0, 0, 0, null, null, null, null, null, 8176, null);
                        c1421430n5p.getClass();
                        C0LAB c0lab = new C0LAB();
                        c0lab.LJ("enter_from", "video_edit_page");
                        c0lab.LJ("shoot_way", shortVideoCommonParams.shootWay);
                        c0lab.LJ("creation_id", shortVideoCommonParams.creationId);
                        c0lab.LJ("content_source", shortVideoCommonParams.contentSource);
                        c0lab.LJ("content_type", shortVideoCommonParams.contentType);
                        C20684815ws.LJIILLIIL("pov_entrance_show", c0lab.LIZ);
                    }
                }
            }

            @Override // X.C0FL9
            public final void LIZJ() {
                InterfaceC1410080mnW interfaceC1410080mnWZ1 = this.LIZ.Z1();
                if (interfaceC1410080mnWZ1 != null) {
                    interfaceC1410080mnWZ1.zX();
                }
            }

            @Override // X.C0FL9
            public final void LJ() {
                C1421430n5p c1421430n5p = C1421430n5p.LIZ;
                ShortVideoCommonParams shortVideoCommonParams = new ShortVideoCommonParams(this.LIZ.LJJJLIIL().mShootWay, C1428470nHB.LJIILIIL(this.LIZ.LJJJLIIL()), C1428470nHB.LJIILL(this.LIZ.LJJJLIIL()), this.LIZ.LJJJLIIL().getCreationId(), 0, 0, 0, 0, null, null, null, null, null, 8176, null);
                c1421430n5p.getClass();
                C0LAB c0lab = new C0LAB();
                c0lab.LJ("enter_from", "video_edit_page");
                c0lab.LJ("shoot_way", shortVideoCommonParams.shootWay);
                c0lab.LJ("creation_id", shortVideoCommonParams.creationId);
                c0lab.LJ("content_source", shortVideoCommonParams.contentSource);
                c0lab.LJ("content_type", shortVideoCommonParams.contentType);
                C20684815ws.LJIILLIIL("pov_entrance_click", c0lab.LIZ);
            }

            @Override // X.C0FL9
            public final void LJFF() {
                this.LIZ.LLJ = true;
            }

            @Override // X.C0FL9
            public final void LIZLLL(TextStickerModel textStickerModel, C0FL7 c0fl7) {
                InterfaceC1410080mnW interfaceC1410080mnWZ1 = this.LIZ.Z1();
                if (interfaceC1410080mnWZ1 != null) {
                    interfaceC1410080mnWZ1.UO2(true, true, textStickerModel, "", true, c0fl7, AFwS210S0000000_22.get$arr$(259));
                }
            }
        };
    }

    public final VideoPublishEditModel LJJJLIIL() {
        return (VideoPublishEditModel) this.LLIZLLLIL.getValue(this, LLJI[1]);
    }

    public final InterfaceC1410080mnW Z1() {
        return (InterfaceC1410080mnW) this.LLIZ.getValue(this, LLJI[0]);
    }

    public final Function0<C1462070o9N> G2() {
        return this.LLILZLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        X1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLL;
    }

    public final Scene o2() {
        return this.LLILZ;
    }

    public final InterfaceC1462140o9U w2() {
        return this.LLILZIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1410050mnT(C1DRG c1drg, Scene scene, InterfaceC1462140o9U interfaceC1462140o9U, Function0<? extends C1462070o9N> function0) {
        super(c1drg);
        this.LLILLL = c1drg;
        this.LLILZ = scene;
        this.LLILZIL = interfaceC1462140o9U;
        this.LLILZLL = function0;
        this.LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1410080mnW.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    }
}
