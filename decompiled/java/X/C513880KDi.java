package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import webcast.api.pgc_sub.PGCOfferInfo;
import webcast.api.pgc_sub.PGCTemplateInfo;
import webcast.api.sub.OfferInfo;

/* JADX INFO: renamed from: X.0KDi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C513880KDi {
    public static String LIZ = "1";
    public static String LIZIZ = CardStruct.IStatusCode.DEFAULT;

    public static void LIZ(PGCOfferInfo pGCOfferInfo) {
        if (pGCOfferInfo == null) {
            LIZ = "1";
            return;
        }
        long j = pGCOfferInfo.offerType;
        if (j == 2) {
            LIZ = "7";
        } else if (j == 0) {
            LIZ = "1";
        } else {
            LIZ = BigDecimal.ONE.subtract(new BigDecimal(pGCOfferInfo.discountRate)).setScale(2, RoundingMode.HALF_UP).toString();
        }
    }

    public static void LIZIZ(OfferInfo offerInfo) {
        if (offerInfo == null) {
            LIZ = "1";
            return;
        }
        long j = offerInfo.offerType;
        if (j == 2) {
            LIZ = "7";
        } else if (j == 0) {
            LIZ = "1";
        } else {
            LIZ = BigDecimal.ONE.subtract(new BigDecimal(offerInfo.discountRate)).setScale(2, RoundingMode.HALF_UP).toString();
        }
    }

    public static void LIZJ(List list) {
        long j;
        if (list == null) {
            LIZIZ = CardStruct.IStatusCode.DEFAULT;
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            PGCTemplateInfo pGCTemplateInfo = (PGCTemplateInfo) it2.next();
            C0KEC c0kec = EnumC514030KDx.Companion;
            PGCOfferInfo pGCOfferInfo = pGCTemplateInfo.offerInfo;
            long j2 = 0;
            if (pGCOfferInfo != null) {
                j = pGCOfferInfo.campaignType;
            } else {
                j = 0;
            }
            c0kec.getClass();
            EnumC514030KDx enumC514030KDxLIZ = C0KEC.LIZ(j);
            C0KED c0ked = C0KE2.Companion;
            PGCOfferInfo pGCOfferInfo2 = pGCTemplateInfo.offerInfo;
            if (pGCOfferInfo2 != null) {
                j2 = pGCOfferInfo2.offerType;
            }
            c0ked.getClass();
            C0KE2 c0ke2LIZ = C0KED.LIZ(j2);
            if (enumC514030KDxLIZ == EnumC514030KDx.CUSTOM_PROMOTION && c0ke2LIZ == C0KE2.DISCOUNT) {
                linkedHashSet.add(pGCTemplateInfo.packageId);
            }
        }
        LIZIZ = String.valueOf(linkedHashSet.size());
    }
}
