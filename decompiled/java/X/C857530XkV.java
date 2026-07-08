package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0XkV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C857530XkV<METADATA> {
    public final CharSequence LIZ;
    public final List<AbstractC858320Xlm<METADATA>> LIZIZ;

    public final List<METADATA> LIZ() {
        List<AbstractC858320Xlm<METADATA>> list = this.LIZIZ;
        ArrayList arrayList = new ArrayList();
        Iterator<AbstractC858320Xlm<METADATA>> it2 = list.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(it2.next().LJI(), arrayList);
        }
        return arrayList;
    }

    public final String LIZIZ() {
        List<AbstractC858320Xlm<METADATA>> list = this.LIZIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<AbstractC858320Xlm<METADATA>> it2 = list.iterator();
        int i = 0;
        while (true) {
            Object next = null;
            if (!it2.hasNext()) {
                Iterator it3 = arrayList.iterator();
                if (it3.hasNext()) {
                    next = it3.next();
                    while (it3.hasNext()) {
                        String str = (String) it3.next();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append((String) next);
                        sbLIZ.append(str);
                        next = C2188811AlT.LIZIZ(sbLIZ);
                    }
                }
                String str2 = (String) next;
                return str2 == null ? "" : str2;
            }
            AbstractC858320Xlm<METADATA> next2 = it2.next();
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            arrayList.add(next2.LJIILL(this.LIZ));
            i = i2;
        }
    }

    public C857530XkV(CharSequence charSequence, C13E8 c13e8) {
        this.LIZ = charSequence;
        this.LIZIZ = c13e8;
    }
}
