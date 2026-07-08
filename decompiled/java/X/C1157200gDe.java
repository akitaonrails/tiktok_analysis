package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gDe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1157200gDe implements InterfaceC1891350zJl {
    public final String LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;
    public final Function0<Unit> LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1157200gDe)) {
            return false;
        }
        C1157200gDe c1157200gDe = (C1157200gDe) obj;
        return Intrinsics.LJFF(this.LL, c1157200gDe.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1157200gDe.LLILLJJLI) && this.LLILLL == c1157200gDe.LLILLL && Intrinsics.LJFF(this.LLILZ, c1157200gDe.LLILZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        String str = this.LL;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoInspirationHeaderItem(title=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", tabNameFallback=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", showViewAll=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", onViewAllClick=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1157200gDe) {
            C1157200gDe c1157200gDe = (C1157200gDe) interfaceC1891350zJl;
            if (c1157200gDe.LLILLL == this.LLILLL && Intrinsics.LJFF(c1157200gDe.LL, this.LL) && Intrinsics.LJFF(c1157200gDe.LLILLJJLI, this.LLILLJJLI)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return interfaceC1891350zJl instanceof C1157200gDe;
    }

    public C1157200gDe(String str, boolean z, String str2, AwS571S0100000_27 awS571S0100000_27) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = z;
        this.LLILZ = awS571S0100000_27;
    }
}
