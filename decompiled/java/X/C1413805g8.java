package X;

import androidx.lifecycle.MutableLiveData;

/* JADX INFO: renamed from: X.05g8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1413805g8 {
    public final InterfaceC497601wk LIZ;
    public final MutableLiveData<Integer> LIZIZ;
    public final MutableLiveData<Boolean> LIZJ;

    public C1413805g8(InterfaceC497601wk interfaceC497601wk) {
        this.LIZ = interfaceC497601wk;
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        this.LIZIZ = mutableLiveData;
        this.LIZJ = new MutableLiveData<>(Boolean.FALSE);
        mutableLiveData.setValue(Integer.valueOf(C1888220zEi.LIZIZ.LJI()));
    }
}
