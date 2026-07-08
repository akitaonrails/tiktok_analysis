package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LangTranslate_ProtoDecoder implements C0IMD<LangTranslate> {
    public static LangTranslate LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LangTranslate langTranslate = new LangTranslate();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            langTranslate.defaultTranslate = C1516700pZU.LIZ(c1516680pZS);
                        }
                    } else {
                        langTranslate.translateResult = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    langTranslate.locale = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return langTranslate;
            }
        }
    }

    @Override // X.C0IMD
    public final LangTranslate LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(LangTranslate langTranslate) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LangTranslate langTranslate, List list) {
    }
}
