package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04rh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1230704rh extends C09AY implements Function0<Long> {
    public C1230704rh() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        Long l;
        try {
            Long lValueOf = Long.valueOf(C0C64.LJIILLIIL().LJIJJ(31744, 2, true, "downgrade_ability_merge_threshold", 0L));
            C189200o6.m2constructorimpl(lValueOf);
            l = lValueOf;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            l = c098200Yq;
        }
        if (C189200o6.m5exceptionOrNullimpl(l) != null) {
            return 0L;
        }
        return l;
    }
}
