package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0ZKf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C897870ZKf<E> {
    public final List<E> LIZ = new ArrayList();
    public boolean LIZIZ = false;
    public List<E> LIZJ = new ArrayList();

    public final synchronized List<E> LIZIZ() {
        if (this.LIZIZ) {
            this.LIZJ = new ArrayList(((ArrayList) this.LIZ).size());
            Iterator<E> it2 = ((ArrayList) this.LIZ).iterator();
            while (it2.hasNext()) {
                ((ArrayList) this.LIZJ).add(it2.next());
            }
            this.LIZIZ = false;
        }
        return this.LIZJ;
    }

    public final synchronized void LIZ(Object obj) {
        if (((ArrayList) this.LIZ).contains(obj)) {
            return;
        }
        this.LIZIZ = true;
        ((ArrayList) this.LIZ).add(obj);
    }
}
