package Y;

import X.C09JN;
import X.C1348730lCZ;
import X.C1353500lKG;
import X.C1361410lX1;
import X.C13LP;
import X.C162V;
import X.C1C7U;
import com.ss.android.ugc.aweme.comment.model.Comment;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class AfS12S2200000_21 implements C09JN {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

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

    public static final void accept$0(AfS12S2200000_21 afS12S2200000_21, Object obj) {
        C1C7U.LIZ("CommentTranslationRepo@e4dc.multiTranslate$observable$5");
        C1361410lX1.LJIJ(afS12S2200000_21.s1, (List) afS12S2200000_21.l3);
        C1361410lX1 c1361410lX1 = C1361410lX1.LJ;
        Comment comment = (Comment) C13LP.LJJJLL((List) afS12S2200000_21.l2);
        String str = afS12S2200000_21.s0;
        int value = C162V.FAILURE.getValue();
        c1361410lX1.getClass();
        C1361410lX1.LJIJI(value, comment, str, false);
        C1C7U.LIZIZ("CommentTranslationRepo@e4dc.multiTranslate$observable$5");
    }

    public static final void accept$1(AfS12S2200000_21 afS12S2200000_21, Object obj) {
        C1348730lCZ c1348730lCZ = (C1348730lCZ) afS12S2200000_21.l2;
        C1353500lKG c1353500lKG = (C1353500lKG) afS12S2200000_21.l3;
        String str = afS12S2200000_21.s0;
        String str2 = afS12S2200000_21.s1;
        c1348730lCZ.getClass();
        C1C7U.LIZ("CommentInputManager@e031.bindView$1L");
        if (c1348730lCZ.LJJ() && !c1348730lCZ.LJJJI(str, str2, "click_comment_emotion")) {
            c1348730lCZ.LJJI();
            c1348730lCZ.LJJJ(c1353500lKG.getHint(), true);
        }
        C1C7U.LIZIZ("CommentInputManager@e031.bindView$1L");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS12S2200000_21(Object obj, List<? extends Comment> list, String str, List<? extends Comment> list2, String str2) {
        this.$t = str2;
        this.l2 = obj;
        this.s0 = list;
        this.l3 = str;
        this.s1 = list2;
    }
}
