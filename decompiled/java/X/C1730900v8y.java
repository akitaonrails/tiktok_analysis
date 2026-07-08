package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateField;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldProduct;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldPromotionInfo;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldText;

/* JADX INFO: renamed from: X.0v8y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1730900v8y {
    public static final TemplateField LIZIZ(TemplateField templateField, Integer num) {
        TemplateFieldPromotionInfo templateFieldPromotionInfo;
        TemplateFieldPromotionInfo templateFieldPromotionInfo2 = templateField.fieldData.fieldPromotionInfo;
        if (templateFieldPromotionInfo2 != null) {
            templateFieldPromotionInfo = new TemplateFieldPromotionInfo(templateFieldPromotionInfo2.richText, templateFieldPromotionInfo2.activityId, templateFieldPromotionInfo2.activityType, num, templateFieldPromotionInfo2.maxCount);
        } else {
            templateFieldPromotionInfo = null;
        }
        return TemplateField.LIZ(templateField, TemplateFieldData.LIZ(templateField.fieldData, null, null, templateFieldPromotionInfo, 3));
    }

    public static final TemplateField LIZJ(TemplateField templateField, String str) {
        TemplateFieldText templateFieldText;
        TemplateFieldText templateFieldText2 = templateField.fieldData.fieldText;
        if (templateFieldText2 != null) {
            templateFieldText = new TemplateFieldText(str, templateFieldText2.limit, templateFieldText2.color, templateFieldText2.defaultContent, templateFieldText2.bgColor, templateFieldText2.lineLimit);
        } else {
            templateFieldText = null;
        }
        return TemplateField.LIZ(templateField, TemplateFieldData.LIZ(templateField.fieldData, templateFieldText, null, null, 6));
    }

    public static final TemplateField LIZ(TemplateField templateField, String str, String str2, String str3, String str4) {
        TemplateFieldProduct templateFieldProduct;
        TemplateFieldProduct templateFieldProduct2 = templateField.fieldData.fieldProduct;
        if (templateFieldProduct2 != null) {
            templateFieldProduct = new TemplateFieldProduct(str2, str3, str, str4, templateFieldProduct2.productOriginImage);
        } else {
            templateFieldProduct = null;
        }
        return TemplateField.LIZ(templateField, TemplateFieldData.LIZ(templateField.fieldData, null, templateFieldProduct, null, 5));
    }
}
