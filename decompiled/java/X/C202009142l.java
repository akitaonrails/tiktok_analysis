package X;

import com.bytedance.android.live.base.model.UrlModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.aweme.framework.services.IStickerService;
import com.ss.android.ugc.aweme.tools.ToolsUrlModel;

/* JADX INFO: renamed from: X.142l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202009142l {
    public static IStickerService.FaceSticker LIZ(LiveEffect liveEffect) {
        IStickerService.FaceSticker faceSticker = new IStickerService.FaceSticker();
        if (liveEffect != null) {
            faceSticker.stickerId = liveEffect.getEffectId();
            faceSticker.resourceId = liveEffect.getResourceId();
            faceSticker.name = liveEffect.getName();
            UrlModel icon = liveEffect.getIcon();
            ToolsUrlModel toolsUrlModel = new ToolsUrlModel();
            if (icon != null) {
                toolsUrlModel.uri = icon.uri;
                toolsUrlModel.urlList = icon.urlList;
            }
            faceSticker.iconUrl = toolsUrlModel;
            faceSticker.hint = liveEffect.LIZIZ();
            faceSticker.localPath = liveEffect.getFilePath();
            faceSticker.types = liveEffect.LIZJ();
            faceSticker.extra = liveEffect.getExtra();
            faceSticker.hint = liveEffect.LIZIZ();
            faceSticker.tags = liveEffect.getTags();
        }
        return faceSticker;
    }
}
