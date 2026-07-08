package X;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0W63, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W63 extends C09AY implements Function0<C0W62> {
    public final /* synthetic */ AbstractC207072161e LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0W63(AbstractC207072161e abstractC207072161e) {
        super(0);
        this.LL = abstractC207072161e;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0W62] */
    @Override // kotlin.jvm.functions.Function0
    public final C0W62 invoke() {
        final AbstractC207072161e abstractC207072161e = this.LL;
        return new CopyOnWriteArraySet<InterfaceC1282004zy>() { // from class: X.0W62
            public /* bridge */ int getSize() {
                return super.size();
            }

            @Override // java.util.concurrent.CopyOnWriteArraySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final /* bridge */ int size() {
                return getSize();
            }

            @Override // java.util.concurrent.CopyOnWriteArraySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean add(InterfaceC1282004zy interfaceC1282004zy) {
                if (interfaceC1282004zy != null) {
                    AbstractC207072161e abstractC207072161e2 = abstractC207072161e;
                    abstractC207072161e2.getClass();
                    Class[] clsArrLIZ = C2806016u.LIZ(abstractC207072161e2.getClass().getName());
                    if (clsArrLIZ != null && C13LQ.LJJIJIIJI(interfaceC1282004zy.getClass(), clsArrLIZ) >= 0) {
                        Map<String, C2805016t> mapLIZJ = abstractC207072161e2.LIZJ();
                        Iterator<T> it2 = interfaceC1282004zy.filteredParams().entrySet().iterator();
                        while (it2.hasNext()) {
                            Map.Entry entry = (Map.Entry) it2.next();
                            abstractC207072161e2.LJI(entry.getValue(), (String) entry.getKey());
                        }
                        for (Map.Entry<String, Object> entry2 : interfaceC1282004zy.getExtraParam().entrySet()) {
                            String key = entry2.getKey();
                            Object value = entry2.getValue();
                            if (interfaceC1282004zy.checkExtraParamKey()) {
                                if (mapLIZJ.containsKey(key)) {
                                    abstractC207072161e2.LJI(value, key);
                                }
                            } else {
                                abstractC207072161e2.LJI(value, key);
                            }
                        }
                        for (Map.Entry<String, Object> entry3 : interfaceC1282004zy.getExtraParam().entrySet()) {
                            abstractC207072161e2.LJI(entry3.getValue(), entry3.getKey());
                        }
                    }
                }
                return super.add(interfaceC1282004zy);
            }

            @Override // java.util.concurrent.CopyOnWriteArraySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final /* bridge */ boolean contains(Object obj) {
                if (obj != null && !(obj instanceof InterfaceC1282004zy)) {
                    return false;
                }
                return contains((InterfaceC1282004zy) obj);
            }

            @Override // java.util.concurrent.CopyOnWriteArraySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final /* bridge */ boolean remove(Object obj) {
                if (obj != null && !(obj instanceof InterfaceC1282004zy)) {
                    return false;
                }
                return remove((InterfaceC1282004zy) obj);
            }

            public /* bridge */ boolean contains(InterfaceC1282004zy interfaceC1282004zy) {
                return super.contains((Object) interfaceC1282004zy);
            }

            public /* bridge */ boolean remove(InterfaceC1282004zy interfaceC1282004zy) {
                return super.remove((Object) interfaceC1282004zy);
            }
        };
    }
}
