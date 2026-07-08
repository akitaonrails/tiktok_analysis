package X;

import android.app.Dialog;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.tux.system.TuxImmersionBar;

/* JADX INFO: renamed from: X.0d4g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1036320d4g {
    public static <DEPEND extends InterfaceC1036380d4m> void LIZ(TuxSheet tuxSheet, boolean z) {
        Dialog dialog = tuxSheet.getDialog();
        if (dialog != null) {
            TuxImmersionBar tuxImmersionBarLJFF = C1766560w4U.LJFF(tuxSheet.requireActivity(), dialog);
            tuxImmersionBarLJFF.LIZIZ.LJIIJ(z);
            tuxImmersionBarLJFF.LIZIZ.LJIIL();
            tuxImmersionBarLJFF.LJFF(-16777216);
            tuxImmersionBarLJFF.LIZIZ.LJII(true);
            tuxImmersionBarLJFF.LIZ(false);
            tuxImmersionBarLJFF.LIZLLL();
        }
    }
}
