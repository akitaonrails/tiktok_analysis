package com.bytedance.android.live.broadcast.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ActivitiesIconInfo_ProtoDecoder implements C0IMD<ActivitiesIconInfo> {
    public static ActivitiesIconInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ActivitiesIconInfo activitiesIconInfo = new ActivitiesIconInfo();
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
                                    activitiesIconInfo.isLiveFest = C1516700pZU.LIZ(c1516680pZS);
                                }
                            } else {
                                activitiesIconInfo.currenPhase = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            activitiesIconInfo.abGroup = Long.valueOf(c1516680pZS.LJIIJJI());
                        }
                    } else {
                        activitiesIconInfo.iconImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    activitiesIconInfo.activityId = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return activitiesIconInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ActivitiesIconInfo activitiesIconInfo) {
        ImageModel imageModel = activitiesIconInfo.iconImage;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final ActivitiesIconInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ActivitiesIconInfo activitiesIconInfo, List list) {
    }
}
