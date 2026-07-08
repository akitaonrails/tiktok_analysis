package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ggE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1174920ggE implements InterfaceC1891350zJl {
    public final String LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1174920ggE)) {
            return false;
        }
        C1174920ggE c1174920ggE = (C1174920ggE) obj;
        return Intrinsics.LJFF(this.LL, c1174920ggE.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1174920ggE.LLILLJJLI) && this.LLILLL == c1174920ggE.LLILLL && this.LLILZ == c1174920ggE.LLILZ;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiMapModeFilterDistanceItem(distance=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", distanceDisplay=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", appliedSelectedState=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", currentSelectedState=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1174920ggE c1174920ggE;
        if (C123100dR.LIZ(this.LL)) {
            String str = this.LL;
            String str2 = null;
            if ((interfaceC1891350zJl instanceof C1174920ggE) && (c1174920ggE = (C1174920ggE) interfaceC1891350zJl) != null) {
                str2 = c1174920ggE.LL;
            }
            if (Intrinsics.LJFF(str, str2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C1174920ggE(String str, String str2, boolean z, boolean z2) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = z;
        this.LLILZ = z2;
    }
}
