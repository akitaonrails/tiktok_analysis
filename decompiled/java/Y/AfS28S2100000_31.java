package Y;

import X.C09JN;
import X.C0IJT;
import X.C0K04;
import X.C1161920gLG;
import X.C1338270kvh;
import X.C159M;
import X.C15FV;
import X.C1C7U;
import X.C20337714hz;
import X.C20337914i1;
import X.C20441214yg;
import X.C2188811AlT;
import X.C474500IjA;
import X.C476400ImE;
import X.C974480bSw;
import X.C975320bUI;
import X.InterfaceC1106030et7;
import android.text.TextUtils;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleBonusConfig;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleBonusStatus;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTask;
import com.bytedance.android.livesdkapi.host.IHostSetting;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.google.gson.n;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public class AfS28S2100000_31 implements C09JN {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
        }
    }

    public AfS28S2100000_31(n nVar, int i) {
        this.$t = i;
        this.s0 = null;
        this.l2 = nVar;
        this.s1 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS28S2100000_31 afS28S2100000_31, Object obj) {
        C159M c159m;
        C159M c159m2;
        C1C7U.LIZ("MatchSpeedChallengePresenter@e022.audienceSyncBattleInfo$syncRequest$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        if (((C15FV) afS28S2100000_31.l2).LLILZ != null) {
            BattleInfoResponse battleInfoResponse = (BattleInfoResponse) baseResponse.data;
            boolean z = false;
            C974480bSw.LJJII(afS28S2100000_31.s0, battleInfoResponse, false, false);
            JSONObject jSONObject = C975320bUI.LIZ;
            C15FV c15fv = (C15FV) afS28S2100000_31.l2;
            boolean z2 = c15fv.LLILLL;
            long j = c15fv.LLJ;
            if (Intrinsics.LJFF("egg_reward_complete", afS28S2100000_31.s0) && ((c159m2 = ((C15FV) afS28S2100000_31.l2).LLJI) == C159M.BONUS_FINISHED || c159m2 == C159M.DISABLED)) {
                z = true;
            }
            String str = ((C15FV) afS28S2100000_31.l2).LLJJJIL;
            String str2 = afS28S2100000_31.s1;
            JSONObject jSONObject2 = new JSONObject();
            C0K04.LJIIIZ(jSONObject2, "is_message_received", z);
            C0K04.LJFF("message_type", str2, jSONObject2);
            C975320bUI.LJIIJJI(str, j, jSONObject2);
            if (z2) {
                C975320bUI.LJIILL("task_battle_info_success", jSONObject2);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("critical point result ; current State = ");
            sbLIZ.append(((C15FV) afS28S2100000_31.l2).LLJI);
            C20441214yg.LIZIZ("BattleTaskPresenterTag", C2188811AlT.LIZIZ(sbLIZ));
            BattleTask battleTask = battleInfoResponse.battleTask;
            if (Intrinsics.LJFF("egg_reward_complete", afS28S2100000_31.s0) && ((c159m = ((C15FV) afS28S2100000_31.l2).LLJI) == C159M.BONUS_FINISHED || c159m == C159M.DISABLED)) {
                C20441214yg.LJIIL("BattleTaskPresenterTag", "critical point reward complete useless caused by message");
            } else if (battleTask != null) {
                BattleBonusConfig battleBonusConfig = battleTask.battleBonusConfig;
                if (battleBonusConfig != null) {
                    ((C15FV) afS28S2100000_31.l2).LJ(battleBonusConfig, "battle_info");
                }
                BattleBonusStatus battleBonusStatus = battleTask.battleBonusStatus;
                if (battleBonusStatus != null) {
                    ((C15FV) afS28S2100000_31.l2).LJIIIZ(battleBonusStatus);
                }
            }
        }
        C1C7U.LIZIZ("MatchSpeedChallengePresenter@e022.audienceSyncBattleInfo$syncRequest$1");
    }

    public static final void accept$1(AfS28S2100000_31 afS28S2100000_31, Object obj) {
        boolean z;
        C159M c159m;
        C1C7U.LIZ("MatchSpeedChallengePresenter@e022.audienceSyncBattleInfo$syncRequest$2");
        Throwable th = (Throwable) obj;
        if (((C15FV) afS28S2100000_31.l2).LLILZ != null) {
            C974480bSw.LJJIFFI(afS28S2100000_31.s0, th);
            JSONObject jSONObject = C975320bUI.LIZ;
            C15FV c15fv = (C15FV) afS28S2100000_31.l2;
            boolean z2 = c15fv.LLILLL;
            long j = c15fv.LLJ;
            if (Intrinsics.LJFF("egg_reward_complete", afS28S2100000_31.s0) && ((c159m = ((C15FV) afS28S2100000_31.l2).LLJI) == C159M.BONUS_FINISHED || c159m == C159M.DISABLED)) {
                z = true;
            } else {
                z = false;
            }
            String str = ((C15FV) afS28S2100000_31.l2).LLJJJIL;
            String str2 = afS28S2100000_31.s1;
            JSONObject jSONObject2 = new JSONObject();
            C0K04.LJIIIZ(jSONObject2, "is_message_received", z);
            C0K04.LJFF("message_type", str2, jSONObject2);
            C975320bUI.LJIIJJI(str, j, jSONObject2);
            if (z2) {
                C975320bUI.LJIILL("task_battle_info_failed", jSONObject2);
            }
        }
        C1C7U.LIZIZ("MatchSpeedChallengePresenter@e022.audienceSyncBattleInfo$syncRequest$2");
    }

    public static final void accept$2(AfS28S2100000_31 afS28S2100000_31, Object obj) {
        boolean z;
        String str = afS28S2100000_31.s0;
        n nVar = (n) afS28S2100000_31.l2;
        String str2 = afS28S2100000_31.s1;
        C1C7U.LIZ("TTLiveSDK@e12b.updateLiveSettings$1L");
        IHostSetting iHostSetting = (IHostSetting) C1161920gLG.LIZJ(IHostSetting.class);
        if (iHostSetting.pO2().settingsApiOptEnable && !TextUtils.isEmpty(str) && !TextUtils.equals(str, "full")) {
            z = false;
        } else {
            z = true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("do update settings : isFullSettings - ");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("TTLiveSDK", C2188811AlT.LIZIZ(sbLIZ));
        C1338270kvh.LIZLLL(SettingsManager.INSTANCE.saveSettingsValue(nVar, new C476400ImE(), z), nVar);
        iHostSetting.Nl1(str2);
        boolean zContains = C20337714hz.LIZJ.LIZ("live_sdk_core").contains("live_pip_switcher_open");
        if (((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).isLogin() && !zContains) {
            C20337914i1<Boolean> c20337914i1 = InterfaceC1106030et7.f5;
            if (!c20337914i1.LIZIZ().booleanValue()) {
                c20337914i1.LJFF(Boolean.TRUE);
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_background_player_ab_group");
                c474500IjALIZ.LJJII(0, "group");
                c474500IjALIZ.LJJII(Long.valueOf(((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId()), "user_id");
                c474500IjALIZ.LIZ();
            }
        }
        C1C7U.LIZIZ("TTLiveSDK@e12b.updateLiveSettings$1L");
    }

    public AfS28S2100000_31(C15FV c15fv, String str, String str2, int i) {
        this.$t = i;
        this.l2 = c15fv;
        this.s0 = str;
        this.s1 = str2;
    }
}
