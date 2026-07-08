package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0P6U, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0P6U extends AbstractC641560PEk {
    public final Lifecycle LLILLJJLI;
    public boolean LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(639));

    @Override // X.InterfaceC588620N6u
    public final MutableLiveData<Integer> LIZ() {
        return (MutableLiveData) this.LLILZ.getValue();
    }

    public C0P6U(Lifecycle lifecycle) {
        this.LLILLJJLI = lifecycle;
    }

    public final void LIZJ(boolean z) {
        int i;
        if (z == this.LLILLL) {
            return;
        }
        if (!z && !this.LLILLJJLI.getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
            return;
        }
        this.LLILLL = z;
        LiveData liveData = (LiveData) this.LLILZ.getValue();
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        liveData.setValue(i);
    }
}
