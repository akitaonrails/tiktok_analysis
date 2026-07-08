package Y;

import X.AbstractC1585810rMx;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.profile.platform.business.header.business.storyhighlights.business.HeaderStoryHighlightsMyCollectionComponent;
import com.ss.android.ugc.profile.platform.business.header.business.storyhighlights.business.HeaderStoryHighlightsOtherCollectionComponent;

/* JADX INFO: loaded from: classes3.dex */
public class AsS30S0100000_2 extends AbstractC1585810rMx {
    public final int $t;
    public Object l0;

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

    public AsS30S0100000_2(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJIIZI$0(AsS30S0100000_2 asS30S0100000_2, RecyclerView recyclerView, int i, int i2) {
        ((HeaderStoryHighlightsOtherCollectionComponent) asS30S0100000_2.l0).up();
    }

    public static final void LJJIIZI$1(AsS30S0100000_2 asS30S0100000_2, RecyclerView recyclerView, int i, int i2) {
        ((HeaderStoryHighlightsMyCollectionComponent) asS30S0100000_2.l0).up();
    }
}
