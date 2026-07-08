package X;

import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;

/* JADX INFO: renamed from: X.0RYF, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RYF {
    public static final Fragment LIZ(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner instanceof Fragment) {
            return (Fragment) lifecycleOwner;
        }
        if (lifecycleOwner instanceof C19EG) {
            return null;
        }
        if (lifecycleOwner instanceof C0R7E) {
            Fragment fragmentQ71 = ((C0R7E) lifecycleOwner).Q71();
            if (fragmentQ71 != null) {
                return LIZ(fragmentQ71);
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalStateException("Don't support this LifecycleOwner for find.");
    }

    public static final <T> void LIZIZ(MutableLiveData<T> mutableLiveData, T t) {
        if (Looper.getMainLooper().getThread() == C786410Ut5.u3()) {
            mutableLiveData.setValue(t);
        } else {
            mutableLiveData.postValue(t);
        }
    }
}
