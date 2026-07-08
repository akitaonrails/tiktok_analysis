package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qgu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C676940Qgu implements InterfaceC0148002o {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public final boolean LLILZLL;
    public final int LLIZ;

    public C676940Qgu() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C676940Qgu)) {
            return false;
        }
        C676940Qgu c676940Qgu = (C676940Qgu) obj;
        return Intrinsics.LJFF(this.LL, c676940Qgu.LL) && Intrinsics.LJFF(this.LLILLJJLI, c676940Qgu.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c676940Qgu.LLILLL) && this.LLILZ == c676940Qgu.LLILZ && this.LLILZIL == c676940Qgu.LLILZIL && this.LLILZLL == c676940Qgu.LLILZLL && this.LLIZ == c676940Qgu.LLIZ;
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILLL;
        return ((((((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31) + this.LLIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcSearchTabSortFilterState(containerUniqueId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", sortKey=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", sortTitle=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", sortPanelOpen=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", filterReady=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", filterVisible=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", filterSelectedCount=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C676940Qgu(int i) {
        this(null, null, null, false, 0, false, false);
    }

    public C676940Qgu(String str, String str2, String str3, boolean z, int i, boolean z2, boolean z3) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = z;
        this.LLILZIL = z2;
        this.LLILZLL = z3;
        this.LLIZ = i;
    }
}
