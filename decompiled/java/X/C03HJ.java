package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceHorizonBottomSheetDialogFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.subpage.USAggregationProductInfoAssemFragment;
import java.util.Map;
import kotlin.jvm.internal.AwS6S0220000_1;

/* JADX INFO: renamed from: X.03HJ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03HJ {
    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(Fragment fragment, C719302rP c719302rP, Map map, boolean z, Integer num, boolean z2) {
        int iLIZIZ;
        TuxSheet tuxSheet;
        USAggregationProductInfoAssemFragment uSAggregationProductInfoAssemFragment = new USAggregationProductInfoAssemFragment();
        Bundle bundle = new Bundle();
        if (fragment instanceof InterfaceC1748810vbr) {
            C960603pE.LJI(bundle, (InterfaceC1748810vbr) fragment, new AwS6S0220000_1(c719302rP, (C719302rP) map, (Map<String, String>) z, z2, true));
        }
        uSAggregationProductInfoAssemFragment.setArguments(bundle);
        USAggregationProductInfoAssemFragment.LLJJI = c719302rP.LLJJLIIIJLLLLLLLZ;
        uSAggregationProductInfoAssemFragment.LLJILJIL = c719302rP.LLJJIJIL;
        if (z2) {
            CommerceHorizonBottomSheetDialogFragment commerceHorizonBottomSheetDialogFragment = new CommerceHorizonBottomSheetDialogFragment();
            CommerceHorizonBottomSheetDialogFragment.dS(commerceHorizonBottomSheetDialogFragment, uSAggregationProductInfoAssemFragment);
            commerceHorizonBottomSheetDialogFragment.cS(num);
            commerceHorizonBottomSheetDialogFragment.LLJILLL = false;
            FragmentManager fragmentManager = fragment.getFragmentManager();
            if (fragmentManager != null) {
                commerceHorizonBottomSheetDialogFragment.show(fragmentManager, "CommerceHorizonBottomSheetDialogFragment");
                return;
            }
            return;
        }
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LJIIIIZZ(1);
        if (num != null) {
            iLIZIZ = num.intValue();
        } else {
            iLIZIZ = (int) C958103op.LIZIZ();
        }
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLJJL = iLIZIZ;
        tuxSheet2.LLJJIJI = uSAggregationProductInfoAssemFragment;
        tuxSheet2.LLJLL = true;
        tuxSheet2.LLJLLL = false;
        tuxSheet2.LLJLILLLLZIIL = false;
        USAggregationProductInfoAssemFragment.LLJJ = tuxSheet2;
        FragmentManager fragmentManager2 = fragment.getFragmentManager();
        if (fragmentManager2 == null || (tuxSheet = USAggregationProductInfoAssemFragment.LLJJ) == null) {
            return;
        }
        tuxSheet.show(fragmentManager2, (String) null);
    }
}
