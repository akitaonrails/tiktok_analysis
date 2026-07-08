package Y;

import X.C0WZX;
import X.C1228060i3w;
import X.C1240220iNY;
import X.C1240530iO3;
import X.C1240900iOe;
import X.C1243240iSQ;
import X.C1249950idF;
import X.C1355350lNF;
import X.C20085613iQ;
import X.C2204961BRm;
import X.EnumC1240860iOa;
import X.InterfaceC1240540iO4;
import com.ss.android.ugc.aweme.affinity.model.SocialAffinityItem;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.MinisSubscriptionInfo;
import com.ss.android.ugc.aweme.minis.payment.subscription.page.MinisSubscriptionListActivity;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.profile.platform.business.header.business.cta.assemble.ProfileHeaderCTABaseComponent;
import com.tts.oecverify.BdTuring;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public class AComparatorS516S0100000_19 implements Comparator {
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
            case BdTuring.TYPE_EMAIL /* 11 */:
                return compare$11(this, t, t2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return compare$12(this, t, t2);
            default:
                return 0;
        }
    }

    public AComparatorS516S0100000_19(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final int compare$0(AComparatorS516S0100000_19 aComparatorS516S0100000_19, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((String) ((Function1) aComparatorS516S0100000_19.l0).invoke(obj), (String) ((Function1) aComparatorS516S0100000_19.l0).invoke(obj2));
    }

    public static final int compare$1(AComparatorS516S0100000_19 aComparatorS516S0100000_19, Object obj, Object obj2) {
        String uid;
        Double dValueOf;
        String uid2;
        Map map = (Map) aComparatorS516S0100000_19.l0;
        User user = ((UpvoteStruct) obj2).user;
        Double dValueOf2 = null;
        if (user != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        SocialAffinityItem socialAffinityItem = (SocialAffinityItem) map.get(uid);
        if (socialAffinityItem != null) {
            dValueOf = Double.valueOf(socialAffinityItem.score);
        } else {
            dValueOf = null;
        }
        Map map2 = (Map) aComparatorS516S0100000_19.l0;
        User user2 = ((UpvoteStruct) obj).user;
        if (user2 != null) {
            uid2 = user2.getUid();
        } else {
            uid2 = null;
        }
        SocialAffinityItem socialAffinityItem2 = (SocialAffinityItem) map2.get(uid2);
        if (socialAffinityItem2 != null) {
            dValueOf2 = Double.valueOf(socialAffinityItem2.score);
        }
        return C20085613iQ.LIZIZ(dValueOf, dValueOf2);
    }

    public static final int compare$10(AComparatorS516S0100000_19 aComparatorS516S0100000_19, Object obj, Object obj2) {
        int iCompare = ((Comparator) aComparatorS516S0100000_19.l0).compare(obj, obj2);
        if (iCompare == 0) {
            return C20085613iQ.LIZIZ(Double.valueOf(((C1240900iOe) obj2).LJ), Double.valueOf(((C1240900iOe) obj).LJ));
        }
        return iCompare;
    }

    public static final int compare$11(AComparatorS516S0100000_19 aComparatorS516S0100000_19, Object obj, Object obj2) {
        MinisSubscriptionListActivity minisSubscriptionListActivity = (MinisSubscriptionListActivity) aComparatorS516S0100000_19.l0;
        Long l = ((MinisSubscriptionInfo) obj).benefitStatus;
        minisSubscriptionListActivity.getClass();
        int iLLLLLZL = MinisSubscriptionListActivity.LLLLLZL(l);
        MinisSubscriptionListActivity minisSubscriptionListActivity2 = (MinisSubscriptionListActivity) aComparatorS516S0100000_19.l0;
        Long l2 = ((MinisSubscriptionInfo) obj2).benefitStatus;
        minisSubscriptionListActivity2.getClass();
        return Intrinsics.LJI(iLLLLLZL, MinisSubscriptionListActivity.LLLLLZL(l2));
    }

    public static final int compare$12(AComparatorS516S0100000_19 aComparatorS516S0100000_19, Object obj, Object obj2) {
        C1243240iSQ c1243240iSQ = C1243240iSQ.LIZ;
        IMUser iMUser = (IMUser) aComparatorS516S0100000_19.l0;
        String strLIZJ = C1243240iSQ.LIZJ(c1243240iSQ, iMUser, iMUser.getDisplayName());
        IMUser iMUser2 = (IMUser) aComparatorS516S0100000_19.l0;
        return C20085613iQ.LIZIZ(strLIZJ, C1243240iSQ.LIZJ(c1243240iSQ, iMUser2, iMUser2.getDisplayName()));
    }

    public static final int compare$2(AComparatorS516S0100000_19 aComparatorS516S0100000_19, Object obj, Object obj2) {
        String uid;
        Double dValueOf;
        String uid2;
        Map map = (Map) aComparatorS516S0100000_19.l0;
        User user = ((UpvoteStruct) obj2).user;
        Double dValueOf2 = null;
        if (user != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        SocialAffinityItem socialAffinityItem = (SocialAffinityItem) map.get(uid);
        if (socialAffinityItem != null) {
            dValueOf = Double.valueOf(socialAffinityItem.score);
        } else {
            dValueOf = null;
        }
        Map map2 = (Map) aComparatorS516S0100000_19.l0;
        User user2 = ((UpvoteStruct) obj).user;
        if (user2 != null) {
            uid2 = user2.getUid();
        } else {
            uid2 = null;
        }
        SocialAffinityItem socialAffinityItem2 = (SocialAffinityItem) map2.get(uid2);
        if (socialAffinityItem2 != null) {
            dValueOf2 = Double.valueOf(socialAffinityItem2.score);
        }
        return C20085613iQ.LIZIZ(dValueOf, dValueOf2);
    }

    public static final int compare$3(AComparatorS516S0100000_19 aComparatorS516S0100000_19, Object obj, Object obj2) {
        String uid;
        Double dValueOf;
        String uid2;
        Map map = (Map) aComparatorS516S0100000_19.l0;
        User user = ((UpvoteStruct) obj2).user;
        Double dValueOf2 = null;
        if (user != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        SocialAffinityItem socialAffinityItem = (SocialAffinityItem) map.get(uid);
        if (socialAffinityItem != null) {
            dValueOf = Double.valueOf(socialAffinityItem.score);
        } else {
            dValueOf = null;
        }
        Map map2 = (Map) aComparatorS516S0100000_19.l0;
        User user2 = ((UpvoteStruct) obj).user;
        if (user2 != null) {
            uid2 = user2.getUid();
        } else {
            uid2 = null;
        }
        SocialAffinityItem socialAffinityItem2 = (SocialAffinityItem) map2.get(uid2);
        if (socialAffinityItem2 != null) {
            dValueOf2 = Double.valueOf(socialAffinityItem2.score);
        }
        return C20085613iQ.LIZIZ(dValueOf, dValueOf2);
    }

    public static final int compare$4(AComparatorS516S0100000_19 aComparatorS516S0100000_19, Object obj, Object obj2) {
        return C2204961BRm.U((C1355350lNF) aComparatorS516S0100000_19.l0, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt8fUMQbCMogfSIFzY9KpNwK1I4aU4XA==", null)).getSpanStart(obj) - C2204961BRm.U((C1355350lNF) aComparatorS516S0100000_19.l0, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt8fUMQbCMogfSIFzY9KpNwK1I4aU4XA==", null)).getSpanStart(obj2);
    }

    public static final int compare$5(AComparatorS516S0100000_19 aComparatorS516S0100000_19, Object obj, Object obj2) {
        Integer numValueOf;
        C1249950idF c1249950idF = (C1249950idF) ((LinkedHashMap) ((ProfileHeaderCTABaseComponent) aComparatorS516S0100000_19.l0).LLJL).get(obj);
        Integer numValueOf2 = null;
        if (c1249950idF != null) {
            numValueOf = Integer.valueOf(c1249950idF.LIZ);
        } else {
            numValueOf = null;
        }
        C1249950idF c1249950idF2 = (C1249950idF) ((LinkedHashMap) ((ProfileHeaderCTABaseComponent) aComparatorS516S0100000_19.l0).LLJL).get(obj2);
        if (c1249950idF2 != null) {
            numValueOf2 = Integer.valueOf(c1249950idF2.LIZ);
        }
        return C20085613iQ.LIZIZ(numValueOf, numValueOf2);
    }

    public static final int compare$6(AComparatorS516S0100000_19 aComparatorS516S0100000_19, Object obj, Object obj2) {
        Integer numValueOf;
        C1249950idF c1249950idF = (C1249950idF) ((LinkedHashMap) ((ProfileHeaderCTABaseComponent) aComparatorS516S0100000_19.l0).LLJL).get(obj);
        Integer numValueOf2 = null;
        if (c1249950idF != null) {
            numValueOf = Integer.valueOf(c1249950idF.LIZ);
        } else {
            numValueOf = null;
        }
        C1249950idF c1249950idF2 = (C1249950idF) ((LinkedHashMap) ((ProfileHeaderCTABaseComponent) aComparatorS516S0100000_19.l0).LLJL).get(obj2);
        if (c1249950idF2 != null) {
            numValueOf2 = Integer.valueOf(c1249950idF2.LIZ);
        }
        return C20085613iQ.LIZIZ(numValueOf, numValueOf2);
    }

    public static final int compare$7(AComparatorS516S0100000_19 aComparatorS516S0100000_19, Object obj, Object obj2) {
        double dDoubleValue;
        C1240220iNY c1240220iNY;
        IMUser iMUser;
        String uid;
        SocialAffinityItem socialAffinityItem;
        Double dValueOf;
        SocialAffinityItem socialAffinityItem2;
        Double dValueOf2;
        C1240220iNY c1240220iNY2;
        IMUser iMUser2;
        InterfaceC1240540iO4 interfaceC1240540iO4 = ((C1240530iO3) obj2).LL;
        String uid2 = null;
        if ((interfaceC1240540iO4 instanceof C1240220iNY) && (c1240220iNY2 = (C1240220iNY) interfaceC1240540iO4) != null && (iMUser2 = c1240220iNY2.LIZ) != null) {
            uid2 = iMUser2.getUid();
        }
        double dDoubleValue2 = 0.0d;
        if (uid2 != null && (socialAffinityItem2 = (SocialAffinityItem) ((Map) aComparatorS516S0100000_19.l0).get(uid2)) != null && (dValueOf2 = Double.valueOf(socialAffinityItem2.score)) != null) {
            dDoubleValue = dValueOf2.doubleValue();
        } else {
            dDoubleValue = 0.0d;
        }
        Double dValueOf3 = Double.valueOf(dDoubleValue);
        InterfaceC1240540iO4 interfaceC1240540iO42 = ((C1240530iO3) obj).LL;
        if ((interfaceC1240540iO42 instanceof C1240220iNY) && (c1240220iNY = (C1240220iNY) interfaceC1240540iO42) != null && (iMUser = c1240220iNY.LIZ) != null && (uid = iMUser.getUid()) != null && (socialAffinityItem = (SocialAffinityItem) ((Map) aComparatorS516S0100000_19.l0).get(uid)) != null && (dValueOf = Double.valueOf(socialAffinityItem.score)) != null) {
            dDoubleValue2 = dValueOf.doubleValue();
        }
        return C20085613iQ.LIZIZ(dValueOf3, Double.valueOf(dDoubleValue2));
    }

    public static final int compare$8(AComparatorS516S0100000_19 aComparatorS516S0100000_19, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((List) ((C1228060i3w) aComparatorS516S0100000_19.l0).LLIZLLLIL.getValue()).indexOf(((BaseContact) obj).getUid())), Integer.valueOf(((List) ((C1228060i3w) aComparatorS516S0100000_19.l0).LLIZLLLIL.getValue()).indexOf(((BaseContact) obj2).getUid())));
    }

    public static final int compare$9(AComparatorS516S0100000_19 aComparatorS516S0100000_19, Object obj, Object obj2) {
        Comparable comparable;
        int i = ((C1240900iOe) obj).LIZJ;
        EnumC1240860iOa enumC1240860iOa = EnumC1240860iOa.PREFIX;
        Comparable comparable2 = 100;
        if (i == enumC1240860iOa.ordinal()) {
            comparable = (Comparable) ((Map) aComparatorS516S0100000_19.l0).get(enumC1240860iOa);
        } else {
            EnumC1240860iOa enumC1240860iOa2 = EnumC1240860iOa.POST_DELIMITER;
            if (i == enumC1240860iOa2.ordinal()) {
                comparable = (Comparable) ((Map) aComparatorS516S0100000_19.l0).get(enumC1240860iOa2);
            } else {
                EnumC1240860iOa enumC1240860iOa3 = EnumC1240860iOa.SUBSTRING;
                if (i == enumC1240860iOa3.ordinal()) {
                    comparable = (Comparable) ((Map) aComparatorS516S0100000_19.l0).get(enumC1240860iOa3);
                } else {
                    comparable = comparable2;
                }
            }
        }
        int i2 = ((C1240900iOe) obj2).LIZJ;
        if (i2 == enumC1240860iOa.ordinal()) {
            comparable2 = (Comparable) ((Map) aComparatorS516S0100000_19.l0).get(enumC1240860iOa);
        } else {
            EnumC1240860iOa enumC1240860iOa4 = EnumC1240860iOa.POST_DELIMITER;
            if (i2 == enumC1240860iOa4.ordinal()) {
                comparable2 = (Comparable) ((Map) aComparatorS516S0100000_19.l0).get(enumC1240860iOa4);
            } else {
                EnumC1240860iOa enumC1240860iOa5 = EnumC1240860iOa.SUBSTRING;
                if (i2 == enumC1240860iOa5.ordinal()) {
                    comparable2 = (Comparable) ((Map) aComparatorS516S0100000_19.l0).get(enumC1240860iOa5);
                }
            }
        }
        return C20085613iQ.LIZIZ(comparable, comparable2);
    }
}
