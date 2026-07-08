package com.bytedance.android.live.base.model.user;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BadgeText_ProtoDecoder implements C0IMD<BadgeText> {
    public static BadgeText LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BadgeText badgeText = new BadgeText();
        badgeText.pieces = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            badgeText.pieces.add(C1516700pZU.LIZLLL(c1516680pZS));
                        }
                    } else {
                        badgeText.defaultPattern = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    badgeText.key = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return badgeText;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BadgeText badgeText) {
        BadgeText badgeText2 = badgeText;
        if (badgeText2.pieces == null) {
            badgeText2.pieces = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final BadgeText LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BadgeText badgeText, List list) {
    }
}
