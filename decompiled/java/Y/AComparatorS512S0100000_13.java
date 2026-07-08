package Y;

import X.C0WMB;
import X.C20085613iQ;
import X.C816670W1x;
import X.InterfaceC1370310llN;
import com.bytedance.sdk.account.otl.OneTapLoginShareInfo;
import com.tts.oecverify.BdTuring;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class AComparatorS512S0100000_13 implements Comparator {
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
            case BdTuring.TYPE_ECAF /* 9 */:
                return compare$9(this, t, t2);
            default:
                return 0;
        }
    }

    public AComparatorS512S0100000_13(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final int compare$0(AComparatorS512S0100000_13 aComparatorS512S0100000_13, Object obj, Object obj2) {
        int iCompare = ((Comparator) aComparatorS512S0100000_13.l0).compare(obj, obj2);
        if (iCompare == 0) {
            return C20085613iQ.LIZIZ(Long.valueOf(((OneTapLoginShareInfo) obj2).lastUpdated), Long.valueOf(((OneTapLoginShareInfo) obj).lastUpdated));
        }
        return iCompare;
    }

    public static final int compare$1(AComparatorS512S0100000_13 aComparatorS512S0100000_13, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Integer) ((Map) aComparatorS512S0100000_13.l0).get(((C816670W1x) obj).LIZ), (Integer) ((Map) aComparatorS512S0100000_13.l0).get(((C816670W1x) obj2).LIZ));
    }

    public static final int compare$2(AComparatorS512S0100000_13 aComparatorS512S0100000_13, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Integer) ((Map) aComparatorS512S0100000_13.l0).get(((C816670W1x) obj).LIZ), (Integer) ((Map) aComparatorS512S0100000_13.l0).get(((C816670W1x) obj2).LIZ));
    }

    public static final int compare$3(AComparatorS512S0100000_13 aComparatorS512S0100000_13, Object obj, Object obj2) {
        int iCompare = ((Comparator) aComparatorS512S0100000_13.l0).compare(obj, obj2);
        if (iCompare == 0) {
            return C20085613iQ.LIZIZ(Integer.valueOf(((C0WMB) obj).LIZLLL().LIZLLL), Integer.valueOf(((C0WMB) obj2).LIZLLL().LIZLLL));
        }
        return iCompare;
    }

    public static final int compare$4(AComparatorS512S0100000_13 aComparatorS512S0100000_13, Object obj, Object obj2) {
        int iCompare = ((Comparator) aComparatorS512S0100000_13.l0).compare(obj, obj2);
        if (iCompare == 0) {
            return C20085613iQ.LIZIZ(Integer.valueOf(((C0WMB) obj).LIZLLL().LIZLLL), Integer.valueOf(((C0WMB) obj2).LIZLLL().LIZLLL));
        }
        return iCompare;
    }

    public static final int compare$5(AComparatorS512S0100000_13 aComparatorS512S0100000_13, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((List) aComparatorS512S0100000_13.l0).indexOf(((InterfaceC1370310llN) obj).key())), Integer.valueOf(((List) aComparatorS512S0100000_13.l0).indexOf(((InterfaceC1370310llN) obj2).key())));
    }

    public static final int compare$6(AComparatorS512S0100000_13 aComparatorS512S0100000_13, Object obj, Object obj2) {
        int iCompare = ((Comparator) aComparatorS512S0100000_13.l0).compare(obj, obj2);
        if (iCompare == 0) {
            return C20085613iQ.LIZIZ(Integer.valueOf(((C0WMB) obj).LIZLLL().LIZLLL), Integer.valueOf(((C0WMB) obj2).LIZLLL().LIZLLL));
        }
        return iCompare;
    }

    public static final int compare$7(AComparatorS512S0100000_13 aComparatorS512S0100000_13, Object obj, Object obj2) {
        int iCompare = ((Comparator) aComparatorS512S0100000_13.l0).compare(obj, obj2);
        if (iCompare == 0) {
            return C20085613iQ.LIZIZ(Integer.valueOf(((C0WMB) obj).LIZLLL().LIZLLL), Integer.valueOf(((C0WMB) obj2).LIZLLL().LIZLLL));
        }
        return iCompare;
    }

    public static final int compare$8(AComparatorS512S0100000_13 aComparatorS512S0100000_13, Object obj, Object obj2) {
        int iCompare = ((Comparator) aComparatorS512S0100000_13.l0).compare(obj, obj2);
        if (iCompare == 0) {
            return C20085613iQ.LIZIZ(Long.valueOf(((OneTapLoginShareInfo) obj2).lastUpdated), Long.valueOf(((OneTapLoginShareInfo) obj).lastUpdated));
        }
        return iCompare;
    }

    public static final int compare$9(AComparatorS512S0100000_13 aComparatorS512S0100000_13, Object obj, Object obj2) {
        int iCompare = ((Comparator) aComparatorS512S0100000_13.l0).compare(obj, obj2);
        if (iCompare == 0) {
            return C20085613iQ.LIZIZ(Integer.valueOf(((C0WMB) obj).LIZLLL().LIZLLL), Integer.valueOf(((C0WMB) obj2).LIZLLL().LIZLLL));
        }
        return iCompare;
    }
}
