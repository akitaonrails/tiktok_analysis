package Y;

import X.C1018260cbY;
import X.C1024380clQ;
import X.C1030680cva;
import X.C1041070dCL;
import X.C1041280dCg;
import X.C123100dR;
import X.C1C7U;
import X.C988570bpf;
import X.InterfaceC1665500tRU;
import com.bytedance.ies.ugc.aweme.commercialize.splash.report.TopViewAdEventLogger;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.TopViewJsonManager;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes17.dex */
public class ACallableS67S1100000_16 implements Callable {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS67S1100000_16 aCallableS67S1100000_16) {
        TopViewJsonManager topViewJsonManager = (TopViewJsonManager) aCallableS67S1100000_16.l1;
        String str = aCallableS67S1100000_16.s0;
        topViewJsonManager.getClass();
        C1C7U.LIZ("TopViewJsonManager@6936.delSplashAwemeAdByCid$1L");
        if (topViewJsonManager.LIZLLL(null) == null) {
            C1C7U.LIZIZ("TopViewJsonManager@6936.delSplashAwemeAdByCid$1L");
            return null;
        }
        Aweme aweme = topViewJsonManager.LIZLLL(null).get(str);
        if (aweme != null) {
            C1030680cva.LIZIZ(aweme, TopViewJsonManager.LJIIIIZZ);
            new TopViewAdEventLogger(new Object[]{aweme}).logAd(C1018260cbY.LIZ, new AObjectS359S0100000_16(aweme, 0));
        }
        C1C7U.LIZIZ("TopViewJsonManager@6936.delSplashAwemeAdByCid$1L");
        return null;
    }

    public static final Object call$1(ACallableS67S1100000_16 aCallableS67S1100000_16) {
        String strK0;
        C1C7U.LIZ("PreloadAdWebHelper@b810.preloadLynxData$2");
        Unit unit = null;
        if (C123100dR.LIZ(aCallableS67S1100000_16.s0)) {
            strK0 = aCallableS67S1100000_16.s0;
        } else {
            IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
            if (iAdLandPagePreloadService != null) {
                strK0 = iAdLandPagePreloadService.K0("lynx_feed");
            } else {
                strK0 = null;
            }
        }
        InterfaceC1665500tRU<String> interfaceC1665500tRU = (InterfaceC1665500tRU) aCallableS67S1100000_16.l1;
        if (interfaceC1665500tRU != null) {
            for (String str : interfaceC1665500tRU) {
                C1024380clQ.LIZ.getClass();
                C988570bpf.LIZ.getClass();
                if (C1041070dCL.LIZIZ() != null) {
                    C1041280dCg.LIZIZ(str, strK0, null);
                }
            }
            unit = Unit.LIZ;
        }
        C1C7U.LIZIZ("PreloadAdWebHelper@b810.preloadLynxData$2");
        return unit;
    }

    public ACallableS67S1100000_16(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
