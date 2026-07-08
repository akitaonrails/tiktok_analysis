package X;

import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.inner.PromotionProperty;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.184q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212258184q {
    public static final String LIZ(PromotionLabel promotionLabel) {
        Object obj;
        if (!LIZLLL(promotionLabel)) {
            return null;
        }
        Map<String, Object> map = promotionLabel.daInfo;
        if (map != null) {
            obj = map.get("button_name");
        } else {
            obj = null;
        }
        if (!(obj instanceof String)) {
            return null;
        }
        return (String) obj;
    }

    public static final String LIZIZ(PromotionLabel promotionLabel) {
        Object obj;
        if (!LIZLLL(promotionLabel)) {
            return null;
        }
        Map<String, Object> map = promotionLabel.daInfo;
        if (map != null) {
            obj = map.get("text_button_name");
        } else {
            obj = null;
        }
        if (!(obj instanceof String)) {
            return null;
        }
        return (String) obj;
    }

    public static final String LIZJ(PromotionLabel promotionLabel) {
        List<PromotionProperty> list;
        PromotionProperty next;
        if (!LJ(promotionLabel) || (list = promotionLabel.extraProperty) == null) {
            return null;
        }
        Iterator<PromotionProperty> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.propertyName, "live_flash_sale_short_text")) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        PromotionProperty promotionProperty = next;
        if (promotionProperty == null) {
            return null;
        }
        return promotionProperty.propertyValue;
    }

    public static final boolean LIZLLL(PromotionLabel promotionLabel) {
        return C1697810uHb.LJIIJJI(77, 78, 76, 75).contains(Integer.valueOf(promotionLabel.type));
    }

    public static final boolean LJ(PromotionLabel promotionLabel) {
        List<PromotionProperty> list;
        if (4 != promotionLabel.type || (list = promotionLabel.extraProperty) == null) {
            return false;
        }
        for (PromotionProperty promotionProperty : list) {
            PromotionProperty promotionProperty2 = promotionProperty;
            if (Intrinsics.LJFF("is_live_flash_sale", promotionProperty2.propertyName) || Intrinsics.LJFF("is_creator_live_flash_sale", promotionProperty2.propertyName)) {
                if (Intrinsics.LJFF("1", promotionProperty2.propertyValue)) {
                    if (promotionProperty == null) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
