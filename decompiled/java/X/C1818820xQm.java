package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xQm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1818820xQm implements InterfaceC1891350zJl {
    public final String LL;
    public final String LLILLJJLI;
    public final int LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public final EnumC1818710xQb LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1818820xQm)) {
            return false;
        }
        C1818820xQm c1818820xQm = (C1818820xQm) obj;
        return Intrinsics.LJFF(this.LL, c1818820xQm.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1818820xQm.LLILLJJLI) && this.LLILLL == c1818820xQm.LLILLL && this.LLILZ == c1818820xQm.LLILZ && this.LLILZIL == c1818820xQm.LLILZIL && this.LLILZLL == c1818820xQm.LLILZLL;
    }

    public final int hashCode() {
        return (((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + this.LLILZLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SceneryModeOperationItem(id=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", iconRes=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isSelected=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isEnabled=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", operationType=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1818820xQm) {
            C1818820xQm c1818820xQm = (C1818820xQm) interfaceC1891350zJl;
            if (c1818820xQm.LLILZ == this.LLILZ && Intrinsics.LJFF(c1818820xQm.LL, this.LL)) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1818820xQm) {
            return Intrinsics.LJFF(((C1818820xQm) interfaceC1891350zJl).LL, this.LL);
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        if (interfaceC1891350zJl instanceof C1818820xQm) {
            if (((C1818820xQm) interfaceC1891350zJl).LLILZ != this.LLILZ) {
                z = true;
            } else {
                z = false;
            }
            return new C1818900xQu(z);
        }
        return null;
    }

    public /* synthetic */ C1818820xQm(String str, String str2, int i, boolean z, EnumC1818710xQb enumC1818710xQb, int i2) {
        this(str, str2, i, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0, enumC1818710xQb);
    }

    public C1818820xQm(String str, String str2, int i, boolean z, boolean z2, EnumC1818710xQb enumC1818710xQb) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = i;
        this.LLILZ = z;
        this.LLILZIL = z2;
        this.LLILZLL = enumC1818710xQb;
    }
}
