package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0P9q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C640320P9q extends AbstractC641560PEk {
    public boolean LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(370));

    @Override // X.InterfaceC588620N6u
    public final MutableLiveData<Integer> LIZ() {
        return (MutableLiveData) this.LLILLL.getValue();
    }

    public final void LIZJ(Boolean bool) {
        int i;
        if (bool != null && bool.booleanValue() != this.LLILLJJLI) {
            boolean zBooleanValue = bool.booleanValue();
            this.LLILLJJLI = zBooleanValue;
            LiveData liveData = (LiveData) this.LLILLL.getValue();
            if (zBooleanValue) {
                i = 0;
            } else {
                i = 1;
            }
            liveData.setValue(i);
        }
    }
}
