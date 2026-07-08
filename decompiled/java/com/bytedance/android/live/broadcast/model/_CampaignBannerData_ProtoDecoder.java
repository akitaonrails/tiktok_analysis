package com.bytedance.android.live.broadcast.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CampaignBannerData_ProtoDecoder implements C0IMD<CampaignBannerData> {
    public static CampaignBannerData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CampaignBannerData campaignBannerData = new CampaignBannerData();
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
                                campaignBannerData.imageText = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            campaignBannerData.url = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        campaignBannerData.image = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    campaignBannerData.title = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return campaignBannerData;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CampaignBannerData campaignBannerData) {
        ImageModel imageModel = campaignBannerData.image;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final CampaignBannerData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CampaignBannerData campaignBannerData, List list) {
    }
}
