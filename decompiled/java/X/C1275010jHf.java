package X;

import com.ss.bytertc.engine.VideoEncoderConfig;
import com.ss.bytertc.engine.utils.LogUtil;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jHf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1275010jHf {
    public final C1279520jOw LIZ;
    public final ScheduledExecutorService LIZIZ;
    public String LIZJ;
    public int LIZLLL;
    public VideoEncoderConfig LJ;
    public VideoEncoderConfig LJFF;
    public VideoEncoderConfig LJI;
    public VideoEncoderConfig LJII;
    public int LJIIIIZZ;
    public final C1275140jHs LJIIIZ;

    public final void LIZ() {
        this.LIZJ = null;
        if (this.LIZIZ.isShutdown()) {
            return;
        }
        this.LIZIZ.shutdown();
    }

    public static VideoEncoderConfig LIZJ(JSONObject jSONObject) {
        return new VideoEncoderConfig(jSONObject.optInt("width"), jSONObject.optInt("height"), jSONObject.optInt("fps"), jSONObject.optInt("bitrate_kbps"), 0);
    }

    public final void LIZIZ(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        if (jSONObject != null) {
            int iOptInt = jSONObject.optInt("rtc_video_param_mode");
            this.LIZLLL = iOptInt;
            if (iOptInt != 0) {
                if (iOptInt != 1) {
                    if (iOptInt != 3) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("sLiveVideoMode type error, sLiveVideoMode:");
                        sbLIZ.append(this.LIZLLL);
                        LogUtil.e("LiveRtcEngine", C2188811AlT.LIZIZ(sbLIZ));
                        C1279520jOw c1279520jOw = this.LIZ;
                        if (c1279520jOw != null) {
                            c1279520jOw.LIZ();
                        }
                        this.LJ = C1275720jIo.LIZ;
                    } else {
                        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("rtc_video_param_1v1_client");
                        if (jSONObjectOptJSONObject3 != null) {
                            this.LJFF = LIZJ(jSONObjectOptJSONObject3);
                        }
                        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("rtc_video_param_1v1_server");
                        if (jSONObjectOptJSONObject4 != null) {
                            this.LJI = LIZJ(jSONObjectOptJSONObject4);
                        }
                        if (this.LJIIIIZZ == 1) {
                            this.LJ = this.LJFF;
                        } else {
                            this.LJ = this.LJI;
                        }
                    }
                } else {
                    JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("rtc_video_param_server_define");
                    if (jSONObjectOptJSONObject5 != null) {
                        this.LJ = LIZJ(jSONObjectOptJSONObject5);
                    }
                }
            } else {
                this.LJ = C1275720jIo.LIZ;
            }
            JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("rtc_mix_param");
            if (jSONObjectOptJSONObject6 != null) {
                this.LJIIIZ.LJII = jSONObjectOptJSONObject6.optInt("video_bitrate_kbps");
                this.LJIIIZ.LJIIJ = jSONObjectOptJSONObject6.optString("task_id");
                if (jSONObjectOptJSONObject6.has("mix_video_param_server") && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject6.optJSONObject("mix_video_param_server")) != null) {
                    this.LJII = LIZJ(jSONObjectOptJSONObject2);
                }
            }
            JSONObject jSONObjectOptJSONObject7 = jSONObject.optJSONObject("rtc_performance_profiles");
            if (jSONObjectOptJSONObject7 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject7.optJSONObject("rtc_performance_low")) != null) {
                LIZJ(jSONObjectOptJSONObject);
            }
        }
    }

    public C1275010jHf(C1279520jOw c1279520jOw, ScheduledExecutorService scheduledExecutorService) {
        VideoEncoderConfig videoEncoderConfig = C1275720jIo.LIZ;
        this.LJ = videoEncoderConfig;
        this.LJFF = videoEncoderConfig;
        this.LJI = videoEncoderConfig;
        this.LJII = videoEncoderConfig;
        this.LJIIIZ = new C1275140jHs();
        this.LIZ = c1279520jOw;
        this.LIZIZ = scheduledExecutorService;
    }
}
