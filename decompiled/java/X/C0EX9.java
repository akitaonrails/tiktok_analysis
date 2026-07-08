package X;

import com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.aicaption.AICaptionTagStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS234S0000000_5;

/* JADX INFO: renamed from: X.0EX9, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EX9 implements InterfaceC379610EuV, InterfaceC350220DoC, C0EMV {
    public static final C367320Eag LLILZIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final C1DRG LL;
    public final C1664740tQG LLILLJJLI;
    public final C1664740tQG LLILLL;
    public final C1664750tQH LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0EX9.class, "memeAudioCaptionApiComponent", "getMemeAudioCaptionApiComponent()Lcom/ss/android/ugc/aweme/aicaption/MemeAudioCaptionApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C0EX9.class, "aIMemeApiComponent", "getAIMemeApiComponent()Lcom/ss/android/ugc/aweme/aicaption/AIMemeApiComponent;", 0), new C2217381BqS(C0EX9.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0)};
        LLILZIL = new C367320Eag();
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public C0EX9(C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILLJJLI = C1664770tQJ.LIZIZ(c1drg, InterfaceC19530111b1.class, null);
        this.LLILLL = C1664770tQJ.LIZIZ(c1drg, C0EXI.class, null);
        this.LLILZ = C1664770tQJ.LIZ(c1drg, InterfaceC1455850nzL.class, null);
    }

    @Override // X.C0EMV
    public final void LIZ(C0EMO c0emo) {
        TextStickerModel next;
        InterfaceC1461660o8i interfaceC1461660o8iLIZJ;
        C0FVT c0fvtKR;
        InterfaceC391240FVq interfaceC391240FVqQj;
        VideoPublishEditModel videoPublishEditModel = c0emo.LIZJ;
        if (videoPublishEditModel != null && C1416310mxZ.LJJLIIIJJIZ(videoPublishEditModel)) {
            Iterator<TextStickerModel> it2 = videoPublishEditModel.creativeModel.stickerModel.textStickerModels.iterator();
            do {
                next = null;
                if (!it2.hasNext()) {
                    break;
                } else {
                    next = it2.next();
                }
            } while (!C0F8Y.LJII(next));
            TextStickerModel textStickerModel = next;
            if (textStickerModel == null) {
                C1664740tQG c1664740tQG = this.LLILLJJLI;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZLL;
                InterfaceC19530111b1 interfaceC19530111b1 = (InterfaceC19530111b1) c1664740tQG.getValue(this, interfaceC2217461BqaArr[0]);
                if (interfaceC19530111b1 != null) {
                    interfaceC19530111b1.Bk();
                }
                C0EXI c0exi = (C0EXI) this.LLILLL.getValue(this, interfaceC2217461BqaArr[1]);
                if (c0exi != null) {
                    c0exi.Bk();
                    return;
                }
                return;
            }
            AICaptionTagStickerModel aICaptionTagStickerModel = (AICaptionTagStickerModel) C13LP.LJJJLZIJ(0, videoPublishEditModel.creativeModel.stickerModel.aiCaptionTagStickers);
            if (aICaptionTagStickerModel != null && (interfaceC1461660o8iLIZJ = ((InterfaceC1455850nzL) this.LLILZ.getValue(this, LLILZLL[2])).AT().LIZJ()) != null && (c0fvtKR = interfaceC1461660o8iLIZJ.kR()) != null && (interfaceC391240FVqQj = c0fvtKR.qj()) != null) {
                interfaceC391240FVqQj.k3(aICaptionTagStickerModel, EnumC356070Dxd.COMMIT);
            }
            C1664740tQG c1664740tQG2 = this.LLILLJJLI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLILZLL;
            InterfaceC19530111b1 interfaceC19530111b12 = (InterfaceC19530111b1) c1664740tQG2.getValue(this, interfaceC2217461BqaArr2[0]);
            if (interfaceC19530111b12 != null) {
                interfaceC19530111b12.j7(textStickerModel);
            }
            C0EXI c0exi2 = (C0EXI) this.LLILLL.getValue(this, interfaceC2217461BqaArr2[1]);
            if (c0exi2 == null) {
                return;
            }
            c0exi2.j7(textStickerModel);
        }
    }

    @Override // X.C0EMV
    public final void LIZJ(C0EMO c0emo) {
        LIZ(c0emo);
    }

    @Override // X.InterfaceC350220DoC
    public final void LIZLLL(C0EMN c0emn) {
        VideoPublishEditModel videoPublishEditModel;
        TextStickerModel next;
        VideoPublishEditModel videoPublishEditModel2 = c0emn.LIZIZ;
        if (videoPublishEditModel2 == null || (videoPublishEditModel = c0emn.LIZJ) == null) {
            return;
        }
        Iterator<TextStickerModel> it2 = videoPublishEditModel2.creativeModel.stickerModel.textStickerModels.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (C0F8Y.LJII(next)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        TextStickerModel textStickerModel = next;
        C364520EQw.LIZ(videoPublishEditModel.creativeModel.stickerModel.textStickerModels, AFwS234S0000000_5.get$arr$(417));
        if (textStickerModel == null) {
            StickerNewEngineModel stickerNewEngineModel = videoPublishEditModel.creativeModel.stickerModel;
            stickerNewEngineModel.isAiCaptionAdded = false;
            stickerNewEngineModel.aiCaptionTagStickers.clear();
            return;
        }
        StickerNewEngineModel stickerNewEngineModel2 = videoPublishEditModel.creativeModel.stickerModel;
        stickerNewEngineModel2.isAiCaptionAdded = true;
        stickerNewEngineModel2.textStickerModels.add(textStickerModel);
        List<AICaptionTagStickerModel> list = videoPublishEditModel.creativeModel.stickerModel.aiCaptionTagStickers;
        AICaptionTagStickerModel aICaptionTagStickerModel = (AICaptionTagStickerModel) C13LP.LJJJLZIJ(0, list);
        if (aICaptionTagStickerModel == null) {
            return;
        }
        list.remove(aICaptionTagStickerModel);
        LLILZIL.getClass();
        list.add(C367320Eag.LIZ(textStickerModel, aICaptionTagStickerModel));
    }

    @Override // X.C0EMV
    public final void LJ(C0EMO c0emo) {
        LIZ(c0emo);
    }
}
