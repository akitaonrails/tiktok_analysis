package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06vB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1761906vB implements InterfaceC904740ZeS {
    public final List<C869590Y9l> LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1761906vB)) {
            return false;
        }
        C1761906vB c1761906vB = (C1761906vB) obj;
        return Intrinsics.LJFF(this.LIZ, c1761906vB.LIZ) && this.LIZIZ == c1761906vB.LIZIZ;
    }

    @Override // X.InterfaceC904740ZeS
    public final String getName() {
        return "OnLoadNewerEvent";
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnLoadNewerEvent(list=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", success=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1761906vB(List<? extends C869590Y9l> list, boolean z) {
        this.LIZ = list;
        this.LIZIZ = z;
    }
}
