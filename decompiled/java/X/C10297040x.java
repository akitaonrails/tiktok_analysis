package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.map.AddressMapDetailFragment;

/* JADX INFO: renamed from: X.040x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10297040x {
    public static void LIZ(AddressPageStarter.AddressMapDetailEnterParams addressMapDetailEnterParams, FragmentManager fragmentManager) {
        AddressMapDetailFragment addressMapDetailFragment = new AddressMapDetailFragment();
        addressMapDetailFragment.LLILZIL = addressMapDetailEnterParams;
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIJI = addressMapDetailFragment;
        c1390920mIc.LJIIIIZZ(1);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJLL = true;
        tuxSheet.LLJLILLLLZIIL = false;
        tuxSheet.LLJLLL = false;
        tuxSheet.LLILLL = false;
        tuxSheet.show(fragmentManager, "address_map_detail_fragment");
    }
}
