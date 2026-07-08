package X;

import android.util.SparseArray;
import java.util.Queue;

/* JADX INFO: renamed from: X.0wGB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1773810wGB {
    public final C21319918c1 LIZ;
    public final SparseArray<Queue<C1773920wGM>> LIZIZ = new SparseArray<>();

    public final void LIZ() {
        SparseArray<Queue<C1773920wGM>> sparseArray = this.LIZIZ;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            sparseArray.keyAt(i);
            Queue<C1773920wGM> queueValueAt = sparseArray.valueAt(i);
            while (queueValueAt.size() > 0) {
                queueValueAt.poll();
            }
        }
        this.LIZIZ.clear();
    }

    public C1773810wGB(C21319918c1 c21319918c1) {
        this.LIZ = c21319918c1;
    }

    public final C1773920wGM LIZIZ(C1773540wFk c1773540wFk) {
        Queue<C1773920wGM> queue = this.LIZIZ.get(c1773540wFk.LIZJ);
        if (queue != null && !queue.isEmpty()) {
            C1773920wGM c1773920wGMPoll = queue.poll();
            if (c1773920wGMPoll == null) {
                return new C1773920wGM(this.LIZ, c1773540wFk);
            }
            return c1773920wGMPoll;
        }
        return new C1773920wGM(this.LIZ, c1773540wFk);
    }
}
