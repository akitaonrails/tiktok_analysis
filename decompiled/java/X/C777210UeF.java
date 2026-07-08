package X;

import com.bytedance.android.livesdk.livesetting.game.LiveGameSafetyReporterSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.ILiveGameService;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import webcast.api.game.TnsPiracyDetail;

/* JADX INFO: renamed from: X.0UeF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C777210UeF implements InterfaceC471501sX {
    public final AtomicLong LIZ = new AtomicLong(0);
    public final AtomicLong LIZIZ = new AtomicLong(0);

    public final void LIZIZ() {
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isAppForeground()) {
            AtomicLong atomicLong = this.LIZ;
            atomicLong.set(atomicLong.get() + 1);
        } else {
            AtomicLong atomicLong2 = this.LIZIZ;
            atomicLong2.set(atomicLong2.get() + 1);
        }
    }

    @Override // X.InterfaceC471501sX
    public final void start() {
        Map<String, Object> map = C1338270kvh.LIZ;
    }

    @Override // X.InterfaceC471501sX
    public final void stop() {
        Map<String, Object> map = C1338270kvh.LIZ;
    }

    @Override // X.InterfaceC471501sX
    public final void LIZ(TnsPiracyDetail tnsPiracyDetail) {
        Map<String, Object> map = C1338270kvh.LIZ;
        tnsPiracyDetail.frontScreenClicks = this.LIZ.get();
        tnsPiracyDetail.backScreenClicks = this.LIZIZ.get();
        ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).XL0(Long.valueOf(this.LIZ.get()), "g_broadcast_front_touch_count");
        ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).XL0(Long.valueOf(this.LIZIZ.get()), "g_broadcast_background_touch_count");
        boolean z = C777230UeH.LIZJ;
        long j = this.LIZ.get();
        long j2 = this.LIZIZ.get();
        if (LiveGameSafetyReporterSetting.INSTANCE.getValue().f29switch) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onCollectTouchEvent, frontScreenClicks: ");
            sbLIZ.append(j);
            sbLIZ.append(", backScreenClicks: ");
            sbLIZ.append(j2);
            C20441214yg.LIZIZ("SafetyFeatureCollector", C2188811AlT.LIZIZ(sbLIZ));
            if (j + j2 > 0) {
                C777230UeH.LIZIZ = System.currentTimeMillis();
            }
            if (System.currentTimeMillis() - C777230UeH.LIZIZ < 30000) {
                C777230UeH.LIZ(Boolean.TRUE, "g_screen_click_background_period");
                C777230UeH.LIZJ = true;
            } else {
                C777230UeH.LIZ(Boolean.FALSE, "g_screen_click_background_period");
                C777230UeH.LIZJ = false;
            }
        }
        this.LIZ.set(0L);
        this.LIZIZ.set(0L);
    }
}
