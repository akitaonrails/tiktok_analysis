package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS617S0100000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07v0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2015607v0 implements InterfaceC0148002o, InterfaceC19321010iO {
    public final Function1<C07VQ, Unit> LL;
    public final C1668880tWw LLILLJJLI;
    public final int LLILLL;
    public final String LLILZ;
    public final C1668880tWw LLILZIL;
    public final String LLILZLL;
    public final Function2<Context, String, Unit> LLIZ;
    public String LLIZLLLIL;

    public C2015607v0() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2015607v0)) {
            return false;
        }
        C2015607v0 c2015607v0 = (C2015607v0) obj;
        return Intrinsics.LJFF(this.LL, c2015607v0.LL) && Intrinsics.LJFF(this.LLILLJJLI, c2015607v0.LLILLJJLI) && this.LLILLL == c2015607v0.LLILLL && Intrinsics.LJFF(this.LLILZ, c2015607v0.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c2015607v0.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c2015607v0.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c2015607v0.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c2015607v0.LLIZLLLIL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL) * 31;
        String str = this.LLILZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C1668880tWw c1668880tWw = this.LLILZIL;
        int iHashCode3 = (iHashCode2 + (c1668880tWw == null ? 0 : c1668880tWw.hashCode())) * 31;
        String str2 = this.LLILZLL;
        int iHashCode4 = (((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.LLIZ.hashCode()) * 31;
        String str3 = this.LLIZLLLIL;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ContentPreferenceCellState(eventSink=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", iconId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", titleId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", iconUrl=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", searchIconId=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", titleValue=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", action=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", key=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC19321010iO
    public final Integer LIZ() {
        return Integer.valueOf(this.LLILLL);
    }

    @Override // X.InterfaceC19321010iO
    public final String LIZIZ() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC19321010iO
    public final C1668880tWw LIZLLL() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC19321010iO
    public final C1668880tWw LJ() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC19321010iO
    public final Function2<Context, String, Unit> getAction() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC19321010iO
    public final String getKey() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC19321010iO
    public final void setKey(String str) {
        this.LLIZLLLIL = str;
    }

    public C2015607v0(C1929207h4 c1929207h4, AwS617S0100000_3 awS617S0100000_3) {
        C1668880tWw c1668880tWw = C1669660tYC.S;
        C1668880tWw c1668880tWw2 = C1669660tYC.R;
        this.LL = c1929207h4;
        this.LLILLJJLI = c1668880tWw;
        this.LLILLL = 2131847648;
        this.LLILZ = null;
        this.LLILZIL = c1668880tWw2;
        this.LLILZLL = null;
        this.LLIZ = awS617S0100000_3;
        this.LLIZLLLIL = null;
    }
}
