package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13lp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20106713lp implements InterfaceC1891350zJl {
    public final C20041213bG LL;
    public final Function1<C20106713lp, Unit> LLILLJJLI;
    public final Function1<C20106713lp, Unit> LLILLL;
    public final boolean LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20106713lp)) {
            return false;
        }
        C20106713lp c20106713lp = (C20106713lp) obj;
        return Intrinsics.LJFF(this.LL, c20106713lp.LL) && Intrinsics.LJFF(this.LLILLJJLI, c20106713lp.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c20106713lp.LLILLL) && this.LLILZ == c20106713lp.LLILZ;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        Function1<C20106713lp, Unit> function1 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function1<C20106713lp, Unit> function12 = this.LLILLL;
        return ((iHashCode2 + (function12 != null ? function12.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoSettingsOperationItem(operationData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", onOpClick=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", onTitleSpanClick=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isHighLight=");
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

    /* JADX WARN: Multi-variable type inference failed */
    public C20106713lp(C20041213bG c20041213bG, Function1<? super C20106713lp, Unit> function1, Function1<? super C20106713lp, Unit> function12, boolean z) {
        this.LL = c20041213bG;
        this.LLILLJJLI = function1;
        this.LLILLL = function12;
        this.LLILZ = z;
    }
}
