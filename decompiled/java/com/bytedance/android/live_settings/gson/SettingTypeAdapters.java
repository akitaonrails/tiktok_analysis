package com.bytedance.android.live_settings.gson;

import com.google.gson.TypeAdapter;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SettingTypeAdapters {
    public static final Map<Class<?>, TypeAdapter<?>> adapters = new ConcurrentHashMap();

    public static <T> TypeAdapter<T> removeAdapter(Class<T> cls) {
        return (TypeAdapter) adapters.remove(cls);
    }

    public static <T> void addAdapter(Class<T> cls, TypeAdapter<T> typeAdapter) {
        adapters.put(cls, typeAdapter);
    }
}
