package X;

import Y.ARunnableS117S0100000_17;
import android.os.Looper;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.0esm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractViewOnClickListenerC1105820esm implements View.OnClickListener {
    public static final BPEAHandler LLILZ = new BPEAHandler(Looper.getMainLooper());
    public final long LLILLJJLI;
    public boolean LL = true;
    public final ARunnableS117S0100000_17 LLILLL = new ARunnableS117S0100000_17(this, 293);

    public abstract void LIZ();

    public AbstractViewOnClickListenerC1105820esm(long j) {
        this.LLILLJJLI = j;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.LL) {
            this.LL = false;
            C786410Ut5.LJLIIL(this.LLILLJJLI, LLILZ, this.LLILLL);
            LIZ();
        }
    }
}
