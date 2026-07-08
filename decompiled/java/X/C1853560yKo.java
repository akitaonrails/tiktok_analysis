package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yKo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1853560yKo implements InterfaceC1891350zJl {
    public final EnumC1853760yL8 LL;
    public final int LLILLJJLI;
    public EnumC1767370w5n LLILLL;
    public final boolean LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1853560yKo)) {
            return false;
        }
        C1853560yKo c1853560yKo = (C1853560yKo) obj;
        return this.LL == c1853560yKo.LL && this.LLILLJJLI == c1853560yKo.LLILLJJLI && this.LLILLL == c1853560yKo.LLILLL && this.LLILZ == c1853560yKo.LLILZ;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31) + this.LLILLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ActionItem(action=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", columns=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", radiusCorner=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isBlockCameraBtn=");
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
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C1853560yKo(EnumC1853760yL8 enumC1853760yL8, int i, boolean z, int i2) {
        EnumC1767370w5n enumC1767370w5n;
        i = (i2 & 2) != 0 ? 3 : i;
        if ((i2 & 4) != 0) {
            enumC1767370w5n = EnumC1767370w5n.NONE;
        } else {
            enumC1767370w5n = null;
        }
        z = (i2 & 8) != 0 ? false : z;
        this.LL = enumC1853760yL8;
        this.LLILLJJLI = i;
        this.LLILLL = enumC1767370w5n;
        this.LLILZ = z;
    }
}
