package com.appsflyer.internal;

import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class AFd1wSDK {
    public final String[] AFInAppEventType;

    public AFd1wSDK(String... strArr) {
        if (strArr != null && strArr.length != 0) {
            Pattern patternCompile = PatternProtector.compile("[\\w]{1,45}");
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (str != null && patternCompile.matcher(str).matches()) {
                    arrayList.add(str.toLowerCase(Locale.getDefault()));
                }
            }
            if (arrayList.contains("all")) {
                this.AFInAppEventType = new String[]{"all"};
                return;
            } else if (!arrayList.isEmpty()) {
                this.AFInAppEventType = (String[]) arrayList.toArray(new String[0]);
                return;
            } else {
                this.AFInAppEventType = null;
                return;
            }
        }
        this.AFInAppEventType = null;
    }
}
