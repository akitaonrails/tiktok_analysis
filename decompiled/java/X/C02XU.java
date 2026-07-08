package X;

import com.bytedance.android.livesdk.model.message.ext.PromotionItem;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.inner.LabelCountdown;

/* JADX INFO: renamed from: X.02XU, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02XU {
    public static final PromotionItem LIZ(PromotionLabel promotionLabel) {
        String str;
        String str2;
        String str3 = promotionLabel.id;
        String str4 = promotionLabel.text;
        int i = promotionLabel.type;
        LabelCountdown labelCountdown = promotionLabel.countdown;
        if (labelCountdown != null) {
            str = labelCountdown.startTime;
            str2 = labelCountdown.endTime;
        } else {
            str = null;
            str2 = null;
        }
        return new PromotionItem(str3, str4, null, null, null, null, null, Integer.valueOf(i), null, null, str, str2, null, null, null, null, null, null, str4);
    }
}
