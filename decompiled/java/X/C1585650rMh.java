package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rMh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1585650rMh<R, T> implements InterfaceC608270NtR<R, T> {
    public static final Object LLILZ = new Object();
    public final Function0<T> LL;
    public Object LLILLJJLI = LLILZ;
    public final Object LLILLL = new Object();

    public C1585650rMh(C1585430rML c1585430rML) {
        this.LL = c1585430rML;
    }

    @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
    public final T getValue(R r, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
        Object obj = this.LLILLJJLI;
        Object obj2 = LLILZ;
        if (Intrinsics.LJFF(obj, obj2)) {
            synchronized (this.LLILLL) {
                try {
                    if (Intrinsics.LJFF(this.LLILLJJLI, obj2)) {
                        this.LLILLJJLI = this.LL.invoke();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return (T) this.LLILLJJLI;
    }

    @Override // X.InterfaceC608270NtR
    public final void setValue(R r, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, T t) {
        synchronized (this.LLILLL) {
            try {
                this.LLILLJJLI = t;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
