package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Zl1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C908810Zl1 implements InterfaceC901690ZYx {
    public final String LL;
    public final String LLILLJJLI = "store";
    public final C908850Zl5 LLILLL;
    public final String LLILZ;
    public final InterfaceC908930ZlD LLILZIL;
    public final Function1<C908560Zkc, Unit> LLILZLL;
    public final Function1<C908560Zkc, Unit> LLIZ;
    public final Map<String, String> LLIZLLLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C908810Zl1)) {
            return false;
        }
        C908810Zl1 c908810Zl1 = (C908810Zl1) obj;
        return Intrinsics.LJFF(this.LL, c908810Zl1.LL) && Intrinsics.LJFF(this.LLILLJJLI, c908810Zl1.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c908810Zl1.LLILLL) && Intrinsics.LJFF(this.LLILZ, c908810Zl1.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c908810Zl1.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c908810Zl1.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c908810Zl1.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c908810Zl1.LLIZLLLIL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31;
        InterfaceC908930ZlD interfaceC908930ZlD = this.LLILZIL;
        int iHashCode2 = (iHashCode + (interfaceC908930ZlD == null ? 0 : interfaceC908930ZlD.hashCode())) * 31;
        Function1<C908560Zkc, Unit> function1 = this.LLILZLL;
        int iHashCode3 = (iHashCode2 + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function1<C908560Zkc, Unit> function12 = this.LLIZ;
        int iHashCode4 = (iHashCode3 + (function12 == null ? 0 : function12.hashCode())) * 31;
        Map<String, String> map = this.LLIZLLLIL;
        return iHashCode4 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("JoinLiveItem(buttonId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", buttonName=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", remoteIconUrl=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", action=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", onClick=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", onDisplay=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", eventTrackingExt=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC901690ZYx
    public final Function1<C908560Zkc, Unit> LJIILJJIL() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC901690ZYx
    public final Map<String, String> LLIILII() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC901690ZYx
    public final String LLILLIZIL() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC901690ZYx
    public final Function1<C908560Zkc, Unit> LLJJIII() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC901690ZYx
    public final InterfaceC908930ZlD getAction() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C908810Zl1)) {
            return false;
        }
        return Intrinsics.LJFF(this.LL, ((C908810Zl1) interfaceC1891350zJl).LL);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C908810Zl1)) {
            return false;
        }
        C908810Zl1 c908810Zl1 = (C908810Zl1) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(this.LLILLL.LIZ, c908810Zl1.LLILLL.LIZ) || !Intrinsics.LJFF(this.LLILZ, c908810Zl1.LLILZ)) {
            return false;
        }
        return true;
    }

    public C908810Zl1(String str, C908850Zl5 c908850Zl5, String str2, C315190CXd c315190CXd, AwS368S0200000_2 awS368S0200000_2, AwS368S0200000_2 awS368S0200000_22, Map map) {
        this.LL = str;
        this.LLILLL = c908850Zl5;
        this.LLILZ = str2;
        this.LLILZIL = c315190CXd;
        this.LLILZLL = awS368S0200000_2;
        this.LLIZ = awS368S0200000_22;
        this.LLIZLLLIL = map;
    }
}
