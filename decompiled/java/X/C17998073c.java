package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.073c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C17998073c extends C09AY implements Function0<Integer> {
    public C17998073c() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        Object c098200Yq;
        C1785306yx c1785306yx = (C1785306yx) C1782306yT.LIZ.getValue();
        AFwS189S0000000_3 aFwS189S0000000_3 = AFwS189S0000000_3.get$arr$(1768);
        c1785306yx.getClass();
        try {
            c098200Yq = Integer.valueOf(C104100aN.LIZ().LJFF() ? ((double) ((Number) c1785306yx.LIZ.getValue()).floatValue()) < 0.5d ? 1 : 0 : ((Number) aFwS189S0000000_3.invoke()).intValue());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = 0;
        }
        return Integer.valueOf(((Number) c098200Yq).intValue());
    }
}
