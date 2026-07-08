package X;

import com.bytedance.forest.model.RequestParams;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0q0f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1533550q0f {
    public boolean LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public long LIZLLL;
    public Class<?> LJ;
    public Map<String, Object> LJFF;
    public final InterfaceC1530490pvj LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public final boolean LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public final boolean LJIILJJIL;
    public Boolean LJIILL;
    public boolean LJIILLIIL;
    public Boolean LJIIZILJ;
    public Boolean LJIJ;
    public boolean LJIJI;
    public boolean LJIJJ;
    public long LJIJJLI;
    public EnumC1534630q2P LJIL;
    public boolean LJJ;
    public boolean LJJI;
    public String LJJIFFI;
    public Map<String, String> LJJII;
    public boolean LJJIII;
    public boolean LJJIIJ;
    public Set<String> LJJIIJZLJL;
    public boolean LJJIIZ;
    public final InterfaceC1533160q02 LJJIIZI;
    public int LJJIJ;
    public boolean LJJIJIIJI;
    public long LJJIJIIJIL;
    public Boolean LJJIJIL;
    public boolean LJJIJL;
    public boolean LJJIJLIJ;
    public boolean LJJIL;
    public List<String> LJJIZ;
    public EnumC1533980q1M LJJJ;
    public String LJJJI;
    public String LJJJIL;
    public boolean LJJJJ;
    public Object LJJJJI;

    public C1533550q0f(RequestParams requestParams, C1533560q0g c1533560q0g) {
        this.LIZ = requestParams.allowIOOnMainThread;
        this.LIZIZ = requestParams.allowRedirectInternally;
        this.LIZJ = requestParams.cdnRegionRedirect;
        this.LIZLLL = requestParams.cdnTimeout;
        this.LJ = requestParams.consumeType;
        this.LJFF = requestParams.customParams;
        this.LJI = requestParams.dataSupplier;
        this.LJII = requestParams.disableBuiltin;
        this.LJIIIIZZ = requestParams.disableCDNOnline;
        this.LJIIIZ = requestParams.disableCdn;
        this.LJIIJ = requestParams.disableGeckoRemoteSettings;
        this.LJIIJJI = requestParams.disableGeckoStatics;
        this.LJIIL = requestParams.disableOffline;
        this.LJIILIIL = requestParams.disablePrefixParser;
        this.LJIILJJIL = requestParams.disableReport;
        Boolean bool = requestParams.enableCDNCache;
        this.LJIILL = bool;
        if (bool == null) {
            this.LJIILL = Boolean.valueOf(c1533560q0g.LJIIIZ);
        }
        this.LJIILLIIL = requestParams.enableConsumeMemoryCache;
        Boolean bool2 = requestParams.enableMemoryCache;
        this.LJIIZILJ = bool2;
        if (bool2 == null) {
            this.LJIIZILJ = Boolean.valueOf(c1533560q0g.LJII);
        }
        Boolean bool3 = requestParams.enableNegotiation;
        this.LJIJ = bool3;
        if (bool3 == null) {
            this.LJIJ = Boolean.valueOf(c1533560q0g.LJI);
        }
        this.LJIJI = requestParams.enableProcessChain;
        this.LJIJJ = requestParams.enableRequestReuse;
        this.LJIJJLI = requestParams.fetchPreloadedCacheTimeout;
        this.LJIL = requestParams.forceMetaType;
        this.LJJ = requestParams.forceProcessChain;
        this.LJJI = requestParams.geckoUrlRedirect;
        this.LJJIFFI = requestParams.groupId;
        this.LJJII = requestParams.httpRequestHeaders;
        this.LJJIII = requestParams.ignoreAllQueryParams;
        this.LJJIIJ = requestParams.ignoreExpiration;
        this.LJJIIJZLJL = requestParams.ignoredQueryParams;
        this.LJJIIZ = requestParams.isPreload;
        this.LJJIIZI = requestParams.lightSupplier;
        this.LJJIJ = requestParams.loadRetryTimes;
        this.LJJIJIIJI = requestParams.loadToMemory;
        this.LJJIJIIJIL = requestParams.maxExpirationTime;
        Boolean bool4 = requestParams.needLocalFile;
        this.LJJIJIL = bool4;
        if (bool4 == null) {
            this.LJJIJIL = Boolean.valueOf(c1533560q0g.LJIIIIZZ);
        }
        this.LJJIJL = requestParams.onlyLocal;
        this.LJJIJLIJ = requestParams.onlyOnline;
        this.LJJIL = requestParams.parallelLoading;
        this.LJJIZ = requestParams.redirectRegions;
        this.LJJJ = requestParams.resourceScene;
        this.LJJJI = requestParams.sessionId;
        this.LJJJIL = requestParams.source;
        this.LJJJJ = requestParams.supportDirectory;
        this.LJJJJI = requestParams.webResourceRequest;
    }
}
