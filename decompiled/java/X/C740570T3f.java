package X;

import Y.ARunnableS112S0100000_12;
import android.os.Handler;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.jvm.internal.AwS578S0100000_34;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0T3f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C740570T3f {
    public final Handler LIZ;
    public final ARunnableS112S0100000_12 LIZIZ;

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onClearModeEvent(C714060Rzg c714060Rzg) {
        this.LIZ.removeCallbacks(this.LIZIZ);
        C786410Ut5.LJJZZIII(this.LIZ, this.LIZIZ);
    }

    public C740570T3f(BPEAHandler bPEAHandler, AwS578S0100000_34 awS578S0100000_34) {
        this.LIZ = bPEAHandler;
        this.LIZIZ = new ARunnableS112S0100000_12(awS578S0100000_34, 184);
    }
}
