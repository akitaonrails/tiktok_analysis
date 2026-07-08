package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0WDq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C819720WDq<T> implements InterfaceC819210WBr<T> {
    public static final Object LIZJ = new Object();
    public volatile InterfaceC819210WBr<T> LIZ;
    public volatile Object LIZIZ = LIZJ;

    @Override // X.InterfaceC819210WBr
    public final T get() {
        T t;
        T t2 = (T) this.LIZIZ;
        Object obj = LIZJ;
        if (t2 != obj) {
            return t2;
        }
        synchronized (this) {
            try {
                t = (T) this.LIZIZ;
                if (t == obj) {
                    t = this.LIZ.get();
                    Object obj2 = this.LIZIZ;
                    if ((obj2 != obj) && obj2 != t) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Scoped provider was invoked recursively returning different results: ");
                        sbLIZ.append(obj2);
                        sbLIZ.append(" & ");
                        sbLIZ.append(t);
                        sbLIZ.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    this.LIZIZ = t;
                    this.LIZ = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return t;
    }

    public C819720WDq(C0WE2 c0we2) {
        this.LIZ = c0we2;
    }

    public static InterfaceC819210WBr LIZ(C0WE2 c0we2) {
        if (c0we2 instanceof C819720WDq) {
            return c0we2;
        }
        return new C819720WDq(c0we2);
    }
}
