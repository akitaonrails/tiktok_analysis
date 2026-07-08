package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wSw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1781720wSw extends AbstractC1781930wTH implements InterfaceC1785270wYf {
    public final long LL;
    public final String LLILLJJLI;
    public final List<C1782160wTe> LLILLL;
    public final String LLILZ;
    public final EnumC1785280wYg LLILZIL = EnumC1785280wYg.DM;
    public final int LLILZLL = 2131855868;

    @Override // X.InterfaceC1785270wYf
    public final String LJ() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1781720wSw)) {
            return false;
        }
        C1781720wSw c1781720wSw = (C1781720wSw) obj;
        return this.LL == c1781720wSw.LL && Intrinsics.LJFF(this.LLILLJJLI, c1781720wSw.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1781720wSw.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1781720wSw.LLILZ);
    }

    public final int hashCode() {
        return (((((C786410Ut5.Y2(this.LL) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DM(skuID=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", questions=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1785270wYf
    public final Integer LIZLLL() {
        return Integer.valueOf(this.LLILZLL);
    }

    @Override // X.InterfaceC1785270wYf
    public final long LIZ() {
        return this.LL;
    }

    @Override // X.InterfaceC1785270wYf
    public final EnumC1785280wYg getItemType() {
        return this.LLILZIL;
    }

    public C1781720wSw(long j, String str, List<C1782160wTe> list, String str2) {
        this.LL = j;
        this.LLILLJJLI = str;
        this.LLILLL = list;
        this.LLILZ = str2;
    }
}
