package X;

import com.tiktok.forestx.RequestParamsX;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0pzM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1532740pzM {
    public boolean LIZ;
    public final boolean LIZIZ;
    public final long LIZJ;
    public final Class<?> LIZLLL;
    public final Map<String, Object> LJ;
    public boolean LJFF;
    public final boolean LJI;
    public boolean LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;
    public final boolean LJIIJJI;
    public String LJIIL;
    public Map<String, String> LJIILIIL;
    public final boolean LJIILJJIL;
    public final boolean LJIILL;
    public final boolean LJIILLIIL;
    public final List<String> LJIIZILJ;
    public final EnumC1533980q1M LJIJ;
    public final InterfaceC1530960pwU LJIJI;
    public final String LJIJJ;
    public boolean LJIJJLI;
    public final boolean LJIL;

    public C1532740pzM(RequestParamsX requestParamsX) {
        this.LIZ = requestParamsX.allowRedirectInternally;
        this.LIZIZ = requestParamsX.cdnRegionRedirect;
        this.LIZJ = requestParamsX.cdnTimeout;
        this.LIZLLL = requestParamsX.consumeType;
        this.LJ = requestParamsX.customParams;
        this.LJFF = requestParamsX.disableCDNOnline;
        this.LJI = requestParamsX.disableGeckoUpdate;
        this.LJII = requestParamsX.enableCDNCache;
        this.LJIIIIZZ = requestParamsX.enableConsumeMemoryCache;
        this.LJIIIZ = requestParamsX.enableMemoryCache;
        this.LJIIJ = requestParamsX.enableNegotiation;
        this.LJIIJJI = requestParamsX.geckoUrlRedirect;
        this.LJIIL = requestParamsX.groupId;
        this.LJIILIIL = requestParamsX.httpRequestHeaders;
        this.LJIILJJIL = requestParamsX.ignoreExpiration;
        this.LJIILL = requestParamsX.onlyLocal;
        this.LJIILLIIL = requestParamsX.optimizeStreamForWeb;
        this.LJIIZILJ = requestParamsX.redirectRegions;
        this.LJIJ = requestParamsX.resourceScene;
        this.LJIJI = requestParamsX.resourceSupplier;
        this.LJIJJ = requestParamsX.sessionId;
        this.LJIJJLI = requestParamsX.waitGeckoUpdate;
        this.LJIL = requestParamsX.waitLowStorageUpdate;
    }
}
