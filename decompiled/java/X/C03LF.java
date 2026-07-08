package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.subpage.USAggregationShopMessageEditFragment;

/* JADX INFO: renamed from: X.03LF, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03LF {
    public static Object LIZ(Fragment fragment, Bundle bundle, InterfaceC1364105Vn interfaceC1364105Vn) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        USAggregationShopMessageEditFragment.LLJJIJIIJIL = c2252611DEt;
        USAggregationShopMessageEditFragment.LLJJIII.getClass();
        FragmentManager fragmentManager = fragment.getFragmentManager();
        if (fragmentManager != null) {
            USAggregationShopMessageEditFragment uSAggregationShopMessageEditFragment = new USAggregationShopMessageEditFragment();
            uSAggregationShopMessageEditFragment.setArguments(bundle);
            uSAggregationShopMessageEditFragment.show(fragmentManager, (String) null);
        } else {
            C2252611DEt c2252611DEt2 = USAggregationShopMessageEditFragment.LLJJIJIIJIL;
            if (c2252611DEt2 != null) {
                Boolean bool = Boolean.FALSE;
                C189200o6.m2constructorimpl(bool);
                c2252611DEt2.resumeWith(bool);
            }
            USAggregationShopMessageEditFragment.LLJJIJIIJIL = null;
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }
}
