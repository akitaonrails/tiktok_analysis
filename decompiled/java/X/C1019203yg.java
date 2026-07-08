package X;

import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.bundlepanel.BundlePanelFragment;

/* JADX INFO: renamed from: X.03yg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1019203yg {
    public static void LIZ(Bundle bundle, FragmentManager fragmentManager, String str) {
        if (str == null) {
            return;
        }
        int i = Resources.getSystem().getDisplayMetrics().heightPixels;
        BundlePanelFragment bundlePanelFragment = new BundlePanelFragment();
        bundlePanelFragment.setArguments(bundle);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LJIIIIZZ(1);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJL = (int) (((double) i) * 0.85d);
        tuxSheet.LLJJIJI = bundlePanelFragment;
        tuxSheet.LLILLJJLI = bundlePanelFragment.LLILZLL;
        tuxSheet.LLJLL = true;
        tuxSheet.LLJLILLLLZIIL = false;
        tuxSheet.show(fragmentManager, "BundlePanelFragment");
    }
}
