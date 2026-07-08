package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.1DoY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2267161DoY {
    public static int LJFF;
    public final int LIZIZ;
    public int LIZJ;
    public final ArrayList<C2267081DoQ> LIZ = new ArrayList<>();
    public ArrayList<C2267301Dom> LIZLLL = null;
    public int LJ = -1;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        int i = this.LIZJ;
        sbLIZ.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sbLIZ.append(" [");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("] <");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        for (C2267081DoQ c2267081DoQ : this.LIZ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(" ");
            sbLIZ2.append(c2267081DoQ.LJJLI);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(strLIZIZ);
        sbLIZ3.append(" >");
        return C2188811AlT.LIZIZ(sbLIZ3);
    }

    public C2267161DoY(int i) {
        this.LIZIZ = -1;
        int i2 = LJFF;
        LJFF = i2 + 1;
        this.LIZIZ = i2;
        this.LIZJ = i;
    }

    public final boolean LIZ(C2267081DoQ c2267081DoQ) {
        if (this.LIZ.contains(c2267081DoQ)) {
            return false;
        }
        this.LIZ.add(c2267081DoQ);
        return true;
    }

    public final void LIZIZ(ArrayList<C2267161DoY> arrayList) {
        int size = this.LIZ.size();
        if (this.LJ != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C2267161DoY c2267161DoY = (C2267161DoY) ListProtector.get(arrayList, i);
                if (this.LJ == c2267161DoY.LIZIZ) {
                    LIZLLL(this.LIZJ, c2267161DoY);
                }
            }
            return;
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int LIZJ(final C21536919Qh c21536919Qh, int i) {
        int iLJIILIIL;
        int iLJIILIIL2;
        if (this.LIZ.size() == 0) {
            return 0;
        }
        ArrayList<C2267081DoQ> arrayList = this.LIZ;
        C2267091DoR c2267091DoR = (C2267091DoR) ((C2267081DoQ) ListProtector.get(arrayList, 0)).LJJJJI;
        c21536919Qh.LJIJI();
        c2267091DoR.LIZJ(c21536919Qh, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((C2267081DoQ) ListProtector.get(arrayList, i2)).LIZJ(c21536919Qh, false);
        }
        if (i == 0) {
            if (c2267091DoR.LJJZZIII > 0) {
                C2267151DoX.LIZ(c2267091DoR, c21536919Qh, arrayList, 0);
            }
        } else if (i == 1 && c2267091DoR.LJL > 0) {
            C2267151DoX.LIZ(c2267091DoR, c21536919Qh, arrayList, 1);
        }
        try {
            c21536919Qh.LJIILL();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        this.LIZLLL = new ArrayList<>();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            final C2267081DoQ c2267081DoQ = (C2267081DoQ) ListProtector.get(arrayList, i3);
            this.LIZLLL.add((C2267301Dom) new Object(c2267081DoQ, c21536919Qh) { // from class: X.1Dom
                {
                    new WeakReference(c2267081DoQ);
                    C2267141DoW c2267141DoW = c2267081DoQ.LJJIJ;
                    c21536919Qh.getClass();
                    C21536919Qh.LJIILIIL(c2267141DoW);
                    C21536919Qh.LJIILIIL(c2267081DoQ.LJJIJIIJI);
                    C21536919Qh.LJIILIIL(c2267081DoQ.LJJIJIIJIL);
                    C21536919Qh.LJIILIIL(c2267081DoQ.LJJIJIL);
                    C21536919Qh.LJIILIIL(c2267081DoQ.LJJIJL);
                }
            });
        }
        if (i == 0) {
            iLJIILIIL = C21536919Qh.LJIILIIL(c2267091DoR.LJJIJ);
            iLJIILIIL2 = C21536919Qh.LJIILIIL(c2267091DoR.LJJIJIIJIL);
            c21536919Qh.LJIJI();
        } else {
            iLJIILIIL = C21536919Qh.LJIILIIL(c2267091DoR.LJJIJIIJI);
            iLJIILIIL2 = C21536919Qh.LJIILIIL(c2267091DoR.LJJIJIL);
            c21536919Qh.LJIJI();
        }
        return iLJIILIIL2 - iLJIILIIL;
    }

    public final void LIZLLL(int i, C2267161DoY c2267161DoY) {
        for (C2267081DoQ c2267081DoQ : this.LIZ) {
            c2267161DoY.LIZ(c2267081DoQ);
            if (i == 0) {
                c2267081DoQ.LJJLIIIJL = c2267161DoY.LIZIZ;
            } else {
                c2267081DoQ.LJJLIIIJLJLI = c2267161DoY.LIZIZ;
            }
        }
        this.LJ = c2267161DoY.LIZIZ;
    }
}
