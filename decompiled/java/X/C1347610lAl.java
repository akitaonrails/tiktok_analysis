package X;

import com.ss.android.ugc.aweme.comment.experiment.LongCommentWritingConfig;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: renamed from: X.0lAl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1347610lAl {
    public static final LongCommentWritingConfig LIZ = new LongCommentWritingConfig(0, 0, 10000, 0, 0, 5, 1, 10, 0, 0);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(660));

    public static LongCommentWritingConfig LIZ() {
        return (LongCommentWritingConfig) LIZIZ.getValue();
    }

    public static boolean LIZIZ() {
        return LIZ().hasCharLimitHint == 1;
    }

    public static boolean LIZJ() {
        return LIZ().expandButtonPosOpt == 1;
    }

    public static boolean LIZLLL() {
        return LIZ().needEmptySpaceBetweenParagraph == 1;
    }

    public static boolean LJ() {
        return LIZ().removeAvatar == 1;
    }
}
