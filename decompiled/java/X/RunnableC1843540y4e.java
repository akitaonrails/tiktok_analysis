package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0y4e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class RunnableC1843540y4e implements Runnable {
    public final WeakReference<RecyclerView> LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public int LLILZIL;
    public Function0<Unit> LLILZLL;

    public final void LIZJ() {
        this.LLILLJJLI = false;
        RecyclerView recyclerView = this.LL.get();
        if (recyclerView != null) {
            HandlerHook.viewRemoveCallbacks(recyclerView, this);
        }
    }

    public final void LIZ() {
        int i;
        RecyclerView recyclerView = this.LL.get();
        if (recyclerView == null || !this.LLILLJJLI || !this.LLILLL || (i = this.LLILZIL) < 30) {
            return;
        }
        this.LLILZIL = i - 3;
        if (this.LLILZ) {
            recyclerView.scrollBy(0, 30);
        } else {
            recyclerView.scrollBy(0, -30);
        }
        Function0<Unit> function0 = this.LLILZLL;
        if (function0 != null) {
            function0.invoke();
        }
        HandlerHook.viewPostDelay(recyclerView, this, 100L);
        if (this.LLILZIL <= 0) {
            LIZJ();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("TakoChatAutoScrollTask@6fe5.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoChatAutoScrollTask@6fe5.run");
    }

    public RunnableC1843540y4e(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        this.LL = new WeakReference<>(viewOnAttachStateChangeListenerC20604515jv);
    }

    public final void LIZIZ(int i, boolean z, Function0 function0) {
        if (this.LLILLJJLI) {
            LIZJ();
        }
        int iAbs = Math.abs(i);
        this.LLILZIL = iAbs;
        if (iAbs == 0) {
            return;
        }
        this.LLILZLL = function0;
        this.LLILLL = true;
        this.LLILLJJLI = true;
        this.LLILZ = z;
        run();
    }
}
