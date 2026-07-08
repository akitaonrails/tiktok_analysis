package X;

import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillItem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PopupButton;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.List;

/* JADX INFO: renamed from: X.02rq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C722002rq {
    public static final C714302qb LIZLLL(BillItem billItem) {
        String priceStr;
        Integer priceTextColor;
        String link;
        C03IT imageUrlModel;
        boolean zBooleanValue;
        String priceStr2;
        Integer priceTextFont;
        Integer priceTextColor2;
        Image icon;
        String priceVal;
        String str = billItem.itemName;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        Price price = billItem.itemPrice;
        if (price == null || (priceStr = price.getPriceStr()) == null) {
            priceStr = "";
        }
        Integer num = billItem.itemTextFont;
        Price price2 = billItem.itemPrice;
        if (price2 != null) {
            priceTextColor = price2.getPriceTextColor();
        } else {
            priceTextColor = null;
        }
        Price price3 = billItem.itemPrice;
        if (price3 != null && (priceVal = price3.getPriceVal()) != null) {
            str2 = priceVal;
        }
        Icon icon2 = billItem.logo;
        if (icon2 != null) {
            link = icon2.getLink();
        } else {
            link = null;
        }
        Icon icon3 = billItem.logo;
        if (icon3 != null && (icon = icon3.getIcon()) != null) {
            imageUrlModel = icon.toImageUrlModel();
        } else {
            imageUrlModel = null;
        }
        Integer num2 = billItem.itemTextColor;
        Integer num3 = billItem.itemType;
        String str3 = billItem.itemText;
        List<BillItem> list = billItem.subItems;
        String str4 = billItem.itemExplain;
        ECRichText eCRichText = billItem.popupExplain;
        PopupButton popupButton = billItem.popupButton;
        ECRichText eCRichText2 = billItem.richTextItemName;
        Boolean bool = billItem.hasDivider;
        boolean zBooleanValue2 = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        Boolean bool2 = billItem.hasPopup;
        if (bool2 != null) {
            zBooleanValue2 = bool2.booleanValue();
        }
        List<Icon> list2 = billItem.popupBanner;
        Price price4 = billItem.originalPrice;
        if (price4 != null) {
            priceStr2 = price4.getPriceStr();
        } else {
            priceStr2 = null;
        }
        Price price5 = billItem.originalPrice;
        if (price5 != null) {
            priceTextFont = price5.getPriceTextFont();
        } else {
            priceTextFont = null;
        }
        Price price6 = billItem.originalPrice;
        if (price6 != null) {
            priceTextColor2 = price6.getPriceTextColor();
        } else {
            priceTextColor2 = null;
        }
        return new C714302qb(str, priceStr, num, priceTextColor, str2, link, imageUrlModel, num2, num3, str3, list, str4, eCRichText, popupButton, eCRichText2, zBooleanValue, zBooleanValue2, list2, priceStr2, priceTextFont, priceTextColor2, billItem.popupStyle, billItem.daInfo, billItem.itemNameEn, (Integer) null, 50331648);
    }

    public static final Summary LIZ(BillInfoData billInfoData, PaymentInfo paymentInfo) {
        C03SE c03se = C03PI.LJIJI;
        PaymentMethodsData paymentMethodsData = billInfoData.paymentMethods;
        c03se.getClass();
        C443120HZe c443120HZeLJJJIL = C03SE.LJJJIL(paymentInfo, paymentMethodsData, true, true);
        return LIZIZ(billInfoData, (String) c443120HZeLJJJIL.getSecond(), ((Boolean) c443120HZeLJJJIL.getFirst()).booleanValue(), (List) c443120HZeLJJJIL.getThird(), null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0214  */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C722302rt LJ(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary r65, int r66, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PlatformPromotion r67, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoSetting r68) {
        /*
            Method dump skipped, instruction units count: 621
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C722002rq.LJ(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary, int, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PlatformPromotion, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoSetting):X.02rt");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0071 A[PHI: r7
      0x0071: PHI (r7v11 com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary) = 
      (r7v1 com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary)
      (r7v2 com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary)
      (r7v5 com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary)
      (r7v9 com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary)
      (r7v9 com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary)
      (r7v9 com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary)
      (r7v9 com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary)
      (r7v9 com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary)
      (r7v9 com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary)
      (r7v12 com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary)
     binds: [B:142:0x021b, B:122:0x01e1, B:109:0x019e, B:75:0x0126, B:77:0x012c, B:79:0x0134, B:81:0x0138, B:89:0x0156, B:74:0x0124, B:39:0x006f] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary LIZIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r11, java.lang.String r12, boolean r13, java.util.List<java.lang.String> r14, java.util.Map<java.lang.String, java.lang.String> r15, java.lang.String r16) {
        /*
            Method dump skipped, instruction units count: 567
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C722002rq.LIZIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData, java.lang.String, boolean, java.util.List, java.util.Map, java.lang.String):com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C722302rt LJFF(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r14, java.lang.String r15, boolean r16, int r17, java.util.List r18, java.util.Map r19, java.lang.String r20, int r21) {
        /*
            r9 = r20
            r8 = r19
            r7 = r18
            r3 = r17
            r6 = r16
            r5 = r15
            r0 = r21 & 1
            r2 = 0
            if (r0 == 0) goto L11
            r5 = r2
        L11:
            r0 = r21 & 2
            r1 = 1
            if (r0 == 0) goto L17
            r6 = 1
        L17:
            r0 = r21 & 4
            if (r0 == 0) goto L1c
            r3 = 0
        L1c:
            r0 = r21 & 8
            if (r0 == 0) goto L21
            r7 = r2
        L21:
            r0 = r21 & 16
            if (r0 == 0) goto L26
            r8 = r2
        L26:
            r0 = r21 & 32
            if (r0 == 0) goto L2b
            r9 = r2
        L2b:
            r4 = r14
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PaymentBillSummary> r0 = r4.paymentSummary
            boolean r0 = X.C756302xN.LIZ(r0)
            if (r0 != 0) goto L40
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData r0 = r4.paymentMethods
            if (r0 == 0) goto L3a
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PaymentBillSummary> r2 = r0.LIZIZ
        L3a:
            boolean r0 = X.C756302xN.LIZ(r2)
            if (r0 == 0) goto L5f
        L40:
            boolean r0 = X.C770702zh.LIZ(r5)
            if (r0 != 0) goto L50
            if (r7 == 0) goto L5f
            boolean r0 = r7.isEmpty()
            r0 = r0 ^ 1
            if (r0 != r1) goto L5f
        L50:
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary r0 = LIZIZ(r4, r5, r6, r7, r8, r9)
        L54:
            if (r0 == 0) goto L77
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PlatformPromotion r2 = r4.platformPromotion
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoSetting r1 = r4.settings
            X.02rt r0 = LJ(r0, r3, r2, r1)
            return r0
        L5f:
            boolean r0 = X.C123100dR.LIZ(r9)
            if (r0 == 0) goto L74
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary> r0 = r4.additionSummary
            if (r0 == 0) goto L77
            java.lang.Object r0 = r0.get(r9)
            if (r0 != 0) goto L71
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary r0 = r4.summary
        L71:
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary) r0
            goto L54
        L74:
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary r0 = r4.summary
            goto L54
        L77:
            X.02rt r0 = new X.02rt
            X.13BV r1 = X.C13BV.INSTANCE
            r2 = 0
            r21 = 4194302(0x3ffffe, float:5.877469E-39)
            r3 = r2
            r4 = r2
            r5 = r2
            r6 = r2
            r7 = r2
            r8 = r2
            r9 = r2
            r10 = r2
            r11 = r2
            r12 = r2
            r13 = r2
            r14 = r2
            r15 = r2
            r16 = r2
            r17 = r2
            r18 = r2
            r19 = r2
            r20 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C722002rq.LJFF(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData, java.lang.String, boolean, int, java.util.List, java.util.Map, java.lang.String, int):X.02rt");
    }
}
