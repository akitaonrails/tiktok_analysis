package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.12pD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19872912pD<K, V> extends AbstractC19872712pB<K, V> implements InterfaceC19508211Ua<K, V> {
    public static final long serialVersionUID = 0;
    public final transient AbstractC19875112pZ<V> LLIZLLLIL;
    public transient C19872912pD<V, K> LLJ;
    public transient C19870312on LLJI;

    public static <K, V> C19873312pH<K, V> builder() {
        return new C19873312pH<>();
    }

    @Override // X.AbstractC19872712pB, X.AbstractC19872612pA, X.InterfaceC19873212pG
    public AbstractC19875112pZ<Map.Entry<K, V>> entries() {
        C19870312on c19870312on = this.LLJI;
        if (c19870312on != null) {
            return c19870312on;
        }
        AbstractC19875112pZ<Map.Entry<K, V>> abstractC19875112pZ = new AbstractC19875112pZ<Map.Entry<K, V>>(this) { // from class: X.12on
            public final transient C19872912pD<K, V> LLILLL;

            @Override // X.AbstractC19875812pg
            public final boolean LJIIIZ() {
                return false;
            }

            @Override // X.AbstractC19875112pZ, X.AbstractC19875812pg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final AbstractC19853312m3<Map.Entry<K, V>> iterator() {
                C19872912pD<K, V> c19872912pD = this.LLILLL;
                c19872912pD.getClass();
                return new C19868612oW(c19872912pD);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                return this.LLILLL.size();
            }

            @Override // X.AbstractC19875112pZ, X.AbstractC19875812pg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final /* bridge */ /* synthetic */ Iterator iterator() {
                return iterator();
            }

            {
                this.LLILLL = this;
            }

            @Override // X.AbstractC19875812pg, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    return this.LLILLL.containsEntry(entry.getKey(), entry.getValue());
                }
                return false;
            }
        };
        this.LLJI = abstractC19875112pZ;
        return abstractC19875112pZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC19872712pB
    public C19872912pD<V, K> inverse() {
        C19872912pD<V, K> c19872912pD = this.LLJ;
        if (c19872912pD != null) {
            return c19872912pD;
        }
        C19873312pH c19873312pHBuilder = builder();
        Iterator it2 = entries().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            c19873312pHBuilder.LJ(entry.getValue(), entry.getKey());
        }
        C19872912pD<V, K> c19872912pDLIZLLL = c19873312pHBuilder.LIZLLL();
        c19872912pDLIZLLL.LLJ = this;
        this.LLJ = c19872912pDLIZLLL;
        return c19872912pDLIZLLL;
    }

    public static <K, V> C19872912pD<K, V> of() {
        return C19871312ox.LLJIJIL;
    }

    public static C19872912pD LJII(Collection collection) {
        if (collection.isEmpty()) {
            return of();
        }
        C19871112ov c19871112ov = new C19871112ov(collection.size());
        Iterator it2 = collection.iterator();
        int size = 0;
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Object key = entry.getKey();
            AbstractC19875112pZ abstractC19875112pZCopyOf = AbstractC19875112pZ.copyOf((Collection) entry.getValue());
            if (!abstractC19875112pZCopyOf.isEmpty()) {
                c19871112ov.LIZIZ(key, abstractC19875112pZCopyOf);
                size += abstractC19875112pZCopyOf.size();
            }
        }
        return new C19872912pD(c19871112ov.LIZ(), size);
    }

    public static <K, V> C19872912pD<K, V> copyOf(InterfaceC19873212pG<? extends K, ? extends V> interfaceC19873212pG) {
        interfaceC19873212pG.getClass();
        if (interfaceC19873212pG.isEmpty()) {
            return of();
        }
        if (interfaceC19873212pG instanceof C19872912pD) {
            C19872912pD<K, V> c19872912pD = (C19872912pD) interfaceC19873212pG;
            if (!c19872912pD.LLILZLL.LJ()) {
                return c19872912pD;
            }
        }
        return LJII(interfaceC19873212pG.asMap().entrySet());
    }

    private void readObject(ObjectInputStream objectInputStream) throws Throwable {
        Object objLJIIZILJ;
        C19875212pa c19875412pc;
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int i = objectInputStream.readInt();
        if (i >= 0) {
            C19871112ov c19871112ovBuilder = AbstractC19870912ot.builder();
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object object = objectInputStream.readObject();
                int i4 = objectInputStream.readInt();
                if (i4 > 0) {
                    if (comparator == null) {
                        c19875412pc = new C19875212pa();
                    } else {
                        c19875412pc = new C19875412pc(comparator);
                    }
                    int i5 = 0;
                    do {
                        c19875412pc.LJI(objectInputStream.readObject());
                        i5++;
                    } while (i5 < i4);
                    AbstractC19875112pZ abstractC19875112pZLJIIIZ = c19875412pc.LJIIIZ();
                    if (abstractC19875112pZLJIIIZ.size() == i4) {
                        c19871112ovBuilder.LIZIZ(object, abstractC19875112pZLJIIIZ);
                        i2 += i4;
                    } else {
                        String strValueOf = String.valueOf(object);
                        StringBuilder sb = new StringBuilder(strValueOf.length() + 40);
                        sb.append("Duplicate key-value pairs exist for key ");
                        sb.append(strValueOf);
                        throw new InvalidObjectException(sb.toString());
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder(31);
                    sb2.append("Invalid value count ");
                    sb2.append(i4);
                    throw new InvalidObjectException(sb2.toString());
                }
            }
            try {
                C19869812oi c19869812oiLIZ = c19871112ovBuilder.LIZ();
                C19874012pO<AbstractC19872712pB> c19874012pO = C19874212pQ.LIZ;
                c19874012pO.getClass();
                try {
                    c19874012pO.LIZ.set(this, c19869812oiLIZ);
                    C19874012pO<AbstractC19872712pB> c19874012pO2 = C19874212pQ.LIZIZ;
                    c19874012pO2.getClass();
                    try {
                        c19874012pO2.LIZ.set(this, Integer.valueOf(i2));
                        C19874012pO<C19872912pD> c19874012pO3 = C19874412pS.LIZ;
                        if (comparator == null) {
                            objLJIIZILJ = AbstractC19875112pZ.of();
                        } else {
                            objLJIIZILJ = AbstractC19875612pe.LJIIZILJ(comparator);
                        }
                        c19874012pO3.getClass();
                        try {
                            c19874012pO3.LIZ.set(this, objLJIIZILJ);
                            return;
                        } catch (IllegalAccessException e) {
                            TryCatchGuardChecker.doCheck(e);
                            throw new AssertionError(e);
                        }
                    } catch (IllegalAccessException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        throw new AssertionError(e2);
                    }
                } catch (IllegalAccessException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    throw new AssertionError(e3);
                }
            } catch (IllegalArgumentException e4) {
                TryCatchGuardChecker.doCheck(e4);
                throw new InvalidObjectException(e4.getMessage()).initCause(e4);
            }
        }
        StringBuilder sb3 = new StringBuilder(29);
        sb3.append("Invalid key count ");
        sb3.append(i);
        throw new InvalidObjectException(sb3.toString());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        Comparator comparator;
        objectOutputStream.defaultWriteObject();
        AbstractC19875112pZ<V> abstractC19875112pZ = this.LLIZLLLIL;
        if (abstractC19875112pZ instanceof AbstractC19875612pe) {
            comparator = ((AbstractC19875612pe) abstractC19875112pZ).comparator();
        } else {
            comparator = null;
        }
        objectOutputStream.writeObject(comparator);
        C19874112pP.LIZIZ(this, objectOutputStream);
    }

    @Override // X.AbstractC19872712pB, X.InterfaceC19873212pG
    public AbstractC19875112pZ<V> get(K k) {
        return (AbstractC19875112pZ) C135U.LIZ(this.LLILZLL.get(k), this.LLIZLLLIL);
    }

    @Override // X.AbstractC19872712pB, X.InterfaceC19873212pG
    public final AbstractC19875112pZ<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> C19872912pD<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        C19873312pH c19873312pH = new C19873312pH();
        Iterator<? extends Map.Entry<? extends K, ? extends V>> it2 = iterable.iterator();
        while (it2.hasNext()) {
            c19873312pH.LIZJ(it2.next());
        }
        return c19873312pH.LIZLLL();
    }

    public C19872912pD(AbstractC19870912ot abstractC19870912ot, int i) {
        super(abstractC19870912ot, i);
        this.LLIZLLLIL = AbstractC19875112pZ.of();
    }

    public static <K, V> C19872912pD<K, V> of(K k, V v) {
        C19873312pH c19873312pHBuilder = builder();
        c19873312pHBuilder.LJ(k, v);
        return c19873312pHBuilder.LIZLLL();
    }

    @Override // X.AbstractC19872712pB, X.AbstractC19872612pA
    public final AbstractC19875112pZ<V> replaceValues(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> C19872912pD<K, V> of(K k, V v, K k2, V v2) {
        C19873312pH c19873312pHBuilder = builder();
        c19873312pHBuilder.LJ(k, v);
        c19873312pHBuilder.LJ(k2, v2);
        return c19873312pHBuilder.LIZLLL();
    }

    public static <K, V> C19872912pD<K, V> of(K k, V v, K k2, V v2, K k3, V v3) {
        C19873312pH c19873312pHBuilder = builder();
        c19873312pHBuilder.LJ(k, v);
        c19873312pHBuilder.LJ(k2, v2);
        c19873312pHBuilder.LJ(k3, v3);
        return c19873312pHBuilder.LIZLLL();
    }

    public static <K, V> C19872912pD<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        C19873312pH c19873312pHBuilder = builder();
        c19873312pHBuilder.LJ(k, v);
        c19873312pHBuilder.LJ(k2, v2);
        c19873312pHBuilder.LJ(k3, v3);
        c19873312pHBuilder.LJ(k4, v4);
        return c19873312pHBuilder.LIZLLL();
    }

    public static <K, V> C19872912pD<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        C19873312pH c19873312pHBuilder = builder();
        c19873312pHBuilder.LJ(k, v);
        c19873312pHBuilder.LJ(k2, v2);
        c19873312pHBuilder.LJ(k3, v3);
        c19873312pHBuilder.LJ(k4, v4);
        c19873312pHBuilder.LJ(k5, v5);
        return c19873312pHBuilder.LIZLLL();
    }
}
