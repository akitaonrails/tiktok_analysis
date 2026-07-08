package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0tOD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1663470tOD<T> implements InterfaceC608270NtR<Object, T> {
    public Function0<? extends T> LL;
    public volatile Object LLILLJJLI = C1663480tOE.LIZ;

    public C1663470tOD(Function0<? extends T> function0) {
        this.LL = function0;
    }

    @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
    public final T getValue(Object obj, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
        T tInvoke;
        T t = (T) this.LLILLJJLI;
        C1663480tOE c1663480tOE = C1663480tOE.LIZ;
        if (t != c1663480tOE) {
            return t;
        }
        synchronized (this) {
            try {
                tInvoke = (T) this.LLILLJJLI;
                if (tInvoke == c1663480tOE) {
                    tInvoke = this.LL.invoke();
                    this.LLILLJJLI = tInvoke;
                    this.LL = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return tInvoke;
    }

    @Override // X.InterfaceC608270NtR
    public final void setValue(Object obj, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, T t) {
        this.LLILLJJLI = t;
    }
}
