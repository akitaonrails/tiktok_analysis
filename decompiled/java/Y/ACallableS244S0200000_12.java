package Y;

import X.C09JN;
import X.C1017070cZd;
import X.C1018060cbE;
import X.C1C7U;
import X.InterfaceC739930T0t;
import com.bytedance.ies.ugc.aweme.commercialize.splash.report.ITopViewAdEventLogger;
import com.bytedance.ies.ugc.aweme.commercialize.splash.report.TopViewAdEventLogger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.DetailFeedService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes13.dex */
public class ACallableS244S0200000_12 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;

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

    public static final Object call$0(ACallableS244S0200000_12 aCallableS244S0200000_12) {
        Aweme awemeLJ;
        Aweme aweme = (Aweme) aCallableS244S0200000_12.l0;
        InterfaceC739930T0t interfaceC739930T0t = (InterfaceC739930T0t) aCallableS244S0200000_12.l1;
        C1C7U.LIZ("BaseListFragmentPanel@112.updateAwesomeInfo$1L");
        ITopViewAdEventLogger iTopViewAdEventLoggerLJJIIZ = TopViewAdEventLogger.LJJIIZ();
        try {
            awemeLJ = ((DetailFeedService) ServiceManager.get().getService(DetailFeedService.class)).LJ(aweme.getAid());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (C1017070cZd.LLIZLLLIL(aweme)) {
                iTopViewAdEventLoggerLJJIIZ.logAd(C1018060cbE.LJIILLIIL, aweme.getAwemeRawAd(), new AObjectS118S0000000_16(3));
            }
        }
        if (awemeLJ == null) {
            if (C1017070cZd.LLIZLLLIL(aweme)) {
                iTopViewAdEventLoggerLJJIIZ.logAd(C1018060cbE.LJIILLIIL, aweme.getAwemeRawAd(), new AObjectS118S0000000_16(2));
            }
            C1C7U.LIZIZ("BaseListFragmentPanel@112.updateAwesomeInfo$1L");
            return null;
        }
        if (C1017070cZd.LLIZLLLIL(aweme)) {
            iTopViewAdEventLoggerLJJIIZ.logAd(C1018060cbE.LJIILL, aweme.getAwemeRawAd());
        }
        interfaceC739930T0t.LLILIL(awemeLJ);
        C1C7U.LIZIZ("BaseListFragmentPanel@112.updateAwesomeInfo$1L");
        return null;
    }

    public static final Object call$1(ACallableS244S0200000_12 aCallableS244S0200000_12) {
        BaseListFragmentPanel baseListFragmentPanel = (BaseListFragmentPanel) aCallableS244S0200000_12.l0;
        C09JN<ScrollSwitchStateManager> c09jn = (C09JN) aCallableS244S0200000_12.l1;
        baseListFragmentPanel.getClass();
        C1C7U.LIZ("BaseListFragmentPanel@112.continueWithScrollSwitchStateManager$1L");
        baseListFragmentPanel.LJJLIIIJILLIZJL(c09jn);
        C1C7U.LIZIZ("BaseListFragmentPanel@112.continueWithScrollSwitchStateManager$1L");
        return null;
    }

    public ACallableS244S0200000_12(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
