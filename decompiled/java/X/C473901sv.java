package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01sv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C473901sv {
    public static boolean LIZ(Object obj, Object obj2) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        if (obj == obj2) {
            if ((obj instanceof Collection) || (obj instanceof Map) || (obj instanceof Object[])) {
                return false;
            }
        } else {
            Boolean boolValueOf4 = null;
            if (((ArrayList) C13LQ.LJIJI(new Object[]{obj, obj2})).size() == 2) {
                boolValueOf = Boolean.valueOf(obj instanceof InterfaceC474001sw);
            } else {
                boolValueOf = null;
            }
            Boolean bool = Boolean.TRUE;
            if (Intrinsics.LJFF(boolValueOf, bool)) {
                return ((InterfaceC474001sw) obj).LIZ();
            }
            if (((ArrayList) C13LQ.LJIJI(new Object[]{obj, obj2})).size() == 2) {
                boolValueOf2 = Boolean.valueOf(obj instanceof List);
            } else {
                boolValueOf2 = null;
            }
            if (Intrinsics.LJFF(boolValueOf2, bool)) {
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list.size() != list2.size()) {
                    return false;
                }
                ListIterator listIterator = list.listIterator();
                ListIterator listIterator2 = list2.listIterator();
                while (listIterator.hasNext() && listIterator2.hasNext()) {
                    if (!LIZ(listIterator.next(), listIterator2.next())) {
                        return false;
                    }
                }
                return true;
            }
            if (((ArrayList) C13LQ.LJIJI(new Object[]{obj, obj2})).size() == 2) {
                boolValueOf3 = Boolean.valueOf(obj instanceof Object[]);
            } else {
                boolValueOf3 = null;
            }
            if (Intrinsics.LJFF(boolValueOf3, bool)) {
                Object[] objArr = (Object[]) obj;
                Object[] objArr2 = (Object[]) obj2;
                if (objArr.length != objArr2.length) {
                    return false;
                }
                C089E c089e = new C089E(objArr);
                C089E c089e2 = new C089E(objArr2);
                while (c089e.hasNext() && c089e2.hasNext()) {
                    if (!LIZ(c089e.next(), c089e2.next())) {
                        return false;
                    }
                }
                return true;
            }
            if (((ArrayList) C13LQ.LJIJI(new Object[]{obj, obj2})).size() == 2) {
                boolValueOf4 = Boolean.valueOf(obj instanceof Map);
            }
            if (Intrinsics.LJFF(boolValueOf4, bool)) {
                Map map = (Map) obj;
                Map map2 = (Map) obj2;
                if (map.size() != map2.size()) {
                    return false;
                }
                Set setEntrySet = map.entrySet();
                if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
                    return true;
                }
                Iterator it2 = setEntrySet.iterator();
                if (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    if (map2.containsKey(key) && LIZ(value, map2.get(key))) {
                        return true;
                    }
                    return false;
                }
            } else {
                return Intrinsics.LJFF(obj2, obj);
            }
        }
        return true;
    }
}
