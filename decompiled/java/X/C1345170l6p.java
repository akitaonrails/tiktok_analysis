package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;

/* JADX INFO: renamed from: X.0l6p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1345170l6p {
    public static final int LIZ(Aweme aweme) {
        if (aweme == null || AwemeExtKt.getFollowStatus(aweme) != 1) {
            return 0;
        }
        return 1;
    }
}
