package X;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.1DT2, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DT2 {
    public long LIZ;
    public final /* synthetic */ C1DT3 LIZIZ;

    public final void LIZ() {
        this.LIZIZ.LIZLLL = System.currentTimeMillis() - this.LIZ;
    }

    public final void LIZIZ() {
        if (this.LIZIZ.LIZLLL <= 0 || this.LIZ == 0) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("is_success", String.valueOf(this.LIZIZ.LIZ));
        C1DT3 c1dt3 = this.LIZIZ;
        if (!c1dt3.LIZ) {
            linkedHashMap.put("error_code", String.valueOf(c1dt3.LIZIZ));
            linkedHashMap.put("error_msg", this.LIZIZ.LIZJ);
        }
        linkedHashMap.put("cost_ms", String.valueOf(this.LIZIZ.LIZLLL));
        linkedHashMap.put("type", this.LIZIZ.LJ);
        linkedHashMap.put("start_from", this.LIZIZ.LJFF);
        C00YL c00ylLIZ = C1706400uVS.LIZ();
        if (c00ylLIZ != null) {
            c00ylLIZ.LIZ("ame_perf_video_sticker_res_download", linkedHashMap);
        }
    }

    public final void LIZJ() {
        this.LIZ = System.currentTimeMillis();
    }

    public C1DT2(C1DT3 c1dt3) {
        this.LIZIZ = c1dt3;
    }
}
