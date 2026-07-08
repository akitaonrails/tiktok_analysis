package com.bytedance.android.live.liveinteract.match.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.match.model.PrepareBattleResponse;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleABTestList;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleABTestList_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._GiftMode_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class _PrepareBattleResponse_ResponseData_ProtoDecoder implements C0IMD<PrepareBattleResponse.ResponseData> {
    @Override // X.C0IMD
    public final void LIZ(PrepareBattleResponse.ResponseData responseData) {
        PrepareBattleResponse.ResponseData responseData2 = responseData;
        Map<Long, BattleABTestList> map = responseData2.abtestSetting;
        if (map == null) {
            responseData2.abtestSetting = new HashMap();
        } else if (!map.isEmpty()) {
            Iterator<Map.Entry<Long, BattleABTestList>> it2 = responseData2.abtestSetting.entrySet().iterator();
            while (it2.hasNext()) {
                BattleABTestList value = it2.next().getValue();
                if (value != null) {
                    _BattleABTestList_ProtoDecoder.LJ(value);
                }
            }
        }
        List<GiftMode> list = responseData2.giftMode;
        if (list == null) {
            responseData2.giftMode = new ArrayList();
        } else if (!list.isEmpty()) {
            for (GiftMode giftMode : responseData2.giftMode) {
                if (giftMode != null) {
                    _GiftMode_ProtoDecoder.LJ(giftMode);
                }
            }
        }
        Text text = responseData2.giftEventDesc;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
    }

    @Override // X.C0IMD
    public final PrepareBattleResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) throws IOException {
        PrepareBattleResponse.ResponseData responseData = new PrepareBattleResponse.ResponseData();
        responseData.giftMode = new ArrayList();
        responseData.abtestSetting = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        Long lValueOf = null;
                        BattleABTestList battleABTestListLIZLLL = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 != -1) {
                                if (iLJI2 != 1) {
                                    if (iLJI2 == 2) {
                                        battleABTestListLIZLLL = _BattleABTestList_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ2);
                                if (lValueOf != null) {
                                    if (battleABTestListLIZLLL != null) {
                                        responseData.abtestSetting.put(lValueOf, battleABTestListLIZLLL);
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
                    case 2:
                        responseData.giftMode.add(_GiftMode_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 3:
                        responseData.ruleGuideUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        responseData.giftEventDesc = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        responseData.punishedAnchor = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        responseData.punishEndTimestamp = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PrepareBattleResponse.ResponseData responseData, List list) {
    }
}
