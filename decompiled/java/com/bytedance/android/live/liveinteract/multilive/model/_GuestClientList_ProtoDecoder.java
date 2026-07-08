package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GuestClientList_ProtoDecoder implements C0IMD<GuestClientList> {
    public static GuestClientList LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GuestClientList guestClientList = new GuestClientList();
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
                                    guestClientList.rtcStatus = c1516680pZS.LJIIJ();
                                }
                            } else {
                                guestClientList.source = c1516680pZS.LJIIJ();
                            }
                        } else {
                            guestClientList.status = c1516680pZS.LJIIJ();
                        }
                    } else {
                        guestClientList.linkMicId = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    guestClientList.uid = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return guestClientList;
            }
        }
    }

    @Override // X.C0IMD
    public final GuestClientList LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GuestClientList guestClientList) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuestClientList guestClientList, List list) {
    }
}
