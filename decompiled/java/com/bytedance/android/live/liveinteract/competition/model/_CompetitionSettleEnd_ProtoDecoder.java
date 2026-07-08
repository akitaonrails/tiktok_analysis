package com.bytedance.android.live.liveinteract.competition.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleComboInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.MatchPunishExtraInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleComboInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._MatchPunishExtraInfo_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class _CompetitionSettleEnd_ProtoDecoder implements C0IMD<CompetitionSettleEnd> {
    public static CompetitionSettleEnd LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CompetitionSettleEnd competitionSettleEnd = new CompetitionSettleEnd();
        competitionSettleEnd.teamInfos = new ArrayList();
        competitionSettleEnd.comboInfoMap = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 52) {
                    if (iLJI != 100) {
                        switch (iLJI) {
                            case 1:
                                competitionSettleEnd.plannedFinishTime = c1516680pZS.LJIIJJI();
                                break;
                            case 2:
                                competitionSettleEnd.teamInfos.add(_CompetitionResultsTeamInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                                break;
                            case 3:
                                competitionSettleEnd.leaveUser = _CompetitionUserBase_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 4:
                                competitionSettleEnd.reason = c1516680pZS.LJIIJ();
                                break;
                            case 5:
                                competitionSettleEnd.matchPunishExtraInfo = _MatchPunishExtraInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 6:
                                competitionSettleEnd.mvpUserId = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            default:
                                C1516700pZU.LJ(c1516680pZS);
                                break;
                        }
                    } else {
                        competitionSettleEnd.takeTheStageBiz = _CompetitionSettleEnd_TakeTheStageBiz_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    long jLIZJ2 = c1516680pZS.LIZJ();
                    String strLIZLLL = null;
                    BattleComboInfo battleComboInfoLIZLLL = null;
                    while (true) {
                        int iLJI2 = c1516680pZS.LJI();
                        if (iLJI2 != -1) {
                            if (iLJI2 != 1) {
                                if (iLJI2 == 2) {
                                    battleComboInfoLIZLLL = _BattleComboInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            c1516680pZS.LJ(jLIZJ2);
                            if (strLIZLLL != null) {
                                if (battleComboInfoLIZLLL != null) {
                                    competitionSettleEnd.comboInfoMap.put(strLIZLLL, battleComboInfoLIZLLL);
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
                c1516680pZS.LJ(jLIZJ);
                return competitionSettleEnd;
            }
        }
    }

    public static void LJ(CompetitionSettleEnd competitionSettleEnd) {
        List<CompetitionResultsTeamInfo> list = competitionSettleEnd.teamInfos;
        if (list == null) {
            competitionSettleEnd.teamInfos = new ArrayList();
        } else if (!list.isEmpty()) {
            for (CompetitionResultsTeamInfo competitionResultsTeamInfo : competitionSettleEnd.teamInfos) {
                if (competitionResultsTeamInfo != null) {
                    _CompetitionResultsTeamInfo_ProtoDecoder.LJ(competitionResultsTeamInfo);
                }
            }
        }
        CompetitionUserBase competitionUserBase = competitionSettleEnd.leaveUser;
        if (competitionUserBase != null) {
            _CompetitionUserBase_ProtoDecoder.LJ(competitionUserBase);
        }
        MatchPunishExtraInfo matchPunishExtraInfo = competitionSettleEnd.matchPunishExtraInfo;
        if (matchPunishExtraInfo != null) {
            _MatchPunishExtraInfo_ProtoDecoder.LJ(matchPunishExtraInfo);
        }
        Map<String, BattleComboInfo> map = competitionSettleEnd.comboInfoMap;
        if (map == null) {
            competitionSettleEnd.comboInfoMap = new HashMap();
        } else {
            if (map.isEmpty()) {
                return;
            }
            Iterator<Map.Entry<String, BattleComboInfo>> it2 = competitionSettleEnd.comboInfoMap.entrySet().iterator();
            while (it2.hasNext()) {
                it2.next().getValue();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CompetitionSettleEnd competitionSettleEnd) {
        LJ(competitionSettleEnd);
    }

    @Override // X.C0IMD
    public final CompetitionSettleEnd LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CompetitionSettleEnd competitionSettleEnd, List list) {
    }
}
