package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.upvote.PublishFrom;

/* JADX INFO: renamed from: X.0lSx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public /* synthetic */ class C1358890lSx {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[PublishFrom.values().length];
        try {
            iArr[PublishFrom.ADD_TEXT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[PublishFrom.REPOST_AND_TEXT.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
