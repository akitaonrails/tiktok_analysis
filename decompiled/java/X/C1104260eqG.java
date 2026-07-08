package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0eqG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1104260eqG extends C09AY implements Function0<Boolean> {
    public C1104260eqG() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        Object c098200Yq;
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        try {
            Object objLIZIZ = C1535630q41.LIZIZ("spark_iab_optimize_pia");
            c098200Yq = objLIZIZ instanceof Boolean ? (Boolean) objLIZIZ : null;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = bool;
        }
        Boolean bool2 = (Boolean) c098200Yq;
        return Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false);
    }
}
