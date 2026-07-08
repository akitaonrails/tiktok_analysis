package X;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0L8l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C538090L8l {
    public final C538080L8k LIZ;
    public final C0FQT LIZIZ;
    public InterfaceC538100L8m LIZJ;

    public final C0FQT LIZJ() {
        C0FQT c0fqt = this.LIZIZ;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LIZLLL(c0fqt, linkedHashSet);
        this.LIZIZ.LJIIIZ = linkedHashSet;
        C538080L8k c538080L8k = this.LIZ;
        c538080L8k.LJII = linkedHashSet;
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            c538080L8k.LJIIIIZZ += ((InterfaceC538100L8m) it2.next()).LJIL();
        }
        return this.LIZIZ;
    }

    public C538090L8l() {
        C538080L8k c538080L8k = new C538080L8k();
        this.LIZ = c538080L8k;
        C0FQT c0fqt = new C0FQT(c538080L8k);
        this.LIZIZ = c0fqt;
        this.LIZJ = c0fqt;
    }

    public final void LIZ(AbstractC538070L8j abstractC538070L8j) {
        this.LIZIZ.LJIJJLI(abstractC538070L8j);
        this.LIZJ = abstractC538070L8j;
        abstractC538070L8j.LJII(this.LIZ);
        this.LIZJ.LJIJJLI(this.LIZ);
    }

    public final void LIZIZ(AbstractC538070L8j abstractC538070L8j) {
        this.LIZJ.LJJII(this.LIZ);
        this.LIZJ.LJIJJLI(abstractC538070L8j);
        this.LIZJ = abstractC538070L8j;
        abstractC538070L8j.LJII(this.LIZ);
        this.LIZJ.LJIJJLI(this.LIZ);
    }

    public static void LIZLLL(InterfaceC538100L8m interfaceC538100L8m, Set set) {
        set.add(interfaceC538100L8m);
        Iterator<InterfaceC538100L8m> it2 = interfaceC538100L8m.LJIIIZ().iterator();
        while (it2.hasNext()) {
            LIZLLL(it2.next(), set);
        }
    }
}
