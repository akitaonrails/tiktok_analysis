package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS617S0100000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07uX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2012707uX implements InterfaceC0148002o, InterfaceC19321010iO {
    public final Function1<InterfaceC1874807Vy, Unit> LL;
    public String LLILLJJLI;
    public final C1668880tWw LLILLL;
    public final Integer LLILZ;
    public final String LLILZIL;
    public final C1668880tWw LLILZLL;
    public final String LLIZ;
    public final Function2<Context, String, Unit> LLIZLLLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2012707uX)) {
            return false;
        }
        C2012707uX c2012707uX = (C2012707uX) obj;
        return Intrinsics.LJFF(this.LL, c2012707uX.LL) && Intrinsics.LJFF(this.LLILLJJLI, c2012707uX.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c2012707uX.LLILLL) && Intrinsics.LJFF(this.LLILZ, c2012707uX.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c2012707uX.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c2012707uX.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c2012707uX.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c2012707uX.LLIZLLLIL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C1668880tWw c1668880tWw = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (c1668880tWw == null ? 0 : c1668880tWw.hashCode())) * 31;
        Integer num = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C1668880tWw c1668880tWw2 = this.LLILZLL;
        int iHashCode6 = (iHashCode5 + (c1668880tWw2 == null ? 0 : c1668880tWw2.hashCode())) * 31;
        String str3 = this.LLIZ;
        return ((iHashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.LLIZLLLIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ManagePostsCellState(eventSink=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", key=");
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
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC19321010iO
    public final void setKey(String str) {
        this.LLILLJJLI = str;
    }

    public C2012707uX(Integer num, C1928207gu c1928207gu, AwS617S0100000_3 awS617S0100000_3) {
        C1668880tWw c1668880tWw = C1669660tYC.T;
        this.LL = c1928207gu;
        this.LLILLJJLI = null;
        this.LLILLL = c1668880tWw;
        this.LLILZ = num;
        this.LLILZIL = null;
        this.LLILZLL = c1668880tWw;
        this.LLIZ = null;
        this.LLIZLLLIL = awS617S0100000_3;
    }
}
