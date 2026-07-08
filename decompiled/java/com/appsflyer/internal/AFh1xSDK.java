package com.appsflyer.internal;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: loaded from: classes31.dex */
public final class AFh1xSDK {
    public final String AFInAppEventParameterName;
    public final String AFInAppEventType;
    public final Intent values;

    public AFh1xSDK(Activity activity, AFi1qSDK aFi1qSDK) {
        this.values = activity.getIntent();
        this.AFInAppEventType = aFi1qSDK.valueOf(activity);
        this.AFInAppEventParameterName = aFi1qSDK.AFInAppEventParameterName(activity);
    }
}
