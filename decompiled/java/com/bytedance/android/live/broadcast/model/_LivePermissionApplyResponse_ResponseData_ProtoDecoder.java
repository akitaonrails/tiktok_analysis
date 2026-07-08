package com.bytedance.android.live.broadcast.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.broadcast.model.LivePermissionApplyResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class _LivePermissionApplyResponse_ResponseData_ProtoDecoder implements C0IMD<LivePermissionApplyResponse.ResponseData> {
    public static LivePermissionApplyResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LivePermissionApplyResponse.ResponseData responseData = new LivePermissionApplyResponse.ResponseData();
        responseData.permissionInfo = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    long jLIZJ2 = c1516680pZS.LIZJ();
                    String strLIZLLL = null;
                    LivePermissionApplyResponse.PermissionApplyInfo permissionApplyInfoLIZLLL = null;
                    while (true) {
                        int iLJI2 = c1516680pZS.LJI();
                        if (iLJI2 == -1) {
                            break;
                        }
                        if (iLJI2 != 1) {
                            if (iLJI2 == 2) {
                                permissionApplyInfoLIZLLL = _LivePermissionApplyResponse_PermissionApplyInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    }
                    c1516680pZS.LJ(jLIZJ2);
                    if (strLIZLLL != null) {
                        if (permissionApplyInfoLIZLLL != null) {
                            responseData.permissionInfo.put(strLIZLLL, permissionApplyInfoLIZLLL);
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

    public static void LJ(LivePermissionApplyResponse.ResponseData responseData) {
        Map<String, LivePermissionApplyResponse.PermissionApplyInfo> map = responseData.permissionInfo;
        if (map == null) {
            responseData.permissionInfo = new HashMap();
        } else {
            if (map.isEmpty()) {
                return;
            }
            Iterator<Map.Entry<String, LivePermissionApplyResponse.PermissionApplyInfo>> it2 = responseData.permissionInfo.entrySet().iterator();
            while (it2.hasNext()) {
                it2.next().getValue();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LivePermissionApplyResponse.ResponseData responseData) {
        LJ(responseData);
    }

    @Override // X.C0IMD
    public final LivePermissionApplyResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LivePermissionApplyResponse.ResponseData responseData, List list) {
    }
}
