package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ufh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1712750ufh implements InterfaceC1891350zJl {
    public final EnumC1711310udN LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1712750ufh)) {
            return false;
        }
        C1712750ufh c1712750ufh = (C1712750ufh) obj;
        return this.LL == c1712750ufh.LL && Intrinsics.LJFF(this.LLILLJJLI, c1712750ufh.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1712750ufh.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1712750ufh.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1712750ufh.LLILZIL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EmptyRefundCashierCellItem(uiMode=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", content=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", actionText=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", actionLink=");
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

    public C1712750ufh(EnumC1711310udN enumC1711310udN, String str, String str2, String str3, String str4) {
        this.LL = enumC1711310udN;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
    }
}
