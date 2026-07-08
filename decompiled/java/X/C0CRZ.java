package X;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CRZ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.ecommerce.useract.UserActManagerNew$updateUserActionData$1", f = "UserActManagerNew.kt", l = {}, m = "invokeSuspend")
public final class C0CRZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Map<String, Object> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CRZ(String str, String str2, Map<String, Object> map, InterfaceC1364105Vn<? super C0CRZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CRZ(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int size;
        Map map;
        C1C7U.LIZ("UserActManagerNew@7129.updateUserActionData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2232408os c2232408os = C341050DYp.LIZ;
        String str = this.LL;
        String str2 = this.LLILLJJLI;
        Map<String, Object> map2 = this.LLILLL;
        Map<String, LinkedList<Map<String, Object>>> map3 = C341050DYp.LJFF;
        LinkedHashMap linkedHashMap = (LinkedHashMap) map3;
        if (linkedHashMap.get(str) == null) {
            map3.put(str, new LinkedList<>());
        }
        Map<String, Map<String, C313600CRa>> map4 = C341050DYp.LJ;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) map4;
        if (linkedHashMap2.get(str) == null) {
            map4.put(str, new LinkedHashMap());
        }
        Map map5 = (Map) linkedHashMap2.get(str);
        Object obj2 = null;
        C313600CRa c313600CRa = null;
        if (map5 != null && map5.get(str2) != null) {
            Map map6 = (Map) linkedHashMap2.get(str);
            if (map6 != null) {
                c313600CRa = (C313600CRa) map6.get(str2);
            }
            for (Map.Entry<String, Object> entry : map2.entrySet()) {
                if (c313600CRa != null) {
                    c313600CRa.LIZ(entry.getValue(), str, entry.getKey());
                }
            }
            LinkedHashMap linkedHashMap3 = (LinkedHashMap) C341050DYp.LJFF;
            LinkedList linkedList = (LinkedList) linkedHashMap3.get(str);
            if (linkedList != null) {
                linkedList.remove(c313600CRa.LIZ);
            }
            LinkedList linkedList2 = (LinkedList) linkedHashMap3.get(str);
            if (linkedList2 != null) {
                linkedList2.addFirst(c313600CRa.LIZ);
            }
        } else {
            LinkedList linkedList3 = (LinkedList) linkedHashMap.get(str);
            if (linkedList3 != null) {
                size = linkedList3.size();
            } else {
                size = 0;
            }
            if (size >= C0C90.LIZ(str)) {
                LinkedList linkedList4 = (LinkedList) linkedHashMap.get(str);
                if (linkedList4 != null) {
                    map = (Map) linkedList4.removeLast();
                } else {
                    map = null;
                }
                Map map7 = (Map) linkedHashMap2.get(str);
                if (map7 != null) {
                    if (map != null) {
                        obj2 = map.get(((LinkedHashMap) C341050DYp.LIZLLL).get(str));
                    }
                    map7.remove(String.valueOf(obj2));
                }
            }
            C313600CRa c313600CRa2 = new C313600CRa(map2);
            LinkedList linkedList5 = (LinkedList) linkedHashMap.get(str);
            if (linkedList5 != null) {
                linkedList5.addFirst(map2);
            }
            Map map8 = (Map) linkedHashMap2.get(str);
            if (map8 != null) {
                map8.put(str2, c313600CRa2);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UserActManagerNew@7129.updateUserActionData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
