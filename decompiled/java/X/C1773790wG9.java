package X;

import android.util.SparseArray;
import java.util.Queue;

/* JADX INFO: renamed from: X.0wG9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1773790wG9 {
    public final SparseArray<Queue<InterfaceC1773570wFn>> LIZ = new SparseArray<>();

    public final void LIZ() {
        SparseArray<Queue<InterfaceC1773570wFn>> sparseArray = this.LIZ;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            sparseArray.keyAt(i);
            Queue<InterfaceC1773570wFn> queueValueAt = sparseArray.valueAt(i);
            while (queueValueAt.size() > 0) {
                InterfaceC1773570wFn interfaceC1773570wFnPoll = queueValueAt.poll();
                if (interfaceC1773570wFnPoll != null) {
                    interfaceC1773570wFnPoll.release();
                }
            }
        }
    }

    public final InterfaceC1773570wFn LIZIZ(int i) {
        Queue<InterfaceC1773570wFn> queue = this.LIZ.get(i);
        if (queue != null && !queue.isEmpty()) {
            InterfaceC1773570wFn interfaceC1773570wFnPoll = queue.poll();
            if (interfaceC1773570wFnPoll == null) {
                return C0WOY.LIZ(C0WOW.SPARK_LITE);
            }
            return interfaceC1773570wFnPoll;
        }
        return C0WOY.LIZ(C0WOW.SPARK_LITE);
    }
}
