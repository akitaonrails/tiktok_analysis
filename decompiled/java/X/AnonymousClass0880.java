package X;

import android.os.Looper;
import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0880, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0880 {
    public static final <T> void LIZ(MutableLiveData<T> mutableLiveData, T t) {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            mutableLiveData.setValue(t);
        } else {
            mutableLiveData.postValue(t);
        }
    }
}
