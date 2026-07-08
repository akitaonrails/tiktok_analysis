package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.13EZ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13EZ<K, V> extends AbstractC19977113Ej {
    public InterfaceC19973113Cv<K, ? extends V> LIZJ;
    public int LIZLLL;

    @Override // X.AbstractC19977113Ej
    public final AbstractC19977113Ej LIZIZ() {
        return new C13EZ(C13YE.LJIIIZ().LJI(), this.LIZJ);
    }

    @Override // X.AbstractC19977113Ej
    public final void LIZ(AbstractC19977113Ej abstractC19977113Ej) {
        C13EZ c13ez = (C13EZ) abstractC19977113Ej;
        synchronized (C19977013Ei.LIZ) {
            try {
                this.LIZJ = c13ez.LIZJ;
                this.LIZLLL = c13ez.LIZLLL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.AbstractC19977113Ej
    public final AbstractC19977113Ej LIZJ(long j) {
        return new C13EZ(j, this.LIZJ);
    }

    public C13EZ(long j, InterfaceC19973113Cv<K, ? extends V> interfaceC19973113Cv) {
        super(j);
        this.LIZJ = interfaceC19973113Cv;
    }
}
