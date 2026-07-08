package X;

import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.IAnoleManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0d0n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class RunnableC1033910d0n implements Runnable {
    public final C1033970d0t LL;
    public final int LLILLJJLI;
    public InterfaceC1034190d1F LLILLL;

    public final void LIZ() {
        List<InterfaceC1034140d1A> list = this.LL.LIZLLL;
        if (list == null || list.isEmpty()) {
            InterfaceC1034190d1F interfaceC1034190d1F = this.LLILLL;
            if (interfaceC1034190d1F != null) {
                interfaceC1034190d1F.LIZ(this.LL, this.LLILLJJLI);
                return;
            }
            return;
        }
        C1033970d0t c1033970d0t = this.LL;
        IAnoleManager iAnoleManager = c1033970d0t.LIZJ;
        List<InterfaceC1034140d1A> list2 = c1033970d0t.LIZLLL;
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC1034140d1A> it2 = list2.iterator();
        while (it2.hasNext()) {
            List<InterfaceC1007930cKt> listLJIIJ = iAnoleManager.LJIIJ(it2.next().getName());
            if (listLJIIJ != null) {
                arrayList.add(listLJIIJ);
            }
        }
        List listLJIJJLI = C15438062q.LJIJJLI(arrayList);
        if (!listLJIJJLI.isEmpty()) {
            Iterator it3 = listLJIJJLI.iterator();
            while (it3.hasNext()) {
                if (!((InterfaceC1007930cKt) it3.next()).isReady().LIZ) {
                    this.LL.LIZIZ.postOnAnimation(this);
                    return;
                }
            }
        }
        InterfaceC1034190d1F interfaceC1034190d1F2 = this.LLILLL;
        if (interfaceC1034190d1F2 != null) {
            interfaceC1034190d1F2.LIZ(this.LL, this.LLILLJJLI);
        }
    }

    public final void LIZIZ() {
        HandlerHook.viewRemoveCallbacks(this.LL.LIZIZ, this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("CarouselAnoleComponentReadyRunnable@c974.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CarouselAnoleComponentReadyRunnable@c974.run");
    }

    public final void LIZJ() {
        LIZIZ();
        if (this.LL.LIZIZ.getHeight() <= 0 || this.LL.LIZIZ.getWidth() <= 0) {
            this.LL.LIZIZ.postOnAnimation(this);
        } else if (this.LL.LIZIZ.isAttachedToWindow()) {
            LIZ();
        } else {
            HandlerHook.viewPost(this.LL.LIZIZ, this);
        }
    }

    public RunnableC1033910d0n(C1033970d0t c1033970d0t, int i) {
        this.LL = c1033970d0t;
        this.LLILLJJLI = i;
    }
}
