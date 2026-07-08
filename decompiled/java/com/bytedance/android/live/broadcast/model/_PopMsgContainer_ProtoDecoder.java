package com.bytedance.android.live.broadcast.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PopMsgContainer_ProtoDecoder implements C0IMD<PopMsgContainer> {
    public static PopMsgContainer LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PopMsgContainer popMsgContainer = new PopMsgContainer();
        popMsgContainer.buttonContent = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        popMsgContainer.hasPop = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 2:
                        popMsgContainer.content = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        popMsgContainer.buttonContent.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case 4:
                        popMsgContainer.title = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        popMsgContainer.hasJump = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 6:
                        popMsgContainer.jumpTitle = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        popMsgContainer.jumpUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        popMsgContainer.id = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return popMsgContainer;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PopMsgContainer popMsgContainer) {
        PopMsgContainer popMsgContainer2 = popMsgContainer;
        if (popMsgContainer2.buttonContent == null) {
            popMsgContainer2.buttonContent = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final PopMsgContainer LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PopMsgContainer popMsgContainer, List list) {
    }
}
