package X;

import com.ss.android.ugc.aweme.poi.anchor.model.PoiAnchorExtra;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiCommonMobParams;
import java.util.Map;

/* JADX INFO: renamed from: X.0gxS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1185600gxS {
    public final String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public C1188440h22 LJ;
    public final C1185410gx9 LJFF;
    public final C1185490gxH LJI;
    public final PoiAnchorExtra LJII;
    public final Map<String, String> LJIIIIZZ;
    public PoiListApi.PoiDetailResponse LJIIIZ;
    public final long LJIIJ;
    public C1189480h3i LJIIJJI;
    public PoiCommonMobParams LJIIL;
    public final C1185450gxD LJIILIIL;

    public C1185600gxS() {
        this(null, null, false, false, null, null, null, null, null, 0L, null, null, 32767);
    }

    public final boolean LIZ() {
        return this.LIZJ || this.LIZLLL;
    }

    public C1185600gxS(String str, String str2, boolean z, boolean z2, C1188440h22 c1188440h22, C1185410gx9 c1185410gx9, C1185490gxH c1185490gxH, PoiAnchorExtra poiAnchorExtra, Map map, long j, PoiCommonMobParams poiCommonMobParams, C1185450gxD c1185450gxD, int i) {
        String str3 = str2;
        boolean z3 = z;
        C1188440h22 c1188440h222 = c1188440h22;
        C1185490gxH c1185490gxH2 = c1185490gxH;
        C1185410gx9 c1185410gx92 = c1185410gx9;
        Map map2 = map;
        PoiAnchorExtra poiAnchorExtra2 = poiAnchorExtra;
        long j2 = j;
        PoiCommonMobParams poiCommonMobParams2 = poiCommonMobParams;
        C1185450gxD c1185450gxD2 = c1185450gxD;
        String str4 = (i & 1) != 0 ? null : str;
        str3 = (i & 2) != 0 ? null : str3;
        z3 = (i & 4) != 0 ? false : z3;
        boolean z4 = (i & 8) == 0 ? z2 : false;
        c1188440h222 = (i & 16) != 0 ? null : c1188440h222;
        c1185410gx92 = (i & 32) != 0 ? null : c1185410gx92;
        c1185490gxH2 = (i & 64) != 0 ? null : c1185490gxH2;
        poiAnchorExtra2 = (i & 128) != 0 ? null : poiAnchorExtra2;
        map2 = (i & 256) != 0 ? null : map2;
        j2 = (i & 1024) != 0 ? 0L : j2;
        poiCommonMobParams2 = (i & 8192) != 0 ? null : poiCommonMobParams2;
        c1185450gxD2 = (i & 16384) != 0 ? null : c1185450gxD2;
        this.LIZ = str4;
        this.LIZIZ = str3;
        this.LIZJ = z3;
        this.LIZLLL = z4;
        this.LJ = c1188440h222;
        this.LJFF = c1185410gx92;
        this.LJI = c1185490gxH2;
        this.LJII = poiAnchorExtra2;
        this.LJIIIIZZ = map2;
        this.LJIIIZ = null;
        this.LJIIJ = j2;
        this.LJIIJJI = null;
        this.LJIIL = poiCommonMobParams2;
        this.LJIILIIL = c1185450gxD2;
    }
}
