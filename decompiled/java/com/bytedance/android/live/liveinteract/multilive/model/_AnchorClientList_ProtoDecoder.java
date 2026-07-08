package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tikcast.linkmic.controller._AnchorMessage_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _AnchorClientList_ProtoDecoder implements C0IMD<AnchorClientList> {
    public static AnchorClientList LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AnchorClientList anchorClientList = new AnchorClientList();
        anchorClientList.readyUsers = new ArrayList();
        anchorClientList.rtcUsers = new ArrayList();
        anchorClientList.applyUsers = new ArrayList();
        anchorClientList.inviteUsers = new ArrayList();
        anchorClientList.linkUsers = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        anchorClientList.rtcUsers.add(_WaitUser_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 2:
                        anchorClientList.applyUsers.add(_WaitUser_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 3:
                        anchorClientList.inviteUsers.add(_WaitUser_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 4:
                        anchorClientList.readyUsers.add(_WaitUser_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 5:
                        anchorClientList.linkUsers.add(_LinkedUser_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 6:
                        anchorClientList.anchorMessage = _AnchorMessage_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return anchorClientList;
            }
        }
    }

    public static void LJ(AnchorClientList anchorClientList) {
        List<WaitUser> list = anchorClientList.rtcUsers;
        if (list == null) {
            anchorClientList.rtcUsers = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<WaitUser> it2 = anchorClientList.rtcUsers.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        List<WaitUser> list2 = anchorClientList.applyUsers;
        if (list2 == null) {
            anchorClientList.applyUsers = new ArrayList();
        } else if (!list2.isEmpty()) {
            Iterator<WaitUser> it3 = anchorClientList.applyUsers.iterator();
            while (it3.hasNext()) {
                it3.next();
            }
        }
        List<WaitUser> list3 = anchorClientList.inviteUsers;
        if (list3 == null) {
            anchorClientList.inviteUsers = new ArrayList();
        } else if (!list3.isEmpty()) {
            Iterator<WaitUser> it4 = anchorClientList.inviteUsers.iterator();
            while (it4.hasNext()) {
                it4.next();
            }
        }
        List<WaitUser> list4 = anchorClientList.readyUsers;
        if (list4 == null) {
            anchorClientList.readyUsers = new ArrayList();
        } else if (!list4.isEmpty()) {
            Iterator<WaitUser> it5 = anchorClientList.readyUsers.iterator();
            while (it5.hasNext()) {
                it5.next();
            }
        }
        List<LinkedUser> list5 = anchorClientList.linkUsers;
        if (list5 == null) {
            anchorClientList.linkUsers = new ArrayList();
        } else {
            if (list5.isEmpty()) {
                return;
            }
            Iterator<LinkedUser> it6 = anchorClientList.linkUsers.iterator();
            while (it6.hasNext()) {
                it6.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AnchorClientList anchorClientList) {
        LJ(anchorClientList);
    }

    @Override // X.C0IMD
    public final AnchorClientList LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AnchorClientList anchorClientList, List list) {
    }
}
