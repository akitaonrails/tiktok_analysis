package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0WxI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C839980WxI extends C09AY implements Function0<Object> {
    public final /* synthetic */ Object LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C839980WxI(Object obj) {
        super(0);
        this.LL = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Map map;
        Set setEntrySet;
        List list;
        Object objLJJJLL;
        Object obj = this.LL;
        Object obj2 = null;
        if ((obj instanceof Map) && (map = (Map) obj) != null && (setEntrySet = map.entrySet()) != null) {
            Iterator it2 = setEntrySet.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (u.LJIJI((String) ((Map.Entry) next).getKey(), "x-tt-logid", true)) {
                    obj2 = next;
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) obj2;
            if (entry != null && (list = (List) entry.getValue()) != null && (objLJJJLL = C13LP.LJJJLL(list)) != null) {
                return objLJJJLL;
            }
        }
        return "pns-null";
    }
}
