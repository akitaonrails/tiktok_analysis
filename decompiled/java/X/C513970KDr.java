package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import webcast.api.sub.OfferInfo;
import webcast.api.sub.TemplateInfo;

/* JADX INFO: renamed from: X.0KDr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C513970KDr {
    public static String LIZ = "1";
    public static String LIZIZ = CardStruct.IStatusCode.DEFAULT;

    public static void LIZ(OfferInfo offerInfo) {
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

    public static void LIZIZ(List list) {
        long j;
        if (list == null) {
            LIZIZ = CardStruct.IStatusCode.DEFAULT;
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            TemplateInfo templateInfo = (TemplateInfo) it2.next();
            C0KEM c0kem = EnumC514040KDy.Companion;
            OfferInfo offerInfo = templateInfo.offerInfo;
            long j2 = 0;
            if (offerInfo != null) {
                j = offerInfo.campaignType;
            } else {
                j = 0;
            }
            c0kem.getClass();
            EnumC514040KDy enumC514040KDyLIZ = C0KEM.LIZ(j);
            C0KEN c0ken = C0KE1.Companion;
            OfferInfo offerInfo2 = templateInfo.offerInfo;
            if (offerInfo2 != null) {
                j2 = offerInfo2.offerType;
            }
            c0ken.getClass();
            C0KE1 c0ke1LIZ = C0KEN.LIZ(j2);
            if (enumC514040KDyLIZ == EnumC514040KDy.CUSTOM_PROMOTION && c0ke1LIZ == C0KE1.DISCOUNT) {
                linkedHashSet.add(templateInfo.packageId);
            }
        }
        LIZIZ = String.valueOf(linkedHashSet.size());
    }
}
