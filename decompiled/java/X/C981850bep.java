package X;

import androidx.lifecycle.MutableLiveData;

/* JADX INFO: renamed from: X.0bep, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C981850bep extends C0TBZ<InterfaceC981920bew> {
    public final MutableLiveData<Boolean> LJIIIZ;
    public final MutableLiveData LJIIJ;
    public final MutableLiveData<Boolean> LJIIJJI;
    public final MutableLiveData LJIIL;
    public long LJIILIIL;

    public C981850bep() {
        Boolean bool = Boolean.FALSE;
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(bool);
        this.LJIIIZ = mutableLiveData;
        this.LJIIJ = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>(bool);
        this.LJIIJJI = mutableLiveData2;
        this.LJIIL = mutableLiveData2;
    }

    @Override // X.C0TBZ, X.InterfaceC969510bKv
    public final void onCleared() {
        super.onCleared();
        this.LJIIIZ.setValue(Boolean.FALSE);
    }

    public final void LIZLLL(EnumC981380be4 enumC981380be4) {
        this.LJIIJJI.setValue(Boolean.TRUE);
        InterfaceC981920bew interfaceC981920bew = (InterfaceC981920bew) this.LIZIZ;
        if (interfaceC981920bew != null) {
            interfaceC981920bew.LJJIFFI(this.LJIILIIL, enumC981380be4);
        }
    }
}
