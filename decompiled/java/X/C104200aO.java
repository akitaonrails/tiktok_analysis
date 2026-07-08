package X;

import android.graphics.Color;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.00aO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C104200aO {
    public static final Integer LIZ(String str) {
        boolean z;
        Object c098200Yq;
        if (a0.LJJJIL(str)) {
            z = true;
        } else {
            z = false;
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
}
