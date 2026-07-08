package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkedUser_ProtoDecoder implements C0IMD<LinkedUser> {
    public static LinkedUser LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LinkedUser linkedUser = new LinkedUser();
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
                                    linkedUser.position = c1516680pZS.LJIIJ();
                                }
                            } else {
                                linkedUser.videoMuteStatus = c1516680pZS.LJIIJ();
                            }
                        } else {
                            linkedUser.audioMuteStatus = c1516680pZS.LJIIJ();
                        }
                    } else {
                        linkedUser.linkMicId = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    linkedUser.uid = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkedUser;
            }
        }
    }

    @Override // X.C0IMD
    public final LinkedUser LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(LinkedUser linkedUser) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkedUser linkedUser, List list) {
    }
}
