package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.address.tab.AddressTabEnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.address.tab.AddressTabFragment;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;

/* JADX INFO: renamed from: X.03q6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C966003q6 {
    public static void LIZ(FragmentManager fragmentManager, AddressTabEnterParams addressTabEnterParams, String str) {
        AddressTabFragment addressTabFragment = new AddressTabFragment();
        Bundle bundle = new Bundle();
        DeliveryPanelStarter.EnterParam enterParam = addressTabEnterParams.deliveryInfo;
        if (enterParam != null) {
            enterParam.hideTitle = Boolean.TRUE;
            enterParam.fromScene = "osp";
        }
        C786410Ut5.LJJIJL(bundle, "enter_params", addressTabEnterParams);
        if (str != null) {
            C960603pE.LJIIJ(bundle, str);
        }
        addressTabFragment.setArguments(bundle);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIJI = addressTabFragment;
        c1390920mIc.LJIIIIZZ(1);
        int iLIZ = (int) C958103op.LIZ();
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJL = iLIZ;
        tuxSheet.LLJLILLLLZIIL = false;
        tuxSheet.LLJLL = true;
        tuxSheet.show(fragmentManager, "address_tab_fragment");
    }
}
