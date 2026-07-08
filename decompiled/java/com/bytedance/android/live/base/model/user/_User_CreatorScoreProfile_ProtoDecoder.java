package com.bytedance.android.live.base.model.user;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user.User;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _User_CreatorScoreProfile_ProtoDecoder implements C0IMD<User.CreatorScoreProfile> {
    public static User.CreatorScoreProfile LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        User.CreatorScoreProfile creatorScoreProfile = new User.CreatorScoreProfile();
        creatorScoreProfile.scoreInfoExtra = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 3) {
                        if (iLJI != 4) {
                            if (iLJI != 5) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                long jLIZJ2 = c1516680pZS.LIZJ();
                                String strLIZLLL = null;
                                String strLIZLLL2 = null;
                                while (true) {
                                    int iLJI2 = c1516680pZS.LJI();
                                    if (iLJI2 == -1) {
                                        break;
                                    }
                                    if (iLJI2 != 1) {
                                        if (iLJI2 == 2) {
                                            strLIZLLL2 = C1516700pZU.LIZLLL(c1516680pZS);
                                        }
                                    } else {
                                        strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                                    }
                                }
                                c1516680pZS.LJ(jLIZJ2);
                                if (strLIZLLL != null) {
                                    if (strLIZLLL2 != null) {
                                        creatorScoreProfile.scoreInfoExtra.put(strLIZLLL, strLIZLLL2);
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        } else {
                            creatorScoreProfile.displayInfo = _User_CreatorScoreDisplayInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        creatorScoreProfile.countryCode = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    creatorScoreProfile.finalScore = Double.longBitsToDouble(c1516680pZS.LJIIIZ());
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return creatorScoreProfile;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(User.CreatorScoreProfile creatorScoreProfile) {
        User.CreatorScoreLabelInfo creatorScoreLabelInfo;
        User.CreatorScoreProfile creatorScoreProfile2 = creatorScoreProfile;
        User.CreatorScoreDisplayInfo creatorScoreDisplayInfo = creatorScoreProfile2.displayInfo;
        if (creatorScoreDisplayInfo != null && (creatorScoreLabelInfo = creatorScoreDisplayInfo.ecommerceEntranceLabel) != null) {
            ImageModel imageModel = creatorScoreLabelInfo.logoDark;
            if (imageModel != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel);
            }
            ImageModel imageModel2 = creatorScoreLabelInfo.logoLight;
            if (imageModel2 != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel2);
            }
        }
        if (creatorScoreProfile2.scoreInfoExtra == null) {
            creatorScoreProfile2.scoreInfoExtra = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final User.CreatorScoreProfile LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, User.CreatorScoreProfile creatorScoreProfile, List list) {
    }
}
