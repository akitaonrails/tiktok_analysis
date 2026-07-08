package X;

import com.bytedance.android.livesdkapi.depend.model.live.match.BattleEffectInfos;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.158J, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public abstract class C158J implements InterfaceC1141530foN {
    public final DataChannel LL;
    public BattleEffectInfos LLILLL;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLILLJJLI = true;
    public boolean LLILZ = true;
    public String LLIZ = "";
    public final C158P LLIZLLLIL = new C158P();

    public abstract void LIZIZ(JSONObject jSONObject);

    public void LIZJ(JSONObject jSONObject) {
    }

    public abstract void LJ(JSONObject jSONObject);

    public abstract JSONArray LJFF();

    public void LJIIIIZZ(boolean z) {
    }

    public final void LJII() {
        if (!this.LLILZIL || this.LLILLL == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateEffectInfoToFE return isEffectStarted:");
            sbLIZ.append(this.LLILZIL);
            sbLIZ.append(" effectInfos:");
            sbLIZ.append(this.LLILLL);
            C20441214yg.LJ("LiveMatchEffectFEPresenter", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("icy_container_id", this.LLIZ);
            BattleEffectInfos battleEffectInfos = this.LLILLL;
            if (battleEffectInfos != null) {
                jSONObject.putOpt("effect_info_list", new JSONArray(C1516000pYM.LIZJ(battleEffectInfos.effectInfoList)));
            }
            LIZIZ(jSONObject);
            LIZJ(jSONObject);
            LIZ(jSONObject);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20441214yg.LJFF("LiveMatchEffectFEPresenter", "updateEffectInfoToFE error:", th);
        }
        C389001fE.LIZ("match_effect_update_effect_info", jSONObject, System.currentTimeMillis() + 10000, this.LLILLJJLI);
        C20441214yg.LIZIZ("LiveMatchEffectFEPresenter", "updateEffectInfoToFE : " + jSONObject + " isSticky:" + this.LLILLJJLI);
    }

    public C158J(DataChannel dataChannel) {
        this.LL = dataChannel;
        if (!this.LLILZLL) {
            C1548820qPI.LIZLLL("lynx_match_icy_effect_on_ready", this);
            this.LLILZLL = true;
        }
    }

    public static void LIZ(JSONObject jSONObject) throws JSONException {
        int i;
        String string;
        String string2;
        Playbook playbook;
        if (!C915980Zwa.LIZLLL().AR0()) {
            return;
        }
        ActivePlaybook activePlaybookLIZIZ = C915980Zwa.LJI().LIZ().LIZIZ();
        if (activePlaybookLIZIZ != null) {
            i = 1;
        } else {
            i = 0;
        }
        jSONObject.putOpt("is_in_playbook", Integer.valueOf(i));
        String str = "";
        if (activePlaybookLIZIZ == null || (playbook = activePlaybookLIZIZ.playbook) == null || (string = Long.valueOf(playbook.playbookId).toString()) == null) {
            string = "";
        }
        jSONObject.putOpt("playbook_id", string);
        if (activePlaybookLIZIZ != null && (string2 = Long.valueOf(activePlaybookLIZIZ.playId).toString()) != null) {
            str = string2;
        }
        jSONObject.putOpt("play_id", str);
    }

    public final void LJI(boolean z) {
        if (this.LLILZ == z) {
            return;
        }
        this.LLILZ = z;
        JSONObject jSONObjectLIZLLL = LIZLLL(EnumC112200bg.SHOW_CONTROL, z);
        C389001fE.LIZ("match_effect_play_control", jSONObjectLIZLLL, System.currentTimeMillis() + 10000, this.LLILLJJLI);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("playEffectControlToFE: ");
        sbLIZ.append(jSONObjectLIZLLL);
        sbLIZ.append(" isSticky:");
        sbLIZ.append(this.LLILLJJLI);
        C20441214yg.LIZIZ("LiveMatchEffectFEPresenter", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onReceiveJsEvent:");
        sbLIZ.append(c262100zr.LIZ);
        C20441214yg.LIZIZ("LiveMatchEffectFEPresenter", C2188811AlT.LIZIZ(sbLIZ));
        if (Intrinsics.LJFF(c262100zr.LIZ, "lynx_match_icy_effect_on_ready")) {
            C20441214yg.LIZIZ("LiveMatchEffectFEPresenter", "make isSticky false");
            this.LLILLJJLI = false;
            LJIIIIZZ(true);
            LJII();
            C158P c158p = this.LLIZLLLIL;
            String str = this.LLIZ;
            c158p.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = c158p.LJII;
            long j2 = 0;
            if (j > 0) {
                j2 = jCurrentTimeMillis - j;
            }
            c158p.LJIL();
            AbstractC962030b8r.LJIIJ(c158p.LIZLLL, "effect_container_id", str, true);
            AbstractC962030b8r.LJIIJ(c158p.LIZLLL, "duration", String.valueOf(j2), true);
            c158p.LJIJJLI("effect_view_on_ready");
        }
    }

    public final JSONObject LIZLLL(EnumC112200bg enumC112200bg, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("icy_container_id", this.LLIZ);
            jSONObject.putOpt("type", enumC112200bg.getValue());
            if (enumC112200bg == EnumC112200bg.SHOW_CONTROL) {
                jSONObject.putOpt("visible", Boolean.valueOf(z));
            }
            LIZIZ(jSONObject);
            LIZJ(jSONObject);
            LIZ(jSONObject);
            return jSONObject;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20441214yg.LJFF("LiveMatchEffectFEPresenter", "generateControlJson error:", th);
            return jSONObject;
        }
    }
}
