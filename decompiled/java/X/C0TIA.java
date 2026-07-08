package X;

import Y.AObserverS22S0310000_12;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;

/* JADX INFO: renamed from: X.0TIA, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TIA {
    public static MediatorLiveData LIZ(MutableLiveData mutableLiveData) {
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        C259800zU c259800zU = new C259800zU();
        C013C c013c = new C013C();
        c013c.element = true;
        mediatorLiveData.addSource(mutableLiveData, new AObserverS22S0310000_12(mediatorLiveData, false, c013c, c259800zU, 0));
        return mediatorLiveData;
    }
}
