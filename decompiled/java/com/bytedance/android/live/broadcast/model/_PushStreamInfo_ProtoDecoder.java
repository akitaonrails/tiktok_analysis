package com.bytedance.android.live.broadcast.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.broadcast.model.PushStreamInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class _PushStreamInfo_ProtoDecoder implements C0IMD<PushStreamInfo> {
    public static PushStreamInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PushStreamInfo pushStreamInfo = new PushStreamInfo();
        pushStreamInfo.multiQualities = new HashMap();
        pushStreamInfo.qualityList = new ArrayList();
        pushStreamInfo.multiDefaultQualities = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        String strLIZLLL = null;
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                long jLIZJ2 = c1516680pZS.LIZJ();
                                PushStreamInfo.QualityList qualityListLIZLLL = null;
                                while (true) {
                                    int iLJI2 = c1516680pZS.LJI();
                                    if (iLJI2 == -1) {
                                        break;
                                    }
                                    if (iLJI2 != 1) {
                                        if (iLJI2 == 2) {
                                            qualityListLIZLLL = _PushStreamInfo_QualityList_ProtoDecoder.LIZLLL(c1516680pZS);
                                        }
                                    } else {
                                        strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                                    }
                                }
                                c1516680pZS.LJ(jLIZJ2);
                                if (strLIZLLL != null) {
                                    if (qualityListLIZLLL != null) {
                                        pushStreamInfo.multiQualities.put(strLIZLLL, qualityListLIZLLL);
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        } else {
                            long jLIZJ3 = c1516680pZS.LIZJ();
                            PushStreamInfo.Quality qualityLIZLLL = null;
                            while (true) {
                                int iLJI3 = c1516680pZS.LJI();
                                if (iLJI3 == -1) {
                                    break;
                                }
                                if (iLJI3 != 1) {
                                    if (iLJI3 == 2) {
                                        qualityLIZLLL = _PushStreamInfo_Quality_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            }
                            c1516680pZS.LJ(jLIZJ3);
                            if (strLIZLLL != null) {
                                if (qualityLIZLLL != null) {
                                    pushStreamInfo.multiDefaultQualities.put(strLIZLLL, qualityLIZLLL);
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else {
                                throw new IllegalStateException("Map key must not be null!");
                            }
                        }
                    } else {
                        pushStreamInfo.qualityList.add(_PushStreamInfo_Quality_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    pushStreamInfo.defaultQuality = _PushStreamInfo_Quality_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return pushStreamInfo;
            }
        }
    }

    public static void LJ(PushStreamInfo pushStreamInfo) {
        List<PushStreamInfo.Quality> list = pushStreamInfo.qualityList;
        if (list == null) {
            pushStreamInfo.qualityList = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<PushStreamInfo.Quality> it2 = pushStreamInfo.qualityList.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        Map<String, PushStreamInfo.Quality> map = pushStreamInfo.multiDefaultQualities;
        if (map == null) {
            pushStreamInfo.multiDefaultQualities = new HashMap();
        } else if (!map.isEmpty()) {
            Iterator<Map.Entry<String, PushStreamInfo.Quality>> it3 = pushStreamInfo.multiDefaultQualities.entrySet().iterator();
            while (it3.hasNext()) {
                it3.next().getValue();
            }
        }
        Map<String, PushStreamInfo.QualityList> map2 = pushStreamInfo.multiQualities;
        if (map2 == null) {
            pushStreamInfo.multiQualities = new HashMap();
            return;
        }
        if (map2.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<String, PushStreamInfo.QualityList>> it4 = pushStreamInfo.multiQualities.entrySet().iterator();
        while (it4.hasNext()) {
            PushStreamInfo.QualityList value = it4.next().getValue();
            if (value != null) {
                _PushStreamInfo_QualityList_ProtoDecoder.LJ(value);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PushStreamInfo pushStreamInfo) {
        LJ(pushStreamInfo);
    }

    @Override // X.C0IMD
    public final PushStreamInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PushStreamInfo pushStreamInfo, List list) {
    }
}
