package com.appsflyer.internal;

import X.C1954807lC;
import X.C1C7U;
import android.content.Context;
import com.appsflyer.internal.AFi1gSDK;
import com.appsflyer.internal.AFi1jSDK;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes31.dex */
public final class AFi1jSDK extends AFi1rSDK {
    public final AFd1sSDK AFInAppEventType;
    public final Runnable AFLogger;
    public String i;
    public final AFi1fSDK registerClient;
    public final ExecutorService valueOf;

    public /* synthetic */ class AFa1uSDK {
        public static final /* synthetic */ int[] values;

        static {
            int[] iArr = new int[AFi1fSDK.values().length];
            iArr[AFi1fSDK.FACEBOOK.ordinal()] = 1;
            iArr[AFi1fSDK.INSTAGRAM.ordinal()] = 2;
            values = iArr;
        }
    }

    public static /* synthetic */ void lambda$semisugar$AFKeystoreWrapper$0(AFi1jSDK aFi1jSDK, Context context) {
        C1C7U.LIZ("AFi1jSDK@8922.values$1L");
        AFKeystoreWrapper(aFi1jSDK, context);
        C1C7U.LIZIZ("AFi1jSDK@8922.values$1L");
    }

    private final boolean AFInAppEventParameterName(Context context) {
        int i = AFa1uSDK.values[this.registerClient.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return valueOf(context);
            }
            throw new C1954807lC();
        }
        return AFKeystoreWrapper(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[PHI: r1
      0x0043: PHI (r1v6 java.lang.String) = (r1v5 java.lang.String), (r1v3 java.lang.String), (r1v1 java.lang.String), (r1v1 java.lang.String) binds: [B:19:0x003c, B:15:0x002c, B:11:0x001c, B:8:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean AFInAppEventType(android.content.Context r6) {
        /*
            r5 = this;
            boolean r0 = r5.valueOf()
            r4 = 0
            if (r0 != 0) goto L8
            return r4
        L8:
            com.appsflyer.internal.AFd1sSDK r1 = r5.AFInAppEventType
            java.lang.String r0 = "com.facebook.sdk.ApplicationId"
            java.lang.String r1 = r1.AFInAppEventType(r0)
            r3 = 1
            if (r1 == 0) goto L19
            int r0 = r1.length()
            if (r0 != 0) goto L43
        L19:
            r2 = 0
            if (r3 != 0) goto L1e
            if (r1 != 0) goto L43
        L1e:
            com.appsflyer.internal.AFd1sSDK r1 = r5.AFInAppEventType
            java.lang.String r0 = "facebook_application_id"
            java.lang.String r1 = r1.AFKeystoreWrapper(r0)
            if (r1 == 0) goto L2e
            int r0 = r1.length()
            if (r0 != 0) goto L43
        L2e:
            com.appsflyer.internal.AFd1sSDK r1 = r5.AFInAppEventType
            java.lang.String r0 = "com.appsflyer.FacebookApplicationId"
            java.lang.String r1 = r1.AFInAppEventType(r0)
            if (r1 == 0) goto L3e
            int r0 = r1.length()
            if (r0 != 0) goto L43
        L3e:
            r5.i = r2
            if (r2 != 0) goto L45
            return r4
        L43:
            r2 = r1
            goto L3e
        L45:
            boolean r0 = r5.AFInAppEventParameterName(r6)
            if (r0 != 0) goto L4c
            return r4
        L4c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFi1jSDK.AFInAppEventType(android.content.Context):boolean");
    }

    public static boolean AFKeystoreWrapper(Context context) {
        if (context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.InstallReferrerProvider", 0) == null) {
            return false;
        }
        return true;
    }

    public static boolean valueOf(Context context) {
        if (context.getPackageManager().resolveContentProvider("com.instagram.contentprovider.InstallReferrerProvider", 0) == null) {
            return false;
        }
        return true;
    }

    @Override // com.appsflyer.internal.AFi1hSDK
    public final void values(final Context context) {
        if (!AFInAppEventType(context)) {
            this.AFLogger.run();
        } else {
            this.valueOf.execute(new Runnable() { // from class: X.13lA
                @Override // java.lang.Runnable
                public final void run() {
                    AFi1jSDK.lambda$semisugar$AFKeystoreWrapper$0(this.LL, context);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005a A[Catch: all -> 0x0127, TRY_LEAVE, TryCatch #2 {all -> 0x0127, blocks: (B:3:0x001f, B:6:0x0031, B:8:0x0037, B:15:0x005a, B:9:0x0042, B:10:0x0047, B:11:0x0048, B:13:0x004e), top: B:90:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015e A[PHI: r14
      0x015e: PHI (r14v3 android.content.ContentProviderClient) = 
      (r14v1 android.content.ContentProviderClient)
      (r14v4 android.content.ContentProviderClient)
      (r14v4 android.content.ContentProviderClient)
     binds: [B:74:0x014f, B:81:0x015c, B:47:0x011d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016c A[PHI: r14
      0x016c: PHI (r14v2 android.content.ContentProviderClient) = 
      (r14v1 android.content.ContentProviderClient)
      (r14v4 android.content.ContentProviderClient)
      (r14v4 android.content.ContentProviderClient)
     binds: [B:76:0x0152, B:85:0x016a, B:49:0x0120] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AFKeystoreWrapper(com.appsflyer.internal.AFi1jSDK r18, android.content.Context r19) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFi1jSDK.AFKeystoreWrapper(com.appsflyer.internal.AFi1jSDK, android.content.Context):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AFi1jSDK(AFd1sSDK aFd1sSDK, ExecutorService executorService, AFi1fSDK aFi1fSDK, Runnable runnable, Runnable runnable2) {
        String str;
        int i = AFi1gSDK.AFa1vSDK.AFInAppEventType[aFi1fSDK.ordinal()];
        if (i != 1) {
            if (i == 2) {
                str = "instagram";
            } else {
                throw new C1954807lC();
            }
        } else {
            str = "facebook";
        }
        super("app", str, aFd1sSDK, runnable);
        this.AFInAppEventType = aFd1sSDK;
        this.valueOf = executorService;
        this.registerClient = aFi1fSDK;
        this.AFLogger = runnable2;
    }
}
