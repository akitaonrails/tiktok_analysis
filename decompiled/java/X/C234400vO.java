package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00vO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C234400vO implements InterfaceC0148002o {
    public final C291001Au<Integer> LL;

    public C234400vO() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C234400vO) && Intrinsics.LJFF(this.LL, ((C234400vO) obj).LL);
    }

    public final int hashCode() {
        C291001Au<Integer> c291001Au = this.LL;
        if (c291001Au == null) {
            return 0;
        }
        return c291001Au.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CollapseInlineVMState(scrollToPosition=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C234400vO(C291001Au<Integer> c291001Au) {
        this.LL = c291001Au;
    }
}
