package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07v3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2015907v3 implements InterfaceC0148002o, InterfaceC19321010iO {
    public final boolean LL;
    public final Function1<C07W5, Unit> LLILLJJLI;
    public final C1668880tWw LLILLL;
    public final Integer LLILZ;
    public final String LLILZIL;
    public final C1668880tWw LLILZLL;
    public final String LLIZ;
    public final Function2<Context, String, Unit> LLIZLLLIL;
    public String LLJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2015907v3)) {
            return false;
        }
        C2015907v3 c2015907v3 = (C2015907v3) obj;
        return this.LL == c2015907v3.LL && Intrinsics.LJFF(this.LLILLJJLI, c2015907v3.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c2015907v3.LLILLL) && Intrinsics.LJFF(this.LLILZ, c2015907v3.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c2015907v3.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c2015907v3.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c2015907v3.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c2015907v3.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c2015907v3.LLJ);
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.LL) * 31) + this.LLILLJJLI.hashCode()) * 31;
        C1668880tWw c1668880tWw = this.LLILLL;
        int iHashCode = (iZ2 + (c1668880tWw == null ? 0 : c1668880tWw.hashCode())) * 31;
        Integer num = this.LLILZ;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.LLILZIL;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        C1668880tWw c1668880tWw2 = this.LLILZLL;
        int iHashCode4 = (iHashCode3 + (c1668880tWw2 == null ? 0 : c1668880tWw2.hashCode())) * 31;
        String str2 = this.LLIZ;
        int iHashCode5 = (((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.LLIZLLLIL.hashCode()) * 31;
        String str3 = this.LLJ;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnalyticsCellState(isBadgeVisible=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", eventSink=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", iconId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", titleId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", iconUrl=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", searchIconId=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", titleValue=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", action=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", key=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC19321010iO
    public final Integer LIZ() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC19321010iO
    public final String LIZIZ() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC19321010iO
    public final C1668880tWw LIZLLL() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC19321010iO
    public final C1668880tWw LJ() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC19321010iO
    public final Function2<Context, String, Unit> getAction() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC19321010iO
    public final String getKey() {
        return this.LLJ;
    }

    @Override // X.InterfaceC19321010iO
    public final void setKey(String str) {
        this.LLJ = str;
    }

    public C2015907v3(Integer num, Function1 function1, Function2 function2, boolean z) {
        C1668880tWw c1668880tWw = C1669660tYC.LLLIILIL;
        C1668880tWw c1668880tWw2 = C1669660tYC.LLLIIL;
        this.LL = z;
        this.LLILLJJLI = function1;
        this.LLILLL = c1668880tWw;
        this.LLILZ = num;
        this.LLILZIL = null;
        this.LLILZLL = c1668880tWw2;
        this.LLIZ = null;
        this.LLIZLLLIL = function2;
        this.LLJ = null;
    }
}
