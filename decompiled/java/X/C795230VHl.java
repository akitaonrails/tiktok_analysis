package X;

import androidx.lifecycle.MutableLiveData;

/* JADX INFO: renamed from: X.0VHl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C795230VHl implements InterfaceC795220VHk {
    public final MutableLiveData<AbstractC795210VHj> LIZJ = new MutableLiveData<>();
    public final C134N<C795250VHn> LIZLLL = new C134N<>();

    public C795230VHl() {
        LIZ(InterfaceC795220VHk.LIZIZ);
    }

    public final void LIZ(AbstractC795210VHj abstractC795210VHj) {
        this.LIZJ.postValue(abstractC795210VHj);
        if (abstractC795210VHj instanceof C795250VHn) {
            this.LIZLLL.LJIIIZ(abstractC795210VHj);
        } else {
            if (!(abstractC795210VHj instanceof C795200VHi)) {
                return;
            }
            this.LIZLLL.LJIIJ(((C795200VHi) abstractC795210VHj).LIZ);
        }
    }
}
