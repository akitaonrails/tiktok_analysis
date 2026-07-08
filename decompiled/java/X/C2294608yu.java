package X;

import com.bytedance.byted_bach_sdk.buffer.BachAlgorithmOutput;
import com.bytedance.byted_bach_sdk.buffer.BachFaceAlgorithmOutput;
import com.bytedance.byted_bach_sdk.buffer.SingleFaceResult;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08yu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2294608yu {
    public static final boolean LIZ(String str) {
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "studio_bach_result_native_implement", true, false)) {
            return false;
        }
        if (Intrinsics.LJFF(str, "face") || Intrinsics.LJFF(str, "clip_d128") || Intrinsics.LJFF(str, "relation_recog") || Intrinsics.LJFF(str, "c300")) {
            return true;
        }
        return false;
    }

    public static final String LIZJ(BachAlgorithmOutput bachAlgorithmOutput) {
        BachFaceAlgorithmOutput bachFaceAlgorithmOutput = (BachFaceAlgorithmOutput) bachAlgorithmOutput;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("face_count", bachFaceAlgorithmOutput.faceResults.size());
            JSONArray jSONArray = new JSONArray();
            int i = 0;
            for (SingleFaceResult singleFaceResult : bachFaceAlgorithmOutput.faceResults) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("index", i);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("x", singleFaceResult.bbox_x);
                jSONObject3.put("y", singleFaceResult.bbox_y);
                jSONObject3.put("width", singleFaceResult.bbox_width);
                jSONObject3.put("height", singleFaceResult.bbox_height);
                jSONObject2.put("rect", jSONObject3);
                jSONObject2.put("leftTopX", singleFaceResult.bbox_x);
                jSONObject2.put("leftTopY", 1.0d - (((double) singleFaceResult.bbox_y) + ((double) singleFaceResult.bbox_height)));
                jSONObject2.put("rightBottomX", ((double) singleFaceResult.bbox_x) + ((double) singleFaceResult.bbox_width));
                jSONObject2.put("rightBottomY", 1.0d - ((double) singleFaceResult.bbox_y));
                jSONArray.put(jSONObject2);
                i++;
            }
            jSONObject.put("faces", jSONArray);
            return C786410Ut5.J3(jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015e A[Catch: Exception -> 0x01b5, LOOP:2: B:80:0x0158->B:82:0x015e, LOOP_END, TryCatch #1 {Exception -> 0x01b5, blocks: (B:53:0x00c7, B:55:0x00d3, B:57:0x00d7, B:59:0x00db, B:61:0x00e7, B:63:0x00eb, B:65:0x00ef, B:68:0x00f5, B:70:0x00ff, B:73:0x0118, B:74:0x012d, B:76:0x0133, B:78:0x0139, B:79:0x014b, B:80:0x0158, B:82:0x015e, B:83:0x0199, B:72:0x010e, B:71:0x010b), top: B:95:0x00c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b9  */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Iterable, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C2262108tf LIZIZ(com.bytedance.byted_bach_sdk.BachAlgorithmSystem r15, java.lang.String r16) {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2294608yu.LIZIZ(com.bytedance.byted_bach_sdk.BachAlgorithmSystem, java.lang.String):X.08tf");
    }
}
