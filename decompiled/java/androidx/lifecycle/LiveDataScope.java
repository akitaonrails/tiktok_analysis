package androidx.lifecycle;

import X.InterfaceC1364105Vn;
import X.InterfaceC2238208po;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public interface LiveDataScope<T> {
    Object emit(T t, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    Object emitSource(LiveData<T> liveData, InterfaceC1364105Vn<? super InterfaceC2238208po> interfaceC1364105Vn);

    T getLatestValue();
}
