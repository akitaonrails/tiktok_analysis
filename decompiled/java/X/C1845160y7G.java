package X;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0y7G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1845160y7G {
    public String LIZ;
    public WeakReference<View> LIZIZ;
    public int[] LIZJ;
    public final List<C1845160y7G> LIZLLL = new ArrayList();

    public final String toString() {
        if (!C1847960yBm.LJIIIIZZ) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder("\n [");
        C13E8 c13e8 = new C13E8();
        c13e8.addFirst(this);
        int size = 1;
        while (!c13e8.isEmpty()) {
            C1845160y7G c1845160y7G = (C1845160y7G) c13e8.removeLast();
            size--;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("\n  oid: ");
            sbLIZ.append(c1845160y7G.LIZ);
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
            Iterator it2 = ((ArrayList) c1845160y7G.LIZLLL).iterator();
            while (it2.hasNext()) {
                c13e8.addFirst(it2.next());
            }
            if (size == 0) {
                size = c13e8.size();
                sb.append("\n ]");
                if (size > 0) {
                    sb.append("\n [");
                }
            }
        }
        return sb.toString();
    }
}
