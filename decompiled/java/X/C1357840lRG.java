package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteCacheState;

/* JADX INFO: renamed from: X.0lRG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public /* synthetic */ class C1357840lRG {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[UpvoteCacheState.values().length];
        try {
            iArr[UpvoteCacheState.PRE_PUBLISH.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[UpvoteCacheState.PUBLISH_SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[UpvoteCacheState.PUBLISH_FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
