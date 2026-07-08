package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.12pC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19872812pC<K, V> extends AbstractC19872712pB<K, V> implements C11UZ<K, V> {
    public static final long serialVersionUID = 0;
    public transient C19872812pC<V, K> LLIZLLLIL;

    public static <K, V> C19873512pJ<K, V> builder() {
        return new C19873512pJ<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC19872712pB
    public C19872812pC<V, K> inverse() {
        C19872812pC<V, K> c19872812pC = this.LLIZLLLIL;
        if (c19872812pC != null) {
            return c19872812pC;
        }
        C19873512pJ c19873512pJBuilder = builder();
        AbstractC19853312m3 it2 = entries().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            c19873512pJBuilder.LJ(entry.getValue(), entry.getKey());
        }
        C19872812pC<V, K> c19872812pCLIZLLL = c19873512pJBuilder.LIZLLL();
        c19872812pCLIZLLL.LLIZLLLIL = this;
        this.LLIZLLLIL = c19872812pCLIZLLL;
        return c19872812pCLIZLLL;
    }

    public static <K, V> C19872812pC<K, V> of() {
        return C19874512pT.LLJ;
    }

    public static C19872812pC LJII(Collection collection) {
        if (collection.isEmpty()) {
            return of();
        }
        C19871112ov c19871112ov = new C19871112ov(collection.size());
        Iterator it2 = collection.iterator();
        int size = 0;
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Object key = entry.getKey();
            AbstractC19875512pd abstractC19875512pdCopyOf = AbstractC19875512pd.copyOf((Collection) entry.getValue());
            if (!abstractC19875512pdCopyOf.isEmpty()) {
                c19871112ov.LIZIZ(key, abstractC19875512pdCopyOf);
                size += abstractC19875512pdCopyOf.size();
            }
        }
        return new C19872812pC(c19871112ov.LIZ(), size);
    }

    public static <K, V> C19872812pC<K, V> copyOf(InterfaceC19873212pG<? extends K, ? extends V> interfaceC19873212pG) {
        if (interfaceC19873212pG.isEmpty()) {
            return of();
        }
        if (interfaceC19873212pG instanceof C19872812pC) {
            C19872812pC<K, V> c19872812pC = (C19872812pC) interfaceC19873212pG;
            if (!c19872812pC.LLILZLL.LJ()) {
                return c19872812pC;
            }
        }
        return LJII(interfaceC19873212pG.asMap().entrySet());
    }

    private void readObject(ObjectInputStream objectInputStream) throws Throwable {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i >= 0) {
            C19871112ov c19871112ovBuilder = AbstractC19870912ot.builder();
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object object = objectInputStream.readObject();
                int i4 = objectInputStream.readInt();
                if (i4 > 0) {
                    C19876312pl c19876312plBuilder = AbstractC19875512pd.builder();
                    int i5 = 0;
                    do {
                        c19876312plBuilder.LIZLLL(objectInputStream.readObject());
                        i5++;
                    } while (i5 < i4);
                    c19871112ovBuilder.LIZIZ(object, c19876312plBuilder.LJI());
                    i2 += i4;
                } else {
                    StringBuilder sb = new StringBuilder(31);
                    sb.append("Invalid value count ");
                    sb.append(i4);
                    throw new InvalidObjectException(sb.toString());
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
                        return;
                    } catch (IllegalAccessException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw new AssertionError(e);
                    }
                } catch (IllegalAccessException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    throw new AssertionError(e2);
                }
            } catch (IllegalArgumentException e3) {
                TryCatchGuardChecker.doCheck(e3);
                throw new InvalidObjectException(e3.getMessage()).initCause(e3);
            }
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append("Invalid key count ");
        sb2.append(i);
        throw new InvalidObjectException(sb2.toString());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        C19874112pP.LIZIZ(this, objectOutputStream);
    }

    @Override // X.AbstractC19872712pB, X.InterfaceC19873212pG
    public AbstractC19875512pd<V> get(K k) {
        AbstractC19875512pd<V> abstractC19875512pd = (AbstractC19875512pd) this.LLILZLL.get(k);
        if (abstractC19875512pd == null) {
            return AbstractC19875512pd.of();
        }
        return abstractC19875512pd;
    }

    @Override // X.AbstractC19872712pB, X.InterfaceC19873212pG
    public final AbstractC19875512pd<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> C19872812pC<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        C19873512pJ c19873512pJ = new C19873512pJ();
        Iterator<? extends Map.Entry<? extends K, ? extends V>> it2 = iterable.iterator();
        while (it2.hasNext()) {
            c19873512pJ.LIZJ(it2.next());
        }
        return c19873512pJ.LIZLLL();
    }

    public C19872812pC(AbstractC19870912ot<K, AbstractC19875512pd<V>> abstractC19870912ot, int i) {
        super(abstractC19870912ot, i);
    }

    public static <K, V> C19872812pC<K, V> of(K k, V v) {
        C19873512pJ c19873512pJBuilder = builder();
        c19873512pJBuilder.LJ(k, v);
        return c19873512pJBuilder.LIZLLL();
    }

    @Override // X.AbstractC19872712pB, X.AbstractC19872612pA
    public final AbstractC19875512pd<V> replaceValues(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> C19872812pC<K, V> of(K k, V v, K k2, V v2) {
        C19873512pJ c19873512pJBuilder = builder();
        c19873512pJBuilder.LJ(k, v);
        c19873512pJBuilder.LJ(k2, v2);
        return c19873512pJBuilder.LIZLLL();
    }

    public static <K, V> C19872812pC<K, V> of(K k, V v, K k2, V v2, K k3, V v3) {
        C19873512pJ c19873512pJBuilder = builder();
        c19873512pJBuilder.LJ(k, v);
        c19873512pJBuilder.LJ(k2, v2);
        c19873512pJBuilder.LJ(k3, v3);
        return c19873512pJBuilder.LIZLLL();
    }

    public static <K, V> C19872812pC<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        C19873512pJ c19873512pJBuilder = builder();
        c19873512pJBuilder.LJ(k, v);
        c19873512pJBuilder.LJ(k2, v2);
        c19873512pJBuilder.LJ(k3, v3);
        c19873512pJBuilder.LJ(k4, v4);
        return c19873512pJBuilder.LIZLLL();
    }

    public static <K, V> C19872812pC<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        C19873512pJ c19873512pJBuilder = builder();
        c19873512pJBuilder.LJ(k, v);
        c19873512pJBuilder.LJ(k2, v2);
        c19873512pJBuilder.LJ(k3, v3);
        c19873512pJBuilder.LJ(k4, v4);
        c19873512pJBuilder.LJ(k5, v5);
        return c19873512pJBuilder.LIZLLL();
    }
}
