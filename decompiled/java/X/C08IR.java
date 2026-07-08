package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.08IR, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08IR {
    public static final <K, V> V LIZ(C603820NmG<K, V> c603820NmG, K k) {
        if (k == null) {
            return null;
        }
        try {
            return c603820NmG.LIZJ(k);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }
}
