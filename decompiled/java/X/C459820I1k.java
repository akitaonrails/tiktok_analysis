package X;

import com.ss.android.ugc.aweme.emoji.model.Emoji;
import com.ss.android.ugc.aweme.im.message.content.GifContent;

/* JADX INFO: renamed from: X.0I1k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C459820I1k {
    public static final GifContent LIZ(Emoji emoji) {
        GifContent gifContent = new GifContent();
        gifContent.setUrl(emoji.getAnimateUrl());
        gifContent.setImageId(emoji.getId());
        gifContent.setDisplayName(C454580Hs8.LIZIZ(emoji));
        gifContent.setImageType(emoji.getAnimateType());
        gifContent.setPackageId(emoji.getResourcesId());
        gifContent.setVersion(emoji.getVersion());
        gifContent.setWidth(emoji.getWidth());
        gifContent.setHeight(emoji.getHeight());
        if (emoji.getStickerType() == 2) {
            gifContent.type = 501;
            return gifContent;
        }
        if (emoji.getStickerType() == 3) {
            gifContent.type = 502;
            gifContent.setStickerId(emoji.getStickerId());
            return gifContent;
        }
        gifContent.type = 500;
        return gifContent;
    }
}
