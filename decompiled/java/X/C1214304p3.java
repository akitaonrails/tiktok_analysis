package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04p3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1214304p3 extends C09AY implements Function0<Boolean> {
    public C1214304p3() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        Boolean bool;
        try {
            Boolean boolValueOf = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIIZZ(31744, 2, "bootfinish_thread_bind_little_core", true, false));
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
