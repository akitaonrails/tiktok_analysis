package X;

import com.bytedance.android.livesdk.broadcast.RestartLiveChannel;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0UDv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C768810UDv {
    public static boolean LIZ;
    public static final BPEAHandler LIZIZ = new BPEAHandler(C783270Uo1.LIZIZ());

    public static void LIZ(DataChannel dataChannel) {
        C768800UDu.LIZIZ(dataChannel);
        if (C500260Jjc.LJJIJIIJIL((Boolean) DataChannelGlobal.LLILZ.gg0(RestartLiveChannel.class))) {
            LIZ = false;
        }
        LIZIZ.removeCallbacksAndMessages(null);
    }

    public static void LIZIZ(AbstractC1273900jFs abstractC1273900jFs, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_mute_mic", z ? 1 : 0);
            abstractC1273900jFs.LJJJLL("live_sei_mute_mic", jSONObject, -1, true, true, 0, "1610665985");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("LIVE_MUTE_MIC", e);
        }
    }
}
