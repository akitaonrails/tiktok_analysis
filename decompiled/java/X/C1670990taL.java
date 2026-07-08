package X;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0taL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1670990taL implements InterfaceC1671020taO {
    public final InterfaceC1665500tRU<Pair<C1682440tso, C1682440tso>> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1670990taL) && Intrinsics.LJFF(this.LIZIZ, ((C1670990taL) obj).LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LineBased(list=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1670990taL(InterfaceC1664360tPe interfaceC1664360tPe) {
        this.LIZIZ = interfaceC1664360tPe;
    }
}
