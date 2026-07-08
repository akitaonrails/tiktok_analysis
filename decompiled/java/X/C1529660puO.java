package X;

import com.bytedance.forest.model.RequestParams;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0puO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1529660puO {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final EnumC1533980q1M LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final Map<String, String> LJIIIIZZ;

    public C1529660puO() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1529660puO)) {
            return false;
        }
        C1529660puO c1529660puO = (C1529660puO) obj;
        return Intrinsics.LJFF(this.LIZ, c1529660puO.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1529660puO.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1529660puO.LIZJ) && this.LIZLLL == c1529660puO.LIZLLL && this.LJ == c1529660puO.LJ && this.LJFF == c1529660puO.LJFF && this.LJI == c1529660puO.LJI && this.LJII == c1529660puO.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c1529660puO.LJIIIIZZ);
    }

    public final int hashCode() {
        return (((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + C786410Ut5.Z2(this.LJII)) * 31) + this.LJIIIIZZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedForestImageSource(channel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", bundle=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", url=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", enableMemoryCache=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", enableCDNCache=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", enableRequestReuse=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", supportDirectory=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", customParams=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final RequestParams LIZ() {
        RequestParams requestParams = new RequestParams(null, 1, 0 == true ? 1 : 0);
        requestParams.channel = this.LIZ;
        requestParams.bundle = this.LIZIZ;
        requestParams.resourceScene = this.LIZLLL;
        requestParams.enableMemoryCache = Boolean.valueOf(this.LJ);
        requestParams.enableCDNCache = Boolean.valueOf(this.LJFF);
        requestParams.enableRequestReuse = this.LJI;
        requestParams.supportDirectory = this.LJII;
        requestParams.disableBuiltin = true;
        requestParams.waitGeckoUpdate = true;
        requestParams.customParams.putAll(this.LJIIIIZZ);
        return requestParams;
    }

    public C1529660puO(String str) {
        EnumC1533980q1M enumC1533980q1M = EnumC1533980q1M.OTHER;
        Map<String, String> mapLJ = C2097608Jq.LJ();
        this.LIZ = "tiktok_feed_res_1";
        this.LIZIZ = str;
        this.LIZJ = "";
        this.LIZLLL = enumC1533980q1M;
        this.LJ = true;
        this.LJFF = true;
        this.LJI = true;
        this.LJII = true;
        this.LJIIIIZZ = mapLJ;
    }
}
