package com.bytedance.android.live.liveinteract.competition.api;

import X.C09SO;
import X.C11NZ;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;
import com.bytedance.android.live.liveinteract.competition.model.BeansSpawnBombParams;
import com.bytedance.android.live.liveinteract.competition.model.BeansSpawnBombResponse;
import com.bytedance.android.live.liveinteract.competition.model.BeansUpdateScoreParams;
import com.bytedance.android.live.liveinteract.competition.model.BeansUpdateScoreResponse;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionFinishParams;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionFinishResponse;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionInfo;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionInfoParams;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionInitiateParams;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionInitiateResponse;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionLeaveParams;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionLeaveResponse;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionReplyParams;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionReplyResponse;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionSettlementEndParams;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionSettlementEndResponse;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionSettlementStartParams;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionSettlementStartResponse;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionSwitchTurnParams;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionSwitchTurnResponse;

/* JADX INFO: loaded from: classes16.dex */
public interface CompetitionApi {
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/competition/finish/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    C11NZ<C470590Icr<CompetitionFinishResponse.ResponseData>> competitionFinish(@InterfaceC1485405rg CompetitionFinishParams competitionFinishParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/competition/info/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    C11NZ<C470590Icr<CompetitionInfo>> competitionInfo(@InterfaceC1485405rg CompetitionInfoParams competitionInfoParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/competition/initiate/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    C11NZ<C470590Icr<CompetitionInitiateResponse.ResponseData>> competitionInitiate(@InterfaceC1485405rg CompetitionInitiateParams competitionInitiateParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/competition/leave/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    C11NZ<C470590Icr<CompetitionLeaveResponse.ResponseData>> competitionLeave(@InterfaceC1485405rg CompetitionLeaveParams competitionLeaveParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/competition/reply/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    C11NZ<C470590Icr<CompetitionReplyResponse.ResponseData>> competitionReply(@InterfaceC1485405rg CompetitionReplyParams competitionReplyParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/competition/settlement_end/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    C11NZ<C470590Icr<CompetitionSettlementEndResponse.ResponseData>> competitionSettlementEnd(@InterfaceC1485405rg CompetitionSettlementEndParams competitionSettlementEndParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/competition/settlement_start/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    C11NZ<C470590Icr<CompetitionSettlementStartResponse.ResponseData>> competitionSettlementStart(@InterfaceC1485405rg CompetitionSettlementStartParams competitionSettlementStartParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/competition/spawn_bomb/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    C11NZ<C470590Icr<BeansSpawnBombResponse>> spawnBomb(@InterfaceC1485405rg BeansSpawnBombParams beansSpawnBombParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/competition/switch_turn/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    C11NZ<C470590Icr<CompetitionSwitchTurnResponse.ResponseData>> switchTurn(@InterfaceC1485405rg CompetitionSwitchTurnParams competitionSwitchTurnParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/competition/update_score/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    C11NZ<C470590Icr<BeansUpdateScoreResponse>> updateScore(@InterfaceC1485405rg BeansUpdateScoreParams beansUpdateScoreParams);
}
