package com.bytedance.android.live.base.model.user;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _IconConfig_ProtoDecoder implements C0IMD<IconConfig> {
    public static IconConfig LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        IconConfig iconConfig = new IconConfig();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        iconConfig.background = _CombineBadgeBackground_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    iconConfig.icon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return iconConfig;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(IconConfig iconConfig) {
        IconConfig iconConfig2 = iconConfig;
        ImageModel imageModel = iconConfig2.icon;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        CombineBadgeBackground combineBadgeBackground = iconConfig2.background;
        if (combineBadgeBackground != null) {
            _CombineBadgeBackground_ProtoDecoder.LJ(combineBadgeBackground);
        }
    }

    @Override // X.C0IMD
    public final IconConfig LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, IconConfig iconConfig, List list) {
    }
}
