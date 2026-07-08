package X;

import com.ss.android.ugc.aweme.feed.consume.FollowingFeedBusinessDatabase;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0VLT, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VLT extends C09AY implements Function0<C0VLY> {
    public C0VLT() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C0VLY invoke() {
        FollowingFeedBusinessDatabase value = FollowingFeedBusinessDatabase.LLILZ.getValue();
        if (value != null) {
            return value.LIZIZ();
        }
        return null;
    }
}
