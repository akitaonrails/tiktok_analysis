package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.StreakLevelData;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.StreakMilestoneConf;
import com.ss.android.ugc.aweme.im.streak.api.IStreakService;
import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.06FR, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06FR {
    public final String LIZ;
    public StreakData LIZJ;
    public final JSONObject LIZIZ = new JSONObject();
    public List<StreakLevelData> LIZLLL = C13BV.INSTANCE;

    public final JSONObject LIZ() throws JSONException {
        Object c098200Yq;
        StreakData streakDataR = this.LIZJ;
        boolean z = false;
        if (streakDataR == null) {
            IStreakService.LJJIIZ.getClass();
            streakDataR = C06LY.LIZ().r(this.LIZ, false);
            if (streakDataR == null) {
                return this.LIZIZ;
            }
        }
        this.LIZIZ.put("streak_status", C1567806Bw.LJIIIIZZ(streakDataR, false).ordinal());
        this.LIZIZ.put("streak_days", streakDataR.streak);
        this.LIZIZ.put("streak_restore_before", streakDataR.restoreAvailableTime);
        this.LIZIZ.put("remain_restore_count", streakDataR.remainRestoreCnt);
        this.LIZIZ.put("total_restore_cnt_this_window", streakDataR.totalRestoreCntThisWindow);
        JSONObject jSONObject = this.LIZIZ;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("current_level", C1567806Bw.LJII(streakDataR));
        try {
            c098200Yq = new JSONArray(C09EF.LIZ.LJIILL(this.LIZLLL));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        if (c098200Yq == null) {
            c098200Yq = "";
        }
        jSONObject2.put("level_data", c098200Yq);
        jSONObject.put("streak_milestone_data", jSONObject2);
        if (C1567806Bw.LJIIIIZZ(streakDataR, false) == EnumC1579606Gk.SECONDARY_ACTIVE) {
            JSONObject jSONObject3 = this.LIZIZ;
            C06FO.LIZ.getClass();
            long jLIZ = C06FO.LIZ(streakDataR);
            long j = LSPassThroughRecordSizeConfig.DEFAULT;
            jSONObject3.put("streak_end_before", (jLIZ * j) / j);
            JSONObject jSONObject4 = this.LIZIZ;
            if (C06FS.LIZ().enableTimeZone) {
                if (((Number) C06DH.LIZ.getValue()).intValue() == 0) {
                    z = true;
                }
            }
            jSONObject4.put("interval_seconds", z ? 86400 : C06FS.LIZ().timeWindow);
        }
        return this.LIZIZ;
    }

    public C06FR(String str) {
        this.LIZ = str;
    }

    public final void LIZIZ(StreakData streakData) {
        List<StreakLevelData> levelDataList;
        this.LIZJ = streakData;
        StreakMilestoneConf streakMilestoneConfLIZIZ = C1664306fR.LIZ.LIZIZ();
        if (streakMilestoneConfLIZIZ == null || (levelDataList = streakMilestoneConfLIZIZ.getLevelDataList()) == null) {
            levelDataList = C13BV.INSTANCE;
        }
        this.LIZLLL = levelDataList;
    }
}
