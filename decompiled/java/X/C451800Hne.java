package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Hne, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C451800Hne implements InterfaceC1891350zJl, InterfaceC1015900cXk {
    public final String LL;
    public final boolean LLILLJJLI;
    public final int LLILLL;
    public Float LLILZ;
    public Float LLILZIL;

    @Override // X.InterfaceC1015900cXk
    public final Float LIZ(int i) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C451800Hne)) {
            return false;
        }
        C451800Hne c451800Hne = (C451800Hne) obj;
        return Intrinsics.LJFF(this.LL, c451800Hne.LL) && this.LLILLJJLI == c451800Hne.LLILLJJLI && this.LLILLL == c451800Hne.LLILLL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + this.LLILLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TabItemRenderData(tabTitle=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isSelected=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", index=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1015900cXk
    public final Float LJIIIIZZ() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1015900cXk
    public final Float LJIILIIL() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1015900cXk
    public final void LIZIZ(Float f) {
        this.LLILZIL = f;
    }

    @Override // X.InterfaceC1015900cXk
    public final void LJI(Float f) {
        this.LLILZ = f;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C451800Hne c451800Hne;
        if (!areItemTheSame(interfaceC1891350zJl) || !(interfaceC1891350zJl instanceof C451800Hne) || (c451800Hne = (C451800Hne) interfaceC1891350zJl) == null || this.LLILLJJLI != c451800Hne.LLILLJJLI) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C451800Hne c451800Hne;
        String str = this.LL;
        String str2 = null;
        if ((interfaceC1891350zJl instanceof C451800Hne) && (c451800Hne = (C451800Hne) interfaceC1891350zJl) != null) {
            str2 = c451800Hne.LL;
        }
        return Intrinsics.LJFF(str, str2);
    }

    public C451800Hne(String str, boolean z, int i) {
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = i;
    }
}
