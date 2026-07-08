package com.bytedance.android.live.base.model.user;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _StretchableBackgroundImage_ProtoDecoder implements C0IMD<StretchableBackgroundImage> {
    public static StretchableBackgroundImage LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        StretchableBackgroundImage stretchableBackgroundImage = new StretchableBackgroundImage();
        stretchableBackgroundImage.flexSettings = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        stretchableBackgroundImage.flexSettings.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                    }
                } else {
                    stretchableBackgroundImage.image = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return stretchableBackgroundImage;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(StretchableBackgroundImage stretchableBackgroundImage) {
        StretchableBackgroundImage stretchableBackgroundImage2 = stretchableBackgroundImage;
        ImageModel imageModel = stretchableBackgroundImage2.image;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        if (stretchableBackgroundImage2.flexSettings == null) {
            stretchableBackgroundImage2.flexSettings = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final StretchableBackgroundImage LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, StretchableBackgroundImage stretchableBackgroundImage, List list) {
    }
}
