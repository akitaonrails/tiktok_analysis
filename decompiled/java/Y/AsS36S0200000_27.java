package Y;

import X.AbstractC1585810rMx;
import X.C2174781A9k;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.tabs.highlight.HighlightTabAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.questionnaire.second.TakoSecondLevelQuestionnaireFragment;

/* JADX INFO: loaded from: classes28.dex */
public class AsS36S0200000_27 extends AbstractC1585810rMx {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        if (this.$t != 0) {
            super.LJJIIJ(recyclerView, i);
        } else {
            LJJIIJ$0(this, recyclerView, i);
        }
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        if (1 - this.$t != 0) {
            super.LJJIIZI(recyclerView, i, i2);
        } else {
            LJJIIZI$0(this, recyclerView, i, i2);
        }
    }

    public AsS36S0200000_27(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void LJJIIJ$0(AsS36S0200000_27 asS36S0200000_27, RecyclerView recyclerView, int i) {
        if (i == 0) {
            ((HighlightTabAssem) asS36S0200000_27.l0).sp().vQ2((ViewOnAttachStateChangeListenerC20604515jv) asS36S0200000_27.l1);
        }
    }

    public static final void LJJIIZI$0(AsS36S0200000_27 asS36S0200000_27, RecyclerView recyclerView, int i, int i2) {
        if (((TakoSecondLevelQuestionnaireFragment) asS36S0200000_27.l0).LLILZLL && Math.abs(i2) > 5) {
            C2174781A9k.LIZ((ViewOnAttachStateChangeListenerC20604515jv) asS36S0200000_27.l1);
        }
    }
}
