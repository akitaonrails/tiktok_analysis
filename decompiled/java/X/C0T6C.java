package X;

import Y.ARunnableS112S0100000_12;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0T6C, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T6C implements ViewTreeObserver.OnDrawListener {
    public final View LL;
    public final Function1<View, Unit> LLILLJJLI;
    public final BPEAHandler LLILLL = new BPEAHandler(Looper.getMainLooper());
    public boolean LLILZ;

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        if (this.LLILZ) {
            return;
        }
        this.LLILZ = true;
        this.LLILLJJLI.invoke(this.LL);
        C786410Ut5.LJJZZIII(this.LLILLL, new ARunnableS112S0100000_12(this, 501));
    }

    public C0T6C(View view, AwS591S0100000_12 awS591S0100000_12) {
        this.LL = view;
        this.LLILLJJLI = awS591S0100000_12;
    }
}
