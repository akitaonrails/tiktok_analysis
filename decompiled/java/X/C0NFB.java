package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.coldcache.exp.PlayerCacheSortSetting;
import com.ss.android.ugc.aweme.localcache.database.HistoryVideoInfoStruct;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: renamed from: X.0NFB, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NFB {
    public final int LIZ;
    public final double LIZIZ;
    public final boolean LIZJ;
    public final double LIZLLL;
    public final List<Double> LJ;
    public final List<Double> LJFF;
    public final ConcurrentHashMap<String, Object> LJI;

    public C0NFB(PlayerCacheSortSetting playerCacheSortSetting) {
        this.LIZ = 500;
        this.LIZJ = true;
        this.LIZLLL = 0.001d;
        Double dValueOf = Double.valueOf(0.0d);
        this.LJ = C1697810uHb.LJIIJJI(dValueOf, dValueOf, dValueOf, dValueOf);
        this.LJFF = C13BV.INSTANCE;
        this.LIZ = playerCacheSortSetting.chunkSize;
        this.LIZIZ = playerCacheSortSetting.sortOmega;
        this.LIZLLL = C13LZ.LIZJ(playerCacheSortSetting.sortEPS, 0.001d, 1.0d);
        this.LIZJ = playerCacheSortSetting.adjustSimilar;
        this.LJ = playerCacheSortSetting.picPlayTimeParams;
        this.LJFF = playerCacheSortSetting.sourceWeights;
        this.LJI = new ConcurrentHashMap<>();
    }

    public static List LJI(List list) {
        double dLIZJ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            int i = ((HistoryVideoInfoStruct) it2.next()).videoDuration;
            if (i > 0) {
                dLIZJ = C13LZ.LIZJ(r0.playbackDuration / ((double) i), 0.0d, 1.0d);
            } else {
                dLIZJ = 0.0d;
            }
            arrayList.add(Double.valueOf(dLIZJ));
        }
        return arrayList;
    }

    public static double LJIIIIZZ(C0NF3 c0nf3) {
        C5186020i c5186020i;
        Integer num;
        C590280NDe c590280NDe = c0nf3.LIZ.LIZ;
        if (c590280NDe != null && (c5186020i = c590280NDe.LIZLLL) != null && (num = c5186020i.aweme_type) != null && num.intValue() == 150) {
            if (c0nf3.LIZ.LIZJ() <= 1) {
                return 5.0d;
            }
            return c0nf3.LIZ.LIZJ();
        }
        return c0nf3.LIZ.LIZIZ() / 1000.0d;
    }

    public final double LIZJ(C0NF3 c0nf3) {
        int iIntValue;
        double d = 1;
        double d2 = this.LIZIZ;
        Integer num = c0nf3.LIZ.LJIIIIZZ;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = c0nf3.LIZJ;
        }
        double dMax = Math.max(d + (d2 * ((double) iIntValue)), this.LIZLLL);
        this.LJI.put("cache_pos_weight", Double.valueOf(dMax));
        return dMax;
    }

    public final double LIZLLL(C0NF3 c0nf3) {
        Object objValueOf;
        EnumC590340NDk enumC590340NDk = c0nf3.LIZ.LJIIIZ;
        if (enumC590340NDk == null) {
            enumC590340NDk = EnumC590340NDk.UNKNOWN;
        }
        List<Double> list = this.LJFF;
        int value = enumC590340NDk.getValue();
        if (value >= 0 && value < list.size()) {
            objValueOf = ListProtector.get(list, value);
        } else {
            objValueOf = Double.valueOf(1.0d);
        }
        double dDoubleValue = ((Number) objValueOf).doubleValue();
        this.LJI.put("cache_source_weight", Double.valueOf(dDoubleValue));
        return dDoubleValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x01cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final double LJ(X.C0NF3 r32) {
        /*
            Method dump skipped, instruction units count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NFB.LJ(X.0NF3):double");
    }

    public final double LJII(C0NF3 c0nf3) {
        long jLongValue;
        double dLIZJ;
        Long l = c0nf3.LIZ.LJII;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jLongValue > 0) {
            dLIZJ = C13LZ.LIZJ((jCurrentTimeMillis - jLongValue) / 3600000.0d, 0.0d, 2160.0d);
        } else {
            dLIZJ = 2160.0d;
        }
        this.LJI.put("cache_keep_hour", Double.valueOf(dLIZJ));
        return Math.log1p(dLIZJ);
    }

    public final double LJIIIZ(C0NF3 c0nf3) {
        C590350NDl c590350NDl = c0nf3.LIZ;
        List<HistoryVideoInfoStruct> list = c0nf3.LIZIZ;
        if (list.isEmpty()) {
            return this.LIZLLL;
        }
        List<Double> listLJI = LJI(list);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<HistoryVideoInfoStruct> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Double.valueOf(LIZIZ((List) c590350NDl.LJIILIIL.getValue(), (List) it2.next().LIZ.getValue())));
        }
        List<Double> listLIZ = LIZ(arrayList, listLJI);
        double dDoubleValue = 0.0d;
        for (Pair pair : (ArrayList) C13LP.LLIILII(listLJI, listLIZ)) {
            dDoubleValue += ((Number) pair.getFirst()).doubleValue() * ((Number) pair.getSecond()).doubleValue();
        }
        double dLJLZ = dDoubleValue / C13LP.LJLZ(listLIZ);
        this.LJI.putAll(C2097608Jq.LJIIIIZZ(new Pair("weights", listLJI), new Pair("similar", listLIZ)));
        return dLJLZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.0NFB] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.Map] */
    public final double LJIIJ(C0NF3 c0nf3) {
        ?? linkedHashMap;
        C590350NDl c590350NDl = c0nf3.LIZ;
        List<HistoryVideoInfoStruct> list = c0nf3.LIZIZ;
        if (list.isEmpty()) {
            return this.LIZLLL;
        }
        List listLJI = LJI(list);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (HistoryVideoInfoStruct historyVideoInfoStruct : list) {
            AwS581S0100000_2 awS581S0100000_2 = new AwS581S0100000_2((C0NFB) this, 718);
            arrayList.add(Double.valueOf(LIZIZ((List) awS581S0100000_2.invoke(c590350NDl.LJIILJJIL.getValue()), (List) awS581S0100000_2.invoke(historyVideoInfoStruct.LIZIZ.getValue()))));
        }
        List<Double> listLIZ = LIZ(arrayList, listLJI);
        double dDoubleValue = 0.0d;
        for (Pair pair : (ArrayList) C13LP.LLIILII(listLJI, listLIZ)) {
            dDoubleValue += ((Number) pair.getFirst()).doubleValue() * ((Number) pair.getSecond()).doubleValue();
        }
        double dLJLZ = dDoubleValue / C13LP.LJLZ(listLIZ);
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("weights", listLJI), new Pair("stats", listLIZ));
        Map mapLJIIL = C2097608Jq.LJIIL((Map) c590350NDl.LJIILJJIL.getValue(), (Map) c590350NDl.LJIILLIIL.getValue());
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (HistoryVideoInfoStruct historyVideoInfoStruct2 : list) {
            arrayList2.add(C2097608Jq.LJIIL((Map) historyVideoInfoStruct2.LIZIZ.getValue(), (Map) historyVideoInfoStruct2.LIZJ.getValue()));
        }
        if (arrayList2.isEmpty()) {
            linkedHashMap = C2097608Jq.LJ();
        } else {
            Set setKeySet = ((Map) C13LP.LJJJJZI(arrayList2)).keySet();
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(setKeySet, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            linkedHashMap = new LinkedHashMap(iLIZIZ);
            for (Object obj : setKeySet) {
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(C2097608Jq.LJFF(obj, (Map) it2.next()));
                }
                linkedHashMap.put(obj, arrayList3);
            }
        }
        this.LJI.putAll(C2097608Jq.LJIIL(C2097608Jq.LJIIL(mapLJIIIIZZ, linkedHashMap), mapLJIIL));
        return dLJLZ;
    }

    public final List<Double> LIZ(List<Double> list, List<Double> list2) {
        Double dLJJZ;
        if (this.LIZJ && !((ArrayList) list).isEmpty()) {
            ArrayList arrayList = (ArrayList) list2;
            if (!arrayList.isEmpty() && (dLJJZ = C13LP.LJJZ(list2)) != null) {
                double dDoubleValue = dLJJZ.doubleValue();
                Double dLJJLIIIJLLLLLLLZ = C13LP.LJJLIIIJLLLLLLLZ(list);
                if (dLJJLIIIJLLLLLLLZ == null || !C593360NPa.LIZLLL(Double.valueOf(dLJJLIIIJLLLLLLLZ.doubleValue()), Double.valueOf(this.LIZLLL))) {
                    return list;
                }
                ArrayList arrayList2 = new ArrayList(list);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (C593360NPa.LIZLLL((Number) ListProtector.get(list2, i), Double.valueOf(dDoubleValue))) {
                        ListProtector.set(arrayList2, i, Double.valueOf(1.0d));
                    }
                }
                return arrayList2;
            }
        }
        return list;
    }

    public final double LIZIZ(List<Double> list, List<Double> list2) {
        double dDoubleValue = 0.0d;
        for (Pair pair : C13LP.LLIILII(list, list2)) {
            dDoubleValue += ((Number) pair.getFirst()).doubleValue() * ((Number) pair.getSecond()).doubleValue();
        }
        Iterator<Double> it2 = list.iterator();
        double d = 0.0d;
        while (it2.hasNext()) {
            double dDoubleValue2 = it2.next().doubleValue();
            d += dDoubleValue2 * dDoubleValue2;
        }
        double dSqrt = Math.sqrt(d);
        Iterator<Double> it3 = list2.iterator();
        double d2 = 0.0d;
        while (it3.hasNext()) {
            double dDoubleValue3 = it3.next().doubleValue();
            d2 += dDoubleValue3 * dDoubleValue3;
        }
        double dSqrt2 = dSqrt * Math.sqrt(d2);
        if (dSqrt2 == 0.0d) {
            return this.LIZLLL;
        }
        return Math.max(dDoubleValue / dSqrt2, this.LIZLLL);
    }

    public final double LJFF(C0NF3 c0nf3, C0NFD c0nfd, double d, double d2) {
        Function1 c0nia;
        double dDoubleValue;
        Object objPutIfAbsent;
        Object objPutIfAbsent2;
        switch (C0NFE.LIZ[c0nfd.ordinal()]) {
            case 1:
                c0nia = new C0NI7(this);
                dDoubleValue = ((Number) c0nia.invoke(c0nf3)).doubleValue();
                break;
            case 2:
                c0nia = new C0NI8(this);
                dDoubleValue = ((Number) c0nia.invoke(c0nf3)).doubleValue();
                break;
            case 3:
                c0nia = new C0NI5(this);
                dDoubleValue = ((Number) c0nia.invoke(c0nf3)).doubleValue();
                break;
            case 4:
                c0nia = new C0NIB(this);
                dDoubleValue = ((Number) c0nia.invoke(c0nf3)).doubleValue();
                break;
            case 5:
                c0nia = new C0NIC(this);
                dDoubleValue = ((Number) c0nia.invoke(c0nf3)).doubleValue();
                break;
            case 6:
                c0nia = new C0NID(this);
                dDoubleValue = ((Number) c0nia.invoke(c0nf3)).doubleValue();
                break;
            case 7:
                c0nia = new C0NIE(this);
                dDoubleValue = ((Number) c0nia.invoke(c0nf3)).doubleValue();
                break;
            case 8:
                c0nia = new C0NI6(this);
                dDoubleValue = ((Number) c0nia.invoke(c0nf3)).doubleValue();
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                c0nia = new C0NIF(this);
                dDoubleValue = ((Number) c0nia.invoke(c0nf3)).doubleValue();
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                c0nia = new C0NI9(this);
                dDoubleValue = ((Number) c0nia.invoke(c0nf3)).doubleValue();
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                c0nia = new C0NIA(this);
                dDoubleValue = ((Number) c0nia.invoke(c0nf3)).doubleValue();
                break;
            default:
                dDoubleValue = 0.0d;
                break;
        }
        if (d2 > d) {
            dDoubleValue = C13LZ.LIZJ((dDoubleValue - d) / (d2 - d), 0.0d, 1.0d);
        }
        ConcurrentHashMap<String, Object> concurrentHashMap = this.LJI;
        Object arrayList = concurrentHashMap.get("dimension");
        if (arrayList == null && (objPutIfAbsent2 = concurrentHashMap.putIfAbsent("dimension", (arrayList = new ArrayList()))) != null) {
            arrayList = objPutIfAbsent2;
        }
        C19719512Dh.LIZIZ(arrayList).add(Integer.valueOf(c0nfd.getValue()));
        ConcurrentHashMap<String, Object> concurrentHashMap2 = this.LJI;
        Object arrayList2 = concurrentHashMap2.get("feature");
        if (arrayList2 == null && (objPutIfAbsent = concurrentHashMap2.putIfAbsent("feature", (arrayList2 = new ArrayList()))) != null) {
            arrayList2 = objPutIfAbsent;
        }
        C19719512Dh.LIZIZ(arrayList2).add(Double.valueOf(dDoubleValue));
        return dDoubleValue;
    }
}
