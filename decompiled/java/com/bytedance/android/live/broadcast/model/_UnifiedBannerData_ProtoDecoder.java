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
public final class _UnifiedBannerData_ProtoDecoder implements C0IMD<UnifiedBannerData> {
    public static UnifiedBannerData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        UnifiedBannerData unifiedBannerData = new UnifiedBannerData();
        unifiedBannerData.metrics = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 3) {
                        if (iLJI != 4) {
                            if (iLJI != 5) {
                                if (iLJI != 6) {
                                    if (iLJI != 7) {
                                        C1516700pZU.LJ(c1516680pZS);
                                    } else {
                                        unifiedBannerData.frequencyKey = C1516700pZU.LIZLLL(c1516680pZS);
                                    }
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
                                            unifiedBannerData.metrics.put(strLIZLLL, strLIZLLL2);
                                        } else {
                                            throw new IllegalStateException("Map value must not be null!");
                                        }
                                    } else {
                                        throw new IllegalStateException("Map key must not be null!");
                                    }
                                }
                            } else {
                                unifiedBannerData.schema = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            unifiedBannerData.image = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        unifiedBannerData.subTitle = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    unifiedBannerData.title = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return unifiedBannerData;
            }
        }
    }

    public static void LJ(UnifiedBannerData unifiedBannerData) {
        ImageModel imageModel = unifiedBannerData.image;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        if (unifiedBannerData.metrics == null) {
            unifiedBannerData.metrics = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(UnifiedBannerData unifiedBannerData) {
        LJ(unifiedBannerData);
    }

    @Override // X.C0IMD
    public final UnifiedBannerData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UnifiedBannerData unifiedBannerData, List list) {
    }
}
