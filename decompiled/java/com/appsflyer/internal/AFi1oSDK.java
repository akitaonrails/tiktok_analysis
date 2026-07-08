package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.os.Build;
import com.appsflyer.AFLogger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.huawei.appgallery.serviceverifykit.api.ServiceVerifyKit;

/* JADX INFO: loaded from: classes31.dex */
public final class AFi1oSDK implements AFi1mSDK {
    public static ProviderInfo AFInAppEventType(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                return context.getPackageManager().resolveContentProvider("com.huawei.appmarket.commondata", PackageManager.ComponentInfoFlags.of(0L));
            }
            return context.getPackageManager().resolveContentProvider("com.huawei.appmarket.commondata", 0);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1aSDK aFg1aSDK = AFg1aSDK.REFERRER;
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            AFg1fSDK.e$default(aFLogger, aFg1aSDK, message, th, false, false, false, false, 96, null);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFi1mSDK
    public final boolean AFInAppEventParameterName(Context context) {
        if (AFInAppEventType(context) != null) {
            return true;
        }
        return false;
    }

    @Override // com.appsflyer.internal.AFi1mSDK
    public final boolean valueOf(Context context) {
        ProviderInfo providerInfoAFInAppEventType = AFInAppEventType(context);
        if (providerInfoAFInAppEventType == null) {
            return false;
        }
        try {
            return new ServiceVerifyKit.PkgVerifyBuilder(context).setPackageName(((PackageItemInfo) providerInfoAFInAppEventType).packageName).setCertChainKey("com.huawei.appgallery.sign_certchain").setCertSignerKey("com.huawei.appgallery.fingerprint_signature").addLegacyInfo("com.huawei.appmarket", "FFE391E0EA186D0734ED601E4E70E3224B7309D48E2075BAC46D8C667EAE7212").addLegacyInfo("com.huawei.appmarket", "3BAF59A2E5331C30675FAB35FF5FFF0D116142D3D4664F1C3CB804068B40614F").isValidPkg();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1aSDK aFg1aSDK = AFg1aSDK.REFERRER;
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            AFg1fSDK.e$default(aFLogger, aFg1aSDK, message, th, false, false, false, false, 96, null);
            return false;
        }
    }
}
