package X;

import Y.ARunnableS134S0100000_34;
import Y.ARunnableS67S0300000_34;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.AFwS281S0000000_34;

/* JADX INFO: renamed from: X.1Cjw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2238821Cjw {
    public static final C2238821Cjw LIZ = new C2238821Cjw();
    public static final ArrayList<AbstractC2238911Ck5<?, ?>> LIZIZ = new ArrayList<>();
    public static final LinkedList<C1581210rFX> LIZJ = new LinkedList<>();
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(227));
    public static final ArrayList<C2238811Cjv> LJ = new ArrayList<>();

    public static void LIZLLL() {
        LinkedList<C1581210rFX> linkedList = LIZJ;
        if (linkedList.isEmpty()) {
            return;
        }
        synchronized (linkedList) {
            try {
                C08XD.LJIL(linkedList);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        LJ();
    }

    public static void LJ() {
        ArrayList<C2238811Cjv> arrayList;
        C19719612Di.LJJIIJ(LJ, AFwS281S0000000_34.get$arr$(46), true);
        while (true) {
            arrayList = LJ;
            if (arrayList.size() >= 3) {
                break;
            } else {
                arrayList.add(new C2238811Cjv(C2206191BWf.LIZ.LIZ("preload-task-executor"), EnumC038400Bq.IDLE));
            }
        }
        for (C2238811Cjv c2238811Cjv : arrayList) {
            synchronized (LIZJ) {
                try {
                    EnumC038400Bq enumC038400Bq = c2238811Cjv.LIZIZ;
                    EnumC038400Bq enumC038400Bq2 = EnumC038400Bq.RUNNING;
                    if (enumC038400Bq != enumC038400Bq2) {
                        c2238811Cjv.LIZIZ = enumC038400Bq2;
                        c2238811Cjv.LIZ.submit(new ARunnableS134S0100000_34(c2238811Cjv, 57));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public final void LIZ(List<? extends C1576580r84<?>> list) {
        ArrayList<C2238881Ck2> arrayList;
        AbstractC2238861Ck0 abstractC2238861Ck0;
        AFwS281S0000000_34 aFwS281S0000000_34 = AFwS281S0000000_34.get$arr$(45);
        HashMap<String, C2238881Ck2<?>> map = C2238841Cjy.LIZ;
        synchronized (map) {
            try {
                Collection<C2238881Ck2<?>> collectionValues = map.values();
                arrayList = new ArrayList();
                for (Object obj : collectionValues) {
                    if (((Boolean) aFwS281S0000000_34.invoke((C2238881Ck2) obj)).booleanValue()) {
                        arrayList.add(obj);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object obj2 = ((C2238881Ck2) it2.next()).LJII;
            if ((obj2 instanceof InterfaceC20604415ju) && obj2 != null) {
                arrayList2.add(obj2);
            }
        }
        for (C1576580r84<?> c1576580r84 : list) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                ((InterfaceC20604415ju) it3.next()).LIZ();
            }
            for (C2238881Ck2 c2238881Ck2 : arrayList) {
                AbstractC2238911Ck5<?, ?> abstractC2238911Ck5 = c2238881Ck2.LJFF;
                if ((abstractC2238911Ck5 instanceof AbstractC2238861Ck0) && (abstractC2238861Ck0 = (AbstractC2238861Ck0) abstractC2238911Ck5) != null) {
                    List listLIZIZ = abstractC2238861Ck0.LIZIZ();
                    if (!(listLIZIZ instanceof Collection) || !listLIZIZ.isEmpty()) {
                        Iterator it4 = listLIZIZ.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                AbstractC2238921Ck6 abstractC2238921Ck6 = (AbstractC2238921Ck6) it4.next();
                                if (c1576580r84 != null) {
                                    c1576580r84.LIZIZ();
                                }
                                if (abstractC2238921Ck6.LIZIZ()) {
                                    LIZIZ(this, c1576580r84, c2238881Ck2, null, Float.valueOf(0.0f), new ARunnableS67S0300000_34(abstractC2238861Ck0, c2238881Ck2, c1576580r84, 17), 4);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final void LIZJ(Map<C1576580r84<?>, ? extends List<? extends C2238901Ck4<?, ?>>> map) {
        C20023813Wi c20023813WiLJIIIIZZ;
        InterfaceC20024213Wm interfaceC20024213Wm = C2206191BWf.LIZIZ;
        if (interfaceC20024213Wm != null) {
            c20023813WiLJIIIIZZ = interfaceC20024213Wm.LJIIIIZZ();
        } else {
            c20023813WiLJIIIIZZ = null;
        }
        for (Map.Entry<C1576580r84<?>, ? extends List<? extends C2238901Ck4<?, ?>>> entry : map.entrySet()) {
            C1576580r84<?> key = entry.getKey();
            for (C2238901Ck4<?, ?> c2238901Ck4 : entry.getValue()) {
                AbstractC2238911Ck5<?, ?> abstractC2238911Ck5NewInstance = c2238901Ck4.LIZLLL;
                if (abstractC2238911Ck5NewInstance != null) {
                    ArrayList<AbstractC2238911Ck5<?, ?>> arrayList = LIZIZ;
                    if (!arrayList.contains(abstractC2238911Ck5NewInstance)) {
                        arrayList.add(abstractC2238911Ck5NewInstance);
                    }
                } else {
                    Class<? extends AbstractC2238911Ck5<?, ?>> cls = c2238901Ck4.LIZ;
                    ArrayList<AbstractC2238911Ck5<?, ?>> arrayList2 = LIZIZ;
                    abstractC2238911Ck5NewInstance = (AbstractC2238911Ck5) C13LP.LJJJLL(C13EQ.LJJIJL(arrayList2, cls));
                    if (abstractC2238911Ck5NewInstance == null) {
                        abstractC2238911Ck5NewInstance = cls.newInstance();
                        arrayList2.add(abstractC2238911Ck5NewInstance);
                    }
                }
                List<? extends C1581220rFY<?>> list = c2238901Ck4.LIZJ;
                ArrayList<C2238881Ck2<?>> arrayList3 = new ArrayList(C15438062q.LJIJJ(list, 10));
                for (C1581220rFY<?> c1581220rFY : list) {
                    Class<?> cls2 = c2238901Ck4.LIZIZ;
                    boolean z = abstractC2238911Ck5NewInstance instanceof AbstractC2238861Ck0;
                    Object c2238881Ck2 = c1581220rFY.LIZJ;
                    if (c2238881Ck2 == null) {
                        if (z) {
                            c2238881Ck2 = new C2238891Ck3(c1581220rFY.LIZ, c1581220rFY.LIZIZ, cls2);
                        } else {
                            c2238881Ck2 = new C2238881Ck2(c1581220rFY.LIZ, c1581220rFY.LIZIZ, cls2);
                        }
                    }
                    arrayList3.add(c2238881Ck2);
                }
                for (C2238881Ck2<?> c2238881Ck22 : arrayList3) {
                    c2238881Ck22.LJFF = abstractC2238911Ck5NewInstance;
                    c2238881Ck22.LJI = key;
                    c2238881Ck22.LJII = key.LIZ();
                    abstractC2238911Ck5NewInstance.getClass();
                    HashMap<String, C2238881Ck2<?>> map2 = C2238841Cjy.LIZ;
                    synchronized (map2) {
                        try {
                            map2.put(c2238881Ck22.LIZ.getName(), c2238881Ck22);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                    C2238871Ck1 c2238871Ck1 = C2238871Ck1.LIZ;
                    c2238871Ck1.getClass();
                    if (C2206191BWf.LIZIZ != null && c2238881Ck22.LJI != null) {
                        try {
                            LinkedList linkedList = (LinkedList) C2238871Ck1.LIZLLL.getValue();
                            String str = (String) c2238881Ck22.LJIIIIZZ.getValue();
                            C1576580r84<?> c1576580r84 = c2238881Ck22.LJI;
                            if (c1576580r84 != null) {
                                C189200o6.m2constructorimpl(Boolean.valueOf(linkedList.add(new C2238931Ck7(str, c1576580r84))));
                            } else {
                                "Require scene is not null but null.".toString();
                                throw new IllegalArgumentException("Require scene is not null but null.");
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            C189200o6.m2constructorimpl(new C098200Yq(th2));
                        }
                        c2238871Ck1.LIZ();
                    }
                    LIZIZ(this, key, c2238881Ck22, c20023813WiLJIIIIZZ, null, new ARunnableS67S0300000_34(c2238881Ck22, abstractC2238911Ck5NewInstance, key, 18), 8);
                }
            }
        }
        LIZLLL();
        if (c20023813WiLJIIIIZZ != null) {
            c20023813WiLJIIIIZZ.LIZIZ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.C2238821Cjw r6, X.C1576580r84 r7, X.C2238881Ck2 r8, X.AbstractC20024013Wk r9, java.lang.Float r10, java.lang.Runnable r11, int r12) {
        /*
            r0 = r12 & 4
            r1 = 0
            if (r0 == 0) goto L6
            r9 = r1
        L6:
            r0 = r12 & 8
            if (r0 == 0) goto Lb
            r10 = r1
        Lb:
            r6.getClass()
            X.0rFX r6 = new X.0rFX
            r6.<init>(r7, r8, r11)
            if (r10 == 0) goto L1f
            float r1 = r10.floatValue()
        L19:
            r6.LLILZ = r1
            java.util.LinkedList<X.0rFX> r1 = X.C2238821Cjw.LIZJ
            monitor-enter(r1)
            goto L6d
        L1f:
            if (r9 == 0) goto L6b
            X.01GW r0 = r8.LJIIIIZZ
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            java.util.Map r0 = r9.LIZ(r0, r7)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r3 = r0.iterator()
            r11 = 0
            r9 = 0
            r7 = 0
            r4 = 0
        L3d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L59
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r0.getValue()
            X.13Wj r2 = (X.C20023913Wj) r2
            long r0 = r2.LIZLLL
            long r9 = r9 + r0
            long r0 = r2.LIZIZ
            long r7 = r7 + r0
            long r0 = r2.LIZJ
            long r4 = r4 + r0
            goto L3d
        L59:
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 == 0) goto L6b
            long r2 = r7 / r9
            long r4 = r4 + r7
            long r4 = r4 / r9
            r0 = 2
            long r0 = (long) r0
            long r0 = r0 - r2
            long r4 = r4 * r0
            float r1 = (float) r4
            r0 = 953267991(0x38d1b717, float:1.0E-4)
            float r1 = r1 + r0
            goto L19
        L6b:
            r1 = 0
            goto L19
        L6d:
            r1.add(r6)     // Catch: java.lang.Throwable -> L72
            monitor-exit(r1)
            return
        L72:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L72
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2238821Cjw.LIZIZ(X.1Cjw, X.0r84, X.1Ck2, X.13Wk, java.lang.Float, java.lang.Runnable, int):void");
    }
}
