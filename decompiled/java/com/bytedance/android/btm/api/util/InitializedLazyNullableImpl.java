package com.bytedance.android.btm.api.util;

import X.InterfaceC2217461Bqa;
import java.io.Serializable;

/* JADX INFO: loaded from: classes31.dex */
public final class InitializedLazyNullableImpl<T> implements LazyNullable<T>, Serializable {
    public T initializedValue;

    public final T getInitializedValue() {
        return this.initializedValue;
    }

    public InitializedLazyNullableImpl(T t) {
        this.initializedValue = t;
    }

    public final void setInitializedValue(T t) {
        this.initializedValue = t;
    }

    @Override // com.bytedance.android.btm.api.util.LazyNullable
    public T getValue(Object obj, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
        return this.initializedValue;
    }

    @Override // com.bytedance.android.btm.api.util.LazyNullable
    public void setValue(Object obj, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, T t) {
        this.initializedValue = t;
    }
}
