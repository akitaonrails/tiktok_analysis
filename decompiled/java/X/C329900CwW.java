package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo.UserContent;

/* JADX INFO: renamed from: X.0CwW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public /* synthetic */ class C329900CwW {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[UserContent.SourceType.values().length];
        try {
            iArr[UserContent.SourceType.VIDEO.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[UserContent.SourceType.PHOTO_TEXT.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[UserContent.SourceType.COMMENT.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
