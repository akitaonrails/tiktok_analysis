package Y;

import X.C0PLT;
import X.C1591140rVY;
import X.C1591190rVd;
import X.C20085613iQ;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.collections.IndexedValue;

/* JADX INFO: loaded from: classes10.dex */
public class AComparatorS508S0100000_9 implements Comparator {
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

    public AComparatorS508S0100000_9(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final int compare$0(AComparatorS508S0100000_9 aComparatorS508S0100000_9, Object obj, Object obj2) {
        String authorUid;
        String secAuthorUid;
        long jLongValue;
        String authorUid2;
        C0PLT c0plt = (C0PLT) obj;
        Aweme aweme = c0plt.getAweme();
        String secAuthorUid2 = null;
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        Aweme aweme2 = c0plt.getAweme();
        if (aweme2 != null) {
            secAuthorUid = AwemeExtKt.getSecAuthorUid(aweme2);
        } else {
            secAuthorUid = null;
        }
        Long l = (Long) ((Map) aComparatorS508S0100000_9.l0).get(authorUid);
        long jLongValue2 = 0;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            Long l2 = (Long) ((Map) aComparatorS508S0100000_9.l0).get(secAuthorUid);
            if (l2 != null) {
                jLongValue = l2.longValue();
            } else {
                jLongValue = 0;
            }
        }
        Long lValueOf = Long.valueOf(jLongValue);
        C0PLT c0plt2 = (C0PLT) obj2;
        Aweme aweme3 = c0plt2.getAweme();
        if (aweme3 != null) {
            authorUid2 = AwemeExtKt.getAuthorUid(aweme3);
        } else {
            authorUid2 = null;
        }
        Aweme aweme4 = c0plt2.getAweme();
        if (aweme4 != null) {
            secAuthorUid2 = AwemeExtKt.getSecAuthorUid(aweme4);
        }
        Long l3 = (Long) ((Map) aComparatorS508S0100000_9.l0).get(authorUid2);
        if (l3 != null || (l3 = (Long) ((Map) aComparatorS508S0100000_9.l0).get(secAuthorUid2)) != null) {
            jLongValue2 = l3.longValue();
        }
        return C20085613iQ.LIZIZ(lValueOf, Long.valueOf(jLongValue2));
    }

    public static final int compare$1(AComparatorS508S0100000_9 aComparatorS508S0100000_9, Object obj, Object obj2) {
        int iIndexOf = ((List) aComparatorS508S0100000_9.l0).indexOf(((Aweme) obj).getAid());
        int i = Integer.MAX_VALUE;
        if (iIndexOf == -1) {
            iIndexOf = Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(iIndexOf);
        int iIndexOf2 = ((List) aComparatorS508S0100000_9.l0).indexOf(((Aweme) obj2).getAid());
        if (iIndexOf2 != -1) {
            i = iIndexOf2;
        }
        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(i));
    }

    public static final int compare$2(AComparatorS508S0100000_9 aComparatorS508S0100000_9, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Boolean.valueOf(!((List) aComparatorS508S0100000_9.l0).contains(((ContentLanguage) obj).getLanguageCode())), Boolean.valueOf(!((List) aComparatorS508S0100000_9.l0).contains(((ContentLanguage) obj2).getLanguageCode())));
    }

    public static final int compare$3(AComparatorS508S0100000_9 aComparatorS508S0100000_9, Object obj, Object obj2) {
        C1591190rVd c1591190rVd = (C1591190rVd) obj;
        float fLIZIZ = ((C1591140rVY) aComparatorS508S0100000_9.l0).LIZIZ(c1591190rVd);
        c1591190rVd.getClass();
        Float fValueOf = Float.valueOf(fLIZIZ);
        C1591190rVd c1591190rVd2 = (C1591190rVd) obj2;
        float fLIZIZ2 = ((C1591140rVY) aComparatorS508S0100000_9.l0).LIZIZ(c1591190rVd2);
        c1591190rVd2.getClass();
        return C20085613iQ.LIZIZ(fValueOf, Float.valueOf(fLIZIZ2));
    }

    public static final int compare$4(AComparatorS508S0100000_9 aComparatorS508S0100000_9, Object obj, Object obj2) {
        double dDoubleValue;
        Double d = (Double) ((Map) aComparatorS508S0100000_9.l0).get(((IndexedValue) obj).LIZIZ);
        double dDoubleValue2 = Double.MAX_VALUE;
        if (d != null) {
            dDoubleValue = d.doubleValue();
        } else {
            dDoubleValue = Double.MAX_VALUE;
        }
        Double dValueOf = Double.valueOf(dDoubleValue);
        Double d2 = (Double) ((Map) aComparatorS508S0100000_9.l0).get(((IndexedValue) obj2).LIZIZ);
        if (d2 != null) {
            dDoubleValue2 = d2.doubleValue();
        }
        return C20085613iQ.LIZIZ(dValueOf, Double.valueOf(dDoubleValue2));
    }
}
