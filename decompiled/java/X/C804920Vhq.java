package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Vhq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C804920Vhq extends C09AY implements Function0<Unit> {
    public C804920Vhq() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() throws Throwable {
        long j;
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            C804900Vho.LIZ.getClass();
            C804950Vht.LIZ.getClass();
            try {
                j = C804950Vht.LIZ().getLong("key_following_frequent_user_request_time", 0L);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C098200Yq c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    int i = C2187451AjH.LIZ;
                    C1720106oR.LIZIZ("FollowingKevaStorage", "getFollowingFrequentUserRequestTime error", thM5exceptionOrNullimpl);
                }
            }
            if (j <= 0 || System.currentTimeMillis() - j > ((Number) C2277061EAu.LIZLLL.getValue()).intValue()) {
                C23250099c.LJ(C23271099x.INSTANCE, new C804910Vhp(null));
            } else {
                C0VLY c0vlyLIZIZ = C804900Vho.LIZIZ();
                if (c0vlyLIZIZ != null) {
                    c0vlyLIZIZ.hashCode();
                }
                C804900Vho.LIZLLL = true;
            }
        }
        return Unit.LIZ;
    }
}
