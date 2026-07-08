package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.CreateShowParams;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tikcast.linkmic.common._MgTraceInfo_ProtoDecoder;
import webcast.data.multi_guest_play._ShowConfig_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _CreateShowParams_ProtoDecoder implements C0IMD<CreateShowParams> {
    @Override // X.C0IMD
    public final void LIZ(CreateShowParams createShowParams) {
        CreateShowParams createShowParams2 = createShowParams;
        List<CreateShowParams.ListUser> list = createShowParams2.showUsers;
        if (list == null) {
            createShowParams2.showUsers = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<CreateShowParams.ListUser> it2 = createShowParams2.showUsers.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final CreateShowParams LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CreateShowParams createShowParams = new CreateShowParams();
        createShowParams.showUsers = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 101) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    createShowParams.mgTraceInfo = _MgTraceInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                createShowParams.showUsers.add(_CreateShowParams_ListUser_ProtoDecoder.LIZLLL(c1516680pZS));
                            }
                        } else {
                            createShowParams.showConfig = _ShowConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        createShowParams.channelId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    createShowParams.roomId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return createShowParams;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CreateShowParams createShowParams, List list) {
    }
}
