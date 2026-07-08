package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.00n5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C182900n5 implements InterfaceC20041513bJ {
    public final Function1<Object, Boolean> LIZ;
    public final Map<String, List<Object>> LIZIZ;
    public final Map<String, List<Function0<Object>>> LIZJ;

    @Override // X.InterfaceC20041513bJ
    public final Map<String, List<Object>> g4() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.LIZIZ);
        for (Map.Entry entry : ((LinkedHashMap) this.LIZJ).entrySet()) {
            Object key = entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() == 1) {
                Object objInvoke = ((Function0) ListProtector.get(list, 0)).invoke();
                if (objInvoke == null) {
                    continue;
                } else {
                    if (!LIZ(objInvoke)) {
                        "Check failed.".toString();
                        throw new IllegalStateException("Check failed.");
                    }
                    linkedHashMap.put(key, C1697810uHb.LJ(objInvoke));
                }
            } else {
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    Object objInvoke2 = ((Function0) ListProtector.get(list, i)).invoke();
                    if (objInvoke2 != null && !LIZ(objInvoke2)) {
                        "Check failed.".toString();
                        throw new IllegalStateException("Check failed.");
                    }
                    arrayList.add(objInvoke2);
                }
                linkedHashMap.put(key, arrayList);
            }
        }
        return linkedHashMap;
    }

    @Override // X.InterfaceC20041513bJ
    public final boolean LIZ(Object obj) {
        return this.LIZ.invoke(obj).booleanValue();
    }

    @Override // X.InterfaceC20041513bJ
    public final Object LIZJ(String str) {
        List<Object> listRemove = this.LIZIZ.remove(str);
        if (listRemove != null && (!listRemove.isEmpty())) {
            if (listRemove.size() > 1) {
                this.LIZIZ.put(str, listRemove.subList(1, listRemove.size()));
            }
            return ListProtector.get(listRemove, 0);
        }
        return null;
    }

    public C182900n5(Map<String, ? extends List<? extends Object>> map, Function1<Object, Boolean> function1) {
        LinkedHashMap linkedHashMap;
        this.LIZ = function1;
        if (map != null) {
            linkedHashMap = new LinkedHashMap(map);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        this.LIZIZ = linkedHashMap;
        this.LIZJ = new LinkedHashMap();
    }

    @Override // X.InterfaceC20041513bJ
    public final InterfaceC20041313bH LIZIZ(final String str, final Function0<? extends Object> function0) {
        if (!a0.LJJJIL(str)) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.LIZJ;
            Object arrayList = linkedHashMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(str, arrayList);
            }
            ((List) arrayList).add(function0);
            return new InterfaceC20041313bH() { // from class: X.00n6
                @Override // X.InterfaceC20041313bH
                public final void LJI() {
                    List<Function0<Object>> listRemove = this.LIZ.LIZJ.remove(str);
                    if (listRemove != null) {
                        listRemove.remove(function0);
                        if (!listRemove.isEmpty()) {
                            this.LIZ.LIZJ.put(str, listRemove);
                        }
                    }
                }
            };
        }
        "Registered key is empty or blank".toString();
        throw new IllegalArgumentException("Registered key is empty or blank");
    }
}
