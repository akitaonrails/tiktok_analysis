package com.appsflyer.internal;

import X.C0WZX;
import X.C1C7U;
import X.C2204961BRm;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFi1hSDK;
import com.appsflyer.internal.AFi1nSDK;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;

/* JADX INFO: loaded from: classes31.dex */
public final class AFi1nSDK extends AFi1rSDK {
    public final AFd1kSDK AFInAppEventType;
    public final AFi1mSDK valueOf;

    public static /* synthetic */ void lambda$semisugar$valueOf$0(AFi1nSDK aFi1nSDK, Context context) {
        C1C7U.LIZ("AFi1nSDK@b7a4.values$1L");
        aFi1nSDK.valueOf(context);
        C1C7U.LIZIZ("AFi1nSDK@b7a4.values$1L");
    }

    private boolean AFInAppEventType(Context context) {
        if (!valueOf()) {
            AFLogger.INSTANCE.d(AFg1aSDK.REFERRER, "Huawei referrer collection disallowed by counter.");
            return false;
        }
        if (!this.valueOf.AFInAppEventParameterName(context)) {
            AFLogger.INSTANCE.d(AFg1aSDK.REFERRER, "Huawei referrer collection disallowed by missing content provider.");
            return false;
        }
        if (!this.valueOf.valueOf(context)) {
            AFLogger.INSTANCE.d(AFg1aSDK.REFERRER, "Huawei referrer collection disallowed by invalid content provider.");
            return false;
        }
        return true;
    }

    private /* synthetic */ void valueOf(Context context) {
        String message;
        this.e = System.currentTimeMillis();
        this.unregisterClient = AFi1hSDK.AFa1ySDK.STARTED;
        addObserver(new AFi1hSDK.AnonymousClass1());
        String str = ((PackageItemInfo) context.getPackageManager().resolveContentProvider("com.huawei.appmarket.commondata", 128)).packageName;
        this.AFInAppEventParameterName.put("api_ver", Long.valueOf(AFb1uSDK.values(context, str)));
        this.AFInAppEventParameterName.put("api_ver_name", AFb1uSDK.AFInAppEventType(context, str));
        Cursor cursorLJJJ = null;
        try {
            cursorLJJJ = C2204961BRm.LJJJ(context.getContentResolver(), Uri.parse("content://com.huawei.appmarket.commondata/item/5"), null, null, new String[]{context.getPackageName()}, null, new C0WZX("dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5bxsZuleyw==", new String[]{"01c45"}));
        } catch (Throwable th) {
            try {
                TryCatchGuardChecker.doCheck(th);
                this.AFInAppEventParameterName.put("response", "FEATURE_NOT_SUPPORTED");
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1aSDK aFg1aSDK = AFg1aSDK.REFERRER;
                if (th.getMessage() != null) {
                    message = th.getMessage();
                } else {
                    message = "";
                }
                aFLogger.e(aFg1aSDK, message, th, false, true);
                if (0 != 0) {
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                if (0 != 0) {
                    cursorLJJJ.close();
                }
                throw th2;
            }
        }
        if (cursorLJJJ != null) {
            if (cursorLJJJ.moveToFirst()) {
                this.AFInAppEventParameterName.put("response", "OK");
                this.AFInAppEventParameterName.put("referrer", cursorLJJJ.getString(0));
                this.AFInAppEventParameterName.put("click_ts", Long.valueOf(cursorLJJJ.getLong(1)));
                this.AFInAppEventParameterName.put("install_end_ts", Long.valueOf(cursorLJJJ.getLong(2)));
                if (cursorLJJJ.getColumnCount() > 3) {
                    this.AFInAppEventParameterName.put("install_begin_ts", Long.valueOf(cursorLJJJ.getLong(3)));
                    HashMap map = new HashMap();
                    String string = cursorLJJJ.getString(4);
                    if (string != null) {
                        map.put("track_id", string);
                    }
                    map.put("referrer_ex", cursorLJJJ.getString(5));
                    this.AFInAppEventParameterName.put("huawei_custom", map);
                }
            } else {
                this.AFInAppEventParameterName.put("response", "FEATURE_NOT_SUPPORTED");
            }
            cursorLJJJ.close();
            values();
        }
        this.AFInAppEventParameterName.put("response", "SERVICE_UNAVAILABLE");
        values();
    }

    @Override // com.appsflyer.internal.AFi1hSDK
    public final void values(final Context context) {
        if (!AFInAppEventType(context)) {
            return;
        }
        this.AFInAppEventType.values().execute(new Runnable() { // from class: X.13lB
            @Override // java.lang.Runnable
            public final void run() {
                AFi1nSDK.lambda$semisugar$valueOf$0(this.LL, context);
            }
        });
    }

    public AFi1nSDK(Runnable runnable, AFd1kSDK aFd1kSDK, AFi1mSDK aFi1mSDK) {
        super("store", "huawei", aFd1kSDK.AFInAppEventType(), runnable);
        this.AFInAppEventType = aFd1kSDK;
        this.valueOf = aFi1mSDK;
    }
}
