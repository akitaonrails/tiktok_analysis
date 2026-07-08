package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0J0p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C485090J0p<Key, Value> extends AbstractC470790IdB<Key, Value> {
    public final C485140J0u<Value> LIZ;
    public final AbstractC485060J0m<Key, Value> LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC470790IdB
    public final void LIZ(Object obj, List list) {
        if (!this.LIZ.LIZ()) {
            if (this.LIZ.LIZ == 1) {
                this.LIZIZ.LJIILIIL(obj);
            } else {
                AbstractC485060J0m<Key, Value> abstractC485060J0m = this.LIZIZ;
                synchronized (abstractC485060J0m.LIZJ) {
                    try {
                        abstractC485060J0m.LJ = obj;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            this.LIZ.LIZIZ(new C0J10<>(list, 0));
        }
    }

    public C485090J0p(AbstractC485060J0m abstractC485060J0m, int i, Executor executor, C1A6L c1a6l) {
        this.LIZ = new C485140J0u<>(abstractC485060J0m, i, executor, c1a6l);
        this.LIZIZ = abstractC485060J0m;
    }
}
