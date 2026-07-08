package X;

import com.ss.android.ugc.aweme.comment.model.CommentItemList;

/* JADX INFO: renamed from: X.0hrt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1220590hrt {
    public final long LIZ;
    public final int LIZIZ;
    public String LIZJ;
    public final AnonymousClass0957<CommentItemList> LIZLLL;
    public final String LJ;
    public final int LJFF;

    public C1220590hrt() {
        this(0L, 0, null, null, null, 0, 63);
    }

    public C1220590hrt(long j, int i, String str, AnonymousClass0957 anonymousClass0957, String str2, int i2, int i3) {
        j = (i3 & 1) != 0 ? 0L : j;
        i = (i3 & 2) != 0 ? 0 : i;
        str = (i3 & 4) != 0 ? "" : str;
        anonymousClass0957 = (i3 & 8) != 0 ? null : anonymousClass0957;
        str2 = (i3 & 16) != 0 ? null : str2;
        i2 = (i3 & 32) != 0 ? 0 : i2;
        this.LIZ = j;
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = anonymousClass0957;
        this.LJ = str2;
        this.LJFF = i2;
    }
}
