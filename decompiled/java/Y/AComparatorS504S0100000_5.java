package Y;

import X.C0E0F;
import X.C0EIO;
import X.C20085613iQ;
import X.C694940RNs;
import X.InterfaceC489200JGk;
import android.text.Editable;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.experiment.LanguageDetail;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public class AComparatorS504S0100000_5 implements Comparator {
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
            case 3:
                return compare$3(this, t, t2);
            case 4:
                return compare$4(this, t, t2);
            case 5:
                return compare$5(this, t, t2);
            case 6:
                return compare$6(this, t, t2);
            case 7:
                return compare$7(this, t, t2);
            case 8:
                return compare$8(this, t, t2);
            default:
                return 0;
        }
    }

    public AComparatorS504S0100000_5(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final int compare$0(AComparatorS504S0100000_5 aComparatorS504S0100000_5, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Boolean.valueOf(C0E0F.LIZIZ((ResourceItem) obj2, (NLEResType) aComparatorS504S0100000_5.l0)), Boolean.valueOf(C0E0F.LIZIZ((ResourceItem) obj, (NLEResType) aComparatorS504S0100000_5.l0)));
    }

    public static final int compare$1(AComparatorS504S0100000_5 aComparatorS504S0100000_5, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((List) aComparatorS504S0100000_5.l0).indexOf(((C0EIO) obj).getType())), Integer.valueOf(((List) aComparatorS504S0100000_5.l0).indexOf(((C0EIO) obj2).getType())));
    }

    public static final int compare$2(AComparatorS504S0100000_5 aComparatorS504S0100000_5, Object obj, Object obj2) {
        return ((Editable) aComparatorS504S0100000_5.l0).getSpanStart(obj) - ((Editable) aComparatorS504S0100000_5.l0).getSpanStart(obj2);
    }

    public static final int compare$3(AComparatorS504S0100000_5 aComparatorS504S0100000_5, Object obj, Object obj2) {
        Function1 function1 = (Function1) aComparatorS504S0100000_5.l0;
        return C20085613iQ.LIZIZ((Comparable) function1.invoke(obj), (Comparable) function1.invoke(obj2));
    }

    public static final int compare$4(AComparatorS504S0100000_5 aComparatorS504S0100000_5, Object obj, Object obj2) {
        int iIntValue;
        Integer num = (Integer) ((Map) aComparatorS504S0100000_5.l0).get(Long.valueOf(((InterfaceC489200JGk) obj).LJ(true)));
        int iIntValue2 = Integer.MAX_VALUE;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(iIntValue);
        Integer num2 = (Integer) ((Map) aComparatorS504S0100000_5.l0).get(Long.valueOf(((InterfaceC489200JGk) obj2).LJ(true)));
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        }
        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(iIntValue2));
    }

    public static final int compare$5(AComparatorS504S0100000_5 aComparatorS504S0100000_5, Object obj, Object obj2) {
        return ((Editable) aComparatorS504S0100000_5.l0).getSpanStart(obj) - ((Editable) aComparatorS504S0100000_5.l0).getSpanStart(obj2);
    }

    public static final int compare$6(AComparatorS504S0100000_5 aComparatorS504S0100000_5, Object obj, Object obj2) {
        int iIntValue;
        Map<String, Integer> map;
        Integer num;
        Map<String, Integer> map2;
        Integer num2;
        C694940RNs c694940RNs = (C694940RNs) aComparatorS504S0100000_5.l0;
        int iIntValue2 = Integer.MAX_VALUE;
        if (c694940RNs != null && (map2 = c694940RNs.LIZIZ) != null && (num2 = map2.get(obj)) != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(iIntValue);
        C694940RNs c694940RNs2 = (C694940RNs) aComparatorS504S0100000_5.l0;
        if (c694940RNs2 != null && (map = c694940RNs2.LIZIZ) != null && (num = map.get(obj2)) != null) {
            iIntValue2 = num.intValue();
        }
        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(iIntValue2));
    }

    public static final int compare$7(AComparatorS504S0100000_5 aComparatorS504S0100000_5, Object obj, Object obj2) {
        Integer numValueOf;
        LanguageDetail languageDetail = (LanguageDetail) obj;
        Integer num = (Integer) ((HashMap) aComparatorS504S0100000_5.l0).get(((LanguageDetail) obj2).appLangCode);
        if (num != null) {
            HashMap map = (HashMap) aComparatorS504S0100000_5.l0;
            int iIntValue = num.intValue();
            Integer num2 = (Integer) map.get(languageDetail.appLangCode);
            if (num2 != null && (numValueOf = Integer.valueOf(num2.intValue() - iIntValue)) != null) {
                return numValueOf.intValue();
            }
            return 0;
        }
        return 0;
    }

    public static final int compare$8(AComparatorS504S0100000_5 aComparatorS504S0100000_5, Object obj, Object obj2) {
        int iIntValue;
        Integer num = (Integer) ((Map) aComparatorS504S0100000_5.l0).get(obj.getClass());
        int iIntValue2 = Integer.MAX_VALUE;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(iIntValue);
        Integer num2 = (Integer) ((Map) aComparatorS504S0100000_5.l0).get(obj2.getClass());
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        }
        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(iIntValue2));
    }
}
