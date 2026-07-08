package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0s3T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1612170s3T {
    public static final Set LIZIZ(int i, List list) {
        String aid;
        Long lLJIILIIL;
        PaidContentInfo paidContentInfo;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C1611880s30 c1611880s30 = (C1611880s30) obj;
            Aweme aweme = c1611880s30.LL.aweme;
            if (aweme != null && (paidContentInfo = aweme.mPaidContentInfo) != null && !paidContentInfo.isLimitedFreeShortDrama() && !paidContentInfo.isVideoPurchased() && (!paidContentInfo.getShouldShowPreview() || paidContentInfo.isPartialPreview())) {
                if (!paidContentInfo.isPaidCollectionIntro() && !c1611880s30.LL.isReported()) {
                    arrayList.add(obj);
                }
            }
        }
        List listLL = C13LP.LL(arrayList, i);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = listLL.iterator();
        while (it2.hasNext()) {
            Aweme aweme2 = ((C1611880s30) it2.next()).LL.aweme;
            if (aweme2 != null && (aid = aweme2.getAid()) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(aid)) != null) {
                arrayList2.add(lLJIILIIL);
            }
        }
        return C13LP.LLIIJI(arrayList2);
    }

    public static List LIZ(List list, Set set, boolean z, int i) {
        boolean z2;
        EnumC2004707tF enumC2004707tF;
        PaidContentInfo paidContentInfo;
        PaidContentInfo paidContentInfo2;
        PaidContentInfo paidContentInfo3;
        PaidContentInfo paidContentInfo4;
        PaidContentInfo paidContentInfo5;
        PaidContentInfo paidContentInfo6;
        if ((i & 4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 8) != 0) {
            enumC2004707tF = EnumC2004707tF.PURCHASE;
        } else {
            enumC2004707tF = null;
        }
        if (set.isEmpty() && !z) {
            return list;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C1611880s30 c1611880s30LIZ = (C1611880s30) it2.next();
            if (!set.contains(Long.valueOf(c1611880s30LIZ.LL.paidVideoId)) && !z) {
                Aweme aweme = c1611880s30LIZ.LL.aweme;
                if (aweme != null && (paidContentInfo6 = aweme.mPaidContentInfo) != null) {
                    paidContentInfo6.setLastPurchasedVideoInOrder(false);
                }
                Aweme aweme2 = c1611880s30LIZ.LL.fullAweme;
                if (aweme2 != null && (paidContentInfo5 = aweme2.mPaidContentInfo) != null) {
                    paidContentInfo5.setLastPurchasedVideoInOrder(false);
                }
            } else {
                if (enumC2004707tF == EnumC2004707tF.PURCHASE) {
                    Long l = (Long) C13LP.LJJLIIIJJIZ(set);
                    long j = c1611880s30LIZ.LL.paidVideoId;
                    if (l != null && l.longValue() == j) {
                        Aweme aweme3 = c1611880s30LIZ.LL.aweme;
                        if (aweme3 != null && (paidContentInfo4 = aweme3.mPaidContentInfo) != null) {
                            paidContentInfo4.setLastPurchasedVideoInOrder(true);
                        }
                        Aweme aweme4 = c1611880s30LIZ.LL.fullAweme;
                        if (aweme4 != null && (paidContentInfo3 = aweme4.mPaidContentInfo) != null) {
                            paidContentInfo3.setLastPurchasedVideoInOrder(true);
                        }
                    }
                }
                Aweme aweme5 = c1611880s30LIZ.LL.aweme;
                if (aweme5 != null && (paidContentInfo2 = aweme5.mPaidContentInfo) != null) {
                    paidContentInfo2.setHasPurchasedVideo(z2);
                    if (enumC2004707tF == EnumC2004707tF.SUBSCRIPTION) {
                        paidContentInfo2.setSubscriptionActive(Boolean.valueOf(z2));
                        paidContentInfo2.setSubscriptionExpiredTime(null);
                    }
                }
                Aweme aweme6 = c1611880s30LIZ.LL.fullAweme;
                if (aweme6 != null && (paidContentInfo = aweme6.mPaidContentInfo) != null) {
                    paidContentInfo.setHasPurchasedVideo(z2);
                    if (enumC2004707tF == EnumC2004707tF.SUBSCRIPTION) {
                        paidContentInfo.setSubscriptionActive(Boolean.valueOf(z2));
                        paidContentInfo.setSubscriptionExpiredTime(null);
                    }
                }
                c1611880s30LIZ = C1611880s30.LIZ(c1611880s30LIZ, null, z2, z, 231);
            }
            arrayList.add(c1611880s30LIZ);
        }
        return arrayList;
    }
}
