package Y;

import X.C0RRI;
import X.C1C7U;
import X.C2188811AlT;
import android.widget.LinearLayout;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes12.dex */
public class ACallableS83S0201000_11 implements Callable {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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

    public static final Object call$0(ACallableS83S0201000_11 aCallableS83S0201000_11) {
        Boolean bool;
        C1C7U.LIZ("FeedInteractInfoAreaOnLayoutChangeListener@8a52.onLayoutChange$2");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateViewBottomMargin: uiTasks_hash=");
        sbLIZ.append(((List) aCallableS83S0201000_11.l0).hashCode());
        sbLIZ.append(", hash=");
        sbLIZ.append(((C0RRI) aCallableS83S0201000_11.l1).LL.hashCode());
        sbLIZ.append(" update interactInfoArea bottomPadding=");
        sbLIZ.append(aCallableS83S0201000_11.i2);
        C2188811AlT.LIZIZ(sbLIZ);
        if (aCallableS83S0201000_11.i2 != ((C0RRI) aCallableS83S0201000_11.l1).LL.getPaddingBottom()) {
            LinearLayout linearLayout = ((C0RRI) aCallableS83S0201000_11.l1).LL;
            linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), linearLayout.getPaddingTop(), linearLayout.getPaddingEnd(), aCallableS83S0201000_11.i2);
            bool = Boolean.TRUE;
        } else {
            bool = Boolean.FALSE;
        }
        C1C7U.LIZIZ("FeedInteractInfoAreaOnLayoutChangeListener@8a52.onLayoutChange$2");
        return bool;
    }

    public static final Object call$1(ACallableS83S0201000_11 aCallableS83S0201000_11) {
        Boolean bool;
        C1C7U.LIZ("FeedInteractInfoAreaOnLayoutChangeListener@8a52.onLayoutChangeV2$1");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateViewBottomMargin: uiTasks_hash=");
        sbLIZ.append(((List) aCallableS83S0201000_11.l0).hashCode());
        sbLIZ.append(", hash=");
        sbLIZ.append(((C0RRI) aCallableS83S0201000_11.l1).LL.hashCode());
        sbLIZ.append(" update interactInfoArea bottomPadding=");
        sbLIZ.append(aCallableS83S0201000_11.i2);
        C2188811AlT.LIZIZ(sbLIZ);
        if (aCallableS83S0201000_11.i2 != ((C0RRI) aCallableS83S0201000_11.l1).LL.getPaddingBottom()) {
            LinearLayout linearLayout = ((C0RRI) aCallableS83S0201000_11.l1).LL;
            linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), linearLayout.getPaddingTop(), linearLayout.getPaddingEnd(), aCallableS83S0201000_11.i2);
            bool = Boolean.TRUE;
        } else {
            bool = Boolean.FALSE;
        }
        C1C7U.LIZIZ("FeedInteractInfoAreaOnLayoutChangeListener@8a52.onLayoutChangeV2$1");
        return bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACallableS83S0201000_11(List list, List<Callable<Boolean>> list2, C0RRI c0rri, int i) {
        this.$t = i;
        this.l0 = list;
        this.l1 = list2;
        this.i2 = c0rri;
    }
}
