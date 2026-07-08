package X;

import com.bytedance.android.livesdkapi.host.IHostConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pMV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1508650pMV {
    public static final JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            C1090540eU8 c1090540eU8VQ = ((IHostConfig) C1161920gLG.LIZJ(IHostConfig.class)).VQ();
            jSONObject.put("network_speed_in_kbps", c1090540eU8VQ.LIZIZ * 8);
            jSONObject.put("recommend_bitrate", c1090540eU8VQ.LIZ);
            C1497140p3w networkQuality = TTNetInit.getNetworkQuality();
            if (networkQuality != null) {
                jSONObject.put("tcp_rtt", networkQuality.LIZ);
                jSONObject.put("quic_rtt", networkQuality.LIZ);
                jSONObject.put("http_rtt", networkQuality.LIZIZ);
                jSONObject.put("downstream_throughput_kbps", networkQuality.LIZJ);
            }
            C1497130p3v packetLossRateMetrics = TTNetInit.getPacketLossRateMetrics(1);
            if (packetLossRateMetrics != null) {
                jSONObject.put("quic_send_loss_rate", packetLossRateMetrics.LIZ);
                jSONObject.put("quic_receive_loss_rate", packetLossRateMetrics.LIZIZ);
            }
            jSONObject.put("net_effective_connection_type", TTNetInit.getEffectiveConnectionType());
            jSONObject.put("video_download_speed", C1479130oat.LJII());
            return jSONObject;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("GetNetworkParams", e);
            return jSONObject;
        }
    }
}
