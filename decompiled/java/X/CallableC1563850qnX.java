package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.launcher.service.launcher.ILauncherTaskApi;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.0qnX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class CallableC1563850qnX implements Callable<CallableC1563850qnX> {
    @Override // java.util.concurrent.Callable
    public final CallableC1563850qnX call() {
        C1C7U.LIZ("MainContainerAssemInitTask@d6ac.call");
        C1563860qnY.LIZIZ = false;
        C1563860qnY.LIZ = new C804220Vgi();
        ServiceManager.get().getService(ILauncherTaskApi.class);
        C1C7U.LIZIZ("MainContainerAssemInitTask@d6ac.call");
        return this;
    }
}
