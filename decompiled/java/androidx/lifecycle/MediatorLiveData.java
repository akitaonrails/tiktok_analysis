package androidx.lifecycle;

import androidx.arch.core.internal.SafeIterableMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes30.dex */
public class MediatorLiveData<T> extends MutableLiveData<T> {
    public SafeIterableMap<LiveData<?>, Source<?>> mSources;

    public static class Source<V> implements Observer<V> {
        public final LiveData<V> mLiveData;
        public final Observer<? super V> mObserver;
        public int mVersion = -1;

        public void plug() {
            this.mLiveData.observeForever(this);
        }

        public void unplug() {
            this.mLiveData.removeObserver(this);
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(V v) {
            if (this.mVersion != this.mLiveData.getVersion()) {
                this.mVersion = this.mLiveData.getVersion();
                this.mObserver.onChanged(v);
            }
        }

        public Source(LiveData<V> liveData, Observer<? super V> observer) {
            this.mLiveData = liveData;
            this.mObserver = observer;
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        Iterator<Map.Entry<LiveData<?>, Source<?>>> it2 = this.mSources.iterator();
        while (it2.hasNext()) {
            it2.next().getValue().plug();
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        Iterator<Map.Entry<LiveData<?>, Source<?>>> it2 = this.mSources.iterator();
        while (it2.hasNext()) {
            it2.next().getValue().unplug();
        }
    }

    public MediatorLiveData() {
        this.mSources = new SafeIterableMap<>();
    }

    public MediatorLiveData(T t) {
        super(t);
        this.mSources = new SafeIterableMap<>();
    }

    public <S> void removeSource(LiveData<S> liveData) {
        Source<?> sourceRemove = this.mSources.remove(liveData);
        if (sourceRemove != null) {
            sourceRemove.unplug();
        }
    }

    public <S> void addSource(LiveData<S> liveData, Observer<? super S> observer) {
        if (liveData != null) {
            Source<?> source = new Source<>(liveData, observer);
            Source<?> sourcePutIfAbsent = this.mSources.putIfAbsent(liveData, source);
            if (sourcePutIfAbsent != null) {
                if (sourcePutIfAbsent.mObserver == observer) {
                    return;
                } else {
                    throw new IllegalArgumentException("This source was already added with the different observer");
                }
            } else {
                if (hasActiveObservers()) {
                    source.plug();
                    return;
                }
                return;
            }
        }
        throw new NullPointerException("source cannot be null");
    }
}
