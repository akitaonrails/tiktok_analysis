package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.consume.FollowingFeedBusinessDatabase;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0VLR, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VLR extends C09AY implements Function0<FollowingFeedBusinessDatabase> {
    public C0VLR() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0VMm, com.ss.android.ugc.aweme.feed.consume.FollowingFeedBusinessDatabase] */
    @Override // kotlin.jvm.functions.Function0
    public final FollowingFeedBusinessDatabase invoke() {
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        if (contextLIZ == null) {
            return null;
        }
        C796500VMi c796500VMiLIZ = C0OGG.LIZ(contextLIZ, FollowingFeedBusinessDatabase.class, "following_business.db");
        c796500VMiLIZ.LIZJ();
        c796500VMiLIZ.LIZ(FollowingFeedBusinessDatabase.LL, FollowingFeedBusinessDatabase.LLILLJJLI, FollowingFeedBusinessDatabase.LLILLL);
        return c796500VMiLIZ.LIZIZ();
    }
}
