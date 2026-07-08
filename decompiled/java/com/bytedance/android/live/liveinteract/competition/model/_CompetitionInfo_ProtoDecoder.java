package com.bytedance.android.live.liveinteract.competition.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionInfo;
import com.bytedance.android.live.liveinteract.competition.model.TakeTheStageInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleBonusConfig;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleBonusStatus;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleComboInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleEffectInfos;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattlePrompt;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTask;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleBonusConfig_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleComboInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleEffectInfos_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattlePrompt_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleTask_ProtoDecoder;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class _CompetitionInfo_ProtoDecoder implements C0IMD<CompetitionInfo> {
    public static CompetitionInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CompetitionInfo competitionInfo = new CompetitionInfo();
        competitionInfo.teamInfos = new ArrayList();
        competitionInfo.abInfos = new HashMap();
        competitionInfo.comboInfoMap = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        Object objLIZLLL = null;
                        if (iLJI != 4) {
                            if (iLJI != 5) {
                                if (iLJI != 6) {
                                    switch (iLJI) {
                                        case BaseNotice.RECOMMEND_LIVE /* 50 */:
                                            competitionInfo.effectInfos = _BattleEffectInfos_ProtoDecoder.LIZLLL(c1516680pZS);
                                            break;
                                        case 51:
                                            competitionInfo.gameplayOption = c1516680pZS.LJIIJ();
                                            break;
                                        case 52:
                                            long jLIZJ2 = c1516680pZS.LIZJ();
                                            BattleComboInfo battleComboInfoLIZLLL = null;
                                            while (true) {
                                                int iLJI2 = c1516680pZS.LJI();
                                                if (iLJI2 != -1) {
                                                    if (iLJI2 != 1) {
                                                        if (iLJI2 == 2) {
                                                            battleComboInfoLIZLLL = _BattleComboInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                                        }
                                                    } else {
                                                        objLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                                                    }
                                                } else {
                                                    c1516680pZS.LJ(jLIZJ2);
                                                    if (objLIZLLL != null) {
                                                        if (battleComboInfoLIZLLL != null) {
                                                            competitionInfo.comboInfoMap.put((String) objLIZLLL, battleComboInfoLIZLLL);
                                                        } else {
                                                            throw new IllegalStateException("Map value must not be null!");
                                                        }
                                                    } else {
                                                        throw new IllegalStateException("Map key must not be null!");
                                                    }
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            switch (iLJI) {
                                                case 100:
                                                    competitionInfo.takeTheStageInfo = _TakeTheStageInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                                    break;
                                                case 101:
                                                    competitionInfo.groupShowInfo = _CompetitionInfo_GroupShowInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                                    break;
                                                case 102:
                                                    competitionInfo.beansInfo = _BeansInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                                    break;
                                                case 103:
                                                    competitionInfo.groupRankListInfo = _CompetitionInfo_GroupRankListInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                                    break;
                                                default:
                                                    C1516700pZU.LJ(c1516680pZS);
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    competitionInfo.mvpUserId = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                competitionInfo.battleTask = _BattleTask_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            long jLIZJ3 = c1516680pZS.LIZJ();
                            CompetitionABInfo competitionABInfoLIZLLL = null;
                            while (true) {
                                int iLJI3 = c1516680pZS.LJI();
                                if (iLJI3 != -1) {
                                    if (iLJI3 != 1) {
                                        if (iLJI3 == 2) {
                                            competitionABInfoLIZLLL = _CompetitionABInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                        }
                                    } else {
                                        objLIZLLL = Long.valueOf(c1516680pZS.LJIIJJI());
                                    }
                                } else {
                                    c1516680pZS.LJ(jLIZJ3);
                                    if (objLIZLLL != null) {
                                        if (competitionABInfoLIZLLL != null) {
                                            competitionInfo.abInfos.put((Long) objLIZLLL, competitionABInfoLIZLLL);
                                        } else {
                                            throw new IllegalStateException("Map value must not be null!");
                                        }
                                    } else {
                                        throw new IllegalStateException("Map key must not be null!");
                                    }
                                }
                            }
                        }
                    } else {
                        competitionInfo.teamInfos.add(_CompetitionResultsTeamInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    competitionInfo.bizCommon = _CompetitionCommon_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return competitionInfo;
            }
        }
    }

    public static void LJ(CompetitionInfo competitionInfo) {
        TakeTheStageOrderInfo takeTheStageOrderInfo;
        List<CompetitionResultsTeamInfo> list = competitionInfo.teamInfos;
        if (list == null) {
            competitionInfo.teamInfos = new ArrayList();
        } else if (!list.isEmpty()) {
            for (CompetitionResultsTeamInfo competitionResultsTeamInfo : competitionInfo.teamInfos) {
                if (competitionResultsTeamInfo != null) {
                    _CompetitionResultsTeamInfo_ProtoDecoder.LJ(competitionResultsTeamInfo);
                }
            }
        }
        Map<Long, CompetitionABInfo> map = competitionInfo.abInfos;
        if (map == null) {
            competitionInfo.abInfos = new HashMap();
        } else if (!map.isEmpty()) {
            Iterator<Map.Entry<Long, CompetitionABInfo>> it2 = competitionInfo.abInfos.entrySet().iterator();
            while (it2.hasNext()) {
                it2.next().getValue();
            }
        }
        BattleTask battleTask = competitionInfo.battleTask;
        if (battleTask != null) {
            BattleBonusConfig battleBonusConfig = battleTask.battleBonusConfig;
            if (battleBonusConfig != null) {
                _BattleBonusConfig_ProtoDecoder.LJ(battleBonusConfig);
            }
            BattleBonusStatus battleBonusStatus = battleTask.battleBonusStatus;
            if (battleBonusStatus != null) {
                BattlePrompt battlePrompt = battleBonusStatus.enterRoomPrompt;
                if (battlePrompt != null) {
                    _BattlePrompt_ProtoDecoder.LJ(battlePrompt);
                }
                BattlePrompt battlePrompt2 = battleBonusStatus.rewardSettlePrompt;
                if (battlePrompt2 != null) {
                    _BattlePrompt_ProtoDecoder.LJ(battlePrompt2);
                }
            }
        }
        BattleEffectInfos battleEffectInfos = competitionInfo.effectInfos;
        if (battleEffectInfos != null) {
            _BattleEffectInfos_ProtoDecoder.LJ(battleEffectInfos);
        }
        Map<String, BattleComboInfo> map2 = competitionInfo.comboInfoMap;
        if (map2 == null) {
            competitionInfo.comboInfoMap = new HashMap();
        } else if (!map2.isEmpty()) {
            Iterator<Map.Entry<String, BattleComboInfo>> it3 = competitionInfo.comboInfoMap.entrySet().iterator();
            while (it3.hasNext()) {
                it3.next().getValue();
            }
        }
        TakeTheStageInfo takeTheStageInfo = competitionInfo.takeTheStageInfo;
        if (takeTheStageInfo != null) {
            if (takeTheStageInfo.defaultOrders == null) {
                takeTheStageInfo.defaultOrders = new HashMap();
            }
            TakeTheStageInfo.StartedInfo startedInfo = takeTheStageInfo.startedInfo;
            if (startedInfo != null && (takeTheStageOrderInfo = startedInfo.orderInfo) != null) {
                _TakeTheStageOrderInfo_ProtoDecoder.LJ(takeTheStageOrderInfo);
            }
        }
        CompetitionInfo.GroupRankListInfo groupRankListInfo = competitionInfo.groupRankListInfo;
        if (groupRankListInfo != null) {
            _CompetitionInfo_GroupRankListInfo_ProtoDecoder.LJ(groupRankListInfo);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CompetitionInfo competitionInfo) {
        LJ(competitionInfo);
    }

    @Override // X.C0IMD
    public final CompetitionInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CompetitionInfo competitionInfo, List list) {
    }
}
