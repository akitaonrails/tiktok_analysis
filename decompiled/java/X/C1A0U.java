package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1A0U, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A0U implements InterfaceC1004403wI, InterfaceC21715019ye {
    public final String LL;
    public final C042W LLILLJJLI;
    public final EnumC21715119yf LLILLL;
    public final Float LLILZ;
    public final boolean LLILZIL;
    public C21714919yd LLILZLL = new C21714919yd();
    public C1A0V LLIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1A0U)) {
            return false;
        }
        C1A0U c1a0u = (C1A0U) obj;
        return Intrinsics.LJFF(this.LL, c1a0u.LL) && this.LLILLJJLI == c1a0u.LLILLJJLI && this.LLILLL == c1a0u.LLILLL && Intrinsics.LJFF(this.LLILZ, c1a0u.LLILZ) && this.LLILZIL == c1a0u.LLILZIL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31;
        Float f = this.LLILZ;
        return ((iHashCode + (f == null ? 0 : f.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZIL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OspExpandableSpecVO(name=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", variation=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", size=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", radioSize=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", hasDisplayPrice=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC21715019ye
    public final void LIZ(C21714919yd c21714919yd) {
        this.LLILZLL = c21714919yd;
    }

    @Override // X.InterfaceC21715019ye
    public final void LIZIZ(C212363188r c212363188r) {
        this.LLIZ = c212363188r;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C1004303wH.LIZ(this, interfaceC1891350zJl);
    }

    public C1A0U(String str, C042W c042w, EnumC21715119yf enumC21715119yf, Float f, boolean z) {
        this.LL = str;
        this.LLILLJJLI = c042w;
        this.LLILLL = enumC21715119yf;
        this.LLILZ = f;
        this.LLILZIL = z;
    }
}
