package com.appsflyer.internal;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import kotlin.text.u;

/* JADX INFO: loaded from: classes31.dex */
public final class AFi1pSDK implements AFi1qSDK {
    public String AFInAppEventParameterName;

    public static String AFInAppEventType(Activity activity) {
        Intent intent;
        String string;
        if (activity != null) {
            intent = activity.getIntent();
        } else {
            intent = null;
        }
        Uri uriAFInAppEventType = AFc1bSDK.AFInAppEventType(intent);
        if (uriAFInAppEventType == null || (string = uriAFInAppEventType.toString()) == null) {
            string = "";
        }
        if (AFInAppEventType(string)) {
            return null;
        }
        return string;
    }

    @Override // com.appsflyer.internal.AFi1qSDK
    public final String AFInAppEventParameterName(Activity activity) {
        String str = this.AFInAppEventParameterName;
        this.AFInAppEventParameterName = null;
        if (str != null && str.length() != 0) {
            return str;
        }
        return AFInAppEventType(activity);
    }

    @Override // com.appsflyer.internal.AFi1qSDK
    public final String valueOf(Activity activity) {
        Uri referrer;
        String string;
        if (activity == null || activity.getIntent() == null || (referrer = activity.getReferrer()) == null || (string = referrer.toString()) == null) {
            return "";
        }
        return string;
    }

    @Override // com.appsflyer.internal.AFi1qSDK
    public final void values(Activity activity) {
        String str = this.AFInAppEventParameterName;
        if (str == null || str.length() == 0) {
            this.AFInAppEventParameterName = AFInAppEventType(activity);
        }
    }

    public static boolean AFInAppEventType(String str) {
        return u.LJJIIJZLJL(str, "android-app://", false);
    }
}
