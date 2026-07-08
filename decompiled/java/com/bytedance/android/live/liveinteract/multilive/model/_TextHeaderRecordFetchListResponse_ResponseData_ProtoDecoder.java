package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.TextHeaderRecordFetchListResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import webcast.data.multi_guest_play.TextHeaderRecordInfo;
import webcast.data.multi_guest_play.TextHeaderTemplateExt;
import webcast.data.multi_guest_play._TextHeaderRecordInfo_ProtoDecoder;
import webcast.data.multi_guest_play._TextHeaderTemplateExt_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _TextHeaderRecordFetchListResponse_ResponseData_ProtoDecoder implements C0IMD<TextHeaderRecordFetchListResponse.ResponseData> {
    @Override // X.C0IMD
    public final void LIZ(TextHeaderRecordFetchListResponse.ResponseData responseData) {
        TextHeaderRecordFetchListResponse.ResponseData responseData2 = responseData;
        List<TextHeaderRecordInfo> list = responseData2.textHeaderRecordList;
        if (list == null) {
            responseData2.textHeaderRecordList = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<TextHeaderRecordInfo> it2 = responseData2.textHeaderRecordList.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        List<TextHeaderRecordInfo> list2 = responseData2.templateRecordList;
        if (list2 == null) {
            responseData2.templateRecordList = new ArrayList();
        } else if (!list2.isEmpty()) {
            Iterator<TextHeaderRecordInfo> it3 = responseData2.templateRecordList.iterator();
            while (it3.hasNext()) {
                it3.next();
            }
        }
        Map<Long, TextHeaderTemplateExt> map = responseData2.templateExts;
        if (map == null) {
            responseData2.templateExts = new HashMap();
        } else {
            if (map.isEmpty()) {
                return;
            }
            Iterator<Map.Entry<Long, TextHeaderTemplateExt>> it4 = responseData2.templateExts.entrySet().iterator();
            while (it4.hasNext()) {
                it4.next().getValue();
            }
        }
    }

    @Override // X.C0IMD
    public final TextHeaderRecordFetchListResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) throws IOException {
        TextHeaderRecordFetchListResponse.ResponseData responseData = new TextHeaderRecordFetchListResponse.ResponseData();
        responseData.textHeaderRecordList = new ArrayList();
        responseData.templateExts = new HashMap();
        responseData.templateRecordList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            long jLIZJ2 = c1516680pZS.LIZJ();
                            Long lValueOf = null;
                            TextHeaderTemplateExt textHeaderTemplateExtLIZLLL = null;
                            while (true) {
                                int iLJI2 = c1516680pZS.LJI();
                                if (iLJI2 == -1) {
                                    break;
                                }
                                if (iLJI2 != 1) {
                                    if (iLJI2 == 2) {
                                        textHeaderTemplateExtLIZLLL = _TextHeaderTemplateExt_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            }
                            c1516680pZS.LJ(jLIZJ2);
                            if (lValueOf != null) {
                                if (textHeaderTemplateExtLIZLLL != null) {
                                    responseData.templateExts.put(lValueOf, textHeaderTemplateExtLIZLLL);
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else {
                                throw new IllegalStateException("Map key must not be null!");
                            }
                        }
                    } else {
                        responseData.templateRecordList.add(_TextHeaderRecordInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    responseData.textHeaderRecordList.add(_TextHeaderRecordInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TextHeaderRecordFetchListResponse.ResponseData responseData, List list) {
    }
}
