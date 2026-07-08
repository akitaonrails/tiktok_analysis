package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07sd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2000907sd implements InterfaceC0148002o {
    public final String LL = "";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2000907sd) && Intrinsics.LJFF(this.LL, ((C2000907sd) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SelectorNavBarVMState(centerTitleStr=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
