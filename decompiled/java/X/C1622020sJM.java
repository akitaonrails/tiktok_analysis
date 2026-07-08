package X;

import com.ss.android.ugc.aweme.setting.performance.videoquality.StickerPreviewResolutionConfig;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.List;

/* JADX INFO: renamed from: X.0sJM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1622020sJM {
    public static final boolean LIZ(ShortVideoContext shortVideoContext, List<String> list) {
        StickerPreviewResolutionConfig stickerPreviewResolutionConfigLIZ;
        if (InterfaceC1625730sPL.LJIILIIL.enableUseDynamicEffectLabel() || C1622030sJN.LIZ() == null || (stickerPreviewResolutionConfigLIZ = C1622030sJN.LIZ()) == null || !stickerPreviewResolutionConfigLIZ.enable) {
            return false;
        }
        if (!C1443960ngA.LJIIZILJ(shortVideoContext) && (list == null || !(!list.isEmpty()))) {
            return false;
        }
        return true;
    }
}
