package X;

import Y.ARunnableS115S0100000_15;
import android.os.Looper;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.0asa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractViewOnClickListenerC951940asa implements View.OnClickListener {
    public static final BPEAHandler LLILZ = new BPEAHandler(Looper.getMainLooper());
    public boolean LL;
    public final long LLILLJJLI;
    public final ARunnableS115S0100000_15 LLILLL;

    public abstract void LIZ(View view);

    public AbstractViewOnClickListenerC951940asa(long j) {
        this.LL = true;
        this.LLILLL = new ARunnableS115S0100000_15(this, 84);
        this.LLILLJJLI = j;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.LL) {
            this.LL = false;
            C786410Ut5.LJLIIL(this.LLILLJJLI, LLILZ, this.LLILLL);
            LIZ(view);
        }
    }

    public /* synthetic */ AbstractViewOnClickListenerC951940asa(int i) {
        this(500L);
    }
}
