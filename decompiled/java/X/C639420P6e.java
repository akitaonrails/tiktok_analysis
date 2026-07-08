package X;

import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0P6e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C639420P6e extends AbstractC641560PEk {
    public boolean LLILLJJLI = true;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(640));

    @Override // X.AbstractC641560PEk, X.InterfaceC588620N6u
    public final String getTag() {
        return "WindowVisibilityStatus";
    }

    @Override // X.InterfaceC588620N6u
    public final MutableLiveData<Integer> LIZ() {
        return (MutableLiveData) this.LLILLL.getValue();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WindowVisibilityStatus(visible=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
