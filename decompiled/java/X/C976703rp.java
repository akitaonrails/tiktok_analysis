package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListPanelAssemFragment;

/* JADX INFO: renamed from: X.03rp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C976703rp {
    public static AddressListPanelAssemFragment LIZ(AddressPageStarter.AddressListEnterParams addressListEnterParams, String str, String str2, String str3) {
        String checkoutType;
        AddressListPanelAssemFragment addressListPanelAssemFragment = new AddressListPanelAssemFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIJL(bundle, "enter_params", addressListEnterParams);
        C786410Ut5.LJJJI("track_id", str, bundle);
        C786410Ut5.LJJJI("selected_address_id", str2, bundle);
        C786410Ut5.LJJJI("unavailable_address_ids", str3, bundle);
        if (addressListEnterParams == null || (checkoutType = addressListEnterParams.getCheckoutType()) == null) {
            checkoutType = "normal_checkout";
        }
        C786410Ut5.LJJJI("checkout_type", checkoutType, bundle);
        if (str != null) {
            C960603pE.LJIIJ(bundle, str);
        }
        addressListPanelAssemFragment.setArguments(bundle);
        return addressListPanelAssemFragment;
    }
}
