package X;

import com.ss.android.common.lib.AppLogNewUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wyU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1801280wyU {
    public final String LIZ = "speech";
    public final C1801290wyV LIZIZ = new C1801290wyV();
    public final C1801270wyT LIZJ = new C1801270wyT();
    public final C1801330wyZ LIZLLL = new C1801330wyZ();

    public final void LIZ() throws JSONException {
        if (this.LIZJ.LIZ < 0) {
            LIZIZ();
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("engine", this.LIZ);
        jSONObject.put("engine_init_start_time", this.LIZLLL.LIZ);
        jSONObject.put("engine_init_end_time", this.LIZLLL.LIZIZ);
        jSONObject.put("asr_start_time", this.LIZIZ.LIZ);
        jSONObject.put("asr_first_result_time", this.LIZIZ.LIZIZ);
        jSONObject.put("asr_final_result_time", this.LIZIZ.LIZJ);
        jSONObject.put("asr_end_time", this.LIZIZ.LIZLLL);
        jSONObject.put("asr_status", this.LIZIZ.LJFF.ordinal());
        C1801290wyV c1801290wyV = this.LIZIZ;
        if (c1801290wyV.LJFF != EnumC992330bvj.ASR_SUCCESS) {
            jSONObject.put("asr_error_code", c1801290wyV.LJI);
            jSONObject.put("asr_error_msg", this.LIZIZ.LJII);
        }
        jSONObject.put("record_start_time", this.LIZJ.LIZ);
        jSONObject.put("record_end_time", this.LIZJ.LIZIZ);
        jSONObject.put("record_end_type", this.LIZJ.LIZJ.getType());
        jSONObject.put("record_status", this.LIZJ.LJ.ordinal());
        C1801270wyT c1801270wyT = this.LIZJ;
        if (c1801270wyT.LJ != EnumC0317009b.AUDIO_RECORD_SUCCESS) {
            jSONObject.put("record_error_msg", c1801270wyT.LJFF);
        }
        jSONObject.put("text_count", this.LIZIZ.LJ);
        C1801330wyZ c1801330wyZ = this.LIZLLL;
        long j = c1801330wyZ.LIZ;
        if (j > 0) {
            long j2 = c1801330wyZ.LIZIZ;
            if (j2 > 0) {
                jSONObject.put("engine_init_duration", j2 - j);
            }
        }
        C1801290wyV c1801290wyV2 = this.LIZIZ;
        long j3 = c1801290wyV2.LIZ;
        if (j3 > 0) {
            long j4 = c1801290wyV2.LIZLLL;
            if (j4 > 0) {
                jSONObject.put("asr_result_duration", j4 - j3);
            }
        }
        C1801270wyT c1801270wyT2 = this.LIZJ;
        long j5 = c1801270wyT2.LIZIZ;
        if (j5 > 0) {
            long j6 = c1801270wyT2.LIZ;
            if (j6 > 0) {
                jSONObject.put("tracker_record_duration_", j5 - j6);
            }
        }
        jSONObject.put("record_duration", this.LIZJ.LIZLLL);
        long j7 = this.LIZIZ.LIZLLL;
        if (j7 > 0) {
            long j8 = this.LIZJ.LIZ;
            if (j8 > 0) {
                jSONObject.put("total_duration", j7 - j8);
            }
        }
        LIZIZ();
        AppLogNewUtils.onEventV3("tako_speech_perf_tracker", jSONObject);
    }

    public final void LIZIZ() {
        C1801270wyT c1801270wyT = this.LIZJ;
        c1801270wyT.LIZ = -1L;
        c1801270wyT.LIZIZ = -1L;
        c1801270wyT.LJ = EnumC0317009b.AUDIO_RECORD_SUCCESS;
        c1801270wyT.LJFF = "";
        C1801290wyV c1801290wyV = this.LIZIZ;
        c1801290wyV.LIZ = -1L;
        c1801290wyV.LIZIZ = -1L;
        c1801290wyV.LIZJ = -1L;
        c1801290wyV.LIZLLL = -1L;
        c1801290wyV.LJFF = EnumC992330bvj.ASR_SUCCESS;
        c1801290wyV.LJII = "";
    }
}
