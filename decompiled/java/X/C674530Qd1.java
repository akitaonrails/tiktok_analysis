package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qd1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C674530Qd1 implements InterfaceC0148002o {
    public final C291001Au<Boolean> LL;
    public final C291001Au<Float> LLILLJJLI;

    public C674530Qd1() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C674530Qd1)) {
            return false;
        }
        C674530Qd1 c674530Qd1 = (C674530Qd1) obj;
        return Intrinsics.LJFF(this.LL, c674530Qd1.LL) && Intrinsics.LJFF(this.LLILLJJLI, c674530Qd1.LLILLJJLI);
    }

    public final int hashCode() {
        C291001Au<Boolean> c291001Au = this.LL;
        int iHashCode = (c291001Au == null ? 0 : c291001Au.hashCode()) * 31;
        C291001Au<Float> c291001Au2 = this.LLILLJJLI;
        return iHashCode + (c291001Au2 != null ? c291001Au2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcSearchAIFloatingButtonState(visibility=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", translationY=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C674530Qd1(C291001Au<Boolean> c291001Au, C291001Au<Float> c291001Au2) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
    }
}
