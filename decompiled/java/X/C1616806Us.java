package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.BillboardSettingsFragment;

/* JADX INFO: renamed from: X.06Us, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1616806Us {
    public static void LIZ(Bundle bundle, FragmentManager fragmentManager) {
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        BillboardSettingsFragment billboardSettingsFragment = new BillboardSettingsFragment();
        billboardSettingsFragment.setArguments(bundle);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJI = billboardSettingsFragment;
        tuxSheet.LLJLILLLLZIIL = false;
        c1390920mIc.LJIIIIZZ(1);
        int iLJ = (int) C958103op.LJ();
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLJJL = iLJ;
        tuxSheet2.LLJLL = true;
        tuxSheet2.show(fragmentManager, BillboardSettingsFragment.class.getName());
    }
}
