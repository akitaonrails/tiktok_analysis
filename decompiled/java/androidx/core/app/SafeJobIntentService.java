package androidx.core.app;

import X.C2188191AkT;
import X.C2214201BlK;
import X.C788530UwV;
import X.InterfaceC808420VnU;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes14.dex */
public abstract class SafeJobIntentService extends JobIntentService {
    @Override // androidx.core.app.JobIntentService
    public final InterfaceC808420VnU dequeueWork() {
        try {
            return super.dequeueWork();
        } catch (SecurityException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // androidx.core.app.JobIntentService, android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        if (!C2214201BlK.LJIIJJI && C788530UwV.LIZ("serviceAttachBaseContext")) {
            C2188191AkT.LIZJ();
        }
        super.attachBaseContext(context);
    }
}
