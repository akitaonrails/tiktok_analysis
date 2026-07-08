package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS647S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07wX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2025107wX implements InterfaceC0148002o, InterfaceC19321010iO {
    public final Function1<InterfaceC1872207Uy, Unit> LL;
    public final C1668880tWw LLILLJJLI;
    public final Integer LLILLL;
    public final C1668880tWw LLILZIL;
    public final Function2<Context, String, Unit> LLIZ;
    public final String LLILZ = null;
    public final String LLILZLL = null;
    public String LLIZLLLIL = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2025107wX)) {
            return false;
        }
        C2025107wX c2025107wX = (C2025107wX) obj;
        return Intrinsics.LJFF(this.LL, c2025107wX.LL) && Intrinsics.LJFF(this.LLILLJJLI, c2025107wX.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c2025107wX.LLILLL) && Intrinsics.LJFF(this.LLILZ, c2025107wX.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c2025107wX.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c2025107wX.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c2025107wX.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c2025107wX.LLIZLLLIL);
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
        sbLIZ.append("OfflineVideosCellState(eventSink=");
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

    public C2025107wX(C1668880tWw c1668880tWw, C1668880tWw c1668880tWw2, Integer num, C2174571A8p c2174571A8p, AwS647S0100000_33 awS647S0100000_33) {
        this.LL = c2174571A8p;
        this.LLILLJJLI = c1668880tWw;
        this.LLILLL = num;
        this.LLILZIL = c1668880tWw2;
        this.LLIZ = awS647S0100000_33;
    }
}
