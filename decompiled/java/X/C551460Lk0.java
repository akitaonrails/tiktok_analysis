package X;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS32S0600000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Lk0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C551460Lk0 implements InterfaceC901690ZYx {
    public final String LL;
    public final String LLILLJJLI = "ai_theater";
    public final List<String> LLILLL;
    public final InterfaceC908930ZlD LLILZ;
    public final Function1<C908560Zkc, Unit> LLILZIL;
    public final Function1<C908560Zkc, Unit> LLILZLL;
    public final Map<String, String> LLIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C551460Lk0)) {
            return false;
        }
        C551460Lk0 c551460Lk0 = (C551460Lk0) obj;
        return Intrinsics.LJFF(this.LL, c551460Lk0.LL) && Intrinsics.LJFF(this.LLILLJJLI, c551460Lk0.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c551460Lk0.LLILLL) && Intrinsics.LJFF(this.LLILZ, c551460Lk0.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c551460Lk0.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c551460Lk0.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c551460Lk0.LLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31;
        InterfaceC908930ZlD interfaceC908930ZlD = this.LLILZ;
        int iHashCode2 = (iHashCode + (interfaceC908930ZlD == null ? 0 : interfaceC908930ZlD.hashCode())) * 31;
        Function1<C908560Zkc, Unit> function1 = this.LLILZIL;
        int iHashCode3 = (iHashCode2 + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function1<C908560Zkc, Unit> function12 = this.LLILZLL;
        int iHashCode4 = (iHashCode3 + (function12 == null ? 0 : function12.hashCode())) * 31;
        Map<String, String> map = this.LLIZ;
        return iHashCode4 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AITheaterActionBarButtonItem(buttonId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", buttonName=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", avatarList=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", action=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", onDisplay=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", onClick=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", eventTrackingExt=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC901690ZYx
    public final Function1<C908560Zkc, Unit> LJIILJJIL() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC901690ZYx
    public final Map<String, String> LLIILII() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC901690ZYx
    public final String LLILLIZIL() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC901690ZYx
    public final Function1<C908560Zkc, Unit> LLJJIII() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC901690ZYx
    public final InterfaceC908930ZlD getAction() {
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

    public C551460Lk0(String str, List list, C550910Lj7 c550910Lj7, AFwS239S0000000_8 aFwS239S0000000_8, AwS32S0600000_14 awS32S0600000_14, Map map) {
        this.LL = str;
        this.LLILLL = list;
        this.LLILZ = c550910Lj7;
        this.LLILZIL = aFwS239S0000000_8;
        this.LLILZLL = awS32S0600000_14;
        this.LLIZ = map;
    }
}
