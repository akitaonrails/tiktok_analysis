package X;

import com.ss.android.ugc.aweme.minis.feed.instantplay.model.FeedSubcardInfo;
import com.ss.android.ugc.aweme.minis.feed.instantplay.model.GameCardMaterial;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0cIL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1006350cIL {
    public static C1006340cIK LIZ(long j, GameCardMaterial gameCardMaterial) {
        FeedSubcardInfo feedSubcardInfo;
        String str;
        List<FeedSubcardInfo> list;
        Map<String, String> map = null;
        if (gameCardMaterial != null && (list = gameCardMaterial.feedSubcardInfoList) != null) {
            feedSubcardInfo = (FeedSubcardInfo) C13LP.LJJJLL(list);
        } else {
            feedSubcardInfo = null;
        }
        if (feedSubcardInfo != null) {
            str = feedSubcardInfo.clientKey;
            map = feedSubcardInfo.extraParams;
        } else {
            str = null;
        }
        return new C1006340cIK(j, str, map);
    }
}
