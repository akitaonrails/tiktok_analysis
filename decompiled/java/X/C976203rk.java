package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListPanelAssemFragment;
import com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceHorizonBottomSheetDialogFragment;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import java.util.HashMap;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03rk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C976203rk {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListPanelAssemFragment] */
    public static void LIZ(FragmentManager fragmentManager, AddressPageStarter.AddressListEnterParams addressListEnterParams, String str, String str2, String str3) {
        Boolean forceVertical;
        String checkoutType;
        String checkoutType2;
        String string;
        HashMap<String, Object> mapLJIIJ;
        Object obj;
        C259800zU c259800zU = new C259800zU();
        AddressListPanelAssemFragment.LLILZLL.getClass();
        c259800zU.element = C976703rp.LIZ(addressListEnterParams, str, str2, str3);
        Float pageHeightPercent = null;
        if (addressListEnterParams != null) {
            forceVertical = addressListEnterParams.getForceVertical();
        } else {
            forceVertical = null;
        }
        C928203k0 c928203k0 = C928203k0.LIZ;
        if (addressListEnterParams != null) {
            checkoutType = addressListEnterParams.getCheckoutType();
        } else {
            checkoutType = null;
        }
        c928203k0.getClass();
        if (C928203k0.LJIILJJIL(checkoutType) && !Intrinsics.LJFF(forceVertical, Boolean.TRUE)) {
            CommerceHorizonBottomSheetDialogFragment commerceHorizonBottomSheetDialogFragment = new CommerceHorizonBottomSheetDialogFragment();
            ECBaseFragment eCBaseFragment = (ECBaseFragment) c259800zU.element;
            C04JS c04js = new C04JS(c259800zU, 0);
            commerceHorizonBottomSheetDialogFragment.LLJILJIL = eCBaseFragment;
            if (eCBaseFragment != null) {
                eCBaseFragment.LLILLJJLI = new AwS545S0100000_1(commerceHorizonBottomSheetDialogFragment, 1614);
            }
            commerceHorizonBottomSheetDialogFragment.LLJIJIL = c04js;
            if (addressListEnterParams != null) {
                checkoutType2 = addressListEnterParams.getCheckoutType();
                String trackParams = addressListEnterParams.getTrackParams();
                if (trackParams != null && (mapLJIIJ = C1741890vQh.LJIIJ(trackParams)) != null && (obj = mapLJIIJ.get("source_page_type")) != null) {
                    string = obj.toString();
                }
                pageHeightPercent = addressListEnterParams.getPageHeightPercent();
                commerceHorizonBottomSheetDialogFragment.cS(C928203k0.LJIIL(pageHeightPercent, checkoutType2, string));
                commerceHorizonBottomSheetDialogFragment.show(fragmentManager, "CommerceHorizonBottomSheetDialogFragment");
                return;
            }
            checkoutType2 = null;
            string = null;
            if (addressListEnterParams != null) {
                pageHeightPercent = addressListEnterParams.getPageHeightPercent();
            }
            commerceHorizonBottomSheetDialogFragment.cS(C928203k0.LJIIL(pageHeightPercent, checkoutType2, string));
            commerceHorizonBottomSheetDialogFragment.show(fragmentManager, "CommerceHorizonBottomSheetDialogFragment");
            return;
        }
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LJIIIIZZ(1);
        int iLIZIZ = (int) C958103op.LIZIZ();
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJL = iLIZIZ;
        tuxSheet.LLJJIJI = (Fragment) c259800zU.element;
        tuxSheet.LLJLL = true;
        tuxSheet.LLJLILLLLZIIL = false;
        tuxSheet.LLILLJJLI = new C04JS(c259800zU, 1);
        tuxSheet.show(fragmentManager, "address_list_panel_fragment");
    }
}
