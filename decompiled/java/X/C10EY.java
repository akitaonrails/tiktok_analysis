package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AFwS315S0000000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10EY, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10EY implements InterfaceC0148002o, InterfaceC19321010iO {
    public static final C10EY LLJI;
    public final Function1<InterfaceC1872807Ve, Unit> LL;
    public final String LLILLJJLI;
    public String LLILLL;
    public final C1668880tWw LLILZ;
    public final Integer LLILZIL;
    public final String LLILZLL;
    public final C1668880tWw LLIZ;
    public final String LLIZLLLIL;
    public final Function2<Context, String, Unit> LLJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10EY)) {
            return false;
        }
        C10EY c10ey = (C10EY) obj;
        return Intrinsics.LJFF(this.LL, c10ey.LL) && Intrinsics.LJFF(this.LLILLJJLI, c10ey.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c10ey.LLILLL) && Intrinsics.LJFF(this.LLILZ, c10ey.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c10ey.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c10ey.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c10ey.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c10ey.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c10ey.LLJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        String str = this.LLILLL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C1668880tWw c1668880tWw = this.LLILZ;
        int iHashCode3 = (iHashCode2 + (c1668880tWw == null ? 0 : c1668880tWw.hashCode())) * 31;
        Integer num = this.LLILZIL;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.LLILZLL;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C1668880tWw c1668880tWw2 = this.LLIZ;
        return ((((iHashCode5 + (c1668880tWw2 != null ? c1668880tWw2.hashCode() : 0)) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrivacyItemState(eventSink=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", rightLabel=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", key=");
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
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        AFwS271S0000000_28 aFwS271S0000000_28 = AFwS271S0000000_28.get$arr$(209);
        C1668880tWw c1668880tWw = C1668100tVg.LIZ;
        LLJI = new C10EY(c1668880tWw, c1668880tWw, "", "", "", aFwS271S0000000_28, AFwS315S0000000_28.get$arr$(32));
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
        return this.LLILLL;
    }

    @Override // X.InterfaceC19321010iO
    public final void setKey(String str) {
        this.LLILLL = str;
    }

    public static C10EY LJI(C10EY c10ey, String str) {
        Function1<InterfaceC1872807Ve, Unit> function1 = c10ey.LL;
        String str2 = c10ey.LLILLL;
        C1668880tWw c1668880tWw = c10ey.LLILZ;
        Integer num = c10ey.LLILZIL;
        String str3 = c10ey.LLILZLL;
        C1668880tWw c1668880tWw2 = c10ey.LLIZ;
        String str4 = c10ey.LLIZLLLIL;
        Function2<Context, String, Unit> function2 = c10ey.LLJ;
        c10ey.getClass();
        return new C10EY(c1668880tWw, c1668880tWw2, num, str, str2, str3, str4, function1, function2);
    }

    public /* synthetic */ C10EY(C1668880tWw c1668880tWw, C1668880tWw c1668880tWw2, String str, String str2, String str3, Function1 function1, Function2 function2) {
        this(c1668880tWw, c1668880tWw2, null, str, str2, null, str3, function1, function2);
    }

    public C10EY(C1668880tWw c1668880tWw, C1668880tWw c1668880tWw2, Integer num, String str, String str2, String str3, String str4, Function1 function1, Function2 function2) {
        this.LL = function1;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = c1668880tWw;
        this.LLILZIL = num;
        this.LLILZLL = str3;
        this.LLIZ = c1668880tWw2;
        this.LLIZLLLIL = str4;
        this.LLJ = function2;
    }
}
