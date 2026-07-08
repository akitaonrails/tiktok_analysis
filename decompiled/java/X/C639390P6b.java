package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0P6b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C639390P6b extends AbstractC641560PEk implements InterfaceC639400P6c {
    public boolean LLILLJJLI = true;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(638));

    @Override // X.AbstractC641560PEk, X.InterfaceC588620N6u
    public final String getTag() {
        return "FragmentVisibilityStatus";
    }

    @Override // X.InterfaceC588620N6u
    public final MutableLiveData<Integer> LIZ() {
        return (MutableLiveData) this.LLILLL.getValue();
    }

    public final void LIZJ(Boolean bool) {
        int i;
        if (bool != null) {
            bool.booleanValue();
            if (Intrinsics.LJFF(bool, Boolean.valueOf(this.LLILLJJLI))) {
                return;
            }
            this.LLILLJJLI = bool.booleanValue();
            LiveData liveData = (LiveData) this.LLILLL.getValue();
            if (bool.booleanValue()) {
                i = 1;
            } else {
                i = 0;
            }
            liveData.setValue(i);
        }
    }
}
