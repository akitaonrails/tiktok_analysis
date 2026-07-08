package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.09aQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2397609aQ {
    public static final C2397609aQ LIZ = new C2397609aQ();

    public static final void LIZ(int i, int i2, long j, String str) {
        C2397709aR c2397709aR = C2397709aR.LIZ;
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZ.put("type", Integer.valueOf(i));
        c2241008qG.LIZ.put("service", str);
        c2241008qG.LIZ.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, Integer.valueOf(i2));
        c2241008qG.LIZ.put("duration", Long.valueOf(System.currentTimeMillis() - j));
        JSONObject jSONObjectLJ = c2241008qG.LJ();
        c2397709aR.getClass();
        C2397709aR.LIZJ("kids_api_monitor", jSONObjectLJ);
    }
}
