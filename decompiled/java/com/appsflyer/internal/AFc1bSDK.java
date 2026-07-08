package com.appsflyer.internal;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import com.appsflyer.internal.AFj1ySDK.AnonymousClass1;
import com.bytedance.mt.protector.impl.UriProtector;

/* JADX INFO: loaded from: classes31.dex */
public final class AFc1bSDK {
    public static Uri AFInAppEventType(Intent intent) {
        if (intent == null) {
            return null;
        }
        AFj1ySDK aFj1ySDK = new AFj1ySDK(intent);
        Uri uri = (Uri) ((Parcelable) aFj1ySDK.AFInAppEventParameterName(aFj1ySDK.new AnonymousClass1("android.intent.extra.REFERRER"), "Error while trying to read android.intent.extra.REFERRER extra from intent", null, true));
        if (uri != null) {
            return uri;
        }
        String strAFInAppEventParameterName = aFj1ySDK.AFInAppEventParameterName("android.intent.extra.REFERRER_NAME");
        if (strAFInAppEventParameterName == null) {
            return null;
        }
        return UriProtector.parse(strAFInAppEventParameterName);
    }
}
