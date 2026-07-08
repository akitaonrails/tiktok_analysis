package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08sh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2256108sh extends AbstractC1921407fo {
    public final List<C2255508sb> LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final InterfaceC2255308sZ LIZLLL;
    public final InterfaceC2256308sj LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2256108sh)) {
            return false;
        }
        C2256108sh c2256108sh = (C2256108sh) obj;
        return Intrinsics.LJFF(this.LIZ, c2256108sh.LIZ) && this.LIZIZ == c2256108sh.LIZIZ && this.LIZJ == c2256108sh.LIZJ && Intrinsics.LJFF(this.LIZLLL, c2256108sh.LIZLLL) && Intrinsics.LJFF(this.LJ, c2256108sh.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31;
        InterfaceC2255308sZ interfaceC2255308sZ = this.LIZLLL;
        return ((iHashCode + (interfaceC2255308sZ == null ? 0 : interfaceC2255308sZ.hashCode())) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiMediaUploadFrameTaskParam(slotInfoList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", maxFrameCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", bizType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", frameCacheProvider=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", frameStrategy=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1921407fo
    public final boolean LIZ(AbstractC1921407fo abstractC1921407fo) {
        if (!(abstractC1921407fo instanceof C2256108sh)) {
            return false;
        }
        C2256108sh c2256108sh = (C2256108sh) abstractC1921407fo;
        if (this.LIZ.size() != c2256108sh.LIZ.size()) {
            return false;
        }
        ArrayList<Pair> arrayList = (ArrayList) C13LP.LLIILII(this.LIZ, c2256108sh.LIZ);
        if (!arrayList.isEmpty()) {
            for (Pair pair : arrayList) {
                C2255508sb c2255508sb = (C2255508sb) pair.getFirst();
                C2255508sb c2255508sb2 = (C2255508sb) pair.getSecond();
                if (!Intrinsics.LJFF(c2255508sb.LIZ, c2255508sb2.LIZ) || c2255508sb.LIZJ != c2255508sb2.LIZJ || c2255508sb.LIZLLL != c2255508sb2.LIZLLL) {
                    return false;
                }
            }
        }
        return true;
    }

    public C2256108sh(List<C2255508sb> list, int i, int i2, InterfaceC2255308sZ interfaceC2255308sZ, InterfaceC2256308sj interfaceC2256308sj) {
        this.LIZ = list;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = interfaceC2255308sZ;
        this.LJ = interfaceC2256308sj;
    }
}
