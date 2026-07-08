package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ChannelMessage_ProtoDecoder implements C0IMD<ChannelMessage> {
    public static ChannelMessage LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ChannelMessage channelMessage = new ChannelMessage();
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
                                channelMessage.layout_version = c1516680pZS.LJIIJ();
                            }
                        } else {
                            channelMessage.layoutId = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        channelMessage.reportType = c1516680pZS.LJIIJ();
                    }
                } else {
                    channelMessage.channelId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return channelMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final ChannelMessage LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(ChannelMessage channelMessage) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ChannelMessage channelMessage, List list) {
    }
}
