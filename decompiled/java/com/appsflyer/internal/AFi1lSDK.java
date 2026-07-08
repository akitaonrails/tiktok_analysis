package com.appsflyer.internal;

import X.C1C7U;
import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFi1hSDK;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes31.dex */
public class AFi1lSDK extends AFi1rSDK {
    public final ExecutorService AFInAppEventType;
    public final Map<String, Object> valueOf;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFi1lSDK$2, reason: invalid class name */
    public final class AnonymousClass2 implements InstallReferrerStateListener {
        public final /* synthetic */ Context val$context;
        public final /* synthetic */ InstallReferrerClient val$referrerClient;

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void onInstallReferrerServiceDisconnected() {
            AFLogger.INSTANCE.d(AFg1aSDK.REFERRER, "Install Referrer service disconnected");
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void onInstallReferrerSetupFinished(final int i) {
            ExecutorService executorService = AFi1lSDK.this.AFInAppEventType;
            final InstallReferrerClient installReferrerClient = this.val$referrerClient;
            final Context context = this.val$context;
            executorService.execute(new Runnable() { // from class: X.13l9
                @Override // java.lang.Runnable
                public final void run() {
                    this.LL.lambda$onInstallReferrerSetupFinished$0(installReferrerClient, context, i);
                }
            });
        }

        public AnonymousClass2(InstallReferrerClient installReferrerClient, Context context) {
            this.val$referrerClient = installReferrerClient;
            this.val$context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onInstallReferrerSetupFinished$0(InstallReferrerClient installReferrerClient, Context context, int i) {
            C1C7U.LIZ("AFi1lSDK@a063.values$1$onInstallReferrerSetupFinished$1L");
            AFi1lSDK.this.valueOf(installReferrerClient, context, i);
            C1C7U.LIZIZ("AFi1lSDK@a063.values$1$onInstallReferrerSetupFinished$1L");
        }
    }

    private boolean valueOf(Context context) {
        if (!valueOf()) {
            return false;
        }
        try {
            Class.forName("com.android.installreferrer.api.InstallReferrerClient");
            if (AFb1uSDK.AFInAppEventParameterName(context, "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE")) {
                AFLogger.INSTANCE.d(AFg1aSDK.REFERRER, "Install referrer is allowed");
                return true;
            }
            AFLogger.INSTANCE.d(AFg1aSDK.REFERRER, "Install referrer is not allowed");
            return false;
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            AFLogger.afErrorLogForExcManagerOnly("InstallReferrerClient not found", e);
            AFLogger.INSTANCE.v(AFg1aSDK.REFERRER, "Class com.android.installreferrer.api.InstallReferrerClient not found");
            return false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            AFLogger.INSTANCE.e(AFg1aSDK.REFERRER, "An error occurred while trying to verify manifest : ".concat("com.android.installreferrer.api.InstallReferrerClient"), th);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFi1hSDK
    public final void values(Context context) {
        if (!valueOf(context)) {
            return;
        }
        this.e = System.currentTimeMillis();
        this.unregisterClient = AFi1hSDK.AFa1ySDK.STARTED;
        addObserver(new AFi1hSDK.AnonymousClass1());
        try {
            InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(context).build();
            AFLogger.INSTANCE.d(AFg1aSDK.REFERRER, "Connecting to Install Referrer Library...");
            installReferrerClientBuild.startConnection(new AnonymousClass2(installReferrerClientBuild, context));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            AFLogger.INSTANCE.e(AFg1aSDK.REFERRER, "referrerClient -> startConnection", th);
        }
    }

    public AFi1lSDK(Runnable runnable, ExecutorService executorService, AFd1sSDK aFd1sSDK) {
        super("store", "google", aFd1sSDK, runnable);
        this.valueOf = new HashMap();
        this.AFInAppEventType = executorService;
    }

    public final void valueOf(InstallReferrerClient installReferrerClient, Context context, int i) {
        this.valueOf.put("code", String.valueOf(i));
        this.AFInAppEventParameterName.put("api_ver", Long.valueOf(AFb1uSDK.values(context, "com.android.vending")));
        this.AFInAppEventParameterName.put("api_ver_name", AFb1uSDK.AFInAppEventType(context, "com.android.vending"));
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            AFLogger.INSTANCE.w(AFg1aSDK.REFERRER, "responseCode not found.");
                        } else {
                            AFLogger.INSTANCE.w(AFg1aSDK.REFERRER, "InstallReferrer DEVELOPER_ERROR");
                            this.AFInAppEventParameterName.put("response", "DEVELOPER_ERROR");
                        }
                    } else {
                        AFLogger.INSTANCE.w(AFg1aSDK.REFERRER, "InstallReferrer FEATURE_NOT_SUPPORTED");
                        this.AFInAppEventParameterName.put("response", "FEATURE_NOT_SUPPORTED");
                    }
                } else {
                    this.AFInAppEventParameterName.put("response", "SERVICE_UNAVAILABLE");
                    AFLogger.INSTANCE.w(AFg1aSDK.REFERRER, "InstallReferrer not supported");
                }
            } else {
                this.AFInAppEventParameterName.put("response", "OK");
                try {
                    AFLogger aFLogger = AFLogger.INSTANCE;
                    AFg1aSDK aFg1aSDK = AFg1aSDK.REFERRER;
                    aFLogger.d(aFg1aSDK, "InstallReferrer connected");
                    if (installReferrerClient.isReady()) {
                        ReferrerDetails installReferrer = installReferrerClient.getInstallReferrer();
                        String installReferrer2 = installReferrer.getInstallReferrer();
                        if (installReferrer2 != null) {
                            this.valueOf.put("val", installReferrer2);
                            this.AFInAppEventParameterName.put("referrer", installReferrer2);
                        }
                        long referrerClickTimestampSeconds = installReferrer.getReferrerClickTimestampSeconds();
                        this.valueOf.put("clk", Long.toString(referrerClickTimestampSeconds));
                        this.AFInAppEventParameterName.put("click_ts", Long.valueOf(referrerClickTimestampSeconds));
                        long installBeginTimestampSeconds = installReferrer.getInstallBeginTimestampSeconds();
                        this.valueOf.put("install", Long.toString(installBeginTimestampSeconds));
                        this.AFInAppEventParameterName.put("install_begin_ts", Long.valueOf(installBeginTimestampSeconds));
                        HashMap map = new HashMap();
                        try {
                            boolean googlePlayInstantParam = installReferrer.getGooglePlayInstantParam();
                            this.valueOf.put("instant", Boolean.valueOf(googlePlayInstantParam));
                            map.put("instant", Boolean.valueOf(googlePlayInstantParam));
                        } catch (NoSuchMethodError e) {
                            TryCatchGuardChecker.doCheck(e);
                            AFLogger.afErrorLogForExcManagerOnly("getGooglePlayInstantParam not exist", e);
                        }
                        try {
                            map.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                            map.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                            map.put("install_version", installReferrer.getInstallVersion());
                        } catch (NoSuchMethodError e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            AFLogger.INSTANCE.e(AFg1aSDK.REFERRER, "some method not exist", e2, false, false);
                        }
                        if (!map.isEmpty()) {
                            this.AFInAppEventParameterName.put("google_custom", map);
                        }
                        installReferrerClient.endConnection();
                    } else {
                        aFLogger.w(aFg1aSDK, "ReferrerClient: InstallReferrer is not ready");
                        this.valueOf.put("err", "ReferrerClient: InstallReferrer is not ready");
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    AFLogger aFLogger2 = AFLogger.INSTANCE;
                    AFg1aSDK aFg1aSDK2 = AFg1aSDK.REFERRER;
                    aFLogger2.w(aFg1aSDK2, "Failed to get install referrer: " + th.getMessage());
                    this.valueOf.put("err", th.getMessage());
                    aFLogger2.e(aFg1aSDK2, "Failed to get install referrer", th, false, false);
                }
            }
        } else {
            AFLogger.INSTANCE.w(AFg1aSDK.REFERRER, "InstallReferrer SERVICE_DISCONNECTED");
            this.AFInAppEventParameterName.put("response", "SERVICE_DISCONNECTED");
        }
        AFLogger.INSTANCE.d(AFg1aSDK.REFERRER, "Install Referrer collected locally");
        values();
    }
}
