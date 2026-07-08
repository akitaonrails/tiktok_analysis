package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Ris, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C703640Ris extends C09AY implements Function1<Function0<? extends Unit>, Function0<? extends Unit>> {
    public final /* synthetic */ C703650Rit<T> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C703640Ris(C703650Rit<T> c703650Rit) {
        super(1);
        this.LL = c703650Rit;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Function0<? extends Unit> invoke(Function0<? extends Unit> function0) {
        Function0<Unit> function0Invoke;
        C703650Rit<T> c703650Rit = this.LL;
        synchronized (c703650Rit) {
            try {
                function0Invoke = c703650Rit.LIZ.LIZLLL().invoke(function0);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return function0Invoke;
    }
}
