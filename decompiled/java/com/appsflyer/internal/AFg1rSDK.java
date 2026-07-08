package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class AFg1rSDK {
    public final String AFInAppEventParameterName;
    public final Map<String, Object> AFInAppEventType = new LinkedHashMap();
    public final PackageManager AFKeystoreWrapper;

    public final Map<String, Object> values() {
        InstallSourceInfo installSourceInfo;
        String installerPackageName;
        if (this.AFInAppEventType.isEmpty()) {
            try {
                PackageManager packageManager = this.AFKeystoreWrapper;
                if (packageManager != null && (installerPackageName = packageManager.getInstallerPackageName(this.AFInAppEventParameterName)) != null) {
                    this.AFInAppEventType.put("installer_package", installerPackageName);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (Build.VERSION.SDK_INT >= 30) {
                Map<String, Object> map = this.AFInAppEventType;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String str = this.AFInAppEventParameterName;
                PackageManager packageManager2 = this.AFKeystoreWrapper;
                if (packageManager2 != null && (installSourceInfo = packageManager2.getInstallSourceInfo(str)) != null) {
                    linkedHashMap = new LinkedHashMap();
                    String initiatingPackageName = installSourceInfo.getInitiatingPackageName();
                    if (initiatingPackageName != null) {
                        linkedHashMap.put("initiating_package", initiatingPackageName);
                    }
                    String installingPackageName = installSourceInfo.getInstallingPackageName();
                    if (installingPackageName != null) {
                        linkedHashMap.put("installing_package", installingPackageName);
                    }
                    String originatingPackageName = installSourceInfo.getOriginatingPackageName();
                    if (originatingPackageName != null) {
                        linkedHashMap.put("originating_package", originatingPackageName);
                    }
                }
                map.put("install_source_info", linkedHashMap);
            }
        }
        return this.AFInAppEventType;
    }

    public AFg1rSDK(AFd1lSDK aFd1lSDK, AFd1sSDK aFd1sSDK) {
        PackageManager packageManager;
        Context context = aFd1lSDK.AFKeystoreWrapper;
        if (context != null) {
            packageManager = context.getPackageManager();
        } else {
            packageManager = null;
        }
        this.AFKeystoreWrapper = packageManager;
        this.AFInAppEventParameterName = aFd1sSDK.valueOf.AFKeystoreWrapper.getPackageName();
    }
}
