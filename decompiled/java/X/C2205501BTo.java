package X;

import X.C1BUC;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.1BTo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2205501BTo<T extends C1BUC> {
    public final C1BU8 LIZ;
    public final int LIZIZ;
    public Set<T> LIZJ;
    public List<C2205501BTo<T>> LIZLLL;

    public C2205501BTo(C1BU8 c1bu8, int i) {
        this.LIZ = c1bu8;
        this.LIZIZ = i;
    }

    public final void LIZIZ(C1BU8 c1bu8, Collection<T> collection) {
        C1BU8 c1bu82 = this.LIZ;
        c1bu82.getClass();
        double d = c1bu8.LIZ;
        double d2 = c1bu8.LIZJ;
        double d3 = c1bu8.LIZIZ;
        double d4 = c1bu8.LIZLLL;
        if (d < c1bu82.LIZJ && c1bu82.LIZ < d2 && d3 < c1bu82.LIZLLL && c1bu82.LIZIZ < d4) {
            List<C2205501BTo<T>> list = this.LIZLLL;
            if (list != null) {
                Iterator it2 = ((ArrayList) list).iterator();
                while (it2.hasNext()) {
                    ((C2205501BTo) it2.next()).LIZIZ(c1bu8, collection);
                }
                return;
            }
            Set<T> set = this.LIZJ;
            if (set != null) {
                C1BU8 c1bu83 = this.LIZ;
                if (c1bu83.LIZ >= d && c1bu83.LIZJ <= d2 && c1bu83.LIZIZ >= d3 && c1bu83.LIZLLL <= d4) {
                    ((ArrayList) collection).addAll(set);
                    return;
                }
                for (T t : set) {
                    C1BSB c1bsbLIZ = t.LIZ();
                    double d5 = c1bsbLIZ.LIZ;
                    double d6 = c1bsbLIZ.LIZIZ;
                    if (c1bu8.LIZ <= d5 && d5 <= c1bu8.LIZJ && c1bu8.LIZIZ <= d6 && d6 <= c1bu8.LIZLLL) {
                        ((ArrayList) collection).add(t);
                    }
                }
            }
        }
    }

    public final void LIZ(double d, double d2, T t) {
        List<C2205501BTo<T>> list = this.LIZLLL;
        if (list != null) {
            C1BU8 c1bu8 = this.LIZ;
            if (d2 < c1bu8.LJFF) {
                if (d < c1bu8.LJ) {
                    ((C2205501BTo) ListProtector.get(list, 0)).LIZ(d, d2, t);
                    return;
                } else {
                    ((C2205501BTo) ListProtector.get(list, 1)).LIZ(d, d2, t);
                    return;
                }
            }
            if (d < c1bu8.LJ) {
                ((C2205501BTo) ListProtector.get(list, 2)).LIZ(d, d2, t);
                return;
            } else {
                ((C2205501BTo) ListProtector.get(list, 3)).LIZ(d, d2, t);
                return;
            }
        }
        if (this.LIZJ == null) {
            this.LIZJ = new LinkedHashSet();
        }
        this.LIZJ.add(t);
        if (this.LIZJ.size() > 50 && this.LIZIZ < 40) {
            ArrayList arrayList = new ArrayList(4);
            this.LIZLLL = arrayList;
            C1BU8 c1bu82 = this.LIZ;
            arrayList.add(new C2205501BTo(c1bu82.LIZ, c1bu82.LJ, c1bu82.LIZIZ, c1bu82.LJFF, this.LIZIZ + 1));
            List<C2205501BTo<T>> list2 = this.LIZLLL;
            C1BU8 c1bu83 = this.LIZ;
            ((ArrayList) list2).add(new C2205501BTo(c1bu83.LJ, c1bu83.LIZJ, c1bu83.LIZIZ, c1bu83.LJFF, this.LIZIZ + 1));
            List<C2205501BTo<T>> list3 = this.LIZLLL;
            C1BU8 c1bu84 = this.LIZ;
            ((ArrayList) list3).add(new C2205501BTo(c1bu84.LIZ, c1bu84.LJ, c1bu84.LJFF, c1bu84.LIZLLL, this.LIZIZ + 1));
            List<C2205501BTo<T>> list4 = this.LIZLLL;
            C1BU8 c1bu85 = this.LIZ;
            ((ArrayList) list4).add(new C2205501BTo(c1bu85.LJ, c1bu85.LIZJ, c1bu85.LJFF, c1bu85.LIZLLL, this.LIZIZ + 1));
            Set<T> set = this.LIZJ;
            this.LIZJ = null;
            for (T t2 : set) {
                LIZ(t2.LIZ().LIZ, t2.LIZ().LIZIZ, t2);
            }
        }
    }

    public C2205501BTo(double d, double d2, double d3, double d4, int i) {
        this(new C1BU8(d, d2, d3, d4), i);
    }
}
