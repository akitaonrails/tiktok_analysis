package com.appsflyer.internal;

import android.content.SharedPreferences;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public final class AFd1tSDK implements AFd1qSDK {
    public final SharedPreferences AFKeystoreWrapper;

    public AFd1tSDK(SharedPreferences sharedPreferences) {
        this.AFKeystoreWrapper = sharedPreferences;
    }

    @Override // com.appsflyer.internal.AFd1qSDK
    public final boolean AFInAppEventType(String str) {
        try {
            return this.AFKeystoreWrapper.getBoolean(str, false);
        } catch (ClassCastException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFd1qSDK
    public final void AFKeystoreWrapper(String str) {
        this.AFKeystoreWrapper.edit().remove(str).apply();
    }

    @Override // com.appsflyer.internal.AFd1qSDK
    public final boolean values(String str) {
        return this.AFKeystoreWrapper.contains(str);
    }

    @Override // com.appsflyer.internal.AFd1qSDK
    public final void AFInAppEventParameterName(String str, int i) {
        this.AFKeystoreWrapper.edit().putInt(str, i).apply();
    }

    @Override // com.appsflyer.internal.AFd1qSDK
    public final void AFKeystoreWrapper(String str, long j) {
        this.AFKeystoreWrapper.edit().putLong(str, j).apply();
    }

    @Override // com.appsflyer.internal.AFd1qSDK
    public final void valueOf(String str, boolean z) {
        this.AFKeystoreWrapper.edit().putBoolean(str, z).apply();
    }

    @Override // com.appsflyer.internal.AFd1qSDK
    public final long values(String str, long j) {
        try {
            return this.AFKeystoreWrapper.getLong(str, j);
        } catch (ClassCastException e) {
            TryCatchGuardChecker.doCheck(e);
            return j;
        }
    }

    @Override // com.appsflyer.internal.AFd1qSDK
    public final void AFInAppEventParameterName(String str, String str2) {
        this.AFKeystoreWrapper.edit().putString(str, str2).apply();
    }

    @Override // com.appsflyer.internal.AFd1qSDK
    public final String AFKeystoreWrapper(String str, String str2) {
        try {
            return this.AFKeystoreWrapper.getString(str, str2);
        } catch (ClassCastException e) {
            TryCatchGuardChecker.doCheck(e);
            return str2;
        }
    }

    @Override // com.appsflyer.internal.AFd1qSDK
    public final int valueOf(String str, int i) {
        try {
            return this.AFKeystoreWrapper.getInt(str, i);
        } catch (ClassCastException e) {
            TryCatchGuardChecker.doCheck(e);
            return i;
        }
    }
}
