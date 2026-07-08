package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.GetUserPlaySettingsResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class _GetUserPlaySettingsResponse_ResponseData_ProtoDecoder implements C0IMD<GetUserPlaySettingsResponse.ResponseData> {
    public static GetUserPlaySettingsResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GetUserPlaySettingsResponse.ResponseData responseData = new GetUserPlaySettingsResponse.ResponseData();
        responseData.settingsValueMap = new HashMap();
        responseData.settingsMap = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                String strLIZLLL = null;
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        UserPlaySettingValue userPlaySettingValueLIZLLL = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 == -1) {
                                break;
                            }
                            if (iLJI2 != 1) {
                                if (iLJI2 == 2) {
                                    userPlaySettingValueLIZLLL = _UserPlaySettingValue_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        }
                        c1516680pZS.LJ(jLIZJ2);
                        if (strLIZLLL != null) {
                            if (userPlaySettingValueLIZLLL != null) {
                                responseData.settingsValueMap.put(strLIZLLL, userPlaySettingValueLIZLLL);
                            } else {
                                throw new IllegalStateException("Map value must not be null!");
                            }
                        } else {
                            throw new IllegalStateException("Map key must not be null!");
                        }
                    }
                } else {
                    long jLIZJ3 = c1516680pZS.LIZJ();
                    Long lValueOf = null;
                    while (true) {
                        int iLJI3 = c1516680pZS.LJI();
                        if (iLJI3 == -1) {
                            break;
                        }
                        if (iLJI3 != 1) {
                            if (iLJI3 == 2) {
                                lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                            }
                        } else {
                            strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    }
                    c1516680pZS.LJ(jLIZJ3);
                    if (strLIZLLL != null) {
                        if (lValueOf != null) {
                            responseData.settingsMap.put(strLIZLLL, lValueOf);
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

    public static void LJ(GetUserPlaySettingsResponse.ResponseData responseData) {
        if (responseData.settingsMap == null) {
            responseData.settingsMap = new HashMap();
        }
        Map<String, UserPlaySettingValue> map = responseData.settingsValueMap;
        if (map == null) {
            responseData.settingsValueMap = new HashMap();
        } else {
            if (map.isEmpty()) {
                return;
            }
            Iterator<Map.Entry<String, UserPlaySettingValue>> it2 = responseData.settingsValueMap.entrySet().iterator();
            while (it2.hasNext()) {
                it2.next().getValue();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GetUserPlaySettingsResponse.ResponseData responseData) {
        LJ(responseData);
    }

    @Override // X.C0IMD
    public final GetUserPlaySettingsResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GetUserPlaySettingsResponse.ResponseData responseData, List list) {
    }
}
