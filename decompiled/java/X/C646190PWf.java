package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0PWf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C646190PWf<E> {
    public boolean LIZIZ;
    public final List<E> LIZ = new ArrayList();
    public List<E> LIZJ = new ArrayList();

    public final synchronized List<E> LIZ() {
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
}
