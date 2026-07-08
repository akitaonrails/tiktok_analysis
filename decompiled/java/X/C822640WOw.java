package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.security.IClientSecurityService;

/* JADX INFO: renamed from: X.0WOw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C822640WOw implements C1BMV {
    public final BPEAHandler LL = new BPEAHandler(Looper.getMainLooper());

    @Override // X.C1BMV
    public final void release() {
        this.LL.removeCallbacksAndMessages(null);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        ((IClientSecurityService) ServiceManager.get().getService(IClientSecurityService.class)).LJIIJ(runnable, new ExecutorC822630WOv(this));
    }
}
