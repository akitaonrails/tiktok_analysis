package X;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.12r0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19884012r0 implements Map, Serializable {
    public transient AbstractC19884812r8 LL;
    public transient AbstractC19884812r8 LLILLJJLI;
    public transient AbstractC19884712r7 LLILLL;

    public abstract C19884312r3 LIZ();

    public abstract C19884512r5 LIZIZ();

    public abstract C19884412r4 LIZJ();

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        AbstractC19884812r8 abstractC19884812r8 = this.LLILLJJLI;
        if (abstractC19884812r8 != null) {
            return abstractC19884812r8;
        }
        C19884412r4 c19884412r4LIZJ = LIZJ();
        this.LLILLJJLI = c19884412r4LIZJ;
        return c19884412r4LIZJ;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final AbstractC19884712r7 values() {
        AbstractC19884712r7 abstractC19884712r7 = this.LLILLL;
        if (abstractC19884712r7 != null) {
            return abstractC19884712r7;
        }
        C19884312r3 c19884312r3LIZ = LIZ();
        this.LLILLL = c19884312r3LIZ;
        return c19884312r3LIZ;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final AbstractC19884812r8 entrySet() {
        AbstractC19884812r8 abstractC19884812r8 = this.LL;
        if (abstractC19884812r8 != null) {
            return abstractC19884812r8;
        }
        C19884512r5 c19884512r5LIZIZ = LIZIZ();
        this.LL = c19884512r5LIZIZ;
        return c19884512r5LIZIZ;
    }

    @Override // java.util.Map
    public final int hashCode() {
        Iterator it2 = entrySet().iterator();
        int iHashCode = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int size = size();
        if (size < 0) {
            throw new IllegalArgumentException("size cannot be negative but was: " + size);
        }
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    public static AbstractC19884012r0 zzc(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        C19862512nX.LIZ("com.android.vending.billing.PURCHASES_UPDATED", obj2);
        C19862512nX.LIZ("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", obj4);
        C19862512nX.LIZ("com.android.vending.billing.ALTERNATIVE_BILLING", obj6);
        return C19883812qy.LIZLLL(3, new Object[]{"com.android.vending.billing.PURCHASES_UPDATED", obj2, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", obj4, "com.android.vending.billing.ALTERNATIVE_BILLING", obj6}, null);
    }
}
