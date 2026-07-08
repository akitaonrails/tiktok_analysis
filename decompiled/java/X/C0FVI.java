package X;

import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.Iterator;
import kotlin.jvm.internal.AwS371S0200000_5;

/* JADX INFO: renamed from: X.0FVI, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FVI {
    public final Activity LIZ;
    public final LifecycleOwner LIZIZ;
    public final VideoPublishEditModel LIZJ;
    public final InterfaceC1455860nzM LIZLLL;
    public final InterfaceC391240FVq LJ;
    public final C0FVT LJFF;
    public boolean LJI;
    public boolean LJII = true;

    public final TextStickerModel LIZIZ() {
        TextStickerModel next;
        Iterator<TextStickerModel> it2 = this.LJFF.Sb().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (C0F8Y.LJIIJ(next)) {
                break;
            }
        }
        return next;
    }

    public final void LIZLLL() {
        TextStickerModel textStickerModelLIZIZ = LIZIZ();
        if (textStickerModelLIZIZ != null) {
            this.LJFF.Fj(textStickerModelLIZIZ.getBaseStickerModel().getId());
        }
    }

    public final TextStickerModel LIZ(TextStickerModel textStickerModel) {
        String textStr;
        this.LJI = true;
        C0FVR c0fvr = C0FVR.NONE;
        if (textStickerModel.getGuideType() == C0FVR.LIVE_HIGHLIGHT) {
            textStr = textStickerModel.getTextStr();
        } else {
            textStr = "";
        }
        return TextStickerModel.copy$default(textStickerModel, null, null, null, textStr, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, c0fvr, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, true, null, null, null, null, null, null, false, false, null, false, false, false, null, -262153, 65531, null);
    }

    public final void LIZJ(TextStickerModel textStickerModel, String str) {
        TTSVoiceModel tTSVoiceModel;
        boolean z;
        C0FWO c0fwo;
        LIZLLL();
        TextStickerModel textStickerModelLIZ = LIZ(textStickerModel);
        this.LJFF.ll(textStickerModelLIZ);
        this.LJFF.Ca(textStickerModelLIZ.getId(), new AwS371S0200000_5(textStickerModel, this, 17));
        InterfaceC391240FVq interfaceC391240FVq = this.LJ;
        if (interfaceC391240FVq != null && (c0fwo = (C0FWO) interfaceC391240FVq.LLIIIZ(EnumC1466150oFx.TEXT)) != null) {
            c0fwo.l3();
        }
        VideoPublishEditModel videoPublishEditModel = this.LIZJ;
        TTSModel ttsModel = textStickerModel.getTtsModel();
        if (ttsModel != null) {
            tTSVoiceModel = ttsModel.ttsVoiceModel;
        } else {
            tTSVoiceModel = null;
        }
        if (tTSVoiceModel != null) {
            z = true;
        } else {
            z = false;
        }
        u4.LJJLIIIIJ(videoPublishEditModel, str, 0, null, Boolean.valueOf(z), Boolean.valueOf(this.LJI), Boolean.valueOf(this.LJII), null, null, Boolean.valueOf(textStickerModel.isVERenderSticker()), 384);
        this.LJII = false;
    }

    public C0FVI(Activity activity, C0FVG c0fvg, VideoPublishEditModel videoPublishEditModel, InterfaceC1455860nzM interfaceC1455860nzM, InterfaceC391240FVq interfaceC391240FVq, C0FVG c0fvg2) {
        this.LIZ = activity;
        this.LIZIZ = c0fvg;
        this.LIZJ = videoPublishEditModel;
        this.LIZLLL = interfaceC1455860nzM;
        this.LJ = interfaceC391240FVq;
        this.LJFF = c0fvg2;
    }
}
