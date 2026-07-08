package X;

import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.aicaption.AICaptionTagStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;

/* JADX INFO: renamed from: X.0Eag, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C367320Eag {
    public static AICaptionTagStickerModel LIZ(TextStickerModel textStickerModel, AICaptionTagStickerModel aICaptionTagStickerModel) {
        boolean z;
        int width;
        BaseStickerModel baseStickerModel = textStickerModel.getBaseStickerModel();
        float rotation = textStickerModel.getBaseStickerModel().getRotation();
        float height = ((baseStickerModel.getHeight() / 2.0f) * baseStickerModel.getScale()) + (aICaptionTagStickerModel.getBaseStickerModel().getHeight() / 2.0f);
        if (!aICaptionTagStickerModel.getSolidSpace() && !textStickerModel.isVERenderSticker()) {
            height -= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        }
        double d = rotation;
        float fSin = ((float) Math.sin(Math.toRadians(d))) * height;
        float fCos = ((float) Math.cos(Math.toRadians(d))) * height;
        if (!textStickerModel.isManualEdited() && !aICaptionTagStickerModel.isEdited()) {
            z = false;
        } else {
            z = true;
        }
        if (z && !aICaptionTagStickerModel.isEdited()) {
            C444890HcV c444890HcV = new C444890HcV();
            c444890HcV.LIZ(73);
            width = ((int) c444890HcV.measureText(C1383370m6R.LJIIJ(2131820737))) + (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(58)) * 2);
        } else {
            width = aICaptionTagStickerModel.getBaseStickerModel().getWidth();
        }
        return AICaptionTagStickerModel.copy$default(aICaptionTagStickerModel, BaseStickerModel.copy$default(aICaptionTagStickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, width, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, baseStickerModel.getTranslateX() + fSin, baseStickerModel.getTranslateY() - fCos, 0.0f, rotation, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -23068801, 15, null), z, false, 0.0f, false, false, 60, null);
    }
}
