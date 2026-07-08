package com.appsflyer;

import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C786410Ut5;
import X.C788530UwV;
import X.C817700W5w;
import android.content.Context;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;

/* JADX INFO: loaded from: classes14.dex */
public class FirebaseMessagingServiceListener extends FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService, com.google.firebase.messaging.EnhancedIntentService, android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        com_appsflyer_FirebaseMessagingServiceListener_com_ss_android_ugc_aweme_nxreword_proxy_NxStringLancet_attachBaseContextWrapper(this, context);
    }

    public void com_appsflyer_FirebaseMessagingServiceListener__attachBaseContext$___twin___(Context context) {
        super.attachBaseContext(context);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        AppsFlyerLib.getInstance().updateServerUninstallToken(C786410Ut5.N3(this), str);
    }

    public static void com_appsflyer_FirebaseMessagingServiceListener_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(FirebaseMessagingServiceListener firebaseMessagingServiceListener, Context context) {
        if (!C2214201BlK.LJIIJJI && C788530UwV.LIZ("serviceAttachBaseContext")) {
            C2188191AkT.LIZJ();
        }
        firebaseMessagingServiceListener.com_appsflyer_FirebaseMessagingServiceListener__attachBaseContext$___twin___(context);
    }

    public static void com_appsflyer_FirebaseMessagingServiceListener_com_ss_android_ugc_aweme_nxreword_proxy_NxStringLancet_attachBaseContextWrapper(FirebaseMessagingServiceListener firebaseMessagingServiceListener, Context context) {
        if (NxRewordManager.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachBaseContextWrapper: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
            C2188811AlT.LIZIZ(sbLIZ);
            context = new C817700W5w(context, false);
        }
        com_appsflyer_FirebaseMessagingServiceListener_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(firebaseMessagingServiceListener, context);
    }
}
