package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0J0m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC485060J0m<Key, Value> extends AbstractC485110J0r<Key, Value> {
    public final Object LIZJ = new Object();
    public Key LIZLLL = null;
    public Key LJ = null;

    @Override // X.AbstractC485110J0r
    public final Object LJIIIZ(int i) {
        return null;
    }

    public abstract void LJIIJ(C471830Ier<Key> c471830Ier, AbstractC470790IdB<Key, Value> abstractC470790IdB);

    public abstract void LJIIJJI(C485090J0p c485090J0p);

    public abstract void LJIIL(C485050J0l<Key> c485050J0l, AbstractC470800IdC<Key, Value> abstractC470800IdC);

    public final void LJIILIIL(Key key) {
        synchronized (this.LIZJ) {
            try {
                this.LIZLLL = key;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.AbstractC485110J0r
    public final void LJI(int i, int i2, Executor executor, C1A6L c1a6l) {
        Key key;
        synchronized (this.LIZJ) {
            try {
                key = this.LIZLLL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (key != null) {
            LJIIJ(new C471830Ier<>(i2, key), new C485090J0p(this, 1, executor, c1a6l));
        } else {
            c1a6l.LIZ(1, C0J10.LJ);
        }
    }

    @Override // X.AbstractC485110J0r
    public final void LJII(int i, int i2, Executor executor, C1A6L c1a6l) {
        Key key;
        synchronized (this.LIZJ) {
            try {
                key = this.LJ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (key != null) {
            LJIIJJI(new C485090J0p(this, 2, executor, c1a6l));
        } else {
            c1a6l.LIZ(2, C0J10.LJ);
        }
    }

    @Override // X.AbstractC485110J0r
    public final void LJIIIIZZ(Object obj, int i, int i2, boolean z, Executor executor, C1A6L c1a6l) {
        C485080J0o c485080J0o = new C485080J0o(this, c1a6l);
        LJIIL(new C485050J0l<>(i), c485080J0o);
        C485140J0u<Value> c485140J0u = c485080J0o.LIZ;
        synchronized (c485140J0u.LIZLLL) {
            try {
                c485140J0u.LJ = executor;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
