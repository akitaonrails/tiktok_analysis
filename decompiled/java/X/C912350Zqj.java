package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: renamed from: X.0Zqj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C912350Zqj {
    public final int LIZ;
    public final C13E8<C869590Y9l> LIZIZ;
    public final LinkedHashSet<String> LIZJ;

    public final synchronized void LIZ() {
        this.LIZIZ.clear();
        this.LIZJ.clear();
    }

    public final synchronized C869590Y9l LIZIZ() {
        C869590Y9l c869590Y9lLJIILJJIL = this.LIZIZ.LJIILJJIL();
        if (c869590Y9lLJIILJJIL == null) {
            return null;
        }
        this.LIZJ.remove(c869590Y9lLJIILJJIL.getUuid());
        return c869590Y9lLJIILJJIL;
    }

    public final synchronized void LIZJ() {
        C869590Y9l c869590Y9lLIZIZ;
        if (this.LIZIZ.size() <= this.LIZ) {
            C13LP.LLIIII(this.LIZIZ);
            LIZ();
            return;
        }
        ArrayList arrayList = new ArrayList();
        while ((!this.LIZIZ.isEmpty()) && arrayList.size() < this.LIZ && (c869590Y9lLIZIZ = LIZIZ()) != null) {
            arrayList.add(c869590Y9lLIZIZ);
        }
    }

    public final synchronized boolean LJFF() {
        return this.LIZIZ.isEmpty();
    }

    public final synchronized List<C869590Y9l> LJI() {
        return C13LP.LL(this.LIZIZ, this.LIZ);
    }

    public C912350Zqj(int i) {
        this.LIZ = i;
        C13E8<C869590Y9l> c13e8 = new C13E8<>();
        this.LIZIZ = c13e8;
        this.LIZJ = new LinkedHashSet<>();
        c13e8.size();
    }

    public final synchronized void LIZLLL(C869590Y9l c869590Y9l) {
        if (this.LIZJ.contains(c869590Y9l.getUuid())) {
            return;
        }
        this.LIZIZ.addFirst(c869590Y9l);
        this.LIZJ.add(c869590Y9l.getUuid());
    }

    public final void LJ(List<? extends C869590Y9l> list) {
        Iterator<? extends C869590Y9l> it2 = list.iterator();
        while (it2.hasNext()) {
            LIZLLL(it2.next());
        }
    }

    public final synchronized void LJII(Collection<? extends C869590Y9l> collection) {
        if (collection.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            hashSet.add(((C869590Y9l) it2.next()).getUuid());
        }
        C19719612Di.LJJIIJ(this.LIZIZ, new AwS593S0100000_14(hashSet, (HashSet<String>) 235), true);
        this.LIZJ.removeAll(hashSet);
    }
}
