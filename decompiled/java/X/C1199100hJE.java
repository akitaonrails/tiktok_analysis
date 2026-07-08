package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.poi.PoiMobParam;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0hJE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1199100hJE {
    public final C1197650hGt LIZ;
    public final boolean LIZIZ;
    public final C1197660hGu LIZJ;
    public final InterfaceC736910SvR<InterfaceC1197610hGp> LIZLLL;
    public final List<InterfaceC1891350zJl> LJ;
    public final long LJFF;
    public final C1199110hJF LJI;
    public final ConcurrentHashMap<String, String> LJII;
    public final C1197720hH0 LJIIIIZZ;
    public final C1197690hGx LJIIIZ;
    public final double LJIIJ;
    public final double LJIIJJI;
    public final boolean LJIIL;
    public final boolean LJIILIIL;
    public final C1197700hGy LJIILJJIL;
    public final PoiMobParam LJIILL;
    public final PoiSearchApi.PoiSearchResultWrapper LJIILLIIL;
    public final PoiSearchApi.PoiSearchResultWrapper LJIIZILJ;

    public static C1199100hJE LIZ(C1199100hJE c1199100hJE, PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper, PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper2, int i) {
        C1197650hGt c1197650hGt;
        boolean z;
        C1197660hGu c1197660hGu;
        InterfaceC736910SvR<InterfaceC1197610hGp> interfaceC736910SvR;
        List<InterfaceC1891350zJl> list;
        long j;
        C1199110hJF c1199110hJF;
        ConcurrentHashMap<String, String> concurrentHashMap;
        C1197720hH0 c1197720hH0;
        C1197690hGx c1197690hGx;
        double d;
        double d2;
        boolean z2;
        boolean z3;
        C1197700hGy c1197700hGy;
        PoiMobParam poiMobParam;
        PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper3 = poiSearchResultWrapper2;
        PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper4 = poiSearchResultWrapper;
        if ((i & 1) != 0) {
            c1197650hGt = c1199100hJE.LIZ;
        } else {
            c1197650hGt = null;
        }
        if ((i & 2) != 0) {
            z = c1199100hJE.LIZIZ;
        } else {
            z = false;
        }
        if ((i & 4) != 0) {
            c1197660hGu = c1199100hJE.LIZJ;
        } else {
            c1197660hGu = null;
        }
        if ((i & 8) != 0) {
            interfaceC736910SvR = c1199100hJE.LIZLLL;
        } else {
            interfaceC736910SvR = null;
        }
        if ((i & 16) != 0) {
            list = c1199100hJE.LJ;
        } else {
            list = null;
        }
        if ((i & 32) != 0) {
            j = c1199100hJE.LJFF;
        } else {
            j = 0;
        }
        if ((i & 64) != 0) {
            c1199110hJF = c1199100hJE.LJI;
        } else {
            c1199110hJF = null;
        }
        if ((i & 128) != 0) {
            concurrentHashMap = c1199100hJE.LJII;
        } else {
            concurrentHashMap = null;
        }
        if ((i & 256) != 0) {
            c1197720hH0 = c1199100hJE.LJIIIIZZ;
        } else {
            c1197720hH0 = null;
        }
        if ((i & 512) != 0) {
            c1197690hGx = c1199100hJE.LJIIIZ;
        } else {
            c1197690hGx = null;
        }
        if ((i & 1024) != 0) {
            d = c1199100hJE.LJIIJ;
        } else {
            d = 0.0d;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            d2 = c1199100hJE.LJIIJJI;
        } else {
            d2 = 0.0d;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z2 = c1199100hJE.LJIIL;
        } else {
            z2 = false;
        }
        if ((i & 8192) != 0) {
            z3 = c1199100hJE.LJIILIIL;
        } else {
            z3 = false;
        }
        if ((i & 16384) != 0) {
            c1197700hGy = c1199100hJE.LJIILJJIL;
        } else {
            c1197700hGy = null;
        }
        if ((32768 & i) != 0) {
            poiMobParam = c1199100hJE.LJIILL;
        } else {
            poiMobParam = null;
        }
        if ((65536 & i) != 0) {
            poiSearchResultWrapper4 = c1199100hJE.LJIILLIIL;
        }
        if ((i & 131072) != 0) {
            poiSearchResultWrapper3 = c1199100hJE.LJIIZILJ;
        }
        PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper5 = poiSearchResultWrapper4;
        PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper6 = poiSearchResultWrapper3;
        return new C1199100hJE(c1197650hGt, z, c1197660hGu, interfaceC736910SvR, list, j, c1199110hJF, concurrentHashMap, c1197720hH0, c1197690hGx, d, d2, z2, z3, c1197700hGy, poiMobParam, poiSearchResultWrapper5, poiSearchResultWrapper6);
    }

    public C1199100hJE(C1197650hGt c1197650hGt, boolean z, C1197660hGu c1197660hGu, InterfaceC736910SvR<InterfaceC1197610hGp> interfaceC736910SvR, List<InterfaceC1891350zJl> list, long j, C1199110hJF c1199110hJF, ConcurrentHashMap<String, String> concurrentHashMap, C1197720hH0 c1197720hH0, C1197690hGx c1197690hGx, double d, double d2, boolean z2, boolean z3, C1197700hGy c1197700hGy, PoiMobParam poiMobParam, PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper, PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper2) {
        this.LIZ = c1197650hGt;
        this.LIZIZ = z;
        this.LIZJ = c1197660hGu;
        this.LIZLLL = interfaceC736910SvR;
        this.LJ = list;
        this.LJFF = j;
        this.LJI = c1199110hJF;
        this.LJII = concurrentHashMap;
        this.LJIIIIZZ = c1197720hH0;
        this.LJIIIZ = c1197690hGx;
        this.LJIIJ = d;
        this.LJIIJJI = d2;
        this.LJIIL = z2;
        this.LJIILIIL = z3;
        this.LJIILJJIL = c1197700hGy;
        this.LJIILL = poiMobParam;
        this.LJIILLIIL = poiSearchResultWrapper;
        this.LJIIZILJ = poiSearchResultWrapper2;
    }
}
