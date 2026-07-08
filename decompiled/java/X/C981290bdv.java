package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0bdv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C981290bdv extends AbstractC742610TBb<InterfaceC981320bdy> {
    public final LiveData<Boolean> LJIIIZ = Transformations.map(this.LJFF, new AwS591S0100000_12(this, 1206));
    public final MutableLiveData<Boolean> LJIIJ;
    public final MutableLiveData LJIIJJI;
    public final MutableLiveData<Boolean> LJIIL;
    public final MutableLiveData LJIILIIL;
    public long LJIILJJIL;
    public boolean LJIILL;

    public C981290bdv() {
        Boolean bool = Boolean.FALSE;
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(bool);
        this.LJIIJ = mutableLiveData;
        this.LJIIJJI = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>(bool);
        this.LJIIL = mutableLiveData2;
        this.LJIILIIL = mutableLiveData2;
    }

    @Override // X.AbstractC742610TBb, X.InterfaceC969510bKv
    public final void onCleared() {
        super.onCleared();
        MutableLiveData<Boolean> mutableLiveData = this.LJIIJ;
        Boolean bool = Boolean.FALSE;
        mutableLiveData.setValue(bool);
        this.LJIIL.setValue(bool);
    }

    public final void LIZLLL(EnumC981560beM enumC981560beM) {
        this.LJIIL.setValue(Boolean.TRUE);
        InterfaceC981320bdy interfaceC981320bdy = (InterfaceC981320bdy) this.LIZIZ;
        if (interfaceC981320bdy != null) {
            interfaceC981320bdy.LJIILIIL(enumC981560beM);
        }
    }
}
