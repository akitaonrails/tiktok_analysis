package X;

import android.graphics.Color;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0S4j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C715390S4j {
    public static final float LIZ = C418440Gaw.LIZIZ(140);

    public static void LIZ(View view) {
        if (view != null) {
            view.setBackground(null);
        }
    }

    public static void LIZIZ(int i, View view) {
        if (view == null || C715400S4k.LIZIZ()) {
            return;
        }
        try {
            String strLIZ = C715400S4k.LIZ();
            if (u.LJJIIJZLJL(strLIZ, "#", false)) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZ = Integer.valueOf(Color.parseColor(strLIZ));
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(i)));
                view.setBackground(c384050F3z.LIZ(view.getContext()));
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tux://color?token=");
            sbLIZ.append(strLIZ);
            sbLIZ.append("&from=feed_fcp_standard_template");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C01GW c01gw = C2248361CzK.LIZ;
            Integer numLJ = C2248361CzK.LJ(view.getContext(), strLIZIZ);
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LIZ = numLJ;
            c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(i)));
            view.setBackground(c384050F3z2.LIZ(view.getContext()));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZJ(int i, View view) {
        if (view == null) {
            return;
        }
        if (C1865950yen.LIZ()) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.il);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(i)));
            view.setBackground(c384050F3z.LIZ(view.getContext()));
            return;
        }
        if (C1865950yen.LIZIZ()) {
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LIZIZ = Integer.valueOf(R.attr.im);
            c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(i)));
            view.setBackground(c384050F3z2.LIZ(view.getContext()));
            return;
        }
        if (!C722510SVt.LIZIZ()) {
            return;
        }
        C384050F3z c384050F3z3 = new C384050F3z();
        c384050F3z3.LIZIZ = Integer.valueOf(R.attr.ze);
        c384050F3z3.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        view.setBackground(c384050F3z3.LIZ(view.getContext()));
    }
}
