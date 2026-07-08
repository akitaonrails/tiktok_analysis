package com.bytedance.android.live.broadcast.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.broadcast.model.PushStreamInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PushStreamInfo_QualityList_ProtoDecoder implements C0IMD<PushStreamInfo.QualityList> {
    public static PushStreamInfo.QualityList LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PushStreamInfo.QualityList qualityList = new PushStreamInfo.QualityList();
        qualityList.qualities = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    qualityList.qualities.add(_PushStreamInfo_Quality_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return qualityList;
            }
        }
    }

    public static void LJ(PushStreamInfo.QualityList qualityList) {
        List<PushStreamInfo.Quality> list = qualityList.qualities;
        if (list == null) {
            qualityList.qualities = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<PushStreamInfo.Quality> it2 = qualityList.qualities.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PushStreamInfo.QualityList qualityList) {
        LJ(qualityList);
    }

    @Override // X.C0IMD
    public final PushStreamInfo.QualityList LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PushStreamInfo.QualityList qualityList, List list) {
    }
}
