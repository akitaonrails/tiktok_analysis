package com.bytedance.android.btm.api.cache;

/* JADX INFO: loaded from: classes33.dex */
public interface ISavable<T> {
    T parse(String str);

    String save();
}
