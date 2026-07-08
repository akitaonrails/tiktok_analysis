package X;

import Y.ARunnableS48S0300000_15;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchAudienceCheckBattleInfoSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchAudienceSeiIdentifyDelaySetting;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiRegion;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0bMD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C970310bMD {
    public long LIZ;

    public final void LIZ(LiveWidget liveWidget, SeiAppData seiAppData, Function2<? super BattleInfoResponse, ? super Integer, Unit> function2) {
        Integer numValueOf;
        Long lValueOf;
        Map<String, String> map;
        String str;
        long j = seiAppData.battleId;
        String string = seiAppData.toString();
        try {
            Map<String, Map<String, String>> map2 = seiAppData.businessExtraInfo;
            if (map2 != null && (map = map2.get("match_info")) != null && (str = map.get("match_type")) != null) {
                numValueOf = Integer.valueOf(CastIntegerProtector.parseInt(str));
            } else {
                numValueOf = null;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("matchType error. e = ");
            sbLIZ.append(e);
            C20441214yg.LJ("EntranceIdentifier", C2188811AlT.LIZIZ(sbLIZ));
            numValueOf = -1;
        }
        int size = 0;
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf2 != null) {
            lValueOf = Long.valueOf(interfaceC973730bRjYf2.LJJJJJL());
        } else {
            lValueOf = null;
        }
        long enterRetryDuration = 0;
        if (j > 0 && this.LIZ != j && lValueOf != null && lValueOf.longValue() == 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("sei request battleInfo,seiInfoId = ");
            sbLIZ2.append(j);
            sbLIZ2.append(",matchType = ");
            sbLIZ2.append(numValueOf);
            C20441214yg.LJ("MatchSeiIdentifier", C2188811AlT.LIZIZ(sbLIZ2));
            if (!C955010axX.LJIIL || !C955010axX.LJIIJJI || !C955010axX.LJIIJ || !LiveMatchAudienceSeiIdentifyDelaySetting.INSTANCE.isEnable()) {
                enterRetryDuration = ((long) LiveMatchAudienceCheckBattleInfoSetting.INSTANCE.getEnterRetryDuration()) * 2000;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("retryCheckBattleInfo");
            sbLIZ3.append(": Retry request and check battle info, delay = ");
            sbLIZ3.append(enterRetryDuration);
            C20441214yg.LIZIZ("MatchSeiIdentifier", C2188811AlT.LIZIZ(sbLIZ3));
            C473410IhP.LIZJ(new ARunnableS48S0300000_15(this, liveWidget, function2, 9), enterRetryDuration);
        }
        C20441214yg.LIZIZ("MatchSeiIdentifier", "identify: seiBattleId " + j + ", this.seiBattleId " + this.LIZ + ", currentBattleId " + lValueOf + " matchType " + numValueOf);
        if (j > 0 && this.LIZ != j) {
            EnumC964170bCJ enumC964170bCJRY = C915980Zwa.LJFF().RY(false);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("matchType = ");
            sbLIZ4.append(numValueOf);
            sbLIZ4.append(", battleId = ");
            sbLIZ4.append(j);
            sbLIZ4.append(", status = ");
            sbLIZ4.append(enumC964170bCJRY);
            sbLIZ4.append(", seiString = ");
            sbLIZ4.append(string);
            C20441214yg.LIZIZ("MatchSeiIdentifier", C2188811AlT.LIZIZ(sbLIZ4));
            if (enumC964170bCJRY.compareTo(EnumC964170bCJ.MATCH_START) < 0) {
                C0K04.LJ("sei_battle_id", seiAppData.battleId, C970290bMB.LIZLLL);
                C0K04.LJIIIIZZ(C970290bMB.LIZLLL, "sei_stream_offset", seiAppData.containerOffsetY);
                JSONObject jSONObject = C970290bMB.LIZLLL;
                List<SeiRegion> list = seiAppData.grids;
                if (list != null) {
                    size = list.size();
                }
                C0K04.LIZLLL(size, "sei_stream_offset", jSONObject);
                C0K04.LIZLLL(1, "sei_match_stage", C970290bMB.LIZLLL);
                C974540bT2.LIZ.LJLZ(this.LIZ, C915980Zwa.LJI().LJIIJ().getChannelId(), 1, string, C918130a03.LIZ(numValueOf));
            } else {
                EnumC964170bCJ enumC964170bCJ = EnumC964170bCJ.MATCH_END;
                if (enumC964170bCJRY.compareTo(enumC964170bCJ) >= 0 && enumC964170bCJRY == enumC964170bCJ) {
                    C974540bT2.LIZ.LJLLLLLL(-2, string);
                }
            }
        }
        this.LIZ = j;
        C11JF c11jf = C955430ayD.LIZ;
        if (c11jf != null) {
            c11jf.dispose();
            C955430ayD.LIZ = null;
        }
    }
}
