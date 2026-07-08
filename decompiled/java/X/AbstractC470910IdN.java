package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0IdN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC470910IdN<Key, Value> {
    public final AtomicBoolean LIZ = new AtomicBoolean(false);
    public final CopyOnWriteArrayList<InterfaceC470920IdO> LIZIZ = new CopyOnWriteArrayList<>();

    public abstract boolean LIZLLL();

    public void LIZJ() {
        if (this.LIZ.compareAndSet(false, true)) {
            Iterator<InterfaceC470920IdO> it2 = this.LIZIZ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ();
            }
        }
    }

    public boolean LJ() {
        return this.LIZ.get();
    }

    public void LIZIZ(InterfaceC470920IdO interfaceC470920IdO) {
        this.LIZIZ.add(interfaceC470920IdO);
    }

    public void LJFF(InterfaceC470920IdO interfaceC470920IdO) {
        this.LIZIZ.remove(interfaceC470920IdO);
    }
}
