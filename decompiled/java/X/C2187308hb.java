package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.perf.fmp.IMMessageListFMPTrackerImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.08hb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.perf.fmp.IMMessageListFMPTrackerImpl$trackFMP$2", f = "IMMessageListFMPTrackerImpl.kt", l = {}, m = "invokeSuspend")
public final class C2187308hb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ IMMessageListFMPTrackerImpl LL;
    public final /* synthetic */ Map<String, String> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2187308hb(IMMessageListFMPTrackerImpl iMMessageListFMPTrackerImpl, Map<String, String> map, InterfaceC1364105Vn<? super C2187308hb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = iMMessageListFMPTrackerImpl;
        this.LLILLJJLI = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2187308hb(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        IMMessageListFMPTrackerImpl.FMPResult success;
        Object next;
        Object next2;
        EnumC2187408hc enumC2187408hc;
        Long lValueOf;
        Long lValueOf2;
        String str;
        C1C7U.LIZ("IMMessageListFMPTrackerImpl@59c5.trackFMP$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IMMessageListFMPTrackerImpl iMMessageListFMPTrackerImpl = this.LL;
        if (iMMessageListFMPTrackerImpl.LIZIZ == -1) {
            success = C1915607es.INSTANCE;
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            long j = iMMessageListFMPTrackerImpl.LIZIZ;
            Map map = (Map) iMMessageListFMPTrackerImpl.LJFF.getValue();
            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (iMMessageListFMPTrackerImpl.LIZJ.contains(entry.getKey())) {
                    linkedHashMap5.put(entry.getKey(), entry.getValue());
                }
            }
            for (Map.Entry entry2 : linkedHashMap5.entrySet()) {
                Object key = entry2.getKey();
                InterfaceC2187708hf interfaceC2187708hf = (InterfaceC2187708hf) entry2.getValue();
                linkedHashMap2.put(key, interfaceC2187708hf);
                List<InterfaceC2187908hh> listLIZIZ = interfaceC2187708hf.LIZIZ();
                List list = (List) ((Map) iMMessageListFMPTrackerImpl.LJI.getValue()).get(key);
                if (list == null) {
                    Object arrayList = linkedHashMap4.get(key);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap4.put(key, arrayList);
                    }
                    List list2 = (List) arrayList;
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLIZIZ, 10));
                    Iterator<InterfaceC2187908hh> it2 = listLIZIZ.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(new IMMessageListFMPTrackerImpl.ComponentNotRendered(it2.next(), EnumC2187408hc.TIMEOUT));
                    }
                    list2.addAll(arrayList2);
                } else {
                    for (InterfaceC2187908hh interfaceC2187908hh : listLIZIZ) {
                        Iterator it3 = list.iterator();
                        while (true) {
                            next = null;
                            if (it3.hasNext()) {
                                next2 = it3.next();
                                if (Intrinsics.LJFF(((C2187508hd) next2).LIZ.LJJJ(), interfaceC2187908hh)) {
                                    break;
                                }
                            } else {
                                next2 = null;
                                break;
                            }
                        }
                        C2187508hd c2187508hd = (C2187508hd) next2;
                        if (c2187508hd == null) {
                            Object arrayList3 = linkedHashMap4.get(key);
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                                linkedHashMap4.put(key, arrayList3);
                            }
                            ((List) arrayList3).add(new IMMessageListFMPTrackerImpl.ComponentNotRendered(interfaceC2187908hh, EnumC2187408hc.TIMEOUT));
                        } else {
                            C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
                            long j2 = iMMessageListFMPTrackerImpl.LJII;
                            if (j2 != -1 && c2187508hd.LIZIZ > j2 && (lValueOf2 = Long.valueOf(j2)) != null) {
                                c13dvLIZIZ.add(new Pair(EnumC2187408hc.INTERRUPTED, Long.valueOf(lValueOf2.longValue())));
                            }
                            Long l = (Long) ((Map) iMMessageListFMPTrackerImpl.LJ.getValue()).get(key);
                            if (l != null && c2187508hd.LIZIZ > l.longValue()) {
                                c13dvLIZIZ.add(new Pair(EnumC2187408hc.OUT_OF_SCREEN, Long.valueOf(l.longValue())));
                            }
                            long j3 = c2187508hd.LIZIZ;
                            if (j3 - iMMessageListFMPTrackerImpl.LIZIZ > 10000 && (lValueOf = Long.valueOf(j3)) != null) {
                                c13dvLIZIZ.add(new Pair(EnumC2187408hc.TIMEOUT, Long.valueOf(lValueOf.longValue())));
                            }
                            Iterator it4 = C1697820uHc.LIZ(c13dvLIZIZ).iterator();
                            if (it4.hasNext()) {
                                next = it4.next();
                                if (it4.hasNext()) {
                                    long jLongValue = ((Number) ((Pair) next).getSecond()).longValue();
                                    do {
                                        Object next3 = it4.next();
                                        long jLongValue2 = ((Number) ((Pair) next3).getSecond()).longValue();
                                        if (jLongValue > jLongValue2) {
                                            next = next3;
                                            jLongValue = jLongValue2;
                                        }
                                    } while (it4.hasNext());
                                }
                            }
                            Pair pair = (Pair) next;
                            if (pair != null && (enumC2187408hc = (EnumC2187408hc) pair.getFirst()) != null) {
                                Object arrayList4 = linkedHashMap4.get(key);
                                if (arrayList4 == null) {
                                    arrayList4 = new ArrayList();
                                    linkedHashMap4.put(key, arrayList4);
                                }
                                ((List) arrayList4).add(new IMMessageListFMPTrackerImpl.ComponentNotRendered(interfaceC2187908hh, enumC2187408hc));
                            } else {
                                Object arrayList5 = linkedHashMap.get(key);
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                    linkedHashMap.put(key, arrayList5);
                                }
                                ((List) arrayList5).add(c2187508hd.LIZ.LIZ());
                                Object arrayList6 = linkedHashMap3.get(key);
                                if (arrayList6 == null) {
                                    arrayList6 = new ArrayList();
                                    linkedHashMap3.put(key, arrayList6);
                                }
                                ((List) arrayList6).add(new IMMessageListFMPTrackerImpl.ComponentCompletionTime(interfaceC2187708hf, c2187508hd.LIZ, c2187508hd.LIZIZ - iMMessageListFMPTrackerImpl.LIZIZ));
                                long j4 = c2187508hd.LIZIZ;
                                if (j4 > j) {
                                    j = j4;
                                }
                            }
                        }
                    }
                }
            }
            if (!((ArrayList) C15438062q.LJIJJLI(linkedHashMap4.values())).isEmpty()) {
                success = new IMMessageListFMPTrackerImpl.FMPResult.Failed(Long.valueOf(Math.min(iMMessageListFMPTrackerImpl.LJII, iMMessageListFMPTrackerImpl.LIZIZ + 10000) - iMMessageListFMPTrackerImpl.LIZIZ), linkedHashMap2, linkedHashMap, linkedHashMap3, linkedHashMap4);
            } else {
                success = new IMMessageListFMPTrackerImpl.FMPResult.Success(Long.valueOf(j - iMMessageListFMPTrackerImpl.LIZIZ), linkedHashMap2, linkedHashMap, linkedHashMap3);
            }
        }
        IMMessageListFMPTrackerImpl iMMessageListFMPTrackerImpl2 = this.LL;
        C1807710x8r c1807710x8r = iMMessageListFMPTrackerImpl2.LIZ;
        int size = iMMessageListFMPTrackerImpl2.LIZJ.size();
        Map<String, String> map2 = this.LLILLJJLI;
        C0I0B.LJFF.LIZIZ();
        c1807710x8r.getClass();
        if (!(success instanceof C1915607es)) {
            String strLJ = C051M.LJ(success, false);
            Pair[] pairArr = new Pair[4];
            pairArr[0] = new Pair("total_time", String.valueOf(success.getTotalTime()));
            pairArr[1] = new Pair("extra", strLJ);
            if (success.getSuccess()) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            pairArr[2] = new Pair("is_success", str);
            pairArr[3] = new Pair("num_messages_on_screen", String.valueOf(size));
            Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
            if (success instanceof IMMessageListFMPTrackerImpl.FMPResult.Success) {
                IMMessageListFMPTrackerImpl.ComponentCompletionTime mostTimeConsumingComponent = ((IMMessageListFMPTrackerImpl.FMPResult.Success) success).getMostTimeConsumingComponent();
                if (mostTimeConsumingComponent != null) {
                    mapLJIIJ.put("most_time_consuming_meaningful_component_id", mostTimeConsumingComponent.meaningfulComponent.LIZ());
                    mapLJIIJ.put("most_time_consuming_component_id", mostTimeConsumingComponent.reportableComponent.LJJJ().LIZ());
                    mapLJIIJ.put("most_time_consuming_reportable_component_id", mostTimeConsumingComponent.reportableComponent.LIZ());
                }
            } else if (success instanceof IMMessageListFMPTrackerImpl.FMPResult.Failed) {
                mapLJIIJ.put("is_success", CardStruct.IStatusCode.DEFAULT);
                mapLJIIJ.put("load_rate", String.valueOf(((IMMessageListFMPTrackerImpl.FMPResult.Failed) success).getLoadRate()));
            } else if (!Intrinsics.LJFF(success, C1915607es.INSTANCE)) {
                throw new C1954807lC();
            }
            mapLJIIJ.putAll(map2);
            C20684815ws.LJIILLIIL("im_message_list_fmp", mapLJIIJ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMMessageListFMPTrackerImpl@59c5.trackFMP$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
