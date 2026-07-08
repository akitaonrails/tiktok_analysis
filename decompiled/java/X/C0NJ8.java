package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0NJ8, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NJ8<T> implements InterfaceC608270NtR<Object, T> {
    public final C0NJE LL;
    public final String LLILLJJLI;

    public C0NJ8(C0NJE c0nje, String str) {
        this.LL = c0nje;
        this.LLILLJJLI = str;
    }

    @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
    public final T getValue(Object obj, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
        T t = null;
        try {
            t = (T) C23250099c.LJ(C23271099x.INSTANCE, new C0NJ6(this, null));
            return t;
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            return t;
        }
    }

    @Override // X.InterfaceC608270NtR
    public final void setValue(Object obj, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, T t) throws Throwable {
        try {
            C23250099c.LJ(C23271099x.INSTANCE, new C0NJ7(this, t, null));
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
    }
}
