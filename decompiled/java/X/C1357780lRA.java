package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0lRA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1357780lRA {
    public static final C1351060lGK LIZ(CommentItemList commentItemList) {
        List<Comment> list;
        boolean z = false;
        if (commentItemList == null || (list = commentItemList.items) == null || list.isEmpty()) {
            commentItemList = new CommentItemList();
            commentItemList.items = new ArrayList();
        }
        List<Comment> list2 = commentItemList.items;
        if (list2 == null || list2.isEmpty()) {
            z = true;
        }
        return new C1351060lGK(commentItemList, z, 46);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0030 A[PHI: r3
      0x0030: PHI (r3v1 int) = (r3v0 int), (r3v4 int) binds: [B:22:0x002d, B:8:0x000d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1357800lRC LIZIZ(com.ss.android.ugc.aweme.friendstab.repo.RepostCommentStruct r5) {
        /*
            r4 = 0
            if (r5 == 0) goto L2c
            java.util.List<com.ss.android.ugc.aweme.feed.model.upvote.RepostReplyStruct> r0 = r5.repostCommentList
            if (r0 == 0) goto L2c
            int r3 = r0.size()
        Lb:
            java.lang.Integer r0 = r5.repostCommentCount
            if (r0 == 0) goto L30
            int r2 = r0.intValue()
        L13:
            java.lang.Boolean r1 = r5.hasMore
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L1e
            r2 = r3
        L1e:
            X.0lRC r1 = new X.0lRC
            if (r2 != 0) goto L2a
            r0 = 1
        L23:
            if (r2 <= r3) goto L26
            r4 = 1
        L26:
            r1.<init>(r2, r0, r4)
            return r1
        L2a:
            r0 = 0
            goto L23
        L2c:
            r3 = 0
            if (r5 == 0) goto L30
            goto Lb
        L30:
            r2 = 0
            if (r5 == 0) goto L1e
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1357780lRA.LIZIZ(com.ss.android.ugc.aweme.friendstab.repo.RepostCommentStruct):X.0lRC");
    }
}
