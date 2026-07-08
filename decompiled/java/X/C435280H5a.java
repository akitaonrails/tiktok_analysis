package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS104S0400000_6;
import kotlin.jvm.internal.AwS110S1200000_27;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0H5a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C435280H5a implements InterfaceC1891350zJl {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final boolean LLIZ;
    public final Function1<C435280H5a, Unit> LLIZLLLIL;
    public final Function1<C435280H5a, Unit> LLJ;
    public final Function1<C435280H5a, Unit> LLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C435280H5a)) {
            return false;
        }
        C435280H5a c435280H5a = (C435280H5a) obj;
        return Intrinsics.LJFF(this.LL, c435280H5a.LL) && Intrinsics.LJFF(this.LLILLJJLI, c435280H5a.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c435280H5a.LLILLL) && Intrinsics.LJFF(this.LLILZ, c435280H5a.LLILZ) && this.LLILZIL == c435280H5a.LLILZIL && this.LLILZLL == c435280H5a.LLILZLL && this.LLIZ == c435280H5a.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c435280H5a.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c435280H5a.LLJ) && Intrinsics.LJFF(this.LLJI, c435280H5a.LLJI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL) * 31) + this.LLILZLL) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31;
        Function1<C435280H5a, Unit> function1 = this.LLIZLLLIL;
        int iHashCode2 = (iHashCode + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function1<C435280H5a, Unit> function12 = this.LLJ;
        int iHashCode3 = (iHashCode2 + (function12 == null ? 0 : function12.hashCode())) * 31;
        Function1<C435280H5a, Unit> function13 = this.LLJI;
        return iHashCode3 + (function13 != null ? function13.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoMarketItemData(iconUrl=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", desc=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", buttonDesc=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", mainColor=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", titleFont=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", needPressedMask=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", clickAction=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", showAction=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", longClickAction=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C435280H5a(String str, String str2, String str3, String str4, int i, int i2, boolean z, AwS104S0400000_6 awS104S0400000_6, AwS110S1200000_27 awS110S1200000_27, AwS585S0100000_6 awS585S0100000_6) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = i;
        this.LLILZLL = i2;
        this.LLIZ = z;
        this.LLIZLLLIL = awS104S0400000_6;
        this.LLJ = awS110S1200000_27;
        this.LLJI = awS585S0100000_6;
    }
}
