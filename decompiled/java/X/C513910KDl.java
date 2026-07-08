package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;
import webcast.api.pgc_sub.PGCOfferInfo;
import webcast.api.pgc_sub.PGCTemplateInfo;

/* JADX INFO: renamed from: X.0KDl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C513910KDl {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZIZ(Integer num) {
        if (num != null) {
            if (num.intValue() == 1) {
                return "basic";
            }
            if (num.intValue() == 2) {
                return "premium";
            }
            if (num.intValue() == 3) {
                return "exclusive";
            }
            return "";
        }
        return "";
    }

    public static void LIZ(Map map, PGCTemplateInfo pGCTemplateInfo) {
        String strValueOf;
        String strValueOf2;
        String strValueOf3;
        String strValueOf4;
        float f;
        if (pGCTemplateInfo == null) {
            return;
        }
        PGCOfferInfo pGCOfferInfo = pGCTemplateInfo.offerInfo;
        HashMap map2 = new HashMap();
        boolean z = false;
        if (pGCOfferInfo != null && pGCOfferInfo.offerType == 1) {
            z = true;
        }
        if (z) {
            f = 1 - pGCOfferInfo.discountRate;
            strValueOf = String.valueOf(pGCOfferInfo.discountUsdPriceAmountMicros / 1000000.0f);
            strValueOf2 = String.valueOf(pGCOfferInfo.discountAmount / 100.0f);
            strValueOf3 = String.valueOf((pGCOfferInfo.discountUsdPriceAmountMicros / 1000000.0f) / f);
            strValueOf4 = String.valueOf((pGCOfferInfo.discountAmount / 100.0f) / f);
        } else {
            strValueOf = String.valueOf(pGCTemplateInfo.usdPriceAmountMicros / 1000000.0f);
            strValueOf2 = pGCTemplateInfo.amount;
            strValueOf3 = String.valueOf(pGCTemplateInfo.usdPriceAmountMicros / 1000000.0f);
            strValueOf4 = pGCTemplateInfo.amount;
            f = 1.0f;
        }
        map2.put("price_tier", strValueOf);
        map2.put("local_price", strValueOf2);
        map2.put("local_currency", pGCTemplateInfo.currency);
        map2.put("price_tier_origin", strValueOf3);
        map2.put("local_price_orgin", strValueOf4);
        map2.put("discount", new BigDecimal(f).setScale(2, RoundingMode.HALF_UP).toString());
        float f2 = 100;
        map2.put("auto_discount", String.valueOf((int) (f2 - (f * f2))));
        map2.put("tag_name", pGCTemplateInfo.tplName);
        map.putAll(map2);
    }

    public static C511970K5z LIZJ(C511970K5z c511970K5z, PGCTemplateInfo pGCTemplateInfo) {
        try {
            float f = pGCTemplateInfo.usdPriceAmountMicros / 1000000.0f;
            LIZLLL(c511970K5z, String.valueOf(f), pGCTemplateInfo.amount, pGCTemplateInfo.currency, pGCTemplateInfo.tplName, 1.0f, String.valueOf(f), pGCTemplateInfo.amount);
            return c511970K5z;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return c511970K5z;
        }
    }

    public static C511970K5z LJ(C511970K5z c511970K5z, PGCTemplateInfo pGCTemplateInfo) {
        if (pGCTemplateInfo == null) {
            LIZLLL(c511970K5z, "", "", "", "", 1.0f, "", "");
            return c511970K5z;
        }
        PGCOfferInfo pGCOfferInfo = pGCTemplateInfo.offerInfo;
        if (pGCOfferInfo == null) {
            LIZJ(c511970K5z, pGCTemplateInfo);
            return c511970K5z;
        }
        if (pGCOfferInfo.offerType == 1) {
            String str = pGCTemplateInfo.currency;
            String str2 = pGCTemplateInfo.tplName;
            try {
                float f = 1 - pGCOfferInfo.discountRate;
                LIZLLL(c511970K5z, String.valueOf(pGCOfferInfo.discountUsdPriceAmountMicros / 1000000.0f), String.valueOf(pGCOfferInfo.discountAmount / 100.0f), str, str2, f, String.valueOf((pGCOfferInfo.discountUsdPriceAmountMicros / 1000000.0f) / f), String.valueOf((pGCOfferInfo.discountAmount / 100.0f) / f));
                return c511970K5z;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return c511970K5z;
            }
        }
        LIZJ(c511970K5z, pGCTemplateInfo);
        return c511970K5z;
    }

    public static void LJFF(C511970K5z c511970K5z, C0KDH c0kdh) {
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3 = null;
        if (c0kdh != null) {
            numValueOf = Integer.valueOf(c0kdh.LIZLLL);
        } else {
            numValueOf = null;
        }
        c511970K5z.LIZIZ(LIZIZ(numValueOf), "package_type");
        if (c0kdh != null) {
            numValueOf2 = Integer.valueOf(c0kdh.LIZIZ);
        } else {
            numValueOf2 = null;
        }
        c511970K5z.LIZIZ(numValueOf2, "package_emotes");
        if (c0kdh != null) {
            numValueOf3 = Integer.valueOf(c0kdh.LIZJ);
        }
        c511970K5z.LIZIZ(numValueOf3, "package_perks");
    }

    public static void LIZLLL(C511970K5z c511970K5z, String str, String str2, String str3, String str4, float f, String str5, String str6) {
        c511970K5z.LIZIZ(str, "price_tier");
        c511970K5z.LIZIZ(str2, "local_price");
        c511970K5z.LIZIZ(str3, "local_currency");
        c511970K5z.LIZIZ(str4, "tag_name");
        c511970K5z.LIZIZ(new BigDecimal(f).setScale(2, RoundingMode.HALF_UP).toString(), "discount");
        float f2 = 100;
        c511970K5z.LIZIZ(Integer.valueOf((int) (f2 - (f * f2))), "auto_discount");
        c511970K5z.LIZIZ(str5, "price_tier_origin");
        c511970K5z.LIZIZ(str6, "local_price_orgin");
    }
}
