package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Gj0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C423440Gj0 implements InterfaceC1891350zJl {
    public final Integer LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;
    public final Integer LLILZ;

    public C423440Gj0() {
        this(15, null, null, null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C423440Gj0)) {
            return false;
        }
        C423440Gj0 c423440Gj0 = (C423440Gj0) obj;
        return Intrinsics.LJFF(this.LL, c423440Gj0.LL) && Intrinsics.LJFF(this.LLILLJJLI, c423440Gj0.LLILLJJLI) && this.LLILLL == c423440Gj0.LLILLL && Intrinsics.LJFF(this.LLILZ, c423440Gj0.LLILZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        Integer num = this.LL;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31;
        Integer num2 = this.LLILZ;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DetailTitleItem(titleRes=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", titleString=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", forceUseString=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", font=");
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

    public C423440Gj0(int i, Integer num, Integer num2, String str, boolean z) {
        num = (i & 1) != 0 ? null : num;
        str = (i & 2) != 0 ? null : str;
        z = (i & 4) != 0 ? false : z;
        num2 = (i & 8) != 0 ? null : num2;
        this.LL = num;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = num2;
    }
}
