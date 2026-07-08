package X;

import androidx.lifecycle.MutableLiveData;

/* JADX INFO: renamed from: X.10sx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19386510sx<T> {
    public final MutableLiveData<T> LIZ = new MutableLiveData<>();
    public final MutableLiveData<T> LIZIZ = new MutableLiveData<>();

    public final void LIZ(T t) {
        this.LIZ.setValue(t);
        this.LIZIZ.postValue(t);
    }
}
