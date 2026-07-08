package X;

import Y.ARunnableS112S0100000_12;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0T6D, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T6D implements ViewTreeObserver.OnDrawListener {
    public final View LL;
    public final Function0<Unit> LLILLJJLI;
    public final BPEAHandler LLILLL = new BPEAHandler(Looper.getMainLooper());
    public boolean LLILZ;

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        if (this.LLILZ) {
            return;
        }
        this.LLILZ = true;
        this.LLILLJJLI.invoke();
        C786410Ut5.LJJZZIII(this.LLILLL, new ARunnableS112S0100000_12(this, 463));
    }

    public C0T6D(View view, Function0<Unit> function0) {
        this.LL = view;
        this.LLILLJJLI = function0;
    }
}
