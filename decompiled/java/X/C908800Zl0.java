package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS223S0300000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Zl0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C908800Zl0 implements InterfaceC908890Zl9 {
    public final String LL;
    public final String LLILLJJLI;
    public final C908840Zl4 LLILLL;
    public final C908850Zl5 LLILZ;
    public final boolean LLILZIL = true;
    public final InterfaceC908930ZlD LLILZLL;
    public final Function1<C908560Zkc, Unit> LLIZ;
    public final Function1<C908560Zkc, Unit> LLIZLLLIL;
    public final Map<String, String> LLJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C908800Zl0)) {
            return false;
        }
        C908800Zl0 c908800Zl0 = (C908800Zl0) obj;
        return Intrinsics.LJFF(this.LL, c908800Zl0.LL) && Intrinsics.LJFF(this.LLILLJJLI, c908800Zl0.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c908800Zl0.LLILLL) && Intrinsics.LJFF(this.LLILZ, c908800Zl0.LLILZ) && this.LLILZIL == c908800Zl0.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c908800Zl0.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c908800Zl0.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c908800Zl0.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c908800Zl0.LLJ);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31;
        InterfaceC908930ZlD interfaceC908930ZlD = this.LLILZLL;
        int iHashCode2 = (iHashCode + (interfaceC908930ZlD == null ? 0 : interfaceC908930ZlD.hashCode())) * 31;
        Function1<C908560Zkc, Unit> function1 = this.LLIZ;
        int iHashCode3 = (iHashCode2 + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function1<C908560Zkc, Unit> function12 = this.LLIZLLLIL;
        int iHashCode4 = (iHashCode3 + (function12 == null ? 0 : function12.hashCode())) * 31;
        Map<String, String> map = this.LLJ;
        return iHashCode4 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RemoteIconWithDotItem(buttonId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", buttonName=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", remoteIcon=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", dot=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", action=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", onClick=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", onDisplay=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", eventTrackingExt=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC901690ZYx
    public final Function1<C908560Zkc, Unit> LJIILJJIL() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC908890Zl9
    public final C908840Zl4 LJLI() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC901690ZYx
    public final Map<String, String> LLIILII() {
        return this.LLJ;
    }

    @Override // X.InterfaceC901690ZYx
    public final String LLILLIZIL() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC901690ZYx
    public final Function1<C908560Zkc, Unit> LLJJIII() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC901690ZYx
    public final InterfaceC908930ZlD getAction() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC908890Zl9
    public final C908850Zl5 getTitle() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C908800Zl0(String str, String str2, C908840Zl4 c908840Zl4, C908850Zl5 c908850Zl5, C908700Zkq c908700Zkq, AwS223S0300000_14 awS223S0300000_14, AwS593S0100000_14 awS593S0100000_14, Map map) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = c908840Zl4;
        this.LLILZ = c908850Zl5;
        this.LLILZLL = c908700Zkq;
        this.LLIZ = awS223S0300000_14;
        this.LLIZLLLIL = awS593S0100000_14;
        this.LLJ = map;
    }
}
