package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04pc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1217804pc extends C09AY implements Function0<Integer> {
    public C1217804pc() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        Object obj;
        try {
            Integer numValueOf = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "assem_lifecycle_callback_scatter_experiment", true));
            C189200o6.m2constructorimpl(numValueOf);
            obj = numValueOf;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj);
        Integer num = obj;
        if (thM5exceptionOrNullimpl != null) {
            num = 0;
        }
        num.intValue();
        return num;
    }
}
