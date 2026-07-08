package com.appsflyer.internal;

import X.C1C7U;
import X.C2179971ATj;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes31.dex */
public final class AFi1iSDK extends AFi1hSDK {
    public final ProviderInfo AFInAppEventType;
    public final AFd1kSDK valueOf;

    @Override // com.appsflyer.internal.AFi1hSDK
    public final void values(final Context context) {
        this.valueOf.values().execute(new Runnable() { // from class: com.appsflyer.internal.AFi1iSDK.1
            @Override // java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("AFi1iSDK@fd81.values$1");
                com_appsflyer_internal_AFi1iSDK$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("AFi1iSDK@fd81.values$1");
            }

            /* JADX WARN: Removed duplicated region for block: B:31:0x00a9  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x00b1  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x0127  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x013a  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void com_appsflyer_internal_AFi1iSDK$1__run$___twin___() {
                /*
                    Method dump skipped, instruction units count: 319
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFi1iSDK.AnonymousClass1.com_appsflyer_internal_AFi1iSDK$1__run$___twin___():void");
            }

            public static void com_appsflyer_internal_AFi1iSDK$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                try {
                    anonymousClass1.com_appsflyer_internal_AFi1iSDK$1__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        });
    }

    public static ContentProviderClient AFInAppEventParameterName(Context context, Uri uri) {
        try {
            return context.getContentResolver().acquireUnstableContentProviderClient(uri);
        } catch (SecurityException e) {
            TryCatchGuardChecker.doCheck(e);
            AFLogger.INSTANCE.e(AFg1aSDK.PREINSTALL, "Failed to acquire unstable content providerClient due to SecurityException", e, false);
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            AFLogger.INSTANCE.e(AFg1aSDK.PREINSTALL, "Failed to acquire unstable content providerClient due to unexpected throwable", th, false);
            return null;
        }
    }

    public AFi1iSDK(ProviderInfo providerInfo, Runnable runnable, AFd1kSDK aFd1kSDK) {
        super("af_referrer", providerInfo.authority, runnable);
        this.valueOf = aFd1kSDK;
        this.AFInAppEventType = providerInfo;
    }
}
