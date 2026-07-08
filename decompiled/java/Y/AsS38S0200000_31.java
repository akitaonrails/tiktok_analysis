package Y;

import X.AbstractC1585810rMx;
import X.C13LZ;
import X.C786410Ut5;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.explore.assem.ExploreTopicGeneralFeedListComponent;
import com.ss.android.ugc.aweme.im.sharepanel.impl.editshare.assem.VerticalContactListAssem;

/* JADX INFO: loaded from: classes32.dex */
public class AsS38S0200000_31 extends AbstractC1585810rMx {
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

    public AsS38S0200000_31(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }

    public static final void LJJIIJ$0(AsS38S0200000_31 asS38S0200000_31, RecyclerView recyclerView, int i) {
        InputMethodManager inputMethodManager;
        if (i != 0) {
            VerticalContactListAssem verticalContactListAssem = (VerticalContactListAssem) asS38S0200000_31.l0;
            View view = (View) asS38S0200000_31.l1;
            verticalContactListAssem.getClass();
            if (view != null) {
                Context context = view.getContext();
                Object objH2 = null;
                if (context != null) {
                    objH2 = C786410Ut5.H2(context, "input_method");
                }
                if ((objH2 instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) objH2) != null && inputMethodManager.isActive()) {
                    inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                }
            }
        }
    }

    public static final void LJJIIZI$0(AsS38S0200000_31 asS38S0200000_31, RecyclerView recyclerView, int i, int i2) {
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        if (iComputeVerticalScrollOffset < 0) {
            iComputeVerticalScrollOffset = 0;
        }
        ExploreTopicGeneralFeedListComponent exploreTopicGeneralFeedListComponent = (ExploreTopicGeneralFeedListComponent) asS38S0200000_31.l0;
        exploreTopicGeneralFeedListComponent.LLJJJJJIL = C13LZ.LJ(iComputeVerticalScrollOffset, 0, exploreTopicGeneralFeedListComponent.LLJJJJLIIL);
        C786410Ut5.ed((View) asS38S0200000_31.l1, -((ExploreTopicGeneralFeedListComponent) asS38S0200000_31.l0).LLJJJJJIL);
        ExploreTopicGeneralFeedListComponent exploreTopicGeneralFeedListComponent2 = (ExploreTopicGeneralFeedListComponent) asS38S0200000_31.l0;
        exploreTopicGeneralFeedListComponent2.Bp(exploreTopicGeneralFeedListComponent2.LLJJJJJIL);
    }
}
