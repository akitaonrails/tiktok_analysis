package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0P6W, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0P6W extends AbstractC641560PEk implements C0P6X, C0PX8 {
    public boolean LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(568));

    @Override // X.AbstractC641560PEk, X.InterfaceC588620N6u
    public final String getTag() {
        return "SearchResultBrandZoneAdEasterEggStatus";
    }

    @Override // X.InterfaceC588620N6u
    public final MutableLiveData<Integer> LIZ() {
        return (MutableLiveData) this.LLILLL.getValue();
    }

    @Override // X.C0PX8
    public final void LIZIZ(boolean z) {
        int i;
        if (z != this.LLILLJJLI) {
            this.LLILLJJLI = z;
            LiveData liveData = (LiveData) this.LLILLL.getValue();
            if (z) {
                i = 0;
            } else {
                i = 1;
            }
            liveData.setValue(i);
        }
    }
}
