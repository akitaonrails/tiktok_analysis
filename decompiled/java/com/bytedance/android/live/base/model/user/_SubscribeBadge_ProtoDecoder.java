package com.bytedance.android.live.base.model.user;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _SubscribeBadge_ProtoDecoder implements C0IMD<SubscribeBadge> {
    public static SubscribeBadge LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SubscribeBadge subscribeBadge = new SubscribeBadge();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 3) {
                    if (iLJI != 4) {
                        if (iLJI != 5) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            subscribeBadge.isCustomized = C1516700pZU.LIZ(c1516680pZS);
                        }
                    } else {
                        subscribeBadge.previewImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    subscribeBadge.originImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return subscribeBadge;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(SubscribeBadge subscribeBadge) {
        SubscribeBadge subscribeBadge2 = subscribeBadge;
        ImageModel imageModel = subscribeBadge2.originImage;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        ImageModel imageModel2 = subscribeBadge2.previewImage;
        if (imageModel2 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
    }

    @Override // X.C0IMD
    public final SubscribeBadge LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SubscribeBadge subscribeBadge, List list) {
    }
}
