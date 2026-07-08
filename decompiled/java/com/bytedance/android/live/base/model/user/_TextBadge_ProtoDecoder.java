package com.bytedance.android.live.base.model.user;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TextBadge_ProtoDecoder implements C0IMD<TextBadge> {
    public static TextBadge LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TextBadge textBadge = new TextBadge();
        textBadge.pieces = new ArrayList();
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
                                textBadge.pieces.add(C1516700pZU.LIZLLL(c1516680pZS));
                            }
                        } else {
                            textBadge.defaultPattern = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        textBadge.key = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    textBadge.badgeDisplayType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return textBadge;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(TextBadge textBadge) {
        TextBadge textBadge2 = textBadge;
        if (textBadge2.pieces == null) {
            textBadge2.pieces = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final TextBadge LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TextBadge textBadge, List list) {
    }
}
