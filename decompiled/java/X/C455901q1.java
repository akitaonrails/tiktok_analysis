package X;

import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.01q1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C455901q1 {
    public static final void LIZ(String str, String str2) {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf(Log.d(str, str2));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('[');
            sbLIZ.append(str);
            sbLIZ.append("] ");
            sbLIZ.append(str2);
            System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
