package Y;

import X.AbstractC1585810rMx;
import X.C0IJT;
import X.C0J19;
import X.C0J1E;
import X.C13LP;
import X.C474500IjA;
import X.C511110K2r;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessAnchorSummaryDialog;
import com.bytedance.android.livesdk.model.message.PictionaryInfo;
import com.bytedance.android.livesdkapi.depend.model.live.PictionaryFullInfo;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.onthisday.material.MaterialSelectPagingScene;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.vm.SubSpaceFeedVM;
import java.util.List;
import kotlin.jvm.internal.AwS22S0001000_7;

/* JADX INFO: loaded from: classes8.dex */
public class AsS29S0200000_7 extends AbstractC1585810rMx {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        switch (this.$t) {
            case 0:
                LJJIIJ$0(this, recyclerView, i);
                break;
            case 1:
                LJJIIJ$1(this, recyclerView, i);
                break;
            default:
                super.LJJIIJ(recyclerView, i);
                break;
        }
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        if (2 - this.$t != 0) {
            super.LJJIIZI(recyclerView, i, i2);
        } else {
            LJJIIZI$0(this, recyclerView, i, i2);
        }
    }

    public AsS29S0200000_7(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void LJJIIJ$0(AsS29S0200000_7 asS29S0200000_7, RecyclerView recyclerView, int i) {
        long j;
        PictionaryInfo pictionaryInfo;
        if (i == 0) {
            DrawGuessAnchorSummaryDialog drawGuessAnchorSummaryDialog = (DrawGuessAnchorSummaryDialog) asS29S0200000_7.l0;
            List list = (List) asS29S0200000_7.l1;
            drawGuessAnchorSummaryDialog.getClass();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_pictionary_endpage_roll");
            c474500IjALIZ.LJIJJLI(drawGuessAnchorSummaryDialog.dataChannel);
            PictionaryFullInfo pictionaryFullInfo = (PictionaryFullInfo) C13LP.LJJJLL(list);
            if (pictionaryFullInfo != null && (pictionaryInfo = pictionaryFullInfo.pictionaryInfo) != null) {
                j = pictionaryInfo.sessionId;
            } else {
                j = 0;
            }
            c474500IjALIZ.LJJII(Long.valueOf(j), "pictionary_session_id");
            c474500IjALIZ.LJJII(Integer.valueOf(list.size()), "number_cnt");
            c474500IjALIZ.LIZ();
        }
    }

    public static final void LJJIIJ$1(AsS29S0200000_7 asS29S0200000_7, RecyclerView recyclerView, int i) {
        C0J19 c0j19;
        if (i == 0 && (c0j19 = ((MaterialSelectPagingScene) asS29S0200000_7.l0).LLLF) != null) {
            ((C0J1E) asS29S0200000_7.l1).LIZ(c0j19.LJJLIIIJLLLLLLLZ());
        }
    }

    public static final void LJJIIZI$0(AsS29S0200000_7 asS29S0200000_7, RecyclerView recyclerView, int i, int i2) {
        int iFindFirstCompletelyVisibleItemPosition = ((LinearLayoutManager) asS29S0200000_7.l0).findFirstCompletelyVisibleItemPosition();
        C511110K2r c511110K2r = (C511110K2r) asS29S0200000_7.l1;
        if (c511110K2r.LLILZIL != iFindFirstCompletelyVisibleItemPosition) {
            SubSpaceFeedVM subSpaceFeedVM = c511110K2r.LL;
            subSpaceFeedVM.getClass();
            subSpaceFeedVM.setState(new AwS22S0001000_7(iFindFirstCompletelyVisibleItemPosition, 3));
            ((C511110K2r) asS29S0200000_7.l1).LLILZIL = iFindFirstCompletelyVisibleItemPosition;
        }
    }
}
