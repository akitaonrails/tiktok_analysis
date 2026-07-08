package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS617S0100000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07uf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2013507uf implements InterfaceC0148002o, InterfaceC19321010iO {
    public final int LL;
    public final C1668880tWw LLILLJJLI;
    public final Function1<InterfaceC1871607Us, Unit> LLILLL;
    public final C1668880tWw LLILZ;
    public final Integer LLILZIL;
    public final String LLILZLL;
    public final C1668880tWw LLIZ;
    public final String LLIZLLLIL;
    public final Function2<Context, String, Unit> LLJ;
    public String LLJI;

    public C2013507uf() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2013507uf)) {
            return false;
        }
        C2013507uf c2013507uf = (C2013507uf) obj;
        return this.LL == c2013507uf.LL && Intrinsics.LJFF(this.LLILLJJLI, c2013507uf.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c2013507uf.LLILLL) && Intrinsics.LJFF(this.LLILZ, c2013507uf.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c2013507uf.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c2013507uf.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c2013507uf.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c2013507uf.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c2013507uf.LLJ) && Intrinsics.LJFF(this.LLJI, c2013507uf.LLJI);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31;
        C1668880tWw c1668880tWw = this.LLILZ;
        int iHashCode2 = (iHashCode + (c1668880tWw == null ? 0 : c1668880tWw.hashCode())) * 31;
        Integer num = this.LLILZIL;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.LLILZLL;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        C1668880tWw c1668880tWw2 = this.LLIZ;
        int iHashCode5 = (iHashCode4 + (c1668880tWw2 == null ? 0 : c1668880tWw2.hashCode())) * 31;
        String str2 = this.LLIZLLLIL;
        int iHashCode6 = (((iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.LLJ.hashCode()) * 31;
        String str3 = this.LLJI;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DataSaverCellState(titleRes=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", iconRes=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", eventSink=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", iconId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", titleId=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", iconUrl=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", searchIconId=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", titleValue=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", action=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", key=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC19321010iO
    public final Integer LIZ() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC19321010iO
    public final String LIZIZ() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC19321010iO
    public final C1668880tWw LIZLLL() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC19321010iO
    public final C1668880tWw LJ() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC19321010iO
    public final Function2<Context, String, Unit> getAction() {
        return this.LLJ;
    }

    @Override // X.InterfaceC19321010iO
    public final String getKey() {
        return this.LLJI;
    }

    @Override // X.InterfaceC19321010iO
    public final void setKey(String str) {
        this.LLJI = str;
    }

    public C2013507uf(int i, C1668880tWw c1668880tWw, C1928507gx c1928507gx, C1668880tWw c1668880tWw2, Integer num, C1668880tWw c1668880tWw3, AwS617S0100000_3 awS617S0100000_3, String str) {
        this.LL = i;
        this.LLILLJJLI = c1668880tWw;
        this.LLILLL = c1928507gx;
        this.LLILZ = c1668880tWw2;
        this.LLILZIL = num;
        this.LLILZLL = null;
        this.LLIZ = c1668880tWw3;
        this.LLIZLLLIL = null;
        this.LLJ = awS617S0100000_3;
        this.LLJI = str;
    }
}
