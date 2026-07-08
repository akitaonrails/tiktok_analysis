package X;

import android.os.Message;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: renamed from: X.0XGj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C845910XGj extends C845880XGg {
    @Override // X.C845880XGg
    public final void LIZLLL() {
        this.LL.removeMessages(1);
    }

    @Override // X.C845880XGg, com.bytedance.bpea.transmit.delegate.BPEAThread, java.lang.Thread, java.lang.Runnable
    public final void run() {
        C1C7U.LIZ("DownloadDispatcher@65dd.run");
        boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
        try {
            super.run();
        } finally {
        }
        if (zLJ) {
            C0W9U.LJFF();
        }
        C1C7U.LIZIZ("DownloadDispatcher@65dd.run");
    }

    @Override // X.C845880XGg
    public final void LJFF() {
        LIZLLL();
        this.LL.sendEmptyMessageDelayed(1, 2000L);
    }

    public C845910XGj(BlockingQueue blockingQueue) {
        super(blockingQueue, "Account-DownloadDispatcher-Thread", "DownloadDispatcher");
    }

    @Override // X.C845880XGg
    public final void LIZJ(AbstractRunnableC845900XGi abstractRunnableC845900XGi) {
        abstractRunnableC845900XGi.LLILLL.removeMessages(1);
    }

    @Override // X.C845880XGg, com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        if (message == null) {
            return;
        }
        try {
            if (message.what == 1) {
                C845880XGg.LLILZLL.LIZLLL();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
