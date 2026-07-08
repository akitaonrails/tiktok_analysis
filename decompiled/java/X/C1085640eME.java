package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0eME, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1085640eME<T> extends C1085650eMF<T> {
    public final Object LIZJ;

    @Override // X.C1085650eMF, X.InterfaceC20015613Te
    public final T LIZIZ() {
        T t;
        synchronized (this.LIZJ) {
            try {
                t = (T) super.LIZIZ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return t;
    }

    public C1085640eME(int i) {
        super(i);
        this.LIZJ = new Object();
    }

    @Override // X.C1085650eMF, X.InterfaceC20015613Te
    public final boolean LIZ(T t) {
        boolean zLIZ;
        synchronized (this.LIZJ) {
            try {
                zLIZ = super.LIZ(t);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return zLIZ;
    }
}
