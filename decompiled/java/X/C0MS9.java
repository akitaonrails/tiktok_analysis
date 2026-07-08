package X;

import android.os.Looper;
import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MS9, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MS9 {
    public static final <T> void LIZ(MutableLiveData<T> mutableLiveData, T t) {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            mutableLiveData.setValue(t);
        } else {
            mutableLiveData.postValue(t);
        }
    }

    public static final <T> void LIZIZ(C560530Lyd<T> c560530Lyd, T t) {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            c560530Lyd.LJIIJ(t);
        } else {
            c560530Lyd.LJIIIZ(t);
        }
    }
}
