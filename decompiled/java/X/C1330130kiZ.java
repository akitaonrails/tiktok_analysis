package X;

import android.util.SparseArray;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.0kiZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1330130kiZ<T> {
    public final SparseArray<C1330140kia<T>> LIZ = new SparseArray<>();
    public C1330140kia<T> LIZIZ;
    public C1330140kia<T> LIZJ;

    public final synchronized void LIZ(C1330140kia<T> c1330140kia) {
        C1330140kia c1330140kia2 = (C1330140kia<T>) c1330140kia.LIZ;
        C1330140kia c1330140kia3 = (C1330140kia<T>) c1330140kia.LIZLLL;
        if (c1330140kia2 != null) {
            c1330140kia2.LIZLLL = c1330140kia3;
        }
        if (c1330140kia3 != null) {
            c1330140kia3.LIZ = c1330140kia2;
        }
        c1330140kia.LIZ = null;
        c1330140kia.LIZLLL = null;
        if (c1330140kia == this.LIZIZ) {
            this.LIZIZ = c1330140kia3;
        }
        if (c1330140kia == this.LIZJ) {
            this.LIZJ = c1330140kia2;
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final synchronized void LIZIZ(int i, T t) {
        C1330140kia<T> c1330140kia = this.LIZ.get(i);
        if (c1330140kia == null) {
            c1330140kia = (C1330140kia<T>) new C1330140kia(i, new LinkedList());
            this.LIZ.put(i, (C1330140kia<T>) c1330140kia);
        }
        c1330140kia.LIZJ.addLast((I) t);
        if (this.LIZIZ != c1330140kia) {
            LIZ(c1330140kia);
            C1330140kia c1330140kia2 = this.LIZIZ;
            if (c1330140kia2 == null) {
                this.LIZIZ = (C1330140kia<T>) c1330140kia;
                this.LIZJ = (C1330140kia<T>) c1330140kia;
            } else {
                c1330140kia.LIZLLL = c1330140kia2;
                c1330140kia2.LIZ = (C1330140kia<I>) c1330140kia;
                this.LIZIZ = (C1330140kia<T>) c1330140kia;
            }
        }
    }
}
