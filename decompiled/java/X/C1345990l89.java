package X;

import com.ss.android.ugc.aweme.comment.model.Comment;

/* JADX INFO: renamed from: X.0l89, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1345990l89 {
    public final int LIZ;
    public final Comment LIZIZ;
    public final int LIZJ;
    public final AbstractC1345900l80 LIZLLL;
    public final int LJ;
    public final Comment LJFF;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C1345990l89() {
        int i = 0;
        this(i, null, 0 == true ? 1 : 0, i, 63);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1345990l89(int i, Comment comment, AbstractC1345900l80 abstractC1345900l80, int i2, int i3) {
        int i4;
        int i5 = i2;
        AbstractC1345900l80 abstractC1345900l802 = abstractC1345900l80;
        Comment comment2 = comment;
        int i6 = (i3 & 1) != 0 ? -1 : i;
        comment2 = (i3 & 2) != 0 ? null : comment2;
        if ((i3 & 4) != 0) {
            i4 = -1;
        } else {
            i4 = 0;
        }
        this(i6, comment2, i4, (i3 & 8) != 0 ? null : abstractC1345900l802, (i3 & 16) != 0 ? -1 : i5, null);
    }

    public C1345990l89(int i, Comment comment, int i2, AbstractC1345900l80 abstractC1345900l80, int i3, Comment comment2) {
        this.LIZ = i;
        this.LIZIZ = comment;
        this.LIZJ = i2;
        this.LIZLLL = abstractC1345900l80;
        this.LJ = i3;
        this.LJFF = comment2;
    }

    public static C1345990l89 LIZ(C1345990l89 c1345990l89, int i, Comment comment, AbstractC1345900l80 abstractC1345900l80, int i2, int i3) {
        int i4;
        Comment comment2;
        int i5 = i2;
        AbstractC1345900l80 abstractC1345900l802 = abstractC1345900l80;
        Comment comment3 = comment;
        int i6 = i;
        if ((i3 & 1) != 0) {
            i6 = c1345990l89.LIZ;
        }
        if ((i3 & 2) != 0) {
            comment3 = c1345990l89.LIZIZ;
        }
        if ((i3 & 4) != 0) {
            i4 = c1345990l89.LIZJ;
        } else {
            i4 = 0;
        }
        if ((i3 & 8) != 0) {
            abstractC1345900l802 = c1345990l89.LIZLLL;
        }
        if ((i3 & 16) != 0) {
            i5 = c1345990l89.LJ;
        }
        if ((i3 & 32) != 0) {
            comment2 = c1345990l89.LJFF;
        } else {
            comment2 = null;
        }
        return new C1345990l89(i6, comment3, i4, abstractC1345900l802, i5, comment2);
    }
}
