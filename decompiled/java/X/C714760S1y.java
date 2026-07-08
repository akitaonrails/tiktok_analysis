package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* JADX INFO: renamed from: X.0S1y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C714760S1y {
    public static final List<String> LIZ(Aweme aweme) {
        C1517280paQ c1517280paQ;
        List<String> list;
        if (((Boolean) C263510AUj.LIZ.getValue()).booleanValue()) {
            C1C1T c1c1t = C2203191BKr.LIZ(aweme).socialBlob;
            if (c1c1t != null && (c1517280paQ = c1c1t.emoji_quick_reply) != null && (list = c1517280paQ.quick_reply_emojis) != null) {
                return C13LP.LLIIII(list);
            }
            return null;
        }
        return aweme.quickReplyEmojis;
    }
}
