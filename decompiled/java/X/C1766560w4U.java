package X;

import android.app.Dialog;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.tux.system.TuxImmersionBar;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0w4U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1766560w4U {
    public static TuxImmersionBar LIZLLL(Fragment fragment) {
        return new TuxImmersionBar(fragment.getContext(), ImmersionBar.LJIILIIL(fragment, true));
    }

    public static TuxImmersionBar LJ(C19EG c19eg) {
        return new TuxImmersionBar(c19eg, ImmersionBar.LJIILJJIL(c19eg));
    }

    public static void LIZ(C19EG c19eg, Dialog dialog) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c19eg.toString());
        sbLIZ.append(dialog.toString());
        ((HashMap) ImmersionBar.LJIILIIL).remove(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LIZIZ(C19EG c19eg, Window window) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c19eg.toString());
        sbLIZ.append(window.toString());
        ((HashMap) ImmersionBar.LJIILIIL).remove(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static TuxImmersionBar LIZJ(DialogFragment dialogFragment, boolean z) {
        if (dialogFragment.getActivity() != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(dialogFragment.getActivity().toString());
            sbLIZ.append(dialogFragment.toString());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            HashMap map = (HashMap) ImmersionBar.LJIILIIL;
            ImmersionBar immersionBar = (ImmersionBar) map.get(strLIZIZ);
            if (immersionBar == null) {
                immersionBar = new ImmersionBar(dialogFragment, strLIZIZ, z);
                map.put(strLIZIZ, immersionBar);
            }
            return new TuxImmersionBar(dialogFragment.getContext(), immersionBar);
        }
        throw new NullPointerException("Activity cannot be null");
    }

    public static TuxImmersionBar LJFF(C19EG c19eg, Dialog dialog) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c19eg.toString());
        sbLIZ.append(dialog.toString());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        HashMap map = (HashMap) ImmersionBar.LJIILIIL;
        ImmersionBar immersionBar = (ImmersionBar) map.get(strLIZIZ);
        if (immersionBar == null) {
            immersionBar = new ImmersionBar(c19eg, dialog, strLIZIZ);
            map.put(strLIZIZ, immersionBar);
        }
        return new TuxImmersionBar(c19eg, immersionBar);
    }

    public static TuxImmersionBar LJI(C19EG c19eg, Window window) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c19eg.toString());
        sbLIZ.append(window.toString());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        HashMap map = (HashMap) ImmersionBar.LJIILIIL;
        ImmersionBar immersionBar = (ImmersionBar) map.get(strLIZIZ);
        if (immersionBar == null) {
            immersionBar = new ImmersionBar(c19eg, window, strLIZIZ, false);
            map.put(strLIZIZ, immersionBar);
        }
        return new TuxImmersionBar(c19eg, immersionBar);
    }
}
