package com.bytedance.android.live.liveinteract.competition.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CompetitionInitiate_ProtoDecoder implements C0IMD<CompetitionInitiate> {
    public static CompetitionInitiate LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CompetitionInitiate competitionInitiate = new CompetitionInitiate();
        competitionInitiate.giftPermissions = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        Long lValueOf = null;
                        Integer numValueOf = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 == -1) {
                                break;
                            }
                            if (iLJI2 != 1) {
                                if (iLJI2 == 2) {
                                    numValueOf = Integer.valueOf(c1516680pZS.LJIIJ());
                                }
                            } else {
                                lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                            }
                        }
                        c1516680pZS.LJ(jLIZJ2);
                        if (lValueOf != null) {
                            if (numValueOf != null) {
                                competitionInitiate.giftPermissions.put(lValueOf, numValueOf);
                            } else {
                                throw new IllegalStateException("Map value must not be null!");
                            }
                        } else {
                            throw new IllegalStateException("Map key must not be null!");
                        }
                    }
                } else {
                    competitionInitiate.initiateInfo = _CompetitionInitiateInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return competitionInitiate;
            }
        }
    }

    public static void LJ(CompetitionInitiate competitionInitiate) {
        CompetitionInitiateInfo competitionInitiateInfo = competitionInitiate.initiateInfo;
        if (competitionInitiateInfo != null) {
            _CompetitionInitiateInfo_ProtoDecoder.LJ(competitionInitiateInfo);
        }
        if (competitionInitiate.giftPermissions == null) {
            competitionInitiate.giftPermissions = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CompetitionInitiate competitionInitiate) {
        LJ(competitionInitiate);
    }

    @Override // X.C0IMD
    public final CompetitionInitiate LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CompetitionInitiate competitionInitiate, List list) {
    }
}
