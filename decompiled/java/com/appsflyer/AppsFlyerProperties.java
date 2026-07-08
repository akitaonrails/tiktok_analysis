package com.appsflyer;

import X.C08FF;
import X.C786410Ut5;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1qSDK;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public class AppsFlyerProperties {
    public static AppsFlyerProperties instance;
    public String AFInAppEventParameterName;
    public boolean AFInAppEventType;
    public final Map<String, Object> AFKeystoreWrapper = new HashMap();
    public boolean valueOf = false;

    public static AppsFlyerProperties getInstance() {
        if (instance == null) {
            instance = new AppsFlyerProperties();
        }
        return instance;
    }

    public int getLogLevel() {
        return getInt("logLevel", AFLogger.LogLevel.NONE.getLevel());
    }

    public boolean isLogsDisabledCompletely() {
        return getBoolean("disableLogs", false);
    }

    public boolean isOtherSdkStringDisabled() {
        return getBoolean("disableOtherSdk", false);
    }

    public boolean isEnableLog() {
        return getLogLevel() > AFLogger.LogLevel.NONE.getLevel();
    }

    public enum EmailsCryptType {
        NONE(0),
        SHA256(3);

        public final int AFKeystoreWrapper;

        public final int getValue() {
            return this.AFKeystoreWrapper;
        }

        public static EmailsCryptType valueOf(String str) {
            return (EmailsCryptType) C08FF.LIZ(EmailsCryptType.class, str);
        }

        EmailsCryptType(int i) {
            this.AFKeystoreWrapper = i;
        }
    }

    private boolean valueOf() {
        return this.valueOf;
    }

    public final boolean AFKeystoreWrapper() {
        return this.AFInAppEventType;
    }

    public String getReferrer(AFd1qSDK aFd1qSDK) {
        String str = this.AFInAppEventParameterName;
        if (str != null) {
            return str;
        }
        if (getString("AF_REFERRER") != null) {
            return getString("AF_REFERRER");
        }
        return aFd1qSDK.AFKeystoreWrapper("referrer", (String) null);
    }

    public synchronized String getString(String str) {
        return (String) this.AFKeystoreWrapper.get(str);
    }

    public synchronized void loadProperties(AFd1qSDK aFd1qSDK) {
        if (valueOf()) {
            return;
        }
        String strAFKeystoreWrapper = aFd1qSDK.AFKeystoreWrapper("savedProperties", (String) null);
        if (strAFKeystoreWrapper != null) {
            AFLogger.afDebugLog("Loading properties..");
            try {
                JSONObject jSONObject = new JSONObject(strAFKeystoreWrapper);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (this.AFKeystoreWrapper.get(next) == null) {
                        this.AFKeystoreWrapper.put(next, JSONObjectProtectorUtils.getString(jSONObject, next));
                    }
                }
                String[] strArr = {"AppsFlyerKey", "custom_host", "custom_host_prefix", "advertiserIdEnabled", "advertiserId"};
                int i = 0;
                do {
                    this.AFKeystoreWrapper.remove(strArr[i]);
                    i++;
                } while (i < 5);
                saveProperties(aFd1qSDK);
                this.valueOf = true;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                AFLogger.afErrorLog("Failed loading properties", e);
            }
            AFLogger.afDebugLog("Done loading properties: " + this.valueOf);
        }
    }

    public synchronized void remove(String str) {
        this.AFKeystoreWrapper.remove(str);
    }

    public synchronized void saveProperties(AFd1qSDK aFd1qSDK) {
        this.AFKeystoreWrapper.remove("AppsFlyerKey");
        aFd1qSDK.AFInAppEventParameterName("savedProperties", C786410Ut5.J3(new JSONObject(this.AFKeystoreWrapper)));
    }

    public synchronized void setCustomData(String str) {
        this.AFKeystoreWrapper.put("additionalCustomData", str);
    }

    public synchronized void setUserEmails(String str) {
        this.AFKeystoreWrapper.put("userEmails", str);
    }

    public boolean getBoolean(String str, boolean z) {
        String string = getString(str);
        if (string == null) {
            return z;
        }
        return Boolean.parseBoolean(string);
    }

    public int getInt(String str, int i) {
        String string = getString(str);
        if (string == null) {
            return i;
        }
        return CastIntegerProtector.parseInt(string);
    }

    public long getLong(String str, long j) {
        String string = getString(str);
        if (string == null) {
            return j;
        }
        return CastLongProtector.parseLong(string);
    }

    public synchronized void set(String str, int i) {
        this.AFKeystoreWrapper.put(str, Integer.toString(i));
    }

    public synchronized void set(String str, long j) {
        this.AFKeystoreWrapper.put(str, Long.toString(j));
    }

    public synchronized void set(String str, boolean z) {
        this.AFKeystoreWrapper.put(str, Boolean.toString(z));
    }

    public synchronized void set(String str, String str2) {
        this.AFKeystoreWrapper.put(str, str2);
    }

    public synchronized void set(String str, String[] strArr) {
        this.AFKeystoreWrapper.put(str, strArr);
    }
}
