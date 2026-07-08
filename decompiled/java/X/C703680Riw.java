package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: X.0Riw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C703680Riw<T> extends C09AY implements Function0<T> {
    public final /* synthetic */ C703650Rit<T> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C703680Riw(C703650Rit<T> c703650Rit) {
        super(0);
        this.LL = c703650Rit;
    }

    @Override // kotlin.jvm.functions.Function0
    public final T invoke() {
        T tInvoke;
        C703650Rit<T> c703650Rit = this.LL;
        synchronized (c703650Rit) {
            try {
                tInvoke = c703650Rit.LIZ.LJ().invoke();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return tInvoke;
    }
}
