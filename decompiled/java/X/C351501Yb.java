package X;

import android.os.Looper;
import androidx.lifecycle.MutableLiveData;

/* JADX INFO: renamed from: X.01Yb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C351501Yb {
    public static final void LIZ(MutableLiveData<Boolean> mutableLiveData, boolean z) {
        if (Looper.getMainLooper().getThread() == C786410Ut5.u3()) {
            mutableLiveData.setValue(Boolean.valueOf(z));
        } else {
            mutableLiveData.postValue(Boolean.valueOf(z));
        }
    }
}
