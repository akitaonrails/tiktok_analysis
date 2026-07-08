package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0hkz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1216310hkz {
    public final String LIZ;
    public final Aweme LIZIZ;
    public final boolean LIZJ;
    public final Comment LIZLLL;

    public C1216310hkz(String str, Aweme aweme, boolean z, Comment comment, int i) {
        str = (i & 1) != 0 ? "" : str;
        aweme = (i & 2) != 0 ? null : aweme;
        z = (i & 4) != 0 ? false : z;
        comment = (i & 8) != 0 ? null : comment;
        this.LIZ = str;
        this.LIZIZ = aweme;
        this.LIZJ = z;
        this.LIZLLL = comment;
    }
}
