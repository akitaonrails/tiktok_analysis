package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUpButton;

/* JADX INFO: renamed from: X.04H7, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04H7 {
    public static String LIZ(PopUpButton popUpButton) {
        Integer num = popUpButton.action;
        int value = C04H6.UPGRADE_COUPON.getValue();
        if (num != null && num.intValue() == value) {
            return "upgrade";
        }
        int value2 = C04H6.CLAIM_COUPON.getValue();
        if (num != null && num.intValue() == value2) {
            return "claim";
        }
        int value3 = C04H6.ADD_TO_CART.getValue();
        if (num != null && num.intValue() == value3) {
            return "add_to_cart";
        }
        int value4 = C04H6.CLOSE_POP_UP.getValue();
        if (num != null && num.intValue() == value4) {
            return "continue_shopping";
        }
        return "";
    }
}
