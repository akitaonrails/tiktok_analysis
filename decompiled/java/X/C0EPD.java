package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0EPD, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EPD implements InterfaceC379610EuV, InterfaceC350220DoC, C0EMV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final C1DRG LL;
    public final List<String> LLILLJJLI = new ArrayList();
    public final C1664750tQH LLILLL;
    public final C1664740tQG LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0EPD.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0EPD.class, "newInfoStickerApi", "getNewInfoStickerApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/sticker/info/EditorProInfoStickerApi;", 0);
        c09r3.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public C0EPD(C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILLL = C1664770tQJ.LIZ(c1drg, InterfaceC1455850nzL.class, null);
        this.LLILZ = C1664770tQJ.LIZIZ(c1drg, InterfaceC363820EOe.class, null);
    }

    @Override // X.C0EMV
    public final void LIZ(C0EMO c0emo) {
        VideoPublishEditModel videoPublishEditModel;
        InterfaceC1461650o8h interfaceC1461650o8hLIZJ;
        NLEModel nLEModelLIZ = c0emo.LIZ();
        if (nLEModelLIZ == null || (videoPublishEditModel = c0emo.LIZJ) == null || !C0EKP.LIZIZ(videoPublishEditModel, nLEModelLIZ)) {
            return;
        }
        for (String str : (ArrayList) this.LLILLJJLI) {
            InterfaceC1461650o8h interfaceC1461650o8hLIZJ2 = ((InterfaceC1455850nzL) this.LLILLL.getValue(this, LLILZIL[0])).Iz2().LIZJ();
            if (interfaceC1461650o8hLIZJ2 != null) {
                interfaceC1461650o8hLIZJ2.eX(str);
            }
        }
        InfoStickerModel infoStickerModel = videoPublishEditModel.getInfoStickerModel();
        if (infoStickerModel != null && !infoStickerModel.stickers.isEmpty() && (interfaceC1461650o8hLIZJ = ((InterfaceC1455850nzL) this.LLILLL.getValue(this, LLILZIL[0])).Iz2().LIZJ()) != null) {
            interfaceC1461650o8hLIZJ.Dc2(infoStickerModel.stickers);
        }
    }

    @Override // X.C0EMV
    public final void LIZJ(C0EMO c0emo) {
        LIZ(c0emo);
    }

    @Override // X.InterfaceC350220DoC
    public final void LIZLLL(C0EMN c0emn) {
        VideoPublishEditModel videoPublishEditModel;
        VideoPublishEditModel videoPublishEditModel2;
        List<StickerItemModel> list;
        NLEModel nLEModelLIZ = c0emn.LIZ();
        if (nLEModelLIZ == null || (videoPublishEditModel = c0emn.LIZJ) == null || (videoPublishEditModel2 = c0emn.LIZIZ) == null || !C0EKP.LIZIZ(videoPublishEditModel, nLEModelLIZ)) {
            return;
        }
        InterfaceC363820EOe interfaceC363820EOe = (InterfaceC363820EOe) this.LLILZ.getValue(this, LLILZIL[1]);
        if (interfaceC363820EOe != null) {
            interfaceC363820EOe.eN2(videoPublishEditModel2, nLEModelLIZ);
        }
        ((ArrayList) this.LLILLJJLI).clear();
        InfoStickerModel infoStickerModel = videoPublishEditModel.getInfoStickerModel();
        if (infoStickerModel != null && (list = infoStickerModel.stickers) != null) {
            for (StickerItemModel stickerItemModel : list) {
                if (C13LQ.LJLIIL(new Integer[]{29, 28, 11, 0}).contains(Integer.valueOf(stickerItemModel.type))) {
                    ((ArrayList) this.LLILLJJLI).add(stickerItemModel.uuid);
                }
            }
        }
        videoPublishEditModel.setInfoStickerModel(videoPublishEditModel2.getInfoStickerModel());
    }

    @Override // X.C0EMV
    public final void LJ(C0EMO c0emo) {
        LIZ(c0emo);
    }
}
