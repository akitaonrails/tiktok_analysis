package Y;

import X.C20085613iQ;
import X.EnumC1904380zem;
import com.bytedance.touchpoint.api.model.ActivityTask;
import com.bytedance.touchpoint.api.model.Control;
import com.bytedance.touchpoint.api.model.InAppPush;
import java.util.Comparator;

/* JADX INFO: loaded from: classes29.dex */
public class AComparatorS47S0000000_28 implements Comparator {
    public final int $t;

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        switch (this.$t) {
            case 0:
                return compare$0(this, t, t2);
            case 1:
                return compare$1(this, t, t2);
            case 2:
                return compare$2(this, t, t2);
            default:
                return 0;
        }
    }

    public AComparatorS47S0000000_28(int i) {
        this.$t = i;
    }

    public static final int compare$0(AComparatorS47S0000000_28 aComparatorS47S0000000_28, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((EnumC1904380zem) obj).getInterval().LIZIZ), Long.valueOf(((EnumC1904380zem) obj2).getInterval().LIZIZ));
    }

    public static final int compare$1(AComparatorS47S0000000_28 aComparatorS47S0000000_28, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((ActivityTask) obj).time), Integer.valueOf(((ActivityTask) obj2).time));
    }

    public static final int compare$2(AComparatorS47S0000000_28 aComparatorS47S0000000_28, Object obj, Object obj2) {
        Integer numValueOf;
        Control control = ((InAppPush) obj).control;
        Integer numValueOf2 = null;
        if (control != null) {
            numValueOf = Integer.valueOf(control.time);
        } else {
            numValueOf = null;
        }
        Control control2 = ((InAppPush) obj2).control;
        if (control2 != null) {
            numValueOf2 = Integer.valueOf(control2.time);
        }
        return C20085613iQ.LIZIZ(numValueOf, numValueOf2);
    }
}
