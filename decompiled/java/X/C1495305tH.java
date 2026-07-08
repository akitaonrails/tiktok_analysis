package X;

import com.ss.android.ugc.aweme.im.perf.cls.MessageListCLSTrackerImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05tH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.perf.cls.MessageListCLSTrackerImpl$calculateTotalMovement$1", f = "MessageListCLSTrackerImpl.kt", l = {}, m = "invokeSuspend")
public final class C1495305tH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MessageListCLSTrackerImpl LL;
    public final /* synthetic */ InterfaceC1493105sv LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1495305tH(MessageListCLSTrackerImpl messageListCLSTrackerImpl, InterfaceC1493105sv interfaceC1493105sv, InterfaceC1364105Vn<? super C1495305tH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = messageListCLSTrackerImpl;
        this.LLILLJJLI = interfaceC1493105sv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1495305tH(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        int iIntValue2;
        Integer numLJ;
        Float f;
        int iIntValue3;
        Integer numLJ2;
        C1C7U.LIZ("MessageListCLSTrackerImpl@1d7b.calculateTotalMovement$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C817403Hg c817403Hg = new C817403Hg();
        List<Map<Integer, Pair<Float, Integer>>> list = this.LL.LL;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((Map) it2.next()).keySet(), arrayList);
        }
        Set setLLIIJI = C13LP.LLIIJI(arrayList);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it3 = setLLIIJI.iterator();
        while (it3.hasNext()) {
            int iIntValue4 = ((Number) it3.next()).intValue();
            linkedHashMap.put(C2286608xc.LJ(iIntValue4), new ArrayList());
            linkedHashMap2.put(C2286608xc.LJ(iIntValue4), new ArrayList());
        }
        MessageListCLSTrackerImpl messageListCLSTrackerImpl = this.LL;
        Iterator it4 = setLLIIJI.iterator();
        while (it4.hasNext()) {
            int iIntValue5 = ((Number) it4.next()).intValue();
            Iterator it5 = ((ArrayList) messageListCLSTrackerImpl.LL).iterator();
            Float f2 = null;
            while (it5.hasNext()) {
                Pair pair = (Pair) ((Map) it5.next()).get(C2286608xc.LJ(iIntValue5));
                if (pair != null) {
                    f = (Float) pair.getFirst();
                } else {
                    f = null;
                }
                if (pair != null) {
                    iIntValue3 = ((Number) pair.getSecond()).intValue();
                } else {
                    iIntValue3 = -1;
                }
                if (f2 != null && f != null) {
                    numLJ2 = C2286608xc.LJ((int) (f.floatValue() - f2.floatValue()));
                } else {
                    numLJ2 = null;
                }
                List list2 = (List) linkedHashMap.get(C2286608xc.LJ(iIntValue5));
                if (list2 != null) {
                    Boolean.valueOf(list2.add(numLJ2));
                }
                if (numLJ2 != null && numLJ2.intValue() == 0) {
                    List list3 = (List) linkedHashMap2.get(C2286608xc.LJ(iIntValue5));
                    if (list3 != null) {
                        Boolean.valueOf(list3.add(C2286608xc.LJ(iIntValue3)));
                    }
                } else {
                    List list4 = (List) linkedHashMap2.get(C2286608xc.LJ(iIntValue5));
                    if (list4 != null) {
                        Boolean.valueOf(list4.add(C2286608xc.LJ(-1)));
                    }
                }
                f2 = f;
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            ((Number) entry.getKey()).intValue();
            C13LP.LJJLIIIJ((Iterable) entry.getValue(), " -> ", null, null, 0, null, null, 62);
        }
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            ((Number) entry2.getKey()).intValue();
            C13LP.LJJLIIIJ((Iterable) entry2.getValue(), " -> ", null, null, 0, null, null, 62);
        }
        int size = ((ArrayList) this.LL.LLILLJJLI).size();
        for (int i = 0; i < size; i++) {
            Collection collectionValues = linkedHashMap.values();
            ArrayList arrayList2 = new ArrayList();
            Iterator it6 = collectionValues.iterator();
            while (it6.hasNext()) {
                Integer num = (Integer) C13LP.LJJJLZIJ(i, (List) it6.next());
                if (num != null && (numLJ = C2286608xc.LJ(Math.abs(num.intValue()))) != null) {
                    arrayList2.add(numLJ);
                }
            }
            Integer num2 = (Integer) C13LP.LJJLIIIJLJLI(arrayList2);
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                iIntValue = 0;
            }
            Integer num3 = (Integer) C13LP.LJJJLZIJ(i, this.LL.LLILLJJLI);
            if (num3 != null) {
                iIntValue2 = num3.intValue();
            } else {
                iIntValue2 = 1;
            }
            float f3 = iIntValue2;
            float f4 = iIntValue / f3;
            Collection collectionValues2 = linkedHashMap2.values();
            ArrayList arrayList3 = new ArrayList();
            Iterator it7 = collectionValues2.iterator();
            while (it7.hasNext()) {
                Object objLJJJLZIJ = C13LP.LJJJLZIJ(i, (List) it7.next());
                if (objLJJJLZIJ != null) {
                    arrayList3.add(objLJJJLZIJ);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : arrayList3) {
                if (((Number) obj2).intValue() > 0) {
                    arrayList4.add(obj2);
                }
            }
            c817403Hg.element += f4 * (1 - (C13LP.LJZI(arrayList4) / f3));
        }
        ((ArrayList) this.LL.LL).clear();
        ((ArrayList) this.LL.LLILLJJLI).clear();
        InterfaceC1493105sv interfaceC1493105sv = this.LLILLJJLI;
        MessageListCLSTrackerImpl messageListCLSTrackerImpl2 = this.LL;
        C13DA c13da = new C13DA();
        c13da.put("score", String.valueOf(c817403Hg.element));
        Map<String, String> map = messageListCLSTrackerImpl2.LLILZLL;
        if (map != null) {
            c13da.putAll(map);
        }
        interfaceC1493105sv.sendEvent("im_message_list_cls", c13da.build());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageListCLSTrackerImpl@1d7b.calculateTotalMovement$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
