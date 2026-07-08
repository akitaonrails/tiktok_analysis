package X;

import com.ss.android.ugc.aweme.creative.model.aigc.AIGCInputItem;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import java.util.List;

/* JADX INFO: renamed from: X.0LXo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C544620LXo {
    public static final String LIZ(AwemeDraft awemeDraft) {
        List<AIGCInputItem> list;
        String strLIZIZ = awemeDraft.LJJJJIZL.videoCoverPath;
        if ((strLIZIZ != null && strLIZIZ.length() > 0) || (strLIZIZ = (String) C13LP.LJJJLL(awemeDraft.LIZ.aigcOfflineModel.imgUriList)) != null || ((list = awemeDraft.LIZ.aigcOfflineModel.inputItems) != null && (strLIZIZ = C0LMJ.LIZIZ(list)) != null)) {
            return strLIZIZ;
        }
        return "";
    }
}
