package com.bytedance.android.live.liveinteract.competition.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionContributorListResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class _CompetitionContributorListResponse_ResponseData_ProtoDecoder implements C0IMD<CompetitionContributorListResponse.ResponseData> {
    public static CompetitionContributorListResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CompetitionContributorListResponse.ResponseData responseData = new CompetitionContributorListResponse.ResponseData();
        responseData.contributorLists = new HashMap();
        responseData.users = new ArrayList();
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
                                long jLIZJ2 = c1516680pZS.LIZJ();
                                String strLIZLLL = null;
                                CompetitionContributorListResponse.ContributorList contributorListLIZLLL = null;
                                while (true) {
                                    int iLJI2 = c1516680pZS.LJI();
                                    if (iLJI2 == -1) {
                                        break;
                                    }
                                    if (iLJI2 != 1) {
                                        if (iLJI2 == 2) {
                                            contributorListLIZLLL = _CompetitionContributorListResponse_ContributorList_ProtoDecoder.LIZLLL(c1516680pZS);
                                        }
                                    } else {
                                        strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                                    }
                                }
                                c1516680pZS.LJ(jLIZJ2);
                                if (strLIZLLL != null) {
                                    if (contributorListLIZLLL != null) {
                                        responseData.contributorLists.put(strLIZLLL, contributorListLIZLLL);
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        } else {
                            responseData.mvpUserId = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        responseData.anchorInfo = _CompetitionContributorListResponse_AnchorInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    responseData.users.add(_CompetitionContributorListResponse_UserInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    public static void LJ(CompetitionContributorListResponse.ResponseData responseData) {
        User user;
        User user2;
        List<CompetitionContributorListResponse.UserInfo> list = responseData.users;
        if (list == null) {
            responseData.users = new ArrayList();
        } else if (!list.isEmpty()) {
            for (CompetitionContributorListResponse.UserInfo userInfo : responseData.users) {
                if (userInfo != null && (user = userInfo.user) != null) {
                    _User_ProtoDecoder.LJ(user);
                }
            }
        }
        CompetitionContributorListResponse.AnchorInfo anchorInfo = responseData.anchorInfo;
        if (anchorInfo != null && (user2 = anchorInfo.user) != null) {
            _User_ProtoDecoder.LJ(user2);
        }
        Map<String, CompetitionContributorListResponse.ContributorList> map = responseData.contributorLists;
        if (map == null) {
            responseData.contributorLists = new HashMap();
            return;
        }
        if (map.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<String, CompetitionContributorListResponse.ContributorList>> it2 = responseData.contributorLists.entrySet().iterator();
        while (it2.hasNext()) {
            CompetitionContributorListResponse.ContributorList value = it2.next().getValue();
            if (value != null) {
                _CompetitionContributorListResponse_ContributorList_ProtoDecoder.LJ(value);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CompetitionContributorListResponse.ResponseData responseData) {
        LJ(responseData);
    }

    @Override // X.C0IMD
    public final CompetitionContributorListResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CompetitionContributorListResponse.ResponseData responseData, List list) {
    }
}
