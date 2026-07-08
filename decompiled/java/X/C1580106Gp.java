package X;

import com.ss.android.ugc.aweme.im.streak.api.pet.StreakCampaignInfo;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakExtension;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import com.ss.android.ugc.aweme.im.streak.impl.model.StreakEntryInfo;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.06Gp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1580106Gp extends C06H0 {
    public final StreakPetData LIZ;
    public final int LIZIZ;
    public final long LIZJ;
    public final int LIZLLL;
    public final Integer LJ;
    public final String LJFF;
    public boolean LJI;
    public final int LJII;
    public final int LJIIIIZZ;

    public final void LIZ() {
        StreakExtension streakExtensionLIZ = C06HT.LIZ(this.LJFF);
        StreakCampaignInfo streakCampaignInfo = streakExtensionLIZ != null ? streakExtensionLIZ.campaign : null;
        StreakEntryInfo streakEntryInfo = new StreakEntryInfo("widget", streakCampaignInfo != null ? streakCampaignInfo.campaignId : null, null);
        C1571006Dc c1571006Dc = new C1571006Dc(this.LJFF);
        c1571006Dc.LIZJ = this.LIZ;
        c1571006Dc.LIZLLL = this.LJ;
        c1571006Dc.LJFF = this.LJI;
        c1571006Dc.LJIIIIZZ = Integer.valueOf(this.LJII);
        c1571006Dc.LJIIJ = streakCampaignInfo;
        JSONObject jSONObjectLIZ = c1571006Dc.LIZ();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pet_data", jSONObjectLIZ);
        jSONObject.put("streak_status", this.LIZIZ);
        jSONObject.put("streak_restore_before", this.LIZJ);
        jSONObject.put("remain_restore_count", this.LIZLLL);
        jSONObject.put("cid", this.LJFF);
        jSONObject.put("streak_days", this.LJIIIIZZ);
        StreakExtension streakExtensionLIZ2 = C06HT.LIZ(this.LJFF);
        jSONObject.put("streak_extension", streakExtensionLIZ2 != null ? new JSONObject(C051M.LJ(streakExtensionLIZ2, false)) : null);
        jSONObject.put("entry_info", C051M.LJ(streakEntryInfo, false));
        boolean z = C1590806Ks.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[postWidgetDataUpdateEvent] experimentFlag=");
        sbLIZ.append(jSONObjectLIZ.get("experiment_flags"));
        sbLIZ.append(", widgetEligibleByClient=");
        sbLIZ.append(streakCampaignInfo != null ? Boolean.valueOf(streakCampaignInfo.widgetEligibleByClient) : null);
        sbLIZ.append(", entry_info: campaignId=");
        sbLIZ.append(streakEntryInfo.campaignId);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(streakEntryInfo.enterMethod);
        C1590806Ks.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        C1548820qPI.LIZIZ(new C397901gf(System.currentTimeMillis(), new C1323820kYO(jSONObject), "streak_floating_widget_data_update"));
    }

    public C1580106Gp(StreakPetData streakPetData, int i, long j, int i2, Integer num, String str, boolean z, int i3, int i4) {
        this.LIZ = streakPetData;
        this.LIZIZ = i;
        this.LIZJ = j;
        this.LIZLLL = i2;
        this.LJ = num;
        this.LJFF = str;
        this.LJI = z;
        this.LJII = i3;
        this.LJIIIIZZ = i4;
    }
}
