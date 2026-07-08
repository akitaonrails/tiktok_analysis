package Y;

import X.AbstractC383800F3a;
import X.C1371650lnX;
import X.C20085613iQ;
import X.C353310DtB;
import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class AComparatorS362S0200000_5 implements Comparator {
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
            case 2:
                return compare$2(this, t, t2);
            default:
                return 0;
        }
    }

    public AComparatorS362S0200000_5(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final int compare$0(AComparatorS362S0200000_5 aComparatorS362S0200000_5, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((AbstractC383800F3a) obj).LJJIL((NLETrack) aComparatorS362S0200000_5.l0, (NLETrackSlot) aComparatorS362S0200000_5.l1) ? 1 : 0), Integer.valueOf(((AbstractC383800F3a) obj2).LJJIL((NLETrack) aComparatorS362S0200000_5.l0, (NLETrackSlot) aComparatorS362S0200000_5.l1) ? 1 : 0));
    }

    public static final int compare$1(AComparatorS362S0200000_5 aComparatorS362S0200000_5, Object obj, Object obj2) {
        int iIntValue;
        String str = (String) obj;
        String str2 = (String) obj2;
        Integer num = (Integer) ((Map) aComparatorS362S0200000_5.l0).get(str);
        int iIntValue2 = 0;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        Integer num2 = (Integer) ((Map) aComparatorS362S0200000_5.l0).get(str2);
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        }
        int i = iIntValue2 - iIntValue;
        if (i == 0) {
            return C1371650lnX.LIZJ(str, (ArrayList) aComparatorS362S0200000_5.l1) - C1371650lnX.LIZJ(str2, (ArrayList) aComparatorS362S0200000_5.l1);
        }
        return i;
    }

    public static final int compare$2(AComparatorS362S0200000_5 aComparatorS362S0200000_5, Object obj, Object obj2) {
        Map map = (Map) aComparatorS362S0200000_5.l0;
        List<C353310DtB> list = (List) aComparatorS362S0200000_5.l1;
        String str = (String) obj;
        String str2 = (String) obj2;
        int iIntValue = ((Integer) map.get(str2)).intValue() - ((Integer) map.get(str)).intValue();
        if (iIntValue == 0) {
            long jLongValue = 0;
            long jLongValue2 = 0;
            for (C353310DtB c353310DtB : list) {
                if (TextUtils.equals(c353310DtB.LIZJ, str) && jLongValue2 <= 0) {
                    jLongValue2 = c353310DtB.LIZIZ.longValue();
                } else if (TextUtils.equals(c353310DtB.LIZJ, str2) && jLongValue <= 0) {
                    jLongValue = c353310DtB.LIZIZ.longValue();
                }
            }
            return (int) (jLongValue - jLongValue2);
        }
        return iIntValue;
    }
}
