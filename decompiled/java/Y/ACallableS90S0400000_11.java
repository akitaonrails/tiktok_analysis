package Y;

import X.C01GW;
import X.C0RRI;
import X.C1C7U;
import X.C2188811AlT;
import X.C259800zU;
import X.C694320RLi;
import android.view.View;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
public class ACallableS90S0400000_11 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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

    public static final Object call$0(ACallableS90S0400000_11 aCallableS90S0400000_11) {
        C1C7U.LIZ("FeedInteractInfoAreaOnLayoutChangeListener@8a52.onLayoutChangeV2$2$2");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update: hash=");
        sbLIZ.append(((C0RRI) aCallableS90S0400000_11.l0).LL.hashCode());
        sbLIZ.append(" task=");
        sbLIZ.append(((List) aCallableS90S0400000_11.l1).hashCode());
        sbLIZ.append(", view=");
        sbLIZ.append(((View) aCallableS90S0400000_11.l2).hashCode());
        sbLIZ.append(", restore last visible view list");
        C2188811AlT.LIZIZ(sbLIZ);
        C01GW c01gw = C694320RLi.LIZ;
        Boolean boolValueOf = Boolean.valueOf(C694320RLi.LIZ((View) aCallableS90S0400000_11.l2, (Function2) ((C259800zU) aCallableS90S0400000_11.l3).element));
        C1C7U.LIZIZ("FeedInteractInfoAreaOnLayoutChangeListener@8a52.onLayoutChangeV2$2$2");
        return boolValueOf;
    }

    public static final Object call$1(ACallableS90S0400000_11 aCallableS90S0400000_11) {
        C1C7U.LIZ("FeedInteractInfoAreaOnLayoutChangeListener@8a52.onLayoutChangeV2$4");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update: hash=");
        sbLIZ.append(((C0RRI) aCallableS90S0400000_11.l0).LL.hashCode());
        sbLIZ.append(" task=");
        sbLIZ.append(((List) aCallableS90S0400000_11.l1).hashCode());
        sbLIZ.append(", view=");
        sbLIZ.append(((View) aCallableS90S0400000_11.l2).hashCode());
        sbLIZ.append(", restore unnessary view margin");
        C2188811AlT.LIZIZ(sbLIZ);
        C01GW c01gw = C694320RLi.LIZ;
        Boolean boolValueOf = Boolean.valueOf(C694320RLi.LIZ((View) aCallableS90S0400000_11.l2, (Function2) ((C259800zU) aCallableS90S0400000_11.l3).element));
        C1C7U.LIZIZ("FeedInteractInfoAreaOnLayoutChangeListener@8a52.onLayoutChangeV2$4");
        return boolValueOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACallableS90S0400000_11(C0RRI c0rri, C0RRI c0rri2, List<Callable<Boolean>> list, View view, C259800zU<Function2<View, Integer, Unit>> c259800zU) {
        this.$t = c259800zU;
        this.l0 = c0rri;
        this.l1 = c0rri2;
        this.l2 = list;
        this.l3 = view;
    }
}
