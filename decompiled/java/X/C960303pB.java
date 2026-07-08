package X;

import android.app.Activity;
import androidx.fragment.app.FragmentManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03pB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C960303pB implements InterfaceC1891350zJl {
    public final FragmentManager LL;
    public final Activity LLILLJJLI;
    public final Boolean LLILLL;
    public final boolean LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C960303pB)) {
            return false;
        }
        C960303pB c960303pB = (C960303pB) obj;
        return Intrinsics.LJFF(this.LL, c960303pB.LL) && Intrinsics.LJFF(this.LLILLJJLI, c960303pB.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c960303pB.LLILLL) && this.LLILZ == c960303pB.LLILZ;
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
        return ((iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CCDCNfcScanTipsItem(fragmentManager=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", activity=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", hasPromotion=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", tokoStyle=");
        sbLIZ.append(this.LLILZ);
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

    public C960303pB(FragmentManager fragmentManager, C19EG c19eg, Boolean bool, boolean z) {
        this.LL = fragmentManager;
        this.LLILLJJLI = c19eg;
        this.LLILLL = bool;
        this.LLILZ = z;
    }
}
