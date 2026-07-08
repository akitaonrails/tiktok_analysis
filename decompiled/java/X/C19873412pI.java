package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: renamed from: X.12pI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19873412pI<K, V> {
    public final C19880412qQ LIZ = new C19880412qQ();

    public Collection<V> LIZ() {
        return new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void LIZJ(Map.Entry entry) {
        LIZIZ(entry.getKey(), entry.getValue());
    }

    public C19873412pI<K, V> LIZIZ(K k, V v) {
        C19863912nl.LIZ(k, v);
        Collection<V> collectionLIZ = (Collection) this.LIZ.get(k);
        if (collectionLIZ == null) {
            C19880412qQ c19880412qQ = this.LIZ;
            collectionLIZ = LIZ();
            c19880412qQ.put(k, collectionLIZ);
        }
        collectionLIZ.add(v);
        return this;
    }
}
