package X;

import Y.AkS329S0200000_25;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0sem, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1635300sem<DATA, CURSOR, EXTRA> extends AbstractC1639260slA<Pair<? extends Integer, ? extends CURSOR>, Pair<? extends CURSOR, ? extends Pair<? extends List<? extends DATA>, ? extends EXTRA>>> {
    public final AtomicReference<CURSOR> LIZ;
    public final Object LIZIZ = new Object();

    public abstract boolean LJ(CURSOR cursor, CURSOR cursor2);

    public AbstractC1635300sem(CURSOR cursor) {
        this.LIZ = new AtomicReference<>(cursor);
    }

    public final C19482011Jy LJFF(int i) {
        C259800zU c259800zU = new C259800zU();
        synchronized (this.LIZIZ) {
            try {
                c259800zU.element = this.LIZ.get();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C11NZ<Pair<? extends CURSOR, ? extends Pair<? extends List<? extends DATA>, ? extends EXTRA>>> c11nzRequestActual = requestActual(new Pair(Integer.valueOf(i), c259800zU.element));
        c11nzRequestActual.getClass();
        return new C19475111Hh(c11nzRequestActual).LJIL(new AkS329S0200000_25(this, c259800zU, 2));
    }
}
