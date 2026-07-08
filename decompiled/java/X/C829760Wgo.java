package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ml.strategycenter.stream.CaiSlardarEventBlackList;
import com.tiktok.strategycenterengine.eventstream.instance.ITTMEventStreamManager;
import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Wgo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C829760Wgo {
    public static final InterfaceC830810WiV LIZ;
    public static ExecutorService LIZIZ;
    public static final Set<String> LIZJ;

    static {
        C830790WiT c830790WiTLIZJ;
        LIZJ = new HashSet();
        ITTMEventStreamManager iTTMEventStreamManager = C04TQ.LIZ;
        if (iTTMEventStreamManager == null || (c830790WiTLIZJ = iTTMEventStreamManager.LIZJ()) == null) {
            c830790WiTLIZJ = null;
        }
        LIZ = c830790WiTLIZJ;
        if (iTTMEventStreamManager != null) {
            iTTMEventStreamManager.LIZIZ(c830790WiTLIZJ);
        }
        LIZIZ = C807400Vlq.LIZJ();
        C829770Wgp.LIZ.getClass();
        LIZJ = ((CaiSlardarEventBlackList) C829770Wgp.LIZJ.getValue()).caiSlardarEventBlackList;
    }

    public static void LIZ(final String str, final JSONObject jSONObject, final JSONObject jSONObject2, final JSONObject jSONObject3, final JSONObject jSONObject4) {
        if (TTMStrategyCenterManager.initReady() && str != null && !LIZJ.contains(str)) {
            try {
                if (LIZIZ.isShutdown()) {
                    LIZIZ = C807400Vlq.LIZJ();
                }
                LIZIZ.execute(new Runnable() { // from class: X.0Wgn
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("CAITTMStrategyCenterSlardarEventStream@8a6b.emitSlardarEvent$1");
                        try {
                            try {
                                TTMStrategyCenterManager.emitWithEventStream(C829760Wgo.LIZ, new C829730Wgl(str, jSONObject, jSONObject2, jSONObject3, jSONObject4));
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("CAITTMStrategyCenterSlardarEventStream@8a6b.emitSlardarEvent$1");
                    }
                });
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
