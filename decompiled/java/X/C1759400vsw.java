package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BasicPopUp;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUpButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUpButtonExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import java.util.List;
import kotlin.jvm.internal.AwS140S1100000_26;

/* JADX INFO: renamed from: X.0vsw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1759400vsw {
    public static boolean LIZ(PopUpButton popUpButton) {
        PopUpButtonExtraInfo popUpButtonExtraInfo;
        BasicPopUp basicPopUp;
        List<PopUpButton> list;
        PopUpButton popUpButton2;
        if (popUpButton == null) {
            return false;
        }
        Integer num = popUpButton.action;
        int value = C04H6.SHOW_POP_UP.getValue();
        if (num == null || num.intValue() != value || (popUpButtonExtraInfo = popUpButton.extraInfo) == null || (basicPopUp = popUpButtonExtraInfo.nextPopUp) == null || (list = basicPopUp.buttons) == null || (popUpButton2 = (PopUpButton) C13LP.LJJJLL(list)) == null) {
            return false;
        }
        Integer num2 = popUpButton2.action;
        int value2 = C04H6.UPGRADE_COUPON.getValue();
        if (num2 == null || num2.intValue() != value2) {
            return false;
        }
        return true;
    }

    public static void LIZIZ(PopUpButton popUpButton, PdpViewModel pdpViewModel, String str) {
        String str2;
        String str3;
        C1054004Ag c1054004Ag = pdpViewModel.LLJLILLLLZIIL;
        String str4 = null;
        if (c1054004Ag != null) {
            PopUpButtonExtraInfo popUpButtonExtraInfo = popUpButton.extraInfo;
            if (popUpButtonExtraInfo != null) {
                str3 = popUpButtonExtraInfo.daInfo;
            } else {
                str3 = null;
            }
            InterfaceC1748810vbr interfaceC1748810vbrLJJIJLIJ = c1054004Ag.LJJIJLIJ();
            if (interfaceC1748810vbrLJJIJLIJ != null) {
                C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIJLIJ, new C1751550vgH(), new AwS140S1100000_26(c1054004Ag, str3, 66));
            }
        }
        C1054004Ag c1054004Ag2 = pdpViewModel.LLJLILLLLZIIL;
        if (c1054004Ag2 != null) {
            if (LIZ(popUpButton)) {
                str2 = "to_upgrade";
            } else {
                str2 = "get_new_voucher";
            }
            PopUpButtonExtraInfo popUpButtonExtraInfo2 = popUpButton.extraInfo;
            if (popUpButtonExtraInfo2 != null) {
                str4 = popUpButtonExtraInfo2.daInfo;
            }
            C1054004Ag.LJJIJ(c1054004Ag2, str, str2, "voucher_lucky_draw", str4, 8);
        }
    }
}
