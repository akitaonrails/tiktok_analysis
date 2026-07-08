package com.appsflyer.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes31.dex */
public final class AFc1oSDK {
    public static final AFa1uSDK AFa1uSDK = new AFa1uSDK(null);
    public final Map<String, Object> AFInAppEventParameterName;
    public final AFc1kSDK values;

    public /* synthetic */ AFc1oSDK(Map map, AFc1kSDK aFc1kSDK, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, aFc1kSDK);
    }

    public static final AFc1oSDK AFInAppEventParameterName(AFa1qSDK aFa1qSDK) {
        return AFa1uSDK.valueOf(aFa1qSDK);
    }

    public static final AFc1oSDK AFKeystoreWrapper(AFc1kSDK aFc1kSDK) {
        return AFa1uSDK.values(aFc1kSDK);
    }

    public static final class AFa1uSDK {
        public AFa1uSDK() {
        }

        public /* synthetic */ AFa1uSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static AFc1oSDK valueOf(AFa1qSDK aFa1qSDK) {
            return new AFc1oSDK(aFa1qSDK.AFInAppEventParameterName(), null, 2, 0 == true ? 1 : 0);
        }

        public static AFc1oSDK values(AFc1kSDK aFc1kSDK) {
            return new AFc1oSDK(new LinkedHashMap(), aFc1kSDK, null);
        }
    }

    public final boolean AFKeystoreWrapper(String str) {
        return this.AFInAppEventParameterName.containsKey(str);
    }

    public AFc1oSDK(Map<String, Object> map, AFc1kSDK aFc1kSDK) {
        this.AFInAppEventParameterName = map;
        this.values = aFc1kSDK;
    }

    public final void AFKeystoreWrapper(String str, Object obj) {
        this.AFInAppEventParameterName.put(str, obj);
        AFc1kSDK aFc1kSDK = this.values;
        if (aFc1kSDK != null) {
            aFc1kSDK.values(this.AFInAppEventParameterName);
        }
    }

    public /* synthetic */ AFc1oSDK(Map map, AFc1kSDK aFc1kSDK, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i & 2) != 0 ? null : aFc1kSDK);
    }
}
