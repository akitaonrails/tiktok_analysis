package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0bWu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C976940bWu extends AbstractC742600TBa<InterfaceC976930bWt> {
    public final LiveData<Boolean> LJIIIZ = Transformations.map(this.LJFF, new AwS591S0100000_12(this, 1190));
    public final MutableLiveData<Boolean> LJIIJ;
    public final MutableLiveData LJIIJJI;
    public final MutableLiveData<Boolean> LJIIL;
    public final MutableLiveData LJIILIIL;

    public C976940bWu() {
        Boolean bool = Boolean.FALSE;
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(bool);
        this.LJIIJ = mutableLiveData;
        this.LJIIJJI = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>(bool);
        this.LJIIL = mutableLiveData2;
        this.LJIILIIL = mutableLiveData2;
    }

    @Override // X.AbstractC742600TBa, X.InterfaceC969510bKv
    public final void onCleared() {
        super.onCleared();
        MutableLiveData<Boolean> mutableLiveData = this.LJIIJ;
        Boolean bool = Boolean.FALSE;
        mutableLiveData.setValue(bool);
        this.LJIIL.setValue(bool);
    }

    public final void LIZJ(EnumC976390bW1 enumC976390bW1) {
        this.LJIIL.setValue(Boolean.TRUE);
        InterfaceC976930bWt interfaceC976930bWt = (InterfaceC976930bWt) this.LIZIZ;
        if (interfaceC976930bWt != null) {
            interfaceC976930bWt.LJIILJJIL(enumC976390bW1);
        }
    }
}
