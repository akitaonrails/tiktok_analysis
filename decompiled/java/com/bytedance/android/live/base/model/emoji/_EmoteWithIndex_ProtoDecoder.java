package com.bytedance.android.live.base.model.emoji;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EmoteWithIndex_ProtoDecoder implements C0IMD<EmoteWithIndex> {
    public static EmoteWithIndex LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EmoteWithIndex emoteWithIndex = new EmoteWithIndex();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        emoteWithIndex.emoteModel = _EmoteModel_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    emoteWithIndex.index = (int) c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return emoteWithIndex;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(EmoteWithIndex emoteWithIndex) {
        EmoteModel emoteModel = emoteWithIndex.emoteModel;
        if (emoteModel != null) {
            _EmoteModel_ProtoDecoder.LJ(emoteModel);
        }
    }

    @Override // X.C0IMD
    public final EmoteWithIndex LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EmoteWithIndex emoteWithIndex, List list) {
    }
}
