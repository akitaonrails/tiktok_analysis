package Y;

import X.C20085613iQ;
import X.C540820LIy;
import android.text.Editable;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class AComparatorS507S0100000_8 implements Comparator {
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

    public AComparatorS507S0100000_8(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final int compare$0(AComparatorS507S0100000_8 aComparatorS507S0100000_8, Object obj, Object obj2) {
        int iIntValue;
        Integer num = (Integer) ((Map) aComparatorS507S0100000_8.l0).get(((MediaModel) obj).id);
        int iIntValue2 = 0;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        Integer numValueOf = Integer.valueOf(iIntValue);
        Integer num2 = (Integer) ((Map) aComparatorS507S0100000_8.l0).get(((MediaModel) obj2).id);
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        }
        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(iIntValue2));
    }

    public static final int compare$1(AComparatorS507S0100000_8 aComparatorS507S0100000_8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((Editable) aComparatorS507S0100000_8.l0).getSpanStart(obj)), Integer.valueOf(((Editable) aComparatorS507S0100000_8.l0).getSpanStart(obj2)));
    }

    public static final int compare$2(AComparatorS507S0100000_8 aComparatorS507S0100000_8, Object obj, Object obj2) {
        ((C540820LIy) aComparatorS507S0100000_8.l0).getClass();
        Long lValueOf = Long.valueOf(C540820LIy.LIZIZ((SocMediaResource) obj2));
        ((C540820LIy) aComparatorS507S0100000_8.l0).getClass();
        return C20085613iQ.LIZIZ(lValueOf, Long.valueOf(C540820LIy.LIZIZ((SocMediaResource) obj)));
    }
}
