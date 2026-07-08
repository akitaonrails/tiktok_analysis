package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.Iterator;
import kotlin.jvm.internal.AwS371S0200000_5;

/* JADX INFO: renamed from: X.0FVH, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FVH {
    public final LifecycleOwner LIZ;
    public final VideoPublishEditModel LIZIZ;
    public final InterfaceC1455860nzM LIZJ;
    public final InterfaceC391240FVq LIZLLL;
    public final C0FVT LJ;

    public final TextStickerModel LIZ() {
        TextStickerModel next;
        Iterator<TextStickerModel> it2 = this.LJ.Sb().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (C0F8Y.LJIIJJI(next)) {
                break;
            }
        }
        return next;
    }

    public final void LIZIZ(TextStickerModel textStickerModel, String str) {
        C0FWO c0fwo;
        TextStickerModel textStickerModel2 = (TextStickerModel) C571330Max.LIZ(textStickerModel);
        TextStickerModel textStickerModelLIZ = LIZ();
        if (textStickerModelLIZ != null) {
            this.LJ.Fj(textStickerModelLIZ.getBaseStickerModel().getId());
        }
        TextStickerModel textStickerModelCopy$default = TextStickerModel.copy$default(textStickerModel2, null, null, null, textStickerModel2.getTextStr(), null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, C0FVR.NONE, null, null, null, null, false, null, 0L, 0L, C0F7S.EDIT, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -134479881, 65535, null);
        this.LJ.ll(textStickerModelCopy$default);
        this.LJ.Ca(textStickerModelCopy$default.getId(), new AwS371S0200000_5(this, textStickerModelCopy$default, 18));
        InterfaceC391240FVq interfaceC391240FVq = this.LIZLLL;
        if (interfaceC391240FVq != null && (c0fwo = (C0FWO) interfaceC391240FVq.LLIIIZ(EnumC1466150oFx.TEXT)) != null) {
            c0fwo.l3();
        }
        u4.LJJLIIIIJ(this.LIZIZ, str, 0, null, null, null, null, null, null, Boolean.valueOf(textStickerModel.isVERenderSticker()), 496);
    }

    public C0FVH(C0FVG c0fvg, VideoPublishEditModel videoPublishEditModel, InterfaceC1455860nzM interfaceC1455860nzM, InterfaceC391240FVq interfaceC391240FVq, C0FVG c0fvg2) {
        this.LIZ = c0fvg;
        this.LIZIZ = videoPublishEditModel;
        this.LIZJ = interfaceC1455860nzM;
        this.LIZLLL = interfaceC391240FVq;
        this.LJ = c0fvg2;
    }
}
