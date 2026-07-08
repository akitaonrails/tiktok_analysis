package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qtl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C684910Qtl implements InterfaceC1891350zJl, InterfaceC1015900cXk {
    public final String LL;
    public final C682270QpV LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public Float LLILZLL;
    public Float LLIZ;

    @Override // X.InterfaceC1015900cXk
    public final Float LIZ(int i) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C684910Qtl)) {
            return false;
        }
        C684910Qtl c684910Qtl = (C684910Qtl) obj;
        return Intrinsics.LJFF(this.LL, c684910Qtl.LL) && Intrinsics.LJFF(this.LLILLJJLI, c684910Qtl.LLILLJJLI) && this.LLILLL == c684910Qtl.LLILLL && this.LLILZ == c684910Qtl.LLILZ && this.LLILZIL == c684910Qtl.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c684910Qtl.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c684910Qtl.LLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31;
        Float f = this.LLILZLL;
        int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.LLIZ;
        return iHashCode2 + (f2 != null ? f2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchPovInteractionPowerItem(uniqueIdForMob=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", interactionModel=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", useSmallIcon=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", disableBackground=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", hasCollapseIcon=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", topSpaceDP=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", bottomSpaceDP=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1015900cXk
    public final Float LJIIIIZZ() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC1015900cXk
    public final Float LJIILIIL() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1015900cXk
    public final void LIZIZ(Float f) {
        this.LLIZ = f;
    }

    @Override // X.InterfaceC1015900cXk
    public final void LJI(Float f) {
        this.LLILZLL = f;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public /* synthetic */ C684910Qtl(String str, C682270QpV c682270QpV, boolean z, boolean z2, Float f, Float f2) {
        this(str, c682270QpV, z, z2, false, f, f2);
    }

    public C684910Qtl(String str, C682270QpV c682270QpV, boolean z, boolean z2, boolean z3, Float f, Float f2) {
        this.LL = str;
        this.LLILLJJLI = c682270QpV;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = z3;
        this.LLILZLL = f;
        this.LLIZ = f2;
    }
}
