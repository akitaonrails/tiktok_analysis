package X;

import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.06Gt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1580506Gt {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, boolean z, StreakPetData streakPetData, long j) {
        String str2;
        String str3;
        JSONObject jSONObject = new JSONObject();
        if (z) {
            str2 = "message";
        } else {
            str2 = "request";
        }
        jSONObject.put("method", str2);
        if (streakPetData == null) {
            C06C6.LIZIZ.getClass();
            streakPetData = C06C6.LIZIZ(str);
        }
        C1571006Dc c1571006Dc = new C1571006Dc(str);
        c1571006Dc.LIZJ = streakPetData;
        jSONObject.put("pet_value", c1571006Dc.LIZ());
        if (streakPetData != null) {
            str3 = streakPetData.petFeUserData;
        } else {
            str3 = null;
        }
        jSONObject.put("fe_user_data", str3);
        jSONObject.put("extra_info", (Object) null);
        jSONObject.put("timestamp", j);
        boolean z2 = C1590806Ks.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("post streak_pet_data_update event : ");
        sbLIZ.append(jSONObject);
        C1590806Ks.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        C1548820qPI.LIZIZ(new C397901gf(System.currentTimeMillis(), new C1323820kYO(jSONObject), "streak_pet_data_update"));
    }
}
