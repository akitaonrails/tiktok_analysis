package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: renamed from: X.0J0o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C485080J0o<Key, Value> extends AbstractC470800IdC<Key, Value> {
    public final C485140J0u<Value> LIZ;
    public final AbstractC485060J0m<Key, Value> LIZIZ;

    public C485080J0o(AbstractC485060J0m abstractC485060J0m, C1A6L c1a6l) {
        this.LIZ = new C485140J0u<>(abstractC485060J0m, 0, null, c1a6l);
        this.LIZIZ = abstractC485060J0m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC470800IdC
    public final void LIZ(Object obj, List list) {
        if (!this.LIZ.LIZ()) {
            AbstractC485060J0m<Key, Value> abstractC485060J0m = this.LIZIZ;
            synchronized (abstractC485060J0m.LIZJ) {
                try {
                    abstractC485060J0m.LJ = null;
                    abstractC485060J0m.LIZLLL = obj;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            this.LIZ.LIZIZ(new C0J10<>(list, 0));
        }
    }
}
