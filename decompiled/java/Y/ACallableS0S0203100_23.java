package Y;

import X.AnonymousClass0317;
import X.C01GW;
import X.C034S;
import X.C08Y7;
import X.C1120604Zw;
import X.C1124304aX;
import X.C1479130oat;
import X.C1480420ocy;
import X.C1507790pL7;
import X.C1AQS;
import X.C1C7U;
import X.C584720MwY;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.dependency.log.LogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.player.PlayerDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.player.IPlayerDependencyService;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.concurrent.Callable;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class ACallableS0S0203100_23 implements Callable {
    public final int $t;
    public int i2;
    public int i3;
    public int i4;
    public long j5;
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

    public static final Object call$0(ACallableS0S0203100_23 aCallableS0S0203100_23) {
        AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        IECommerceHostService iECommerceHostService;
        int i;
        boolean z2;
        String name2;
        C1C7U.LIZ("EcommercePlayerLogHelper@30bf.reportFirstFrameEvent$1");
        try {
            VideoUrlModel playAddr = ((Video) aCallableS0S0203100_23.l0).getPlayAddr();
            int videoLength = ((Video) aCallableS0S0203100_23.l0).getVideoLength();
            C1124304aX.LIZ.getClass();
            C01GW c01gw = C1124304aX.LIZJ;
            int nonNullQualityType = ((IPlayerDependencyService) c01gw.getValue()).getNonNullQualityType(playAddr);
            int iLJII = C1479130oat.LJII();
            long hitCacheSize = ((IPlayerDependencyService) c01gw.getValue()).getHitCacheSize(((Video) aCallableS0S0203100_23.l0).getPlayAddr()) / ((long) 1024);
            boolean zIsBytevc1 = ((C1480420ocy) aCallableS0S0203100_23.l1).isBytevc1();
            int i2 = C08Y7.LIZIZ;
            if (i2 == null) {
                i2 = -1;
            }
            JSONObject jSONObject = new JSONObject();
            long j = aCallableS0S0203100_23.j5;
            int i3 = aCallableS0S0203100_23.i2;
            int i4 = aCallableS0S0203100_23.i3;
            int i5 = aCallableS0S0203100_23.i4;
            jSONObject.put("duration", j);
            jSONObject.put("vduration", ((long) videoLength) * 1000);
            jSONObject.put("video_quality", nonNullQualityType);
            jSONObject.put("internet_speed", iLJII);
            jSONObject.put("pre_cache_size", hitCacheSize);
            jSONObject.put("video_bitrate", i3);
            jSONObject.put("play_bitrate", i4);
            jSONObject.put("is_bytevc1", zIsBytevc1);
            jSONObject.put("codec_name", i5);
            jSONObject.put("cpu_rate", i2);
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
                    name2 = iECommerceHostService2.getClass().getName();
                } else {
                    name2 = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name3, name2, z2);
                iECommerceHostService = (IECommerceHostService) service;
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            if (((IApplicationDependencyService) iECommerceHostService).isFirstInstallAndFirstLaunch()) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("is_cold_start_first_launch", i);
            C1507790pL7.LIZ.getClass();
            C1507790pL7.LIZLLL("video_play_quality", jSONObject);
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
                    name = anonymousClass0317CreateILogDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
            }
            ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin).crashlyticsWrapperCatchException(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcommercePlayerLogHelper@30bf.reportFirstFrameEvent$1");
        return unit;
    }

    public static final Object call$1(ACallableS0S0203100_23 aCallableS0S0203100_23) {
        AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        AnonymousClass0317 anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin;
        IECommerceHostService iECommerceHostService;
        int i;
        boolean z2;
        String name2;
        boolean z3;
        String name3;
        C1C7U.LIZ("PdpHeaderPlayerLogHelper@34f1.reportFirstFrameEvent$1");
        try {
            VideoUrlModel playAddr = ((Video) aCallableS0S0203100_23.l0).getPlayAddr();
            int videoLength = ((Video) aCallableS0S0203100_23.l0).getVideoLength();
            int iLIZ = C584720MwY.LIZ(playAddr);
            int iLJII = C1479130oat.LJII();
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin = PlayerDependencyService.createIPlayerDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                String name4 = IPlayerDependencyService.class.getName();
                if (anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin != null) {
                    name3 = anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name3 = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name4, name3, z3);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IPlayerDependencyService.class);
            }
            long hitCacheSize = ((IPlayerDependencyService) anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin).getHitCacheSize(((Video) aCallableS0S0203100_23.l0).getPlayAddr()) / ((long) 1024);
            boolean zIsBytevc1 = ((C1480420ocy) aCallableS0S0203100_23.l1).isBytevc1();
            int i2 = C08Y7.LIZIZ;
            if (i2 == null) {
                i2 = -1;
            }
            JSONObject jSONObject = new JSONObject();
            long j = aCallableS0S0203100_23.j5;
            int i3 = aCallableS0S0203100_23.i2;
            int i4 = aCallableS0S0203100_23.i3;
            int i5 = aCallableS0S0203100_23.i4;
            jSONObject.put("duration", j);
            jSONObject.put("vduration", ((long) videoLength) * 1000);
            jSONObject.put("video_quality", iLIZ);
            jSONObject.put("internet_speed", iLJII);
            jSONObject.put("pre_cache_size", hitCacheSize);
            jSONObject.put("video_bitrate", i3);
            jSONObject.put("play_bitrate", i4);
            jSONObject.put("is_bytevc1", zIsBytevc1);
            jSONObject.put("codec_name", i5);
            jSONObject.put("cpu_rate", i2);
            jSONObject.put("enter_from", "TEMAI");
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                Object service = ServiceManager.get().getService(IApplicationDependencyService.class);
                IECommerceHostService iECommerceHostService2 = (IECommerceHostService) service;
                if (iECommerceHostService2 != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String name5 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService2 != null) {
                    name2 = iECommerceHostService2.getClass().getName();
                } else {
                    name2 = null;
                }
                C1AQS.LIZJ(jElapsedRealtime2, 1, name5, name2, z2);
                iECommerceHostService = (IECommerceHostService) service;
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            if (((IApplicationDependencyService) iECommerceHostService).isFirstInstallAndFirstLaunch()) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("is_cold_start_first_launch", i);
            C1507790pL7.LIZ.getClass();
            C1507790pL7.LIZLLL("video_play_quality", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name6 = ILogDependencyService.class.getName();
                if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateILogDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime3, 1, name6, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
            }
            ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin).crashlyticsWrapperCatchException(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PdpHeaderPlayerLogHelper@34f1.reportFirstFrameEvent$1");
        return unit;
    }

    public ACallableS0S0203100_23(int i, int i2, int i3, long j, Video video, C1480420ocy c1480420ocy, int i4) {
        this.$t = i4;
        this.l0 = video;
        this.l1 = c1480420ocy;
        this.j5 = j;
        this.i2 = i;
        this.i3 = i2;
        this.i4 = i3;
    }
}
