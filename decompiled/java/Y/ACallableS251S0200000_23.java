package Y;

import X.AnonymousClass0317;
import X.C01GW;
import X.C034S;
import X.C1120604Zw;
import X.C1124304aX;
import X.C1479130oat;
import X.C1481290oeN;
import X.C1507790pL7;
import X.C1AQS;
import X.C1C7U;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.dependency.log.LogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.player.PlayerDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.player.IPlayerDependencyService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.concurrent.Callable;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class ACallableS251S0200000_23 implements Callable {
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

    public static final Object call$0(ACallableS251S0200000_23 aCallableS251S0200000_23) {
        AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin;
        boolean z;
        int i;
        int i2;
        String string;
        IECommerceHostService iECommerceHostService;
        int i3;
        boolean z2;
        String name;
        C1C7U.LIZ("EcommercePlayerLogHelper@30bf.reportVideoFailed$1");
        String name2 = null;
        try {
            int videoLength = ((Video) aCallableS251S0200000_23.l0).getVideoLength();
            JSONObject jSONObject = new JSONObject();
            C1481290oeN c1481290oeN = (C1481290oeN) aCallableS251S0200000_23.l1;
            Video video = (Video) aCallableS251S0200000_23.l0;
            jSONObject.put("error_code", String.valueOf(c1481290oeN.LJ));
            jSONObject.put("error_internal_code", String.valueOf(c1481290oeN.LJFF));
            jSONObject.put("error_info", c1481290oeN.LJI.toString());
            if (c1481290oeN.LIZIZ) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("is_bytevc1", String.valueOf(i));
            if (c1481290oeN.LIZLLL) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            jSONObject.put("is_dash", String.valueOf(i2));
            jSONObject.put("is_ad", CardStruct.IStatusCode.DEFAULT);
            jSONObject.put("vduration", ((long) videoLength) * 1000);
            jSONObject.put("internet_speed", String.valueOf(C1479130oat.LJII()));
            C1124304aX.LIZ.getClass();
            C01GW c01gw = C1124304aX.LIZJ;
            jSONObject.put("cache_size", String.valueOf(((IPlayerDependencyService) c01gw.getValue()).getHitCacheSize(video.getPlayAddr())));
            jSONObject.put("video_size", String.valueOf(((IPlayerDependencyService) c01gw.getValue()).getVideoSize(video.getPlayAddr())));
            if (video.getPlayAddr() == null) {
                string = "null";
            } else {
                string = video.getPlayAddr().toString();
            }
            jSONObject.put("play_url", string);
            jSONObject.put("is_from_feed_cache", CardStruct.IStatusCode.DEFAULT);
            jSONObject.put("enter_from", "TEMAI");
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                Object service = ServiceManager.get().getService(IApplicationDependencyService.class);
                IECommerceHostService iECommerceHostService2 = (IECommerceHostService) service;
                if (iECommerceHostService2 != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String name3 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService2 != null) {
                    name = iECommerceHostService2.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name3, name, z2);
                iECommerceHostService = (IECommerceHostService) service;
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            if (((IApplicationDependencyService) iECommerceHostService).isFirstInstallAndFirstLaunch()) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            jSONObject.put("is_cold_start_first_launch", i3);
            C1507790pL7.LIZ.getClass();
            C1507790pL7.LIZLLL("video_play_failed", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name4 = ILogDependencyService.class.getName();
                if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                    name2 = anonymousClass0317CreateILogDependencyServicebyMonsterPlugin.getClass().getName();
                }
                C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name2, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
            }
            ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin).crashlyticsWrapperCatchException(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcommercePlayerLogHelper@30bf.reportVideoFailed$1");
        return unit;
    }

    public static final Object call$1(ACallableS251S0200000_23 aCallableS251S0200000_23) {
        AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin;
        boolean z;
        int i;
        int i2;
        AnonymousClass0317 anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin;
        AnonymousClass0317 anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin2;
        String string;
        IECommerceHostService iECommerceHostService;
        int i3;
        boolean z2;
        String name;
        boolean z3;
        String name2;
        boolean z4;
        String name3;
        C1C7U.LIZ("PdpHeaderPlayerLogHelper@34f1.reportVideoFailed$1");
        String name4 = null;
        try {
            int videoLength = ((Video) aCallableS251S0200000_23.l0).getVideoLength();
            JSONObject jSONObject = new JSONObject();
            C1481290oeN c1481290oeN = (C1481290oeN) aCallableS251S0200000_23.l1;
            Video video = (Video) aCallableS251S0200000_23.l0;
            jSONObject.put("error_code", String.valueOf(c1481290oeN.LJ));
            jSONObject.put("error_internal_code", String.valueOf(c1481290oeN.LJFF));
            jSONObject.put("error_info", c1481290oeN.LJI.toString());
            if (c1481290oeN.LIZIZ) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("is_bytevc1", String.valueOf(i));
            if (c1481290oeN.LIZLLL) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            jSONObject.put("is_dash", String.valueOf(i2));
            jSONObject.put("is_ad", CardStruct.IStatusCode.DEFAULT);
            jSONObject.put("vduration", ((long) videoLength) * 1000);
            jSONObject.put("internet_speed", String.valueOf(C1479130oat.LJII()));
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin = PlayerDependencyService.createIPlayerDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                String name5 = IPlayerDependencyService.class.getName();
                if (anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin != null) {
                    name3 = anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name3 = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name5, name3, z4);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IPlayerDependencyService.class);
            }
            jSONObject.put("cache_size", String.valueOf(((IPlayerDependencyService) anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin).getHitCacheSize(video.getPlayAddr())));
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin2 = PlayerDependencyService.createIPlayerDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin2 != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                String name6 = IPlayerDependencyService.class.getName();
                if (anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin2 != null) {
                    name2 = anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin2.getClass().getName();
                } else {
                    name2 = null;
                }
                C1AQS.LIZJ(jElapsedRealtime2, 1, name6, name2, z3);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IPlayerDependencyService.class);
            }
            jSONObject.put("video_size", String.valueOf(((IPlayerDependencyService) anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin2).getVideoSize(video.getPlayAddr())));
            if (video.getPlayAddr() == null) {
                string = "null";
            } else {
                string = video.getPlayAddr().toString();
            }
            jSONObject.put("play_url", string);
            jSONObject.put("is_from_feed_cache", CardStruct.IStatusCode.DEFAULT);
            jSONObject.put("enter_from", "TEMAI");
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                Object service = ServiceManager.get().getService(IApplicationDependencyService.class);
                IECommerceHostService iECommerceHostService2 = (IECommerceHostService) service;
                if (iECommerceHostService2 != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String name7 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService2 != null) {
                    name = iECommerceHostService2.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime3, 1, name7, name, z2);
                iECommerceHostService = (IECommerceHostService) service;
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            if (((IApplicationDependencyService) iECommerceHostService).isFirstInstallAndFirstLaunch()) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            jSONObject.put("is_cold_start_first_launch", i3);
            C1507790pL7.LIZ.getClass();
            C1507790pL7.LIZLLL("video_play_failed", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime4 = SystemClock.elapsedRealtime();
                anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name8 = ILogDependencyService.class.getName();
                if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                    name4 = anonymousClass0317CreateILogDependencyServicebyMonsterPlugin.getClass().getName();
                }
                C1AQS.LIZJ(jElapsedRealtime4, 1, name8, name4, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
            }
            ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin).crashlyticsWrapperCatchException(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PdpHeaderPlayerLogHelper@34f1.reportVideoFailed$1");
        return unit;
    }

    public ACallableS251S0200000_23(Video video, C1481290oeN c1481290oeN, int i) {
        this.$t = i;
        this.l0 = video;
        this.l1 = c1481290oeN;
    }
}
