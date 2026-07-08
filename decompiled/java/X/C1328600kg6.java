package X;

import android.util.Pair;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0kg6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1328600kg6<T> implements InterfaceC1327390ke9<T> {
    public final InterfaceC1327390ke9<T> LIZ;
    public int LIZIZ;
    public final ConcurrentLinkedQueue<Pair<InterfaceC1328020kfA<T>, InterfaceC1327930kf1>> LIZJ;
    public final Executor LIZLLL;

    public C1328600kg6(Executor executor, InterfaceC1327390ke9 interfaceC1327390ke9) {
        executor.getClass();
        this.LIZLLL = executor;
        this.LIZ = interfaceC1327390ke9;
        this.LIZJ = new ConcurrentLinkedQueue<>();
        this.LIZIZ = 0;
    }

    @Override // X.InterfaceC1327390ke9
    public final void LIZIZ(InterfaceC1328020kfA<T> interfaceC1328020kfA, InterfaceC1327930kf1 interfaceC1327930kf1) {
        boolean z;
        interfaceC1327930kf1.LIZ().LJI(interfaceC1327930kf1.getId(), "ThrottlingProducer");
        synchronized (this) {
            try {
                int i = this.LIZIZ;
                z = true;
                if (i >= 5) {
                    this.LIZJ.add(Pair.create(interfaceC1328020kfA, interfaceC1327930kf1));
                } else {
                    this.LIZIZ = i + 1;
                    z = false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (!z) {
            interfaceC1327930kf1.LIZ().LIZIZ(interfaceC1327930kf1.getId(), "ThrottlingProducer", null);
            this.LIZ.LIZIZ(new C1328660kgC(this, interfaceC1328020kfA), interfaceC1327930kf1);
        }
    }
}
