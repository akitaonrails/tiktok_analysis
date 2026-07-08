package X;

import Y.ARunnableS110S0100000_10;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QNd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C669310QNd {
    public static void LIZ(C669320QNe c669320QNe) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", c669320QNe.LIZ);
            jSONObject.put("result", Float.valueOf(c669320QNe.LIZIZ));
            jSONObject.put("lable", c669320QNe.LIZJ);
            jSONObject.put("w1", Float.valueOf(c669320QNe.LIZLLL));
            jSONObject.put("w2", Float.valueOf(c669320QNe.LJ));
            jSONObject.put("w3", Float.valueOf(c669320QNe.LJFF));
            jSONObject.put("w4", Float.valueOf(c669320QNe.LJI));
            jSONObject.put("w5", Float.valueOf(c669320QNe.LJII));
            jSONObject.put("w6", Float.valueOf(c669320QNe.LJIIIIZZ));
            C823050WQl.LIZIZ().execute(new ARunnableS110S0100000_10(jSONObject, 127));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
