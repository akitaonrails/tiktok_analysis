package X;

import Y.ARunnableS20S1200000_16;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS50S0100100_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dCY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1041200dCY implements InterfaceC1039910dAT {
    public C19866712oD LIZJ;
    public C19866712oD LIZLLL;
    public C1043270dFt LJ;
    public C1043270dFt LJFF;
    public InterfaceC1041500dD2 LJIIIIZZ;
    public String LJIIIZ;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(408));
    public final C1041220dCa LIZIZ = new C1041220dCa();
    public final C1043260dFs LJI = new C1043260dFs();
    public final C01GW LJII = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(409));

    public abstract void LJIIIIZZ(C1035880d3y c1035880d3y);

    public final C1041230dCb LJI() {
        return (C1041230dCb) this.LIZ.getValue();
    }

    public AbstractC1041200dCY() {
        if (C1553670qX7.LIZ != null) {
            List<Pattern> listLIZJ = C1553670qX7.LIZJ();
            C0VSJ c0vsj = new C0VSJ(C1553670qX7.LIZLLL().getPath(), C1553670qX7.LIZ());
            C2354709Kn.LJI(c0vsj);
            C19866712oD c19866712oD = new C19866712oD(c0vsj.getPath());
            C19866812oE c19866812oE = c19866712oD.LIZ;
            if (c19866812oE != null) {
                c19866812oE.LIZIZ = true;
            }
            c19866712oD.LIZIZ(listLIZJ);
            c19866712oD.LIZIZ = new InterfaceC1041260dCe() { // from class: X.0dCc
                @Override // X.InterfaceC1041260dCe
                public final WebResourceResponse LIZ(String str) {
                    return this.LIZ.LJI().LIZ(str);
                }
            };
            this.LIZJ = c19866712oD;
        }
    }

    @Override // X.InterfaceC1039910dAT
    public void onDestroy() {
        LJI().LIZJ();
        C1041220dCa c1041220dCa = this.LIZIZ;
        c1041220dCa.LIZIZ.writeLock().lock();
        try {
            c1041220dCa.LIZ.clear();
            c1041220dCa.LIZIZ.writeLock().unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1041220dCa.LIZIZ.writeLock().unlock();
            throw th;
        }
    }

    @Override // X.InterfaceC1039910dAT
    public final void LIZIZ(String str) {
        Object value = this.LJII.getValue();
        InterfaceC1041500dD2 interfaceC1041500dD2 = this.LJIIIIZZ;
        C1043270dFt c1043270dFt = this.LJ;
        C1043270dFt c1043270dFt2 = this.LJFF;
        C1043260dFs c1043260dFs = this.LJI;
        value.getClass();
        if (interfaceC1041500dD2 != null) {
            if (c1043270dFt != null) {
                C1043250dFr.LIZ(c1043270dFt, str, interfaceC1041500dD2, c1043260dFs);
            }
            if (c1043270dFt2 != null) {
                C1043250dFr.LIZ(c1043270dFt2, str, interfaceC1041500dD2, c1043260dFs);
            }
            c1043260dFs.LJIIL = false;
        }
    }

    @Override // X.InterfaceC1039910dAT
    public void LIZJ(C1035880d3y c1035880d3y) {
        boolean z;
        IAdLandPagePreloadService iAdLandPagePreloadService;
        String strLIZIZ;
        IAdLandPagePreloadService iAdLandPagePreloadService2;
        boolean z2 = true;
        if (C1553670qX7.LIZ != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!((Boolean) C275360Aqk.LIZ.getValue()).booleanValue()) {
                C1041230dCb c1041230dCbLJI = LJI();
                if (c1041230dCbLJI != null) {
                    c1041230dCbLJI.LIZJ();
                }
                C1041230dCb c1041230dCbLJI2 = LJI();
                String preloadAdChannel = c1035880d3y.getPreloadAdChannel();
                if (preloadAdChannel != null && !a0.LJJJIL(preloadAdChannel) && c1035880d3y.getPreloadAdWeb() == 4 && c1035880d3y.isUseWebUrl() == 1) {
                    try {
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (C0CLW.LIZIZ.LIZ.getAdLandingPageConfig().getAdLandingPagePreloadEnabled().booleanValue()) {
                        LIZLLL(c1041230dCbLJI2, c1035880d3y);
                        if ((!C1043370dG3.LIZ().enableRemoveUselessInterceptor || TextUtils.equals("splash", c1035880d3y.getPreloadAdScene())) && (iAdLandPagePreloadService2 = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class)) != null && !TextUtils.isEmpty(iAdLandPagePreloadService2.K0("splash"))) {
                            C1043270dFt c1043270dFt = new C1043270dFt(c1035880d3y.getPreloadAdChannel(), "splash");
                            c1041230dCbLJI2.LIZIZ(c1043270dFt);
                            LJIIIZ(c1043270dFt);
                            c1043270dFt.LJ = this.LJI;
                            this.LJFF = c1043270dFt;
                        }
                        LJ(c1041230dCbLJI2, c1035880d3y);
                    }
                }
                C1041230dCb c1041230dCbLJI3 = LJI();
                String loadUrl = c1035880d3y.getLoadUrl();
                if (loadUrl != null && (iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class)) != null) {
                    String strS0 = iAdLandPagePreloadService.s0(Long.valueOf(c1035880d3y.getRealCreativeId()));
                    C1027610cqd.LIZ.getClass();
                    if (strS0 != null && strS0.length() != 0) {
                        strLIZIZ = C1027610cqd.LIZIZ(strS0, loadUrl);
                    } else {
                        strLIZIZ = null;
                    }
                    if (c1035880d3y.isFromLynxPage() && strLIZIZ != null && !a0.LJJJIL(strLIZIZ) && C703302op.LIZ(iAdLandPagePreloadService.K0("lynx_feed"))) {
                        AbstractC1043470dGD c1043270dFt2 = new C1043270dFt(strLIZIZ, "lynx_feed");
                        c1041230dCbLJI3.LIZIZ(c1043270dFt2);
                        LJIIIZ(c1043270dFt2);
                    }
                }
                C1041230dCb c1041230dCbLJI4 = LJI();
                String preloadAdChannel2 = c1035880d3y.getPreloadAdChannel();
                if (preloadAdChannel2 != null && !a0.LJJJIL(preloadAdChannel2) && c1035880d3y.isPreloadSecondPage() == 1) {
                    LIZLLL(c1041230dCbLJI4, c1035880d3y);
                    LJ(c1041230dCbLJI4, c1035880d3y);
                }
                ArrayList arrayList = new ArrayList(C1553670qX7.LIZJ());
                if (c1035880d3y.enableCardPreload()) {
                    try {
                        List<String> adCardPreloadCommonPrefix = C0CLW.LIZIZ.LIZ.getAdLandingPageConfig().getAdCardPreloadCommonPrefix();
                        if (!C086I.LIZIZ(adCardPreloadCommonPrefix)) {
                            for (String str : adCardPreloadCommonPrefix) {
                                if (C703302op.LIZ(str)) {
                                    arrayList.add(PatternProtector.compile(str));
                                }
                            }
                        }
                    } catch (C316660CbA e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }
                C19866712oD c19866712oD = this.LIZJ;
                if (c19866712oD != null) {
                    c19866712oD.LIZIZ(arrayList);
                }
            }
            LJI();
            LJIIIIZZ(c1035880d3y);
        }
        this.LJIIIIZZ = c1035880d3y;
        if (c1035880d3y.getRealCreativeId() == 0 || (c1035880d3y.getPreloadAdWeb() != 4 && c1035880d3y.isPreloadSecondPage() != 1)) {
            z2 = false;
        }
        C1043270dFt.LJIILIIL = z2;
    }

    public final void LJIIIZ(AbstractC1043470dGD abstractC1043470dGD) {
        C1041220dCa c1041220dCa = this.LIZIZ;
        c1041220dCa.LIZIZ.writeLock().lock();
        try {
            c1041220dCa.LIZ.add(abstractC1043470dGD);
            c1041220dCa.LIZIZ.writeLock().unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1041220dCa.LIZIZ.writeLock().unlock();
            throw th;
        }
    }

    public final void LIZLLL(C1041230dCb c1041230dCb, C1035880d3y c1035880d3y) {
        IAdLandPagePreloadService iAdLandPagePreloadService;
        if ((!C1043370dG3.LIZ().enableRemoveUselessInterceptor || TextUtils.equals("feed", c1035880d3y.getPreloadAdScene())) && (iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class)) != null && !TextUtils.isEmpty(iAdLandPagePreloadService.K0("feed"))) {
            C1043270dFt c1043270dFt = new C1043270dFt(c1035880d3y.getPreloadAdChannel(), "feed");
            c1041230dCb.LIZIZ(c1043270dFt);
            LJIIIZ(c1043270dFt);
            c1043270dFt.LJ = this.LJI;
            this.LJ = c1043270dFt;
        }
    }

    public final void LJ(C1041230dCb c1041230dCb, C1035880d3y c1035880d3y) {
        IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
        if (iAdLandPagePreloadService == null) {
            return;
        }
        String strK0 = iAdLandPagePreloadService.K0("global");
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_preload_pixel", true, false) && !TextUtils.isEmpty(strK0)) {
            C1043280dFu c1043280dFu = new C1043280dFu(new AwS50S0100100_16(c1035880d3y.getRealCreativeId(), c1035880d3y, 8));
            c1041230dCb.LIZIZ(c1043280dFu);
            LJIIIZ(c1043280dFu);
        }
    }

    public final void LJFF(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        Map<String, String> requestHeaders;
        if (webResourceResponse == null) {
            return;
        }
        if (this.LJIIIZ == null) {
            this.LJIIIZ = C786410Ut5.J3(new JSONObject().put("res_from", "gecko"));
        }
        if (webResourceRequest != null && (requestHeaders = webResourceRequest.getRequestHeaders()) != null) {
            requestHeaders.put("header_hybrid_extra_web_request_info", this.LJIIIZ);
        }
    }

    public final void LJII(WebView webView, String str, WebResourceResponse webResourceResponse) {
        String str2;
        Map<String, String> responseHeaders;
        Map<String, String> responseHeaders2;
        if (webResourceResponse != null && (responseHeaders2 = webResourceResponse.getResponseHeaders()) != null) {
            str2 = responseHeaders2.get("hit_once");
        } else {
            str2 = null;
        }
        if (Intrinsics.LJFF(str2, "1")) {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS20S1200000_16(webView, this, str, 8));
        }
        if (webResourceResponse != null && (responseHeaders = webResourceResponse.getResponseHeaders()) != null) {
            responseHeaders.remove("hit_once");
        }
    }
}
