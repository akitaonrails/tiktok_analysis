package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.04qo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1225204qo {
    public static final int LIZ;

    static {
        Object c098200Yq;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            c098200Yq = property != null ? C2095008Iq.LJIIJJI(property) : null;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Integer num = (Integer) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
        LIZ = num != null ? num.intValue() : 2097152;
    }
}
