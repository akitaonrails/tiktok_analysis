package X;

import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;

/* JADX INFO: renamed from: X.0FLx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C388710FLx {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(TextStickerModel textStickerModel) {
        if (textStickerModel.getSourceType() == C0F7S.AI_CAPTION) {
            return "ai_text";
        }
        if (textStickerModel.getCaptionModel() != null) {
            return "caption";
        }
        return "text";
    }
}
