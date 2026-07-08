package X;

import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;

/* JADX INFO: renamed from: X.0QQa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C670060QQa {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Integer num, ECSearchEntranceData eCSearchEntranceData, String str) {
        int iLIZ;
        int iLIZ2;
        int[] iArr = (int[]) C308870C8v.LIZIZ.getValue();
        if (num != null) {
            iLIZ = num.intValue();
        } else {
            ECSearchEntranceData.Companion.getClass();
            iLIZ = C650500PfM.LIZ(eCSearchEntranceData);
        }
        String stringOrNullStrategy = null;
        Integer intOrNullStrategy = null;
        if (C13LQ.LJIILJJIL(iLIZ, iArr)) {
            if (eCSearchEntranceData != null) {
                intOrNullStrategy = eCSearchEntranceData.getIntOrNullStrategy("container_type");
            }
            int value = C0QQZ.SIMPLE.getValue();
            if (intOrNullStrategy != null && intOrNullStrategy.intValue() == value) {
                return EnumC670440QRm.SIMPLE.getValue();
            }
            int value2 = C0QQZ.HALF_OLD.getValue();
            if (intOrNullStrategy != null && intOrNullStrategy.intValue() == value2) {
                return EnumC670440QRm.HALF_SHOP.getValue();
            }
            int value3 = C0QQZ.HALF_NEW.getValue();
            if (intOrNullStrategy != null && intOrNullStrategy.intValue() == value3) {
                return EnumC670440QRm.HALF_SHOP.getValue();
            }
            int value4 = C0QQZ.NINE_HALF.getValue();
            if (intOrNullStrategy != null && intOrNullStrategy.intValue() == value4) {
                return EnumC670440QRm.NINE_PERCENT_SHOP.getValue();
            }
            return EnumC670440QRm.NORMAL.getValue();
        }
        if (eCSearchEntranceData == null || (stringOrNullStrategy = eCSearchEntranceData.getStringOrNullStrategy("page_type")) == null || stringOrNullStrategy.length() == 0) {
            if (num != null) {
                iLIZ2 = num.intValue();
            } else {
                ECSearchEntranceData.Companion.getClass();
                iLIZ2 = C650500PfM.LIZ(eCSearchEntranceData);
            }
            if (iLIZ2 != C0QXR.HALF_SHOP.getValue()) {
                int value5 = C0QXR.LIVE_PRODUCT_LIST_MAGNIFIER.getValue();
                if (num == null || num.intValue() != value5) {
                    int value6 = C0QXR.LIVE_PRODUCT_LIST_GUESS_WORDS.getValue();
                    if (num == null || num.intValue() != value6) {
                        if (iLIZ2 != C0QXR.UG_EC_SEARCH_COIN_TASK.getValue() && iLIZ2 != C0QXR.CASH_BACK_ON_ORDERS.getValue()) {
                            if (stringOrNullStrategy == null) {
                                if (str == null) {
                                    return EnumC670440QRm.SIMPLE.getValue();
                                }
                                return str;
                            }
                        } else {
                            return EnumC670440QRm.NINE_PERCENT_SHOP.getValue();
                        }
                    }
                }
            }
            return EnumC670440QRm.HALF_SHOP.getValue();
        }
        return stringOrNullStrategy;
    }
}
