package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.080b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20467080b {
    public static final String LIZIZ(int i) {
        Object c098200Yq;
        try {
            C844470XAv.LIZ.getClass();
            c098200Yq = C844470XAv.LIZ().getString(i);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (String) c098200Yq;
    }

    public static int LIZ(Context context, int i) {
        Integer numLIZJ = C1308910kAL.LIZJ(i, C1385040m98.LIZ(context, false));
        if (numLIZJ != null) {
            return numLIZJ.intValue();
        }
        return -1;
    }
}
