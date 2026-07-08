package Y;

import X.C09JN;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C470590Icr;
import X.C974540bT2;
import X.C976180bVg;
import X.C976190bVh;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import webcast.api.battle.BattleLeaveLinkmicResponse;

/* JADX INFO: loaded from: classes16.dex */
public class AfS1S1210100_15 implements C09JN {
    public final int $t;
    public long j4;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS1S1210100_15 afS1S1210100_15, Object obj) {
        Map<Long, BattleTeamResult> map;
        BattleLeaveLinkmicResponse.ResponseData responseData;
        C1C7U.LIZ("MatchMatchingCoordinator@f28c.requestLinkMicLeaveApi$leaveDispose$1");
        C470590Icr<BattleLeaveLinkmicResponse.ResponseData> c470590Icr = (C470590Icr) obj;
        ((C976190bVh) afS1S1210100_15.l1).LJI = false;
        C974540bT2.LIZ.LJJLIIJ(afS1S1210100_15.j4, afS1S1210100_15.z3, afS1S1210100_15.s0, c470590Icr);
        BattleLeaveLinkmicResponse.ResponseData responseData2 = null;
        if (c470590Icr != null && (responseData = c470590Icr.data) != null) {
            map = responseData.teamBattleResult;
        } else {
            map = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("finish, battleResult = ");
        sbLIZ.append(map);
        C20441214yg.LJIIIZ("MatchMatchingCoordinator", C2188811AlT.LIZIZ(sbLIZ));
        Function1 function1 = (Function1) afS1S1210100_15.l2;
        if (function1 != null) {
            if (c470590Icr != null) {
                responseData2 = c470590Icr.data;
            }
            function1.invoke(responseData2);
        }
        C1C7U.LIZIZ("MatchMatchingCoordinator@f28c.requestLinkMicLeaveApi$leaveDispose$1");
    }

    public static final void accept$1(AfS1S1210100_15 afS1S1210100_15, Object obj) {
        Map<Long, BattleTeamResult> map;
        BattleLeaveLinkmicResponse.ResponseData responseData;
        C1C7U.LIZ("TwoMatchMatchingCoordinator@caf2.requestLinkMicLeaveApi$leaveDispose$1");
        C470590Icr<BattleLeaveLinkmicResponse.ResponseData> c470590Icr = (C470590Icr) obj;
        ((C976180bVg) afS1S1210100_15.l1).LJ = false;
        C974540bT2.LIZ.LJJLIIJ(afS1S1210100_15.j4, afS1S1210100_15.z3, afS1S1210100_15.s0, c470590Icr);
        BattleLeaveLinkmicResponse.ResponseData responseData2 = null;
        if (c470590Icr != null && (responseData = c470590Icr.data) != null) {
            map = responseData.teamBattleResult;
        } else {
            map = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("finish, battleResult = ");
        sbLIZ.append(map);
        C20441214yg.LJIIIZ("TwoMatchMatchingCoordinator", C2188811AlT.LIZIZ(sbLIZ));
        Function1 function1 = (Function1) afS1S1210100_15.l2;
        if (function1 != null) {
            if (c470590Icr != null) {
                responseData2 = c470590Icr.data;
            }
            function1.invoke(responseData2);
        }
        C1C7U.LIZIZ("TwoMatchMatchingCoordinator@caf2.requestLinkMicLeaveApi$leaveDispose$1");
    }

    public AfS1S1210100_15(Object obj, long j, boolean z, String str, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.j4 = j;
        this.z3 = z;
        this.s0 = str;
        this.l2 = obj2;
    }
}
