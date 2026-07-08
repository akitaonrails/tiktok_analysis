package X;

import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: renamed from: X.19AE, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19AE extends AbstractRunnableC21499319Bv {
    public final Queue<Boolean> LL;
    public final /* synthetic */ C19A6 LLILLJJLI;

    public final void LIZ() {
        if (this.LLILLJJLI.LJJIJLIJ().LIZIZ.size() > 0) {
            this.LLILLJJLI.LJJIJLIJ().LIZIZ(this);
            return;
        }
        this.LLILLJJLI.LJIILJJIL = null;
        while (true) {
            Boolean bool = (Boolean) ((ArrayDeque) this.LL).poll();
            if (bool == null) {
                return;
            }
            C21494919Ad c21494919Ad = C21494919Ad.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("WindowFocusChangedPendingTask dispatch onWindowFocusChanged ");
            sbLIZ.append(bool);
            c21494919Ad.LIZIZ("NavigationSceneManager", C2188811AlT.LIZIZ(sbLIZ));
            this.LLILLJJLI.LJJIII(bool.booleanValue());
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("NavigationSceneManager$WindowFocusChangedPendingTask@3c41.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NavigationSceneManager$WindowFocusChangedPendingTask@3c41.run");
    }

    public C19AE(C19A6 c19a6, boolean z) {
        this.LLILLJJLI = c19a6;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.LL = arrayDeque;
        arrayDeque.add(Boolean.valueOf(z));
    }
}
