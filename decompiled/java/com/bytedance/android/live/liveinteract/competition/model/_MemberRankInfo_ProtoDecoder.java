package com.bytedance.android.live.liveinteract.competition.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MemberRankInfo_ProtoDecoder implements C0IMD<MemberRankInfo> {
    public static MemberRankInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MemberRankInfo memberRankInfo = new MemberRankInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    memberRankInfo.userIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                memberRankInfo.points = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            memberRankInfo.rank = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        memberRankInfo.state = c1516680pZS.LJIIJ();
                    }
                } else {
                    memberRankInfo.userId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return memberRankInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final MemberRankInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(MemberRankInfo memberRankInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MemberRankInfo memberRankInfo, List list) {
    }
}
