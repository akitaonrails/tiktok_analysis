package Y;

import X.C1345005Oe;
import X.C1622406Ww;
import X.C20085613iQ;
import X.InterfaceC1369790lkX;
import X.InterfaceC1444205l2;
import X.InterfaceC1756706uL;
import com.ss.android.ugc.aweme.affinity.model.SocialAffinityItem;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.protocol.FakeMsgProtocol;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.File;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public class AComparatorS501S0100000_2 implements Comparator {
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
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return compare$10(this, t, t2);
            default:
                return 0;
        }
    }

    public AComparatorS501S0100000_2(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final int compare$0(AComparatorS501S0100000_2 aComparatorS501S0100000_2, Object obj, Object obj2) {
        int iCompare = ((Comparator) aComparatorS501S0100000_2.l0).compare(obj, obj2);
        if (iCompare == 0) {
            return C20085613iQ.LIZIZ(Integer.valueOf(((File) obj).getAbsolutePath().length()), Integer.valueOf(((File) obj2).getAbsolutePath().length()));
        }
        return iCompare;
    }

    public static final int compare$1(AComparatorS501S0100000_2 aComparatorS501S0100000_2, Object obj, Object obj2) {
        int iCompare = ((Comparator) aComparatorS501S0100000_2.l0).compare(obj, obj2);
        if (iCompare == 0) {
            return C20085613iQ.LIZIZ(((C1622406Ww) obj2).LIZJ.LIZ, ((C1622406Ww) obj).LIZJ.LIZ);
        }
        return iCompare;
    }

    public static final int compare$10(AComparatorS501S0100000_2 aComparatorS501S0100000_2, Object obj, Object obj2) {
        double d;
        SocialAffinityItem socialAffinityItem;
        SocialAffinityItem socialAffinityItem2;
        IMContact iMContact = (IMContact) obj2;
        if (!(iMContact instanceof IMUser)) {
            iMContact = null;
        }
        double d2 = 0.0d;
        if (iMContact != null && (socialAffinityItem2 = (SocialAffinityItem) ((Map) aComparatorS501S0100000_2.l0).get(iMContact.getUid())) != null) {
            d = socialAffinityItem2.score;
        } else {
            d = 0.0d;
        }
        Double dValueOf = Double.valueOf(d);
        IMContact iMContact2 = (IMContact) obj;
        if ((iMContact2 instanceof IMUser) && iMContact2 != null && (socialAffinityItem = (SocialAffinityItem) ((Map) aComparatorS501S0100000_2.l0).get(iMContact2.getUid())) != null) {
            d2 = socialAffinityItem.score;
        }
        return C20085613iQ.LIZIZ(dValueOf, Double.valueOf(d2));
    }

    public static final int compare$2(AComparatorS501S0100000_2 aComparatorS501S0100000_2, Object obj, Object obj2) {
        int iIntValue;
        Integer num = (Integer) ((Map) aComparatorS501S0100000_2.l0).get(((InterfaceC1369790lkX) obj).key());
        int iIntValue2 = Integer.MAX_VALUE;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(iIntValue);
        Integer num2 = (Integer) ((Map) aComparatorS501S0100000_2.l0).get(((InterfaceC1369790lkX) obj2).key());
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        }
        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(iIntValue2));
    }

    public static final int compare$3(AComparatorS501S0100000_2 aComparatorS501S0100000_2, Object obj, Object obj2) {
        Double dValueOf;
        SocialAffinityItem socialAffinityItem = (SocialAffinityItem) ((Map) aComparatorS501S0100000_2.l0).get(String.valueOf(((C1345005Oe) obj2).LIZ));
        Double dValueOf2 = null;
        if (socialAffinityItem != null) {
            dValueOf = Double.valueOf(socialAffinityItem.score);
        } else {
            dValueOf = null;
        }
        SocialAffinityItem socialAffinityItem2 = (SocialAffinityItem) ((Map) aComparatorS501S0100000_2.l0).get(String.valueOf(((C1345005Oe) obj).LIZ));
        if (socialAffinityItem2 != null) {
            dValueOf2 = Double.valueOf(socialAffinityItem2.score);
        }
        return C20085613iQ.LIZIZ(dValueOf, dValueOf2);
    }

    public static final int compare$4(AComparatorS501S0100000_2 aComparatorS501S0100000_2, Object obj, Object obj2) {
        int iIntValue;
        InterfaceC1444205l2 interfaceC1444205l2 = (InterfaceC1444205l2) obj;
        int iIntValue2 = Integer.MAX_VALUE;
        if (((Set) aComparatorS501S0100000_2.l0).contains(interfaceC1444205l2.getIdentifier())) {
            iIntValue = Integer.MIN_VALUE;
        } else {
            Integer numLJIILJJIL = interfaceC1444205l2.LJIILJJIL();
            if (numLJIILJJIL != null) {
                iIntValue = numLJIILJJIL.intValue();
            } else {
                iIntValue = Integer.MAX_VALUE;
            }
        }
        Integer numValueOf = Integer.valueOf(iIntValue);
        InterfaceC1444205l2 interfaceC1444205l22 = (InterfaceC1444205l2) obj2;
        if (((Set) aComparatorS501S0100000_2.l0).contains(interfaceC1444205l22.getIdentifier())) {
            iIntValue2 = Integer.MIN_VALUE;
        } else {
            Integer numLJIILJJIL2 = interfaceC1444205l22.LJIILJJIL();
            if (numLJIILJJIL2 != null) {
                iIntValue2 = numLJIILJJIL2.intValue();
            }
        }
        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(iIntValue2));
    }

    public static final int compare$5(AComparatorS501S0100000_2 aComparatorS501S0100000_2, Object obj, Object obj2) {
        int iIndexOf = ((List) aComparatorS501S0100000_2.l0).indexOf(((InterfaceC1369790lkX) obj).key());
        int i = Integer.MAX_VALUE;
        if (iIndexOf == -1) {
            iIndexOf = Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(iIndexOf);
        int iIndexOf2 = ((List) aComparatorS501S0100000_2.l0).indexOf(((InterfaceC1369790lkX) obj2).key());
        if (iIndexOf2 != -1) {
            i = iIndexOf2;
        }
        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(i));
    }

    public static final int compare$6(AComparatorS501S0100000_2 aComparatorS501S0100000_2, Object obj, Object obj2) {
        int iIndexOf = ((List) aComparatorS501S0100000_2.l0).indexOf(((InterfaceC1369790lkX) obj).key());
        int i = Integer.MAX_VALUE;
        if (iIndexOf == -1) {
            iIndexOf = Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(iIndexOf);
        int iIndexOf2 = ((List) aComparatorS501S0100000_2.l0).indexOf(((InterfaceC1369790lkX) obj2).key());
        if (iIndexOf2 != -1) {
            i = iIndexOf2;
        }
        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(i));
    }

    public static final int compare$7(AComparatorS501S0100000_2 aComparatorS501S0100000_2, Object obj, Object obj2) {
        int iCompare = ((Comparator) aComparatorS501S0100000_2.l0).compare(obj, obj2);
        if (iCompare == 0) {
            return C20085613iQ.LIZIZ((Comparable) ((Pair) obj).getFirst(), (Comparable) ((Pair) obj2).getFirst());
        }
        return iCompare;
    }

    public static final int compare$8(AComparatorS501S0100000_2 aComparatorS501S0100000_2, Object obj, Object obj2) {
        int iCompare = ((Comparator) aComparatorS501S0100000_2.l0).compare(obj, obj2);
        if (iCompare == 0) {
            return C20085613iQ.LIZIZ((Comparable) ((Map.Entry) obj).getKey(), (Comparable) ((Map.Entry) obj2).getKey());
        }
        return iCompare;
    }

    public static final int compare$9(AComparatorS501S0100000_2 aComparatorS501S0100000_2, Object obj, Object obj2) {
        int iLJ;
        InterfaceC1756706uL interfaceC1756706uLXf1;
        InterfaceC1756706uL interfaceC1756706uLXf12;
        FakeMsgProtocol fakeMsgProtocol = (FakeMsgProtocol) ((Map) aComparatorS501S0100000_2.l0).get(Integer.valueOf(((Number) obj2).intValue()));
        int iLJ2 = -1;
        if (fakeMsgProtocol != null && (interfaceC1756706uLXf12 = fakeMsgProtocol.xf1()) != null) {
            iLJ = interfaceC1756706uLXf12.LJ();
        } else {
            iLJ = -1;
        }
        Integer numValueOf = Integer.valueOf(iLJ);
        FakeMsgProtocol fakeMsgProtocol2 = (FakeMsgProtocol) ((Map) aComparatorS501S0100000_2.l0).get(Integer.valueOf(((Number) obj).intValue()));
        if (fakeMsgProtocol2 != null && (interfaceC1756706uLXf1 = fakeMsgProtocol2.xf1()) != null) {
            iLJ2 = interfaceC1756706uLXf1.LJ();
        }
        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(iLJ2));
    }
}
