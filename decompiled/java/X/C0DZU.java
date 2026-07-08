package X;

import android.view.View;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;

/* JADX INFO: renamed from: X.0DZU, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DZU {
    public static final C0DZU LIZ = new C0DZU();

    public static void LIZIZ(BaseFragment baseFragment) {
        View view = baseFragment.getView();
        if (view != null) {
            C0DRF.LIZ(view);
        }
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJIILJJIL(baseFragment);
    }

    public static void LIZ(BaseFragment baseFragment, BaseFragment baseFragment2) {
        View view = baseFragment.getView();
        if (view != null) {
            C0DRF.LIZ(view);
        }
        String str = TuxSheet._pnsPageId;
        EnumC344640DfC enumC344640DfC = EnumC344640DfC.SCALE_ALPHA;
        TuxSheet tuxSheetLJIIL = C1391190mJ3.LJIIL(baseFragment);
        if (tuxSheetLJIIL != null) {
            tuxSheetLJIIL.aS(baseFragment2, true, enumC344640DfC);
        }
    }
}
