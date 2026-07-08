package X;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: X.0Wj8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC831200Wj8<T> extends AbstractC831260WjE {
    public final C835520Wq6<T> LIZIZ;

    public abstract void LJII(C831140Wj2<?> c831140Wj2);

    @Override // X.AbstractC831170Wj5
    public final void LIZ(Status status) {
        this.LIZIZ.LIZJ(new C0W4V(status));
    }

    @Override // X.AbstractC831170Wj5
    public final void LIZIZ(Exception exc) {
        this.LIZIZ.LIZJ(exc);
    }

    @Override // X.AbstractC831170Wj5
    public final void LIZJ(C831140Wj2<?> c831140Wj2) throws DeadObjectException {
        try {
            LJII(c831140Wj2);
        } catch (DeadObjectException e) {
            TryCatchGuardChecker.doCheck(e);
            LIZ(AbstractC831170Wj5.LJ(e));
            throw e;
        } catch (RemoteException e2) {
            TryCatchGuardChecker.doCheck(e2);
            LIZ(AbstractC831170Wj5.LJ(e2));
        } catch (RuntimeException e3) {
            TryCatchGuardChecker.doCheck(e3);
            this.LIZIZ.LIZJ(e3);
        }
    }

    public AbstractC831200Wj8(int i, C835520Wq6<T> c835520Wq6) {
        super(i);
        this.LIZIZ = c835520Wq6;
    }
}
