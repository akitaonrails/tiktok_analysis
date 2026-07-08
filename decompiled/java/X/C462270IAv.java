package X;

import com.bytedance.im.core.proto.ReferenceInfo;
import com.ss.android.ugc.aweme.im.service.impl.AwemeCardManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0IAv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.service.impl.AwemeCardManager$queryQuotedMsgList$1", f = "AwemeCardManager.kt", l = {}, m = "invokeSuspend")
public final class C462270IAv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ List<C869590Y9l> LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C462270IAv(String str, List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C462270IAv c462270IAv = new C462270IAv(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
        c462270IAv.LL = obj;
        return c462270IAv;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String conversationId;
        int iIntValue;
        Long l;
        C0YUT c0yut;
        C1C7U.LIZ("AwemeCardManager@84f0.queryQuotedMsgList$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<C869590Y9l> list = this.LLILLJJLI;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C869590Y9l> it2 = list.iterator();
        while (true) {
            long refMsgId = 0;
            if (!it2.hasNext()) {
                break;
            }
            C869590Y9l next = it2.next();
            AwemeCardManager.LIZIZ.getClass();
            ReferenceInfo referenceInfo = next.getReferenceInfo();
            if (referenceInfo != null && (l = referenceInfo.ref_message_type) != null && ((int) l.longValue()) == 1809 && ((c0yut = referenceInfo.referenced_message_status) != C0YUT.DELETED || c0yut != C0YUT.NOT_EXIST)) {
                refMsgId = next.getRefMsgId();
            }
            arrayList.add(new Pair(C2286608xc.LJFF(refMsgId), next));
        }
        ArrayList<Pair> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((Number) ((Pair) obj2).getFirst()).longValue() > 0) {
                arrayList2.add(obj2);
            }
        }
        for (Pair pair : arrayList2) {
            long jLongValue = ((Number) pair.getFirst()).longValue();
            Object second = pair.getSecond();
            List list2 = (List) linkedHashMap.get(C2286608xc.LJFF(jLongValue));
            if (list2 != null) {
                Boolean.valueOf(list2.add(second));
            } else {
                linkedHashMap.put(C2286608xc.LJFF(jLongValue), new ArrayList(Collections.singletonList(second)));
            }
        }
        if (linkedHashMap.isEmpty()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AwemeCardManager@84f0.queryQuotedMsgList$1");
            return unit;
        }
        AwemeCardManager.LIZIZ.getClass();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            long jLongValue2 = ((Number) entry.getKey()).longValue();
            Collection<? extends C869590Y9l> collection = (Collection) entry.getValue();
            ConcurrentHashMap<Long, List<C869590Y9l>> concurrentHashMap = AwemeCardManager.LJ;
            List<C869590Y9l> list3 = concurrentHashMap.get(Long.valueOf(jLongValue2));
            if (list3 != null) {
                list3.addAll(collection);
            } else {
                concurrentHashMap.put(Long.valueOf(jLongValue2), collection);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            long jLongValue3 = ((Number) entry2.getKey()).longValue();
            List list4 = (List) entry2.getValue();
            C869590Y9l c869590Y9lLIZIZ = C875230YVd.LIZIZ(String.valueOf(jLongValue3));
            if (c869590Y9lLIZIZ != null) {
                AwemeCardManager.LIZIZ.getClass();
                AwemeCardManager.LJII(c869590Y9lLIZIZ, list4);
                arrayList4.add(c869590Y9lLIZIZ);
            } else {
                ConcurrentHashMap<String, Integer> concurrentHashMap2 = AwemeCardManager.LJII;
                Integer num = concurrentHashMap2.get(String.valueOf(jLongValue3));
                if (num == null || num.intValue() < 2) {
                    C869590Y9l c869590Y9l = new C869590Y9l();
                    c869590Y9l.setMsgId(jLongValue3);
                    arrayList3.add(c869590Y9l);
                    Integer num2 = concurrentHashMap2.get(String.valueOf(jLongValue3));
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    concurrentHashMap2.put(String.valueOf(jLongValue3), C2286608xc.LJ(iIntValue + 1));
                }
            }
        }
        C869590Y9l c869590Y9l2 = (C869590Y9l) C13LP.LJJJLL(arrayList4);
        if (c869590Y9l2 != null && (conversationId = c869590Y9l2.getConversationId()) != null) {
            C1336205Ku.LIZ(false).getMessageRefreshManager().LIZJ(conversationId, arrayList4);
        }
        if (!arrayList3.isEmpty()) {
            C0YNY.LIZ(InterfaceC874680YTa.LIZ).LJIIIZ(new C463020IDs(linkedHashMap, 1), this.LLILLL, arrayList3);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AwemeCardManager@84f0.queryQuotedMsgList$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
