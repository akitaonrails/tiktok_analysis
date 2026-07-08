package com.bytedance.android.live.broadcast.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RoomCreateInfo_ViewerWishesIconInfo_ProtoDecoder implements C0IMD<RoomCreateInfo.ViewerWishesIconInfo> {
    public static RoomCreateInfo.ViewerWishesIconInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RoomCreateInfo.ViewerWishesIconInfo viewerWishesIconInfo = new RoomCreateInfo.ViewerWishesIconInfo();
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
                                viewerWishesIconInfo.autoStart = C1516700pZU.LIZ(c1516680pZS);
                            }
                        } else {
                            viewerWishesIconInfo.activeInMusicCampaign = C1516700pZU.LIZ(c1516680pZS);
                        }
                    } else {
                        viewerWishesIconInfo.hasUnavailableGifts = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    viewerWishesIconInfo.displayViewerWishesIcon = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return viewerWishesIconInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final RoomCreateInfo.ViewerWishesIconInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(RoomCreateInfo.ViewerWishesIconInfo viewerWishesIconInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RoomCreateInfo.ViewerWishesIconInfo viewerWishesIconInfo, List list) {
    }
}
