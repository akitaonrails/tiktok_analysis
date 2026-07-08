package com.bytedance.android.live.base.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ImageModel_ProtoDecoder implements C0IMD<ImageModel> {
    public static ImageModel LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ImageModel imageModel = new ImageModel();
        imageModel.mUrls = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        imageModel.mUrls.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case 2:
                        imageModel.mUri = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        imageModel.height = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        imageModel.width = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        imageModel.avgColor = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        imageModel.imageType = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        imageModel.schema = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        imageModel.content = _ImageModel_Content_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        imageModel.isAnimated = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return imageModel;
            }
        }
    }

    public static void LJ(ImageModel imageModel) {
        if (imageModel.mUrls == null) {
            imageModel.mUrls = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ImageModel imageModel) {
        LJ(imageModel);
    }

    @Override // X.C0IMD
    public final ImageModel LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ImageModel imageModel, List list) {
    }
}
