package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.newrule.model.BeatTrackingData;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.newrule.model.Material;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.newrule.model.MusicSyncResult;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.newrule.model.SamiChorusRes;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.newrule.model.Segment;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.newrule.model.SegmentMin;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.newrule.model.TaskFlow;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.newrule.model.TaskResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.14Lg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20249814Lg {
    public static final C20249814Lg LIZ = new C20249814Lg();
    public static final List<Material> LIZIZ;
    public static final List<Material> LIZJ;
    public static final List<Material> LIZLLL;
    public static final List<Material> LJ;
    public static final List<Material> LJFF;
    public static final List<Material> LJI;
    public static final List<Material> LJII;
    public static final List<Material> LJIIIIZZ;
    public static final List<Material> LJIIIZ;
    public static final List<Material> LJIIJ;
    public static final List<Material> LJIIJJI;
    public static final List<Material> LJIIL;
    public static final List<Material> LJIILIIL;
    public static final List<Material> LJIILJJIL;
    public static final List<Material> LJIILL;
    public static final List<List<Material>> LJIILLIIL;

    static {
        C7740030o.LIZ().getGson();
        EnumC2005707tP enumC2005707tP = EnumC2005707tP.IMAGE;
        EnumC2005707tP enumC2005707tP2 = EnumC2005707tP.VIDEO;
        List<Material> listLJIIJJI = C1697810uHb.LJIIJJI(new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP2, 5.0d), new Material(enumC2005707tP, 0.0d));
        LIZIZ = listLJIIJJI;
        List<Material> listLJIIJJI2 = C1697810uHb.LJIIJJI(new Material(enumC2005707tP2, 5.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP, 0.0d));
        LIZJ = listLJIIJJI2;
        List<Material> listLJIIJJI3 = C1697810uHb.LJIIJJI(new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP2, 5.0d));
        LIZLLL = listLJIIJJI3;
        List<Material> listLJIIJJI4 = C1697810uHb.LJIIJJI(new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP2, 15.0d), new Material(enumC2005707tP, 0.0d));
        LJ = listLJIIJJI4;
        List<Material> listLJIIJJI5 = C1697810uHb.LJIIJJI(new Material(enumC2005707tP2, 15.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP, 0.0d));
        LJFF = listLJIIJJI5;
        List<Material> listLJIIJJI6 = C1697810uHb.LJIIJJI(new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP2, 15.0d));
        LJI = listLJIIJJI6;
        List<Material> listLJIIJJI7 = C1697810uHb.LJIIJJI(new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP2, 40.0d), new Material(enumC2005707tP, 0.0d));
        LJII = listLJIIJJI7;
        List<Material> listLJIIJJI8 = C1697810uHb.LJIIJJI(new Material(enumC2005707tP2, 40.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP, 0.0d));
        LJIIIIZZ = listLJIIJJI8;
        List<Material> listLJIIJJI9 = C1697810uHb.LJIIJJI(new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP2, 40.0d));
        LJIIIZ = listLJIIJJI9;
        List<Material> listLJIIJJI10 = C1697810uHb.LJIIJJI(new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP2, 15.0d), new Material(enumC2005707tP2, 40.0d), new Material(enumC2005707tP2, 5.0d));
        LJIIJ = listLJIIJJI10;
        List<Material> listLJIIJJI11 = C1697810uHb.LJIIJJI(new Material(enumC2005707tP2, 15.0d), new Material(enumC2005707tP2, 40.0d), new Material(enumC2005707tP2, 5.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP, 0.0d));
        LJIIJJI = listLJIIJJI11;
        List<Material> listLJIIJJI12 = C1697810uHb.LJIIJJI(new Material(enumC2005707tP2, 15.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP2, 5.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP2, 40.0d));
        LJIIL = listLJIIJJI12;
        List<Material> listLJIIJJI13 = C1697810uHb.LJIIJJI(new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP2, 5.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP2, 20.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP2, 40.0d), new Material(enumC2005707tP, 0.0d));
        LJIILIIL = listLJIIJJI13;
        List<Material> listLJIIJJI14 = C1697810uHb.LJIIJJI(new Material(enumC2005707tP2, 40.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP2, 5.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP2, 20.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP, 0.0d));
        LJIILJJIL = listLJIIJJI14;
        List<Material> listLJIIJJI15 = C1697810uHb.LJIIJJI(new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP2, 5.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP2, 40.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP2, 20.0d));
        LJIILL = listLJIIJJI15;
        LJIILLIIL = C1697810uHb.LJIIJJI(listLJIIJJI, listLJIIJJI2, listLJIIJJI3, listLJIIJJI4, listLJIIJJI5, listLJIIJJI6, listLJIIJJI7, listLJIIJJI8, listLJIIJJI9, listLJIIJJI10, listLJIIJJI11, listLJIIJJI12, listLJIIJJI13, listLJIIJJI14, listLJIIJJI15);
    }

    public static double LJI(List list) {
        double d;
        double d2 = 0.0d;
        for (Material material : (ArrayList) list) {
            if (material.type == EnumC2005707tP.IMAGE) {
                d = 2.5d;
            } else {
                d = material.duration;
                if (d > 15.0d) {
                    d = 15.0d;
                }
            }
            d2 += d;
        }
        return d2;
    }

    public static SegmentMin LJII(Segment segment) {
        double dDoubleValue;
        Double d = segment.functionProb;
        if (d == null && (d = segment.chorusProb) == null) {
            dDoubleValue = 0.0d;
        } else {
            dDoubleValue = d.doubleValue();
        }
        if ((!segment.interval.isEmpty()) && segment.interval.size() >= 2) {
            List listLJIIJJI = C1697810uHb.LJIIJJI(Double.valueOf(segment.startProb), Double.valueOf(segment.endProb), Double.valueOf(dDoubleValue));
            double dDoubleValue2 = ((Number) ListProtector.get(segment.interval, 0)).doubleValue();
            double d2 = LSPassThroughRecordSizeConfig.DEFAULT;
            return new SegmentMin(listLJIIJJI, C1697810uHb.LJIIJJI(Double.valueOf(dDoubleValue2 * d2), Double.valueOf(((Number) ListProtector.get(segment.interval, 1)).doubleValue() * d2)), segment.functionLabel, segment.functionName, segment.decision);
        }
        return null;
    }

    public static double LJFF(double d, List list) {
        double d2 = LSPassThroughRecordSizeConfig.DEFAULT;
        double d3 = (d - 0.5d) * d2;
        double d4 = (d + 0.5d) * d2;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            List<Double> list2 = ((SegmentMin) obj).intervalMS;
            double dDoubleValue = ((Number) ListProtector.get(list2, 0)).doubleValue();
            double dDoubleValue2 = ((Number) ListProtector.get(list2, 1)).doubleValue();
            if (dDoubleValue <= d4 && dDoubleValue2 >= d3) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((SegmentMin) it2.next()).functionName);
        }
        if (C13LP.LLIIJI(arrayList2).size() >= 2) {
            return 3.0d;
        }
        return 0.0d;
    }

    public static Pair LIZJ(List list, double d, double d2) {
        int i = 0;
        while (i < list.size() && ((Number) ListProtector.get(list, i)).doubleValue() <= d) {
            i++;
        }
        int i2 = i;
        while (i2 < list.size() && ((Number) ListProtector.get(list, i2)).doubleValue() < d2) {
            i2++;
        }
        return new Pair(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static Pair LIZIZ(List list, int i, double d, double d2) {
        ArrayList arrayList;
        while (true) {
            arrayList = (ArrayList) list;
            if (i >= arrayList.size() || ((Number) ListProtector.get(list, i)).doubleValue() >= d) {
                break;
            }
            i++;
        }
        int i2 = i;
        while (i2 < arrayList.size() && ((Number) ListProtector.get(list, i2)).doubleValue() <= d2) {
            i2++;
        }
        return new Pair(Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d1  */
    /* JADX WARN: Type inference failed for: r7v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.newrule.model.BeatTrackingData LIZLLL(java.util.List r36, double r37, com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.newrule.model.BeatTrackingData r39, com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.newrule.model.SamiChorusRes r40) {
        /*
            Method dump skipped, instruction units count: 864
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20249814Lg.LIZLLL(java.util.List, double, com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.newrule.model.BeatTrackingData, com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.newrule.model.SamiChorusRes):com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.newrule.model.BeatTrackingData");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.ArrayList] */
    public static MusicSyncResult LJ(List list, double d, MusicSyncResult musicSyncResult, SamiChorusRes samiChorusRes) {
        Pair pair;
        ?? arrayList;
        List listSubList;
        int iIntValue;
        List<Segment> list2;
        ArrayList arrayList2 = (ArrayList) list;
        int size = arrayList2.size();
        int i = size - 1;
        if (musicSyncResult.predSec.size() < i) {
            return null;
        }
        final List<Double> list3 = musicSyncResult.predSec;
        Map mapLIZ = C08SO.LIZ(new C08SN<Double, Double>() { // from class: X.07jp
            @Override // X.C08SN
            public final Iterator<Double> LIZ() {
                return list3.iterator();
            }

            @Override // X.C08SN
            public final Double LIZIZ(Double d2) {
                return Double.valueOf(d2.doubleValue());
            }
        });
        if (!musicSyncResult.taskFlow.result.isEmpty()) {
            pair = new Pair(C13LP.LL(musicSyncResult.predSec, ((TaskResult) C13LP.LJJJJZI(musicSyncResult.taskFlow.result)).predDim), ((TaskResult) C13LP.LJJJJZI(musicSyncResult.taskFlow.result)).taskType);
        } else {
            pair = new Pair(musicSyncResult.predSec, "");
        }
        List list4 = (List) pair.getFirst();
        String str = (String) pair.getSecond();
        double dMax = Math.max(Math.min(d, LJI(list)), 10.0d);
        ArrayList arrayList3 = new ArrayList(list4);
        C19719612Di.LJJIIJ(arrayList3, new C00HU(dMax), true);
        if (arrayList3.size() < i) {
            return null;
        }
        if (arrayList3.size() == i) {
            return new MusicSyncResult(dMax, arrayList3, new TaskFlow(Collections.singletonList(new TaskResult("", str, arrayList3.size()))));
        }
        if (samiChorusRes != null && (list2 = samiChorusRes.rawSegments) != null) {
            arrayList = new ArrayList();
            for (Segment segment : list2) {
                LIZ.getClass();
                SegmentMin segmentMinLJII = LJII(segment);
                if (segmentMinLJII != null) {
                    arrayList.add(segmentMinLJII);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        ArrayList arrayList4 = new ArrayList(arrayList3);
        ArrayList arrayList5 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        double d2 = 0.0d;
        int iIntValue2 = 0;
        while (it2.hasNext()) {
            Pair<Double, Double> pairLIZ = C1160650gJD.LIZ((Material) it2.next());
            Pair pairLIZIZ = LIZIZ(arrayList4, iIntValue2, d2 + pairLIZ.getFirst().doubleValue(), d2 + pairLIZ.getSecond().doubleValue());
            iIntValue2 = ((Number) pairLIZIZ.getFirst()).intValue();
            int iIntValue3 = ((Number) pairLIZIZ.getSecond()).intValue();
            if (iIntValue2 == arrayList4.size()) {
                break;
            }
            List listSubList2 = arrayList4.subList(iIntValue2, iIntValue3);
            if (!listSubList2.isEmpty()) {
                Iterator it3 = listSubList2.iterator();
                double d3 = -1.0d;
                double d4 = -1.0d;
                while (it3.hasNext()) {
                    double dDoubleValue = ((Number) it3.next()).doubleValue();
                    double dLJFF = LJFF(dDoubleValue, arrayList);
                    Integer num = (Integer) mapLIZ.get(Double.valueOf(dDoubleValue));
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    double d5 = dLJFF + (((double) iIntValue) * 0.2d);
                    if (d5 > d4) {
                        d4 = d5;
                        d3 = dDoubleValue;
                    }
                }
                if (d3 != -1.0d) {
                    arrayList5.add(Double.valueOf(d3));
                    d2 = d3;
                }
            }
        }
        if (arrayList5.size() == i) {
            return new MusicSyncResult(dMax, arrayList5, new TaskFlow(Collections.singletonList(new TaskResult("", str, arrayList5.size()))));
        }
        if (arrayList5.size() == size) {
            return new MusicSyncResult(Math.min(dMax, ((Number) ListProtector.get(arrayList5, i)).doubleValue()), C13LP.LL(arrayList5, i), new TaskFlow(Collections.singletonList(new TaskResult("", str, i))));
        }
        Iterator it4 = list4.iterator();
        while (it4.hasNext()) {
            double dDoubleValue2 = ((Number) it4.next()).doubleValue();
            if (dDoubleValue2 - d2 > 1.5d) {
                arrayList5.add(Double.valueOf(dDoubleValue2));
                if (arrayList5.size() == size) {
                    return new MusicSyncResult(dDoubleValue2, C13LP.LL(arrayList5, i), new TaskFlow(Collections.singletonList(new TaskResult("", str, i))));
                }
                d2 = dDoubleValue2;
            }
        }
        do {
            int size2 = arrayList5.size() - 1;
            while (size2 > 0) {
                int i2 = size2 - 1;
                if (((Number) ListProtector.get(arrayList5, size2)).doubleValue() - ((Number) ListProtector.get(arrayList5, i2)).doubleValue() > 5.0d) {
                    double dDoubleValue3 = ((Number) ListProtector.get(arrayList5, size2 - 1)).doubleValue();
                    double dDoubleValue4 = ((Number) ListProtector.get(arrayList5, size2)).doubleValue();
                    double dRound = Math.round((((dDoubleValue3 + dDoubleValue4) / 2.0d) * ((double) 100)) / 100.0d);
                    Pair pairLIZJ = LIZJ(list4, dDoubleValue3, dDoubleValue4);
                    int iIntValue4 = ((Number) pairLIZJ.getFirst()).intValue();
                    int iIntValue5 = ((Number) pairLIZJ.getSecond()).intValue();
                    if (iIntValue4 < list4.size()) {
                        listSubList = list4.subList(iIntValue4, iIntValue5);
                    } else {
                        listSubList = C13BV.INSTANCE;
                    }
                    Iterator it5 = listSubList.iterator();
                    double d6 = Double.MAX_VALUE;
                    double d7 = 0.0d;
                    while (it5.hasNext()) {
                        double dDoubleValue5 = ((Number) it5.next()).doubleValue();
                        double dAbs = Math.abs(dDoubleValue5 - dRound);
                        if (dAbs < d6) {
                            d7 = dDoubleValue5;
                            d6 = dAbs;
                        }
                    }
                    if (d7 > 0.0d) {
                        dRound = d7;
                    }
                    ListProtector.add(arrayList5, size2, Double.valueOf(dRound));
                } else {
                    size2 = i2;
                }
            }
            return null;
        } while (arrayList5.size() != i);
        return new MusicSyncResult(Math.min(d, d2 + 1.5d), arrayList5, new TaskFlow(Collections.singletonList(new TaskResult("", str, arrayList5.size()))));
    }

    public static BeatTrackingData LIZ(Map map, int i, List list, List list2, List list3, List list4) {
        Object objLJJJLZIJ;
        Object objLJJJLZIJ2;
        Object objLJJJLZIJ3;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Integer num = (Integer) ((LinkedHashMap) map).get(Double.valueOf(((Number) it2.next()).doubleValue()));
            if (num != null && (objLJJJLZIJ3 = C13LP.LJJJLZIJ(num.intValue(), list2)) != null) {
                arrayList.add(objLJJJLZIJ3);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            Integer num2 = (Integer) ((LinkedHashMap) map).get(Double.valueOf(((Number) it3.next()).doubleValue()));
            if (num2 != null && (objLJJJLZIJ2 = C13LP.LJJJLZIJ(num2.intValue(), list3)) != null) {
                arrayList2.add(objLJJJLZIJ2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            Integer num3 = (Integer) ((LinkedHashMap) map).get(Double.valueOf(((Number) it4.next()).doubleValue()));
            if (num3 != null && (objLJJJLZIJ = C13LP.LJJJLZIJ(num3.intValue(), list4)) != null) {
                arrayList3.add(objLJJJLZIJ);
            }
        }
        return new BeatTrackingData(i, arrayList, arrayList2, arrayList3);
    }
}
