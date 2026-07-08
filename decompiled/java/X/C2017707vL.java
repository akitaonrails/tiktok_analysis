package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS285S0000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07vL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2017707vL implements InterfaceC0148002o, InterfaceC19321010iO {
    public final C1668880tWw LL;
    public final int LLILLJJLI;
    public final String LLILLL;
    public final C1668880tWw LLILZ;
    public final String LLILZIL;
    public final Function2<Context, String, Unit> LLILZLL;
    public String LLIZ;

    public C2017707vL() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2017707vL)) {
            return false;
        }
        C2017707vL c2017707vL = (C2017707vL) obj;
        return Intrinsics.LJFF(this.LL, c2017707vL.LL) && this.LLILLJJLI == c2017707vL.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c2017707vL.LLILLL) && Intrinsics.LJFF(this.LLILZ, c2017707vL.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c2017707vL.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c2017707vL.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c2017707vL.LLIZ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31;
        String str = this.LLILLL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C1668880tWw c1668880tWw = this.LLILZ;
        int iHashCode3 = (iHashCode2 + (c1668880tWw == null ? 0 : c1668880tWw.hashCode())) * 31;
        String str2 = this.LLILZIL;
        int iHashCode4 = (((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.LLILZLL.hashCode()) * 31;
        String str3 = this.LLIZ;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SwitchInboxModeCellState(iconId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", titleId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", iconUrl=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", searchIconId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", titleValue=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", action=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", key=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC19321010iO
    public final Integer LIZ() {
        return Integer.valueOf(this.LLILLJJLI);
    }

    @Override // X.InterfaceC19321010iO
    public final String LIZIZ() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC19321010iO
    public final C1668880tWw LIZLLL() {
        return this.LL;
    }

    @Override // X.InterfaceC19321010iO
    public final C1668880tWw LJ() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC19321010iO
    public final Function2<Context, String, Unit> getAction() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC19321010iO
    public final String getKey() {
        return this.LLIZ;
    }

    public C2017707vL(AFwS285S0000000_2 aFwS285S0000000_2) {
        C1668880tWw c1668880tWw = C1669660tYC.LLLLZLL;
        C1668880tWw c1668880tWw2 = C1669660tYC.LLLLZIL;
        this.LL = c1668880tWw;
        this.LLILLJJLI = 2131836142;
        this.LLILLL = null;
        this.LLILZ = c1668880tWw2;
        this.LLILZIL = null;
        this.LLILZLL = aFwS285S0000000_2;
        this.LLIZ = null;
    }

    @Override // X.InterfaceC19321010iO
    public final void setKey(String str) {
        this.LLIZ = str;
    }
}
