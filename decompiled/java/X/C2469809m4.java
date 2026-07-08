package X;

import android.graphics.Color;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.09m4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2469809m4 {
    public static final Integer LIZ(String str) {
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
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (Integer) obj;
    }

    public static final String LIZJ(String str) {
        Object c098200Yq;
        String strLJLJLJ;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
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
            strLJLJLJ = C13LN.LJLJLJ(1, str);
        } else {
            strLJLJLJ = str;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(C13LN.LL(2, strLJLJLJ));
        sbLIZ2.append(C13LN.LJLL(2, strLJLJLJ));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append('#');
        sbLIZ3.append(strLIZIZ);
        c098200Yq = C2188811AlT.LIZIZ(sbLIZ3);
        C189200o6.m2constructorimpl(c098200Yq);
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str2 = (String) c098200Yq;
        if (str2 != null) {
            return str2;
        }
        return str;
    }

    public static final void LIZIZ(View view, String str) {
        if (str.length() == 9 && str.charAt(0) == '#') {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('#');
            sbLIZ.append(str.substring(7));
            sbLIZ.append(str.substring(1, 7));
            str = C2188811AlT.LIZIZ(sbLIZ);
        }
        if (str.charAt(0) != '#') {
            return;
        }
        if (str.length() == 4) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append('#');
            sbLIZ2.append(str.charAt(1));
            sbLIZ2.append(str.charAt(1));
            sbLIZ2.append(str.charAt(2));
            sbLIZ2.append(str.charAt(2));
            sbLIZ2.append(str.charAt(3));
            sbLIZ2.append(str.charAt(3));
            str = C2188811AlT.LIZIZ(sbLIZ2);
        }
        Integer numLIZ = LIZ(str);
        if (numLIZ != null) {
            view.setBackgroundColor(numLIZ.intValue());
        }
    }
}
