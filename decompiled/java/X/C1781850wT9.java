package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wT9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1781850wT9 extends AbstractC1781930wTH implements InterfaceC1785270wYf {
    public final long LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final boolean LLILZIL;
    public final EnumC1785280wYg LLILZLL = EnumC1785280wYg.CALENDLY;
    public final int LLIZ = 2131855860;

    @Override // X.InterfaceC1785270wYf
    public final String LJ() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1781850wT9)) {
            return false;
        }
        C1781850wT9 c1781850wT9 = (C1781850wT9) obj;
        return this.LL == c1781850wT9.LL && Intrinsics.LJFF(this.LLILLJJLI, c1781850wT9.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1781850wT9.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1781850wT9.LLILZ) && this.LLILZIL == c1781850wT9.LLILZIL;
    }

    public final int hashCode() {
        return (((((((C786410Ut5.Y2(this.LL) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZIL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Calendar(skuID=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", subtitle=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", useMockIllustrator=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1785270wYf
    public final Integer LIZLLL() {
        return Integer.valueOf(this.LLIZ);
    }

    @Override // X.InterfaceC1785270wYf
    public final long LIZ() {
        return this.LL;
    }

    @Override // X.InterfaceC1785270wYf
    public final EnumC1785280wYg getItemType() {
        return this.LLILZLL;
    }

    public C1781850wT9(long j, String str, boolean z, String str2, String str3) {
        this.LL = j;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = z;
    }
}
