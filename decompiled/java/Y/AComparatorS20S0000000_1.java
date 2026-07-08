package Y;

import X.C20085613iQ;
import com.ss.android.ugc.aweme.base.share.QuickShareCandidate;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.RetainInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OSPPageModuleConfig;
import com.ss.android.ugc.aweme.feed.model.CommentTabInfo;
import com.ss.android.ugc.aweme.feed.model.live.DeletedLiveInfo;
import com.tts.oecverify.BdTuring;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public class AComparatorS20S0000000_1 implements Comparator {
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
            case BdTuring.TYPE_ECAF /* 9 */:
                return compare$9(this, t, t2);
            default:
                return 0;
        }
    }

    public AComparatorS20S0000000_1(int i) {
        this.$t = i;
    }

    public static final int compare$0(AComparatorS20S0000000_1 aComparatorS20S0000000_1, Object obj, Object obj2) {
        int iIntValue;
        Integer num = ((RetainInfo) obj).priority;
        int iIntValue2 = Integer.MAX_VALUE;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(iIntValue);
        Integer num2 = ((RetainInfo) obj2).priority;
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        }
        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(iIntValue2));
    }

    public static final int compare$1(AComparatorS20S0000000_1 aComparatorS20S0000000_1, Object obj, Object obj2) {
        int iIntValue;
        Integer num = ((RetainInfo) obj).priority;
        int iIntValue2 = Integer.MAX_VALUE;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(iIntValue);
        Integer num2 = ((RetainInfo) obj2).priority;
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        }
        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(iIntValue2));
    }

    public static final int compare$2(AComparatorS20S0000000_1 aComparatorS20S0000000_1, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((OSPPageModuleConfig) obj).groupId), Integer.valueOf(((OSPPageModuleConfig) obj2).groupId));
    }

    public static final int compare$3(AComparatorS20S0000000_1 aComparatorS20S0000000_1, Object obj, Object obj2) {
        double dDoubleValue;
        Double d = ((QuickShareCandidate) obj2).rateScore;
        double dDoubleValue2 = 0.0d;
        if (d != null) {
            dDoubleValue = d.doubleValue();
        } else {
            dDoubleValue = 0.0d;
        }
        Double dValueOf = Double.valueOf(dDoubleValue);
        Double d2 = ((QuickShareCandidate) obj).rateScore;
        if (d2 != null) {
            dDoubleValue2 = d2.doubleValue();
        }
        return C20085613iQ.LIZIZ(dValueOf, Double.valueOf(dDoubleValue2));
    }

    public static final int compare$4(AComparatorS20S0000000_1 aComparatorS20S0000000_1, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(((CommentTabInfo) obj).priority, ((CommentTabInfo) obj2).priority);
    }

    public static final int compare$5(AComparatorS20S0000000_1 aComparatorS20S0000000_1, Object obj, Object obj2) {
        int iIntValue;
        Integer num = ((RetainInfo) obj).priority;
        int iIntValue2 = Integer.MAX_VALUE;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(iIntValue);
        Integer num2 = ((RetainInfo) obj2).priority;
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        }
        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(iIntValue2));
    }

    public static final int compare$6(AComparatorS20S0000000_1 aComparatorS20S0000000_1, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(-((DeletedLiveInfo) obj).reverseIndex), Long.valueOf(-((DeletedLiveInfo) obj2).reverseIndex));
    }

    public static final int compare$7(AComparatorS20S0000000_1 aComparatorS20S0000000_1, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(-((DeletedLiveInfo) obj).reverseIndex), Long.valueOf(-((DeletedLiveInfo) obj2).reverseIndex));
    }

    public static final int compare$8(AComparatorS20S0000000_1 aComparatorS20S0000000_1, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((OSPPageModuleConfig) obj).groupId), Integer.valueOf(((OSPPageModuleConfig) obj2).groupId));
    }

    public static final int compare$9(AComparatorS20S0000000_1 aComparatorS20S0000000_1, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((OSPPageModuleConfig) obj).groupId), Integer.valueOf(((OSPPageModuleConfig) obj2).groupId));
    }
}
