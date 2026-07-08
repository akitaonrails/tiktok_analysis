package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.subpage.USHalfPageMessageEditPanelFragment;

/* JADX INFO: renamed from: X.03t3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C984303t3 {
    public static void LIZ(C984303t3 c984303t3, FragmentManager fragmentManager, Bundle bundle, String str, String str2, int i) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        c984303t3.getClass();
        C928203k0.LIZ.getClass();
        Integer numLJIIL = C928203k0.LJIIL(null, str, str2);
        USHalfPageMessageEditPanelFragment uSHalfPageMessageEditPanelFragment = new USHalfPageMessageEditPanelFragment();
        uSHalfPageMessageEditPanelFragment.setArguments(bundle);
        if (numLJIIL != null) {
            uSHalfPageMessageEditPanelFragment.cS(numLJIIL);
        }
        uSHalfPageMessageEditPanelFragment.show(fragmentManager, "USHalfPageMessageEditPanelFragment");
    }
}
