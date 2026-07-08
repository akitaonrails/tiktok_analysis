package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;

/* JADX INFO: renamed from: X.1BpG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2216641BpG {
    public static final MutableLiveData LIZ(LiveData liveData, InterfaceC2287108xh interfaceC2287108xh) {
        MutableLiveData mutableLiveData = (MutableLiveData) Transformations.map(liveData, interfaceC2287108xh);
        Object objApply = interfaceC2287108xh.apply(liveData.getValue());
        if (objApply != null) {
            mutableLiveData.setValue(objApply);
        }
        return mutableLiveData;
    }
}
