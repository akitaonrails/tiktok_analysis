package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0quM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1568080quM implements InterfaceC111300bX {
    public final InterfaceC1574170r4B LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1568080quM) && Intrinsics.LJFF(this.LL, ((C1568080quM) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeriesSkylightHierarchyData(hostAbility=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1568080quM(C1568140quS c1568140quS) {
        this.LL = c1568140quS;
    }
}
