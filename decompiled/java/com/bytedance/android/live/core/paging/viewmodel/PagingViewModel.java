package com.bytedance.android.live.core.paging.viewmodel;

import X.C0J1R;
import X.C1A6I;
import X.C470630Icv;
import X.C470770Id9;
import X.InterfaceC470830IdF;
import Y.AObserverS211S0100000_7;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.util.rxutils.RxViewModel;

/* JADX INFO: loaded from: classes8.dex */
public class PagingViewModel<T> extends RxViewModel {
    public InterfaceC470830IdF<T> LLIZ;
    public final MutableLiveData<C470770Id9> LL = new MutableLiveData<>();
    public final MutableLiveData<C470770Id9> LLILLJJLI = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLILLL = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLILZ = new MutableLiveData<>();
    public final MutableLiveData<Integer> LLILZIL = new MutableLiveData<>();
    public final MutableLiveData<C1A6I<T>> LLILZLL = new MutableLiveData<>();
    public final AObserverS211S0100000_7 LLIZLLLIL = new AObserverS211S0100000_7(this, 48);
    public final AObserverS211S0100000_7 LLJ = new AObserverS211S0100000_7(this, 49);
    public final AObserverS211S0100000_7 LLJI = new AObserverS211S0100000_7(this, 50);
    public final AObserverS211S0100000_7 LLJIJIL = new AObserverS211S0100000_7(this, 51);
    public final AObserverS211S0100000_7 LLJILJIL = new AObserverS211S0100000_7(this, 52);
    public final AObserverS211S0100000_7 LLJILJILJ = new AObserverS211S0100000_7(this, 53);

    public boolean wQ2() {
        InterfaceC470830IdF<T> interfaceC470830IdF;
        if ((this.LLILLJJLI.getValue() != null && this.LLILLJJLI.getValue().LIZ()) || (interfaceC470830IdF = this.LLIZ) == null) {
            return false;
        }
        ((C470630Icv) interfaceC470830IdF).LJ.onNext(C0J1R.LIZJ);
        return true;
    }

    public final void xQ2(InterfaceC470830IdF<T> interfaceC470830IdF) {
        InterfaceC470830IdF<T> interfaceC470830IdF2 = this.LLIZ;
        if (interfaceC470830IdF2 != null) {
            ((C470630Icv) interfaceC470830IdF2).LIZIZ.removeObserver(this.LLIZLLLIL);
            ((C470630Icv) this.LLIZ).LIZJ.removeObserver(this.LLJ);
            ((C470630Icv) this.LLIZ).LIZ.removeObserver(this.LLJI);
            ((C470630Icv) this.LLIZ).LIZLLL.removeObserver(this.LLJIJIL);
            ((C470630Icv) this.LLIZ).LJIIIIZZ.removeObserver(this.LLJILJIL);
            ((C470630Icv) this.LLIZ).LJII.removeObserver(this.LLJILJILJ);
        }
        this.LLIZ = interfaceC470830IdF;
        if (interfaceC470830IdF != null) {
            ((C470630Icv) interfaceC470830IdF).LIZIZ.observeForever(this.LLIZLLLIL);
            ((C470630Icv) this.LLIZ).LIZJ.observeForever(this.LLJ);
            ((C470630Icv) this.LLIZ).LIZ.observeForever(this.LLJI);
            ((C470630Icv) this.LLIZ).LIZLLL.observeForever(this.LLJIJIL);
            ((C470630Icv) this.LLIZ).LJIIIIZZ.observeForever(this.LLJILJIL);
            ((C470630Icv) this.LLIZ).LJII.observeForever(this.LLJILJILJ);
        }
    }
}
