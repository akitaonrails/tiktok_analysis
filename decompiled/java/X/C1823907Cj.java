package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07Cj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1823907Cj extends C09AY implements Function0<Boolean> {
    public C1823907Cj() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        Boolean bool;
        try {
            C1824107Cl.LIZ.getClass();
            Boolean boolValueOf = Boolean.valueOf((((Number) C1824107Cl.LIZIZ.getValue()).intValue() & 2) == 2);
            C189200o6.m2constructorimpl(boolValueOf);
            bool = boolValueOf;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            bool = c098200Yq;
        }
        return C189200o6.m5exceptionOrNullimpl(bool) != null ? Boolean.FALSE : bool;
    }
}
