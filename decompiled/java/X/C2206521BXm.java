package X;

import Y.ARunnableS38S1100000_34;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.newlego.ProviderHolder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.1BXm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2206521BXm<T> implements C1BXZ, C1BY3 {
    public final String LIZ;
    public final String LIZIZ;
    public final C2206531BXn LIZJ;
    public final InterfaceC2206501BXk LIZLLL;
    public final Map<String, C1BXT> LJ = new HashMap();

    @Override // X.C1BXZ
    public final void LIZ(String str) {
        C795780VJo c795780VJo = C795790VJp.LIZ;
        if (c795780VJo.LIZLLL == null) {
            synchronized (c795780VJo.LIZIZ) {
                try {
                    if (c795780VJo.LIZLLL == null) {
                        c795780VJo.LIZLLL = new BPEAHandler(C786410Ut5.W2(c795780VJo.LIZJ));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C786410Ut5.LJJZZIII(c795780VJo.LIZLLL, new ARunnableS38S1100000_34(this, str, 1));
        LIZLLL(str, EnumC2206581BXs.MAIN);
    }

    @Override // X.InterfaceC2206431BXd
    public final void LIZIZ(String str) {
        this.LIZJ.LIZIZ(str);
    }

    public final void LIZJ(C2206651BXz c2206651BXz) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EngineService PROCESS | ");
        sbLIZ.append(C1BXU.LIZ(c2206651BXz.LIZ, c2206651BXz.LIZIZ, c2206651BXz.LIZJ, c2206651BXz.LJ, c2206651BXz.LIZLLL, null, null, null));
        C1BXU.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        this.LIZJ.LJII(c2206651BXz.LIZLLL);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LIZLLL(String str, EnumC2206581BXs enumC2206581BXs) {
        ReentrantLock reentrantLock;
        InterfaceC2206501BXk interfaceC2206501BXk;
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(":");
        sbLIZ.append(str);
        sbLIZ.append(":");
        sbLIZ.append(enumC2206581BXs);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        ConcurrentHashMap<String, ReentrantLock> concurrentHashMap = C1887110zCv.LIZ;
        if (concurrentHashMap.containsKey(strLIZIZ)) {
            reentrantLock = concurrentHashMap.get(strLIZIZ);
        } else {
            reentrantLock = new ReentrantLock();
            concurrentHashMap.put(strLIZIZ, reentrantLock);
        }
        reentrantLock.lock();
        try {
            C1BXT c1bxt = (C1BXT) ((HashMap) this.LJ).remove(strLIZIZ);
            if (c1bxt == null) {
                c1bxt = new C1BXT(this.LIZ, this.LIZIZ, str, enumC2206581BXs);
                try {
                    ProviderHolder.collectTask(this.LIZIZ, str, c1bxt);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(this.LIZIZ);
                    sbLIZ2.append("_");
                    sbLIZ2.append(str);
                    sbLIZ2.append("_");
                    sbLIZ2.append(enumC2206581BXs);
                    sbLIZ2.append("_invoke failed");
                    throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2), th);
                }
            }
            reentrantLock.unlock();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("EngineService COLLECT-DONE | point = ");
            sbLIZ3.append(str);
            sbLIZ3.append(", thread = ");
            sbLIZ3.append(enumC2206581BXs);
            sbLIZ3.append(", taskCount = ");
            sbLIZ3.append(c1bxt.LJ.size());
            C1BXU.LIZIZ(C2188811AlT.LIZIZ(sbLIZ3));
            C2206531BXn c2206531BXn = this.LIZJ;
            InterfaceC2206501BXk interfaceC2206501BXk2 = this.LIZLLL;
            c2206531BXn.getClass();
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("DecisionCenter MAKE-DECISION | decisionCenter = ");
            sbLIZ4.append(c2206531BXn.LJIIJJI);
            sbLIZ4.append(", engine = ");
            sbLIZ4.append(c1bxt.LIZ);
            sbLIZ4.append(", provider = ");
            sbLIZ4.append(c1bxt.LIZIZ);
            sbLIZ4.append(", point = ");
            sbLIZ4.append(c1bxt.LIZJ);
            sbLIZ4.append(", thread = ");
            sbLIZ4.append(c1bxt.LIZLLL);
            sbLIZ4.append(", taskCount = ");
            sbLIZ4.append(c1bxt.LJ.size());
            C1BXU.LIZIZ(C2188811AlT.LIZIZ(sbLIZ4));
            Iterator it2 = ((LinkedHashMap) c1bxt.LJ).entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str2 = (String) entry.getKey();
                InterfaceC308150C6b interfaceC308150C6b = (InterfaceC308150C6b) entry.getValue();
                if (interfaceC308150C6b != null) {
                    String str3 = c1bxt.LIZ;
                    String str4 = c1bxt.LIZIZ;
                    String str5 = c1bxt.LIZJ;
                    EnumC2206581BXs enumC2206581BXs2 = c1bxt.LIZLLL;
                    if (enumC2206581BXs2 == EnumC2206581BXs.BACKGROUND) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!c2206531BXn.LIZJ.contains(str2)) {
                        interfaceC2206501BXk = interfaceC2206501BXk2;
                        C2206571BXr c2206571BXr = new C2206571BXr(str3, str4, str5, enumC2206581BXs2, str2, interfaceC308150C6b, interfaceC2206501BXk2, this);
                        InterfaceC20234614Fk interfaceC20234614Fk = (InterfaceC20234614Fk) interfaceC308150C6b.getClass().getAnnotation(InterfaceC20234614Fk.class);
                        if (interfaceC20234614Fk != null) {
                            c2206571BXr.LJIIIZ = interfaceC20234614Fk.biz();
                            c2206571BXr.LJIIJ = (String[]) new LinkedHashSet(Arrays.asList(interfaceC20234614Fk.dependencies())).toArray(new String[0]);
                            c2206571BXr.LJIIJJI = (String[]) new LinkedHashSet(Arrays.asList(interfaceC20234614Fk.resource())).toArray(new String[0]);
                            if (!z && c2206571BXr.LJIIJ.length > 0) {
                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                sbLIZ5.append(str2);
                                sbLIZ5.append(" legoTask must not be has dependencies:");
                                sbLIZ5.append(Arrays.toString(c2206571BXr.LJIIJ));
                                sbLIZ5.append(" when threadType is ");
                                sbLIZ5.append(enumC2206581BXs2);
                                throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ5));
                            }
                        }
                        Map<String, C1BY2> map = C1BXD.LIZIZ().LIZLLL;
                        if (!map.isEmpty()) {
                            Iterator it3 = ((LinkedHashMap) map).values().iterator();
                            if (it3.hasNext()) {
                                ((C1BY2) it3.next()).LIZ();
                                int[] iArr = C2206631BXx.LIZ;
                                throw null;
                            }
                        }
                        Iterator it4 = ((ArrayList) C1BXD.LIZIZ().LIZJ).iterator();
                        while (it4.hasNext()) {
                            ((C1BY0) it4.next()).LIZJ();
                        }
                        c2206531BXn.LJIIIZ.lock();
                        try {
                            c2206531BXn.LJIIIIZZ(c2206571BXr.LJ, c2206571BXr.LJIIJ);
                            ((C2206541BXo) ((ConcurrentHashMap) c2206531BXn.LIZ).get(c2206571BXr.LIZLLL)).LJ(c2206571BXr);
                            ((ConcurrentHashMap) c2206531BXn.LIZLLL).put(c2206571BXr.LJ, c2206571BXr);
                            if (!TextUtils.isEmpty(c2206571BXr.LJIIIZ)) {
                                if (!((ConcurrentHashMap) c2206531BXn.LJI).containsKey(c2206571BXr.LJIIIZ)) {
                                    ((ConcurrentHashMap) c2206531BXn.LJI).put(c2206571BXr.LJIIIZ, new HashSet());
                                }
                                ((Set) ((ConcurrentHashMap) c2206531BXn.LJI).get(c2206571BXr.LJIIIZ)).add(c2206571BXr.LJ);
                            }
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append("DecisionCenter ENQUEUED | decisionCenter = ");
                            sbLIZ6.append(c2206531BXn.LJIIJJI);
                            sbLIZ6.append(", ");
                            sbLIZ6.append(C1BXU.LIZ(c2206571BXr.LIZ, c2206571BXr.LIZIZ, c2206571BXr.LIZJ, c2206571BXr.LIZLLL, c2206571BXr.LJ, c2206571BXr.LJIIIZ, c2206571BXr.LJIIJ, c2206571BXr.LJIIJJI));
                            C1BXU.LIZIZ(C2188811AlT.LIZIZ(sbLIZ6));
                            if (!TextUtils.isEmpty(c2206571BXr.LJIIIZ) && c2206571BXr.LIZLLL == EnumC2206581BXs.BACKGROUND && c2206531BXn.LJII.contains(c2206571BXr.LJIIIZ)) {
                                String strLIZJ = C2206541BXo.LIZJ(c2206571BXr);
                                LinkedHashSet linkedHashSet = new LinkedHashSet(c2206531BXn.LIZLLL(c2206571BXr.LJ, strLIZJ));
                                linkedHashSet.add(c2206571BXr.LJ);
                                c2206531BXn.LIZJ(strLIZJ, linkedHashSet);
                            }
                            if (c2206531BXn.LJ(c2206571BXr.LIZLLL)) {
                                c2206531BXn.LJIIJ.signal();
                            }
                            c2206531BXn.LJIIIZ.unlock();
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            c2206531BXn.LJIIIZ.unlock();
                            throw th2;
                        }
                    } else {
                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                        sbLIZ7.append("DecisionCenter ENQUEUE-REJECT |  = ");
                        sbLIZ7.append(c2206531BXn.LJIIJJI);
                        sbLIZ7.append(", reason = already_completed, task = ");
                        sbLIZ7.append(str2);
                        C1BXU.LIZIZ(C2188811AlT.LIZIZ(sbLIZ7));
                        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                        sbLIZ8.append("Task ");
                        sbLIZ8.append(str2);
                        sbLIZ8.append(" has been completed, can not be enqueued again");
                        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ8));
                    }
                } else {
                    interfaceC2206501BXk = interfaceC2206501BXk2;
                    StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                    sbLIZ9.append("DecisionCenter MAKE-DECISION-SKIP | decisionCenter = ");
                    sbLIZ9.append(c2206531BXn.LJIIJJI);
                    sbLIZ9.append(", legoTask = null, ");
                    sbLIZ9.append(C1BXU.LIZ(c1bxt.LIZ, c1bxt.LIZIZ, c1bxt.LIZJ, c1bxt.LIZLLL, str2, null, null, null));
                    C1BXU.LIZIZ(C2188811AlT.LIZIZ(sbLIZ9));
                }
                it2.remove();
                interfaceC2206501BXk2 = interfaceC2206501BXk;
            }
            C2206511BXl c2206511BXl = this.LIZJ.LJIIL;
            c2206511BXl.getClass();
            int i = C2206601BXu.LIZ[enumC2206581BXs.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    for (int i2 = 0; i2 < c2206511BXl.LIZIZ.getCorePoolSize(); i2++) {
                        c2206511BXl.LIZIZ.execute(new RunnableC2206551BXp(c2206511BXl));
                    }
                    return;
                }
                return;
            }
            while (true) {
                C2206531BXn c2206531BXn2 = c2206511BXl.LIZ;
                EnumC2206581BXs enumC2206581BXs3 = EnumC2206581BXs.MAIN;
                c2206531BXn2.LJIIIZ.lock();
                try {
                    C2206541BXo c2206541BXo = (C2206541BXo) ((ConcurrentHashMap) c2206531BXn2.LIZ).get(enumC2206581BXs3);
                    c2206541BXo.getClass();
                    C2206561BXq c2206561BXq = new C2206561BXq(c2206541BXo);
                    while (c2206561BXq.hasNext()) {
                        C2206571BXr c2206571BXr2 = (C2206571BXr) c2206561BXq.next();
                        if (c2206531BXn2.LJFF(c2206571BXr2)) {
                            c2206561BXq.remove();
                            ((C2206621BXw) ((ConcurrentHashMap) c2206531BXn2.LIZIZ).get(enumC2206581BXs3)).offer(c2206571BXr2);
                            c2206531BXn2.LJIIIZ.unlock();
                            if (c2206571BXr2 != null) {
                                C2206511BXl.LIZ(c2206571BXr2);
                            } else {
                                return;
                            }
                        }
                    }
                    c2206531BXn2.LJIIIZ.unlock();
                    return;
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    c2206531BXn2.LJIIIZ.unlock();
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            while (true) {
                try {
                    TryCatchGuardChecker.doCheck(th);
                    reentrantLock.unlock();
                    throw th;
                } catch (Throwable th5) {
                    th = th5;
                }
            }
        }
    }

    public C2206521BXm(String str, C2206531BXn c2206531BXn, Class<T> cls, InterfaceC2206491BXj interfaceC2206491BXj) {
        this.LIZ = str;
        this.LIZIZ = ((InterfaceC2206441BXe) cls.getAnnotation(InterfaceC2206441BXe.class)).name();
        this.LIZJ = c2206531BXn;
        this.LIZLLL = interfaceC2206491BXj.create();
    }
}
