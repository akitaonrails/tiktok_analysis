package com.bytedance.android.live.liveinteract.competition.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CompetitionTeamBase_ProtoDecoder implements C0IMD<CompetitionTeamBase> {
    public static CompetitionTeamBase LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CompetitionTeamBase competitionTeamBase = new CompetitionTeamBase();
        competitionTeamBase.users = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        competitionTeamBase.users.add(_CompetitionUserBase_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    competitionTeamBase.teamId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return competitionTeamBase;
            }
        }
    }

    public static void LJ(CompetitionTeamBase competitionTeamBase) {
        ImageModel imageModel;
        List<CompetitionUserBase> list = competitionTeamBase.users;
        if (list == null) {
            competitionTeamBase.users = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (CompetitionUserBase competitionUserBase : competitionTeamBase.users) {
            if (competitionUserBase != null && (imageModel = competitionUserBase.avatar) != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CompetitionTeamBase competitionTeamBase) {
        LJ(competitionTeamBase);
    }

    @Override // X.C0IMD
    public final CompetitionTeamBase LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CompetitionTeamBase competitionTeamBase, List list) {
    }
}
