package com.bytedance.android.live.base.model.user;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LabelConfig_ProtoDecoder implements C0IMD<LabelConfig> {
    public static LabelConfig LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LabelConfig labelConfig = new LabelConfig();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            labelConfig.background = _CombineBadgeBackground_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        labelConfig.fontStyle = _FontStyle_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    labelConfig.label = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return labelConfig;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LabelConfig labelConfig) {
        CombineBadgeBackground combineBadgeBackground = labelConfig.background;
        if (combineBadgeBackground != null) {
            _CombineBadgeBackground_ProtoDecoder.LJ(combineBadgeBackground);
        }
    }

    @Override // X.C0IMD
    public final LabelConfig LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LabelConfig labelConfig, List list) {
    }
}
