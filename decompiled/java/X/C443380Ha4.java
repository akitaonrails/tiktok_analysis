package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ha4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C443380Ha4 implements InterfaceC1891350zJl {
    public final C443390Ha5 LL;
    public final int LLILLJJLI;
    public final String LLILLL;
    public final InterfaceC1631620sYq<String, String, Integer, Unit> LLILZ;
    public final InterfaceC1631630sYr<String, String, Integer, String, Unit> LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C443380Ha4)) {
            return false;
        }
        C443380Ha4 c443380Ha4 = (C443380Ha4) obj;
        return Intrinsics.LJFF(this.LL, c443380Ha4.LL) && this.LLILLJJLI == c443380Ha4.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c443380Ha4.LLILLL) && Intrinsics.LJFF(this.LLILZ, c443380Ha4.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c443380Ha4.LLILZIL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        C443390Ha5 c443390Ha5 = this.LL;
        int iHashCode = (((((((c443390Ha5 == null ? 0 : c443390Ha5.hashCode()) * 31) + this.LLILLJJLI) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31;
        InterfaceC1631630sYr<String, String, Integer, String, Unit> interfaceC1631630sYr = this.LLILZIL;
        return iHashCode + (interfaceC1631630sYr != null ? interfaceC1631630sYr.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoOnboardingHorizontalItem(horizontalUIInfo=");
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

    public C443380Ha4(C443390Ha5 c443390Ha5, int i, String str, C1863070ya9 c1863070ya9, C1863110yaD c1863110yaD) {
        this.LL = c443390Ha5;
        this.LLILLJJLI = i;
        this.LLILLL = str;
        this.LLILZ = c1863070ya9;
        this.LLILZIL = c1863110yaD;
    }
}
