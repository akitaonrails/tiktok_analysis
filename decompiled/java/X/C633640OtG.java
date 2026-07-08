package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OtG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C633640OtG implements InterfaceC0148002o {
    public final C291001Au<Object> LL;
    public final C291001Au<Object> LLILLJJLI;

    public C633640OtG() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C633640OtG)) {
            return false;
        }
        C633640OtG c633640OtG = (C633640OtG) obj;
        return Intrinsics.LJFF(this.LL, c633640OtG.LL) && Intrinsics.LJFF(this.LLILLJJLI, c633640OtG.LLILLJJLI);
    }

    public final int hashCode() {
        C291001Au<Object> c291001Au = this.LL;
        int iHashCode = (c291001Au == null ? 0 : c291001Au.hashCode()) * 31;
        C291001Au<Object> c291001Au2 = this.LLILLJJLI;
        return iHashCode + (c291001Au2 != null ? c291001Au2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LegacyCommunicateState(lazyLoadEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", clearDataEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C633640OtG(C291001Au<? extends Object> c291001Au, C291001Au<? extends Object> c291001Au2) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
    }
}
