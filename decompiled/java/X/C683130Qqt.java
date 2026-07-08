package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qqt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C683130Qqt implements InterfaceC0148002o {
    public final InterfaceC2455009jg LL;
    public final C423870Gjh LLILLJJLI;
    public final C423870Gjh LLILLL;
    public final C423870Gjh LLILZ;
    public final String LLILZIL;
    public final InterfaceC683020Qqi LLILZLL;

    /* JADX WARN: Multi-variable type inference failed */
    public C683130Qqt() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C683130Qqt)) {
            return false;
        }
        C683130Qqt c683130Qqt = (C683130Qqt) obj;
        return Intrinsics.LJFF(this.LL, c683130Qqt.LL) && Intrinsics.LJFF(this.LLILLJJLI, c683130Qqt.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c683130Qqt.LLILLL) && Intrinsics.LJFF(this.LLILZ, c683130Qqt.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c683130Qqt.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c683130Qqt.LLILZLL);
    }

    public final int hashCode() {
        InterfaceC2455009jg interfaceC2455009jg = this.LL;
        int iHashCode = (interfaceC2455009jg == null ? 0 : interfaceC2455009jg.hashCode()) * 31;
        C423870Gjh c423870Gjh = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c423870Gjh == null ? 0 : c423870Gjh.hashCode())) * 31;
        C423870Gjh c423870Gjh2 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (c423870Gjh2 == null ? 0 : c423870Gjh2.hashCode())) * 31;
        C423870Gjh c423870Gjh3 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (c423870Gjh3 == null ? 0 : c423870Gjh3.hashCode())) * 31;
        String str = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        InterfaceC683020Qqi interfaceC683020Qqi = this.LLILZLL;
        return iHashCode5 + (interfaceC683020Qqi != null ? interfaceC683020Qqi.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchEntranceState(image=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", titleMeta=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", subtitleMeta=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", descriptionMeta=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", content=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", button=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C683130Qqt(C423870Gjh c423870Gjh, C423870Gjh c423870Gjh2, C423870Gjh c423870Gjh3, String str, int i) {
        this(null, (i & 2) != 0 ? null : c423870Gjh, (i & 4) != 0 ? null : c423870Gjh2, (i & 8) != 0 ? null : c423870Gjh3, (i & 16) != 0 ? null : str, null);
    }

    public static C683130Qqt LIZ(C683130Qqt c683130Qqt, InterfaceC2455009jg interfaceC2455009jg, C423870Gjh c423870Gjh, InterfaceC683020Qqi interfaceC683020Qqi, int i) {
        C423870Gjh c423870Gjh2;
        C423870Gjh c423870Gjh3;
        InterfaceC683020Qqi interfaceC683020Qqi2 = interfaceC683020Qqi;
        C423870Gjh c423870Gjh4 = c423870Gjh;
        InterfaceC2455009jg interfaceC2455009jg2 = interfaceC2455009jg;
        if ((i & 1) != 0) {
            interfaceC2455009jg2 = c683130Qqt.LL;
        }
        String str = null;
        if ((i & 2) != 0) {
            c423870Gjh2 = c683130Qqt.LLILLJJLI;
        } else {
            c423870Gjh2 = null;
        }
        if ((i & 4) != 0) {
            c423870Gjh3 = c683130Qqt.LLILLL;
        } else {
            c423870Gjh3 = null;
        }
        if ((i & 8) != 0) {
            c423870Gjh4 = c683130Qqt.LLILZ;
        }
        if ((i & 16) != 0) {
            str = c683130Qqt.LLILZIL;
        }
        if ((i & 32) != 0) {
            interfaceC683020Qqi2 = c683130Qqt.LLILZLL;
        }
        c683130Qqt.getClass();
        return new C683130Qqt(interfaceC2455009jg2, c423870Gjh2, c423870Gjh3, c423870Gjh4, str, interfaceC683020Qqi2);
    }

    public C683130Qqt(InterfaceC2455009jg interfaceC2455009jg, C423870Gjh c423870Gjh, C423870Gjh c423870Gjh2, C423870Gjh c423870Gjh3, String str, InterfaceC683020Qqi interfaceC683020Qqi) {
        this.LL = interfaceC2455009jg;
        this.LLILLJJLI = c423870Gjh;
        this.LLILLL = c423870Gjh2;
        this.LLILZ = c423870Gjh3;
        this.LLILZIL = str;
        this.LLILZLL = interfaceC683020Qqi;
    }
}
