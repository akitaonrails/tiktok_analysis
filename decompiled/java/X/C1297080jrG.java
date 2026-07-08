package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0jrG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1297080jrG {
    public static final List<InterfaceC1296930jr1> LIZLLL;
    public final List<InterfaceC1296930jr1> LIZ;
    public final ThreadLocal<List<C1296990jr7<?>>> LIZIZ = new ThreadLocal<>();
    public final Map<Object, AbstractC1296960jr4<?>> LIZJ = new LinkedHashMap();

    static {
        ArrayList arrayList = new ArrayList(5);
        LIZLLL = arrayList;
        arrayList.add(C1296890jqx.LIZ);
        arrayList.add(AbstractC1297070jrF.LIZIZ);
        arrayList.add(C1297020jrA.LIZJ);
        arrayList.add(C1297100jrI.LIZJ);
        arrayList.add(C1297090jrH.LIZLLL);
    }

    public C1297080jrG(C1297170jrP c1297170jrP) {
        int size = ((ArrayList) c1297170jrP.LIZ).size();
        List<InterfaceC1296930jr1> list = LIZLLL;
        ArrayList arrayList = new ArrayList(size + ((ArrayList) list).size());
        arrayList.addAll(c1297170jrP.LIZ);
        arrayList.addAll(list);
        this.LIZ = Collections.unmodifiableList(arrayList);
    }

    public final <T> AbstractC1296960jr4<T> LIZ(Type type, Set<? extends Annotation> set) {
        Object objAsList;
        Type typeLIZ = C1297410jrn.LIZ(type);
        if (set.isEmpty()) {
            objAsList = typeLIZ;
        } else {
            objAsList = Arrays.asList(typeLIZ, set);
        }
        synchronized (this.LIZJ) {
            try {
                AbstractC1296960jr4<T> abstractC1296960jr4 = (AbstractC1296960jr4) ((LinkedHashMap) this.LIZJ).get(objAsList);
                if (abstractC1296960jr4 != null) {
                    return abstractC1296960jr4;
                }
                List<C1296990jr7<?>> arrayList = this.LIZIZ.get();
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        C1296990jr7 c1296990jr7 = (C1296990jr7) ListProtector.get(arrayList, i);
                        if (c1296990jr7.LIZ.equals(objAsList)) {
                            return c1296990jr7;
                        }
                    }
                } else {
                    arrayList = new ArrayList<>();
                    this.LIZIZ.set(arrayList);
                }
                C1296990jr7<?> c1296990jr72 = new C1296990jr7<>(objAsList);
                arrayList.add(c1296990jr72);
                try {
                    int size2 = this.LIZ.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        C1296970jr5 c1296970jr5 = (AbstractC1296960jr4<T>) this.LIZ.get(i2).LIZ(typeLIZ, set, this);
                        if (c1296970jr5 != null) {
                            c1296990jr72.LIZIZ = c1296970jr5;
                            c1296990jr72.LIZ = null;
                            synchronized (this.LIZJ) {
                                try {
                                    this.LIZJ.put(objAsList, c1296970jr5);
                                } finally {
                                }
                            }
                            ListProtector.remove(arrayList, arrayList.size() - 1);
                            if (arrayList.isEmpty()) {
                                this.LIZIZ.remove();
                            }
                            return c1296970jr5;
                        }
                    }
                    ListProtector.remove(arrayList, arrayList.size() - 1);
                    if (arrayList.isEmpty()) {
                        this.LIZIZ.remove();
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("No JsonAdapter for ");
                    sbLIZ.append(typeLIZ);
                    sbLIZ.append(" annotated ");
                    sbLIZ.append(set);
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                } catch (Throwable th) {
                    ListProtector.remove(arrayList, arrayList.size() - 1);
                    if (arrayList.isEmpty()) {
                        this.LIZIZ.remove();
                    }
                    throw th;
                }
            } finally {
            }
        }
    }
}
