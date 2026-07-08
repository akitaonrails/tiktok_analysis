package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.0bqm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C989260bqm extends C989280bqo<String> {
    public static final C989260bqm LIZJ = new C989260bqm();

    public static final void LIZ(String str) {
        if (str == null) {
            return;
        }
        Iterator it2 = LIZJ.LIZ.iterator();
        while (it2.hasNext()) {
            ((InterfaceC989230bqj) it2.next()).accept(str);
        }
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) LIZJ.LIZIZ.get(str);
        if (copyOnWriteArraySet != null) {
            Iterator it3 = copyOnWriteArraySet.iterator();
            while (it3.hasNext()) {
                ((InterfaceC989230bqj) it3.next()).accept(str);
            }
        }
    }
}
