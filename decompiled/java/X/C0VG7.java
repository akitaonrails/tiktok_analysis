package X;

import Y.ARunnableS82S0200000_13;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0VG7, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public abstract class C0VG7<T> {
    public final InterfaceC787600Uv0 LIZ;
    public final Context LIZIZ;
    public final Object LIZJ = new Object();
    public final Set<InterfaceC789890Uyh<T>> LIZLLL = new LinkedHashSet();
    public T LJ;

    public abstract T LIZ();

    public abstract void LIZLLL();

    public abstract void LJ();

    static {
        C0VI8.LIZIZ("ConstraintTracker");
    }

    public final void LIZIZ(C0VGW c0vgw) {
        synchronized (this.LIZJ) {
            try {
                if (this.LIZLLL.remove(c0vgw) && this.LIZLLL.isEmpty()) {
                    LJ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZJ(T t) {
        synchronized (this.LIZJ) {
            try {
                T t2 = this.LJ;
                if (t2 == t || (t2 != null && t2.equals(t))) {
                    return;
                }
                this.LJ = t;
                ((C0VG9) this.LIZ).LIZJ.execute(new ARunnableS82S0200000_13(this, new ArrayList(this.LIZLLL), 73));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C0VG7(Context context, InterfaceC787600Uv0 interfaceC787600Uv0) {
        this.LIZIZ = C786410Ut5.N3(context);
        this.LIZ = interfaceC787600Uv0;
    }
}
