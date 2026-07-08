package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.model.InteractionBubbleCacheState;

/* JADX INFO: renamed from: X.0lKx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public /* synthetic */ class C1353930lKx {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[InteractionBubbleCacheState.values().length];
        try {
            iArr[InteractionBubbleCacheState.NO_CACHE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[InteractionBubbleCacheState.COMMENT_CACHE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[InteractionBubbleCacheState.LIKE_CACHE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[InteractionBubbleCacheState.ALL_CACHE.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZ = iArr;
    }
}
