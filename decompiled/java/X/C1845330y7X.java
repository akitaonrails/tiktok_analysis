package X;

import com.ss.android.common.lib.AppLogNewUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0y7X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1845330y7X {
    public final String LIZ;
    public final C1845350y7Z LIZIZ = new C1845350y7Z();
    public boolean LIZJ;

    public final void LIZ() throws JSONException {
        if (this.LIZJ) {
            return;
        }
        if (this.LIZIZ.LIZ < 0) {
            LIZIZ();
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("play_start_time", this.LIZIZ.LIZ);
        jSONObject.put("play_first_frame_time", this.LIZIZ.LIZIZ);
        jSONObject.put("play_end_time", System.currentTimeMillis());
        jSONObject.put("play_status", this.LIZIZ.LIZLLL.ordinal());
        C1845350y7Z c1845350y7Z = this.LIZIZ;
        if (c1845350y7Z.LIZLLL != EnumC048400Fm.PLAY_SUCCESS) {
            jSONObject.put("play_error_code", c1845350y7Z.LJ);
        }
        jSONObject.put("play_duration", this.LIZIZ.LIZJ);
        C1845350y7Z c1845350y7Z2 = this.LIZIZ;
        jSONObject.put("first_frame_duration", c1845350y7Z2.LIZIZ - c1845350y7Z2.LIZ);
        jSONObject.put("business_tag", this.LIZ);
        jSONObject.put("video_url", this.LIZIZ.LJFF);
        jSONObject.put("vid", this.LIZIZ.LJI);
        this.LIZJ = true;
        AppLogNewUtils.onEventV3("tako_video_perf_tracker", jSONObject);
        LIZIZ();
    }

    public final void LIZIZ() {
        C1845350y7Z c1845350y7Z = this.LIZIZ;
        c1845350y7Z.LIZ = -1L;
        c1845350y7Z.LIZIZ = -1L;
        c1845350y7Z.LIZJ = -1L;
        c1845350y7Z.LIZLLL = EnumC048400Fm.PLAY_SUCCESS;
        c1845350y7Z.LJ = -1;
        c1845350y7Z.LJFF = "";
        c1845350y7Z.LJI = "";
    }

    public C1845330y7X(String str) {
        this.LIZ = str;
    }
}
