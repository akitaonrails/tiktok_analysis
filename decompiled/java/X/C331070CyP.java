package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CyP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C331070CyP implements InterfaceC1891350zJl {
    public final String LL;
    public final int LLILLJJLI;
    public final Boolean LLILLL;
    public final String LLILZ;
    public final boolean LLILZIL;
    public final C329660Cw8 LLILZLL;
    public final C1876907Wt LLIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C331070CyP)) {
            return false;
        }
        C331070CyP c331070CyP = (C331070CyP) obj;
        return Intrinsics.LJFF(this.LL, c331070CyP.LL) && this.LLILLJJLI == c331070CyP.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c331070CyP.LLILLL) && Intrinsics.LJFF(this.LLILZ, c331070CyP.LLILZ) && this.LLILZIL == c331070CyP.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c331070CyP.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c331070CyP.LLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31;
        Boolean bool = this.LLILLL;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.LLILZ;
        return ((((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TagPowerItem(name=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", videoCount=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", showTrailingText=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", trailingGrayText=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", selected=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", loadMoreMeta=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", category=");
        sbLIZ.append(this.LLIZ);
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

    public C331070CyP(String str, int i, Boolean bool, String str2, boolean z, C329660Cw8 c329660Cw8, C1876907Wt c1876907Wt) {
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = bool;
        this.LLILZ = str2;
        this.LLILZIL = z;
        this.LLILZLL = c329660Cw8;
        this.LLIZ = c1876907Wt;
    }
}
