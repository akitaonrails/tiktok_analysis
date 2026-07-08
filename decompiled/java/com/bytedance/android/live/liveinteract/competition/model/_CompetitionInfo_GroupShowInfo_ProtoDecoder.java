package com.bytedance.android.live.liveinteract.competition.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionInfo;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CompetitionInfo_GroupShowInfo_ProtoDecoder implements C0IMD<CompetitionInfo.GroupShowInfo> {
    public static CompetitionInfo.GroupShowInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CompetitionInfo.GroupShowInfo groupShowInfo = new CompetitionInfo.GroupShowInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                groupShowInfo.startTimestamp = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            groupShowInfo.actualEndTimestamp = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        groupShowInfo.endTimestamp = c1516680pZS.LJIIJJI();
                    }
                } else {
                    groupShowInfo.status = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return groupShowInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final CompetitionInfo.GroupShowInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(CompetitionInfo.GroupShowInfo groupShowInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CompetitionInfo.GroupShowInfo groupShowInfo, List list) {
    }
}
