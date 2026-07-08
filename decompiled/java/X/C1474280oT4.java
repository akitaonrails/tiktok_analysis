package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0oT4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1474280oT4 {
    public List<Runnable> LIZ;
    public boolean LIZIZ;

    public final void LIZIZ() {
        if (this.LIZIZ || LIZJ()) {
            return;
        }
        this.LIZIZ = true;
        Iterator it2 = new ArrayList(this.LIZ).iterator();
        while (it2.hasNext()) {
            ((Runnable) it2.next()).run();
        }
        ((ArrayList) this.LIZ).clear();
        this.LIZIZ = false;
    }

    public final boolean LIZJ() {
        List<Runnable> list = this.LIZ;
        return list == null || ((ArrayList) list).isEmpty();
    }

    public final void LIZ() {
        if (LIZJ()) {
            return;
        }
        ((ArrayList) this.LIZ).clear();
    }
}
