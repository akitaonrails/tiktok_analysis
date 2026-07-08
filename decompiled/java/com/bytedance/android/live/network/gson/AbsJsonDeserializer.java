package com.bytedance.android.live.network.gson;

import com.google.gson.Gson;
import com.google.gson.j;

/* JADX INFO: loaded from: classes24.dex */
public abstract class AbsJsonDeserializer<T> implements j<T> {
    public final Gson LIZ;

    public AbsJsonDeserializer(Gson gson) {
        this.LIZ = gson;
    }
}
