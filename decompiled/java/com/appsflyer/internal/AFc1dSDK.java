package com.appsflyer.internal;

import X.C1C7U;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import com.appsflyer.AFLogger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes31.dex */
public abstract class AFc1dSDK<T> {
    public final FutureTask<T> AFInAppEventParameterName = new FutureTask<>(new Callable<T>() { // from class: com.appsflyer.internal.AFc1dSDK.1
        @Override // java.util.concurrent.Callable
        public final T call() {
            C1C7U.LIZ("AFc1dSDK@6156.<field>$1");
            if (!AFc1dSDK.this.AFInAppEventParameterName()) {
                C1C7U.LIZIZ("AFc1dSDK@6156.<field>$1");
                return null;
            }
            T t = (T) AFc1dSDK.this.AFKeystoreWrapper();
            C1C7U.LIZIZ("AFc1dSDK@6156.<field>$1");
            return t;
        }
    });
    public final AFd1kSDK AFInAppEventType;
    public final String AFKeystoreWrapper;
    public final Context valueOf;
    public final String[] values;

    public final boolean AFInAppEventParameterName() {
        try {
            ProviderInfo providerInfoResolveContentProvider = this.valueOf.getPackageManager().resolveContentProvider(this.AFKeystoreWrapper, 128);
            if (providerInfoResolveContentProvider != null) {
                if (Arrays.asList(this.values).contains(AFb1uSDK.AFInAppEventParameterName(this.valueOf.getPackageManager(), ((PackageItemInfo) providerInfoResolveContentProvider).packageName))) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException | CertificateException e) {
            TryCatchGuardChecker.doCheck(e);
            AFLogger.afErrorLog(e.getMessage(), e, false, true);
            return false;
        }
    }

    public abstract T AFKeystoreWrapper();

    public T valueOf() {
        try {
            return this.AFInAppEventParameterName.get(500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e = e;
            TryCatchGuardChecker.doCheck(e);
            AFLogger.afErrorLog(e.getMessage(), e, false, true);
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            TryCatchGuardChecker.doCheck(e);
            AFLogger.afErrorLog(e.getMessage(), e, false, true);
            return null;
        } catch (TimeoutException e3) {
            TryCatchGuardChecker.doCheck(e3);
            AFLogger.afErrorLog(e3.getMessage(), e3, false, false);
            return null;
        }
    }

    public AFc1dSDK(Context context, AFd1kSDK aFd1kSDK, String str, String... strArr) {
        this.valueOf = context;
        this.AFKeystoreWrapper = str;
        this.values = strArr;
        this.AFInAppEventType = aFd1kSDK;
    }
}
