package X;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS252S0000000_16;

/* JADX INFO: renamed from: X.0dI5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1044630dI5 {
    public final Map<Integer, C1044640dI6> LIZ = new LinkedHashMap();
    public final Map<Integer, Set<WeakReference<AbstractC1044720dIE>>> LIZIZ = new LinkedHashMap();

    public final void LIZ() {
        Iterator it2 = ((LinkedHashMap) this.LIZ).values().iterator();
        while (it2.hasNext()) {
            ((C1044640dI6) it2.next()).LIZJ = 0;
        }
    }

    public final void LIZIZ(int i, C1044640dI6 c1044640dI6) {
        Set set = (Set) ((LinkedHashMap) this.LIZIZ).get(Integer.valueOf(i));
        if (set == null) {
            return;
        }
        C19719612Di.LJJIII(set, AFwS252S0000000_16.get$arr$(375), true);
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            AbstractC1044720dIE abstractC1044720dIE = (AbstractC1044720dIE) ((Reference) it2.next()).get();
            if (abstractC1044720dIE != null) {
                abstractC1044720dIE.LJIILL = c1044640dI6.LIZJ;
                if (abstractC1044720dIE instanceof C1044660dI8) {
                    C1044660dI8 c1044660dI8 = (C1044660dI8) abstractC1044720dIE;
                    c1044660dI8.LJJ = c1044640dI6.LIZ;
                    c1044660dI8.LJJI = c1044640dI6.LIZIZ;
                }
            }
        }
        if (set.isEmpty()) {
            this.LIZIZ.remove(Integer.valueOf(i));
        }
    }
}
