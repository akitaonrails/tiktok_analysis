package X;

import com.ss.android.ugc.aweme.comment.commentlist.ui.CommentCharLimitConfig;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: renamed from: X.0lKa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1353700lKa {
    public static final CommentCharLimitConfig LIZ = new CommentCharLimitConfig(true, 6, 6, 2200);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(440));

    public static final boolean LIZ() {
        return ((CommentCharLimitConfig) LIZIZ.getValue()).enable;
    }

    public static final int LIZIZ() {
        return ((CommentCharLimitConfig) LIZIZ.getValue()).charLimit;
    }

    public static final int LIZJ() {
        return ((CommentCharLimitConfig) LIZIZ.getValue()).foldLines;
    }
}
