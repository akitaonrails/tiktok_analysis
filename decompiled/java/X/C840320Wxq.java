package X;

import java.net.URL;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Wxq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C840320Wxq extends AbstractC840310Wxp {
    public final String LIZ;
    public final URL LIZIZ;
    public final URL LIZJ;
    public final Map<String, String> LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final C840660WyO LJIIIIZZ;
    public final C0WSC LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C840320Wxq)) {
            return false;
        }
        C840320Wxq c840320Wxq = (C840320Wxq) obj;
        return Intrinsics.LJFF(this.LIZ, c840320Wxq.LIZ) && Intrinsics.LJFF(this.LIZIZ, c840320Wxq.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c840320Wxq.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c840320Wxq.LIZLLL) && Intrinsics.LJFF(this.LJ, c840320Wxq.LJ) && Intrinsics.LJFF(this.LJFF, c840320Wxq.LJFF) && Intrinsics.LJFF(this.LJI, c840320Wxq.LJI) && Intrinsics.LJFF(this.LJII, c840320Wxq.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c840320Wxq.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c840320Wxq.LJIIIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        URL url = this.LIZIZ;
        int iHashCode2 = (iHashCode + (url == null ? 0 : url.hashCode())) * 31;
        URL url2 = this.LIZJ;
        int iHashCode3 = (((iHashCode2 + (url2 == null ? 0 : url2.hashCode())) * 31) + this.LIZLLL.hashCode()) * 31;
        String str = this.LJ;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJFF;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJI;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJII;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        C840660WyO c840660WyO = this.LJIIIIZZ;
        int iHashCode8 = (iHashCode7 + (c840660WyO == null ? 0 : c840660WyO.hashCode())) * 31;
        C0WSC c0wsc = this.LJIIIZ;
        return iHashCode8 + (c0wsc != null ? c0wsc.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Request(url=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", urlObj=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", sanitizedUrl=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", requestHeaders=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", rawDomainBeforeTnc=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", rawDomainAfterTnc=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", pnsEventId=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", traceTaskId=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", legacyEvent=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", performanceNode=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C840320Wxq(String str, URL url, URL url2, Map<String, String> map, String str2, String str3, String str4, String str5, C840660WyO c840660WyO, C0WSC c0wsc) {
        this.LIZ = str;
        this.LIZIZ = url;
        this.LIZJ = url2;
        this.LIZLLL = map;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = str4;
        this.LJII = str5;
        this.LJIIIIZZ = c840660WyO;
        this.LJIIIZ = c0wsc;
    }
}
