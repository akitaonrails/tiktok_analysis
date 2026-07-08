package X;

import X.InterfaceC21205317yd;
import android.util.SparseArray;

/* JADX INFO: renamed from: X.17yS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21204217yS<DATA, T extends InterfaceC21205317yd<DATA>> implements InterfaceC21205817yi<DATA, T> {
    public T LL;
    public final SparseArray<T> LLILLJJLI = new SparseArray<>();
    public DATA LLILLL;
    public boolean LLILZ;

    public final void LIZJ() {
        this.LLILZ = false;
        T t = this.LL;
        if (t != null) {
            t.destroy();
        }
        this.LL = null;
        this.LLILLL = null;
    }

    @Override // X.InterfaceC21205817yi
    public final void LIZ(int i) {
        int state;
        Integer numValueOf;
        DATA data = this.LLILLL;
        if (data != null) {
            T t = this.LLILLJJLI.get(i);
            T t2 = this.LL;
            if (t2 != null) {
                state = t2.getState();
            } else {
                state = -2;
            }
            if (state != i && t != null) {
                T t3 = this.LL;
                if (t3 != null) {
                    t3.destroy();
                }
                C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("transToState from state = ");
                T t4 = this.LL;
                Integer numValueOf2 = null;
                if (t4 != null) {
                    numValueOf = Integer.valueOf(t4.getState());
                } else {
                    numValueOf = null;
                }
                sbLIZ.append(numValueOf);
                sbLIZ.append(", to state = ");
                sbLIZ.append(i);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c2341109Fh.getClass();
                C2341109Fh.LJ(strLIZIZ);
                T t6 = this.LL;
                if (t6 != null) {
                    numValueOf2 = Integer.valueOf(t6.getState());
                }
                t.LIZ(numValueOf2, data);
                this.LL = t;
            }
        }
    }
}
