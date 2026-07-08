package X;

import android.app.Activity;
import androidx.fragment.app.FragmentManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03pC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C960403pC implements InterfaceC1891350zJl {
    public final FragmentManager LL;
    public final Activity LLILLJJLI;
    public final Boolean LLILLL;
    public final String LLILZ;
    public final boolean LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C960403pC)) {
            return false;
        }
        C960403pC c960403pC = (C960403pC) obj;
        return Intrinsics.LJFF(this.LL, c960403pC.LL) && Intrinsics.LJFF(this.LLILLJJLI, c960403pC.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c960403pC.LLILLL) && Intrinsics.LJFF(this.LLILZ, c960403pC.LLILZ) && this.LLILZIL == c960403pC.LLILZIL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        Activity activity = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (activity == null ? 0 : activity.hashCode())) * 31;
        Boolean bool = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.LLILZ;
        return ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLILZIL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CCDCNfcScanTipsItem(fragmentManager=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", activity=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", hasPromotion=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", payRequestId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", tokoStyle=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C960403pC(FragmentManager fragmentManager, C19EG c19eg, Boolean bool, String str, boolean z) {
        this.LL = fragmentManager;
        this.LLILLJJLI = c19eg;
        this.LLILLL = bool;
        this.LLILZ = str;
        this.LLILZIL = z;
    }
}
