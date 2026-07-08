package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uwe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1723260uwe implements InterfaceC111300bX {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final boolean LLIZLLLIL;
    public final long LLJ;
    public final Map<String, String> LLJI;
    public final String LLJIJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1723260uwe)) {
            return false;
        }
        C1723260uwe c1723260uwe = (C1723260uwe) obj;
        return Intrinsics.LJFF(this.LL, c1723260uwe.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1723260uwe.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1723260uwe.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1723260uwe.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1723260uwe.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1723260uwe.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1723260uwe.LLIZ) && this.LLIZLLLIL == c1723260uwe.LLIZLLLIL && this.LLJ == c1723260uwe.LLJ && Intrinsics.LJFF(this.LLJI, c1723260uwe.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1723260uwe.LLJIJIL);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31) + C786410Ut5.Y2(this.LLJ)) * 31;
        Map<String, String> map = this.LLJI;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.LLJIJIL;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "PipoAuthData(schema=" + this.LL + ", host=" + this.LLILLJJLI + ", path=" + this.LLILLL + ", merchantId=" + this.LLILZ + ", authType=" + this.LLILZIL + ", loginScene=" + this.LLILZLL + ", country=" + this.LLIZ + ", useNativeRegion=" + this.LLIZLLLIL + ", enterDuration=" + this.LLJ + ", extra=" + this.LLJI + ", sourceBtmToken=" + this.LLJIJIL + ')';
    }

    public C1723260uwe(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, long j, Map<String, String> map, String str8) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str5;
        this.LLILZLL = str6;
        this.LLIZ = str7;
        this.LLIZLLLIL = z;
        this.LLJ = j;
        this.LLJI = map;
        this.LLJIJIL = str8;
    }
}
