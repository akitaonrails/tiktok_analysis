package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.07uE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2010807uE {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(long j, String str, String str2, String str3) {
        try {
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("anchor_id", str2);
            jSONObject.put("room_id", str3);
            jSONObject.put("first_show_cost", j);
            c1507790pL7.getClass();
            C1507790pL7.LIZLLL(str, jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
