package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;

/* JADX INFO: renamed from: X.10l4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19337610l4 {
    public static String LIZ(NewFaceStickerBean newFaceStickerBean) {
        if (newFaceStickerBean != null && newFaceStickerBean.effectSource == 102) {
            return "1";
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    public static String LIZIZ(NewFaceStickerBean newFaceStickerBean) {
        if (newFaceStickerBean != null && newFaceStickerBean.effectSource == 101) {
            return "1";
        }
        return CardStruct.IStatusCode.DEFAULT;
    }
}
