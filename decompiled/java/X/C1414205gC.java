package X;

import androidx.lifecycle.MutableLiveData;

/* JADX INFO: renamed from: X.05gC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1414205gC {
    public final InterfaceC497601wk LIZ;
    public final MutableLiveData<Integer> LIZIZ;
    public final MutableLiveData<Boolean> LIZJ;

    public C1414205gC(InterfaceC497601wk interfaceC497601wk) {
        int i;
        this.LIZ = interfaceC497601wk;
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        this.LIZIZ = mutableLiveData;
        this.LIZJ = new MutableLiveData<>(Boolean.FALSE);
        if (C1888220zEi.LIZIZ.LJFF()) {
            i = 1;
        } else {
            i = 0;
        }
        mutableLiveData.setValue(i);
    }
}
