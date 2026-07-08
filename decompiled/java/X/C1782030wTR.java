package X;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import webcast.api.sub.ServiceInfo;

/* JADX INFO: renamed from: X.0wTR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1782030wTR extends AbstractC1781930wTH implements InterfaceC1785270wYf {
    public final long LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final ServiceInfo LLILZIL;
    public final long LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;
    public final long LLJI;
    public final String LLJIJIL;
    public final EnumC1785280wYg LLJILJIL = EnumC1785280wYg.THIRD_PARTY_SERVICE;
    public final int LLJILJILJ = 2131855280;

    @Override // X.InterfaceC1785270wYf
    public final String LJ() {
        return C497740JfY.LJIJJ(2131855884, LJIIIIZZ());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1782030wTR)) {
            return false;
        }
        C1782030wTR c1782030wTR = (C1782030wTR) obj;
        return this.LL == c1782030wTR.LL && Intrinsics.LJFF(this.LLILLJJLI, c1782030wTR.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1782030wTR.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1782030wTR.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1782030wTR.LLILZIL) && this.LLILZLL == c1782030wTR.LLILZLL && Intrinsics.LJFF(this.LLIZ, c1782030wTR.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1782030wTR.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1782030wTR.LLJ) && this.LLJI == c1782030wTR.LLJI && Intrinsics.LJFF(this.LLJIJIL, c1782030wTR.LLJIJIL);
    }

    public final int hashCode() {
        int iY2 = ((((((C786410Ut5.Y2(this.LL) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31;
        ServiceInfo serviceInfo = this.LLILZIL;
        return ((((((((((((iY2 + (serviceInfo == null ? 0 : serviceInfo.hashCode())) * 31) + C786410Ut5.Y2(this.LLILZLL)) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ.hashCode()) * 31) + C786410Ut5.Y2(this.LLJI)) * 31) + this.LLJIJIL.hashCode();
    }

    public final String toString() {
        return "ThirdPartyLink(skuID=" + this.LL + ", title=" + this.LLILLJJLI + ", subtitle=" + this.LLILLL + ", schema=" + this.LLILZ + ", serviceInfo=" + this.LLILZIL + ", linkId=" + this.LLILZLL + ", targetUrl=" + this.LLIZ + ", platformName=" + this.LLIZLLLIL + ", iconUrl=" + this.LLJ + ", expiresAt=" + this.LLJI + ", platformKey=" + this.LLJIJIL + ')';
    }

    @Override // X.InterfaceC1785270wYf
    public final Integer LIZLLL() {
        return Integer.valueOf(this.LLJILJILJ);
    }

    public final String LJIIIIZZ() {
        String str = this.LLIZLLLIL;
        return (!(a0.LJJJIL(str) ^ true) || str == null) ? this.LLILLJJLI : str;
    }

    @Override // X.InterfaceC1785270wYf
    public final long LIZ() {
        return this.LL;
    }

    @Override // X.InterfaceC1785270wYf
    public final EnumC1785280wYg getItemType() {
        return this.LLJILJIL;
    }

    public C1782030wTR(long j, String str, String str2, String str3, ServiceInfo serviceInfo, long j2, String str4, String str5, String str6, long j3, String str7) {
        this.LL = j;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = serviceInfo;
        this.LLILZLL = j2;
        this.LLIZ = str4;
        this.LLIZLLLIL = str5;
        this.LLJ = str6;
        this.LLJI = j3;
        this.LLJIJIL = str7;
    }
}
