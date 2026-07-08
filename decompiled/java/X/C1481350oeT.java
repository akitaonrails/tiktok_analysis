package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.playereventreporter.VideoInfo;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oeT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1481350oeT {
    public VideoInfo LIZ;
    public C1481340oeS LIZIZ;

    /* JADX WARN: Removed duplicated region for block: B:167:0x04fb  */
    /* JADX WARN: Type inference failed for: r3v5, types: [X.1Dgu] */
    /* JADX WARN: Type inference failed for: r4v7, types: [X.0oeU] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            Method dump skipped, instruction units count: 1520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1481350oeT.LIZIZ():void");
    }

    public static void LIZ(JSONObject jSONObject) {
        try {
            int lastInfo = C1475000oUE.LIZIZ().getLastInfo(0);
            int lastInfo2 = C1475000oUE.LIZIZ().getLastInfo(2);
            if (lastInfo > 0) {
                jSONObject.put("prev_content_type", 2);
                C1475000oUE.LIZIZ().resetLastInfo(0);
            } else if (lastInfo2 <= 0) {
                if (C1475000oUE.LIZIZ().getLastInfo(1) == 150) {
                    jSONObject.put("prev_content_type", 3);
                } else {
                    jSONObject.put("prev_content_type", 0);
                }
            } else {
                jSONObject.put("prev_content_type", 1);
                C1475000oUE.LIZIZ().resetLastInfo(2);
            }
            if (jSONObject.has("play_order")) {
                int iIntValue = ((Integer) jSONObject.get("play_order")).intValue();
                if (lastInfo > 0) {
                    iIntValue++;
                }
                jSONObject.put("play_position", iIntValue);
            }
            if (jSONObject.has("aweme_type")) {
                C1475000oUE.LIZIZ().saveLastInfo(1, ((Integer) jSONObject.get("aweme_type")).intValue());
            }
            if (jSONObject.has("is_top_view")) {
                C1475000oUE.LIZIZ().saveLastInfo(2, ((Integer) jSONObject.get("is_top_view")).intValue());
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
