package X;

import android.os.Handler;
import com.bytedance.android.livesdk.comp.api.performance.IPerformanceService;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveEasyExitCardConfig;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveEasyExitCardSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: renamed from: X.0ITZ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0ITZ extends C0IM6 {
    public int LJFF;
    public String LJI;
    public final HashMap<Integer, Long> LJII;
    public final C01GW LJIIIIZZ;
    public final Map<DataChannel, C467000ITa> LJIIIZ;

    public final LiveEasyExitCardConfig LJFF() {
        return (LiveEasyExitCardConfig) this.LJIIIIZZ.getValue();
    }

    @Override // X.C0IM6
    public final void LIZLLL(DataChannel dataChannel) {
        InterfaceC1100800ekg interfaceC1100800ekg;
        if (dataChannel != null) {
            C467000ITa c467000ITa = (C467000ITa) ((LinkedHashMap) this.LJIIIZ).get(dataChannel);
            if (c467000ITa != null) {
                ((Handler) c467000ITa.LJ.getValue()).removeCallbacksAndMessages(null);
                CountDownTimerC521500Kcm countDownTimerC521500Kcm = c467000ITa.LJIIL;
                if (countDownTimerC521500Kcm != null) {
                    countDownTimerC521500Kcm.cancel();
                }
                CountDownTimerC521500Kcm countDownTimerC521500Kcm2 = c467000ITa.LJIILIIL;
                if (countDownTimerC521500Kcm2 != null) {
                    countDownTimerC521500Kcm2.cancel();
                }
                C467010ITb c467010ITb = c467000ITa.LJIIJJI;
                if (c467010ITb != null && (interfaceC1100800ekg = c467000ITa.LJIIJ) != null) {
                    interfaceC1100800ekg.LJII(c467010ITb);
                }
                c467000ITa.LJII = false;
                c467000ITa.LJIIIIZZ = false;
                c467000ITa.LJIIIZ = false;
            }
            this.LJIIIZ.remove(dataChannel);
        }
    }

    public C0ITZ(String str, String str2) {
        super(str, str2);
        this.LJII = new HashMap<>();
        this.LJIIIIZZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(327));
        this.LJIIIZ = new LinkedHashMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x008f, code lost:
    
        if (r7.LJII.size() >= LJFF().depthConfig.watchNCount) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.0ITb, X.0elC] */
    @Override // X.C0IM6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair LIZIZ(final X.C0IHF r8, com.bytedance.ies.sdk.datachannel.DataChannel r9) {
        /*
            Method dump skipped, instruction units count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ITZ.LIZIZ(X.0IHF, com.bytedance.ies.sdk.datachannel.DataChannel):android.util.Pair");
    }

    @Override // X.C0IM6
    public final boolean LJ(int i, long j) {
        if (!this.LIZJ && LIZ()) {
            LiveEasyExitCardSetting liveEasyExitCardSetting = LiveEasyExitCardSetting.INSTANCE;
            int depthWatchDurationSingle = liveEasyExitCardSetting.getDepthWatchDurationSingle();
            if (LJFF().depthConfig.enable && depthWatchDurationSingle > 0 && j >= depthWatchDurationSingle) {
                return true;
            }
            int depthWatchDurationN = liveEasyExitCardSetting.getDepthWatchDurationN();
            if (LJFF().depthConfig.enable && depthWatchDurationN > 0 && j >= depthWatchDurationN) {
                this.LJII.put(Integer.valueOf(i), Long.valueOf(j));
                if (this.LJII.size() >= LJFF().depthConfig.watchNCount) {
                    return true;
                }
            }
            C1100750ekb c1100750ekbNy0 = ((IPerformanceService) C1161920gLG.LIZJ(IPerformanceService.class)).ny0("live_watch");
            if (c1100750ekbNy0 != null && LJFF().performanceLevel > 0 && c1100750ekbNy0.LIZJ.LIZLLL.ordinal() <= LJFF().performanceLevel) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.C0IM6
    public final void LIZJ(int i, int i2, long j) {
        this.LJFF = i2;
        if (j >= LiveEasyExitCardSetting.INSTANCE.getDepthWatchDurationN()) {
            this.LJII.put(Integer.valueOf(i), Long.valueOf(j));
        }
    }
}
