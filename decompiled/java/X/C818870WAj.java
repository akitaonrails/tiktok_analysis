package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0WAj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C818870WAj<T> implements InterfaceC812380Vts<T> {
    public static final Object LIZJ = new Object();
    public volatile Object LIZ = LIZJ;
    public volatile InterfaceC812380Vts<T> LIZIZ;

    @Override // X.InterfaceC812380Vts
    public final T get() {
        T t;
        T t2 = (T) this.LIZ;
        Object obj = LIZJ;
        if (t2 != obj) {
            return t2;
        }
        synchronized (this) {
            try {
                t = (T) this.LIZ;
                if (t == obj) {
                    t = this.LIZIZ.get();
                    this.LIZ = t;
                    this.LIZIZ = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return t;
    }

    public C818870WAj(InterfaceC812380Vts<T> interfaceC812380Vts) {
        this.LIZIZ = interfaceC812380Vts;
    }
}
