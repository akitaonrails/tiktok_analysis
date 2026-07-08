package androidx.core.app;

import X.C2188191AkT;
import X.C2214201BlK;
import X.C788530UwV;
import X.InterfaceC808420VnU;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes14.dex */
public abstract class FcmJobIntentService extends JobIntentService {
    public void androidx_core_app_FcmJobIntentService__attachBaseContext$___twin___(Context context) {
        super.attachBaseContext(context);
    }

    @Override // androidx.core.app.JobIntentService, android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        androidx_core_app_FcmJobIntentService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(this, context);
    }

    @Override // androidx.core.app.JobIntentService
    public InterfaceC808420VnU dequeueWork() {
        try {
            return super.dequeueWork();
        } catch (SecurityException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static void androidx_core_app_FcmJobIntentService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(FcmJobIntentService fcmJobIntentService, Context context) {
        if (!C2214201BlK.LJIIJJI && C788530UwV.LIZ("serviceAttachBaseContext")) {
            C2188191AkT.LIZJ();
        }
        fcmJobIntentService.androidx_core_app_FcmJobIntentService__attachBaseContext$___twin___(context);
    }
}
