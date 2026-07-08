package X;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.seaonestep.summary.SeaOneStepSummaryFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitFragment;

/* JADX INFO: renamed from: X.04JT, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public class C04JT implements ViewTreeObserver.OnPreDrawListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.$t) {
            case 0:
                return onPreDraw$0(this);
            case 1:
                return onPreDraw$1(this);
            default:
                return false;
        }
    }

    public static final boolean onPreDraw$0(C04JT c04jt) {
        C786410Ut5.D3(((View) c04jt.l0).getViewTreeObserver(), c04jt);
        if (((View) c04jt.l0).getHeight() <= 0) {
            return true;
        }
        if (((View) c04jt.l0).getTranslationY() == 0.0f) {
            C786410Ut5.ed((View) c04jt.l0, r1.getHeight());
        }
        C786410Ut5.LJLLLLLL(0, (View) c04jt.l0);
        ((SeaOneStepSummaryFragment) c04jt.l1).WR();
        return true;
    }

    public static final boolean onPreDraw$1(C04JT c04jt) {
        C786410Ut5.D3(((RecyclerView) c04jt.l0).getViewTreeObserver(), c04jt);
        OrderSubmitFragment orderSubmitFragment = (OrderSubmitFragment) c04jt.l1;
        orderSubmitFragment.LLLI = null;
        orderSubmitFragment.sS((RecyclerView) c04jt.l0);
        return true;
    }

    public C04JT(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
