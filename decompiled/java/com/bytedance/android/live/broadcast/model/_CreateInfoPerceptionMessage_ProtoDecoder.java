package com.bytedance.android.live.broadcast.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message._PunishEventInfo_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CreateInfoPerceptionMessage_ProtoDecoder implements C0IMD<CreateInfoPerceptionMessage> {
    public static CreateInfoPerceptionMessage LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CreateInfoPerceptionMessage createInfoPerceptionMessage = new CreateInfoPerceptionMessage();
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
                                    createInfoPerceptionMessage.accessType = c1516680pZS.LJIIJ();
                                }
                            } else {
                                createInfoPerceptionMessage.punishInfo = _PunishEventInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            createInfoPerceptionMessage.detailUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        createInfoPerceptionMessage.subTitle = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    createInfoPerceptionMessage.title = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return createInfoPerceptionMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CreateInfoPerceptionMessage createInfoPerceptionMessage) {
    }

    @Override // X.C0IMD
    public final CreateInfoPerceptionMessage LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CreateInfoPerceptionMessage createInfoPerceptionMessage, List list) {
    }
}
