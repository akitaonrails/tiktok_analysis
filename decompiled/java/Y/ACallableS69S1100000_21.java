package Y;

import X.C1350920lG6;
import X.C1C7U;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.commentv2.commentlist.ui.CommentListFragmentV2;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes22.dex */
public class ACallableS69S1100000_21 implements Callable {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$0(Y.ACallableS69S1100000_21 r11) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS69S1100000_21.call$0(Y.ACallableS69S1100000_21):java.lang.Object");
    }

    public static final Object call$1(ACallableS69S1100000_21 aCallableS69S1100000_21) {
        C1C7U.LIZ("CommentListFragmentV2@8fe4.onCommentListShow$1");
        C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
        CommentContextSource commentContextSourceGL = ((CommentListFragmentV2) aCallableS69S1100000_21.l1).GL();
        String str = aCallableS69S1100000_21.s0;
        c1350920lG6.getClass();
        C1350920lG6.LJLJL(commentContextSourceGL, str);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentListFragmentV2@8fe4.onCommentListShow$1");
        return unit;
    }

    public ACallableS69S1100000_21(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
