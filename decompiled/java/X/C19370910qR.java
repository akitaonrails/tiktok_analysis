package X;

import com.bytedance.android.live.broadcast.model.PushStreamInfo;
import com.bytedance.android.livesdk.livesetting.game.GameCategoryConfig;
import com.bytedance.android.livesdk.livesetting.game.TtliveGameCategoryConfigSetting;
import com.bytedance.android.livesdk.model.GameTag;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import webcast.api.creator.PreScheduleStream;

/* JADX INFO: renamed from: X.10qR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19370910qR {
    public static final EnumC1284950jXh LIZ = EnumC1284950jXh.TYPE_DEFAULT;
    public static final Map<Long, C19360010og> LIZIZ = new LinkedHashMap();

    static {
        Long l;
        GameCategoryConfig value = TtliveGameCategoryConfigSetting.INSTANCE.getValue();
        for (long j : value.getComplexityLow()) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) LIZIZ;
            C19360010og c19360010og = (C19360010og) linkedHashMap.get(Long.valueOf(j));
            if (c19360010og == null) {
                c19360010og = new C19360010og();
            }
            c19360010og.LIZ.LIZ(EnumC19359910of.COMPLEXITY_LOW);
            linkedHashMap.put(Long.valueOf(j), c19360010og);
        }
        for (long j2 : value.getComplexityDefault()) {
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) LIZIZ;
            C19360010og c19360010og2 = (C19360010og) linkedHashMap2.get(Long.valueOf(j2));
            if (c19360010og2 == null) {
                c19360010og2 = new C19360010og();
            }
            c19360010og2.LIZ.LIZ(EnumC19359910of.COMPLEXITY_DEFAULT);
            linkedHashMap2.put(Long.valueOf(j2), c19360010og2);
        }
        for (long j3 : value.getComplexityHigh()) {
            LinkedHashMap linkedHashMap3 = (LinkedHashMap) LIZIZ;
            C19360010og c19360010og3 = (C19360010og) linkedHashMap3.get(Long.valueOf(j3));
            if (c19360010og3 == null) {
                c19360010og3 = new C19360010og();
            }
            c19360010og3.LIZ.LIZ(EnumC19359910of.COMPLEXITY_HIGH);
            linkedHashMap3.put(Long.valueOf(j3), c19360010og3);
        }
        for (long j4 : value.getBusinessLow()) {
            LinkedHashMap linkedHashMap4 = (LinkedHashMap) LIZIZ;
            C19360010og c19360010og4 = (C19360010og) linkedHashMap4.get(Long.valueOf(j4));
            if (c19360010og4 == null) {
                c19360010og4 = new C19360010og();
            }
            c19360010og4.LIZIZ.LIZ(EnumC19359710od.BUSINESS_LOW);
            linkedHashMap4.put(Long.valueOf(j4), c19360010og4);
        }
        for (long j5 : value.getBusinessDefault()) {
            LinkedHashMap linkedHashMap5 = (LinkedHashMap) LIZIZ;
            C19360010og c19360010og5 = (C19360010og) linkedHashMap5.get(Long.valueOf(j5));
            if (c19360010og5 == null) {
                c19360010og5 = new C19360010og();
            }
            c19360010og5.LIZIZ.LIZ(EnumC19359710od.BUSINESS_DEFAULT);
            linkedHashMap5.put(Long.valueOf(j5), c19360010og5);
        }
        for (long j6 : value.getBusinessHigh()) {
            LinkedHashMap linkedHashMap6 = (LinkedHashMap) LIZIZ;
            C19360010og c19360010og6 = (C19360010og) linkedHashMap6.get(Long.valueOf(j6));
            if (c19360010og6 == null) {
                c19360010og6 = new C19360010og();
            }
            c19360010og6.LIZIZ.LIZ(EnumC19359710od.BUSINESS_HIGH);
            linkedHashMap6.put(Long.valueOf(j6), c19360010og6);
        }
        GameTag gameTagLIZIZ = C754700Tj2.LIZIZ();
        LIZIZ((gameTagLIZIZ == null || (l = gameTagLIZIZ.id) == null) ? -1L : l.longValue());
        Map<String, Object> map = C1338270kvh.LIZ;
    }

    public static EnumC1284950jXh LIZ() {
        Long l;
        GameTag gameTagLIZIZ = C754700Tj2.LIZIZ();
        long jLongValue = (gameTagLIZIZ == null || (l = gameTagLIZIZ.id) == null) ? -1L : l.longValue();
        C754700Tj2.LIZIZ();
        EnumC1284950jXh enumC1284950jXhLIZIZ = LIZIZ(jLongValue);
        Map<String, Object> map = C1338270kvh.LIZ;
        return enumC1284950jXhLIZIZ;
    }

    public static EnumC1284950jXh LIZIZ(long j) {
        EnumC1284950jXh enumC1284950jXhLIZ;
        C19360010og c19360010og = (C19360010og) ((LinkedHashMap) LIZIZ).get(Long.valueOf(j));
        if (c19360010og == null || (enumC1284950jXhLIZ = c19360010og.LIZ()) == null) {
            return LIZ;
        }
        return enumC1284950jXhLIZ;
    }

    public static PushStreamInfo.Quality LIZJ(Map map) {
        long jLongValue;
        PushStreamInfo.Quality quality;
        Long l;
        if (map == null) {
            return null;
        }
        GameTag gameTagLIZIZ = C754700Tj2.LIZIZ();
        if (gameTagLIZIZ != null && (l = gameTagLIZIZ.id) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = -1;
        }
        C754700Tj2.LIZIZ();
        int i = C1284960jXi.LIZ[LIZIZ(jLongValue).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    quality = (PushStreamInfo.Quality) map.get("high");
                } else {
                    throw new C1954807lC();
                }
            } else {
                quality = (PushStreamInfo.Quality) map.get("default");
            }
        } else {
            quality = (PushStreamInfo.Quality) map.get("low");
        }
        Map<String, Object> map2 = C1338270kvh.LIZ;
        return quality;
    }

    public static PreScheduleStream.PushStreamInfo.Quality LIZLLL(Map map) {
        long jLongValue;
        PreScheduleStream.PushStreamInfo.Quality quality;
        Long l;
        if (map == null) {
            return null;
        }
        GameTag gameTagLIZIZ = C754700Tj2.LIZIZ();
        if (gameTagLIZIZ != null && (l = gameTagLIZIZ.id) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = -1;
        }
        C754700Tj2.LIZIZ();
        int i = C1284960jXi.LIZ[LIZIZ(jLongValue).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    quality = (PreScheduleStream.PushStreamInfo.Quality) map.get("high");
                } else {
                    throw new C1954807lC();
                }
            } else {
                quality = (PreScheduleStream.PushStreamInfo.Quality) map.get("default");
            }
        } else {
            quality = (PreScheduleStream.PushStreamInfo.Quality) map.get("low");
        }
        Map<String, Object> map2 = C1338270kvh.LIZ;
        return quality;
    }

    public static List LJ(Map map) {
        long jLongValue;
        Long l;
        List<PushStreamInfo.Quality> list = null;
        if (map == null) {
            return null;
        }
        GameTag gameTagLIZIZ = C754700Tj2.LIZIZ();
        if (gameTagLIZIZ != null && (l = gameTagLIZIZ.id) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = -1;
        }
        C754700Tj2.LIZIZ();
        int i = C1284960jXi.LIZ[LIZIZ(jLongValue).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    PushStreamInfo.QualityList qualityList = (PushStreamInfo.QualityList) map.get("high");
                    if (qualityList != null) {
                        list = qualityList.qualities;
                    }
                } else {
                    throw new C1954807lC();
                }
            } else {
                PushStreamInfo.QualityList qualityList2 = (PushStreamInfo.QualityList) map.get("default");
                if (qualityList2 != null) {
                    list = qualityList2.qualities;
                }
            }
        } else {
            PushStreamInfo.QualityList qualityList3 = (PushStreamInfo.QualityList) map.get("low");
            if (qualityList3 != null) {
                list = qualityList3.qualities;
            }
        }
        Map<String, Object> map2 = C1338270kvh.LIZ;
        return list;
    }

    public static List LJFF(Map map) {
        long jLongValue;
        Long l;
        List<PreScheduleStream.PushStreamInfo.Quality> list = null;
        if (map == null) {
            return null;
        }
        GameTag gameTagLIZIZ = C754700Tj2.LIZIZ();
        if (gameTagLIZIZ != null && (l = gameTagLIZIZ.id) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = -1;
        }
        C754700Tj2.LIZIZ();
        int i = C1284960jXi.LIZ[LIZIZ(jLongValue).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    PreScheduleStream.PushStreamInfo.QualityList qualityList = (PreScheduleStream.PushStreamInfo.QualityList) map.get("high");
                    if (qualityList != null) {
                        list = qualityList.qualities;
                    }
                } else {
                    throw new C1954807lC();
                }
            } else {
                PreScheduleStream.PushStreamInfo.QualityList qualityList2 = (PreScheduleStream.PushStreamInfo.QualityList) map.get("default");
                if (qualityList2 != null) {
                    list = qualityList2.qualities;
                }
            }
        } else {
            PreScheduleStream.PushStreamInfo.QualityList qualityList3 = (PreScheduleStream.PushStreamInfo.QualityList) map.get("low");
            if (qualityList3 != null) {
                list = qualityList3.qualities;
            }
        }
        Map<String, Object> map2 = C1338270kvh.LIZ;
        return list;
    }
}
