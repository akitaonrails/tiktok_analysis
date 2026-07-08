package Y;

import X.C013C;
import X.C0NF2;
import X.C0NF3;
import X.C0OHL;
import X.C20085613iQ;
import X.C259800zU;
import X.C590350NDl;
import X.C590710NEv;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Comparator;
import java.util.Map;
import kotlin.collections.IndexedValue;

/* JADX INFO: loaded from: classes10.dex */
public class AComparatorS363S0200000_9 implements Comparator {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        switch (this.$t) {
            case 0:
                return compare$0(this, t, t2);
            case 1:
                return compare$1(this, t, t2);
            default:
                return 0;
        }
    }

    public AComparatorS363S0200000_9(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }

    public static final int compare$0(AComparatorS363S0200000_9 aComparatorS363S0200000_9, Object obj, Object obj2) {
        int iIntValue;
        Integer num = (Integer) ((Map) ((C259800zU) aComparatorS363S0200000_9.l0).element).get(C0OHL.LIZ((Aweme) obj, "hot_req_control_old_room_id"));
        if (num == null) {
            ((C013C) aComparatorS363S0200000_9.l1).element = true;
        }
        int iIntValue2 = Integer.MAX_VALUE;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(iIntValue);
        Integer num2 = (Integer) ((Map) ((C259800zU) aComparatorS363S0200000_9.l0).element).get(C0OHL.LIZ((Aweme) obj2, "hot_req_control_old_room_id"));
        if (num2 == null) {
            ((C013C) aComparatorS363S0200000_9.l1).element = true;
        } else {
            iIntValue2 = num2.intValue();
        }
        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(iIntValue2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int compare$1(AComparatorS363S0200000_9 aComparatorS363S0200000_9, Object obj, Object obj2) {
        IndexedValue indexedValue = (IndexedValue) obj2;
        IndexedValue indexedValue2 = (IndexedValue) obj;
        return C20085613iQ.LIZIZ(Double.valueOf(((C0NF2) aComparatorS363S0200000_9.l1).LIZJ.LJIIIZ(new C0NF3(indexedValue.LIZ, (C590350NDl) indexedValue.LIZIZ, ((C590710NEv) aComparatorS363S0200000_9.l0).LIZIZ))), Double.valueOf(((C0NF2) aComparatorS363S0200000_9.l1).LIZJ.LJIIIZ(new C0NF3(indexedValue2.LIZ, (C590350NDl) indexedValue2.LIZIZ, ((C590710NEv) aComparatorS363S0200000_9.l0).LIZIZ))));
    }
}
