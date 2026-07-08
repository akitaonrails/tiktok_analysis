package X;

import androidx.fragment.app.DialogFragment;
import com.bytedance.tux.system.TuxImmersionBar;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Tt6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C760940Tt6 {
    public static final boolean LIZ(String str) {
        if (!Intrinsics.LJFF(str, "solo") && !Intrinsics.LJFF(str, "solo_new")) {
            return false;
        }
        return true;
    }

    public static final void LIZIZ(DialogFragment dialogFragment) {
        if (C500260Jjc.LJ(dialogFragment.getContext()) != null) {
            TuxImmersionBar tuxImmersionBarLIZJ = C1766560w4U.LIZJ(dialogFragment, false);
            tuxImmersionBarLIZJ.LIZJ(false, false);
            tuxImmersionBarLIZJ.LIZIZ.LJIIL();
            tuxImmersionBarLIZJ.LJFF(-16777216);
            tuxImmersionBarLIZJ.LIZIZ.LJII(false);
            tuxImmersionBarLIZJ.LIZLLL();
        }
    }
}
