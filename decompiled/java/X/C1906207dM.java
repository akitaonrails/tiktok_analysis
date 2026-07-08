package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.07dM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1906207dM {
    public static final C1906207dM LIZ = new C1906207dM();

    public static boolean LIZ(String str, String str2) {
        if (str != null && !a0.LJJJIL(str) && str2 != null && !a0.LJJJIL(str2)) {
            try {
                str.toString();
                str2.toString();
                return u.LJIIZILJ(str, str2, false);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        return false;
    }
}
