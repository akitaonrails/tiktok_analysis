package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: X.12r8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19884812r8 extends AbstractC19884712r7 implements Set {
    public transient AbstractC19884912r9 LLILLJJLI;

    @Override // X.AbstractC19884712r7
    /* JADX INFO: renamed from: zze */
    public abstract AbstractC19885512rF iterator();

    @Override // X.AbstractC19884712r7
    public AbstractC19884912r9 zzd() {
        AbstractC19884912r9 abstractC19884912r9 = this.LLILLJJLI;
        if (abstractC19884912r9 != null) {
            return abstractC19884912r9;
        }
        AbstractC19884912r9 abstractC19884912r9LJIIJ = LJIIJ();
        this.LLILLJJLI = abstractC19884912r9LJIIJ;
        return abstractC19884912r9LJIIJ;
    }

    public AbstractC19884912r9 LJIIJ() {
        Object[] array = toArray();
        C19885312rD c19885312rD = AbstractC19884912r9.LLILLJJLI;
        return AbstractC19884912r9.LJIIJ(array.length, array);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        Iterator it2 = iterator();
        int iHashCode = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // X.AbstractC19884712r7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }
}
