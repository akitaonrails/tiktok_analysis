package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07wW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2025007wW implements InterfaceC0148002o, InterfaceC19321010iO {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final Function1<InterfaceC1870007Uc, Unit> LLILZ;
    public final C1668880tWw LLILZIL;
    public final Integer LLILZLL;
    public final C1668880tWw LLIZ;
    public final String LLIZLLLIL;
    public final Function2<Context, String, Unit> LLJ;
    public String LLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2025007wW)) {
            return false;
        }
        C2025007wW c2025007wW = (C2025007wW) obj;
        return Intrinsics.LJFF(this.LL, c2025007wW.LL) && Intrinsics.LJFF(this.LLILLJJLI, c2025007wW.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c2025007wW.LLILLL) && Intrinsics.LJFF(this.LLILZ, c2025007wW.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c2025007wW.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c2025007wW.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c2025007wW.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c2025007wW.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c2025007wW.LLJ) && Intrinsics.LJFF(this.LLJI, c2025007wW.LLJI);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILLL;
        int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.LLILZ.hashCode()) * 31;
        C1668880tWw c1668880tWw = this.LLILZIL;
        int iHashCode4 = (iHashCode3 + (c1668880tWw == null ? 0 : c1668880tWw.hashCode())) * 31;
        Integer num = this.LLILZLL;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        C1668880tWw c1668880tWw2 = this.LLIZ;
        int iHashCode6 = (iHashCode5 + (c1668880tWw2 == null ? 0 : c1668880tWw2.hashCode())) * 31;
        String str4 = this.LLIZLLLIL;
        int iHashCode7 = (((iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.LLJ.hashCode()) * 31;
        String str5 = this.LLJI;
        return iHashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OrdersCellState(iconUrl=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", iconDarkUrl=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", label=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", eventSink=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", iconId=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", titleId=");
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
        return this.LLILZLL;
    }

    @Override // X.InterfaceC19321010iO
    public final String LIZIZ() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC19321010iO
    public final C1668880tWw LIZLLL() {
        return this.LLILZIL;
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

    /* JADX WARN: Multi-variable type inference failed */
    public C2025007wW(String str, String str2, String str3, Function1<? super InterfaceC1870007Uc, Unit> function1, C1668880tWw c1668880tWw, Integer num, C1668880tWw c1668880tWw2, String str4, Function2<? super Context, ? super String, Unit> function2, String str5) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = function1;
        this.LLILZIL = c1668880tWw;
        this.LLILZLL = num;
        this.LLIZ = c1668880tWw2;
        this.LLIZLLLIL = str4;
        this.LLJ = function2;
        this.LLJI = str5;
    }
}
