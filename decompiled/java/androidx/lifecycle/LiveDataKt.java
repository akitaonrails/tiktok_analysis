package androidx.lifecycle;

import X.InterfaceC1294060jmO;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class LiveDataKt {
    @InterfaceC1294060jmO
    public static final <T> Observer<T> observe(LiveData<T> liveData, LifecycleOwner lifecycleOwner, final Function1<? super T, Unit> function1) {
        Observer<T> observer = new Observer() { // from class: androidx.lifecycle.LiveDataKt$observe$wrappedObserver$1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(T t) {
                function1.invoke(t);
            }
        };
        liveData.observe(lifecycleOwner, observer);
        return observer;
    }
}
