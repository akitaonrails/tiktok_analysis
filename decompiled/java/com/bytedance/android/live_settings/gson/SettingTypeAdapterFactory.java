package com.bytedance.android.live_settings.gson;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class SettingTypeAdapterFactory implements v {
    public static final Set<Class<?>> basicTypes;

    static {
        HashSet hashSet = new HashSet(32);
        basicTypes = hashSet;
        hashSet.add(Boolean.TYPE);
        hashSet.add(Boolean.class);
        hashSet.add(Integer.TYPE);
        hashSet.add(Integer.class);
        hashSet.add(Long.TYPE);
        hashSet.add(Long.class);
        hashSet.add(Float.TYPE);
        hashSet.add(Float.class);
        hashSet.add(Double.TYPE);
        hashSet.add(Double.class);
        hashSet.add(String.class);
        hashSet.add(List.class);
        hashSet.add(ArrayList.class);
        hashSet.add(LinkedList.class);
        hashSet.add(Map.class);
        hashSet.add(HashMap.class);
        hashSet.add(LinkedHashMap.class);
    }

    @Override // com.google.gson.v
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        TypeAdapter<T> typeAdapter = null;
        if (typeToken == null) {
            return null;
        }
        System.nanoTime();
        Class<? super T> rawType = typeToken.getRawType();
        if (rawType.isArray() || basicTypes.contains(rawType)) {
            return null;
        }
        try {
            typeAdapter = (TypeAdapter) rawType.getDeclaredField("ADAPTER").get(null);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        System.nanoTime();
        return typeAdapter;
    }
}
