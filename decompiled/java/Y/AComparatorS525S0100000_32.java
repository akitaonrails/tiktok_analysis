package Y;

import X.C20085613iQ;
import X.C21332318e1;
import android.text.Editable;
import java.util.Comparator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes33.dex */
public class AComparatorS525S0100000_32 implements Comparator {
    public final int $t;
    public Object l0;

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

    public AComparatorS525S0100000_32(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final int compare$0(AComparatorS525S0100000_32 aComparatorS525S0100000_32, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((Editable) aComparatorS525S0100000_32.l0).getSpanStart(obj2)), Integer.valueOf(((Editable) aComparatorS525S0100000_32.l0).getSpanStart(obj)));
    }

    public static final int compare$1(AComparatorS525S0100000_32 aComparatorS525S0100000_32, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((Editable) aComparatorS525S0100000_32.l0).getSpanStart(obj2)), Integer.valueOf(((Editable) aComparatorS525S0100000_32.l0).getSpanStart(obj)));
    }

    public static final int compare$2(AComparatorS525S0100000_32 aComparatorS525S0100000_32, Object obj, Object obj2) {
        Integer num = (Integer) ((WeakHashMap) ((C21332318e1) aComparatorS525S0100000_32.l0).LIZJ.getValue()).get(obj);
        Integer num2 = 0;
        if (num == null) {
            num = num2;
        }
        Integer num3 = (Integer) ((WeakHashMap) ((C21332318e1) aComparatorS525S0100000_32.l0).LIZJ.getValue()).get(obj2);
        if (num3 != null) {
            num2 = num3;
        }
        return num.intValue() - num2.intValue();
    }
}
