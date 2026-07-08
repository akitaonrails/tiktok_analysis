package com.appsflyer.internal;

import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes31.dex */
public interface AFg1mSDK {
    Long AFInAppEventParameterName();

    long AFInAppEventType();

    void AFInAppEventType(AFa1qSDK aFa1qSDK);

    void AFInAppEventType(Map<String, Object> map);

    void AFInAppEventType(Map<String, Object> map, boolean z, Function0<String> function0);

    void AFKeystoreWrapper(AFa1qSDK aFa1qSDK);

    void valueOf(AFa1qSDK aFa1qSDK);

    void valueOf(Map<String, Object> map);

    void valueOf(Map<String, Object> map, int i, int i2);

    void values(AFa1qSDK aFa1qSDK);

    void values(Map<String, Object> map);
}
