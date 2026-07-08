package com.bytedance.android.live.base.model.user;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SeparatorConfig_ProtoDecoder implements C0IMD<SeparatorConfig> {
    public static SeparatorConfig LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SeparatorConfig separatorConfig = new SeparatorConfig();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    separatorConfig.color = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return separatorConfig;
            }
        }
    }

    @Override // X.C0IMD
    public final SeparatorConfig LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(SeparatorConfig separatorConfig) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SeparatorConfig separatorConfig, List list) {
    }
}
