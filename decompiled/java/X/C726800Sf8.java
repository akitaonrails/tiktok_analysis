package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Sf8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C726800Sf8 {
    public static final boolean LIZ(Aweme aweme) {
        C1517460pai c1517460pai;
        C1C1T c1c1t = C2203191BKr.LIZ(aweme).socialBlob;
        if (c1c1t != null && (c1517460pai = c1c1t.story_archive_blob) != null) {
            return Intrinsics.LJFF(c1517460pai.is_archive_filtered, Boolean.TRUE);
        }
        return false;
    }

    public static final boolean LIZIZ(Aweme aweme) {
        AwemeStatus statusSafety;
        if (!AwemeExtKt.isSharedStoryVisible(aweme) || AwemeExtKt.isCommentPostInvisible(aweme) || ((statusSafety = AwemeExtKt.getStatusSafety(aweme)) != null && !statusSafety.isInReviewing() && statusSafety.isProhibited())) {
            return true;
        }
        return false;
    }
}
