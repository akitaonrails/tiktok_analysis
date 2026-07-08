package com.bytedance.android.live.liveinteract.match.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.match.model.BattleFinishResult;
import com.bytedance.android.livesdk.model.message.battle.BattleResult;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdk.model.message.battle.BattleUserArmies;
import com.bytedance.android.livesdk.model.message.battle._BattleResult_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleSetting_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleUserArmies_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleComboInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleUserInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.MatchPunishExtraInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleComboInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleUserInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._MatchPunishExtraInfo_ProtoDecoder;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleFinishResult_ResponseData_ProtoDecoder implements C0IMD<BattleFinishResult.ResponseData> {
    @Override // X.C0IMD
    public final void LIZ(BattleFinishResult.ResponseData responseData) {
        BattleFinishResult.ResponseData responseData2 = responseData;
        Map<Long, BattleResult> map = responseData2.battleResult;
        if (map == null) {
            responseData2.battleResult = new HashMap();
        } else if (!map.isEmpty()) {
            Iterator<Map.Entry<Long, BattleResult>> it2 = responseData2.battleResult.entrySet().iterator();
            while (it2.hasNext()) {
                it2.next().getValue();
            }
        }
        Map<Long, BattleUserArmies> map2 = responseData2.armies;
        if (map2 == null) {
            responseData2.armies = new HashMap();
        } else if (!map2.isEmpty()) {
            Iterator<Map.Entry<Long, BattleUserArmies>> it3 = responseData2.armies.entrySet().iterator();
            while (it3.hasNext()) {
                BattleUserArmies value = it3.next().getValue();
                if (value != null) {
                    _BattleUserArmies_ProtoDecoder.LJ(value);
                }
            }
        }
        Map<Long, BattleUserInfo> map3 = responseData2.anchorsInfo;
        if (map3 == null) {
            responseData2.anchorsInfo = new HashMap();
        } else if (!map3.isEmpty()) {
            Iterator<Map.Entry<Long, BattleUserInfo>> it4 = responseData2.anchorsInfo.entrySet().iterator();
            while (it4.hasNext()) {
                BattleUserInfo value2 = it4.next().getValue();
                if (value2 != null) {
                    _BattleUserInfo_ProtoDecoder.LJ(value2);
                }
            }
        }
        Map<Long, BattleComboInfo> map4 = responseData2.battleComboV2;
        if (map4 == null) {
            responseData2.battleComboV2 = new HashMap();
        } else if (!map4.isEmpty()) {
            Iterator<Map.Entry<Long, BattleComboInfo>> it5 = responseData2.battleComboV2.entrySet().iterator();
            while (it5.hasNext()) {
                it5.next().getValue();
            }
        }
        BattleSetting battleSetting = responseData2.battleSettings;
        if (battleSetting != null) {
            _BattleSetting_ProtoDecoder.LJ(battleSetting);
        }
        MatchPunishExtraInfo matchPunishExtraInfo = responseData2.matchPunishExtraInfo;
        if (matchPunishExtraInfo != null) {
            _MatchPunishExtraInfo_ProtoDecoder.LJ(matchPunishExtraInfo);
        }
    }

    @Override // X.C0IMD
    public final BattleFinishResult.ResponseData LIZJ(C1516680pZS c1516680pZS) throws IOException {
        BattleFinishResult.ResponseData responseData = new BattleFinishResult.ResponseData();
        responseData.armies = new HashMap();
        responseData.anchorsInfo = new HashMap();
        responseData.battleComboV2 = new HashMap();
        responseData.battleResult = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                Long lValueOf = null;
                if (iLJI != 1) {
                    if (iLJI != 20) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    if (iLJI != 6) {
                                        C1516700pZU.LJ(c1516680pZS);
                                    } else {
                                        responseData.battleSettings = _BattleSetting_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    long jLIZJ2 = c1516680pZS.LIZJ();
                                    BattleComboInfo battleComboInfoLIZLLL = null;
                                    while (true) {
                                        int iLJI2 = c1516680pZS.LJI();
                                        if (iLJI2 == -1) {
                                            break;
                                        }
                                        if (iLJI2 != 1) {
                                            if (iLJI2 == 2) {
                                                battleComboInfoLIZLLL = _BattleComboInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                            }
                                        } else {
                                            lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                        }
                                    }
                                    c1516680pZS.LJ(jLIZJ2);
                                    if (lValueOf != null) {
                                        if (battleComboInfoLIZLLL != null) {
                                            responseData.battleComboV2.put(lValueOf, battleComboInfoLIZLLL);
                                        } else {
                                            throw new IllegalStateException("Map value must not be null!");
                                        }
                                    } else {
                                        throw new IllegalStateException("Map key must not be null!");
                                    }
                                }
                            } else {
                                long jLIZJ3 = c1516680pZS.LIZJ();
                                BattleUserInfo battleUserInfoLIZLLL = null;
                                while (true) {
                                    int iLJI3 = c1516680pZS.LJI();
                                    if (iLJI3 == -1) {
                                        break;
                                    }
                                    if (iLJI3 != 1) {
                                        if (iLJI3 == 2) {
                                            battleUserInfoLIZLLL = _BattleUserInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                        }
                                    } else {
                                        lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                    }
                                }
                                c1516680pZS.LJ(jLIZJ3);
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
                            long jLIZJ4 = c1516680pZS.LIZJ();
                            BattleUserArmies battleUserArmiesLIZLLL = null;
                            while (true) {
                                int iLJI4 = c1516680pZS.LJI();
                                if (iLJI4 == -1) {
                                    break;
                                }
                                if (iLJI4 != 1) {
                                    if (iLJI4 == 2) {
                                        battleUserArmiesLIZLLL = _BattleUserArmies_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            }
                            c1516680pZS.LJ(jLIZJ4);
                            if (lValueOf != null) {
                                if (battleUserArmiesLIZLLL != null) {
                                    responseData.armies.put(lValueOf, battleUserArmiesLIZLLL);
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else {
                                throw new IllegalStateException("Map key must not be null!");
                            }
                        }
                    } else {
                        responseData.matchPunishExtraInfo = _MatchPunishExtraInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    long jLIZJ5 = c1516680pZS.LIZJ();
                    BattleResult battleResultLIZLLL = null;
                    while (true) {
                        int iLJI5 = c1516680pZS.LJI();
                        if (iLJI5 == -1) {
                            break;
                        }
                        if (iLJI5 != 1) {
                            if (iLJI5 == 2) {
                                battleResultLIZLLL = _BattleResult_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                        }
                    }
                    c1516680pZS.LJ(jLIZJ5);
                    if (lValueOf != null) {
                        if (battleResultLIZLLL != null) {
                            responseData.battleResult.put(lValueOf, battleResultLIZLLL);
                        } else {
                            throw new IllegalStateException("Map value must not be null!");
                        }
                    } else {
                        throw new IllegalStateException("Map key must not be null!");
                    }
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleFinishResult.ResponseData responseData, List list) {
    }
}
