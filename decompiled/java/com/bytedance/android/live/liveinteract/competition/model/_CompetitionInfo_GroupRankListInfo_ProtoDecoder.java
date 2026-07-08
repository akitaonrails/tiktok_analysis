package com.bytedance.android.live.liveinteract.competition.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CompetitionInfo_GroupRankListInfo_ProtoDecoder implements C0IMD<CompetitionInfo.GroupRankListInfo> {
    public static CompetitionInfo.GroupRankListInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CompetitionInfo.GroupRankListInfo groupRankListInfo = new CompetitionInfo.GroupRankListInfo();
        groupRankListInfo.memberRankInfo = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            groupRankListInfo.endTimestamp = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        groupRankListInfo.startTimestamp = c1516680pZS.LJIIJJI();
                    }
                } else {
                    groupRankListInfo.memberRankInfo.add(_MemberRankInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return groupRankListInfo;
            }
        }
    }

    public static void LJ(CompetitionInfo.GroupRankListInfo groupRankListInfo) {
        List<MemberRankInfo> list = groupRankListInfo.memberRankInfo;
        if (list == null) {
            groupRankListInfo.memberRankInfo = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<MemberRankInfo> it2 = groupRankListInfo.memberRankInfo.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CompetitionInfo.GroupRankListInfo groupRankListInfo) {
        LJ(groupRankListInfo);
    }

    @Override // X.C0IMD
    public final CompetitionInfo.GroupRankListInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CompetitionInfo.GroupRankListInfo groupRankListInfo, List list) {
    }
}
