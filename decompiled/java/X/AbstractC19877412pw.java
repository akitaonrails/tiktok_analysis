package X;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: X.12pw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19877412pw<K> {
    public static final C19891112s9 LIZ = new AbstractC19877412pw<AbstractC19891512sD<?>>() { // from class: X.12s9
        @Override // X.AbstractC19877412pw
        public final Iterable<? extends AbstractC19891512sD<?>> LIZJ(AbstractC19891512sD<?> abstractC19891512sD) {
            AbstractC19891512sD<?> abstractC19891512sD2 = abstractC19891512sD;
            Type type = abstractC19891512sD2.runtimeType;
            if (type instanceof TypeVariable) {
                return AbstractC19891512sD.LIZIZ(((TypeVariable) type).getBounds());
            }
            if (type instanceof WildcardType) {
                return AbstractC19891512sD.LIZIZ(((WildcardType) type).getUpperBounds());
            }
            C19876312pl c19876312plBuilder = AbstractC19875512pd.builder();
            for (Type type2 : abstractC19891512sD2.getRawType().getGenericInterfaces()) {
                c19876312plBuilder.LIZLLL(abstractC19891512sD2.LJI(type2));
            }
            return c19876312plBuilder.LJI();
        }

        @Override // X.AbstractC19877412pw
        public final Class LIZLLL(AbstractC19891512sD<?> abstractC19891512sD) {
            return abstractC19891512sD.getRawType();
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x004b A[PHI: r1
          0x004b: PHI (r1v2 X.12sD<?>) = (r1v1 X.12sD<?>), (r1v3 X.12sD<?>) binds: [B:10:0x0039, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE], RETURN] */
        @Override // X.AbstractC19877412pw
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final X.AbstractC19891512sD<?> LJ(X.AbstractC19891512sD<?> r5) {
            /*
                r4 = this;
                X.12sD r5 = (X.AbstractC19891512sD) r5
                java.lang.reflect.Type r3 = r5.runtimeType
                boolean r0 = r3 instanceof java.lang.reflect.TypeVariable
                r2 = 0
                r1 = 0
                if (r0 == 0) goto L21
                java.lang.reflect.TypeVariable r3 = (java.lang.reflect.TypeVariable) r3
                java.lang.reflect.Type[] r0 = r3.getBounds()
                r0 = r0[r1]
                X.12sD r1 = X.AbstractC19891512sD.of(r0)
                java.lang.Class r0 = r1.getRawType()
                boolean r0 = r0.isInterface()
                if (r0 == 0) goto L4b
            L20:
                return r2
            L21:
                boolean r0 = r3 instanceof java.lang.reflect.WildcardType
                if (r0 == 0) goto L3c
                java.lang.reflect.WildcardType r3 = (java.lang.reflect.WildcardType) r3
                java.lang.reflect.Type[] r0 = r3.getUpperBounds()
                r0 = r0[r1]
                X.12sD r1 = X.AbstractC19891512sD.of(r0)
                java.lang.Class r0 = r1.getRawType()
                boolean r0 = r0.isInterface()
                if (r0 == 0) goto L4b
                return r2
            L3c:
                java.lang.Class r0 = r5.getRawType()
                java.lang.reflect.Type r0 = r0.getGenericSuperclass()
                if (r0 == 0) goto L20
                X.12sD r2 = r5.LJI(r0)
                return r2
            L4b:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C19891112s9.LJ(java.lang.Object):java.lang.Object");
        }
    };
    public static final C19877712pz LIZIZ = new AbstractC19877412pw<Class<?>>() { // from class: X.12pz
        @Override // X.AbstractC19877412pw
        public final Iterable<? extends Class<?>> LIZJ(Class<?> cls) {
            return Arrays.asList(cls.getInterfaces());
        }

        @Override // X.AbstractC19877412pw
        public final Class LIZLLL(Class<?> cls) {
            return cls;
        }

        @Override // X.AbstractC19877412pw
        public final Class<?> LJ(Class<?> cls) {
            return cls.getSuperclass();
        }
    };

    public abstract Iterable<? extends K> LIZJ(K k);

    public abstract Class<?> LIZLLL(K k);

    public abstract K LJ(K k);

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC19875512pd LIZIZ(AbstractC19875812pg abstractC19875812pg) {
        final HashMap map = new HashMap();
        Iterator it2 = abstractC19875812pg.iterator();
        while (it2.hasNext()) {
            LIZ(it2.next(), map);
        }
        C19876912pr.LL.getClass();
        final C19877012ps c19877012ps = C19877012ps.LL;
        return AbstractC19875512pd.sortedCopyOf(new AbstractC19877212pu<Object>() { // from class: X.12pv
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                Comparator comparator = c19877012ps;
                Object obj3 = map.get(obj);
                Objects.requireNonNull(obj3);
                Object obj4 = map.get(obj2);
                Objects.requireNonNull(obj4);
                return comparator.compare(obj3, obj4);
            }
        }, map.keySet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int LIZ(K k, Map<? super K, Integer> map) {
        HashMap map2 = (HashMap) map;
        Integer num = (Integer) map2.get(k);
        if (num != null) {
            return num.intValue();
        }
        boolean zIsInterface = LIZLLL(k).isInterface();
        Iterator<? extends K> it2 = LIZJ(k).iterator();
        int iMax = zIsInterface;
        while (it2.hasNext()) {
            iMax = Math.max(iMax, LIZ(it2.next(), map));
        }
        K kLJ = LJ(k);
        int iMax2 = iMax;
        if (kLJ != null) {
            iMax2 = Math.max(iMax, LIZ(kLJ, map));
        }
        int i = iMax2 + 1;
        map2.put(k, Integer.valueOf(i));
        return i;
    }
}
