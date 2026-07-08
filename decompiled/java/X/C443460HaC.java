package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HaC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C443460HaC implements InterfaceC1891350zJl {
    public final C443470HaD LL;
    public final int LLILLJJLI;
    public final String LLILLL;
    public final InterfaceC1631620sYq<String, String, Integer, Unit> LLILZ;
    public final InterfaceC1631630sYr<String, String, Integer, String, Unit> LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C443460HaC)) {
            return false;
        }
        C443460HaC c443460HaC = (C443460HaC) obj;
        return Intrinsics.LJFF(this.LL, c443460HaC.LL) && this.LLILLJJLI == c443460HaC.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c443460HaC.LLILLL) && Intrinsics.LJFF(this.LLILZ, c443460HaC.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c443460HaC.LLILZIL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        C443470HaD c443470HaD = this.LL;
        int iHashCode = (((((((c443470HaD == null ? 0 : c443470HaD.hashCode()) * 31) + this.LLILLJJLI) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31;
        InterfaceC1631630sYr<String, String, Integer, String, Unit> interfaceC1631630sYr = this.LLILZIL;
        return iHashCode + (interfaceC1631630sYr != null ? interfaceC1631630sYr.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoOnBoardingGridItem(gridColorInfo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", rank=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", typeName=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", onClick=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", cellShowMob=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C443460HaC(C443470HaD c443470HaD, int i, String str, C1863060ya8 c1863060ya8, C1863100yaC c1863100yaC) {
        this.LL = c443470HaD;
        this.LLILLJJLI = i;
        this.LLILLL = str;
        this.LLILZ = c1863060ya8;
        this.LLILZIL = c1863100yaC;
    }
}
