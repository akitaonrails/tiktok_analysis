package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;
import webcast.api.sub.OfferInfo;
import webcast.api.sub.TemplateInfo;

/* JADX INFO: renamed from: X.0KDm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C513920KDm {
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

    public static void LIZ(Map map, TemplateInfo templateInfo) {
        String strValueOf;
        String strValueOf2;
        String strValueOf3;
        String strValueOf4;
        float f;
        if (templateInfo == null) {
            return;
        }
        OfferInfo offerInfo = templateInfo.offerInfo;
        HashMap map2 = new HashMap();
        boolean z = false;
        if (offerInfo != null && offerInfo.offerType == 1) {
            z = true;
        }
        if (z) {
            f = 1 - offerInfo.discountRate;
            strValueOf = String.valueOf(offerInfo.discountUsdPriceAmountMicros / 1000000.0f);
            strValueOf2 = String.valueOf(offerInfo.discountAmount / 100.0f);
            strValueOf3 = String.valueOf((offerInfo.discountUsdPriceAmountMicros / 1000000.0f) / f);
            strValueOf4 = String.valueOf((offerInfo.discountAmount / 100.0f) / f);
        } else {
            strValueOf = String.valueOf(templateInfo.usdPriceAmountMicros / 1000000.0f);
            strValueOf2 = templateInfo.amount;
            strValueOf3 = String.valueOf(templateInfo.usdPriceAmountMicros / 1000000.0f);
            strValueOf4 = templateInfo.amount;
            f = 1.0f;
        }
        map2.put("price_tier", strValueOf);
        map2.put("local_price", strValueOf2);
        map2.put("local_currency", templateInfo.currency);
        map2.put("price_tier_origin", strValueOf3);
        map2.put("local_price_orgin", strValueOf4);
        map2.put("discount", new BigDecimal(f).setScale(2, RoundingMode.HALF_UP).toString());
        float f2 = 100;
        map2.put("auto_discount", String.valueOf((int) (f2 - (f * f2))));
        map2.put("tag_name", templateInfo.tplName);
        map.putAll(map2);
    }

    public static C474500IjA LIZJ(C474500IjA c474500IjA, TemplateInfo templateInfo) {
        try {
            float f = templateInfo.usdPriceAmountMicros / 1000000.0f;
            LIZLLL(c474500IjA, String.valueOf(f), templateInfo.amount, templateInfo.currency, templateInfo.tplName, 1.0f, String.valueOf(f), templateInfo.amount);
            return c474500IjA;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return c474500IjA;
        }
    }

    public static C474500IjA LJ(C474500IjA c474500IjA, TemplateInfo templateInfo) {
        if (templateInfo == null) {
            LIZLLL(c474500IjA, "", "", "", "", 1.0f, "", "");
            return c474500IjA;
        }
        OfferInfo offerInfo = templateInfo.offerInfo;
        if (offerInfo == null) {
            LIZJ(c474500IjA, templateInfo);
            return c474500IjA;
        }
        if (offerInfo.offerType == 1) {
            String str = templateInfo.currency;
            String str2 = templateInfo.tplName;
            try {
                float f = 1 - offerInfo.discountRate;
                LIZLLL(c474500IjA, String.valueOf(offerInfo.discountUsdPriceAmountMicros / 1000000.0f), String.valueOf(offerInfo.discountAmount / 100.0f), str, str2, f, String.valueOf((offerInfo.discountUsdPriceAmountMicros / 1000000.0f) / f), String.valueOf((offerInfo.discountAmount / 100.0f) / f));
                return c474500IjA;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return c474500IjA;
            }
        }
        LIZJ(c474500IjA, templateInfo);
        return c474500IjA;
    }

    public static void LJFF(C474500IjA c474500IjA, C0KFB c0kfb) {
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3 = null;
        if (c0kfb != null) {
            numValueOf = Integer.valueOf(c0kfb.LIZLLL);
        } else {
            numValueOf = null;
        }
        c474500IjA.LJJII(LIZIZ(numValueOf), "package_type");
        if (c0kfb != null) {
            numValueOf2 = Integer.valueOf(c0kfb.LIZIZ);
        } else {
            numValueOf2 = null;
        }
        c474500IjA.LJJII(numValueOf2, "package_emotes");
        if (c0kfb != null) {
            numValueOf3 = Integer.valueOf(c0kfb.LIZJ);
        }
        c474500IjA.LJJII(numValueOf3, "package_perks");
    }

    public static void LIZLLL(C474500IjA c474500IjA, String str, String str2, String str3, String str4, float f, String str5, String str6) {
        c474500IjA.LJJII(str, "price_tier");
        c474500IjA.LJJII(str2, "local_price");
        c474500IjA.LJJII(str3, "local_currency");
        c474500IjA.LJJII(str4, "tag_name");
        c474500IjA.LJJII(new BigDecimal(f).setScale(2, RoundingMode.HALF_UP).toString(), "discount");
        float f2 = 100;
        c474500IjA.LJJII(Integer.valueOf((int) (f2 - (f * f2))), "auto_discount");
        c474500IjA.LJJII(str5, "price_tier_origin");
        c474500IjA.LJJII(str6, "local_price_orgin");
    }
}
