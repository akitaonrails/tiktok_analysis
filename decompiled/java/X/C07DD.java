package X;

import com.bytedance.ies.abmock.ClientExpManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.SecureRandom;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07DD, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07DD extends C09AY implements Function0<Integer> {
    public C07DD() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        Integer num;
        try {
            int iLJIJI = (!C104100aN.LIZ().LJFF() || ((double) new SecureRandom().nextFloat()) >= 0.5d) ? C0C64.LJIILLIIL().LJIJI(ClientExpManager.new_user_nonuj_feed_request_advance(), "new_user_nonuj_feed_request_advance") : 1;
            Integer numValueOf = Integer.valueOf(iLJIJI);
            C189200o6.m2constructorimpl(numValueOf);
            num = numValueOf;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            num = c098200Yq;
        }
        if (C189200o6.m5exceptionOrNullimpl(num) != null) {
            return 0;
        }
        return num;
    }
}
