package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;

/* JADX INFO: renamed from: X.17vw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21188617vw {
    public static C21188517vv LIZ(String str) {
        HashMap<String, C21188517vv> map;
        C21188517vv c21188517vv;
        Object obj = C21188517vv.LJFF;
        synchronized (obj) {
            try {
                map = C21188517vv.LJ;
                c21188517vv = map.get(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (c21188517vv != null) {
            return c21188517vv;
        }
        synchronized (obj) {
            try {
                C21188517vv c21188517vv2 = map.get(str);
                if (c21188517vv2 != null) {
                    return c21188517vv2;
                }
                C21188517vv c21188517vv3 = new C21188517vv(str);
                map.put(str, c21188517vv3);
                return c21188517vv3;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }
}
