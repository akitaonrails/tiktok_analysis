package X;

import android.webkit.WebView;
import com.bytedance.hybrid.spark.security.web_js.setting.JSInjectConfig;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0WMe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C821940WMe {
    public final C0WMZ LIZ;
    public final Map<String, Object> LIZIZ;
    public final String LIZJ;
    public final WebView LIZLLL;
    public final String LJ;
    public final JSInjectConfig LJFF;
    public final Integer LJI;
    public final boolean LJII;
    public final String LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C821940WMe)) {
            return false;
        }
        C821940WMe c821940WMe = (C821940WMe) obj;
        return this.LIZ == c821940WMe.LIZ && Intrinsics.LJFF(this.LIZIZ, c821940WMe.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c821940WMe.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c821940WMe.LIZLLL) && Intrinsics.LJFF(this.LJ, c821940WMe.LJ) && Intrinsics.LJFF(this.LJFF, c821940WMe.LJFF) && Intrinsics.LJFF(this.LJI, c821940WMe.LJI) && this.LJII == c821940WMe.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c821940WMe.LJIIIIZZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [int] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v28 */
    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        WebView webView = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (webView == null ? 0 : webView.hashCode())) * 31;
        String str2 = this.LJ;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        JSInjectConfig jSInjectConfig = this.LJFF;
        int iHashCode5 = (iHashCode4 + (jSInjectConfig == null ? 0 : jSInjectConfig.hashCode())) * 31;
        Integer num = this.LJI;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z = this.LJII;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = (iHashCode6 + r0) * 31;
        String str3 = this.LJIIIIZZ;
        return i + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("triggerType: ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", dataflowId: ");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", isIframeScene: ");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", url: ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", mainframeUrl: ");
        sbLIZ.append(this.LJIIIIZZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C821940WMe(C0WMZ c0wmz, Map<String, ? extends Object> map, String str, WebView webView, String str2, JSInjectConfig jSInjectConfig, Integer num, boolean z, String str3) {
        this.LIZ = c0wmz;
        this.LIZIZ = map;
        this.LIZJ = str;
        this.LIZLLL = webView;
        this.LJ = str2;
        this.LJFF = jSInjectConfig;
        this.LJI = num;
        this.LJII = z;
        this.LJIIIIZZ = str3;
    }
}
