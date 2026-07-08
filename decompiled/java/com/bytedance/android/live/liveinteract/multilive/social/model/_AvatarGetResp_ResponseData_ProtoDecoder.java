package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.social.model.AvatarGetResp;
import java.io.IOException;
import java.util.List;
import webcast.data.multi_guest_social_data.Avatar;
import webcast.data.multi_guest_social_data._Avatar_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _AvatarGetResp_ResponseData_ProtoDecoder implements C0IMD<AvatarGetResp.ResponseData> {
    @Override // X.C0IMD
    public final void LIZ(AvatarGetResp.ResponseData responseData) {
        ImageModel imageModel;
        Avatar avatar = responseData.avatar;
        if (avatar != null && (imageModel = avatar.image) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final AvatarGetResp.ResponseData LIZJ(C1516680pZS c1516680pZS) throws IOException {
        AvatarGetResp.ResponseData responseData = new AvatarGetResp.ResponseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    responseData.avatar = _Avatar_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AvatarGetResp.ResponseData responseData, List list) {
    }
}
