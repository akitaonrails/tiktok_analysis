package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageMonitorSamplingConfig;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageTrackerSwitchSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.message.data.PayloadItem;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.zip.GZIPInputStream;
import kotlin.Pair;
import kotlin.jvm.internal.AwS435S0200000_34;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1BxZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2221791BxZ {
    public static final /* synthetic */ int LIZ = 0;

    public static Map LIZIZ() {
        return C2221661BxM.LIZIZ() ? C2097608Jq.LJI(new Pair("compress", "zstd_dict"), new Pair("zstd_dict_version", String.valueOf(C2221661BxM.LIZIZ))) : C2097608Jq.LJI(new Pair("compress", "gzip"));
    }

    public static byte[] LIZ(PayloadItem payloadItem, Map map) throws Exception {
        byte[] byteArray;
        boolean z = true;
        if (payloadItem == null) {
            return new byte[1];
        }
        byte[] payload = payloadItem.getPayload();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        String compressType = payloadItem.getCompressType();
        if (Intrinsics.LJFF(compressType, "gzip")) {
            try {
                map.put("compress_type_proceeded", "gzip");
                map.put("compress_type_received", "gzip");
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(payload);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                byte[] bArr = new byte[SpeechEngineDefines.TTS_WORK_MODE_BOTH];
                while (true) {
                    int i = gZIPInputStream.read(bArr, 0, SpeechEngineDefines.TTS_WORK_MODE_BOTH);
                    if (i == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                }
                gZIPInputStream.close();
                byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                byteArrayInputStream.close();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2221821Bxc.LJIIIIZZ(e.toString(), map);
                C01GW c01gw = C20340414iQ.LIZ;
                C20340414iQ.LIZIZ(new AwS435S0200000_34(payloadItem, e, 0));
                throw e;
            }
        } else if (Intrinsics.LJFF(compressType, "zstd_dict")) {
            try {
                map.put("compress_type_proceeded", "zstd");
                map.put("compress_type_received", "zstd");
                byteArray = C2221661BxM.LIZ(payloadItem);
            } catch (C2221671BxN e2) {
                TryCatchGuardChecker.doCheck(e2);
                C2221821Bxc.LJIIIIZZ(e2.getReason(), map);
                C01GW c01gw2 = C20340414iQ.LIZ;
                C20340414iQ.LIZIZ(new AwS435S0200000_34(e2, payloadItem, 1));
                throw e2;
            }
        } else {
            String compressType2 = payloadItem.getCompressType();
            if (compressType2 == null) {
                compressType2 = "null";
            }
            map.put("compress_type_received", compressType2);
            byteArray = payload;
        }
        map.put("decompress_time", Long.valueOf(SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos));
        map.put("compress_ratio", Double.valueOf((((double) payload.length) * 1.0d) / ((double) byteArray.length)));
        if (new Random().nextDouble() >= LiveMessageMonitorSamplingConfig.INSTANCE.zstdSamplingRate()) {
            z = false;
        }
        if (C13LQ.LJIILLIIL("ttlive_message_decompress_all", LiveMessageTrackerSwitchSetting.INSTANCE.getValue()) && z && LiveMonitorSampleSetting.INSTANCE.isReportSlardar("ttlive_message_decompress_all")) {
            HashMap map2 = new HashMap(C2221821Bxc.LIZ);
            map2.put("status_code", 10000);
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                map2.put(entry.getKey(), entry.getValue());
            }
            C501590Jll.LIZLLL(map2);
            C501590Jll.LIZLLL(map2);
            C2221821Bxc.LJIIL(0, "ttlive_message_decompress_all", map2);
        }
        C01GW c01gw3 = C20340414iQ.LIZ;
        C20340414iQ.LIZJ(new AwS578S0100000_34(payloadItem, 13));
        return byteArray;
    }
}
