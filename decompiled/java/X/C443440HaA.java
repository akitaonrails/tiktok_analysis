package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HaA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C443440HaA implements InterfaceC1891350zJl {
    public final C443430Ha9 LL;
    public final int LLILLJJLI;
    public final String LLILLL;
    public final InterfaceC1631620sYq<String, String, Integer, Unit> LLILZ;
    public final InterfaceC1631630sYr<String, String, Integer, String, Unit> LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C443440HaA)) {
            return false;
        }
        C443440HaA c443440HaA = (C443440HaA) obj;
        return Intrinsics.LJFF(this.LL, c443440HaA.LL) && this.LLILLJJLI == c443440HaA.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c443440HaA.LLILLL) && Intrinsics.LJFF(this.LLILZ, c443440HaA.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c443440HaA.LLILZIL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        C443430Ha9 c443430Ha9 = this.LL;
        int iHashCode = (((((((c443430Ha9 == null ? 0 : c443430Ha9.hashCode()) * 31) + this.LLILLJJLI) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31;
        InterfaceC1631630sYr<String, String, Integer, String, Unit> interfaceC1631630sYr = this.LLILZIL;
        return iHashCode + (interfaceC1631630sYr != null ? interfaceC1631630sYr.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoOnboardingVerticalItem(verticalUIInfo=");
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

    public C443440HaA(C443430Ha9 c443430Ha9, int i, String str, C1863050ya7 c1863050ya7, C1863090yaB c1863090yaB) {
        this.LL = c443430Ha9;
        this.LLILLJJLI = i;
        this.LLILLL = str;
        this.LLILZ = c1863050ya7;
        this.LLILZIL = c1863090yaB;
    }
}
