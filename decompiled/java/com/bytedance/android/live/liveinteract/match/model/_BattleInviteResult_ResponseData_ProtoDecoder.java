package com.bytedance.android.live.liveinteract.match.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.match.model.BattleInviteResult;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdk.chatroom.model.interact._GiftGalleryBadgeInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleUserInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleUserInfo_ProtoDecoder;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleInviteResult_ResponseData_ProtoDecoder implements C0IMD<BattleInviteResult.ResponseData> {
    @Override // X.C0IMD
    public final void LIZ(BattleInviteResult.ResponseData responseData) {
        BattleInviteResult.ResponseData responseData2 = responseData;
        Map<Long, GiftGalleryBadgeInfo> map = responseData2.leagueInfoMap;
        if (map == null) {
            responseData2.leagueInfoMap = new HashMap();
        } else if (!map.isEmpty()) {
            Iterator<Map.Entry<Long, GiftGalleryBadgeInfo>> it2 = responseData2.leagueInfoMap.entrySet().iterator();
            while (it2.hasNext()) {
                GiftGalleryBadgeInfo value = it2.next().getValue();
                if (value != null) {
                    _GiftGalleryBadgeInfo_ProtoDecoder.LJ(value);
                }
            }
        }
        Map<Long, BattleUserInfo> map2 = responseData2.anchorsInfo;
        if (map2 == null) {
            responseData2.anchorsInfo = new HashMap();
            return;
        }
        if (map2.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<Long, BattleUserInfo>> it3 = responseData2.anchorsInfo.entrySet().iterator();
        while (it3.hasNext()) {
            BattleUserInfo value2 = it3.next().getValue();
            if (value2 != null) {
                _BattleUserInfo_ProtoDecoder.LJ(value2);
            }
        }
    }

    @Override // X.C0IMD
    public final BattleInviteResult.ResponseData LIZJ(C1516680pZS c1516680pZS) throws IOException {
        BattleInviteResult.ResponseData responseData = new BattleInviteResult.ResponseData();
        responseData.anchorsInfo = new HashMap();
        responseData.leagueInfoMap = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        Long lValueOf = null;
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                long jLIZJ2 = c1516680pZS.LIZJ();
                                BattleUserInfo battleUserInfoLIZLLL = null;
                                while (true) {
                                    int iLJI2 = c1516680pZS.LJI();
                                    if (iLJI2 == -1) {
                                        break;
                                    }
                                    if (iLJI2 != 1) {
                                        if (iLJI2 == 2) {
                                            battleUserInfoLIZLLL = _BattleUserInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                        }
                                    } else {
                                        lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                    }
                                }
                                c1516680pZS.LJ(jLIZJ2);
                                if (lValueOf != null) {
                                    if (battleUserInfoLIZLLL != null) {
                                        responseData.anchorsInfo.put(lValueOf, battleUserInfoLIZLLL);
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        } else {
                            long jLIZJ3 = c1516680pZS.LIZJ();
                            GiftGalleryBadgeInfo giftGalleryBadgeInfoLIZLLL = null;
                            while (true) {
                                int iLJI3 = c1516680pZS.LJI();
                                if (iLJI3 == -1) {
                                    break;
                                }
                                if (iLJI3 != 1) {
                                    if (iLJI3 == 2) {
                                        giftGalleryBadgeInfoLIZLLL = _GiftGalleryBadgeInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            }
                            c1516680pZS.LJ(jLIZJ3);
                            if (lValueOf != null) {
                                if (giftGalleryBadgeInfoLIZLLL != null) {
                                    responseData.leagueInfoMap.put(lValueOf, giftGalleryBadgeInfoLIZLLL);
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else {
                                throw new IllegalStateException("Map key must not be null!");
                            }
                        }
                    } else {
                        responseData.inviterGiftPermissionType = c1516680pZS.LJIIJ();
                    }
                } else {
                    responseData.battleId = Long.valueOf(c1516680pZS.LJIIJJI());
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleInviteResult.ResponseData responseData, List list) {
    }
}
