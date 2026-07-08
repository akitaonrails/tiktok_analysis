package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.QuantityNoticeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.02xr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C759302xr {
    public static final Float LIZLLL(List<SkuItem> list) {
        float fFloatValue;
        float fFloatValue2;
        if (list.isEmpty()) {
            return null;
        }
        Float fLJ = ((SkuItem) ListProtector.get(list, 0)).LJ();
        if (fLJ != null) {
            fFloatValue = fLJ.floatValue();
        } else {
            fFloatValue = Float.MIN_VALUE;
        }
        int size = list.size() - 1;
        if (1 <= size) {
            int i = 1;
            while (true) {
                Float fLJ2 = ((SkuItem) ListProtector.get(list, i)).LJ();
                if (fLJ2 != null) {
                    fFloatValue2 = fLJ2.floatValue();
                } else {
                    fFloatValue2 = Float.MIN_VALUE;
                }
                if (fFloatValue2 > fFloatValue) {
                    fFloatValue = fFloatValue2;
                }
                if (i == size) {
                    break;
                }
                i++;
            }
        }
        if (fFloatValue == Float.MIN_VALUE) {
            return null;
        }
        return Float.valueOf(fFloatValue);
    }

    public static final Float LJ(List<SkuItem> list) {
        float fFloatValue;
        float fFloatValue2;
        if (list.isEmpty()) {
            return null;
        }
        Float fLJ = ((SkuItem) ListProtector.get(list, 0)).LJ();
        if (fLJ != null) {
            fFloatValue = fLJ.floatValue();
        } else {
            fFloatValue = Float.MAX_VALUE;
        }
        int size = list.size() - 1;
        if (1 <= size) {
            int i = 1;
            while (true) {
                Float fLJ2 = ((SkuItem) ListProtector.get(list, i)).LJ();
                if (fLJ2 != null) {
                    fFloatValue2 = fLJ2.floatValue();
                } else {
                    fFloatValue2 = Float.MAX_VALUE;
                }
                if (fFloatValue2 < fFloatValue) {
                    fFloatValue = fFloatValue2;
                }
                if (i == size) {
                    break;
                }
                i++;
            }
        }
        if (fFloatValue == Float.MAX_VALUE) {
            return null;
        }
        return Float.valueOf(fFloatValue);
    }

    public static final Float LJFF(List<SkuItem> list) {
        float fFloatValue;
        float fFloatValue2;
        if (list.isEmpty()) {
            return null;
        }
        Float fLJFF = ((SkuItem) ListProtector.get(list, 0)).LJFF();
        if (fLJFF != null) {
            fFloatValue = fLJFF.floatValue();
        } else {
            fFloatValue = Float.MIN_VALUE;
        }
        int size = list.size() - 1;
        if (1 <= size) {
            int i = 1;
            while (true) {
                Float fLJFF2 = ((SkuItem) ListProtector.get(list, i)).LJFF();
                if (fLJFF2 != null) {
                    fFloatValue2 = fLJFF2.floatValue();
                } else {
                    fFloatValue2 = Float.MIN_VALUE;
                }
                if (fFloatValue2 > fFloatValue) {
                    fFloatValue = fFloatValue2;
                }
                if (i == size) {
                    break;
                }
                i++;
            }
        }
        if (fFloatValue == Float.MIN_VALUE) {
            return null;
        }
        return Float.valueOf(fFloatValue);
    }

    public static final Float LJI(List<SkuItem> list) {
        float fFloatValue;
        float fFloatValue2;
        if (list.isEmpty()) {
            return null;
        }
        Float fLJFF = ((SkuItem) ListProtector.get(list, 0)).LJFF();
        if (fLJFF != null) {
            fFloatValue = fLJFF.floatValue();
        } else {
            fFloatValue = Float.MAX_VALUE;
        }
        int size = list.size() - 1;
        if (1 <= size) {
            int i = 1;
            while (true) {
                Float fLJFF2 = ((SkuItem) ListProtector.get(list, i)).LJFF();
                if (fLJFF2 != null) {
                    fFloatValue2 = fLJFF2.floatValue();
                } else {
                    fFloatValue2 = Float.MAX_VALUE;
                }
                if (fFloatValue2 < fFloatValue) {
                    fFloatValue = fFloatValue2;
                }
                if (i == size) {
                    break;
                }
                i++;
            }
        }
        if (fFloatValue == Float.MAX_VALUE) {
            return null;
        }
        return Float.valueOf(fFloatValue);
    }

    public static final void LIZ(List<SkuItem> list, LaneParams laneParams) {
        Price price;
        String currency;
        if (list.isEmpty()) {
            return;
        }
        SkuPrice skuPrice = ((SkuItem) ListProtector.get(list, 0)).price;
        if (skuPrice != null && (price = skuPrice.realPrice) != null && (currency = price.getCurrency()) != null) {
            laneParams.put("currency", currency);
        }
        Float fLJFF = LJFF(list);
        if (fLJFF != null) {
            laneParams.put("sale_price_highest", fLJFF);
        }
        Float fLJI = LJI(list);
        if (fLJI != null) {
            laneParams.put("sale_price_lowest", fLJI);
        }
        Float fLIZLLL = LIZLLL(list);
        if (fLIZLLL != null) {
            laneParams.put("original_price_highest", fLIZLLL);
        } else if (fLJFF != null) {
            laneParams.put("original_price_highest", fLJFF);
        }
        Float fLJ = LJ(list);
        if (fLJ != null) {
            laneParams.put("original_price_lowest", fLJ);
        } else {
            if (fLJI == null) {
                return;
            }
            laneParams.put("original_price_lowest", fLJI);
        }
    }

    public static final void LIZIZ(List<SkuItem> list, Map<String, Object> map) {
        Price price;
        String currency;
        if (list.isEmpty()) {
            return;
        }
        SkuPrice skuPrice = ((SkuItem) ListProtector.get(list, 0)).price;
        if (skuPrice != null && (price = skuPrice.realPrice) != null && (currency = price.getCurrency()) != null) {
            ((ConcurrentHashMap) map).put("currency", currency);
        }
        Float fLJFF = LJFF(list);
        if (fLJFF != null) {
            ((ConcurrentHashMap) map).put("sale_price_highest", fLJFF);
        }
        Float fLJI = LJI(list);
        if (fLJI != null) {
            ((ConcurrentHashMap) map).put("sale_price_lowest", fLJI);
        }
        Float fLIZLLL = LIZLLL(list);
        if (fLIZLLL != null) {
            ((ConcurrentHashMap) map).put("original_price_highest", fLIZLLL);
        } else if (fLJFF != null) {
            ((ConcurrentHashMap) map).put("original_price_highest", fLJFF);
        }
        Float fLJ = LJ(list);
        if (fLJ != null) {
            ((ConcurrentHashMap) map).put("original_price_lowest", fLJ);
        } else {
            if (fLJI == null) {
                return;
            }
            ((ConcurrentHashMap) map).put("original_price_lowest", fLJI);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZJ(Map<Integer, List<QuantityNoticeInfo>> map, QuantityNoticeInfo quantityNoticeInfo) {
        Integer num;
        if (quantityNoticeInfo != null && (num = quantityNoticeInfo.location) != null) {
            Integer numValueOf = Integer.valueOf(num.intValue());
            Object arrayList = ((LinkedHashMap) map).get(numValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(numValueOf, arrayList);
            }
            ((List) arrayList).add(quantityNoticeInfo);
        }
    }
}
