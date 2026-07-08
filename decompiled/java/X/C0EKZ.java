package X;

import android.graphics.RectF;
import android.util.SizeF;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;

/* JADX INFO: renamed from: X.0EKZ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EKZ {
    public static final RectF LIZ(SizeF sizeF, float f) {
        float height;
        float width;
        if (f > sizeF.getWidth() / sizeF.getHeight()) {
            width = sizeF.getWidth();
            height = width / f;
        } else {
            height = sizeF.getHeight();
            width = f * height;
        }
        float width2 = (sizeF.getWidth() - width) / 2.0f;
        float height2 = (sizeF.getHeight() - height) / 2.0f;
        return new RectF(width2, height2, width + width2, height + height2);
    }

    public static final void LIZIZ(VideoPublishEditModel videoPublishEditModel, InterfaceC1446740nke interfaceC1446740nke) {
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        NLEModel model;
        C348100Dkm c348100DkmLIZIZ2;
        C0FW6 c0fw6LJIIIZ;
        for (TextStickerModel textStickerModel : videoPublishEditModel.creativeModel.stickerModel.textStickerModels) {
            String str = "";
            if (!C0F8Y.LJIIJ(textStickerModel) && !C0F8Y.LJIIJJI(textStickerModel) && !textStickerModel.isVERenderSticker()) {
                InterfaceC1452170ntP value = interfaceC1446740nke.g().getValue();
                if (value != null && (c348100DkmLIZIZ2 = C352130DrH.LIZIZ(value)) != null && (c0fw6LJIIIZ = c348100DkmLIZIZ2.LJIIIZ()) != null) {
                    C347950DkX c347950DkX = new C347950DkX();
                    c347950DkX.LIZIZ = textStickerModel.getUuid();
                    String strLJJJJZI = c0fw6LJIIIZ.LJJJJZI(c347950DkX);
                    if (strLJJJJZI != null) {
                        textStickerModel.setUuid(strLJJJJZI);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("viki text, addSticker -> curSlot=");
                        String uuid = textStickerModel.getUuid();
                        if (uuid != null) {
                            str = uuid;
                        }
                        sbLIZ.append(str);
                        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
            } else if (textStickerModel.getForceEffectRender() && textStickerModel.getAutoAdaptCanvas()) {
                NLETrack nLETrack = new NLETrack();
                NLETrackSlot nLETrackSlot = new NLETrackSlot();
                textStickerModel.setUuid(nLETrackSlot.getUUID());
                NLESegmentTextSticker nLESegmentTextSticker = new NLESegmentTextSticker();
                nLESegmentTextSticker.setIsRichtext(true);
                nLESegmentTextSticker.setRichContent(C385050F7v.LIZIZ(textStickerModel, ""));
                nLESegmentTextSticker.setContent(C385050F7v.LIZ(textStickerModel));
                nLETrackSlot.setMainSegment(nLESegmentTextSticker);
                BaseStickerModel baseStickerModel = textStickerModel.getBaseStickerModel();
                if (baseStickerModel.getContainerWidth() > 0 && baseStickerModel.getContainerHeight() > 0) {
                    nLETrackSlot.setTransformX((2 * baseStickerModel.getTranslateX()) / baseStickerModel.getContainerWidth());
                    nLETrackSlot.setTransformY(((-2) * baseStickerModel.getTranslateY()) / baseStickerModel.getContainerHeight());
                }
                nLETrackSlot.setTransformZ(baseStickerModel.getZIndex());
                nLETrackSlot.setScale(baseStickerModel.getScale());
                nLETrackSlot.setRotation((-baseStickerModel.getRotation()) % 360);
                nLETrackSlot.setStartTime(((long) baseStickerModel.getStartTime()) * 1000);
                nLETrackSlot.setEndTime(((long) baseStickerModel.getEndTime()) * 1000);
                if (nLETrackSlot.getLayer() - 1 > 0) {
                    nLETrack.setLayer(nLETrackSlot.getLayer() - 1);
                }
                nLETrack.addSlot(nLETrackSlot);
                nLETrack.setExtra("StickerTrackType", "TEXT");
                InterfaceC1452170ntP value2 = interfaceC1446740nke.g().getValue();
                if (value2 != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(value2)) != null && (nLEEditor = c348100DkmLIZIZ.LIZ) != null && (model = nLEEditor.getModel()) != null) {
                    model.addTrack(nLETrack);
                }
            }
        }
    }
}
