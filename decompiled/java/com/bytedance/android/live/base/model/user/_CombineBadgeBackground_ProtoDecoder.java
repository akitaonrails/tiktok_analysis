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
public final class _CombineBadgeBackground_ProtoDecoder implements C0IMD<CombineBadgeBackground> {
    public static CombineBadgeBackground LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CombineBadgeBackground combineBadgeBackground = new CombineBadgeBackground();
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
                                    combineBadgeBackground.leftSideImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                combineBadgeBackground.stretchableBackgroundImage = _StretchableBackgroundImage_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            combineBadgeBackground.borderColorCode = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        combineBadgeBackground.backgroundColorCode = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    combineBadgeBackground.image = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return combineBadgeBackground;
            }
        }
    }

    public static void LJ(CombineBadgeBackground combineBadgeBackground) {
        ImageModel imageModel = combineBadgeBackground.image;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        StretchableBackgroundImage stretchableBackgroundImage = combineBadgeBackground.stretchableBackgroundImage;
        if (stretchableBackgroundImage != null) {
            ImageModel imageModel2 = stretchableBackgroundImage.image;
            if (imageModel2 != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel2);
            }
            if (stretchableBackgroundImage.flexSettings == null) {
                stretchableBackgroundImage.flexSettings = new ArrayList();
            }
        }
        ImageModel imageModel3 = combineBadgeBackground.leftSideImage;
        if (imageModel3 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel3);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CombineBadgeBackground combineBadgeBackground) {
        LJ(combineBadgeBackground);
    }

    @Override // X.C0IMD
    public final CombineBadgeBackground LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CombineBadgeBackground combineBadgeBackground, List list) {
    }
}
