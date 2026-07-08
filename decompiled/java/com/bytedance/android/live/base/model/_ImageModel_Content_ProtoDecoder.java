package com.bytedance.android.live.base.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ImageModel_Content_ProtoDecoder implements C0IMD<ImageModel.Content> {
    public static ImageModel.Content LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ImageModel.Content content = new ImageModel.Content();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            content.level = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        content.fontColor = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    content.name = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return content;
            }
        }
    }

    @Override // X.C0IMD
    public final ImageModel.Content LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(ImageModel.Content content) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ImageModel.Content content, List list) {
    }
}
