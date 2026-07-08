package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.social.model.GuestInvitePanelResp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GuestInvitePanelResp_ListUser_ProtoDecoder implements C0IMD<GuestInvitePanelResp.ListUser> {
    public static GuestInvitePanelResp.ListUser LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GuestInvitePanelResp.ListUser listUser = new GuestInvitePanelResp.ListUser();
        listUser.recommendTagList = new ArrayList();
        listUser.tagList = new ArrayList();
        listUser.recommendTagTextList = new ArrayList();
        listUser.tagTextList = new ArrayList();
        listUser.trackMap = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        listUser.user = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        listUser.onlineStatus = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        listUser.invited = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 4:
                        listUser.tagList.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case 5:
                        listUser.tagTextList.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case 6:
                        listUser.recommendTagList.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case 7:
                        listUser.recommendTagTextList.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case 8:
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        String strLIZLLL = null;
                        String strLIZLLL2 = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 != -1) {
                                if (iLJI2 != 1) {
                                    if (iLJI2 == 2) {
                                        strLIZLLL2 = C1516700pZU.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ2);
                                if (strLIZLLL != null) {
                                    if (strLIZLLL2 != null) {
                                        listUser.trackMap.put(strLIZLLL, strLIZLLL2);
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                                break;
                            }
                        }
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return listUser;
            }
        }
    }

    public static void LJ(GuestInvitePanelResp.ListUser listUser) {
        User user = listUser.user;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
        if (listUser.tagList == null) {
            listUser.tagList = new ArrayList();
        }
        if (listUser.tagTextList == null) {
            listUser.tagTextList = new ArrayList();
        }
        if (listUser.recommendTagList == null) {
            listUser.recommendTagList = new ArrayList();
        }
        if (listUser.recommendTagTextList == null) {
            listUser.recommendTagTextList = new ArrayList();
        }
        if (listUser.trackMap == null) {
            listUser.trackMap = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GuestInvitePanelResp.ListUser listUser) {
        LJ(listUser);
    }

    @Override // X.C0IMD
    public final GuestInvitePanelResp.ListUser LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuestInvitePanelResp.ListUser listUser, List list) {
    }
}
