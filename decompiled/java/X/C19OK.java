package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.19OK, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19OK {
    public static int LJFF;
    public final int LIZIZ;
    public int LIZJ;
    public final ArrayList<C19OA> LIZ = new ArrayList<>();
    public ArrayList<C19OZ> LIZLLL = null;
    public int LJ = -1;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        int i = this.LIZJ;
        sbLIZ.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sbLIZ.append(" [");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("] <");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        for (C19OA c19oa : this.LIZ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(" ");
            sbLIZ2.append(c19oa.mDebugName);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(strLIZIZ);
        sbLIZ3.append(" >");
        return C2188811AlT.LIZIZ(sbLIZ3);
    }

    public C19OK(int i) {
        this.LIZIZ = -1;
        int i2 = LJFF;
        LJFF = i2 + 1;
        this.LIZIZ = i2;
        this.LIZJ = i;
    }

    public final boolean LIZ(C19OA c19oa) {
        if (this.LIZ.contains(c19oa)) {
            return false;
        }
        this.LIZ.add(c19oa);
        return true;
    }

    public final void LIZIZ(ArrayList<C19OK> arrayList) {
        int size = this.LIZ.size();
        if (this.LJ != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C19OK c19ok = (C19OK) ListProtector.get(arrayList, i);
                if (this.LJ == c19ok.LIZIZ) {
                    LIZLLL(this.LIZJ, c19ok);
                }
            }
            return;
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int LIZJ(final C21531219Oc c21531219Oc, int i) {
        int iLJIILIIL;
        int iLJIILIIL2;
        if (this.LIZ.size() == 0) {
            return 0;
        }
        ArrayList<C19OA> arrayList = this.LIZ;
        C19O9 c19o9 = (C19O9) ((C19OA) ListProtector.get(arrayList, 0)).mParent;
        c21531219Oc.LJIJI();
        c19o9.addToSolver(c21531219Oc, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((C19OA) ListProtector.get(arrayList, i2)).addToSolver(c21531219Oc, false);
        }
        if (i == 0) {
            if (c19o9.LJIIIIZZ > 0) {
                C19OJ.LIZ(c19o9, c21531219Oc, arrayList, 0);
            }
        } else if (i == 1 && c19o9.LJIIIZ > 0) {
            C19OJ.LIZ(c19o9, c21531219Oc, arrayList, 1);
        }
        try {
            c21531219Oc.LJIILL();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        this.LIZLLL = new ArrayList<>();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            final C19OA c19oa = (C19OA) ListProtector.get(arrayList, i3);
            this.LIZLLL.add((C19OZ) new Object(c19oa, c21531219Oc) { // from class: X.19OZ
                {
                    new WeakReference(c19oa);
                    C19OG c19og = c19oa.mLeft;
                    c21531219Oc.getClass();
                    C21531219Oc.LJIILIIL(c19og);
                    C21531219Oc.LJIILIIL(c19oa.mTop);
                    C21531219Oc.LJIILIIL(c19oa.mRight);
                    C21531219Oc.LJIILIIL(c19oa.mBottom);
                    C21531219Oc.LJIILIIL(c19oa.mBaseline);
                }
            });
        }
        if (i == 0) {
            iLJIILIIL = C21531219Oc.LJIILIIL(c19o9.mLeft);
            iLJIILIIL2 = C21531219Oc.LJIILIIL(c19o9.mRight);
            c21531219Oc.LJIJI();
        } else {
            iLJIILIIL = C21531219Oc.LJIILIIL(c19o9.mTop);
            iLJIILIIL2 = C21531219Oc.LJIILIIL(c19o9.mBottom);
            c21531219Oc.LJIJI();
        }
        return iLJIILIIL2 - iLJIILIIL;
    }

    public final void LIZLLL(int i, C19OK c19ok) {
        for (C19OA c19oa : this.LIZ) {
            c19ok.LIZ(c19oa);
            if (i == 0) {
                c19oa.horizontalGroup = c19ok.LIZIZ;
            } else {
                c19oa.verticalGroup = c19ok.LIZIZ;
            }
        }
        this.LJ = c19ok.LIZIZ;
    }
}
