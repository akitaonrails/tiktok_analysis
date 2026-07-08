package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07vN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2017907vN implements InterfaceC0148002o, InterfaceC19321010iO {
    public final boolean LL;
    public final Function1<C07VK, Unit> LLILLJJLI;
    public final C1668880tWw LLILLL;
    public final int LLILZ;
    public final String LLILZIL;
    public final C1668880tWw LLILZLL;
    public final String LLIZ;
    public final Function2<Context, String, Unit> LLIZLLLIL;
    public String LLJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2017907vN)) {
            return false;
        }
        C2017907vN c2017907vN = (C2017907vN) obj;
        return this.LL == c2017907vN.LL && Intrinsics.LJFF(this.LLILLJJLI, c2017907vN.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c2017907vN.LLILLL) && this.LLILZ == c2017907vN.LLILZ && Intrinsics.LJFF(this.LLILZIL, c2017907vN.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c2017907vN.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c2017907vN.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c2017907vN.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c2017907vN.LLJ);
    }

    public final int hashCode() {
        int iZ2 = ((((((C786410Ut5.Z2(this.LL) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ) * 31;
        String str = this.LLILZIL;
        int iHashCode = (iZ2 + (str == null ? 0 : str.hashCode())) * 31;
        C1668880tWw c1668880tWw = this.LLILZLL;
        int iHashCode2 = (iHashCode + (c1668880tWw == null ? 0 : c1668880tWw.hashCode())) * 31;
        String str2 = this.LLIZ;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.LLIZLLLIL.hashCode()) * 31;
        String str3 = this.LLJ;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ScreenTimeCellState(showAlertBadge=");
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
        return Integer.valueOf(this.LLILZ);
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

    /* JADX WARN: Multi-variable type inference failed */
    public C2017907vN(boolean z, Function1<? super C07VK, Unit> function1, C1668880tWw c1668880tWw, int i, String str, C1668880tWw c1668880tWw2, String str2, Function2<? super Context, ? super String, Unit> function2, String str3) {
        this.LL = z;
        this.LLILLJJLI = function1;
        this.LLILLL = c1668880tWw;
        this.LLILZ = i;
        this.LLILZIL = str;
        this.LLILZLL = c1668880tWw2;
        this.LLIZ = str2;
        this.LLIZLLLIL = function2;
        this.LLJ = str3;
    }
}
