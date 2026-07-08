package Y;

import X.C09JN;
import X.C1C7U;
import com.ss.android.ugc.aweme.comment.viewmodel.CommentListViewModel;
import kotlin.Pair;

/* JADX INFO: loaded from: classes22.dex */
public class AfS4S1100100_21 implements C09JN {
    public final int $t;
    public long j2;
    public Object l1;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS4S1100100_21 afS4S1100100_21, Object obj) {
        C1C7U.LIZ("CommentListViewModel@4471.fetchCommentList$1");
        if (afS4S1100100_21.j2 == 0) {
            ((CommentListViewModel) afS4S1100100_21.l1).zQ2(new Pair(afS4S1100100_21.s0, obj), "REFRESH_COMMENT_LIST_SUCCESS");
        } else {
            ((CommentListViewModel) afS4S1100100_21.l1).zQ2(new Pair(afS4S1100100_21.s0, obj), "LOAD_MORE_COMMENT_LIST_SUCCESS");
        }
        C1C7U.LIZIZ("CommentListViewModel@4471.fetchCommentList$1");
    }

    public static final void accept$1(AfS4S1100100_21 afS4S1100100_21, Object obj) {
        C1C7U.LIZ("CommentListViewModel@4471.fetchCommentList$2");
        if (afS4S1100100_21.j2 == 0) {
            ((CommentListViewModel) afS4S1100100_21.l1).zQ2(afS4S1100100_21.s0, "REFRESH_COMMENT_LIST_FAIL");
        } else {
            ((CommentListViewModel) afS4S1100100_21.l1).zQ2(afS4S1100100_21.s0, "LOAD_MORE_COMMENT_LIST_FAIL");
        }
        C1C7U.LIZIZ("CommentListViewModel@4471.fetchCommentList$2");
    }

    public AfS4S1100100_21(long j, CommentListViewModel commentListViewModel, String str, int i) {
        this.$t = i;
        this.j2 = j;
        this.l1 = commentListViewModel;
        this.s0 = str;
    }
}
