package X;

import android.os.Looper;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0DTR, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DTR {
    public static final void LIZIZ(View view) {
        C12ES.LJIILL(8, view);
    }

    public static final <T> C01GW<T> LIZJ(Function0<? extends T> function0) {
        return C452501pT.LIZ(EnumC452301pR.NONE, function0);
    }

    public static final <T> void LIZ(MutableLiveData<T> mutableLiveData, T t) {
        if (C786410Ut5.u3() == Looper.getMainLooper().getThread()) {
            mutableLiveData.setValue(t);
        } else {
            mutableLiveData.postValue(t);
        }
    }
}
