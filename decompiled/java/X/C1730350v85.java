package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.LiveGiveawayTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RespTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateField;
import java.util.List;

/* JADX INFO: renamed from: X.0v85, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1730350v85 {
    public static LiveGiveawayTemplateItem LIZ(RespTemplateItem respTemplateItem, boolean z) {
        boolean zBooleanValue;
        boolean z2;
        boolean zBooleanValue2;
        boolean zBooleanValue3;
        Integer num = respTemplateItem.subType;
        String str = respTemplateItem.templateId;
        if (str == null) {
            str = "";
        }
        String str2 = respTemplateItem.backgroundUrl;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = respTemplateItem.templateUrl;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = respTemplateItem.keyMessage;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = respTemplateItem.introduction;
        if (str5 == null) {
            str5 = "";
        }
        List<TemplateField> list = respTemplateItem.fieldList;
        Boolean bool = respTemplateItem.isUsing;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        Boolean bool2 = respTemplateItem.isUsing;
        if ((bool2 == null || !bool2.booleanValue()) && !z) {
            z2 = false;
        } else {
            z2 = true;
        }
        Boolean bool3 = respTemplateItem.isChanged;
        if (bool3 != null) {
            zBooleanValue2 = bool3.booleanValue();
        } else {
            zBooleanValue2 = false;
        }
        Boolean bool4 = respTemplateItem.supportAutoDisplay;
        if (bool4 != null) {
            zBooleanValue3 = bool4.booleanValue();
        } else {
            zBooleanValue3 = false;
        }
        return new LiveGiveawayTemplateItem(num, str, str2, str3, str4, str5, list, zBooleanValue, z2, zBooleanValue2, zBooleanValue3, respTemplateItem.activityInfo, respTemplateItem.giveawayInfo, respTemplateItem.templateDecorationList, 229377);
    }
}
