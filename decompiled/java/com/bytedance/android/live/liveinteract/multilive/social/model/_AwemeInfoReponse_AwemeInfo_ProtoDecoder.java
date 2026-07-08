package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.social.model.AwemeInfoReponse;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live._Room_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import webcast.data.LinkedUserInfo;
import webcast.data._LinkedUserInfo_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _AwemeInfoReponse_AwemeInfo_ProtoDecoder implements C0IMD<AwemeInfoReponse.AwemeInfo> {
    public static AwemeInfoReponse.AwemeInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AwemeInfoReponse.AwemeInfo awemeInfo = new AwemeInfoReponse.AwemeInfo();
        awemeInfo.linkedUsers = new ArrayList();
        awemeInfo.extraInfo = new HashMap();
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
                                    long jLIZJ2 = c1516680pZS.LIZJ();
                                    String strLIZLLL = null;
                                    String strLIZLLL2 = null;
                                    while (true) {
                                        int iLJI2 = c1516680pZS.LJI();
                                        if (iLJI2 == -1) {
                                            break;
                                        }
                                        if (iLJI2 != 1) {
                                            if (iLJI2 == 2) {
                                                strLIZLLL2 = C1516700pZU.LIZLLL(c1516680pZS);
                                            }
                                        } else {
                                            strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                                        }
                                    }
                                    c1516680pZS.LJ(jLIZJ2);
                                    if (strLIZLLL != null) {
                                        if (strLIZLLL2 != null) {
                                            awemeInfo.extraInfo.put(strLIZLLL, strLIZLLL2);
                                        } else {
                                            throw new IllegalStateException("Map value must not be null!");
                                        }
                                    } else {
                                        throw new IllegalStateException("Map key must not be null!");
                                    }
                                }
                            } else {
                                awemeInfo.aiSummary = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            awemeInfo.linkedUsers.add(_LinkedUserInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        awemeInfo.cardStyle = c1516680pZS.LJIIJ();
                    }
                } else {
                    awemeInfo.room = _Room_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return awemeInfo;
            }
        }
    }

    public static void LJ(AwemeInfoReponse.AwemeInfo awemeInfo) {
        User user;
        Room room = awemeInfo.room;
        if (room != null) {
            _Room_ProtoDecoder.LJ(room);
        }
        List<LinkedUserInfo> list = awemeInfo.linkedUsers;
        if (list == null) {
            awemeInfo.linkedUsers = new ArrayList();
        } else if (!list.isEmpty()) {
            for (LinkedUserInfo linkedUserInfo : awemeInfo.linkedUsers) {
                if (linkedUserInfo != null && (user = linkedUserInfo.userInfo) != null) {
                    _User_ProtoDecoder.LJ(user);
                }
            }
        }
        if (awemeInfo.extraInfo == null) {
            awemeInfo.extraInfo = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AwemeInfoReponse.AwemeInfo awemeInfo) {
        LJ(awemeInfo);
    }

    @Override // X.C0IMD
    public final AwemeInfoReponse.AwemeInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AwemeInfoReponse.AwemeInfo awemeInfo, List list) {
    }
}
