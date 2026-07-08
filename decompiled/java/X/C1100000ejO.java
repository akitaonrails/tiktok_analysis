package X;

import android.content.Context;
import android.graphics.Color;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0ejO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1100000ejO {
    public static Context LIZ;

    public static int LIZ(String str) {
        try {
            return Color.parseColor(str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return 0;
        }
    }

    public static String LIZIZ(String str) {
        try {
            if (str.length() != 8 && str.length() != 9) {
                if (str.length() == 6) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('#');
                    sbLIZ.append(str);
                    return C2188811AlT.LIZIZ(sbLIZ);
                }
                return str;
            }
            if (u.LJJIIJZLJL(str, "#", false)) {
                str = C13LN.LJLJLJ(1, str);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(C13LN.LL(2, str));
            sbLIZ2.append(C13LN.LJLL(2, str));
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append('#');
            sbLIZ3.append(strLIZIZ);
            return C2188811AlT.LIZIZ(sbLIZ3);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return "#00000000";
        }
    }
}
