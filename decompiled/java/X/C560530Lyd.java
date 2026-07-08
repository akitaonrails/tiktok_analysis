package X;

import com.bytedance.als.LiveEvent;

/* JADX INFO: renamed from: X.0Lyd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C560530Lyd<T> extends LiveEvent<T> {
    public void LJIIIZ(T t) {
        LiveEvent<T>.ActiveAwareLiveData activeAwareLiveData = this.LIZ;
        if (activeAwareLiveData != null) {
            activeAwareLiveData.postValue(t);
        }
    }

    public void LJIIJ(T t) {
        C1659720tIA.LIZ();
        LiveEvent<T>.ActiveAwareLiveData activeAwareLiveData = this.LIZ;
        if (activeAwareLiveData != null) {
            activeAwareLiveData.setValue(t);
        }
    }
}
