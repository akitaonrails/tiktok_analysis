package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0tPd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1664350tPd<E> {
    public final List<E> LIZ = new ArrayList();
    public boolean LIZIZ = false;
    public List<E> LIZJ = new ArrayList();

    public final synchronized void LIZIZ() {
        this.LIZIZ = true;
        ((ArrayList) this.LIZ).clear();
    }

    public final synchronized List<E> LIZJ() {
        if (this.LIZIZ) {
            this.LIZJ = new ArrayList(((ArrayList) this.LIZ).size());
            Iterator<E> it2 = ((ArrayList) this.LIZ).iterator();
            while (it2.hasNext()) {
                this.LIZJ.add(it2.next());
            }
            this.LIZIZ = false;
        }
        return this.LIZJ;
    }

    public final synchronized boolean LIZLLL() {
        return ((ArrayList) this.LIZ).isEmpty();
    }

    public final synchronized boolean LIZ(E e) {
        if (((ArrayList) this.LIZ).contains(e)) {
            return false;
        }
        this.LIZIZ = true;
        return ((ArrayList) this.LIZ).add(e);
    }

    public final synchronized boolean LJ(E e) {
        this.LIZIZ = true;
        return ((ArrayList) this.LIZ).remove(e);
    }
}
