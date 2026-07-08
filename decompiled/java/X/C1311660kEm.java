package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kEm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1311660kEm extends C09AY implements Function0<Boolean> {
    public C1311660kEm() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        Object c098200Yq;
        try {
            Object objLIZIZ = C1535630q41.LIZIZ("enable_optimize_init_lock");
            c098200Yq = objLIZIZ instanceof Boolean ? (Boolean) objLIZIZ : null;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = (Boolean) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
        return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
    }
}
