package X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jO5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1278990jO5 {
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;

    public final void LIZ(C1278990jO5 c1278990jO5) {
        if (c1278990jO5 != null) {
            this.LIZ += c1278990jO5.LIZ;
            this.LIZIZ += c1278990jO5.LIZIZ;
            this.LIZJ += c1278990jO5.LIZJ;
            this.LIZLLL += c1278990jO5.LIZLLL;
            this.LJFF += c1278990jO5.LJFF;
            this.LJI += c1278990jO5.LJI;
            this.LJII += c1278990jO5.LJII;
            this.LJIIIIZZ += c1278990jO5.LJIIIIZZ;
            this.LJ += c1278990jO5.LJ;
            this.LJIIIZ += c1278990jO5.LJIIIZ;
        }
    }

    public final void LIZIZ(JSONObject jSONObject) throws JSONException {
        jSONObject.put("transport_send_audio_stall_time", this.LIZJ).put("transport_send_audio_stall_count", this.LJFF).put("transport_send_video_stall_time", this.LIZ).put("transport_send_video_stall_count", this.LJII).put("transport_pts_audio_stall_time", this.LIZLLL).put("transport_pts_audio_stall_count", this.LJI).put("transport_pts_video_stall_time", this.LIZIZ).put("transport_pts_video_stall_count", this.LJIIIIZZ).put("transport_reconnect_count", this.LJIIIZ).put("transport_reconnect_time", this.LJ);
    }
}
