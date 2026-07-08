package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS617S0100000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07um, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2014207um implements InterfaceC0148002o, InterfaceC19321010iO {
    public final Function1<C07VE, Unit> LL;
    public final C1668880tWw LLILLJJLI;
    public final Integer LLILLL;
    public final String LLILZ;
    public final C1668880tWw LLILZIL;
    public final String LLILZLL;
    public final Function2<Context, String, Unit> LLIZ;
    public String LLIZLLLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2014207um)) {
            return false;
        }
        C2014207um c2014207um = (C2014207um) obj;
        return Intrinsics.LJFF(this.LL, c2014207um.LL) && Intrinsics.LJFF(this.LLILLJJLI, c2014207um.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c2014207um.LLILLL) && Intrinsics.LJFF(this.LLILZ, c2014207um.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c2014207um.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c2014207um.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c2014207um.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c2014207um.LLIZLLLIL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C1668880tWw c1668880tWw = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c1668880tWw == null ? 0 : c1668880tWw.hashCode())) * 31;
        Integer num = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        C1668880tWw c1668880tWw2 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (c1668880tWw2 == null ? 0 : c1668880tWw2.hashCode())) * 31;
        String str2 = this.LLILZLL;
        int iHashCode6 = (((iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.LLIZ.hashCode()) * 31;
        String str3 = this.LLIZLLLIL;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BackgroundAudioCellState(eventSink=");
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
        return this.LLILLL;
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

    public C2014207um(Integer num, C1927307gl c1927307gl, AwS617S0100000_3 awS617S0100000_3) {
        C1668880tWw c1668880tWw = C1669660tYC.LLJJJJLIIL;
        C1668880tWw c1668880tWw2 = C1669660tYC.LLJJJJJIL;
        this.LL = c1927307gl;
        this.LLILLJJLI = c1668880tWw;
        this.LLILLL = num;
        this.LLILZ = null;
        this.LLILZIL = c1668880tWw2;
        this.LLILZLL = null;
        this.LLIZ = awS617S0100000_3;
        this.LLIZLLLIL = null;
    }
}
