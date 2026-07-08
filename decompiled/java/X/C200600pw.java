package X;

import android.content.Context;
import android.graphics.Color;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CancellationException;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.00pw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C200600pw {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZIZ(String str) {
        String strLJJJJZ;
        if (str != null && (strLJJJJZ = a0.LJJJJZ("#", str)) != null && strLJJJJZ.length() == 8) {
            String strSubstring = strLJJJJZ.substring(0, 2);
            String strSubstring2 = strLJJJJZ.substring(2, 4);
            String strSubstring3 = strLJJJJZ.substring(4, 6);
            String strSubstring4 = strLJJJJZ.substring(6, 8);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('#');
            sbLIZ.append(strSubstring4);
            sbLIZ.append(strSubstring);
            sbLIZ.append(strSubstring2);
            sbLIZ.append(strSubstring3);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str;
    }

    public static Integer LIZJ(String str) {
        boolean z;
        Object c098200Yq;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        Object obj = null;
        if (z) {
            return null;
        }
        try {
            c098200Yq = Integer.valueOf(Color.parseColor(str));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (Integer) obj;
    }

    public static Integer LIZ(Context context, Integer num, String str, String str2) {
        Integer numLIZJ;
        Integer numLIZJ2;
        Integer numLIZJ3 = LIZJ(str);
        if (numLIZJ3 != null) {
            return numLIZJ3;
        }
        if (str2 != null && !a0.LJJJIL(str2) && (numLIZJ2 = LIZJ(str2)) != null) {
            return numLIZJ2;
        }
        if (context != null && num != null && (numLIZJ = C1308910kAL.LIZJ(num.intValue(), context)) != null) {
            return numLIZJ;
        }
        return null;
    }
}
