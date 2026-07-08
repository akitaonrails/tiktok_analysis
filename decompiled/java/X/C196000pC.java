package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.Locale;
import kotlin.text.Regex;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.00pC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C196000pC {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str, List list) {
        boolean z;
        List listLJJLIIIJILLIZJL;
        int size;
        boolean z2 = false;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        try {
            if (!new Regex("^\\d+\\.\\d+\\.\\d+\\.\\d+$").matches(str) && (size = (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{e3.d}, 0, 6)).size()) >= 3) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                int i = size - 2;
                sbLIZ.append((String) listLJJLIIIJILLIZJL.get(i));
                sbLIZ.append('.');
                int i2 = size - 1;
                sbLIZ.append((String) listLJJLIIIJILLIZJL.get(i2));
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                if (list != null && list.contains(strLIZIZ.toLowerCase(Locale.ROOT))) {
                    z2 = true;
                }
                if (z2) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append((String) listLJJLIIIJILLIZJL.get(size - 3));
                    sbLIZ2.append('.');
                    sbLIZ2.append(strLIZIZ);
                    return C2188811AlT.LIZIZ(sbLIZ2);
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append((String) listLJJLIIIJILLIZJL.get(i));
                sbLIZ3.append('.');
                sbLIZ3.append((String) listLJJLIIIJILLIZJL.get(i2));
                return C2188811AlT.LIZIZ(sbLIZ3);
            }
            return str;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return str;
        }
    }
}
