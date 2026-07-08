package X;

import android.os.Looper;
import androidx.lifecycle.MutableLiveData;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05bQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1384605bQ {
    public static final void LIZ(C699090RbX c699090RbX, Map map) {
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(((Map.Entry) it2.next()).getValue(), c699090RbX)) {
                it2.remove();
            }
        }
    }

    public static final <T> void LIZIZ(MutableLiveData<T> mutableLiveData, T t) {
        if (Looper.getMainLooper().getThread() == C786410Ut5.u3()) {
            mutableLiveData.setValue(t);
        } else {
            mutableLiveData.postValue(t);
        }
    }
}
