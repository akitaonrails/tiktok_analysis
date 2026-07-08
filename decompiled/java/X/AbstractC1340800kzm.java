package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import java.util.List;

/* JADX INFO: renamed from: X.0kzm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractC1340800kzm implements InterfaceC1340810kzn {
    public abstract InterfaceC1891350zJl LIZJ(Comment comment);

    public abstract int LIZLLL();

    /* JADX WARN: Removed duplicated region for block: B:54:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(java.util.List r14, java.util.List r15, boolean r16) {
        /*
            Method dump skipped, instruction units count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1340800kzm.LJ(java.util.List, java.util.List, boolean):void");
    }

    @Override // X.InterfaceC1340810kzn
    public final void LIZ(CommentItemList commentItemList, List<InterfaceC1891350zJl> list, String str, boolean z) {
        List list2;
        if (commentItemList == null || (list2 = commentItemList.items) == null) {
            list2 = C13BV.INSTANCE;
        }
        LJ(list2, list, z);
    }

    @Override // X.InterfaceC1340810kzn
    public final void LIZIZ(List list, String str, List list2, boolean z) {
        LJ(list, list2, z);
    }
}
