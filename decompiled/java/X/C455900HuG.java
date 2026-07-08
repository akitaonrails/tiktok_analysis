package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import com.ss.android.ugc.aweme.im.common.model.StickerSubType;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* JADX INFO: renamed from: X.0HuG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C455900HuG {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static StickerSubType LIZ(String str) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -2032180703:
                if (!str.equals(LivePreviewCTASmartDisplayManager.DEFAULT)) {
                    return null;
                }
                return StickerSubType.DEFAULT;
            case -1095964543:
                if (!str.equals("CUSTOMIZED")) {
                    return null;
                }
                return StickerSubType.CUSTOMIZED;
            case 48:
                if (!str.equals(CardStruct.IStatusCode.DEFAULT)) {
                    return null;
                }
                return StickerSubType.REGULAR;
            case 49:
                if (!str.equals("1")) {
                    return null;
                }
                return StickerSubType.DEFAULT;
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                if (!str.equals("2")) {
                    return null;
                }
                return StickerSubType.CUSTOMIZED;
            case 1804446588:
                if (!str.equals("REGULAR")) {
                    return null;
                }
                return StickerSubType.REGULAR;
            default:
                return null;
        }
    }
}
