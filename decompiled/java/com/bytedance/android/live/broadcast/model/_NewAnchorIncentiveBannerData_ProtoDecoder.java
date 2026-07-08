package com.bytedance.android.live.broadcast.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _NewAnchorIncentiveBannerData_ProtoDecoder implements C0IMD<NewAnchorIncentiveBannerData> {
    public static NewAnchorIncentiveBannerData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        NewAnchorIncentiveBannerData newAnchorIncentiveBannerData = new NewAnchorIncentiveBannerData();
        newAnchorIncentiveBannerData.metricsMap = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        newAnchorIncentiveBannerData.title = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        newAnchorIncentiveBannerData.subTitle = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        newAnchorIncentiveBannerData.image = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        newAnchorIncentiveBannerData.url = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        String strLIZLLL = null;
                        String strLIZLLL2 = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 != -1) {
                                if (iLJI2 != 1) {
                                    if (iLJI2 == 2) {
                                        strLIZLLL2 = C1516700pZU.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ2);
                                if (strLIZLLL != null) {
                                    if (strLIZLLL2 != null) {
                                        newAnchorIncentiveBannerData.metricsMap.put(strLIZLLL, strLIZLLL2);
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                                break;
                            }
                        }
                        break;
                    case 6:
                        newAnchorIncentiveBannerData.subType = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return newAnchorIncentiveBannerData;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(NewAnchorIncentiveBannerData newAnchorIncentiveBannerData) {
        NewAnchorIncentiveBannerData newAnchorIncentiveBannerData2 = newAnchorIncentiveBannerData;
        ImageModel imageModel = newAnchorIncentiveBannerData2.image;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        if (newAnchorIncentiveBannerData2.metricsMap == null) {
            newAnchorIncentiveBannerData2.metricsMap = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final NewAnchorIncentiveBannerData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, NewAnchorIncentiveBannerData newAnchorIncentiveBannerData, List list) {
    }
}
