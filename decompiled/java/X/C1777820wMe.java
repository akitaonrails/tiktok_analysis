package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wMe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777820wMe implements InterfaceC1891350zJl {
    public final int LL;
    public final Function0<Unit> LLILLJJLI;
    public final Function1<String, Unit> LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1777820wMe)) {
            return false;
        }
        C1777820wMe c1777820wMe = (C1777820wMe) obj;
        return this.LL == c1777820wMe.LL && Intrinsics.LJFF(this.LLILLJJLI, c1777820wMe.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1777820wMe.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int i = this.LL * 31;
        Function0<Unit> function0 = this.LLILLJJLI;
        int iHashCode = (i + (function0 == null ? 0 : function0.hashCode())) * 31;
        Function1<String, Unit> function1 = this.LLILLL;
        return iHashCode + (function1 != null ? function1.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DMPushGuideBannerItem(pushState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", dismissListener=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", logDMPushListener=");
        sbLIZ.append(this.LLILLL);
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

    public C1777820wMe(int i, AwS572S0100000_28 awS572S0100000_28, AwS607S0100000_28 awS607S0100000_28) {
        this.LL = i;
        this.LLILLJJLI = awS572S0100000_28;
        this.LLILLL = awS607S0100000_28;
    }
}
