package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _StarlingTranslateInfo_ProtoDecoder implements C0IMD<StarlingTranslateInfo> {
    public static StarlingTranslateInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        StarlingTranslateInfo starlingTranslateInfo = new StarlingTranslateInfo();
        starlingTranslateInfo.langTranslate = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        starlingTranslateInfo.langTranslate.add(_LangTranslate_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    starlingTranslateInfo.starlingKey = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return starlingTranslateInfo;
            }
        }
    }

    public static void LJ(StarlingTranslateInfo starlingTranslateInfo) {
        List<LangTranslate> list = starlingTranslateInfo.langTranslate;
        if (list == null) {
            starlingTranslateInfo.langTranslate = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<LangTranslate> it2 = starlingTranslateInfo.langTranslate.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(StarlingTranslateInfo starlingTranslateInfo) {
        LJ(starlingTranslateInfo);
    }

    @Override // X.C0IMD
    public final StarlingTranslateInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, StarlingTranslateInfo starlingTranslateInfo, List list) {
    }
}
