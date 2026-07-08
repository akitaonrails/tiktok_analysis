package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04j5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1177304j5 implements InterfaceC1443605kw {
    public final List<String> LIZ;
    public final List<String> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1177304j5)) {
            return false;
        }
        C1177304j5 c1177304j5 = (C1177304j5) obj;
        return Intrinsics.LJFF(this.LIZ, c1177304j5.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1177304j5.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FcpDecisionResultImpl(inputs=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", winners=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1443605kw
    public final List<String> LIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1443605kw
    public final List<String> LIZIZ() {
        return this.LIZ;
    }

    public C1177304j5(List<String> list, List<String> list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
    }
}
