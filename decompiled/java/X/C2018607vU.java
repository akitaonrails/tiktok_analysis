package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07vU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2018607vU implements InterfaceC0148002o, InterfaceC19321010iO {
    public final Integer LL;
    public final Function1<InterfaceC1871207Uo, Unit> LLILLJJLI;
    public final C1668880tWw LLILLL;
    public final Integer LLILZ;
    public final String LLILZIL;
    public final C1668880tWw LLILZLL;
    public final String LLIZ;
    public final Function2<Context, String, Unit> LLIZLLLIL;
    public String LLJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2018607vU)) {
            return false;
        }
        C2018607vU c2018607vU = (C2018607vU) obj;
        return Intrinsics.LJFF(this.LL, c2018607vU.LL) && Intrinsics.LJFF(this.LLILLJJLI, c2018607vU.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c2018607vU.LLILLL) && Intrinsics.LJFF(this.LLILZ, c2018607vU.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c2018607vU.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c2018607vU.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c2018607vU.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c2018607vU.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c2018607vU.LLJ);
    }

    public final int hashCode() {
        Integer num = this.LL;
        int iHashCode = (((num == null ? 0 : num.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31;
        C1668880tWw c1668880tWw = this.LLILLL;
        int iHashCode2 = (iHashCode + (c1668880tWw == null ? 0 : c1668880tWw.hashCode())) * 31;
        Integer num2 = this.LLILZ;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.LLILZIL;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        C1668880tWw c1668880tWw2 = this.LLILZLL;
        int iHashCode5 = (iHashCode4 + (c1668880tWw2 == null ? 0 : c1668880tWw2.hashCode())) * 31;
        String str2 = this.LLIZ;
        int iHashCode6 = (((iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.LLIZLLLIL.hashCode()) * 31;
        String str3 = this.LLJ;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CheckUpdateCellState(toastMsgId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", eventSink=");
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
        sbLIZ.append(", key=");
        sbLIZ.append(this.LLJ);
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
        return this.LLJ;
    }

    @Override // X.InterfaceC19321010iO
    public final void setKey(String str) {
        this.LLJ = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2018607vU(Integer num, Function1<? super InterfaceC1871207Uo, Unit> function1, C1668880tWw c1668880tWw, Integer num2, String str, C1668880tWw c1668880tWw2, String str2, Function2<? super Context, ? super String, Unit> function2, String str3) {
        this.LL = num;
        this.LLILLJJLI = function1;
        this.LLILLL = c1668880tWw;
        this.LLILZ = num2;
        this.LLILZIL = str;
        this.LLILZLL = c1668880tWw2;
        this.LLIZ = str2;
        this.LLIZLLLIL = function2;
        this.LLJ = str3;
    }
}
