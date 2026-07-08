package com.bytedance.android.btm.api.util;

import X.InterfaceC2217461Bqa;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes31.dex */
public class LazyNullableImpl<T> implements LazyNullable<T>, Serializable {
    public volatile boolean hasInitialized;
    public volatile boolean hasSetInitialValue;
    public final Function0<T> initializer;
    public volatile T value;

    private final T getValueInner() {
        return this.value != null ? this.value : setInitialValue();
    }

    private final T setInitialValue() {
        if (this.hasSetInitialValue || this.hasInitialized) {
            return this.value;
        }
        synchronized (this) {
            try {
                if (this.hasSetInitialValue) {
                    return this.value;
                }
                this.value = this.initializer.invoke();
                this.hasSetInitialValue = true;
                return this.value;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    private final Object writeReplace() {
        return new InitializedLazyNullableImpl(getValueInner());
    }

    public final T getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LazyNullableImpl(Function0<? extends T> function0) {
        this.initializer = function0;
    }

    public final void setValue(T t) {
        this.value = t;
    }

    @Override // com.bytedance.android.btm.api.util.LazyNullable
    public T getValue(Object obj, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
        return getValueInner();
    }

    @Override // com.bytedance.android.btm.api.util.LazyNullable
    public void setValue(Object obj, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, T t) {
        this.value = t;
        this.hasInitialized = true;
    }
}
