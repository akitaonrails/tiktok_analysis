package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.0WPb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C822690WPb extends C0WPZ {
    public static C822690WPb LLILLJJLI;

    public C822690WPb() {
        super(new BPEAHandler(Looper.getMainLooper()));
    }

    public static C822690WPb LIZ() {
        if (LLILLJJLI == null) {
            LLILLJJLI = new C822690WPb();
        }
        return LLILLJJLI;
    }

    @Override // X.C0WPZ, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (C786410Ut5.u3() == this.LL.getLooper().getThread()) {
            runnable.run();
        } else {
            super.execute(runnable);
        }
    }
}
