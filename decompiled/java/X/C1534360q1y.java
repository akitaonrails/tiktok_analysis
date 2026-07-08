package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0q1y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1534360q1y<T> {
    public final AbstractC1534220q1k<T> LIZ;
    public final AtomicBoolean LIZIZ;
    public final Class<T> LIZJ;

    public final void LIZIZ() {
        AtomicBoolean atomicBoolean = this.LIZIZ;
        if (atomicBoolean == null || !atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        try {
            this.LIZ.LIZJ();
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final String toString() {
        return this.LIZ.toString();
    }

    public C1534360q1y(AbstractC1534220q1k<T> abstractC1534220q1k, boolean z) {
        AtomicBoolean atomicBoolean;
        this.LIZ = abstractC1534220q1k;
        if (z) {
            atomicBoolean = new AtomicBoolean(false);
        } else {
            atomicBoolean = null;
        }
        this.LIZIZ = atomicBoolean;
        this.LIZJ = abstractC1534220q1k.LIZ;
    }

    public static AbstractC1534220q1k LIZ(C1534360q1y c1534360q1y, C1533790q13 c1533790q13, boolean z, int i) {
        boolean z2;
        InterfaceC1535280q3S interfaceC1535280q3S;
        AtomicBoolean atomicBoolean;
        if ((i & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (((i & 4) == 0 && z) || (((interfaceC1535280q3S = c1534360q1y.LIZ.LIZJ) != null && !interfaceC1535280q3S.LIZ(c1533790q13)) || (atomicBoolean = c1534360q1y.LIZIZ) == null || !atomicBoolean.compareAndSet(false, true))) {
            return c1534360q1y.LIZ.LIZLLL(c1533790q13, z2);
        }
        return c1534360q1y.LIZ;
    }
}
