package com.bytedance.android.live.liveinteract.competition.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionReply;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class _CompetitionReply_ProtoDecoder implements C0IMD<CompetitionReply> {
    public static CompetitionReply LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CompetitionReply competitionReply = new CompetitionReply();
        competitionReply.abInfo = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    if (iLJI != 100) {
                                        if (iLJI != 101) {
                                            C1516700pZU.LJ(c1516680pZS);
                                        } else {
                                            competitionReply.beansBiz = _CompetitionReply_BeansBiz_ProtoDecoder.LIZLLL(c1516680pZS);
                                        }
                                    } else {
                                        competitionReply.takeTheStageBiz = _CompetitionReply_TakeTheStageBiz_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    competitionReply.replySource = c1516680pZS.LJIIJ();
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
                                        competitionReply.abInfo.put(lValueOf, competitionABInfoLIZLLL);
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        } else {
                            competitionReply.initiate = _CompetitionInitiate_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        competitionReply.replier = _CompetitionUserBase_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    competitionReply.replyType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return competitionReply;
            }
        }
    }

    public static void LJ(CompetitionReply competitionReply) {
        CompetitionUserBase competitionUserBase = competitionReply.replier;
        if (competitionUserBase != null) {
            _CompetitionUserBase_ProtoDecoder.LJ(competitionUserBase);
        }
        CompetitionInitiate competitionInitiate = competitionReply.initiate;
        if (competitionInitiate != null) {
            _CompetitionInitiate_ProtoDecoder.LJ(competitionInitiate);
        }
        Map<Long, CompetitionABInfo> map = competitionReply.abInfo;
        if (map == null) {
            competitionReply.abInfo = new HashMap();
        } else if (!map.isEmpty()) {
            Iterator<Map.Entry<Long, CompetitionABInfo>> it2 = competitionReply.abInfo.entrySet().iterator();
            while (it2.hasNext()) {
                it2.next().getValue();
            }
        }
        CompetitionReply.TakeTheStageBiz takeTheStageBiz = competitionReply.takeTheStageBiz;
        if (takeTheStageBiz != null) {
            _CompetitionReply_TakeTheStageBiz_ProtoDecoder.LJ(takeTheStageBiz);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CompetitionReply competitionReply) {
        LJ(competitionReply);
    }

    @Override // X.C0IMD
    public final CompetitionReply LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CompetitionReply competitionReply, List list) {
    }
}
