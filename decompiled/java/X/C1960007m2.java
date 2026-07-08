package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.07m2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1960007m2 {
    public static long LIZ() {
        try {
            return ((Long) Class.forName("com.ss.android.agilelogger.ALog").getMethod("getALogSimpleWriteFuncAddr", new Class[0]).invoke(null, new Object[0])).longValue();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0L;
        }
    }
}
