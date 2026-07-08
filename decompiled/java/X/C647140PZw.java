package X;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0PZw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C647140PZw {
    public static int LIZIZ;
    public static final C647140PZw LIZ = new C647140PZw();
    public static final SparseArray<C649040Pd0> LIZJ = new SparseArray<>();
    public static final SparseArray<List<Integer>> LIZLLL = new SparseArray<>();
    public static int LJ = -1;

    public final synchronized C649040Pd0 LIZ(int i) {
        return LIZJ.get(i);
    }

    public final synchronized int LIZIZ(C649040Pd0 c649040Pd0) {
        if (LJ == -1) {
            return -1;
        }
        int i = LIZIZ;
        LIZIZ = i + 1;
        LIZJ.put(i, c649040Pd0);
        SparseArray<List<Integer>> sparseArray = LIZLLL;
        List<Integer> arrayList = sparseArray.get(LJ);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        arrayList.add(Integer.valueOf(i));
        sparseArray.put(LJ, arrayList);
        return i;
    }

    public final synchronized void LIZJ(int i) {
        if (LJ == -1) {
            return;
        }
        SparseArray<C649040Pd0> sparseArray = LIZJ;
        if (sparseArray.get(i) == null) {
            return;
        }
        sparseArray.remove(i);
        SparseArray<List<Integer>> sparseArray2 = LIZLLL;
        List<Integer> list = sparseArray2.get(LJ);
        if (list != null) {
            list.remove(Integer.valueOf(i));
            sparseArray2.put(LJ, list);
        }
    }
}
