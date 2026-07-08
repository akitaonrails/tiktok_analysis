package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wSx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1781730wSx extends AbstractC1781930wTH implements InterfaceC1785270wYf {
    public final long LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final EnumC1785280wYg LLILZ = EnumC1785280wYg.FORM;
    public final int LLILZIL = 2131855872;

    @Override // X.InterfaceC1785270wYf
    public final String LJ() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1781730wSx)) {
            return false;
        }
        C1781730wSx c1781730wSx = (C1781730wSx) obj;
        return this.LL == c1781730wSx.LL && Intrinsics.LJFF(this.LLILLJJLI, c1781730wSx.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1781730wSx.LLILLL);
    }

    public final int hashCode() {
        return (((C786410Ut5.Y2(this.LL) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Form(skuID=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1785270wYf
    public final Integer LIZLLL() {
        return Integer.valueOf(this.LLILZIL);
    }

    @Override // X.InterfaceC1785270wYf
    public final long LIZ() {
        return this.LL;
    }

    @Override // X.InterfaceC1785270wYf
    public final EnumC1785280wYg getItemType() {
        return this.LLILZ;
    }

    public C1781730wSx(long j, String str, String str2) {
        this.LL = j;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }
}
