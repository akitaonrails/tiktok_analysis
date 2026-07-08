package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowRankResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GetShowRankResponse_ResponseData_ProtoDecoder implements C0IMD<GetShowRankResponse.ResponseData> {
    public static GetShowRankResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GetShowRankResponse.ResponseData responseData = new GetShowRankResponse.ResponseData();
        responseData.showRankUsers = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    responseData.showRankUsers.add(_GetShowRankResponse_ShowRankUser_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    public static void LJ(GetShowRankResponse.ResponseData responseData) {
        ImageModel imageModel;
        List<GetShowRankResponse.ShowRankUser> list = responseData.showRankUsers;
        if (list == null) {
            responseData.showRankUsers = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (GetShowRankResponse.ShowRankUser showRankUser : responseData.showRankUsers) {
            if (showRankUser != null && (imageModel = showRankUser.avatarThumb) != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GetShowRankResponse.ResponseData responseData) {
        LJ(responseData);
    }

    @Override // X.C0IMD
    public final GetShowRankResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GetShowRankResponse.ResponseData responseData, List list) {
    }
}
