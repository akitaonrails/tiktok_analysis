package X;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0IMU, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public abstract class C0IMU<T> {
    public T LIZIZ;
    public final List<WeakReference<C0IMT<T>>> LIZ = new ArrayList();
    public final boolean LIZJ = true;

    public final void LIZ(C0IMT<T> c0imt) {
        if (c0imt == null) {
            return;
        }
        Iterator it2 = ((ArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            Reference reference = (Reference) it2.next();
            if (reference.get() == null) {
                it2.remove();
            } else if (reference.get() == c0imt) {
                return;
            }
        }
        ((ArrayList) this.LIZ).add(new WeakReference(c0imt));
        if (this.LIZJ) {
            c0imt.onChanged(this.LIZIZ);
        }
    }

    public final void LIZIZ(T t) {
        if (t == this.LIZIZ) {
            return;
        }
        this.LIZIZ = t;
        Iterator it2 = ((ArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            Reference reference = (Reference) it2.next();
            if (reference.get() == null) {
                it2.remove();
            } else {
                ((C0IMT) reference.get()).onChanged(this.LIZIZ);
            }
        }
    }

    public final void LIZJ(C0IMT<T> c0imt) {
        Iterator it2 = ((ArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            Reference reference = (Reference) it2.next();
            if (reference.get() == null) {
                it2.remove();
            } else if (reference.get() == c0imt) {
                it2.remove();
                return;
            }
        }
    }
}
