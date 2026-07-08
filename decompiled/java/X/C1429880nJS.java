package X;

import com.bytedance.ies.nle.editor_jni.NLEMediaPublicJniJNI;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: renamed from: X.0nJS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1429880nJS {
    public static final boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (u4.LJLL(videoPublishEditModel) || !C0C64.LJIILLIIL().LJIIIZ(31744, "enable_single_image_contain_interact_sticker", true, false) || !C1444940nhk.LJII(videoPublishEditModel.getCanvasVideoData())) {
            return false;
        }
        return true;
    }

    public static final boolean LIZIZ(Effect effect) {
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "only_dynamic_sticker_convert_to_static_sticker", true, false)) {
            return true;
        }
        int iNLEMediaUtil_isStickerDynamic = NLEMediaPublicJniJNI.NLEMediaUtil_isStickerDynamic(effect.getUnzipPath());
        C1632480saE c1632480saE = C1632480saE.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sticker_d->s isDynamicEffect: result: ");
        sbLIZ.append(iNLEMediaUtil_isStickerDynamic);
        sbLIZ.append(" sticker res id: ");
        sbLIZ.append(effect.getResource_id());
        C201955140j.LIZJ(c1632480saE, C2188811AlT.LIZIZ(sbLIZ));
        if (iNLEMediaUtil_isStickerDynamic != 1) {
            return true;
        }
        return false;
    }
}
