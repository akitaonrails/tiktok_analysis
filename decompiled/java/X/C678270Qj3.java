package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qj3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C678270Qj3 implements InterfaceC0148002o {
    public final C677830QiL LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C678270Qj3) && Intrinsics.LJFF(this.LL, ((C678270Qj3) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixPageVMState(uiState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C678270Qj3(C677830QiL c677830QiL) {
        this.LL = c677830QiL;
    }
}
