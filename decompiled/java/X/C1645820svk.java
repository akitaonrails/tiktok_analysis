package X;

import Y.AObserverS227S0100000_25;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;

/* JADX INFO: renamed from: X.0svk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1645820svk {
    public final String LIZ;
    public final LifecycleOwner LIZIZ;

    public final void LIZ(InterfaceC1645830svl interfaceC1645830svl) {
        String str = this.LIZ;
        MutableLiveData mutableLiveData = new MutableLiveData();
        C0CHQ.LIZ().getChallengeService().LIZIZ(str, new C1698250uIJ(mutableLiveData, 0));
        mutableLiveData.observe(this.LIZIZ, new AObserverS227S0100000_25(interfaceC1645830svl, 97));
    }

    public C1645820svk(String str, LifecycleOwner lifecycleOwner) {
        this.LIZIZ = lifecycleOwner;
        this.LIZ = str;
    }
}
