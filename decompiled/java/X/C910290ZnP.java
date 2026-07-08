package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZnP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C910290ZnP extends C910260ZnM {
    public final String LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;
    public final boolean LLJI;
    public final C1622006Ws<C01GW<List<C18VI>>> LLJIJIL;
    public final C909930Zmp LLJILJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C910290ZnP)) {
            return false;
        }
        C910290ZnP c910290ZnP = (C910290ZnP) obj;
        return Intrinsics.LJFF(this.LLILZLL, c910290ZnP.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c910290ZnP.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c910290ZnP.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c910290ZnP.LLJ) && this.LLJI == c910290ZnP.LLJI && Intrinsics.LJFF(this.LLJIJIL, c910290ZnP.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c910290ZnP.LLJILJIL);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LLILZLL.hashCode() * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ.hashCode()) * 31) + C786410Ut5.Z2(this.LLJI)) * 31;
        this.LLJIJIL.getClass();
        int i = iHashCode * 31;
        C909930Zmp c909930Zmp = this.LLJILJIL;
        return i + (c909930Zmp != null ? c909930Zmp.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIQuotaItem(uuid=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", content=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", btnText=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", btnVisible=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(", actions=");
        sbLIZ.append(this.LLJIJIL);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LLJILJIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C910260ZnM
    public final C1622006Ws<C01GW<List<C18VI>>> LIZIZ() {
        return this.LLJIJIL;
    }

    @Override // X.C910260ZnM
    public final C909930Zmp LIZLLL() {
        return this.LLJILJIL;
    }

    @Override // X.C910260ZnM
    public final String LJI() {
        return this.LLILZLL;
    }

    @Override // X.C910260ZnM, X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C910290ZnP) || !areItemTheSame(interfaceC1891350zJl)) {
            return false;
        }
        C910290ZnP c910290ZnP = (C910290ZnP) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(this.LLIZ, c910290ZnP.LLIZ) || !Intrinsics.LJFF(this.LLIZLLLIL, c910290ZnP.LLIZLLLIL) || !Intrinsics.LJFF(this.LLJ, c910290ZnP.LLJ) || this.LLJI != c910290ZnP.LLJI) {
            return false;
        }
        return true;
    }

    public C910290ZnP(String str, String str2, String str3, String str4, boolean z, C1622006Ws<C01GW<List<C18VI>>> c1622006Ws, C909930Zmp c909930Zmp) {
        super(str, C18VH.START, null, 12);
        this.LLILZLL = str;
        this.LLIZ = str2;
        this.LLIZLLLIL = str3;
        this.LLJ = str4;
        this.LLJI = z;
        this.LLJIJIL = c1622006Ws;
        this.LLJILJIL = c909930Zmp;
    }
}
