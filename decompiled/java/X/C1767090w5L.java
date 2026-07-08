package X;

import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0w5L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1767090w5L {
    public static final C1767090w5L LIZ = new C1767090w5L();

    public static void LIZ(Intent intent, Object obj) {
        try {
            if (C1767060w5I.LIZIZ) {
                if (intent == null || !intent.getBooleanExtra("ttbtm_handled", false)) {
                    LIZIZ(intent, obj);
                    if (intent != null) {
                        intent.putExtra("ttbtm_handled", true);
                    }
                }
            } else {
                LIZIZ(intent, obj);
            }
            C2211621BhA.LIZ.getClass();
            C2211621BhA.LJ = null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2211621BhA.LIZ.getClass();
            C2211621BhA.LJ = null;
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0009, code lost:
    
        if (r8 != null) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(android.content.Intent r7, java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1767090w5L.LIZIZ(android.content.Intent, java.lang.Object):void");
    }
}
