package X;

import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.browser.IHybridPBService;
import com.bytedance.android.live.browser.IHybridPerformanceService;
import com.bytedance.android.live.browser.ILiveSparkService;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveServiceManagerOptSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Locale;

/* JADX INFO: renamed from: X.0fEg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1119400fEg {
    public static final boolean LIZ;
    public static volatile boolean LIZIZ;
    public static volatile C1119400fEg LIZJ;

    static {
        LIZ = C1161920gLG.LIZJ(IHostAppContext.class) != null && ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest();
        LIZIZ = false;
    }

    public static long LIZ() {
        float value = TTliveAnchorDeviceScoreSetting.INSTANCE.getValue();
        double d = value;
        if (d >= 8.3d) {
            return 3L;
        }
        return (d < 6.6d && value >= 0.0f) ? 8L : 5L;
    }

    public static C1119400fEg LIZIZ() {
        if (LIZJ == null) {
            synchronized (C1119400fEg.class) {
                try {
                    if (LIZJ == null) {
                        LIZJ = new C1119400fEg();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZJ;
    }

    public static void LIZJ() {
        ((ILiveSparkService) C1161920gLG.LIZJ(ILiveSparkService.class)).io0();
        ((IHybridPerformanceService) C1161920gLG.LIZJ(IHybridPerformanceService.class)).fT();
        ((IHybridPerformanceService) C1161920gLG.LIZJ(IHybridPerformanceService.class)).preload();
        ((IHybridPBService) C1161920gLG.LIZJ(IHybridPBService.class)).ux1();
    }

    public static void LIZLLL(String str) {
        int i;
        Locale localeCurrentLocale = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).currentLocale();
        if (str.equals("NewLivePrefetchLoadOptTask")) {
            i = 0;
        } else {
            i = 2;
        }
        C1124870fNV.LIZJ().getClass();
        C1124870fNV.LJFF(i, localeCurrentLocale);
        if (C497740JfY.LJJ() && LiveServiceManagerOptSetting.enable()) {
            ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).onLocaleChanged(localeCurrentLocale);
            ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).onLocaleChanged(localeCurrentLocale);
            ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).ei();
            C517110KPt.LJIIIIZZ();
            ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).onLocaleChanged(localeCurrentLocale);
        }
        C1119850fFP c1119850fFP = C011Z.LIZ;
        C783420UoG c783420UoG = new C783420UoG();
        c1119850fFP.getClass();
        C1119850fFP.LJJIFFI(R.drawable.evh, c783420UoG);
    }
}
