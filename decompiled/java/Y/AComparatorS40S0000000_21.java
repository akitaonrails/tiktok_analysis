package Y;

import X.C1157190gDd;
import X.C1360700lVs;
import X.C1369250ljf;
import X.C1369260ljg;
import X.C1372800lpO;
import X.C1397060mSW;
import X.C20085613iQ;
import X.InterfaceC1346750l9N;
import X.InterfaceC1367160lgI;
import X.InterfaceC1370520lli;
import X.InterfaceC1396870mSD;
import com.ss.android.ugc.aweme.comment.model.OptionCount;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol;
import com.ss.android.ugc.aweme.longpress.SharePanelActionOrderRule;
import com.ss.android.ugc.aweme.repostfeed.model.RepostNewContentMeta;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Comparator;

/* JADX INFO: loaded from: classes22.dex */
public class AComparatorS40S0000000_21 implements Comparator {
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
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return compare$10(this, t, t2);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return compare$11(this, t, t2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return compare$12(this, t, t2);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return compare$13(this, t, t2);
            default:
                return 0;
        }
    }

    public AComparatorS40S0000000_21(int i) {
        this.$t = i;
    }

    public static final int compare$0(AComparatorS40S0000000_21 aComparatorS40S0000000_21, Object obj, Object obj2) {
        C1157190gDd c1157190gDd;
        long j;
        C1157190gDd c1157190gDd2;
        InterfaceC1367160lgI interfaceC1367160lgI = ((IMContact) obj2).getInfo().LIZLLL;
        if (interfaceC1367160lgI instanceof C1157190gDd) {
            c1157190gDd = (C1157190gDd) interfaceC1367160lgI;
        } else {
            c1157190gDd = null;
        }
        long j2 = 0;
        if (c1157190gDd != null) {
            j = c1157190gDd.LIZ;
        } else {
            j = 0;
        }
        Long lValueOf = Long.valueOf(j);
        InterfaceC1367160lgI interfaceC1367160lgI2 = ((IMContact) obj).getInfo().LIZLLL;
        if ((interfaceC1367160lgI2 instanceof C1157190gDd) && (c1157190gDd2 = (C1157190gDd) interfaceC1367160lgI2) != null) {
            j2 = c1157190gDd2.LIZ;
        }
        return C20085613iQ.LIZIZ(lValueOf, Long.valueOf(j2));
    }

    public static final int compare$1(AComparatorS40S0000000_21 aComparatorS40S0000000_21, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Float.valueOf(((C1397060mSW) obj).LJJIII()), Float.valueOf(((C1397060mSW) obj2).LJJIII()));
    }

    public static final int compare$10(AComparatorS40S0000000_21 aComparatorS40S0000000_21, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Float.valueOf(((C1397060mSW) obj).LJJIII()), Float.valueOf(((C1397060mSW) obj2).LJJIII()));
    }

    public static final int compare$11(AComparatorS40S0000000_21 aComparatorS40S0000000_21, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C1372800lpO) obj).LIZIZ), Integer.valueOf(((C1372800lpO) obj2).LIZIZ));
    }

    public static final int compare$12(AComparatorS40S0000000_21 aComparatorS40S0000000_21, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(((SharePanelActionOrderRule) obj).order, ((SharePanelActionOrderRule) obj2).order);
    }

    public static final int compare$13(AComparatorS40S0000000_21 aComparatorS40S0000000_21, Object obj, Object obj2) {
        ArrayList<String> arrayList = C1360700lVs.LIZ;
        return C20085613iQ.LIZIZ(Integer.valueOf(arrayList.indexOf(((RepostNewContentMeta) obj).itemId)), Integer.valueOf(arrayList.indexOf(((RepostNewContentMeta) obj2).itemId)));
    }

    public static final int compare$2(AComparatorS40S0000000_21 aComparatorS40S0000000_21, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((OptionCount) obj).index), Integer.valueOf(((OptionCount) obj2).index));
    }

    public static final int compare$3(AComparatorS40S0000000_21 aComparatorS40S0000000_21, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Float.valueOf(((C1397060mSW) obj).LJJIII()), Float.valueOf(((C1397060mSW) obj2).LJJIII()));
    }

    public static final int compare$4(AComparatorS40S0000000_21 aComparatorS40S0000000_21, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Double.valueOf(((C1369260ljg) obj2).LIZLLL), Double.valueOf(((C1369260ljg) obj).LIZLLL));
    }

    public static final int compare$5(AComparatorS40S0000000_21 aComparatorS40S0000000_21, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C1369250ljf) obj).LIZ.LIZIZ), Integer.valueOf(((C1369250ljf) obj2).LIZ.LIZIZ));
    }

    public static final int compare$6(AComparatorS40S0000000_21 aComparatorS40S0000000_21, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((IContactListProtocol) obj2).priority()), Integer.valueOf(((IContactListProtocol) obj).priority()));
    }

    public static final int compare$7(AComparatorS40S0000000_21 aComparatorS40S0000000_21, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((InterfaceC1396870mSD) obj).LIZIZ()), Integer.valueOf(((InterfaceC1396870mSD) obj2).LIZIZ()));
    }

    public static final int compare$8(AComparatorS40S0000000_21 aComparatorS40S0000000_21, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((InterfaceC1346750l9N) obj).getPriority()), Integer.valueOf(((InterfaceC1346750l9N) obj2).getPriority()));
    }

    public static final int compare$9(AComparatorS40S0000000_21 aComparatorS40S0000000_21, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((InterfaceC1370520lli) obj).getLayoutPriority().ordinal()), Integer.valueOf(((InterfaceC1370520lli) obj2).getLayoutPriority().ordinal()));
    }
}
