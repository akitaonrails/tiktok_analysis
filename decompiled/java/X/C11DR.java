package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.11DR, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11DR<T> {
    public final InterfaceC1891370zJn LIZ;
    public final C11DU<T> LIZIZ;
    public final C11DQ LIZJ;
    public final Executor LIZLLL;
    public int LJ;
    public List<? extends T> LJFF;

    public final T LIZ(int i, boolean z) {
        C11DQ c11dq;
        List<? extends T> list = this.LJFF;
        if (i < list.size() && i >= 0) {
            if (z && (c11dq = this.LIZJ) != null && c11dq.LIZIZ) {
                c11dq.LIZ.W30(c11dq.LIZJ + i);
            }
            return (T) ListProtector.get(list, i);
        }
        return null;
    }

    public C11DR(InterfaceC1891370zJn interfaceC1891370zJn, C11DU<T> c11du, C11DQ c11dq) {
        this.LIZ = interfaceC1891370zJn;
        this.LIZIZ = c11du;
        this.LIZJ = c11dq;
        Executor executor = c11du.LIZIZ;
        this.LIZLLL = executor == null ? new Executor() { // from class: X.05g0
            public final BPEAHandler LL = new BPEAHandler(Looper.getMainLooper());

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                C786410Ut5.LJJZZIII(this.LL, runnable);
            }
        } : executor;
        this.LJFF = C13BV.INSTANCE;
    }
}
