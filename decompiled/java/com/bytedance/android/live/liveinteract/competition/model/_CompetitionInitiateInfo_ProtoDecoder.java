package com.bytedance.android.live.liveinteract.competition.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionInitiateInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class _CompetitionInitiateInfo_ProtoDecoder implements C0IMD<CompetitionInitiateInfo> {
    public static CompetitionInitiateInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CompetitionInitiateInfo competitionInitiateInfo = new CompetitionInitiateInfo();
        competitionInitiateInfo.teams = new ArrayList();
        competitionInitiateInfo.abInfos = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 100) {
                                    if (iLJI != 101) {
                                        C1516700pZU.LJ(c1516680pZS);
                                    } else {
                                        competitionInitiateInfo.beansBiz = _CompetitionInitiateInfo_BeansBiz_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    competitionInitiateInfo.takeTheStageBiz = _CompetitionInitiateInfo_TakeTheStageBiz_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                long jLIZJ2 = c1516680pZS.LIZJ();
                                Long lValueOf = null;
                                CompetitionABInfo competitionABInfoLIZLLL = null;
                                while (true) {
                                    int iLJI2 = c1516680pZS.LJI();
                                    if (iLJI2 == -1) {
                                        break;
                                    }
                                    if (iLJI2 != 1) {
                                        if (iLJI2 == 2) {
                                            competitionABInfoLIZLLL = _CompetitionABInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                        }
                                    } else {
                                        lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                    }
                                }
                                c1516680pZS.LJ(jLIZJ2);
                                if (lValueOf != null) {
                                    if (competitionABInfoLIZLLL != null) {
                                        competitionInitiateInfo.abInfos.put(lValueOf, competitionABInfoLIZLLL);
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        } else {
                            competitionInitiateInfo.teams.add(_CompetitionTeamBase_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        competitionInitiateInfo.initiateType = c1516680pZS.LJIIJ();
                    }
                } else {
                    competitionInitiateInfo.initiator = _CompetitionUserBase_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return competitionInitiateInfo;
            }
        }
    }

    public static void LJ(CompetitionInitiateInfo competitionInitiateInfo) {
        CompetitionUserBase competitionUserBase = competitionInitiateInfo.initiator;
        if (competitionUserBase != null) {
            _CompetitionUserBase_ProtoDecoder.LJ(competitionUserBase);
        }
        List<CompetitionTeamBase> list = competitionInitiateInfo.teams;
        if (list == null) {
            competitionInitiateInfo.teams = new ArrayList();
        } else if (!list.isEmpty()) {
            for (CompetitionTeamBase competitionTeamBase : competitionInitiateInfo.teams) {
                if (competitionTeamBase != null) {
                    _CompetitionTeamBase_ProtoDecoder.LJ(competitionTeamBase);
                }
            }
        }
        Map<Long, CompetitionABInfo> map = competitionInitiateInfo.abInfos;
        if (map == null) {
            competitionInitiateInfo.abInfos = new HashMap();
        } else if (!map.isEmpty()) {
            Iterator<Map.Entry<Long, CompetitionABInfo>> it2 = competitionInitiateInfo.abInfos.entrySet().iterator();
            while (it2.hasNext()) {
                it2.next().getValue();
            }
        }
        CompetitionInitiateInfo.TakeTheStageBiz takeTheStageBiz = competitionInitiateInfo.takeTheStageBiz;
        if (takeTheStageBiz != null) {
            _CompetitionInitiateInfo_TakeTheStageBiz_ProtoDecoder.LJ(takeTheStageBiz);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CompetitionInitiateInfo competitionInitiateInfo) {
        LJ(competitionInitiateInfo);
    }

    @Override // X.C0IMD
    public final CompetitionInitiateInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CompetitionInitiateInfo competitionInitiateInfo, List list) {
    }
}
