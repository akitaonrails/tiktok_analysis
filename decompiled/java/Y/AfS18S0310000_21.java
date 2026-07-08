package Y;

import X.C09JN;
import X.C1358220lRs;
import X.C1358550lSP;
import X.C1C7U;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.upvote.detail.panel.RepostLikeViewModel;

/* JADX INFO: loaded from: classes22.dex */
public class AfS18S0310000_21 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

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

    public static final void accept$0(AfS18S0310000_21 afS18S0310000_21, Object obj) {
        C1C7U.LIZ("RepostLikeViewModel@7a3b.handleRepostLikeClick$2");
        RepostLikeViewModel repostLikeViewModel = (RepostLikeViewModel) afS18S0310000_21.l0;
        repostLikeViewModel.LL = false;
        repostLikeViewModel.vQ2(!afS18S0310000_21.z3, (C1358220lRs) afS18S0310000_21.l1, ((Aweme) afS18S0310000_21.l2).getAid());
        C1358550lSP.LIZ.getClass();
        C1358550lSP.LJIIL(0);
        C1C7U.LIZIZ("RepostLikeViewModel@7a3b.handleRepostLikeClick$2");
    }

    public static final void accept$1(AfS18S0310000_21 afS18S0310000_21, Object obj) {
        C1C7U.LIZ("RepostLikeViewModel@7a3b.handleRepostLikeClick$4");
        RepostLikeViewModel repostLikeViewModel = (RepostLikeViewModel) afS18S0310000_21.l0;
        repostLikeViewModel.LL = false;
        repostLikeViewModel.vQ2(!afS18S0310000_21.z3, (C1358220lRs) afS18S0310000_21.l1, ((Aweme) afS18S0310000_21.l2).getAid());
        C1358550lSP.LIZ.getClass();
        C1358550lSP.LJIIL(0);
        C1C7U.LIZIZ("RepostLikeViewModel@7a3b.handleRepostLikeClick$4");
    }

    public AfS18S0310000_21(RepostLikeViewModel repostLikeViewModel, boolean z, C1358220lRs c1358220lRs, Aweme aweme, int i) {
        this.$t = i;
        this.l0 = repostLikeViewModel;
        this.z3 = z;
        this.l1 = c1358220lRs;
        this.l2 = aweme;
    }
}
