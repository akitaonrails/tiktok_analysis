package androidx.lifecycle;

import X.C11LE;
import X.InterfaceC1294060jmO;

/* JADX INFO: loaded from: classes26.dex */
public final class LiveDataReactiveStreams {
    public static final <T> LiveData<T> fromPublisher(C11LE<T> c11le) {
        return new PublisherLiveData(c11le);
    }

    @InterfaceC1294060jmO
    public static final <T> C11LE<T> toPublisher(LifecycleOwner lifecycleOwner, LiveData<T> liveData) {
        return new LiveDataPublisher(lifecycleOwner, liveData);
    }

    public static final <T> C11LE<T> toPublisher(LiveData<T> liveData, LifecycleOwner lifecycleOwner) {
        return new LiveDataPublisher(lifecycleOwner, liveData);
    }
}
