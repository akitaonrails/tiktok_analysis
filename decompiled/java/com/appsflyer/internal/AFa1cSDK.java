package com.appsflyer.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class AFa1cSDK implements AFa1bSDK {
    public Map<String, String> AFInAppEventType = new LinkedHashMap();

    @Override // com.appsflyer.internal.AFa1bSDK
    public final Map<String, String> valueOf(Context context) {
        if (this.AFInAppEventType.isEmpty()) {
            Resources resources = context.getResources();
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            int i = resources.getConfiguration().screenLayout & 15;
            this.AFInAppEventType.put("xdp", String.valueOf(displayMetrics.xdpi));
            this.AFInAppEventType.put("ydp", String.valueOf(displayMetrics.ydpi));
            this.AFInAppEventType.put("x_px", String.valueOf(displayMetrics.widthPixels));
            this.AFInAppEventType.put("y_px", String.valueOf(displayMetrics.heightPixels));
            this.AFInAppEventType.put("d_dpi", String.valueOf(displayMetrics.densityDpi));
            this.AFInAppEventType.put("size", String.valueOf(i));
        }
        return this.AFInAppEventType;
    }
}
