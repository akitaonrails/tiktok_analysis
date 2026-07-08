package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.event.WindowRefreshFinishedEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleSmokeCardEffectChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleSmokeDebuffChannel;
import com.bytedance.android.live.liveinteract.match.business.event.ScoreRevealStateChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.158U, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C158U extends C158J {
    public List<C916720Zxm> LLJ;
    public C975960bVK LLJI;
    public boolean LLJIJIL;

    @Override // X.C158J
    public final JSONArray LJFF() {
        return LJIIIZ(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Do2());
    }

    public final void LJIIJ() {
        DataChannel dataChannel;
        if (this.LLJIJIL || (dataChannel = this.LL) == null) {
            return;
        }
        dataChannel.DQ2(BattleSmokeCardEffectChannel.class, this, new AwS610S0100000_31(this, 385));
        dataChannel.DQ2(BattleSmokeDebuffChannel.class, this, new AwS610S0100000_31(this, 386));
        dataChannel.DQ2(WindowRefreshFinishedEvent.class, this, new AwS610S0100000_31(this, 387));
        dataChannel.CQ2(ScoreRevealStateChannel.class, this, new AwS610S0100000_31(this, 388));
        this.LLJIJIL = true;
    }

    public static final String LJIIJJI() {
        long jLJIIJ;
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        if (C500260Jjc.LJJJI(interfaceC973730bRjYf2 != null ? Boolean.valueOf(interfaceC973730bRjYf2.LJIJJLI()) : null)) {
            C973660bRc c973660bRc = C973660bRc.LIZ;
            jLJIIJ = C973660bRc.LJJIJLIJ();
        } else {
            InterfaceC973730bRj interfaceC973730bRjYf22 = C915980Zwa.LJFF().yf2(false);
            jLJIIJ = interfaceC973730bRjYf22 != null ? interfaceC973730bRjYf22.LJIIJ() : 0L;
        }
        List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
        ArrayList arrayList = new ArrayList();
        for (C954460awe c954460awe : listLLILZLL) {
            if (c954460awe.LJ != jLJIIJ) {
                arrayList.add(c954460awe);
            }
        }
        return C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, AFwS276S0000000_31.get$arr$(276), 30);
    }

    public final void LJIIL() {
        EnumC964170bCJ enumC964170bCJRY = C915980Zwa.LJFF().RY(false);
        if (enumC964170bCJRY != EnumC964170bCJ.MATCH_START) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateWhenSmokeChanged return, status:");
            sbLIZ.append(enumC964170bCJRY);
            C20441214yg.LJ("LiveMatchEffectPresenter", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        DataChannel dataChannel = this.LL;
        Object objGg0 = dataChannel != null ? dataChannel.gg0(BattleSmokeCardEffectChannel.class) : null;
        EnumC919030a1V enumC919030a1V = EnumC919030a1V.EFFECTING;
        boolean z = objGg0 == enumC919030a1V;
        DataChannel dataChannel2 = this.LL;
        boolean z2 = (dataChannel2 != null ? dataChannel2.gg0(BattleSmokeDebuffChannel.class) : null) == enumC919030a1V;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("updateWhenSmokeChanged effectFromAnchor:");
        sbLIZ2.append(z);
        sbLIZ2.append(" effectFromOthers:");
        sbLIZ2.append(z2);
        C20441214yg.LIZIZ("LiveMatchEffectPresenter", C2188811AlT.LIZIZ(sbLIZ2));
        LJI(!(z || z2));
    }

    public C158U(DataChannel dataChannel) {
        super(dataChannel);
        LJIIJ();
    }

    public static final JSONArray LJIIIZ(List<C916720Zxm> list) {
        JSONArray jSONArray = new JSONArray();
        Iterator<C916720Zxm> it2 = list.iterator();
        while (it2.hasNext()) {
            jSONArray.put(it2.next().LIZ());
        }
        return jSONArray;
    }

    @Override // X.C158J
    public final void LIZIZ(JSONObject jSONObject) throws JSONException {
        jSONObject.putOpt("pk_id", String.valueOf(C915980Zwa.LIZLLL().getBattleId()));
    }

    @Override // X.C158J
    public final void LIZJ(JSONObject jSONObject) {
        Long lValueOf;
        C976480bWA c976480bWALJLIL;
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.putOpt("current_match_score", jSONObject2);
            C975960bVK c975960bVK = this.LLJI;
            Long lValueOf2 = null;
            if (c975960bVK != null) {
                lValueOf = Long.valueOf(c975960bVK.LJLIIIL());
            } else {
                lValueOf = null;
            }
            jSONObject2.putOpt("anchor_score", lValueOf);
            C975960bVK c975960bVK2 = this.LLJI;
            if (c975960bVK2 != null && (c976480bWALJLIL = c975960bVK2.LJLIL()) != null) {
                lValueOf2 = Long.valueOf(c976480bWALJLIL.LIZIZ);
            }
            jSONObject2.putOpt("team_score", lValueOf2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20441214yg.LJFF("LiveMatchEffectPresenter", "genScoreInfo error:", th);
        }
    }

    @Override // X.C158J
    public final void LJ(JSONObject jSONObject) {
        Long lValueOf;
        C976480bWA c976480bWALJLIL;
        try {
            jSONObject.putOpt("effect_scene", "match");
            jSONObject.putOpt("pk_id", String.valueOf(C915980Zwa.LIZLLL().getBattleId()));
            jSONObject.putOpt("channel_id", String.valueOf(C915980Zwa.LIZLLL().getChannelId()));
            jSONObject.putOpt("sub_match_type", C915980Zwa.LIZLLL().Ti2());
            C975960bVK c975960bVK = this.LLJI;
            Long lValueOf2 = null;
            if (c975960bVK != null) {
                lValueOf = Long.valueOf(c975960bVK.LJJJJZI);
            } else {
                lValueOf = null;
            }
            jSONObject.putOpt("pk_inviter_id", lValueOf);
            jSONObject.putOpt("pk_invitee_list", LJIIJJI());
            jSONObject.putOpt("uid_list", C915980Zwa.LIZLLL().b70());
            C975960bVK c975960bVK2 = this.LLJI;
            int i = 1;
            if (c975960bVK2 == null || !c975960bVK2.LJJLIIIJLJLI) {
                i = 0;
            }
            jSONObject.putOpt("is_auto_iceshowdown", Integer.valueOf(i));
            C975960bVK c975960bVK3 = this.LLJI;
            if (c975960bVK3 != null && (c976480bWALJLIL = c975960bVK3.LJLIL()) != null) {
                lValueOf2 = Long.valueOf(c976480bWALJLIL.LIZ);
            }
            jSONObject.putOpt("team_id", lValueOf2);
            LIZJ(jSONObject);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20441214yg.LJFF("LiveMatchEffectPresenter", "generateJsonForFEReport error:", th);
        }
    }

    @Override // X.C158J
    public final void LJIIIIZZ(boolean z) {
        List<C916720Zxm> list;
        List<C916720Zxm> listDo2 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Do2();
        if (!z && (list = this.LLJ) != null && listDo2 != null && Intrinsics.LJFF(C13LP.LLIIJI(list), C13LP.LLIIJI(listDo2))) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateEffectLayoutToFE return.., currentLayoutInfoList:");
            sbLIZ.append(this.LLJ);
            sbLIZ.append(" layoutInfoList:");
            sbLIZ.append(listDo2);
            sbLIZ.append(" this:");
            sbLIZ.append(this);
            C20441214yg.LJIIL("LiveMatchEffectPresenter", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        this.LLJ = listDo2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("icy_container_id", this.LLIZ);
            jSONObject.putOpt("layout_info", LJIIIZ(listDo2));
            jSONObject.putOpt("pk_id", String.valueOf(C915980Zwa.LIZLLL().getBattleId()));
            LIZJ(jSONObject);
            C158J.LIZ(jSONObject);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20441214yg.LJFF("LiveMatchEffectPresenter", "updateEffectLayoutToFE error:", th);
        }
        C389001fE.LIZ("match_effect_update_layout", jSONObject, System.currentTimeMillis() + 10000, this.LLILLJJLI);
        C20441214yg.LIZIZ("LiveMatchEffectPresenter", "updateEffectLayoutToFE : " + jSONObject + " isSticky:" + this.LLILLJJLI);
    }
}
