package X;

import android.graphics.drawable.Drawable;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0vsT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1759110vsT {
    public static String LIZIZ(String str) {
        String encodedPath;
        String strLJJIII = "pdp_preview";
        if (str == null) {
            return "pdp_preview";
        }
        try {
            int iLJJIZ = a0.LJJIZ(str, '~', 0, false, 6);
            if (iLJJIZ != -1) {
                str = str.substring(0, iLJJIZ);
            }
            encodedPath = UriProtector.parse(str).getEncodedPath();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (encodedPath != null) {
            strLJJIII = u.LJJIII(encodedPath, "/", "", false);
            if (strLJJIII != null) {
                return strLJJIII;
            }
        }
        return "";
    }

    public static Pair LIZ(String str, String str2) {
        boolean z;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        C01GW c01gw = C1066190dqr.LIZ;
        Drawable drawableLJIIIIZZ = C1066190dqr.LJIIIIZZ(str, LIZIZ(str2));
        if (drawableLJIIIIZZ == null) {
            return null;
        }
        return new Pair(Integer.valueOf(drawableLJIIIIZZ.getIntrinsicWidth()), Integer.valueOf(drawableLJIIIIZZ.getIntrinsicHeight()));
    }
}
