package com.bytedance.android.live.liveinteract.competition.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionReply;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionReplyResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class _CompetitionReplyResponse_ResponseData_ProtoDecoder implements C0IMD<CompetitionReplyResponse.ResponseData> {
    public static CompetitionReplyResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CompetitionReplyResponse.ResponseData responseData = new CompetitionReplyResponse.ResponseData();
        responseData.abInfos = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 100) {
                            if (iLJI != 101) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                responseData.beansBiz = _CompetitionReplyResponse_ResponseData_BeansBiz_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            responseData.takeTheStageBiz = _CompetitionReply_TakeTheStageBiz_ProtoDecoder.LIZLLL(c1516680pZS);
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
                                responseData.abInfos.put(lValueOf, competitionABInfoLIZLLL);
                            } else {
                                throw new IllegalStateException("Map value must not be null!");
                            }
                        } else {
                            throw new IllegalStateException("Map key must not be null!");
                        }
                    }
                } else {
                    responseData.bizCommon = _CompetitionCommon_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    public static void LJ(CompetitionReplyResponse.ResponseData responseData) {
        Map<Long, CompetitionABInfo> map = responseData.abInfos;
        if (map == null) {
            responseData.abInfos = new HashMap();
        } else if (!map.isEmpty()) {
            Iterator<Map.Entry<Long, CompetitionABInfo>> it2 = responseData.abInfos.entrySet().iterator();
            while (it2.hasNext()) {
                it2.next().getValue();
            }
        }
        CompetitionReply.TakeTheStageBiz takeTheStageBiz = responseData.takeTheStageBiz;
        if (takeTheStageBiz != null) {
            _CompetitionReply_TakeTheStageBiz_ProtoDecoder.LJ(takeTheStageBiz);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CompetitionReplyResponse.ResponseData responseData) {
        LJ(responseData);
    }

    @Override // X.C0IMD
    public final CompetitionReplyResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CompetitionReplyResponse.ResponseData responseData, List list) {
    }
}
