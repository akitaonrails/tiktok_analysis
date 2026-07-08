package Y;

import X.AbstractC1585810rMx;
import X.C013C;
import X.C19563611gQ;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes28.dex */
public class AsS0S0301000_27 extends AbstractC1585810rMx {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

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
        switch (this.$t) {
            case 0:
                LJJIIZI$0(this, recyclerView, i, i2);
                break;
            case 1:
                LJJIIZI$1(this, recyclerView, i, i2);
                break;
            default:
                super.LJJIIZI(recyclerView, i, i2);
                break;
        }
    }

    public static final void LJJIIJ$0(AsS0S0301000_27 asS0S0301000_27, RecyclerView recyclerView, int i) {
        if (i == 0) {
            ((C013C) asS0S0301000_27.l1).element = false;
            ((C19563611gQ) asS0S0301000_27.l2).removeOnScrollListener(asS0S0301000_27);
        }
    }

    public static final void LJJIIJ$1(AsS0S0301000_27 asS0S0301000_27, RecyclerView recyclerView, int i) {
        if (i == 0) {
            ((C013C) asS0S0301000_27.l1).element = false;
            ((C19563611gQ) asS0S0301000_27.l2).removeOnScrollListener(asS0S0301000_27);
        }
    }

    public static final void LJJIIZI$0(AsS0S0301000_27 asS0S0301000_27, RecyclerView recyclerView, int i, int i2) {
        int iFindLastCompletelyVisibleItemPosition = ((LinearLayoutManager) asS0S0301000_27.l0).findLastCompletelyVisibleItemPosition();
        if (((C013C) asS0S0301000_27.l1).element && iFindLastCompletelyVisibleItemPosition == asS0S0301000_27.i3 - 1) {
            C19563611gQ c19563611gQ = (C19563611gQ) asS0S0301000_27.l2;
            c19563611gQ.smoothScrollBy(0, -c19563611gQ.computeVerticalScrollRange(), new AccelerateDecelerateInterpolator(), LSPassThroughRecordSizeConfig.DEFAULT);
            ((C013C) asS0S0301000_27.l1).element = false;
            ((C19563611gQ) asS0S0301000_27.l2).removeOnScrollListener(asS0S0301000_27);
        }
    }

    public static final void LJJIIZI$1(AsS0S0301000_27 asS0S0301000_27, RecyclerView recyclerView, int i, int i2) {
        int iFindLastCompletelyVisibleItemPosition = ((LinearLayoutManager) asS0S0301000_27.l0).findLastCompletelyVisibleItemPosition();
        if (((C013C) asS0S0301000_27.l1).element && iFindLastCompletelyVisibleItemPosition == asS0S0301000_27.i3 - 1) {
            C19563611gQ c19563611gQ = (C19563611gQ) asS0S0301000_27.l2;
            c19563611gQ.smoothScrollBy(0, -c19563611gQ.computeVerticalScrollRange(), new AccelerateDecelerateInterpolator(), LSPassThroughRecordSizeConfig.DEFAULT);
            ((C013C) asS0S0301000_27.l1).element = false;
            ((C19563611gQ) asS0S0301000_27.l2).removeOnScrollListener(asS0S0301000_27);
        }
    }

    public AsS0S0301000_27(LinearLayoutManager linearLayoutManager, C013C c013c, int i, C19563611gQ c19563611gQ, int i2) {
        this.$t = i2;
        this.l0 = linearLayoutManager;
        this.l1 = c013c;
        this.i3 = i;
        this.l2 = c19563611gQ;
    }
}
