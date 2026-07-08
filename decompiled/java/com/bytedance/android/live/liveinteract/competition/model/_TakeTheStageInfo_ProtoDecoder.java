package com.bytedance.android.live.liveinteract.competition.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.competition.model.TakeTheStageInfo;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TakeTheStageInfo_ProtoDecoder implements C0IMD<TakeTheStageInfo> {
    public static TakeTheStageInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TakeTheStageInfo takeTheStageInfo = new TakeTheStageInfo();
        takeTheStageInfo.defaultOrders = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    if (iLJI != 100) {
                                        if (iLJI != 101) {
                                            C1516700pZU.LJ(c1516680pZS);
                                        } else {
                                            takeTheStageInfo.finalCallInfo = _TakeTheStageInfo_FinalCallInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                        }
                                    } else {
                                        takeTheStageInfo.startedInfo = _TakeTheStageInfo_StartedInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    long jLIZJ2 = c1516680pZS.LIZJ();
                                    Long lValueOf = null;
                                    Long lValueOf2 = null;
                                    while (true) {
                                        int iLJI2 = c1516680pZS.LJI();
                                        if (iLJI2 == -1) {
                                            break;
                                        }
                                        if (iLJI2 != 1) {
                                            if (iLJI2 == 2) {
                                                lValueOf2 = Long.valueOf(c1516680pZS.LJIIJJI());
                                            }
                                        } else {
                                            lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                        }
                                    }
                                    c1516680pZS.LJ(jLIZJ2);
                                    if (lValueOf != null) {
                                        if (lValueOf2 != null) {
                                            takeTheStageInfo.defaultOrders.put(lValueOf, lValueOf2);
                                        } else {
                                            throw new IllegalStateException("Map value must not be null!");
                                        }
                                    } else {
                                        throw new IllegalStateException("Map key must not be null!");
                                    }
                                }
                            } else {
                                takeTheStageInfo.takeTheStageVersion = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            takeTheStageInfo.victoryLapInfo = _TakeTheStageInfo_VictoryLapInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        takeTheStageInfo.takeTheStageStartTime = c1516680pZS.LJIIJJI();
                    }
                } else {
                    takeTheStageInfo.takeTheStageStatus = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return takeTheStageInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(TakeTheStageInfo takeTheStageInfo) {
        TakeTheStageOrderInfo takeTheStageOrderInfo;
        TakeTheStageInfo takeTheStageInfo2 = takeTheStageInfo;
        if (takeTheStageInfo2.defaultOrders == null) {
            takeTheStageInfo2.defaultOrders = new HashMap();
        }
        TakeTheStageInfo.StartedInfo startedInfo = takeTheStageInfo2.startedInfo;
        if (startedInfo != null && (takeTheStageOrderInfo = startedInfo.orderInfo) != null) {
            _TakeTheStageOrderInfo_ProtoDecoder.LJ(takeTheStageOrderInfo);
        }
    }

    @Override // X.C0IMD
    public final TakeTheStageInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TakeTheStageInfo takeTheStageInfo, List list) {
    }
}
