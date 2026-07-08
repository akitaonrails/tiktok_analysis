package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.09BV, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09BV {
    @InterfaceC1294060jmO
    public static final ICreationAsyncTaskManager LIZ() {
        try {
            return (ICreationAsyncTaskManager) ServiceManager.get().getService(ICreationAsyncTaskManager.class);
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
