package Y;

import X.AbstractC1760060vu0;
import X.C13LP;
import X.C1699010uJX;
import X.C1699020uJY;
import X.C1710400ubu;
import X.C1714730uit;
import X.C1714740uiu;
import X.C1751310vft;
import X.C20085613iQ;
import X.EnumC969503qf;
import com.bytedance.pipo.verify.base.model.RawDTOVerifyInfoCandidate;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api.SellerMessage;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public class AComparatorS45S0000000_26 implements Comparator {
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
            default:
                return 0;
        }
    }

    public AComparatorS45S0000000_26(int i) {
        this.$t = i;
    }

    public static final int compare$0(AComparatorS45S0000000_26 aComparatorS45S0000000_26, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((RawDTOVerifyInfoCandidate) obj2).priority), Integer.valueOf(((RawDTOVerifyInfoCandidate) obj).priority));
    }

    public static final int compare$1(AComparatorS45S0000000_26 aComparatorS45S0000000_26, Object obj, Object obj2) {
        Long l;
        SellerMessage sellerMessage;
        SellerMessage sellerMessage2;
        List<SellerMessage> list = ((C1751310vft) obj2).LIZIZ.messages;
        Long l2 = null;
        if (list != null && (sellerMessage2 = (SellerMessage) C13LP.LJJLIIIJL(list)) != null) {
            l = sellerMessage2.createTime;
        } else {
            l = null;
        }
        List<SellerMessage> list2 = ((C1751310vft) obj).LIZIZ.messages;
        if (list2 != null && (sellerMessage = (SellerMessage) C13LP.LJJLIIIJL(list2)) != null) {
            l2 = sellerMessage.createTime;
        }
        return C20085613iQ.LIZIZ(l, l2);
    }

    public static final int compare$2(AComparatorS45S0000000_26 aComparatorS45S0000000_26, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((EnumC969503qf) obj).getTemplate()), Integer.valueOf(((EnumC969503qf) obj2).getTemplate()));
    }

    public static final int compare$3(AComparatorS45S0000000_26 aComparatorS45S0000000_26, Object obj, Object obj2) {
        return Long.compare(((C1699020uJY) obj).LIZ, ((C1699020uJY) obj2).LIZ);
    }

    public static final int compare$4(AComparatorS45S0000000_26 aComparatorS45S0000000_26, Object obj, Object obj2) {
        return Long.compare(((C1699010uJX) obj).LIZ, ((C1699010uJX) obj2).LIZ);
    }

    public static final int compare$5(AComparatorS45S0000000_26 aComparatorS45S0000000_26, Object obj, Object obj2) {
        return Long.compare(((C1699010uJX) obj).LIZ, ((C1699010uJX) obj2).LIZ);
    }

    public static final int compare$6(AComparatorS45S0000000_26 aComparatorS45S0000000_26, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C1710400ubu) obj).LIZLLL.ordinal()), Integer.valueOf(((C1710400ubu) obj2).LIZLLL.ordinal()));
    }

    public static final int compare$7(AComparatorS45S0000000_26 aComparatorS45S0000000_26, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(C1714730uit.LIZ(((C1714740uiu) obj).LIZIZ)), Integer.valueOf(C1714730uit.LIZ(((C1714740uiu) obj2).LIZIZ)));
    }

    public static final int compare$8(AComparatorS45S0000000_26 aComparatorS45S0000000_26, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((AbstractC1760060vu0) obj2).LJ.LIZ), Integer.valueOf(((AbstractC1760060vu0) obj).LJ.LIZ));
    }
}
