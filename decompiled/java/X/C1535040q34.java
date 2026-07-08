package X;

import android.os.SystemClock;
import com.bytedance.forest.Forest;
import com.bytedance.forest.chain.fetchers.ResourceFetcher;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.AwS232S0300000_23;
import kotlin.jvm.internal.AwS389S0200000_23;
import kotlin.jvm.internal.AwS567S0100000_23;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0q34, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1535040q34 implements InterfaceC1534830q2j {
    public static final HashSet<AbstractC1535150q3F<?, ?>> LJIIZILJ;
    public WeakReference<Function1<C1534360q1y<?>, Unit>> LIZIZ;
    public volatile C1535040q34 LIZLLL;
    public final Iterator<String> LJFF;
    public volatile Thread LJI;
    public volatile C1535200q3K LJII;
    public LinkedList<String> LJIIIIZZ;
    public volatile AbstractC1534540q2G LJIILIIL;
    public volatile C1534360q1y<?> LJIILJJIL;
    public final C1534590q2L LIZ = new C1534590q2L(0);
    public final LinkedList<String> LIZJ = new LinkedList<>();
    public final LinkedList<String> LJ = new LinkedList<>();
    public final C1535120q3C LJIIIZ = new C1535120q3C(this);
    public final AtomicReference<Boolean> LJIIJ = new AtomicReference<>(null);
    public final CountDownLatch LJIIJJI = new CountDownLatch(1);
    public final C1534320q1u<C1535200q3K<Runnable>> LJIIL = new C1534320q1u<>();
    public final HashMap<Class<?>, C1535180q3I<C1535110q3B<?>>> LJIILL = new HashMap<>();
    public final LinkedHashSet<AbstractC1535150q3F<Unit, Unit>> LJIILLIIL = new LinkedHashSet<>();

    static {
        HashSet<AbstractC1535150q3F<?, ?>> hashSet = new HashSet<>();
        hashSet.add(new AbstractC1535150q3F<File, InputStream>() { // from class: X.0psS
            @Override // X.InterfaceC1535220q3M
            public final boolean LIZ() {
                return false;
            }

            @Override // X.InterfaceC1535220q3M
            public final boolean LIZIZ() {
                return true;
            }

            @Override // X.InterfaceC1535220q3M
            public final String getName() {
                return "File2Stream";
            }

            @Override // X.InterfaceC1535220q3M
            public final EnumC1528510psX LIZJ() {
                return EnumC1528510psX.NO_REUSE;
            }

            @Override // X.AbstractC1535150q3F
            public final void LJFF(AbstractC1534220q1k<File> abstractC1534220q1k, C1533790q13 c1533790q13, List<? extends Class<?>> list, Function1<? super AbstractC1534220q1k<InputStream>, Unit> function1) {
                Object c098200Yq;
                try {
                    c098200Yq = new C1528440psQ(abstractC1534220q1k.LIZLLL);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                function1.invoke(c098200Yq);
            }
        });
        hashSet.add(new AbstractC1535150q3F<byte[], InputStream>() { // from class: X.0pst
            @Override // X.InterfaceC1535220q3M
            public final boolean LIZ() {
                return false;
            }

            @Override // X.InterfaceC1535220q3M
            public final boolean LIZIZ() {
                return true;
            }

            @Override // X.InterfaceC1535220q3M
            public final String getName() {
                return "Bytes2Stream";
            }

            @Override // X.InterfaceC1535220q3M
            public final EnumC1528510psX LIZJ() {
                return EnumC1528510psX.NO_REUSE;
            }

            @Override // X.AbstractC1535150q3F
            public final void LJFF(AbstractC1534220q1k<byte[]> abstractC1534220q1k, C1533790q13 c1533790q13, List<? extends Class<?>> list, Function1<? super AbstractC1534220q1k<InputStream>, Unit> function1) {
                Object c098200Yq;
                C1534420q24 c1534420q24 = null;
                try {
                    c098200Yq = new C1534010q1P(new C1528720pss(abstractC1534220q1k.LIZLLL), c1533790q13, null).LJIILLIIL();
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                InputStream inputStream = (InputStream) c098200Yq;
                if (inputStream != null) {
                    c1534420q24 = new C1534420q24(inputStream);
                }
                function1.invoke(c1534420q24);
            }
        });
        hashSet.add(new AbstractC1535150q3F<C1531120pwk, File>() { // from class: X.0pwh
            @Override // X.InterfaceC1535220q3M
            public final boolean LIZ() {
                return false;
            }

            @Override // X.InterfaceC1535220q3M
            public final boolean LIZIZ() {
                return true;
            }

            @Override // X.InterfaceC1535220q3M
            public final String getName() {
                return "Assets2File";
            }

            @Override // X.InterfaceC1535220q3M
            public final EnumC1528510psX LIZJ() {
                return EnumC1528510psX.WAIT_FOR_RESULT;
            }

            @Override // X.AbstractC1535150q3F
            public final void LJFF(AbstractC1534220q1k<C1531120pwk> abstractC1534220q1k, C1533790q13 c1533790q13, List<? extends Class<?>> list, Function1<? super AbstractC1534220q1k<File>, Unit> function1) {
                final C1531120pwk c1531120pwk = abstractC1534220q1k.LIZLLL;
                if (c1531120pwk.LIZJ.compareAndSet(false, true)) {
                    try {
                        c1531120pwk.LIZIZ.close();
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }
                function1.invoke(new C1528490psV(new C0VSJ(c1531120pwk.LIZ)) { // from class: X.0pwf
                    @Override // X.C1528490psV, X.AbstractC1534220q1k
                    public final AbstractC1534220q1k<File> LIZ(C1533790q13 c1533790q132) {
                        return this;
                    }

                    @Override // X.C1528490psV, X.AbstractC1534220q1k
                    public final Integer LIZIZ() {
                        try {
                            InputStream inputStreamOpen = Forest.Companion.getApp().getAssets().open(c1531120pwk.LIZ);
                            int iAvailable = inputStreamOpen.available();
                            inputStreamOpen.close();
                            return Integer.valueOf(iAvailable);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            C1534250q1n.LIZJ("Assets", "error occurs when getting input stream from builtin", e, true);
                            return null;
                        }
                    }
                });
            }
        });
        hashSet.add(new AbstractC1535150q3F<C1531120pwk, InputStream>() { // from class: X.0pwg
            @Override // X.InterfaceC1535220q3M
            public final boolean LIZ() {
                return false;
            }

            @Override // X.InterfaceC1535220q3M
            public final boolean LIZIZ() {
                return true;
            }

            @Override // X.InterfaceC1535220q3M
            public final String getName() {
                return "Assets2InputStream";
            }

            @Override // X.InterfaceC1535220q3M
            public final EnumC1528510psX LIZJ() {
                return EnumC1528510psX.NO_REUSE;
            }

            @Override // X.AbstractC1535150q3F
            public final void LJFF(AbstractC1534220q1k<C1531120pwk> abstractC1534220q1k, C1533790q13 c1533790q13, List<? extends Class<?>> list, Function1<? super AbstractC1534220q1k<InputStream>, Unit> function1) {
                C1534420q24 c1534420q24;
                C1531120pwk c1531120pwk = abstractC1534220q1k.LIZLLL;
                if (c1531120pwk.LIZJ.compareAndSet(false, true)) {
                    c1534420q24 = new C1534420q24(c1531120pwk.LIZIZ);
                } else {
                    try {
                        c1534420q24 = new C1534420q24(Forest.Companion.getApp().getAssets().open(c1531120pwk.LIZ));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1534250q1n.LIZJ("Assets", "error occurs when getting input stream from builtin", e, true);
                        c1534420q24 = null;
                    }
                }
                function1.invoke(c1534420q24);
            }
        });
        hashSet.add(new C1534060q1U() { // from class: X.0q3Q
        });
        hashSet.add(new C1534290q1r() { // from class: X.0q3R
        });
        LJIIZILJ = hashSet;
    }

    public final boolean LJFF() {
        C1535040q34 c1535040q34 = this.LIZLLL;
        if (c1535040q34 != null) {
            return c1535040q34.LJFF();
        }
        C1535120q3C c1535120q3C = this.LJIIIZ;
        if (c1535120q3C.LIZIZ) {
            return true;
        }
        int i = c1535120q3C.LIZ.get();
        int i2 = Intrinsics.LJFF(c1535120q3C.LIZJ.LJIIJ.get(), Boolean.TRUE) ? 2 : 1;
        return i >= 1073741824 ? i > i2 + 1073741824 : i > i2;
    }

    public final boolean LJI() {
        return this.LJIIIZ.LIZ.get() >= 0;
    }

    @Override // X.InterfaceC1534830q2j
    public final boolean cancel() {
        return this.LJIIIZ.LJ(1);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("statusCode: ");
        sbLIZ.append(this.LJIIIZ.LIZ.get());
        sbLIZ.append('\n');
        StringBuilder sb = new StringBuilder(C2188811AlT.LIZIZ(sbLIZ));
        for (Map.Entry<Class<?>, C1535180q3I<C1535110q3B<?>>> entry : this.LJIILL.entrySet()) {
            sb.append(entry.getKey().toString());
            sb.append(": ");
            sb.append(entry.getValue().LIZ != null ? "held" : "released");
            C1535110q3B<?> c1535110q3BLIZ = entry.getValue().LIZ();
            sb.append((c1535110q3BLIZ == null || c1535110q3BLIZ.LJI == null) ? "" : "-finished");
            sb.append("\n");
        }
        return sb.toString();
    }

    public C1535040q34(List<String> list) {
        this.LJFF = list.iterator();
    }

    public final <Type> C1535180q3I<C1535110q3B<Type>> LIZJ(Class<Type> cls) {
        HashMap<Class<?>, C1535180q3I<C1535110q3B<?>>> map = this.LJIILL;
        Object c1535180q3I = map.get(cls);
        if (c1535180q3I == null) {
            c1535180q3I = new C1535180q3I(new C1535110q3B(this, cls));
            map.put((Class<?>) cls, (C1535180q3I<C1535110q3B<?>>) c1535180q3I);
        }
        return (C1535180q3I) c1535180q3I;
    }

    public final <Input, Output> void LJIIJJI(AbstractC1535150q3F<Input, Output> abstractC1535150q3F) {
        C1535110q3B c1535110q3B = (C1535110q3B) LIZJ(abstractC1535150q3F.LIZ).LIZ();
        if (c1535110q3B != null) {
            HashMap map = c1535110q3B.LIZIZ;
            HashMap map2 = map;
            if (map == null) {
                map2 = new HashMap();
            }
            c1535110q3B.LIZIZ = map2;
            map2.put(abstractC1535150q3F.LIZIZ, abstractC1535150q3F);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cannot set processor, name: ");
        sbLIZ.append(abstractC1535150q3F.getName());
        C1533880q1C.LIZ("ResourceProcessChain", "setCorrespondingProcessor", C2188811AlT.LIZIZ(sbLIZ), null, null);
    }

    public static final void LIZIZ(C1535040q34 c1535040q34, Class<?> cls, HashSet<Class<?>> hashSet) {
        Set<Map.Entry> setEntrySet;
        C1535110q3B c1535110q3B;
        int iIntValue;
        Set setEntrySet2;
        C1535110q3B c1535110q3B2 = (C1535110q3B) c1535040q34.LIZJ(cls).LIZ();
        if (c1535110q3B2 == null) {
            C1533880q1C.LIZ("ResourceProcessChain", "drawProcessorTree", "traversed to released reference", null, null);
            return;
        }
        hashSet.add(cls);
        HashMap<Class<?>, AbstractC1535150q3F<Type, ?>> map = c1535110q3B2.LIZIZ;
        Iterator it2 = null;
        if (map != 0 && (setEntrySet2 = map.entrySet()) != null) {
            it2 = setEntrySet2.iterator();
        }
        if ((it2 instanceof Iterator) && it2 != null) {
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                Class cls2 = (Class) entry.getKey();
                if (!hashSet.contains(cls2)) {
                    Object value = entry.getValue();
                    Object objLIZ = c1535040q34.LIZJ(cls2).LIZ();
                    if ((objLIZ instanceof C1535110q3B) && (c1535110q3B = (C1535110q3B) objLIZ) != null) {
                        C443120HZe<? extends C1535110q3B<?>, ? extends AbstractC1535150q3F<?, Type>, Integer> c443120HZe = c1535110q3B.LIZLLL;
                        C443120HZe<? extends C1535110q3B<?>, ? extends AbstractC1535150q3F<?, Type>, Integer> c443120HZe2 = c1535110q3B2.LIZLLL;
                        if (c443120HZe2 != 0) {
                            iIntValue = c443120HZe2.getThird().intValue();
                        } else {
                            iIntValue = 0;
                        }
                        int i = iIntValue + 1;
                        if (c443120HZe == 0 || c443120HZe.getThird().intValue() > i) {
                            c1535110q3B.LIZLLL = new C443120HZe<>(c1535110q3B2, value, Integer.valueOf(i));
                        }
                    }
                }
            }
        }
        HashMap<Class<?>, AbstractC1535150q3F<Type, ?>> map2 = c1535110q3B2.LIZIZ;
        if (map2 != 0 && (setEntrySet = map2.entrySet()) != null) {
            for (Map.Entry entry2 : setEntrySet) {
                ((AbstractC1535150q3F) entry2.getValue()).LIZJ = c1535040q34;
                if (!hashSet.contains(entry2.getKey())) {
                    LIZIZ(c1535040q34, (Class) entry2.getKey(), hashSet);
                }
            }
        }
    }

    @Override // X.InterfaceC1534830q2j
    public final boolean LIZ(C1533490q0Z c1533490q0Z, C1533790q13 c1533790q13, Function1<? super C1533790q13, Unit> function1) {
        C1534250q1n.LIZ.LJIIJ(new AwS567S0100000_23(c1533490q0Z, 3));
        c1533790q13.LIZJ.LIZLLL("prepare_fetch");
        AwS232S0300000_23 awS232S0300000_23 = new AwS232S0300000_23(this, (C1535040q34) c1533790q13, (C1533790q13) function1, (Function1<? super C1533790q13, Unit>) 0);
        AtomicReference<Boolean> atomicReference = this.LJIIJ;
        Boolean boolValueOf = Boolean.valueOf(c1533490q0Z.LJJIIZ);
        while (!atomicReference.compareAndSet(null, boolValueOf)) {
            if (atomicReference.get() != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("processTaskType is already set to ");
                sbLIZ.append(this.LJIIJ.get());
                C1535250q3P c1535250q3P = new C1535250q3P("ResourceProcessChain", "fetch", C2188811AlT.LIZIZ(sbLIZ), null, null, false, null, 120);
                C1534250q1n c1534250q1n = C1534250q1n.LIZ;
                c1534250q1n.LJIIJ(new AwS567S0100000_23(c1535250q3P, 4));
                c1533790q13.LJIILIIL(c1535250q3P);
                if (LJIILJJIL(null, c1533790q13, c1533490q0Z.LJ, new LinkedList(), awS232S0300000_23, c1533790q13.LIZ.LJJJJJL)) {
                    return true;
                }
                C1535250q3P c1535250q3P2 = new C1535250q3P("ResourceProcessChain", "fetch", "failed to reuse chain", null, null, false, null, 120);
                c1534250q1n.LJIIJ(new AwS567S0100000_23(c1535250q3P2, 5));
                c1533790q13.LJIILIIL(c1535250q3P2);
                awS232S0300000_23.invoke(null);
                return false;
            }
        }
        this.LIZIZ = new WeakReference<>(awS232S0300000_23);
        c1533790q13.LIZJ.LIZJ("prepare_fetch");
        this.LIZ.LIZJ = c1533490q0Z.LJJJIL;
        LJ(c1533490q0Z.LJ, c1533490q0Z, c1533790q13, C786410Ut5.u3(), false, false, this.LIZJ, awS232S0300000_23);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final <Type> boolean LJII(AbstractC1535150q3F<?, Type> abstractC1535150q3F, C1534360q1y<Type> c1534360q1y, C1533790q13 c1533790q13, boolean z) {
        C1535110q3B<?> c1535110q3B;
        AbstractC1535150q3F<?, ?> second;
        ?? r2;
        C1535180q3I<C1535110q3B<?>> c1535180q3I = this.LJIILL.get(abstractC1535150q3F.LIZIZ);
        boolean z2 = false;
        if (c1535180q3I == null) {
            C1533880q1C.LIZ("ResourceProcessChain", "onProcessorFinish", "stub reference is null, should not reach here", null, null);
            return false;
        }
        if (!z) {
            C1535110q3B<?> c1535110q3B2 = c1535180q3I.LIZ;
            ?? r22 = c1535110q3B2;
            if (c1535110q3B2 == null) {
                WeakReference<C1535110q3B<?>> weakReference = c1535180q3I.LIZIZ;
                if (weakReference != null && (r2 = weakReference.get()) != 0) {
                    c1535180q3I.LIZ = r2;
                    r22 = r2;
                } else {
                    r22 = 0;
                }
            }
            if (!(r22 instanceof C1535110q3B) || (c1535110q3B = (C1535110q3B) r22) == null) {
                return false;
            }
        } else {
            C1535110q3B<?> c1535110q3BLIZIZ = c1535180q3I.LIZIZ();
            if (!(c1535110q3BLIZIZ instanceof C1535110q3B) || (c1535110q3B = c1535110q3BLIZIZ) == null) {
                return false;
            }
        }
        if (c1534360q1y != null) {
            HashMap<Class<?>, AbstractC1535150q3F<?, ?>> map = c1535110q3B.LIZIZ;
            if (map == null || (second = map.get(c1535110q3B.LIZ)) == null) {
                C443120HZe<? extends C1535110q3B<?>, ? extends AbstractC1535150q3F<?, ?>, Integer> c443120HZe = c1535110q3B.LIZLLL;
                if (c443120HZe != null) {
                    second = c443120HZe.getSecond();
                }
                return false;
            }
            if (abstractC1535150q3F == second) {
                if (abstractC1535150q3F.LIZJ() != EnumC1528510psX.NO_REUSE) {
                    z2 = true;
                }
            }
            return false;
        }
        return c1535110q3B.LIZIZ(c1534360q1y, z2, c1533790q13);
    }

    public static final boolean LJIILIIL(C1535040q34 c1535040q34, Class<?> cls, C1533790q13 c1533790q13, Function1<? super C1534360q1y<?>, Unit> function1, boolean z, boolean z2) {
        C1535110q3B<?> c1535110q3BLIZ;
        C1534360q1y<?> c1534360q1y;
        AbstractC1534220q1k abstractC1534220q1kLIZ;
        C1535180q3I<C1535110q3B<?>> c1535180q3I = c1535040q34.LJIILL.get(cls);
        if (c1535180q3I == null || (c1535110q3BLIZ = c1535180q3I.LIZ()) == null || (c1534360q1y = c1535110q3BLIZ.LJI) == null || (abstractC1534220q1kLIZ = C1534360q1y.LIZ(c1534360q1y, c1533790q13, false, 6)) == null) {
            return false;
        }
        C1533910q1F c1533910q1F = c1533790q13.LIZ.LJJJLZIJ;
        if (c1533910q1F != null && c1533910q1F.LJIIIIZZ == EnumC1534440q26.PREPARING) {
            c1533910q1F.LJIIIIZZ = EnumC1534440q26.FETCHING;
            SystemClock.elapsedRealtime();
        }
        if (!z) {
            c1535180q3I.LIZIZ();
        }
        C1533910q1F c1533910q1F2 = c1533790q13.LIZ.LJJJLZIJ;
        if (c1533910q1F2 != null) {
            c1533910q1F2.LIZJ();
        }
        C1535250q3P c1535250q3P = new C1535250q3P("ResourceProcessChain", "tryReuseChainToGetTargetType", "data already generated", null, null, false, null, 120);
        C1534250q1n.LIZ.LJIIJ(new AwS567S0100000_23(c1535250q3P, 11));
        c1533790q13.LJIILIIL(c1535250q3P);
        if (!z2) {
            c1533790q13.LJJIJIIJI = true;
        } else {
            c1533790q13.LJJIJL = true;
        }
        function1.invoke(new C1534360q1y(abstractC1534220q1kLIZ, true));
        return true;
    }

    public final <Type> boolean LIZLLL(Class<Type> cls, C1533790q13 c1533790q13, boolean z, InterfaceC1530490pvj interfaceC1530490pvj, C1535040q34 c1535040q34, Function2<? super C1534360q1y<?>, ? super LinkedList<AbstractC1535150q3F<?, ?>>, Unit> function2) {
        Class<?> cls2;
        AbstractC1535150q3F<?, ?> abstractC1535150q3F;
        AbstractC1535150q3F<?, ?> second;
        AbstractC1535150q3F<?, ?> abstractC1535150q3F2;
        EnumC1528510psX enumC1528510psXLIZJ;
        Object obj;
        C1535110q3B<?> first;
        C1534360q1y<?> c1534360q1y;
        AbstractC1534220q1k abstractC1534220q1kLIZ;
        C1535110q3B<?> first2;
        EnumC1528510psX enumC1528510psXLIZJ2;
        boolean z2 = c1533790q13.LIZ.LJJIIZ;
        C1534360q1y<?> c1534360q1y2 = this.LJIILJJIL;
        C1535110q3B<?> c1535110q3B = null;
        if (c1534360q1y2 != null && (cls2 = c1534360q1y2.LIZJ) != null) {
            C1535180q3I<C1535110q3B<?>> c1535180q3I = this.LJIILL.get(cls);
            if (c1535180q3I == null) {
                C1534250q1n.LIZ.LJIIJ(AFwS212S0000000_23.get$arr$(1));
                function2.invoke(null, null);
                return false;
            }
            C1535110q3B<?> c1535110q3BLIZ = c1535180q3I.LIZ();
            if (c1535110q3BLIZ == null) {
                C1534250q1n.LIZ.LJIIJ(AFwS212S0000000_23.get$arr$(0));
                function2.invoke(null, null);
                return false;
            }
            LinkedList linkedList = new LinkedList();
            C1534360q1y<?> c1534360q1y3 = c1535110q3BLIZ.LJI;
            boolean z3 = true;
            if (c1534360q1y3 != null) {
                if (!z2) {
                    c1535180q3I.LIZIZ();
                }
                function2.invoke(c1534360q1y3, linkedList);
                return true;
            }
            boolean z4 = true;
            loop0: while (true) {
                C1534360q1y<?> c1534360q1y4 = c1535110q3BLIZ.LJI;
                if (c1534360q1y4 != null) {
                    function2.invoke(c1534360q1y4, linkedList);
                    return z3;
                }
                do {
                    Class<?> cls3 = c1535110q3BLIZ.LIZ;
                    HashMap<Class<?>, AbstractC1535150q3F<?, ?>> map = c1535110q3BLIZ.LIZIZ;
                    if (map != null) {
                        abstractC1535150q3F = map.get(cls3);
                    } else {
                        abstractC1535150q3F = null;
                    }
                    C443120HZe<? extends C1535110q3B<?>, ? extends AbstractC1535150q3F<?, ?>, Integer> c443120HZe = c1535110q3BLIZ.LIZLLL;
                    if (c443120HZe != null) {
                        second = c443120HZe.getSecond();
                    } else {
                        second = null;
                    }
                    if (abstractC1535150q3F == null) {
                        abstractC1535150q3F2 = second;
                    } else {
                        abstractC1535150q3F2 = abstractC1535150q3F;
                    }
                    if (z2) {
                        if (!c1535110q3BLIZ.LIZJ.get()) {
                            if (abstractC1535150q3F2 != null) {
                                enumC1528510psXLIZJ2 = abstractC1535150q3F2.LIZJ();
                            } else {
                                enumC1528510psXLIZJ2 = null;
                            }
                            if (enumC1528510psXLIZJ2 == EnumC1528510psX.WAIT_FOR_RESULT) {
                                if (c1535110q3B == null) {
                                    c1535110q3B = c1535110q3BLIZ;
                                }
                            } else if (enumC1528510psXLIZJ2 == EnumC1528510psX.REGISTER_CALLBACK) {
                                if (c1535110q3B == null) {
                                    c1535110q3B = c1535110q3BLIZ;
                                }
                                z4 = false;
                            }
                        }
                    } else {
                        z2 = false;
                        if (!c1535110q3BLIZ.LIZJ.compareAndSet(z3, false)) {
                            if (abstractC1535150q3F2 != null) {
                                enumC1528510psXLIZJ = abstractC1535150q3F2.LIZJ();
                            } else {
                                enumC1528510psXLIZJ = null;
                            }
                            if (enumC1528510psXLIZJ == EnumC1528510psX.WAIT_FOR_RESULT) {
                                if (c1535110q3B == null) {
                                    c1535110q3B = c1535110q3BLIZ;
                                }
                            } else if (enumC1528510psXLIZJ == EnumC1528510psX.REGISTER_CALLBACK) {
                                if (c1535110q3B == null) {
                                    c1535110q3B = c1535110q3BLIZ;
                                }
                                z4 = false;
                            }
                        }
                    }
                    if (abstractC1535150q3F != null) {
                        linkedList.addFirst(abstractC1535150q3F);
                    }
                    if (second != null) {
                        linkedList.addFirst(second);
                    }
                    C443120HZe<? extends C1535110q3B<?>, ? extends AbstractC1535150q3F<?, ?>, Integer> c443120HZe2 = c1535110q3BLIZ.LIZLLL;
                    if (c443120HZe2 == null || (first2 = c443120HZe2.getFirst()) == null || c1535110q3BLIZ == first2) {
                        break loop0;
                    }
                    c1535110q3BLIZ = first2;
                    z3 = true;
                } while (c1535110q3B != null);
            }
            if (c1535110q3B != null) {
                C443120HZe<? extends C1535110q3B<?>, ? extends AbstractC1535150q3F<?, ?>, Integer> c443120HZe3 = c1535110q3B.LIZLLL;
                if (c443120HZe3 != null && (first = c443120HZe3.getFirst()) != null && (c1534360q1y = first.LJI) != null && interfaceC1530490pvj != null && interfaceC1530490pvj.LIZ(c1534360q1y, c1533790q13, LJFF(), true) && (abstractC1534220q1kLIZ = C1534360q1y.LIZ(c1534360q1y, c1533790q13, false, 6)) != null) {
                    function2.invoke(new C1534360q1y(abstractC1534220q1kLIZ, true), null);
                    return true;
                }
                if (!z4 && z) {
                    c1535110q3B.LIZ(c1535040q34, new AwS389S0200000_23(function2, (Function2<? super C1534360q1y<?>, ? super LinkedList<AbstractC1535150q3F<?, ?>>, Unit>) linkedList, (LinkedList<AbstractC1535150q3F<?, ?>>) 1));
                    return true;
                }
                C1534360q1y<?> c1534360q1y5 = c1535110q3B.LJI;
                if (c1534360q1y5 == null) {
                    if (c1535040q34 != null) {
                        c1535040q34.LJI = C786410Ut5.u3();
                    }
                    C1535160q3G.LIZJ(c1535110q3B.LJ, c1535040q34);
                    if (c1535040q34 != null) {
                        c1535040q34.LJI = null;
                    }
                    c1534360q1y5 = c1535110q3B.LJI;
                }
                function2.invoke(c1534360q1y5, linkedList);
                return true;
            }
            if (!linkedList.isEmpty()) {
                Iterator it2 = linkedList.iterator();
                while (it2.hasNext() && !Intrinsics.LJFF(((AbstractC1535150q3F) it2.next()).LIZ, cls2)) {
                    it2.remove();
                }
                if (!linkedList.isEmpty()) {
                    AbstractC1535150q3F abstractC1535150q3F3 = (AbstractC1535150q3F) C13LP.LJJJJZI(linkedList);
                    if (!Intrinsics.LJFF(abstractC1535150q3F3.LIZ, cls2)) {
                        if (!Intrinsics.LJFF(abstractC1535150q3F3.LIZ, abstractC1535150q3F3.LIZIZ)) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("processor type ");
                            sbLIZ.append(((AbstractC1535150q3F) linkedList.getFirst()).LIZ);
                            sbLIZ.append(" not match input type ");
                            sbLIZ.append(cls2);
                            C1533880q1C.LIZ("ResourceProcessChain", "getProcessors2Type", C2188811AlT.LIZIZ(sbLIZ), null, null);
                            this.LJIIIZ.LIZJ();
                        }
                        C1533810q15 c1533810q15 = c1533790q13.LIZLLL;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("ResourceProcessChain# process chain cannot handle the type ");
                        sbLIZ2.append(cls2);
                        sbLIZ2.append(", expect input ");
                        sbLIZ2.append(abstractC1535150q3F3.LIZ);
                        c1533810q15.LJ(5, C2188811AlT.LIZIZ(sbLIZ2));
                        function2.invoke(null, null);
                        return false;
                    }
                }
            }
            if (linkedList.isEmpty()) {
                C1534360q1y<?> c1534360q1y6 = this.LJIILJJIL;
                if (c1534360q1y6 != null) {
                    obj = c1534360q1y6.LIZJ;
                } else {
                    obj = null;
                }
            } else {
                obj = ((AbstractC1535150q3F) C13LP.LJJLIIIJJI(linkedList)).LIZIZ;
            }
            if (!Intrinsics.LJFF(obj, cls)) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("final type ");
                sbLIZ3.append(obj);
                sbLIZ3.append(" not match type ");
                sbLIZ3.append(cls);
                sbLIZ3.append(", processor chain: ");
                sbLIZ3.append(linkedList);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                C1533880q1C.LIZJ("ResourceProcessChain", "getProcessors2Type", strLIZIZ, new RuntimeException(strLIZIZ), null);
                function2.invoke(null, null);
                return false;
            }
            function2.invoke(this.LJIILJJIL, linkedList);
            return true;
        }
        C1533880q1C.LIZ("ResourceProcessChain", "getProcessors2Type", "cannot get dataWrapper", null, null);
        function2.invoke(null, null);
        return false;
    }

    public final void LJIIIZ(Class<?> cls, C1533790q13 c1533790q13, Thread thread, boolean z, LinkedList<String> linkedList, Function1<? super C1534360q1y<?>, Unit> function1) {
        if (!LJI()) {
            C1535250q3P c1535250q3P = new C1535250q3P("ResourceProcessChain", "processDataProvider", "chain is not valid", null, null, false, null, 120);
            C1534250q1n.LIZ.LJIIJ(new AwS567S0100000_23(c1535250q3P, 9));
            c1533790q13.LJIILIIL(c1535250q3P);
            function1.invoke(null);
            return;
        }
        AbstractC1534540q2G abstractC1534540q2G = this.LJIILIIL;
        if (abstractC1534540q2G == null) {
            C1533880q1C.LIZ("ResourceProcessChain", "processDataProvider", "currentDataProvider is null", null, null);
            this.LJIIIZ.LIZJ();
            return;
        }
        C1533490q0Z c1533490q0Z = c1533790q13.LIZ;
        C1533910q1F c1533910q1F = c1533490q0Z.LJJJLZIJ;
        if (c1533910q1F != null && c1533910q1F.LJIIIIZZ == EnumC1534440q26.PREPARING) {
            c1533910q1F.LJIIIIZZ = EnumC1534440q26.FETCHING;
            SystemClock.elapsedRealtime();
        }
        C1492150ovt c1492150ovt = c1533790q13.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(abstractC1534540q2G.getName());
        sbLIZ.append("_cost");
        c1492150ovt.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
        try {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("start to process dataProvider ");
            sbLIZ2.append(abstractC1534540q2G.getName());
            C1535250q3P c1535250q3P2 = new C1535250q3P("ResourceProcessChain", "processDataProvider", C2188811AlT.LIZIZ(sbLIZ2), null, null, false, null, 120);
            C1534250q1n.LIZ.LJIIJ(new AwS567S0100000_23(c1535250q3P2, 10));
            c1533790q13.LJIILIIL(c1535250q3P2);
            abstractC1534540q2G.LJII(c1533790q13, new C1535050q35(c1533490q0Z, linkedList, abstractC1534540q2G, this, cls, c1533790q13, thread, z, function1));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1533880q1C.LIZ("ResourceProcessChain", "processDataProvider", "error occurs when process data", th, null);
            function1.invoke(null);
        }
    }

    public final boolean LJIIL(C1535040q34 c1535040q34, C1533790q13 c1533790q13, Class cls, LinkedList linkedList, Function1 function1, boolean z) {
        C1535160q3G.LIZJ(this.LJIIJJI, c1535040q34);
        if (c1535040q34 != null) {
            c1535040q34.LJI = null;
        }
        if (this.LJIIIZ.LIZ.get() < 0 || this.LJIILJJIL == null) {
            return false;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        InterfaceC1530490pvj interfaceC1530490pvj = c1533790q13.LIZ.LJI;
        LIZLLL(cls, c1533790q13, z, interfaceC1530490pvj, c1535040q34, new C1535070q37(c1535040q34, function1, c1533790q13, this, interfaceC1530490pvj, z, atomicBoolean, cls, linkedList));
        return atomicBoolean.compareAndSet(true, false);
    }

    public final boolean LJIILJJIL(final C1535040q34 c1535040q34, final C1533790q13 c1533790q13, final Class cls, final LinkedList linkedList, final Function1 function1, final boolean z) {
        String name;
        if (c1535040q34 == this) {
            C1533880q1C.LIZ("ResourceProcessChain", "tryReuseChainToGetTargetType", "cannot reuse self chain", null, null);
            return false;
        }
        if (c1535040q34 != null) {
            c1535040q34.LIZLLL = this;
        }
        C1535040q34 c1535040q342 = this.LIZLLL;
        if (c1535040q342 != null) {
            return c1535040q342.LJIILJJIL(c1535040q34, c1533790q13, cls, linkedList, function1, z);
        }
        C1535120q3C c1535120q3C = this.LJIIIZ;
        if (c1535120q3C.LIZ.incrementAndGet() > 0) {
            C1533910q1F c1533910q1F = c1533790q13.LIZ.LJJJLZIJ;
            if (c1533910q1F != null && c1533910q1F.LJIIIIZZ == EnumC1534440q26.PENDING) {
                c1533910q1F.LJIIIIZZ = EnumC1534440q26.PREPARING;
                SystemClock.elapsedRealtime();
            }
            if (LJIILIIL(this, cls, c1533790q13, function1, c1533790q13.LIZ.LJJIIZ, false)) {
                return true;
            }
            C086F.LIZ.getClass();
            boolean zLIZ = C086F.LIZ();
            long j = 0;
            boolean z2 = false;
            while (true) {
                AbstractC1534540q2G abstractC1534540q2G = this.LJIILIIL;
                if ((abstractC1534540q2G != null && (!abstractC1534540q2G.LIZIZ() || abstractC1534540q2G.LIZ() || abstractC1534540q2G.LIZJ() == EnumC1528510psX.REGISTER_CALLBACK)) || this.LIZLLL != null || this.LJIIIZ.LIZ.get() < 0 || this.LJIILJJIL != null) {
                    break;
                }
                try {
                    Thread.sleep(20L);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
                if (c1535040q34 != null && !c1535040q34.LJI()) {
                    return true;
                }
                if (zLIZ) {
                    long j2 = 1 + j;
                    if (j >= 10) {
                        if (!z) {
                            StringBuilder sb = new StringBuilder("waiting for data wrapper but timeout, provider name: ");
                            AbstractC1534540q2G abstractC1534540q2G2 = this.LJIILIIL;
                            if (abstractC1534540q2G2 != null) {
                                name = abstractC1534540q2G2.getName();
                            } else {
                                name = null;
                            }
                            sb.append(name);
                            C1535250q3P c1535250q3P = new C1535250q3P("ResourceProcessChain", "tryReuseChainToGetTargetType", sb.toString(), null, null, false, null, 120);
                            C1534250q1n.LIZ.LJIIJ(new AwS567S0100000_23(c1535250q3P, 18));
                            c1533790q13.LJIILIIL(c1535250q3P);
                            return false;
                        }
                        z2 = true;
                    } else {
                        j = j2;
                    }
                }
                z2 = true;
            }
            C1533910q1F c1533910q1F2 = c1533790q13.LIZ.LJJJLZIJ;
            if (c1533910q1F2 != null && c1533910q1F2.LJIIIIZZ == EnumC1534440q26.PREPARING) {
                c1533910q1F2.LJIIIIZZ = EnumC1534440q26.FETCHING;
                SystemClock.elapsedRealtime();
            }
            C1535040q34 c1535040q343 = this.LIZLLL;
            if (c1535040q343 != null) {
                this.LJIIIZ.LIZ.decrementAndGet();
                return c1535040q343.LJIILJJIL(c1535040q34, c1533790q13, cls, linkedList, function1, z);
            }
            AbstractC1534540q2G abstractC1534540q2G3 = this.LJIILIIL;
            if (abstractC1534540q2G3 == null) {
                C1535250q3P c1535250q3P2 = new C1535250q3P("ResourceProcessChain", "tryReuseChainToGetTargetType", "cannot get DataProvider", null, null, false, null, 120);
                C1534250q1n.LIZ.LJIIJ(new AwS567S0100000_23(c1535250q3P2, 25));
                c1533790q13.LJIILIIL(c1535250q3P2);
                return false;
            }
            if (this.LJIILJJIL == null) {
                if (!abstractC1534540q2G3.LJIIIZ(c1533790q13)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("reject to reusing ");
                    sbLIZ.append(abstractC1534540q2G3.getName());
                    sbLIZ.append(", is on main thread: ");
                    C086F.LIZ.getClass();
                    sbLIZ.append(C086F.LIZ());
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    C1535250q3P c1535250q3P3 = new C1535250q3P("ResourceProcessChain", "tryReuseChainToGetTargetType", strLIZIZ, null, null, false, null, 120);
                    C1534250q1n.LIZ.LJIIJ(new AwS567S0100000_23(c1535250q3P3, 19));
                    c1533790q13.LJIILIIL(c1535250q3P3);
                    c1533790q13.LIZLLL.LIZLLL(strLIZIZ);
                    return false;
                }
                Boolean bool = this.LJIIJ.get();
                if (bool != null) {
                    if (bool.booleanValue() && !this.LJIIIZ.LIZ()) {
                        C1535250q3P c1535250q3P4 = new C1535250q3P("ResourceProcessChain", "tryReuseChainToGetTargetType", "data not provision", null, null, false, null, 120);
                        C1534250q1n.LIZ.LJIIJ(new AwS567S0100000_23(c1535250q3P4, 20));
                        c1533790q13.LJIILIIL(c1535250q3P4);
                        LJIIIIZZ(c1533790q13, cls, C786410Ut5.u3(), false, false, linkedList, function1);
                        return true;
                    }
                    if (z && (abstractC1534540q2G3.LIZJ() == EnumC1528510psX.REGISTER_CALLBACK || zLIZ)) {
                        C1535250q3P c1535250q3P5 = new C1535250q3P("ResourceProcessChain", "tryReuseChainToGetTargetType", "register callback", null, null, false, null, 120);
                        C1534250q1n.LIZ.LJIIJ(new AwS567S0100000_23(c1535250q3P5, 21));
                        c1533790q13.LJIILIIL(c1535250q3P5);
                        C1535200q3K<Runnable> c1535200q3K = new C1535200q3K<>(new Runnable() { // from class: X.0q3E
                            public final void LIZ() {
                                C1535040q34 c1535040q344 = this.LL;
                                if (c1535040q344 != null) {
                                    c1535040q344.LJII = null;
                                }
                                C1535250q3P c1535250q3P6 = new C1535250q3P("ResourceProcessChain", "tryReuseChainToGetTargetType", "on data received", null, null, false, null, 120);
                                C1533790q13 c1533790q132 = c1533790q13;
                                C1534250q1n.LIZ.LJIIJ(new AwS567S0100000_23(c1535250q3P6, 23));
                                c1533790q132.LJIILIIL(c1535250q3P6);
                                C1533910q1F c1533910q1F3 = c1533790q13.LIZ.LJJJLZIJ;
                                if (c1533910q1F3 != null) {
                                    c1533910q1F3.LIZJ();
                                }
                                C1535040q34 c1535040q345 = this;
                                boolean z3 = z;
                                C1533790q13 c1533790q133 = c1533790q13;
                                if (c1535040q345.LJIIL(this.LL, c1533790q133, cls, linkedList, function1, z3)) {
                                    return;
                                }
                                c1533790q13.LIZLLL.LIZLLL("failed to reuse chain");
                                function1.invoke(null);
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ2;
                                C1C7U.LIZ("ResourceProcessChain@7ee4.tryReuseChainToGetTargetType$cancelable$1");
                                try {
                                    LIZ();
                                } finally {
                                    if (!zLIZ2) {
                                    }
                                }
                                C1C7U.LIZIZ("ResourceProcessChain@7ee4.tryReuseChainToGetTargetType$cancelable$1");
                            }
                        });
                        if (this.LJIIL.LIZ(c1535200q3K)) {
                            if (c1535040q34 != null) {
                                c1535040q34.LJII = c1535200q3K;
                            }
                            return true;
                        }
                    }
                } else {
                    C1533880q1C.LIZJ("ResourceProcessChain", "tryReuseChainToGetTargetType", "processTaskType is null", null, null);
                    return LIZ(c1533790q13.LIZ, c1533790q13, new AwS389S0200000_23(c1533790q13, function1, 3));
                }
            } else {
                C1533910q1F c1533910q1F3 = c1533790q13.LIZ.LJJJLZIJ;
                if (c1533910q1F3 != null) {
                    c1533910q1F3.LIZJ();
                }
                if (LJIILIIL(this, cls, c1533790q13, function1, c1533790q13.LIZ.LJJIIZ, z2)) {
                    return true;
                }
            }
            if (c1535040q34 != null) {
                c1535040q34.LJI = C786410Ut5.u3();
            }
            return LJIIL(c1535040q34, c1533790q13, cls, linkedList, function1, z);
        }
        c1535120q3C.LIZ.decrementAndGet();
        C1535250q3P c1535250q3P6 = new C1535250q3P("ResourceProcessChain", "tryReuseChainToGetTargetType", "cannot reuse chain", null, null, false, null, 120);
        C1534250q1n.LIZ.LJIIJ(new AwS567S0100000_23(c1535250q3P6, 17));
        c1533790q13.LJIILIIL(c1535250q3P6);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(X.C1533790q13 r28, java.lang.Class<?> r29, java.lang.Thread r30, boolean r31, boolean r32, java.util.LinkedList<java.lang.String> r33, kotlin.jvm.functions.Function1<? super X.C1534360q1y<?>, kotlin.Unit> r34) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1535040q34.LJIIIIZZ(X.0q13, java.lang.Class, java.lang.Thread, boolean, boolean, java.util.LinkedList, kotlin.jvm.functions.Function1):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v41, types: [T, X.0q2G] */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r0v69, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r0v71 */
    public final void LJ(Class<?> cls, C1533490q0Z c1533490q0Z, C1533790q13 c1533790q13, Thread thread, boolean z, boolean z2, LinkedList<String> linkedList, Function1<? super C1534360q1y<?>, Unit> function1) {
        AbstractC1534540q2G abstractC1534540q2G;
        String message;
        ?? r0;
        Iterator<Map.Entry<Class<?>, C1535180q3I<C1535110q3B<?>>>> it2 = this.LJIILL.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<Class<?>, C1535180q3I<C1535110q3B<?>>> next = it2.next();
            C1535180q3I<C1535110q3B<?>> value = next.getValue();
            C1535110q3B<?> c1535110q3B = value.LIZ;
            ?? r02 = c1535110q3B;
            if (c1535110q3B == null) {
                WeakReference<C1535110q3B<?>> weakReference = value.LIZIZ;
                if (weakReference != null && (r0 = weakReference.get()) != 0) {
                    value.LIZ = r0;
                    r02 = r0;
                } else {
                    r02 = 0;
                }
            }
            C1535110q3B c1535110q3B2 = (C1535110q3B) r02;
            if (c1535110q3B2 == null) {
                it2.remove();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("typeStub ");
                sbLIZ.append(next.getKey().getName());
                sbLIZ.append(" is null");
                C1533880q1C.LIZJ("ResourceProcessChain", "internalFetch", C2188811AlT.LIZIZ(sbLIZ), null, null);
            } else {
                c1535110q3B2.LIZIZ = null;
                c1535110q3B2.LIZLLL = null;
                c1535110q3B2.LIZJ.set(true);
            }
        }
        C1535040q34 c1535040q34 = this.LIZLLL;
        C259800zU c259800zU = new C259800zU();
        while (this.LJFF.hasNext()) {
            String next2 = this.LJFF.next();
            if (!LJI()) {
                c1533790q13.LJIIL = true;
                C1535250q3P c1535250q3P = new C1535250q3P("ResourceProcessChain", "fetchDataProvider", "fetch canceled", null, null, false, null, 120);
                C1534250q1n.LIZ.LJIIJ(new AwS567S0100000_23(c1535250q3P, 22));
                c1533790q13.LJIILIIL(c1535250q3P);
                abstractC1534540q2G = null;
                break;
            }
            C1492150ovt c1492150ovt = c1533790q13.LIZJ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("init_");
            sbLIZ2.append(next2);
            c1492150ovt.LIZLLL(C2188811AlT.LIZIZ(sbLIZ2));
            try {
                ResourceFetcher resourceFetcherLIZIZ = C1533950q1J.LIZIZ(c1533490q0Z.LJJJJJ, next2, c1533790q13);
                if (resourceFetcherLIZIZ == null) {
                    C1492150ovt c1492150ovt2 = c1533790q13.LIZJ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("init_");
                    sbLIZ3.append(next2);
                    c1492150ovt2.LIZJ(C2188811AlT.LIZIZ(sbLIZ3));
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("cannot get fetcher instance at ");
                    sbLIZ4.append(next2);
                    C1534250q1n.LJFF("ResourceProcessChain", "fetchDataProvider", C2188811AlT.LIZIZ(sbLIZ4), null, false);
                    C1533810q15 c1533810q15 = c1533790q13.LIZLLL;
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append(next2);
                    sbLIZ5.append(" fetcher not registered");
                    c1533810q15.LIZIZ(5, next2, C2188811AlT.LIZIZ(sbLIZ5));
                } else {
                    c1533790q13.LJIJJ = resourceFetcherLIZIZ;
                    this.LJ.add(next2);
                    C1492150ovt c1492150ovt3 = c1533790q13.LIZJ;
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("init_");
                    sbLIZ6.append(next2);
                    c1492150ovt3.LIZJ(C2188811AlT.LIZIZ(sbLIZ6));
                    resourceFetcherLIZIZ.getTimer().LJ();
                    c259800zU.element = resourceFetcherLIZIZ.fetch(c1533490q0Z, c1533790q13);
                    resourceFetcherLIZIZ.getTimer().LIZIZ();
                    if (c259800zU.element != null || !Intrinsics.LJFF(this.LIZLLL, c1535040q34)) {
                        AbstractC1534540q2G abstractC1534540q2G2 = (AbstractC1534540q2G) c259800zU.element;
                        if (abstractC1534540q2G2 != null && !abstractC1534540q2G2.LJIIIZ(c1533790q13)) {
                            C1534250q1n.LIZ.LJIIJ(new AwS567S0100000_23(c259800zU, (C259800zU<AbstractC1534540q2G>) 24));
                            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                            sbLIZ7.append(((AbstractC1534540q2G) c259800zU.element).getName());
                            sbLIZ7.append(" can not process the response");
                            resourceFetcherLIZIZ.setFetcherError(1, C2188811AlT.LIZIZ(sbLIZ7));
                        } else {
                            c1533790q13.LJ = next2;
                            this.LIZ.LIZ = next2;
                            AbstractC1534540q2G abstractC1534540q2G3 = (AbstractC1534540q2G) c259800zU.element;
                            if (abstractC1534540q2G3 == null) {
                                break;
                            }
                            abstractC1534540q2G3.LIZJ = resourceFetcherLIZIZ.getTimer();
                            abstractC1534540q2G3.LIZIZ = resourceFetcherLIZIZ;
                            abstractC1534540q2G3.LIZ = this;
                            break;
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1492150ovt c1492150ovt4 = c1533790q13.LIZJ;
                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                sbLIZ8.append("init_");
                sbLIZ8.append(next2);
                c1492150ovt4.LIZJ(C2188811AlT.LIZIZ(sbLIZ8));
                StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                sbLIZ9.append("catch error on ");
                sbLIZ9.append(next2);
                sbLIZ9.append(", error:");
                sbLIZ9.append(th.getMessage());
                sbLIZ9.append(' ');
                Throwable cause = th.getCause();
                if (cause != null) {
                    message = cause.getMessage();
                } else {
                    message = null;
                }
                sbLIZ9.append(message);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ9);
                c1533790q13.LIZLLL.LIZIZ(4, next2, strLIZIZ);
                C1533880q1C.LIZJ("ResourceProcessChain", "fetchDataProvider", strLIZIZ, null, null);
            }
        }
        abstractC1534540q2G = (AbstractC1534540q2G) c259800zU.element;
        if (!Intrinsics.LJFF(this.LIZLLL, c1535040q34)) {
            return;
        }
        if (abstractC1534540q2G == null) {
            C1534250q1n.LIZ.LJIIJ(AFwS212S0000000_23.get$arr$(2));
            this.LJIIIZ.LIZJ();
            c1533790q13.LIZLLL.LJ(6, "ResourceProcessChain# no data provider found");
            function1.invoke(null);
            return;
        }
        this.LJIILIIL = abstractC1534540q2G;
        LJIIIIZZ(c1533790q13, cls, thread, z, z2, linkedList, function1);
    }

    public final void LJIIJ(AbstractC1534220q1k abstractC1534220q1k, C1534360q1y c1534360q1y, Class cls, boolean z, Thread thread, boolean z2, C1533790q13 c1533790q13, Iterator it2, Function1 function1, LinkedList linkedList, LinkedList linkedList2) {
        Object obj;
        boolean z3;
        C1535110q3B<?> c1535110q3BLIZ;
        CountDownLatch countDownLatch;
        C1535180q3I<C1535110q3B<?>> c1535180q3I;
        C1535110q3B<?> c1535110q3BLIZ2;
        AtomicBoolean atomicBoolean;
        Unit unit;
        AbstractC1534220q1k abstractC1534220q1kLIZ = abstractC1534220q1k;
        C1534360q1y c1534360q1y2 = c1534360q1y;
        if (!LJI()) {
            C1535250q3P c1535250q3P = new C1535250q3P("ResourceProcessChain", "processProcessors", "chain is invalid", null, null, false, null, 120);
            C1534250q1n.LIZ.LJIIJ(new AwS567S0100000_23(c1535250q3P, 30));
            c1533790q13.LJIILIIL(c1535250q3P);
            if (abstractC1534220q1kLIZ != null) {
                try {
                    abstractC1534220q1kLIZ.LIZJ();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
            if (c1534360q1y2 == null) {
                unit = null;
            } else {
                c1534360q1y2.LIZIZ();
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
            function1.invoke(null);
            return;
        }
        if (abstractC1534220q1kLIZ == null || (obj = abstractC1534220q1kLIZ.LIZ) == null) {
            if (c1534360q1y2 != null) {
                obj = c1534360q1y2.LIZJ;
            } else {
                C1535250q3P c1535250q3P2 = new C1535250q3P("ResourceProcessChain", "processProcessors", "both data and wrapper is null", null, null, false, null, 120);
                C1534250q1n.LIZ.LJIIJ(new AwS567S0100000_23(c1535250q3P2, 12));
                c1533790q13.LJIILIIL(c1535250q3P2);
                function1.invoke(null);
                return;
            }
        }
        if (!it2.hasNext()) {
            if (Intrinsics.LJFF(obj, cls)) {
                if (abstractC1534220q1kLIZ != null) {
                    c1534360q1y2 = new C1534360q1y(abstractC1534220q1kLIZ, true);
                }
                function1.invoke(c1534360q1y2);
                return;
            } else {
                C1533880q1C.LIZ("ResourceProcessChain", "processProcessors", "traversed but no data found", null, null);
                function1.invoke(null);
                return;
            }
        }
        AbstractC1535150q3F abstractC1535150q3F = (AbstractC1535150q3F) it2.next();
        if (!Intrinsics.LJFF(abstractC1535150q3F.LIZ, obj)) {
            C1533810q15 c1533810q15 = c1533790q13.LIZLLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ResourceProcessChain# input is not expected, real: ");
            sbLIZ.append(abstractC1535150q3F.LIZ);
            sbLIZ.append(", expect: ");
            sbLIZ.append(obj);
            c1533810q15.LJ(3, C2188811AlT.LIZIZ(sbLIZ));
            function1.invoke(null);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("ready to process ");
        sbLIZ2.append(abstractC1535150q3F.getName());
        C1535250q3P c1535250q3P3 = new C1535250q3P("ResourceProcessChain", "processProcessors", C2188811AlT.LIZIZ(sbLIZ2), null, null, false, null, 120);
        C1534250q1n c1534250q1n = C1534250q1n.LIZ;
        c1534250q1n.LJIIJ(new AwS567S0100000_23(c1535250q3P3, 34));
        c1533790q13.LJIILIIL(c1535250q3P3);
        if (C786410Ut5.u3() != thread) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z4 = c1533790q13.LIZ.LJJIIZ;
        C1535180q3I<C1535110q3B<?>> c1535180q3I2 = this.LJIILL.get(abstractC1535150q3F.LIZIZ);
        if (c1535180q3I2 != null) {
            c1535110q3BLIZ = c1535180q3I2.LIZ();
        } else {
            c1535110q3BLIZ = null;
        }
        if (!z3 && z && abstractC1535150q3F.LIZ()) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("execute on background thread, ");
            sbLIZ3.append(abstractC1535150q3F.getName());
            C1535250q3P c1535250q3P4 = new C1535250q3P("ResourceProcessChain", "processProcessors", C2188811AlT.LIZIZ(sbLIZ3), null, null, false, null, 120);
            c1534250q1n.LJIIJ(new AwS567S0100000_23(c1535250q3P4, 35));
            c1533790q13.LJIILIIL(c1535250q3P4);
            C086F c086f = C086F.LIZ;
            C1535080q38 c1535080q38 = new C1535080q38(z4, abstractC1535150q3F, c1533790q13, c1535110q3BLIZ, abstractC1534220q1kLIZ, c1534360q1y2, linkedList2, linkedList, this, function1, it2, cls, z, thread, z2);
            c086f.getClass();
            C086F.LJI(c1535080q38);
            return;
        }
        if (z4 && !Intrinsics.LJFF(abstractC1535150q3F.LIZ, abstractC1535150q3F.LIZIZ)) {
            abstractC1535150q3F.LJ();
            if (c1535110q3BLIZ == null || (atomicBoolean = c1535110q3BLIZ.LIZJ) == null || !atomicBoolean.compareAndSet(true, false)) {
                C1533910q1F c1533910q1F = c1533790q13.LIZ.LJJJLZIJ;
                if (c1533910q1F != null) {
                    c1533910q1F.LJIIIIZZ = EnumC1534440q26.EXECUTED;
                }
                Class<?> cls2 = c1533790q13.LIZ.LJ;
                if (cls2 != null && (c1535180q3I = this.LJIILL.get(cls2)) != null && (c1535110q3BLIZ2 = c1535180q3I.LIZ()) != null) {
                    c1535110q3BLIZ2.LIZ(null, function1);
                }
                C1535250q3P c1535250q3P5 = new C1535250q3P("ResourceProcessChain", "processProcessors", "already executed", null, null, false, null, 120);
                c1534250q1n.LJIIJ(new AwS567S0100000_23(c1535250q3P5, 31));
                c1533790q13.LJIILIIL(c1535250q3P5);
                return;
            }
        }
        if (!z2 && !z && !abstractC1535150q3F.LIZIZ()) {
            countDownLatch = new CountDownLatch(1);
        } else {
            countDownLatch = null;
        }
        if (abstractC1534220q1kLIZ == null) {
            if (c1534360q1y2 != null) {
                abstractC1534220q1kLIZ = C1534360q1y.LIZ(c1534360q1y2, c1533790q13, false, 6);
            } else {
                abstractC1534220q1kLIZ = null;
            }
        }
        if ((abstractC1534220q1kLIZ instanceof AbstractC1534220q1k) && abstractC1534220q1kLIZ != null) {
            linkedList2.add(abstractC1535150q3F.getName());
            C1492150ovt c1492150ovt = c1533790q13.LIZJ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(abstractC1535150q3F.getName());
            sbLIZ4.append("_cost");
            c1492150ovt.LIZLLL(C2188811AlT.LIZIZ(sbLIZ4));
            linkedList.pollFirst();
            abstractC1535150q3F.LJFF(abstractC1534220q1kLIZ, c1533790q13, linkedList, new C1535090q39(c1533790q13, abstractC1535150q3F, it2, this, countDownLatch, function1, cls, z, thread, z2, linkedList, linkedList2, abstractC1534220q1kLIZ, z4));
            if (countDownLatch == null) {
                return;
            }
            C1535160q3G.LIZJ(countDownLatch, null);
        }
    }
}
