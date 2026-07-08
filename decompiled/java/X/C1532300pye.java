package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS107S1000000_23;
import kotlin.jvm.internal.AwS567S0100000_23;
import kotlin.jvm.internal.AwS602S0100000_23;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pye, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1532300pye extends AbstractC1541130qCt<C1532300pye> {
    public static final C1531680pxe LJIJI;
    public static final C1530920pwQ LJIJJ = new InterfaceC1532430pyr() { // from class: X.0pwQ
        @Override // X.InterfaceC1532520pz0
        public final boolean LIZ() {
            return true;
        }

        @Override // X.InterfaceC1532430pyr
        public final void LIZIZ(C08AB c08ab, C1532710pzJ c1532710pzJ, C1532470pyv c1532470pyv, C1532170pyR c1532170pyR, Function1<? super C1532340pyi, Unit> function1) {
        }

        @Override // X.InterfaceC1532430pyr
        public final boolean LIZJ(C1532300pye c1532300pye) {
            return true;
        }

        @Override // X.InterfaceC1532520pz0
        public final boolean LJFF() {
            return true;
        }

        @Override // X.InterfaceC1532520pz0
        public final String getName() {
            return "FINISHED";
        }

        @Override // X.InterfaceC1532520pz0
        public final EnumC1528520psY LIZLLL() {
            return EnumC1528520psY.WAIT_FOR_RESULT;
        }

        @Override // X.InterfaceC1532520pz0
        public final void LJ(Function1 function1, Object obj) {
            C1532460pyu.LIZ(this, (C1532550pz3) obj, function1);
        }
    };
    public final boolean LIZLLL;
    public final C1532710pzJ LJ;
    public final Class<?> LJFF;
    public final boolean LJI;
    public final C1532170pyR LJII;
    public CountDownLatch LJIIIIZZ;
    public Thread LJIIIZ;
    public HashMap<Class<?>, C1532180pyS> LJIIJ;
    public Iterator<String> LJIIJJI;
    public volatile Thread LJIIL;
    public volatile InterfaceC1532430pyr LJIILIIL;
    public final LinkedList<String> LJIILJJIL;
    public final AtomicReference<C1532010pyB<AbstractC1532350pyj<?>>> LJIILL;
    public final C08AB LJIILLIIL;
    public C1532340pyi LJIIZILJ;
    public InterfaceC1532190pyT LJIJ;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0pxe] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0pwQ] */
    static {
        final Class<Object> cls = Object.class;
        final Class<Object> cls2 = Object.class;
        LJIJI = new AbstractC1532320pyg<Object, Object>(cls, cls2) { // from class: X.0pxe
            @Override // X.InterfaceC1532520pz0
            public final boolean LIZ() {
                return false;
            }

            @Override // X.AbstractC1532320pyg
            public final void LJII(C1532710pzJ c1532710pzJ, C1532470pyv c1532470pyv, C1532170pyR c1532170pyR, AbstractC1532350pyj abstractC1532350pyj, C1532340pyi c1532340pyi, Function1 function1) {
            }

            @Override // X.InterfaceC1532520pz0
            public final String getName() {
                return "self_register";
            }
        };
    }

    @Override // X.AbstractC1541130qCt
    public final boolean LIZIZ() {
        Unit unit;
        C1532680pzG.LIZ.getClass();
        if (C1532680pzG.LJIILIIL) {
            try {
                Thread thread = this.LJIIL;
                if (thread != null) {
                    thread.interrupt();
                    unit = Unit.LIZ;
                } else {
                    unit = null;
                }
                C189200o6.m2constructorimpl(unit);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        this.LJIIL = null;
        InterfaceC1529320ptq interfaceC1529320ptq = this.LJII.LJIILJJIL;
        if (interfaceC1529320ptq == null) {
            return true;
        }
        interfaceC1529320ptq.cancel();
        return true;
    }

    @Override // X.InterfaceC1541360qDG
    public final void execute() {
        if (!this.LIZLLL && C1532960pzi.LIZ()) {
            C1532710pzJ c1532710pzJ = this.LJ;
            c1532710pzJ.LJIJJLI = false;
            c1532710pzJ.LJFF = true;
        }
        LJIILJJIL((!this.LJ.LJJI && this.LJIIIZ == C786410Ut5.u3() && this.LJIIIIZZ == null) ? false : true);
        CountDownLatch countDownLatch = this.LJIIIIZZ;
        if (countDownLatch != null) {
            C1532960pzi.LJI(countDownLatch, this.LIZ, null);
        }
    }

    @Override // X.AbstractC1541130qCt
    public final boolean LJFF(InterfaceC1541240qD4 interfaceC1541240qD4) {
        if (!(interfaceC1541240qD4 instanceof C1532340pyi)) {
            return false;
        }
        return LJIIJJI(false, ((C1532340pyi) interfaceC1541240qD4).LIZIZ(this.LJ), null);
    }

    public final void LJII(C1532300pye c1532300pye) {
        C1531990py9<C1531820pxs> c1531990py9;
        C1532170pyR c1532170pyR = c1532300pye.LJII;
        AwS567S0100000_23 awS567S0100000_23 = new AwS567S0100000_23(this, 127);
        LinkedHashMap<String, Function0<JSONObject>> linkedHashMap = c1532170pyR.LJIILL;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        linkedHashMap.put("reused_performance", awS567S0100000_23);
        c1532170pyR.LJIILL = linkedHashMap;
        String str = c1532300pye.LJII.LIZIZ;
        if (str == null) {
            str = this.LJII.LIZIZ;
        }
        c1532170pyR.LIZIZ = str;
        C1532170pyR c1532170pyR2 = this.LJII;
        c1532170pyR.LIZLLL = c1532170pyR2.LIZLLL;
        String str2 = c1532170pyR.LJFF;
        if (str2 == null) {
            str2 = c1532170pyR2.LJFF;
        }
        c1532170pyR.LJFF = str2;
        String str3 = c1532170pyR.LJ;
        if (str3 == null) {
            str3 = c1532170pyR2.LJ;
        }
        c1532170pyR.LJ = str3;
        String strLIZ = c1532170pyR.LIZ();
        if (strLIZ == null) {
            strLIZ = this.LJII.LIZ();
        }
        c1532170pyR.LJI = strLIZ;
        c1532300pye.LJIIJ = this.LJIIJ;
        C1532710pzJ c1532710pzJ = c1532300pye.LJ;
        C1531940py4 c1531940py4 = c1532710pzJ.LJJIJ;
        if (c1531940py4 == null) {
            C1531940py4 c1531940py42 = this.LJ.LJJIJ;
            if (c1531940py42 != null) {
                c1531940py4 = new C1531940py4(c1532710pzJ, c1531940py42.LIZIZ);
                c1531940py4.LJ = c1531940py42.LJ;
                c1531940py4.LJFF = c1531940py42.LJFF;
                c1531940py4.LIZLLL = c1531940py42.LIZLLL;
            } else {
                c1531940py4 = null;
            }
        }
        c1532710pzJ.LJJIJ = c1531940py4;
        C1531940py4 c1531940py43 = c1532300pye.LJ.LJJIJ;
        if (c1531940py43 != null && c1531940py43.LIZLLL == null) {
            C1531940py4 c1531940py44 = this.LJ.LJJIJ;
            if (c1531940py44 != null) {
                c1531990py9 = c1531940py44.LIZLLL;
            } else {
                c1531990py9 = null;
            }
            c1531940py43.LIZLLL = c1531990py9;
        }
        c1532300pye.LJIILIIL = this.LJIILIIL;
        C1532010pyB<AbstractC1532350pyj<?>> andSet = c1532300pye.LJIILL.getAndSet(null);
        if (andSet != null) {
            andSet.LIZIZ(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bf  */
    /* JADX WARN: Type inference failed for: r0v28, types: [T, X.0pyr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, X.0pyr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v76, types: [T, X.0pyr] */
    @Override // X.AbstractC1541130qCt
    /* JADX INFO: renamed from: LJIIJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJ(X.C1532300pye r18) {
        /*
            Method dump skipped, instruction units count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1532300pye.LJ(X.0pye):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x012a, code lost:
    
        r13.LJIIJJI = null;
        X.C1532920pze.LIZJ.LIZJ(kotlin.jvm.internal.AFwS212S0000000_23.get$arr$(149));
        r13.LJIILIIL = X.C1532300pye.LJIJJ;
        r13.LJ.LJJIJIIJIL.LIZIZ(6, "cannot fetch available ResourceProvider");
        r13.LJIILLIIL.LIZJ("synchronizer");
        r0 = r13.LJIILL.getAndSet(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0154, code lost:
    
        if (r0 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0156, code lost:
    
        r0.LIZIZ(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0159, code lost:
    
        r13.LJIILLIIL.LIZJ("callback");
        r13.LJII.LJIIJJI = X.EnumC1532440pys.NORMAL;
        LJI(new X.C1532340pyi(null, r13.LJIJ), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0170, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x008b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0040 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILJJIL(boolean r14) {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1532300pye.LJIILJJIL(boolean):void");
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final <Input, Output> void LJIIZILJ(AbstractC1532320pyg<Input, Output> abstractC1532320pyg) {
        HashMap<Class<?>, C1532180pyS> map = this.LJIIJ;
        Class<Output> cls = abstractC1532320pyg.LIZIZ;
        if (map.get(cls) == null) {
            map.put((Class<?>) cls, new C1532180pyS());
        }
        HashMap<Class<?>, C1532180pyS> map2 = this.LJIIJ;
        Class<Input> cls2 = abstractC1532320pyg.LIZ;
        C1532180pyS c1532180pyS = map2.get(cls2);
        if (c1532180pyS == null) {
            c1532180pyS = new C1532180pyS();
            map2.put((Class<?>) cls2, c1532180pyS);
        }
        C1532180pyS c1532180pyS2 = c1532180pyS;
        HashMap<Class<?>, AbstractC1532320pyg<?, ?>> map3 = c1532180pyS2.LJFF;
        if (map3 == null) {
            map3 = new HashMap<>();
        }
        c1532180pyS2.LJFF = map3;
        Class<Output> cls3 = abstractC1532320pyg.LIZIZ;
        if (map3.get(cls3) == null) {
            map3.put(cls3, abstractC1532320pyg);
        }
    }

    public static void LJIJI(LinkedList linkedList, C1532340pyi c1532340pyi) {
        Iterator it2 = linkedList.iterator();
        while (it2.hasNext() && !Intrinsics.LJFF(((AbstractC1532320pyg) ((Pair) it2.next()).getSecond()).LIZ, c1532340pyi.LIZLLL())) {
            it2.remove();
        }
    }

    public final void LJI(C1532340pyi c1532340pyi, EnumC1541200qD0 enumC1541200qD0) {
        if (this.LIZIZ != null) {
            this.LJIIZILJ = c1532340pyi;
            C1541080qCo<C1532310pyf> c1541080qCo = this.LJII.LJIILLIIL;
            if (c1541080qCo != null) {
                C1541190qCz.LIZIZ(c1541080qCo.LJIILLIIL);
                this.LJII.LJIILLIIL = null;
            }
            this.LJIILLIIL.LIZJ("response_generate");
            C1532310pyf c1532310pyf = new C1532310pyf(this.LJ, this, enumC1541200qD0, c1532340pyi);
            this.LJIILLIIL.LIZJ("post_response");
            CountDownLatch countDownLatch = this.LJIIIIZZ;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
            LIZLLL(c1532310pyf, enumC1541200qD0);
            if (!this.LJI) {
                C1533030pzp.LIZ.getClass();
                try {
                    Iterator<InterfaceC1532560pz4> it2 = C1533030pzp.LIZIZ.iterator();
                    while (it2.hasNext()) {
                        try {
                            it2.next().LIZIZ(c1532310pyf);
                            C189200o6.m2constructorimpl(Unit.LIZ);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C189200o6.m2constructorimpl(new C098200Yq(th));
                        }
                    }
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C189200o6.m2constructorimpl(new C098200Yq(th2));
                }
            }
        }
    }

    public final boolean LJIJ(InterfaceC1532520pz0<?, ?> interfaceC1532520pz0, Function0<Boolean> function0) {
        Long lValueOf;
        String name = interfaceC1532520pz0.getName();
        if (!interfaceC1532520pz0.LJFF()) {
            C1532920pze.LIZJ.LIZJ(new AwS107S1000000_23(name, 12));
            this.LJII.LJIIJJI = EnumC1532440pys.LIMITED;
            C1532470pyv c1532470pyv = this.LJ.LJJIJIIJIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("blocked before ");
            sbLIZ.append(name);
            c1532470pyv.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            C1532180pyS c1532180pyS = this.LJIIJ.get(this.LJFF);
            if (c1532180pyS != null) {
                c1532180pyS.LIZ(this.LIZ, new AwS602S0100000_23(this, 42));
            }
            C1541080qCo<?> c1541080qCo = this.LIZ;
            C1535940q4W c1535940q4W = c1541080qCo.LIZ.LIZJ;
            if (c1535940q4W != null) {
                lValueOf = Long.valueOf(c1535940q4W.LIZJ);
            } else {
                lValueOf = null;
            }
            c1541080qCo.LJFF(lValueOf);
            return false;
        }
        if (function0 == null || function0.invoke().booleanValue()) {
            return true;
        }
        C1532920pze.LIZJ.LIZJ(new AwS107S1000000_23(name, 13));
        this.LJII.LJIIJJI = EnumC1532440pys.PREEMPTED;
        C1532470pyv c1532470pyv2 = this.LJ.LJJIJIIJIL;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("preempted before ");
        sbLIZ2.append(name);
        c1532470pyv2.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        C1532180pyS c1532180pyS2 = this.LJIIJ.get(this.LJFF);
        if (c1532180pyS2 != null) {
            c1532180pyS2.LIZ(this.LIZ, new AwS602S0100000_23(this, 43));
        }
        return false;
    }

    public final C1532340pyi LJIIIZ(C1532710pzJ c1532710pzJ, Class<?> cls, Boolean bool) {
        boolean zBooleanValue;
        C1532180pyS c1532180pyS = this.LJIIJ.get(cls);
        if (c1532180pyS != null) {
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = c1532710pzJ.LJJI;
            }
            C1532340pyi c1532340pyiLIZJ = c1532180pyS.LIZJ(!zBooleanValue);
            if (c1532340pyiLIZJ != null) {
                return c1532340pyiLIZJ.LIZIZ(c1532710pzJ);
            }
            return null;
        }
        return null;
    }

    public final boolean LJIIJJI(boolean z, C1532340pyi c1532340pyi, InterfaceC1532430pyr interfaceC1532430pyr) {
        AbstractC1532350pyj<?> abstractC1532350pyj;
        int i;
        Pair pair;
        C1532180pyS c1532180pyS;
        HashMap<Class<?>, AbstractC1532320pyg<?, ?>> map;
        C1532180pyS c1532180pyS2;
        this.LJIIZILJ = c1532340pyi;
        if (!this.LIZ.isValid()) {
            C1532920pze.LIZJ.LIZJ(AFwS212S0000000_23.get$arr$(147));
            return true;
        }
        InterfaceC1532190pyT interfaceC1532190pyT = null;
        if (c1532340pyi != null) {
            abstractC1532350pyj = c1532340pyi.LIZ;
        } else {
            abstractC1532350pyj = null;
        }
        if (abstractC1532350pyj == null) {
            if (c1532340pyi != null) {
                interfaceC1532190pyT = c1532340pyi.LIZIZ;
            }
            this.LJIJ = interfaceC1532190pyT;
            if (interfaceC1532430pyr != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("failed to get resource from ");
                sbLIZ.append(interfaceC1532430pyr.getName());
                LJIILL(C2188811AlT.LIZIZ(sbLIZ), false, c1532340pyi, z);
                return true;
            }
            return false;
        }
        if (interfaceC1532430pyr != null) {
            C08AB c08ab = this.LJIILLIIL;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(interfaceC1532430pyr.getName());
            sbLIZ2.append("_prepare");
            c08ab.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
        }
        Class<?> cls = c1532340pyi.LIZ.LIZIZ;
        C1532680pzG.LIZ.getClass();
        loop0: while (true) {
            try {
                for (AbstractC1532320pyg<?, ?> abstractC1532320pyg : C1532680pzG.LJJII) {
                    HashSet<AbstractC1532320pyg<?, ?>> hashSet = this.LJII.LJIILIIL;
                    if (hashSet == null || !hashSet.contains(abstractC1532320pyg)) {
                        LJIIZILJ(abstractC1532320pyg);
                    }
                }
                break loop0;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        C1532180pyS c1532180pyS3 = this.LJIIJ.get(cls);
        if (c1532180pyS3 != null) {
            c1532180pyS3.LIZ = new C1532280pyc(c1532180pyS3, LJIJI, 0);
            C1532390pyn c1532390pyn = new C1532390pyn(this.LJIIJ.size(), AFwS228S0000000_1.get$arr$(523));
            c1532390pyn.LIZ(new Pair(cls, 0));
            HashSet hashSet2 = new HashSet();
            while (c1532390pyn.LIZJ > 0 && (pair = (Pair) c1532390pyn.LIZIZ()) != null) {
                Object first = pair.getFirst();
                int iIntValue = ((Number) pair.getSecond()).intValue();
                if (hashSet2.add(first) && (c1532180pyS = this.LJIIJ.get(first)) != null && (map = c1532180pyS.LJFF) != null) {
                    for (Map.Entry<Class<?>, AbstractC1532320pyg<?, ?>> entry : map.entrySet()) {
                        Class<?> key = entry.getKey();
                        AbstractC1532320pyg<?, ?> value = entry.getValue();
                        if (!hashSet2.contains(key) && (c1532180pyS2 = this.LJIIJ.get(key)) != null) {
                            int iLJI = value.LJI() + iIntValue;
                            C1532280pyc c1532280pyc = c1532180pyS2.LIZ;
                            if (c1532280pyc == null || c1532280pyc.LIZJ > iLJI) {
                                c1532180pyS2.LIZ = new C1532280pyc(c1532180pyS, value, iLJI);
                                c1532390pyn.LIZ(new Pair(key, Integer.valueOf(iLJI)));
                            }
                        }
                    }
                }
            }
        }
        C443120HZe c443120HZeLIZ = C1532270pyb.LIZ(false, this, true, this.LJIIJ);
        if (c443120HZeLIZ == null) {
            this.LJIJ = c1532340pyi.LIZIZ;
            if (interfaceC1532430pyr != null) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("cannot get target type ");
                sbLIZ3.append(this.LJFF);
                sbLIZ3.append(" from resourceRef ");
                sbLIZ3.append(c1532340pyi.LIZLLL());
                LJIILL(C2188811AlT.LIZIZ(sbLIZ3), true, c1532340pyi, z);
                return true;
            }
            return false;
        }
        LinkedList<Pair<C1532180pyS, AbstractC1532320pyg<?, ?>>> linkedList = (LinkedList) c443120HZeLIZ.getSecond();
        C1532180pyS c1532180pyS4 = (C1532180pyS) c443120HZeLIZ.getThird();
        if (linkedList.isEmpty()) {
            if (Intrinsics.LJFF(c1532340pyi.LIZLLL(), this.LJFF)) {
                boolean z2 = this.LJ.LJJI;
                AtomicInteger atomicInteger = c1532180pyS4.LIZLLL;
                if (z2) {
                    i = 1;
                } else {
                    i = 3;
                }
                atomicInteger.set(i);
            } else {
                this.LJIJ = c1532340pyi.LIZIZ;
                if (interfaceC1532430pyr != null) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("cannot get target type ");
                    sbLIZ4.append(this.LJFF);
                    sbLIZ4.append(" from resourceRef ");
                    sbLIZ4.append(c1532340pyi.LIZLLL());
                    LJIILL(C2188811AlT.LIZIZ(sbLIZ4), true, c1532340pyi, z);
                    return true;
                }
                return false;
            }
        }
        this.LJIJ = null;
        Iterator<Pair<C1532180pyS, AbstractC1532320pyg<?, ?>>> it2 = linkedList.iterator();
        while (it2.hasNext()) {
            AbstractC1532320pyg<?, ?> second = it2.next().getSecond();
            if (!second.LIZJ(this)) {
                if (interfaceC1532430pyr != null) {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("the processor ");
                    sbLIZ5.append(second.getName());
                    sbLIZ5.append(" cannot process request ");
                    sbLIZ5.append(this.LJ);
                    LJIILL(C2188811AlT.LIZIZ(sbLIZ5), true, c1532340pyi, z);
                    return true;
                }
                return false;
            }
        }
        this.LJII.LJIIL = linkedList;
        this.LJIILIIL = LJIJJ;
        this.LJIILLIIL.LIZJ("provider_interrupt");
        C1532010pyB<AbstractC1532350pyj<?>> andSet = this.LJIILL.getAndSet(null);
        if (andSet != null) {
            andSet.LIZIZ(null);
        }
        this.LJIILLIIL.LIZJ("provider_provide");
        LJIIL(this.LJIILLIIL, z, c1532180pyS4, c1532340pyi, false, false, linkedList, new AwS602S0100000_23(this, 40));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0104, code lost:
    
        if (r3 != false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:170:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0106 A[PHI: r2 r12 r18 r19
      0x0106: PHI (r2v12 X.0pyi) = (r2v10 X.0pyi), (r2v9 X.0pyi) binds: [B:59:0x011d, B:51:0x0104] A[DONT_GENERATE, DONT_INLINE]
      0x0106: PHI (r12v4 X.0pyS) = (r12v2 X.0pyS), (r12v1 X.0pyS) binds: [B:59:0x011d, B:51:0x0104] A[DONT_GENERATE, DONT_INLINE]
      0x0106: PHI (r18v4 boolean) = (r18v2 boolean), (r18v1 boolean) binds: [B:59:0x011d, B:51:0x0104] A[DONT_GENERATE, DONT_INLINE]
      0x0106: PHI (r19v4 boolean) = (r19v2 boolean), (r19v1 boolean) binds: [B:59:0x011d, B:51:0x0104] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILLIIL(boolean r27, boolean r28, X.C1532300pye r29) {
        /*
            Method dump skipped, instruction units count: 1474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1532300pye.LJIILLIIL(boolean, boolean, X.0pye):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(java.lang.String r13, boolean r14, X.C1532340pyi r15, boolean r16) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1532300pye.LJIILL(java.lang.String, boolean, X.0pyi, boolean):void");
    }

    public C1532300pye(boolean z, C1532710pzJ c1532710pzJ, Class<?> cls, boolean z2, C1541080qCo<C1532310pyf> c1541080qCo) {
        CountDownLatch countDownLatch;
        C08AB c08ab;
        super(c1541080qCo);
        this.LIZLLL = z;
        this.LJ = c1532710pzJ;
        this.LJFF = cls;
        this.LJI = z2;
        this.LJII = new C1532170pyR(this);
        if (z) {
            countDownLatch = null;
        } else {
            countDownLatch = new CountDownLatch(1);
        }
        this.LJIIIIZZ = countDownLatch;
        this.LJIIIZ = C786410Ut5.u3();
        this.LJIIJ = new HashMap<>();
        this.LJIIJJI = c1532710pzJ.LJJIIZ.iterator();
        this.LJIILJJIL = new LinkedList<>();
        this.LJIILL = new AtomicReference<>(null);
        if (!z2) {
            c08ab = this.LIZJ;
        } else {
            c08ab = new C08AB();
        }
        this.LJIILLIIL = c08ab;
    }

    public final void LJIILIIL(Object obj, InterfaceC1532520pz0 interfaceC1532520pz0, boolean z, AwS567S0100000_23 awS567S0100000_23, Function2 function2) {
        boolean z2;
        String name = interfaceC1532520pz0.getName();
        if (this.LJ.LJJI && !this.LJI) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.LIZLLL && interfaceC1532520pz0.LIZ() && !z) {
            C1532920pze.LIZJ.LIZJ(new AwS107S1000000_23(name, 14));
            C1532960pzi.LJ(new C1532450pyt(z2, this, interfaceC1532520pz0, awS567S0100000_23, name, obj, function2));
        } else {
            if (z2 && !LJIJ(interfaceC1532520pz0, awS567S0100000_23)) {
                return;
            }
            Thread threadU3 = C786410Ut5.u3();
            this.LJIILJJIL.add(name);
            interfaceC1532520pz0.LJ(new C1532330pyh(this, function2, z, threadU3, interfaceC1532520pz0), obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v29, types: [T, java.lang.Object] */
    public final void LJIIL(C08AB c08ab, boolean z, C1532180pyS c1532180pyS, C1532340pyi c1532340pyi, boolean z2, boolean z3, LinkedList<Pair<C1532180pyS, AbstractC1532320pyg<?, ?>>> linkedList, Function1<? super C1532340pyi, Unit> function1) {
        C1532180pyS c1532180pyS2;
        boolean z4;
        C1532470pyv c1532470pyvLIZLLL;
        C1532710pzJ c1532710pzJ;
        InterfaceC1530960pwU interfaceC1530960pwU;
        int i;
        C1532120pyM<C1532340pyi> c1532120pyM;
        WeakReference<C1532340pyi> weakReference;
        ?? r0;
        AbstractC1532320pyg<?, ?> abstractC1532320pyg;
        AbstractC1532350pyj<?> abstractC1532350pyj = c1532340pyi.LIZ;
        if (linkedList.isEmpty()) {
            c1532180pyS2 = c1532180pyS;
        } else {
            c1532180pyS2 = (C1532180pyS) ((Pair) C13LP.LJJJJZI(linkedList)).getFirst();
        }
        C013C c013c = new C013C();
        c013c.element = z3;
        boolean z5 = true;
        if (!z3) {
            HashMap<Class<?>, AbstractC1532320pyg<?, ?>> map = c1532180pyS2.LJFF;
            if (map != null && (abstractC1532320pyg = map.get(c1532340pyi.LIZLLL())) != null) {
                linkedList.addFirst(new Pair<>(c1532180pyS2, abstractC1532320pyg));
                c013c.element = true;
            }
        } else {
            c013c.element = false;
        }
        if (linkedList.isEmpty()) {
            if (this.LJ.LJJI && !this.LJI) {
                z5 = false;
            }
            c1532180pyS.LIZIZ(c1532340pyi, z5);
            this.LJII.LJIIJJI = EnumC1532440pys.NORMAL;
            function1.invoke(c1532340pyi);
            return;
        }
        Pair<C1532180pyS, AbstractC1532320pyg<?, ?>> pairPollFirst = linkedList.pollFirst();
        if (pairPollFirst == null) {
            C1532760pzO.LIZJ(C1532920pze.LIZJ, "ResourceProcessChain", "processProcessors", "list is empty", null, null, 48);
            return;
        }
        C1532180pyS first = pairPollFirst.getFirst();
        AbstractC1532320pyg<?, ?> second = pairPollFirst.getSecond();
        if (!this.LIZ.isValid()) {
            C1532920pze.LIZJ.LIZJ(AFwS212S0000000_23.get$arr$(148));
            return;
        }
        if (this.LJ.LJJI && !this.LJI) {
            z4 = true;
        } else {
            z4 = false;
        }
        AwS567S0100000_23 awS567S0100000_23 = null;
        if (!Intrinsics.LJFF(second.LIZ, second.LIZIZ)) {
            first.LIZIZ(c1532340pyi, true);
            if (!this.LJI && (interfaceC1530960pwU = (c1532710pzJ = this.LJ).LJIJI) != null && interfaceC1530960pwU.LIZ(c1532710pzJ, abstractC1532350pyj, c1532340pyi.LIZIZ, this.LJII, this.LIZ.LJIIJJI) && ((i = first.LIZLLL.get()) == 0 || i == 1 || (i == 3 && first.LIZLLL.compareAndSet(i, 0)))) {
                if (z4 && (c1532120pyM = first.LIZJ) != null && c1532120pyM.LIZ == null && (weakReference = c1532120pyM.LIZIZ) != null && (r0 = weakReference.get()) != 0) {
                    c1532120pyM.LIZ = r0;
                }
                c1532180pyS.LJ(false);
                Iterator<Pair<C1532180pyS, AbstractC1532320pyg<?, ?>>> it2 = linkedList.iterator();
                while (it2.hasNext()) {
                    it2.next().getFirst().LJ(false);
                }
                this.LJII.LJIIJJI = EnumC1532440pys.INTERCEPT;
                function1.invoke(c1532340pyi);
                return;
            }
            if (!z2 && z4 && first.LIZLLL.get() > 1) {
                C1532920pze.LIZJ.LIZJ(new AwS567S0100000_23(second, (AbstractC1532320pyg<?, ?>) 128));
                this.LJII.LJIIJJI = EnumC1532440pys.PREEMPTED;
                C1532180pyS c1532180pyS3 = this.LJIIJ.get(this.LJFF);
                if (c1532180pyS3 != null) {
                    c1532180pyS3.LIZ(this.LIZ, new AwS602S0100000_23(this, 41));
                    return;
                }
                return;
            }
        }
        String name = second.getName();
        c08ab.LIZJ(name);
        if (this.LJI) {
            c1532470pyvLIZLLL = new C1532470pyv();
        } else {
            c1532470pyvLIZLLL = this.LJ.LJJIJIIJI.LIZLLL(name);
        }
        if (!z2 && !c013c.element) {
            awS567S0100000_23 = new AwS567S0100000_23(first, 129);
        }
        LJIILIIL(new C1532530pz1(c08ab, this.LJ, c1532470pyvLIZLLL, this.LJII, c1532340pyi), second, z, awS567S0100000_23, new C1532290pyd(this, c1532340pyi, c1532180pyS, linkedList, function1, c08ab, z2, c013c));
    }

    public static final void LJIIIIZZ(boolean z, boolean z2, C1532300pye c1532300pye, LinkedList<Pair<C1532180pyS, AbstractC1532320pyg<?, ?>>> linkedList, C1532710pzJ c1532710pzJ, C1532300pye c1532300pye2, C1532180pyS c1532180pyS, C1532340pyi c1532340pyi, C08AB c08ab, boolean z3) {
        C1532340pyi c1532340pyiLIZIZ = c1532340pyi;
        if (c1532340pyiLIZIZ != null && c1532340pyiLIZIZ.LIZ != null && !z && (!z2 || !Intrinsics.LJFF(c1532300pye.LJFF, c1532340pyiLIZIZ.LIZLLL()) || !linkedList.isEmpty())) {
            c1532340pyiLIZIZ = c1532340pyiLIZIZ.LIZIZ(c1532710pzJ);
        }
        c1532300pye.LJIILLIIL.LIZJ("reuse_execution");
        if (c1532340pyiLIZIZ != null && c1532340pyiLIZIZ.LIZ != null) {
            c1532300pye2.getClass();
            LJIJI(linkedList, c1532340pyiLIZIZ);
            c1532300pye.LJIIL(c08ab, z3, c1532180pyS, c1532340pyiLIZIZ, true, false, linkedList, new AwS602S0100000_23(c1532300pye, 39));
            return;
        }
        c1532180pyS.LJ(false);
        Iterator<Pair<C1532180pyS, AbstractC1532320pyg<?, ?>>> it2 = linkedList.iterator();
        while (it2.hasNext()) {
            it2.next().getFirst().LJ(false);
        }
        c1532300pye.LJII.LJIIJJI = EnumC1532440pys.NORMAL;
        c1532300pye.LJI(null, EnumC1541200qD0.REQUEST);
    }
}
