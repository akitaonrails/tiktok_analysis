package X;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.182B, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C182B {
    public final ArrayList<C182C> LIZ = new ArrayList<>();

    public final void LIZIZ() {
        Iterator<C182C> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().destroy();
        }
    }

    public final void LIZ(C182C c182c) {
        this.LIZ.add(c182c);
    }
}
