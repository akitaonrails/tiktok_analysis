package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00uy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C231800uy implements InterfaceC0148002o {
    public final C291001Au<Boolean> LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C231800uy) && Intrinsics.LJFF(this.LL, ((C231800uy) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoSwapInlineEntranceVMState(deleteInline=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C231800uy(C291001Au<Boolean> c291001Au) {
        this.LL = c291001Au;
    }
}
