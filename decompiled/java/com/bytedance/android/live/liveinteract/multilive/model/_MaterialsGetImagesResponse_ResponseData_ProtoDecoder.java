package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.MaterialsGetImagesResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import webcast.data.multi_guest_play.PlayImage;
import webcast.data.multi_guest_play._PlayImage_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _MaterialsGetImagesResponse_ResponseData_ProtoDecoder implements C0IMD<MaterialsGetImagesResponse.ResponseData> {
    @Override // X.C0IMD
    public final void LIZ(MaterialsGetImagesResponse.ResponseData responseData) {
        MaterialsGetImagesResponse.ResponseData responseData2 = responseData;
        List<PlayImage> list = responseData2.playImages;
        if (list == null) {
            responseData2.playImages = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<PlayImage> it2 = responseData2.playImages.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final MaterialsGetImagesResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) throws IOException {
        MaterialsGetImagesResponse.ResponseData responseData = new MaterialsGetImagesResponse.ResponseData();
        responseData.playImages = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    responseData.playImages.add(_PlayImage_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MaterialsGetImagesResponse.ResponseData responseData, List list) {
    }
}
