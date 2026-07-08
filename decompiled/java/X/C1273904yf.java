package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04yf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1273904yf implements InterfaceC1891350zJl {
    public boolean LL;
    public final Function0<Unit> LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1273904yf)) {
            return false;
        }
        C1273904yf c1273904yf = (C1273904yf) obj;
        return this.LL == c1273904yf.LL && Intrinsics.LJFF(this.LLILLJJLI, c1273904yf.LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LL) * 31;
        Function0<Unit> function0 = this.LLILLJJLI;
        return iZ2 + (function0 == null ? 0 : function0.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NotificationLoadMoreItem(isError=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", onAttach=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C1273904yf) && ((C1273904yf) interfaceC1891350zJl).LL == this.LL) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return interfaceC1891350zJl instanceof C1273904yf;
    }

    public C1273904yf(Function0 function0, boolean z) {
        this.LL = z;
        this.LLILLJJLI = function0;
    }
}
