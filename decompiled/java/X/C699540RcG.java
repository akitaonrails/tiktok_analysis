package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.feed.platform.componentmanager.metric.staytime.FcpAwemeInfo;

/* JADX INFO: renamed from: X.0RcG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C699540RcG {
    public static final FcpAwemeInfo LIZ(Aweme aweme, String str, String str2) {
        return new FcpAwemeInfo(aweme.getAid(), AwemeExtKt.getAuthorUid(aweme), str, AwemeExtKt.getGenreType(aweme), str2, aweme.getAwemeType());
    }
}
