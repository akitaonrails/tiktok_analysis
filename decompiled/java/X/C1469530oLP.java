package X;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0oLP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1469530oLP<T> {
    public final List<T> LL = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(InterfaceC989230bqj<T> interfaceC989230bqj) {
        for (Object obj : (CopyOnWriteArrayList) this.LL) {
            if (obj != null) {
                interfaceC989230bqj.accept(obj);
            }
        }
    }

    public final void LIZLLL(T t) {
        if (t == null || ((CopyOnWriteArrayList) this.LL).contains(t)) {
            return;
        }
        ((CopyOnWriteArrayList) this.LL).add(t);
    }
}
