package X;

import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QR7, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QR7 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(C0QER c0qer) {
        String stringOrNullStrategy;
        if (c0qer != null) {
            ECSearchEntranceData ecSearchEntranceData = c0qer.getEcSearchEntranceData();
            if (ecSearchEntranceData != null && (stringOrNullStrategy = ecSearchEntranceData.getStringOrNullStrategy("enter_from_second")) != null) {
                return stringOrNullStrategy;
            }
            if (c0qer.isFromShopVideo()) {
                return "ecom_search_video";
            }
        }
        return LJ(c0qer);
    }

    @InterfaceC1294060jmO
    public static String LIZIZ(C0QER c0qer) {
        String string;
        String string2;
        String stringOrNullStrategy;
        ECSearchEntranceData ecSearchEntranceData;
        String stringOrNullStrategy2;
        if (C0QYF.LIZIZ(c0qer)) {
            return LIZ(c0qer);
        }
        if (c0qer != null && (ecSearchEntranceData = c0qer.getEcSearchEntranceData()) != null && (stringOrNullStrategy2 = ecSearchEntranceData.getStringOrNullStrategy("enter_from_second")) != null) {
            return stringOrNullStrategy2;
        }
        if (C0QYF.LIZIZ(c0qer)) {
            return LIZ(c0qer);
        }
        if (c0qer != null) {
            if (c0qer.getEcSearchEntranceValue() == C0QXR.PDP.getValue()) {
                return "product_detail";
            }
            ECSearchEntranceData ecSearchEntranceData2 = c0qer.getEcSearchEntranceData();
            if (ecSearchEntranceData2 != null && (stringOrNullStrategy = ecSearchEntranceData2.getStringOrNullStrategy("middle_search_position")) != null) {
                return stringOrNullStrategy;
            }
            if (c0qer != null) {
                Object objObtainEcLogData = c0qer.obtainEcLogData("search_entrance");
                if (objObtainEcLogData != null && (string2 = objObtainEcLogData.toString()) != null && C123100dR.LIZ(string2)) {
                    return string2;
                }
                Object objObtainEcLogData2 = c0qer.obtainEcLogData("enter_from");
                if (objObtainEcLogData2 != null && (string = objObtainEcLogData2.toString()) != null && C123100dR.LIZ(string)) {
                    return string;
                }
            }
        }
        return LIZJ(c0qer);
    }

    @InterfaceC1294060jmO
    public static String LIZJ(C0QER c0qer) {
        String string;
        if (C0QYF.LIZIZ(c0qer)) {
            return LJ(c0qer);
        }
        if (c0qer != null) {
            Object objObtainEcLogData = c0qer.obtainEcLogData("result_search_entrance");
            if (objObtainEcLogData != null && (string = objObtainEcLogData.toString()) != null && C123100dR.LIZ(string)) {
                return string;
            }
            String enterSearchFrom = c0qer.getEnterSearchFrom();
            if (enterSearchFrom != null) {
                return enterSearchFrom;
            }
        }
        return "";
    }

    public static String LJ(C0QER c0qer) {
        String enterSearchFrom;
        if (c0qer == null || (enterSearchFrom = c0qer.getEnterSearchFrom()) == null) {
            return "";
        }
        return enterSearchFrom;
    }

    public static String LIZLLL(C0QER c0qer, String str) {
        ECSearchEntranceData ecSearchEntranceData;
        String stringOrNullStrategy;
        if (Intrinsics.LJFF(str, EnumC669620QOi.SHOP.getTabName())) {
            if (c0qer != null && (ecSearchEntranceData = c0qer.getEcSearchEntranceData()) != null && (stringOrNullStrategy = ecSearchEntranceData.getStringOrNullStrategy("vertical_search_scene")) != null && (!Intrinsics.LJFF(stringOrNullStrategy, "goods_search"))) {
                return stringOrNullStrategy;
            }
        } else {
            if (str == null) {
                return LIZ(c0qer);
            }
            if (Intrinsics.LJFF(str, "")) {
                return LIZ(c0qer);
            }
        }
        return str;
    }

    public static String LJFF(int i, String str) {
        if (i != C0QXR.LIVE_PRODUCT_LIST_MAGNIFIER.getValue() && i != C0QXR.LIVE_PRODUCT_LIST_GUESS_WORDS.getValue()) {
            return str;
        }
        return "live_cart_search_result";
    }
}
