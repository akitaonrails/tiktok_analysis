package com.appsflyer.share;

import X.C786410Ut5;
import android.content.Context;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.internal.AFb1aSDK;
import com.appsflyer.internal.AFb1vSDK;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFe1cSDK;
import com.appsflyer.internal.AFe1cSDK.AnonymousClass2;
import com.appsflyer.internal.AFf1rSDK;
import com.appsflyer.internal.AFj1qSDK;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes31.dex */
public class LinkGenerator {
    public String AFInAppEventParameterName;
    public String AFInAppEventType;
    public String AFKeystoreWrapper;
    public String AFLogger;
    public String afInfoLog;
    public String d;
    public String e;
    public String registerClient;
    public String unregisterClient;
    public final Map<String, String> v = new HashMap();
    public String valueOf;
    public final String values;
    public String w;

    public interface ResponseListener {
        void onResponse(String str);

        void onResponseError(String str);
    }

    private Map<String, String> values() {
        HashMap map = new HashMap();
        map.put("pid", this.values);
        String str = this.registerClient;
        if (str != null) {
            map.put("af_referrer_uid", str);
        }
        String str2 = this.AFInAppEventType;
        if (str2 != null) {
            map.put("af_channel", str2);
        }
        String str3 = this.AFLogger;
        if (str3 != null) {
            map.put("af_referrer_customer_id", str3);
        }
        String str4 = this.AFInAppEventParameterName;
        if (str4 != null) {
            map.put("c", str4);
        }
        String str5 = this.unregisterClient;
        if (str5 != null) {
            map.put("af_referrer_name", str5);
        }
        String str6 = this.d;
        if (str6 != null) {
            map.put("af_referrer_image_url", str6);
        }
        if (this.afInfoLog != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.afInfoLog);
            String str7 = this.e;
            if (str7 != null) {
                this.e = str7.replaceFirst("^[/]", "");
                sb.append(this.afInfoLog.endsWith("/") ? "" : "/");
                sb.append(this.e);
            }
            map.put("af_dp", sb.toString());
        }
        for (Map.Entry<String, String> entry : this.v.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
        return AFb1aSDK.valueOf(map);
    }

    public String generateLink() {
        StringBuilder sb = new StringBuilder();
        String str = this.AFKeystoreWrapper;
        if (str == null || !str.startsWith("http")) {
            sb.append(C786410Ut5.j4(AFj1qSDK.AFKeystoreWrapper, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), AFb1vSDK.AFKeystoreWrapper().getHostName()}));
        } else {
            sb.append(this.AFKeystoreWrapper);
        }
        if (this.valueOf != null) {
            sb.append('/');
            sb.append(this.valueOf);
        }
        Map<String, String> mapValues = values();
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, String> entry : mapValues.entrySet()) {
            if (sb2.length() == 0) {
                sb2.append('?');
            } else {
                sb2.append('&');
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
        }
        sb.append(sb2.toString());
        return sb.toString();
    }

    public Map<String, String> getUserParams() {
        return new HashMap(this.v);
    }

    public String getBrandDomain() {
        return this.w;
    }

    public String getCampaign() {
        return this.AFInAppEventParameterName;
    }

    public String getChannel() {
        return this.AFInAppEventType;
    }

    public String getMediaSource() {
        return this.values;
    }

    public LinkGenerator(String str) {
        this.values = str;
    }

    public LinkGenerator addParameters(Map<String, String> map) {
        if (map != null) {
            this.v.putAll(map);
        }
        return this;
    }

    public LinkGenerator setBaseDeeplink(String str) {
        this.afInfoLog = str;
        return this;
    }

    public LinkGenerator setBrandDomain(String str) {
        this.w = str;
        return this;
    }

    public LinkGenerator setCampaign(String str) {
        this.AFInAppEventParameterName = str;
        return this;
    }

    public LinkGenerator setChannel(String str) {
        this.AFInAppEventType = str;
        return this;
    }

    public LinkGenerator setDeeplinkPath(String str) {
        this.e = str;
        return this;
    }

    public LinkGenerator setReferrerCustomerId(String str) {
        this.AFLogger = str;
        return this;
    }

    public LinkGenerator setReferrerImageURL(String str) {
        this.d = str;
        return this;
    }

    public LinkGenerator setReferrerName(String str) {
        this.unregisterClient = str;
        return this;
    }

    public LinkGenerator setReferrerUID(String str) {
        this.registerClient = str;
        return this;
    }

    public LinkGenerator addParameter(String str, String str2) {
        this.v.put(str, str2);
        return this;
    }

    public void generateLink(Context context, ResponseListener responseListener) {
        String string = AppsFlyerProperties.getInstance().getString("oneLinkSlug");
        String str = this.w;
        Map<String, String> mapValues = values();
        if (AppsFlyerProperties.getInstance().getBoolean("waitForCustomerId", false)) {
            return;
        }
        AFb1vSDK.AFKeystoreWrapper().valueOf(context);
        AFd1kSDK aFd1kSDKAFInAppEventParameterName = AFb1vSDK.AFKeystoreWrapper().AFInAppEventParameterName();
        AFf1rSDK aFf1rSDK = new AFf1rSDK(aFd1kSDKAFInAppEventParameterName, UUID.randomUUID(), string, mapValues, str, responseListener, this);
        AFe1cSDK aFe1cSDKAfInfoLog = aFd1kSDKAFInAppEventParameterName.afInfoLog();
        aFe1cSDKAfInfoLog.valueOf.execute(aFe1cSDKAfInfoLog.new AnonymousClass2(aFf1rSDK));
    }

    public void generateLink(Context context, final CreateOneLinkHttpTask.ResponseListener responseListener) {
        generateLink(context, new ResponseListener() { // from class: com.appsflyer.share.LinkGenerator.1
            @Override // com.appsflyer.share.LinkGenerator.ResponseListener
            public final void onResponse(String str) {
                responseListener.onResponse(str);
            }

            @Override // com.appsflyer.share.LinkGenerator.ResponseListener
            public final void onResponseError(String str) {
                responseListener.onResponseError(str);
            }
        });
    }

    public LinkGenerator setBaseURL(String str, String str2, String str3) {
        if (str != null && str.length() > 0) {
            if (str2 == null || str2.length() < 5) {
                str2 = "go.onelink.me";
            }
            this.AFKeystoreWrapper = C786410Ut5.j4("https://%s/%s", new Object[]{str2, str});
            return this;
        }
        this.AFKeystoreWrapper = C786410Ut5.j4("https://%s/%s", new Object[]{C786410Ut5.j4("%sapp.%s", new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), AFb1vSDK.AFKeystoreWrapper().getHostName()}), str3});
        return this;
    }
}
