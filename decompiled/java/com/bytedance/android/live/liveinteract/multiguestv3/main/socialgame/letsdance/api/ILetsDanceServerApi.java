package com.bytedance.android.live.liveinteract.multiguestv3.main.socialgame.letsdance.api;

import X.C09SO;
import X.C11NZ;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;
import com.bytedance.android.live.liveinteract.multilive.social.model.GameFinishReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.GameFinishResp;
import com.bytedance.android.live.liveinteract.multilive.social.model.GameQuitReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.GameQuitResp;
import com.bytedance.android.live.liveinteract.multilive.social.model.GameStartReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.GameStartResp;
import com.bytedance.android.live.liveinteract.multilive.social.model.GameUserEnlargeReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.GameUserEnlargeResp;
import com.bytedance.android.live.liveinteract.multilive.social.model.GameUserJoinReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.GameUserJoinResp;
import com.bytedance.android.live.liveinteract.multilive.social.model.GameUserQuitReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.GameUserQuitResp;
import com.bytedance.android.live.liveinteract.multilive.social.model.GameUserScoreReportReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.GameUserScoreReportResp;

/* JADX INFO: loaded from: classes16.dex */
public interface ILetsDanceServerApi {
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_social/game_finish/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    C11NZ<C470590Icr<GameFinishResp.ResponseData>> finishGame(@InterfaceC1485405rg GameFinishReq gameFinishReq);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_social/game_quit/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    C11NZ<C470590Icr<GameQuitResp.ResponseData>> quitGame(@InterfaceC1485405rg GameQuitReq gameQuitReq);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_social/game_user_score_report/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    C11NZ<C470590Icr<GameUserScoreReportResp.ResponseData>> reportUserScore(@InterfaceC1485405rg GameUserScoreReportReq gameUserScoreReportReq);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_social/game_start/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    C11NZ<C470590Icr<GameStartResp.ResponseData>> startGame(@InterfaceC1485405rg GameStartReq gameStartReq);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_social/game_user_enlarge/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    C11NZ<C470590Icr<GameUserEnlargeResp.ResponseData>> userEnlarge(@InterfaceC1485405rg GameUserEnlargeReq gameUserEnlargeReq);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_social/game_user_join/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    C11NZ<C470590Icr<GameUserJoinResp.ResponseData>> userJoinGame(@InterfaceC1485405rg GameUserJoinReq gameUserJoinReq);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_social/game_user_quit/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    C11NZ<C470590Icr<GameUserQuitResp.ResponseData>> userQuitGame(@InterfaceC1485405rg GameUserQuitReq gameUserQuitReq);
}
