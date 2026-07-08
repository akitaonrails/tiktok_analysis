package X;

import Y.AObjectS318S0200000_30;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13G2, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13G2 {
    public static final <T> C13HG<T> LIZJ(C13IQ<T> c13iq) {
        C13HG<T> c13hgLIZ = C19981213Fy.LIZ(c13iq, new C13HG[0]);
        if (c13hgLIZ == null) {
            return (C13HG) C13HM.LIZ.get(c13iq);
        }
        return c13hgLIZ;
    }

    public static final C13HG<Object> LIZIZ(AbstractC19984913Hj abstractC19984913Hj, C09RO c09ro) {
        C13HG<Object> c13hgLIZ = C13G5.LIZ(abstractC19984913Hj, c09ro, true);
        if (c13hgLIZ == null) {
            String strLJI = C13GE.LIZJ(c09ro).LJI();
            if (strLJI == null) {
                strLJI = "<local class name not available>";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Serializer for class '");
            sbLIZ.append(strLJI);
            sbLIZ.append("' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n");
            throw new C19981113Fx(C2188811AlT.LIZIZ(sbLIZ));
        }
        return c13hgLIZ;
    }

    public static final C13HG<? extends Object> LIZ(C13IQ<Object> c13iq, List<? extends C13HG<Object>> list, Function0<? extends C09R0> function0) {
        if (!Intrinsics.LJFF(c13iq, C13LE.LIZ(Collection.class)) && !Intrinsics.LJFF(c13iq, C13LE.LIZ(List.class)) && !Intrinsics.LJFF(c13iq, C13LE.LIZ(List.class)) && !Intrinsics.LJFF(c13iq, C13LE.LIZ(ArrayList.class))) {
            if (Intrinsics.LJFF(c13iq, C13LE.LIZ(HashSet.class))) {
                final C13HG c13hg = (C13HG) ListProtector.get(list, 0);
                return new AbstractC19980113Fn<E, Set<? extends E>, HashSet<E>>(c13hg) { // from class: X.13Fl
                    public final C19980013Fm LIZIZ;

                    @Override // X.AbstractC19985413Ho
                    public final Object LIZ() {
                        return new HashSet();
                    }

                    @Override // X.AbstractC19985213Hm, X.C13HG, X.InterfaceC19984413He, X.InterfaceC19984213Hc
                    public final InterfaceC19983313Gt getDescriptor() {
                        return this.LIZIZ;
                    }

                    /* JADX WARN: Type inference failed for: r1v0, types: [X.13Fm] */
                    {
                        super(c13hg);
                        final InterfaceC19983313Gt descriptor = c13hg.getDescriptor();
                        this.LIZIZ = new AbstractC19979313Ff(descriptor) { // from class: X.13Fm
                            @Override // X.InterfaceC19983313Gt
                            public final String LJI() {
                                return "kotlin.collections.HashSet";
                            }
                        };
                    }

                    @Override // X.AbstractC19985413Ho
                    public final int LIZIZ(Object obj) {
                        return ((HashSet) obj).size();
                    }

                    @Override // X.AbstractC19985413Ho
                    public final Object LJI(Object obj) {
                        return new HashSet((Collection) null);
                    }

                    @Override // X.AbstractC19985413Ho
                    public final Object LJII(Object obj) {
                        return obj;
                    }

                    @Override // X.AbstractC19985213Hm
                    public final void LJIIIIZZ(int i, Object obj, Object obj2) {
                        ((HashSet) obj).add(obj2);
                    }
                };
            }
            if (!Intrinsics.LJFF(c13iq, C13LE.LIZ(Set.class)) && !Intrinsics.LJFF(c13iq, C13LE.LIZ(Set.class)) && !Intrinsics.LJFF(c13iq, C13LE.LIZ(LinkedHashSet.class))) {
                if (Intrinsics.LJFF(c13iq, C13LE.LIZ(HashMap.class))) {
                    final C13HG c13hg2 = (C13HG) ListProtector.get(list, 0);
                    final C13HG c13hg3 = (C13HG) ListProtector.get(list, 1);
                    return new AbstractC19985113Hl<K, V, Map<K, ? extends V>, HashMap<K, V>>(c13hg2, c13hg3) { // from class: X.13FX
                        public final C13FY LIZJ;

                        @Override // X.AbstractC19985413Ho
                        public final Object LIZ() {
                            return new HashMap();
                        }

                        @Override // X.AbstractC19985113Hl, X.C13HG, X.InterfaceC19984413He, X.InterfaceC19984213Hc
                        public final InterfaceC19983313Gt getDescriptor() {
                            return this.LIZJ;
                        }

                        @Override // X.AbstractC19985413Ho
                        public final int LIZIZ(Object obj) {
                            return ((HashMap) obj).size() * 2;
                        }

                        @Override // X.AbstractC19985413Ho
                        public final Iterator LIZJ(Object obj) {
                            return ((Map) obj).entrySet().iterator();
                        }

                        @Override // X.AbstractC19985413Ho
                        public final int LIZLLL(Object obj) {
                            return ((Map) obj).size();
                        }

                        @Override // X.AbstractC19985413Ho
                        public final Object LJI(Object obj) {
                            return new HashMap((Map) null);
                        }

                        @Override // X.AbstractC19985413Ho
                        public final Object LJII(Object obj) {
                            return obj;
                        }

                        /* JADX WARN: Type inference failed for: r2v0, types: [X.13FY] */
                        {
                            super(c13hg2, c13hg3);
                            final InterfaceC19983313Gt descriptor = c13hg2.getDescriptor();
                            final InterfaceC19983313Gt descriptor2 = c13hg3.getDescriptor();
                            this.LIZJ = new AbstractC19978913Fb(descriptor, descriptor2) { // from class: X.13FY
                            };
                        }
                    };
                }
                if (!Intrinsics.LJFF(c13iq, C13LE.LIZ(Map.class)) && !Intrinsics.LJFF(c13iq, C13LE.LIZ(Map.class)) && !Intrinsics.LJFF(c13iq, C13LE.LIZ(LinkedHashMap.class))) {
                    if (Intrinsics.LJFF(c13iq, C13LE.LIZ(Map.Entry.class))) {
                        final C13HG c13hg4 = (C13HG) ListProtector.get(list, 0);
                        final C13HG c13hg5 = (C13HG) ListProtector.get(list, 1);
                        return new C13HT<K, V, Map.Entry<? extends K, ? extends V>>(c13hg4, c13hg5) { // from class: X.13GG
                            public final C19983813Gy LIZJ;

                            @Override // X.C13HG, X.InterfaceC19984413He, X.InterfaceC19984213Hc
                            public final InterfaceC19983313Gt getDescriptor() {
                                return this.LIZJ;
                            }

                            @Override // X.C13HT
                            public final Object LIZ(Object obj) {
                                return ((Map.Entry) obj).getKey();
                            }

                            @Override // X.C13HT
                            public final Object LIZIZ(Object obj) {
                                return ((Map.Entry) obj).getValue();
                            }

                            {
                                super(c13hg4, c13hg5);
                                this.LIZJ = C19981813Ge.LIZIZ("kotlin.collections.Map.Entry", C19982713Gn.LIZ, new InterfaceC19983313Gt[0], new AObjectS318S0200000_30(c13hg5, c13hg4, 0));
                            }

                            @Override // X.C13HT
                            public final Object LIZJ(Object obj, Object obj2) {
                                return new C11U5(obj, obj2);
                            }
                        };
                    }
                    if (Intrinsics.LJFF(c13iq, C13LE.LIZ(Pair.class))) {
                        final C13HG c13hg6 = (C13HG) ListProtector.get(list, 0);
                        final C13HG c13hg7 = (C13HG) ListProtector.get(list, 1);
                        return new C13HT<K, V, Pair<? extends K, ? extends V>>(c13hg6, c13hg7) { // from class: X.13GH
                            public final C19983813Gy LIZJ;

                            @Override // X.C13HG, X.InterfaceC19984413He, X.InterfaceC19984213Hc
                            public final InterfaceC19983313Gt getDescriptor() {
                                return this.LIZJ;
                            }

                            @Override // X.C13HT
                            public final Object LIZ(Object obj) {
                                return ((Pair) obj).getFirst();
                            }

                            @Override // X.C13HT
                            public final Object LIZIZ(Object obj) {
                                return ((Pair) obj).getSecond();
                            }

                            {
                                super(c13hg6, c13hg7);
                                this.LIZJ = C19981813Ge.LIZ("kotlin.Pair", new InterfaceC19983313Gt[0], new AObjectS318S0200000_30(c13hg7, c13hg6, 1));
                            }

                            @Override // X.C13HT
                            public final Object LIZJ(Object obj, Object obj2) {
                                return new Pair(obj, obj2);
                            }
                        };
                    }
                    if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C443120HZe.class))) {
                        return new C13HS((C13HG) ListProtector.get(list, 0), (C13HG) ListProtector.get(list, 1), (C13HG) ListProtector.get(list, 2));
                    }
                    if (C09R7.LIZ(c13iq).isArray()) {
                        final C13IQ c13iq2 = (C13IQ) function0.invoke();
                        final C13HG c13hg8 = (C13HG) ListProtector.get(list, 0);
                        return new AbstractC19985213Hm<Element, Element[], ArrayList<Element>>(c13iq2, c13hg8) { // from class: X.13Fq
                            public final C13IQ<ElementKlass> LIZIZ;
                            public final C19980313Fp LIZJ;

                            @Override // X.AbstractC19985413Ho
                            public final Object LIZ() {
                                return new ArrayList();
                            }

                            @Override // X.AbstractC19985213Hm, X.C13HG, X.InterfaceC19984413He, X.InterfaceC19984213Hc
                            public final InterfaceC19983313Gt getDescriptor() {
                                return this.LIZJ;
                            }

                            @Override // X.AbstractC19985413Ho
                            public final int LIZIZ(Object obj) {
                                return ((ArrayList) obj).size();
                            }

                            @Override // X.AbstractC19985413Ho
                            public final Iterator LIZJ(Object obj) {
                                return new C089E((Object[]) obj);
                            }

                            @Override // X.AbstractC19985413Ho
                            public final int LIZLLL(Object obj) {
                                return ((Object[]) obj).length;
                            }

                            @Override // X.AbstractC19985413Ho
                            public final Object LJI(Object obj) {
                                return new ArrayList(Arrays.asList(null));
                            }

                            @Override // X.AbstractC19985413Ho
                            public final Object LJII(Object obj) {
                                ArrayList arrayList = (ArrayList) obj;
                                return arrayList.toArray((Object[]) Array.newInstance((Class<?>) C09R7.LIZ(this.LIZIZ), arrayList.size()));
                            }

                            /* JADX WARN: Type inference failed for: r1v0, types: [X.13Fp] */
                            {
                                super(c13hg8);
                                this.LIZIZ = c13iq2;
                                this.LIZJ = new AbstractC19979313Ff(c13hg8.getDescriptor()) { // from class: X.13Fp
                                    @Override // X.InterfaceC19983313Gt
                                    public final String LJI() {
                                        return "kotlin.Array";
                                    }
                                };
                            }

                            @Override // X.AbstractC19985213Hm
                            public final void LJIIIIZZ(int i, Object obj, Object obj2) {
                                ListProtector.add((ArrayList) obj, i, obj2);
                            }
                        };
                    }
                    C13HG[] c13hgArr = (C13HG[]) list.toArray(new C13HG[0]);
                    return C19981213Fy.LIZ(c13iq, (C13HG[]) Arrays.copyOf(c13hgArr, c13hgArr.length));
                }
                return new C13FZ((C13HG) ListProtector.get(list, 0), (C13HG) ListProtector.get(list, 1));
            }
            final C13HG c13hg9 = (C13HG) ListProtector.get(list, 0);
            return new AbstractC19980113Fn<E, Set<? extends E>, LinkedHashSet<E>>(c13hg9) { // from class: X.13Fj
                public final C19979813Fk LIZIZ;

                @Override // X.AbstractC19985413Ho
                public final Object LIZ() {
                    return new LinkedHashSet();
                }

                @Override // X.AbstractC19985213Hm, X.C13HG, X.InterfaceC19984413He, X.InterfaceC19984213Hc
                public final InterfaceC19983313Gt getDescriptor() {
                    return this.LIZIZ;
                }

                /* JADX WARN: Type inference failed for: r1v0, types: [X.13Fk] */
                {
                    super(c13hg9);
                    final InterfaceC19983313Gt descriptor = c13hg9.getDescriptor();
                    this.LIZIZ = new AbstractC19979313Ff(descriptor) { // from class: X.13Fk
                        @Override // X.InterfaceC19983313Gt
                        public final String LJI() {
                            return "kotlin.collections.LinkedHashSet";
                        }
                    };
                }

                @Override // X.AbstractC19985413Ho
                public final int LIZIZ(Object obj) {
                    return ((HashSet) obj).size();
                }

                @Override // X.AbstractC19985413Ho
                public final Object LJI(Object obj) {
                    return new LinkedHashSet((Collection) null);
                }

                @Override // X.AbstractC19985413Ho
                public final Object LJII(Object obj) {
                    return obj;
                }

                @Override // X.AbstractC19985213Hm
                public final void LJIIIIZZ(int i, Object obj, Object obj2) {
                    ((HashSet) obj).add(obj2);
                }
            };
        }
        return new C19979613Fi((C13HG) ListProtector.get(list, 0));
    }

    public static final List<C13HG<Object>> LIZLLL(AbstractC19984913Hj abstractC19984913Hj, List<? extends C09RO> list, boolean z) {
        if (z) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<? extends C09RO> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(LIZIZ(abstractC19984913Hj, it2.next()));
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<? extends C09RO> it3 = list.iterator();
        while (it3.hasNext()) {
            C13HG<Object> c13hgLIZ = C13G5.LIZ(abstractC19984913Hj, it3.next(), false);
            if (c13hgLIZ == null) {
                return null;
            }
            arrayList2.add(c13hgLIZ);
        }
        return arrayList2;
    }
}
