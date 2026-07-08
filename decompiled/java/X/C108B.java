package X;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.108B, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C108B implements C107J {
    public final ViewModelStoreOwner LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 861));
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 860));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 862));

    @Override // X.C107J
    public final void LIZIZ(Context context) {
    }

    @Override // X.C107J
    public final boolean LJ(int i) {
        return true;
    }

    @Override // X.C107J
    public final void onShow() {
    }

    @Override // X.C107J
    public final MutableLiveData<Integer> LIZ() {
        return (MutableLiveData) this.LIZLLL.getValue();
    }

    @Override // X.C107J
    public final MutableLiveData<Integer> LIZJ() {
        return (MutableLiveData) this.LIZJ.getValue();
    }

    @Override // X.C107J
    public final MutableLiveData<Integer> LIZLLL() {
        return (MutableLiveData) this.LIZIZ.getValue();
    }

    public C108B(ViewModelStoreOwner viewModelStoreOwner) {
        this.LIZ = viewModelStoreOwner;
    }
}
