package com.bytedance.android.live.liveinteract.multihost.abtest;

import X.C09CT;
import X.C19748512Ol;
import X.C20441214yg;
import X.C2188811AlT;
import X.C915980Zwa;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostABInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class MultiHostAbTestHelper {
    public static final /* synthetic */ int LIZ = 0;

    public static final class CoHostABInfoInRoom {
        public long LIZ;

        @C09CT("live_cohost_timeout_strategy_group")
        public int cohostTimeoutStrategyGroup;

        @C09CT("is_cohost_during_multiguest_enabled")
        public int isCohostDuringMultiguestEnabled;

        @C09CT("is_cohost_multiguest")
        public boolean isCohostMultiguest;

        @C09CT("is_match_playbook_enabled")
        public boolean isMatchPlaybookEnabled;

        @C09CT("is_match_playbook_optimisation_enabled")
        public boolean isMatchPlaybookOptimisationEnabled;

        @C09CT("live_match_button_opt")
        public boolean liveMatchButtonOpt;
    }

    public static void LIZJ(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            LIZIZ(((Number) entry.getKey()).longValue(), (CohostABInfo) entry.getValue());
        }
    }

    public static CoHostABInfoInRoom LIZ(long j, String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        Object objLJII = null;
        if (z) {
            return null;
        }
        try {
            objLJII = C19748512Ol.LIZJ.LJII(str, CoHostABInfoInRoom.class);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20441214yg.LJI("MultiHostGsonUtil", th);
        }
        CoHostABInfoInRoom coHostABInfoInRoom = (CoHostABInfoInRoom) objLJII;
        if (coHostABInfoInRoom != null) {
            coHostABInfoInRoom.LIZ = j;
        }
        return coHostABInfoInRoom;
    }

    public static void LIZIZ(long j, CohostABInfo cohostABInfo) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateABInfoCache, uid=");
        sbLIZ.append(j);
        sbLIZ.append(", HostWithGuestPhase2 = ");
        sbLIZ.append(cohostABInfo.isCohostDuringMultiguestEnabled);
        sbLIZ.append(", isCohostMultiguest=");
        sbLIZ.append(cohostABInfo.isCohostMultiguest);
        sbLIZ.append(", liveMatchButtonOpt=");
        sbLIZ.append(cohostABInfo.liveMatchButtonOpt);
        sbLIZ.append(", ");
        sbLIZ.append(cohostABInfo);
        C20441214yg.LIZIZ("MultiHostAbTestHelper", C2188811AlT.LIZIZ(sbLIZ));
        CohostABInfo cohostABInfoLJII = C915980Zwa.LJI().LJIIIZ().LJII(j);
        if (cohostABInfoLJII == null) {
            cohostABInfoLJII = new CohostABInfo();
        }
        if (cohostABInfo.liveMatchButtonOpt) {
            cohostABInfoLJII.liveMatchButtonOpt = true;
        }
        if (cohostABInfo.isCohostMultiguest) {
            cohostABInfoLJII.isCohostMultiguest = true;
        }
        if (cohostABInfo.isMatchPlaybookEnabled) {
            cohostABInfoLJII.isMatchPlaybookEnabled = true;
        }
        if (cohostABInfo.isCohostDuringMultiguestEnabled) {
            cohostABInfoLJII.isCohostDuringMultiguestEnabled = true;
        }
        if (cohostABInfo.isMatchPlaybookOptimisationEnabled) {
            cohostABInfoLJII.isMatchPlaybookOptimisationEnabled = true;
        }
        C915980Zwa.LJI().LJIIIZ().LIZJ(j, cohostABInfoLJII);
    }
}
