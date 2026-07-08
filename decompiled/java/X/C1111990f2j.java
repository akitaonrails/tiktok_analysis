package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0f2j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1111990f2j<T> {
    public final int LIZ;
    public final ArrayList<T> LIZIZ;
    public final LinkedList<T> LIZJ;
    public final List<T> LIZLLL;
    public final List<T> LJ;
    public final Set<InterfaceC1112510f3Z<T>> LJFF;
    public boolean LJI;

    public final void LIZIZ() {
        this.LIZJ.clear();
        if (this.LJI) {
            for (T t : this.LIZIZ) {
                if (!LIZ(t)) {
                    this.LIZJ.add(t);
                }
            }
        }
    }

    public final List<T> LIZLLL() {
        return this.LJI ? this.LJ : this.LIZLLL;
    }

    public final int LJ() {
        return this.LJI ? this.LIZJ.size() : this.LIZIZ.size();
    }

    public final int LJFF() {
        return this.LIZIZ.size();
    }

    public C1111990f2j(int i) {
        this.LIZ = i;
        ArrayList<T> arrayList = new ArrayList<>(i);
        this.LIZIZ = arrayList;
        LinkedList<T> linkedList = new LinkedList<>();
        this.LIZJ = linkedList;
        this.LIZLLL = Collections.unmodifiableList(arrayList);
        this.LJ = Collections.unmodifiableList(linkedList);
        this.LJFF = new LinkedHashSet();
    }

    public final boolean LIZ(T t) {
        boolean z;
        if (!this.LJI) {
            return false;
        }
        Set<InterfaceC1112510f3Z<T>> set = this.LJFF;
        if (set.size() == 0) {
            return false;
        }
        loop0: while (true) {
            z = true;
            for (InterfaceC1112510f3Z<T> interfaceC1112510f3Z : set) {
                if (!z || !interfaceC1112510f3Z.filter(t)) {
                    z = false;
                }
            }
        }
        if (!z) {
            return false;
        }
        return true;
    }

    public final T LIZJ(int i) {
        return (T) ListProtector.get(this.LIZIZ, i);
    }

    public final int LJI(T t) {
        if (this.LJI) {
            return this.LIZJ.indexOf(t);
        }
        return this.LIZIZ.indexOf(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJII(InterfaceC1112060f2q interfaceC1112060f2q) {
        this.LIZIZ.remove(interfaceC1112060f2q);
        if (this.LJI && !LIZ(interfaceC1112060f2q)) {
            this.LIZJ.remove(interfaceC1112060f2q);
        }
    }
}
