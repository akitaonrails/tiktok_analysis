package com.bytedance.android.btm.api.util;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes31.dex */
public final class LazyKt {
    public static final LazyKt INSTANCE = new LazyKt();

    public final <T> LazyNonNull<T> lazyNonNull(Function0<? extends T> function0) {
        return new LazyNonNullImpl(function0);
    }

    public final <T> LazyNullable<T> lazyNullable(Function0<? extends T> function0) {
        return new LazyNullableImpl(function0);
    }
}
