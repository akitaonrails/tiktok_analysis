package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qtj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C684890Qtj implements InterfaceC1891350zJl, InterfaceC1015900cXk {
    public final String LL;
    public Float LLILLJJLI;
    public Float LLILLL;

    @Override // X.InterfaceC1015900cXk
    public final Float LIZ(int i) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C684890Qtj)) {
            return false;
        }
        C684890Qtj c684890Qtj = (C684890Qtj) obj;
        return Intrinsics.LJFF(this.LL, c684890Qtj.LL) && Intrinsics.LJFF(this.LLILLJJLI, c684890Qtj.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c684890Qtj.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        Float f = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.LLILLL;
        return iHashCode2 + (f2 != null ? f2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LandingPageDisclaimerItem(disclaimer=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", topSpaceDP=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", bottomSpaceDP=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1015900cXk
    public final Float LJIIIIZZ() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1015900cXk
    public final Float LJIILIIL() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1015900cXk
    public final void LIZIZ(Float f) {
        this.LLILLL = f;
    }

    @Override // X.InterfaceC1015900cXk
    public final void LJI(Float f) {
        this.LLILLJJLI = f;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C684890Qtj(Float f, Float f2, String str) {
        this.LL = str;
        this.LLILLJJLI = f;
        this.LLILLL = f2;
    }
}
