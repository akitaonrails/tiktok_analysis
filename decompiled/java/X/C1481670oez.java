package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.playereventreporter.VideoInfo;
import com.ss.android.ugc.aweme.simreporter.callback.UpdateCallback;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IEvent;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IMonitor;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oez, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1481670oez {
    public String LIZIZ;
    public UpdateCallback LIZLLL;
    public VideoInfo LJ;
    public C1481690of1 LJFF;
    public long LIZ = -1;
    public boolean LIZJ = true;

    public final void LIZ() {
        VideoInfo videoInfo;
        IMonitor iMonitorLJIIIIZZ;
        C1481690of1 c1481690of1 = this.LJFF;
        if (c1481690of1 == null || (videoInfo = this.LJ) == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("group_id", videoInfo.getAid());
            jSONObject.put("end_type", this.LIZIZ);
            jSONObject.put("duration", this.LIZ);
            jSONObject.put("vduration", Float.valueOf(videoInfo.getDuration()));
            jSONObject.put("position", c1481690of1.LIZJ);
            jSONObject.put("is_cache", c1481690of1.LIZ);
            jSONObject.put("is_bytevc1", videoInfo.isBytevc1());
            jSONObject.put("video_size", videoInfo.getVideoSize());
            jSONObject.put("play_sess", c1481690of1.LJII);
            jSONObject.put("block_type", c1481690of1.LIZLLL);
            jSONObject.put("bitrate_set", videoInfo.getBitRateSet());
            jSONObject.put("video_bitrate", videoInfo.getVideoBitrate());
            jSONObject.put("video_quality", videoInfo.getVideoQuality());
            jSONObject.put("audio_bitrate", videoInfo.getAudioBitrate());
            jSONObject.put("audio_quality", videoInfo.getAudioQuality());
            jSONObject.put("cache_size", videoInfo.getPreCacheSize());
            jSONObject.put("player_type", c1481690of1.LJIIIIZZ);
            jSONObject.put("pre_cache_size", videoInfo.getPreCacheSize());
            jSONObject.put("enable_hdr", videoInfo.getEnableHdr());
            jSONObject.put("internet_speed", c1481690of1.LJ);
            String str = c1481690of1.LJIIL;
            if (str != null && str.length() != 0) {
                jSONObject.put("landscape_portrait", c1481690of1.LJIIL);
            }
            jSONObject.put("is_landscape", c1481690of1.LJIILIIL);
            jSONObject.put("is_speeding", c1481690of1.LJIILJJIL);
            jSONObject.put("speed_mode", Float.valueOf(c1481690of1.LJIILL));
            jSONObject.put("is_start", -1);
            if (this.LIZJ) {
                jSONObject.put("request_info", (Object) null);
            } else {
                jSONObject.put("drop_cnt", -1);
            }
            for (String str2 : c1481690of1.LJIIJJI.keySet()) {
                Object obj = c1481690of1.LJIIJJI.get(str2);
                if (Intrinsics.LJFF(str2, "is_playing_translated_video") && (obj instanceof Boolean)) {
                    jSONObject.put(str2, ((Boolean) obj).booleanValue() ? 1 : 0);
                } else {
                    jSONObject.put(str2, obj);
                }
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        IEvent iEventLIZJ = C1475000oUE.LIZJ();
        if (iEventLIZJ != null) {
            iEventLIZJ.onEvent(this.LIZJ ? "video_block" : "video_decoder_block", jSONObject);
        }
        if (this.LIZLLL != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("video_block_key", this.LIZJ ? "video_block" : "video_decoder_block");
            linkedHashMap.put(this.LIZJ ? "video_block" : "video_decoder_block", jSONObject);
            this.LIZLLL.update(3, linkedHashMap);
        }
        if (!C1474810oTv.LJJIIJZLJL() && (iMonitorLJIIIIZZ = C1475000oUE.LJIIIIZZ()) != null) {
            iMonitorLJIIIIZZ.monitorCommonLog(this.LIZJ ? "aweme_block_bitrate_netspeed_log" : "aweme_block_decoder_log", jSONObject);
        }
        C625790Ogb.LIZ();
    }
}
