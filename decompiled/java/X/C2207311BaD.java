package X;

import android.util.SparseBooleanArray;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadScheduledThreadPoolExecutor;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BaD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2207311BaD {
    public static final C2207271Ba9 LJIIIZ = new C593510NPp<Boolean>() { // from class: X.1Ba9
        @Override // X.C593510NPp
        public final Boolean LIZIZ() {
            return C2207431BaP.LIZJ.LIZ() != null ? Boolean.TRUE : Boolean.FALSE;
        }
    };
    public static volatile C21608119hP LJIIJ = new C593510NPp<Boolean>() { // from class: X.19hP
        @Override // X.C593510NPp
        public final Boolean LIZIZ() {
            return Boolean.TRUE;
        }
    };
    public final Map<EnumC2207531BaZ, TreeSet<C2207331BaF>> LIZ = new HashMap();
    public final transient ReentrantLock LIZIZ;
    public final Map<EnumC2207531BaZ, C2207331BaF> LIZJ;
    public final PThreadScheduledThreadPoolExecutor LIZLLL;
    public final ConcurrentHashMap<C2207331BaF, C2207301BaC> LJ;
    public final ConcurrentHashMap<C2207301BaC, C2207331BaF> LJFF;
    public final C21608019hO LJI;
    public final C21608219hQ LJII;
    public final C2207201Ba2 LJIIIIZZ;

    /* JADX WARN: Type inference failed for: r0v6, types: [X.19hO] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.19hQ] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.1Ba2] */
    public C2207311BaD() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.LIZIZ = reentrantLock;
        reentrantLock.newCondition();
        this.LIZJ = new HashMap();
        this.LIZLLL = null;
        this.LJ = new ConcurrentHashMap<>();
        this.LJFF = new ConcurrentHashMap<>();
        this.LJI = new C593510NPp<SparseBooleanArray>() { // from class: X.19hO
            @Override // X.C593510NPp
            public final SparseBooleanArray LIZIZ() {
                return new SparseBooleanArray();
            }
        };
        this.LJII = new C593510NPp<WeakReference<InterfaceC2207191Ba1>>() { // from class: X.19hQ
            @Override // X.C593510NPp
            public final WeakReference<InterfaceC2207191Ba1> LIZIZ() {
                return null;
            }
        };
        this.LJIIIIZZ = new InterfaceC2207211Ba3() { // from class: X.1Ba2
            @Override // X.InterfaceC2207211Ba3
            public final void LIZ(String str, JSONObject jSONObject) {
                if (LIZ() == null || LIZ().get() == null) {
                    return;
                }
                LIZ().get().LIZ(str, jSONObject);
            }
        };
        this.LIZLLL = new PThreadScheduledThreadPoolExecutor(2, new DefaultThreadFactory("equestManager"));
    }

    public static boolean LIZLLL(EnumC2207531BaZ enumC2207531BaZ) {
        if (!LJIIIZ.LIZ().booleanValue()) {
            C2207231Ba5.LIZ(3);
            return false;
        }
        C2207431BaP c2207431BaPLIZIZ = C2207431BaP.LIZIZ();
        c2207431BaPLIZIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("name:");
        sbLIZ.append(enumC2207531BaZ.getName());
        sbLIZ.append("  index:");
        sbLIZ.append(enumC2207531BaZ.getIndex());
        C2188811AlT.LIZIZ(sbLIZ);
        C2207231Ba5.LIZ(3);
        c2207431BaPLIZIZ.LIZIZ.getClass();
        return ((HashSet) C2207491BaV.LIZ).contains(enumC2207531BaZ);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0275 A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v87, types: [X.1BaO] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.C2207301BaC r11) {
        /*
            Method dump skipped, instruction units count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2207311BaD.LIZ(X.1BaC):java.lang.Object");
    }

    public final void LIZJ(EnumC2207531BaZ enumC2207531BaZ) {
        boolean z;
        C2207231Ba5.LIZ(3);
        TreeSet treeSet = (TreeSet) ((HashMap) this.LIZ).get(enumC2207531BaZ);
        if (treeSet != null) {
            treeSet.toString();
        }
        C2207231Ba5.LIZ(3);
        if (treeSet != null && !treeSet.isEmpty()) {
            final C2207331BaF c2207331BaF = (C2207331BaF) treeSet.pollFirst();
            c2207331BaF.LLJILJILJ = System.currentTimeMillis();
            EnumC2207371BaJ enumC2207371BaJ = c2207331BaF.LLIZLLLIL;
            EnumC2207371BaJ enumC2207371BaJ2 = EnumC2207371BaJ.USE_OURS;
            if (enumC2207371BaJ == enumC2207371BaJ2 && c2207331BaF.LIZJ() > 50) {
                z = true;
            } else {
                z = false;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Should set timeout task:");
            sbLIZ.append(z);
            C2188811AlT.LIZIZ(sbLIZ);
            C2207231Ba5.LIZ(3);
            if (z) {
                C2207231Ba5.LIZ(3);
                CallableC2207361BaI callableC2207361BaI = new CallableC2207361BaI(c2207331BaF);
                callableC2207361BaI.LLILLJJLI = this.LIZLLL.schedule(callableC2207361BaI, c2207331BaF.LIZJ(), TimeUnit.MILLISECONDS);
                c2207331BaF.LLJILLL = callableC2207361BaI;
                c2207331BaF.LLILLL = c2207331BaF.LIZJ();
            }
            if (LJ(c2207331BaF)) {
                if (c2207331BaF.LLIZLLLIL == enumC2207371BaJ2 && c2207331BaF.LIZJ() <= 50) {
                    LIZJ(c2207331BaF.LL);
                    return;
                }
                C2207231Ba5.LIZ(3);
                this.LIZLLL.submit(new Callable<Integer>(c2207331BaF) { // from class: X.1BaH
                    public final C2207331BaF LL;

                    {
                        this.LL = c2207331BaF;
                    }

                    /* JADX WARN: Type inference failed for: r0v12, types: [X.1BaM, X.1BaV] */
                    /* JADX WARN: Type inference failed for: r1v0, types: [X.1BaM, X.1BaV] */
                    @Override // java.util.concurrent.Callable
                    public final Integer call() {
                        ?? r0;
                        C2207431BaP c2207431BaPLIZIZ = C2207431BaP.LIZIZ();
                        C2207331BaF c2207331BaF2 = this.LL;
                        ?? r1 = c2207431BaPLIZIZ.LIZ;
                        if ((r1 == 0 || !r1.LIZJ(c2207331BaF2.LL)) && !c2207431BaPLIZIZ.LIZIZ.LIZJ(c2207331BaF2.LL)) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("no provider support this ability ");
                            sbLIZ2.append(this.LL.LL);
                            C2188811AlT.LIZIZ(sbLIZ2);
                            C2207231Ba5.LIZ(3);
                        } else if (this.LL.LLILZLL) {
                            C2207431BaP.LIZIZ().LIZ(this.LL);
                        } else {
                            C2207451BaR c2207451BaRLIZJ = C2207431BaP.LIZIZ().LIZJ(this.LL);
                            if (c2207451BaRLIZJ != null && (r0 = c2207451BaRLIZJ.LIZIZ) != 0) {
                                r0.LIZ(c2207451BaRLIZJ);
                            }
                        }
                        C2207281BaA.LIZ.LIZIZ(this.LL, false);
                        return null;
                    }
                });
                ((HashMap) this.LIZJ).put(c2207331BaF.LL, c2207331BaF);
            }
        }
    }

    public final boolean LJ(C2207331BaF c2207331BaF) {
        EnumC2207371BaJ enumC2207371BaJ;
        C2207331BaF c2207331BaF2 = (C2207331BaF) ((HashMap) this.LIZJ).get(c2207331BaF.LL);
        boolean z = true;
        if (this.LIZJ != null && c2207331BaF2 != null) {
            if ((r1 = C2207591Baf.LIZIZ[c2207331BaF.LLJIJIL.ordinal()]) != 1) {
                z = false;
                enumC2207371BaJ = c2207331BaF.LLIZLLLIL;
                if ((enumC2207371BaJ == EnumC2207371BaJ.USE_OURS && enumC2207371BaJ != EnumC2207371BaJ.USE_PROVIDERS) || c2207331BaF.LIZJ() > 50) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Should notify provider:");
                    sbLIZ.append(z);
                    C2188811AlT.LIZIZ(sbLIZ);
                    C2207231Ba5.LIZ(3);
                }
            } else {
                z = false;
                enumC2207371BaJ = c2207331BaF.LLIZLLLIL;
                return enumC2207371BaJ == EnumC2207371BaJ.USE_OURS ? false : false;
            }
        }
        return z;
    }

    public final void LIZIZ(C2207331BaF c2207331BaF, boolean z) {
        C2207231Ba5.LIZ(3);
        this.LIZIZ.lock();
        if (z) {
            try {
                this.LJFF.remove(c2207331BaF.LLJJ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LIZIZ.unlock();
                throw th;
            }
        }
        if (c2207331BaF.LLJILLL == null || z) {
            this.LJ.remove(c2207331BaF);
            ((HashMap) this.LIZJ).remove(c2207331BaF.LL);
            TreeSet treeSet = (TreeSet) ((HashMap) this.LIZ).get(c2207331BaF.LL);
            if (treeSet != null && !treeSet.isEmpty()) {
                LIZJ(c2207331BaF.LL);
            }
        }
        this.LIZIZ.unlock();
    }
}
