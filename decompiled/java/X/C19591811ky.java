package X;

import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;

/* JADX INFO: renamed from: X.11ky, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19591811ky {
    public static C19622711px LIZ(StickerModel stickerModel, boolean z) {
        float scale;
        BaseStickerModel baseModel = stickerModel.getBaseModel();
        float translateX = baseModel.getTranslateX();
        float translateY = baseModel.getTranslateY();
        int width = baseModel.getWidth();
        int height = baseModel.getHeight();
        if (z) {
            scale = 0.0f;
        } else {
            scale = baseModel.getScale();
        }
        return new C19622711px(translateX, translateY, width, height, scale, z);
    }
}
