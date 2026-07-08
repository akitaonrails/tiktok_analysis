package com.bytedance.android.live.liveinteract.competition.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CompetitionContributorInfo_ProtoDecoder implements C0IMD<CompetitionContributorInfo> {
    public static CompetitionContributorInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CompetitionContributorInfo competitionContributorInfo = new CompetitionContributorInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            competitionContributorInfo.avatar = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        competitionContributorInfo.score = c1516680pZS.LJIIJJI();
                    }
                } else {
                    competitionContributorInfo.user = _CompetitionUserBase_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return competitionContributorInfo;
            }
        }
    }

    public static void LJ(CompetitionContributorInfo competitionContributorInfo) {
        CompetitionUserBase competitionUserBase = competitionContributorInfo.user;
        if (competitionUserBase != null) {
            _CompetitionUserBase_ProtoDecoder.LJ(competitionUserBase);
        }
        ImageModel imageModel = competitionContributorInfo.avatar;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CompetitionContributorInfo competitionContributorInfo) {
        LJ(competitionContributorInfo);
    }

    @Override // X.C0IMD
    public final CompetitionContributorInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CompetitionContributorInfo competitionContributorInfo, List list) {
    }
}
