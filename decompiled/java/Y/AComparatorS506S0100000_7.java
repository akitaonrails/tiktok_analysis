package Y;

import X.C0INF;
import X.C20085613iQ;
import X.C259800zU;
import com.ss.android.ugc.aweme.subscription.pgc.api.PGCSubscriptionProductDetailWithTemplateInfo;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import webcast.api.sub.TemplateInfo;

/* JADX INFO: loaded from: classes8.dex */
public class AComparatorS506S0100000_7 implements Comparator {
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
            default:
                return 0;
        }
    }

    public AComparatorS506S0100000_7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final int compare$0(AComparatorS506S0100000_7 aComparatorS506S0100000_7, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((List) aComparatorS506S0100000_7.l0).indexOf(((C0INF) obj).LIZIZ)), Integer.valueOf(((List) aComparatorS506S0100000_7.l0).indexOf(((C0INF) obj2).LIZIZ)));
    }

    public static final int compare$1(AComparatorS506S0100000_7 aComparatorS506S0100000_7, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Integer) ((Function1) ((C259800zU) aComparatorS506S0100000_7.l0).element).invoke(obj), (Integer) ((Function1) ((C259800zU) aComparatorS506S0100000_7.l0).element).invoke(obj2));
    }

    public static final int compare$2(AComparatorS506S0100000_7 aComparatorS506S0100000_7, Object obj, Object obj2) {
        int iIntValue;
        Integer num;
        Integer num2;
        long jLongValue = ((Number) obj).longValue();
        Map map = (Map) aComparatorS506S0100000_7.l0;
        int iIntValue2 = Integer.MAX_VALUE;
        if (map != null && (num2 = (Integer) map.get(Long.valueOf(jLongValue))) != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(iIntValue);
        long jLongValue2 = ((Number) obj2).longValue();
        Map map2 = (Map) aComparatorS506S0100000_7.l0;
        if (map2 != null && (num = (Integer) map2.get(Long.valueOf(jLongValue2))) != null) {
            iIntValue2 = num.intValue();
        }
        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(iIntValue2));
    }

    public static final int compare$3(AComparatorS506S0100000_7 aComparatorS506S0100000_7, Object obj, Object obj2) {
        int i;
        TemplateInfo templateInfo;
        TemplateInfo templateInfo2;
        PGCSubscriptionProductDetailWithTemplateInfo pGCSubscriptionProductDetailWithTemplateInfo = (PGCSubscriptionProductDetailWithTemplateInfo) obj;
        Iterator it2 = ((List) aComparatorS506S0100000_7.l0).iterator();
        int i2 = 0;
        while (true) {
            i = -1;
            if (it2.hasNext()) {
                TemplateInfo templateInfo3 = (TemplateInfo) it2.next();
                TemplateInfo templateInfo4 = pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo();
                if (templateInfo4 != null && templateInfo4.subCircle == templateInfo3.subCircle && (templateInfo2 = pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo()) != null && templateInfo2.tplType == templateInfo3.tplType) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        Integer numValueOf = Integer.valueOf(i2);
        PGCSubscriptionProductDetailWithTemplateInfo pGCSubscriptionProductDetailWithTemplateInfo2 = (PGCSubscriptionProductDetailWithTemplateInfo) obj2;
        Iterator it3 = ((List) aComparatorS506S0100000_7.l0).iterator();
        int i3 = 0;
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            TemplateInfo templateInfo5 = (TemplateInfo) it3.next();
            TemplateInfo templateInfo6 = pGCSubscriptionProductDetailWithTemplateInfo2.getTemplateInfo();
            if (templateInfo6 != null && templateInfo6.subCircle == templateInfo5.subCircle && (templateInfo = pGCSubscriptionProductDetailWithTemplateInfo2.getTemplateInfo()) != null && templateInfo.tplType == templateInfo5.tplType) {
                i = i3;
                break;
            }
            i3++;
        }
        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(i));
    }

    public static final int compare$4(AComparatorS506S0100000_7 aComparatorS506S0100000_7, Object obj, Object obj2) {
        int i;
        TemplateInfo templateInfo;
        TemplateInfo templateInfo2;
        PGCSubscriptionProductDetailWithTemplateInfo pGCSubscriptionProductDetailWithTemplateInfo = (PGCSubscriptionProductDetailWithTemplateInfo) obj;
        Iterator it2 = ((List) aComparatorS506S0100000_7.l0).iterator();
        int i2 = 0;
        while (true) {
            i = -1;
            if (it2.hasNext()) {
                TemplateInfo templateInfo3 = (TemplateInfo) it2.next();
                TemplateInfo templateInfo4 = pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo();
                if (templateInfo4 != null && templateInfo4.subCircle == templateInfo3.subCircle && (templateInfo2 = pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo()) != null && templateInfo2.tplType == templateInfo3.tplType) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        Integer numValueOf = Integer.valueOf(i2);
        PGCSubscriptionProductDetailWithTemplateInfo pGCSubscriptionProductDetailWithTemplateInfo2 = (PGCSubscriptionProductDetailWithTemplateInfo) obj2;
        Iterator it3 = ((List) aComparatorS506S0100000_7.l0).iterator();
        int i3 = 0;
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            TemplateInfo templateInfo5 = (TemplateInfo) it3.next();
            TemplateInfo templateInfo6 = pGCSubscriptionProductDetailWithTemplateInfo2.getTemplateInfo();
            if (templateInfo6 != null && templateInfo6.subCircle == templateInfo5.subCircle && (templateInfo = pGCSubscriptionProductDetailWithTemplateInfo2.getTemplateInfo()) != null && templateInfo.tplType == templateInfo5.tplType) {
                i = i3;
                break;
            }
            i3++;
        }
        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(i));
    }
}
