package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.social.model.SuggestGuestsResp;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SuggestGuestsResp_ResponseData_SuggestUser_ProtoDecoder implements C0IMD<SuggestGuestsResp.ResponseData.SuggestUser> {
    public static SuggestGuestsResp.ResponseData.SuggestUser LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SuggestGuestsResp.ResponseData.SuggestUser suggestUser = new SuggestGuestsResp.ResponseData.SuggestUser();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        suggestUser.recallReason = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    suggestUser.user = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return suggestUser;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(SuggestGuestsResp.ResponseData.SuggestUser suggestUser) {
        User user = suggestUser.user;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final SuggestGuestsResp.ResponseData.SuggestUser LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SuggestGuestsResp.ResponseData.SuggestUser suggestUser, List list) {
    }
}
