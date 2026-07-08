package com.bytedance.android.live.liveinteract.competition.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CompetitionUserBase_ProtoDecoder implements C0IMD<CompetitionUserBase> {
    public static CompetitionUserBase LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CompetitionUserBase competitionUserBase = new CompetitionUserBase();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        competitionUserBase.userId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        competitionUserBase.role = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        competitionUserBase.nickname = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        competitionUserBase.avatar = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        competitionUserBase.userIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        competitionUserBase.isEnigma = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return competitionUserBase;
            }
        }
    }

    public static void LJ(CompetitionUserBase competitionUserBase) {
        ImageModel imageModel = competitionUserBase.avatar;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CompetitionUserBase competitionUserBase) {
        ImageModel imageModel = competitionUserBase.avatar;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final CompetitionUserBase LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CompetitionUserBase competitionUserBase, List list) {
    }
}
