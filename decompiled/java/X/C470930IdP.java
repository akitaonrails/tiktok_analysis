package X;

import androidx.lifecycle.MutableLiveData;

/* JADX INFO: renamed from: X.0IdP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C470930IdP<V> extends AbstractC470940IdQ<V> {
    public final MutableLiveData<Boolean> LIZ;
    public final MutableLiveData<Boolean> LIZIZ;

    public C470930IdP(MutableLiveData<Boolean> mutableLiveData, MutableLiveData<Boolean> mutableLiveData2) {
        this.LIZ = new MutableLiveData<>();
        this.LIZIZ = new MutableLiveData<>();
        this.LIZ = mutableLiveData;
        this.LIZIZ = mutableLiveData2;
    }
}
