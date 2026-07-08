package X;

import Y.ARunnableS103S0100000_3;
import Y.ARunnableS117S0100000_17;
import Y.ARunnableS123S0100000_23;
import Y.ARunnableS92S0200000_23;
import android.net.Uri;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.LynxViewClient;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.jvm.internal.AwS672S0100000_23;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0qCV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1540890qCV extends AbstractC1541130qCt<C1540890qCV> {
    public static final RunnableC1541050qCl LJFF = RunnableC1541050qCl.LL;
    public static final RunnableC1541040qCk LJI = RunnableC1541040qCk.LL;
    public static final C1540900qCW LJII = new C1540900qCW(null, EnumC1540960qCc.CREATE);
    public volatile C1540900qCW LIZLLL;
    public final AtomicReference<Runnable> LJ;

    @Override // X.AbstractC1541130qCt
    public final boolean LIZIZ() {
        InterfaceC1540940qCa interfaceC1540940qCa;
        C1540900qCW c1540900qCW = this.LIZLLL;
        if (c1540900qCW == null || (interfaceC1540940qCa = c1540900qCW.LIZ) == null) {
            return true;
        }
        interfaceC1540940qCa.LIZLLL();
        return true;
    }

    @Override // X.InterfaceC1541360qDG
    public final void execute() {
        final LynxView lynxView;
        String host;
        final C1540870qCT c1540870qCT = (C1540870qCT) this.LIZ.LIZ.LIZLLL;
        Uri uriLIZLLL = c1540870qCT.LJIIJJI.LIZLLL();
        if (uriLIZLLL != null && (host = uriLIZLLL.getHost()) != null && a0.LJJIIZI(host, "webview", false)) {
            LJI(LJII);
            return;
        }
        int i = C1541000qCg.LIZ[c1540870qCT.LIZJ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                LJI(LJII);
                return;
            } else {
                this.LIZIZ = null;
                return;
            }
        }
        InterfaceC1631620sYq awS672S0100000_23 = c1540870qCT.LJIIIIZZ;
        if (awS672S0100000_23 == null) {
            awS672S0100000_23 = new AwS672S0100000_23(c1540870qCT, 1);
        }
        final InterfaceC1540940qCa interfaceC1540940qCa = (InterfaceC1540940qCa) awS672S0100000_23.invoke(c1540870qCT.LIZIZ, c1540870qCT.LIZLLL.LJIJI(), c1540870qCT.LIZLLL);
        final C1540900qCW c1540900qCW = new C1540900qCW(interfaceC1540940qCa, EnumC1540960qCc.CREATE);
        if (interfaceC1540940qCa == null || !this.LIZ.isValid()) {
            C1532960pzi.LJFF(new ARunnableS117S0100000_17(interfaceC1540940qCa, 140));
            C1537070q6L c1537070q6L = c1540870qCT.LJII;
            if (c1537070q6L != null) {
                c1537070q6L.LIZJ(c1540870qCT.LIZLLL.LJIJI(), c1540870qCT.LIZ, new C1537080q6M("failed to create view"));
            }
            LJI(LJII);
            return;
        }
        Object kitView = interfaceC1540940qCa.getKitView();
        if (!(kitView instanceof LynxView) || (lynxView = (LynxView) kitView) == null) {
            C1537070q6L c1537070q6L2 = c1540870qCT.LJII;
            if (c1537070q6L2 != null) {
                c1537070q6L2.LIZJ(c1540870qCT.LIZLLL.LJIJI(), c1540870qCT.LIZ, new C1537080q6M("failed to get lyxnview"));
            }
            C1532960pzi.LJFF(new ARunnableS117S0100000_17(interfaceC1540940qCa, 141));
            LJI(LJII);
            return;
        }
        interfaceC1540940qCa.U0(C2097908Jt.LIZJ(new Pair("usePreload", "1")));
        interfaceC1540940qCa.setOptimization(2);
        if (!c1540870qCT.LJ) {
            lynxView.setEnableUIFlush(false);
            c1540870qCT.LIZLLL.LJJJJZI(new AbstractC1542200qEc() { // from class: X.0qCb
                @Override // X.AbstractC1537870q7d
                public final void LJLI(InterfaceC1541990qEH interfaceC1541990qEH, String str, String str2) {
                    C1537070q6L c1537070q6L3 = c1540870qCT.LJII;
                    if (c1537070q6L3 != null) {
                        lynxView.getContext();
                        c1537070q6L3.LIZ(c1540870qCT.LIZLLL.LJIJI(), new C1537080q6M(str2));
                    }
                    C1532960pzi.LJFF(new ARunnableS123S0100000_23(c1540900qCW, 85));
                    this.LJI(C1540890qCV.LJII);
                }
            });
            lynxView.addLynxViewClient(new LynxViewClient() { // from class: X.0qCX
                @Override // com.lynx.tasm.LynxViewClient
                public final void LJJIIJ() {
                    lynxView.removeLynxViewClient(this);
                    c1540900qCW.LIZIZ = EnumC1540960qCc.LAYOUT;
                    if (c1540870qCT.LJI) {
                        C1532960pzi.LJFF(new ARunnableS92S0200000_23(c1540900qCW, lynxView, 59));
                    }
                    interfaceC1540940qCa.LIZJ();
                    if (!this.LIZ.isValid()) {
                        interfaceC1540940qCa.LIZLLL();
                        C1532960pzi.LJFF(new ARunnableS123S0100000_23(c1540900qCW, 87));
                        this.LJI(C1540890qCV.LJII);
                        return;
                    }
                    C1540870qCT c1540870qCT2 = c1540870qCT;
                    C1537070q6L c1537070q6L3 = c1540870qCT2.LJII;
                    if (c1537070q6L3 != null) {
                        String strLJIJI = c1540870qCT2.LIZLLL.LJIJI();
                        String str = c1540870qCT.LIZ;
                        InterfaceC1540940qCa interfaceC1540940qCa2 = interfaceC1540940qCa;
                        c1537070q6L3.LIZLLL(strLJIJI, str, interfaceC1540940qCa2 instanceof InterfaceC1105930esx ? (InterfaceC1105930esx) interfaceC1540940qCa2 : null);
                    }
                    this.LJI(c1540900qCW);
                }

                /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
                @Override // com.lynx.tasm.LynxViewClient
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LJJ(com.lynx.tasm.LynxError r6) {
                    /*
                        r5 = this;
                        com.lynx.tasm.LynxView r0 = r1
                        r0.removeLynxViewClient(r5)
                        X.0qCT r0 = r3
                        X.0q6L r4 = r0.LJII
                        if (r4 == 0) goto L35
                        com.bytedance.hybrid.spark.SparkContext r0 = r0.LIZLLL
                        java.lang.String r3 = r0.LJIJI()
                        X.0qCT r0 = r3
                        java.lang.String r2 = r0.LIZ
                        X.0q6M r1 = new X.0q6M
                        if (r6 == 0) goto L49
                        java.lang.String r0 = r6.LIZJ()
                        if (r0 != 0) goto L2f
                        if (r6 == 0) goto L49
                        java.lang.String r0 = r6.LIZLLL()
                        if (r0 != 0) goto L2f
                        if (r6 == 0) goto L49
                        java.lang.String r0 = r6.LJIIL
                        if (r0 != 0) goto L2f
                        java.lang.String r0 = ""
                    L2f:
                        r1.<init>(r0)
                        r4.LIZJ(r3, r2, r1)
                    L35:
                        Y.ARunnableS123S0100000_23 r2 = new Y.ARunnableS123S0100000_23
                        X.0qCW r1 = r2
                        r0 = 86
                        r2.<init>(r1, r0)
                        X.C1532960pzi.LJFF(r2)
                        X.0qCV r1 = r5
                        X.0qCW r0 = X.C1540890qCV.LJII
                        r1.LJI(r0)
                        return
                    L49:
                        java.lang.String r0 = "native error when rendering view"
                        goto L2f
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1540910qCX.LJJ(com.lynx.tasm.LynxError):void");
                }
            });
            interfaceC1540940qCa.LJIIIIZZ();
            c1540900qCW.LIZIZ = EnumC1540960qCc.LOAD;
            return;
        }
        c1540870qCT.LIZLLL.LJJJJZI(new C1554520qYU(this, 5));
        lynxView.addLynxViewClient(new C1554370qYF(this, lynxView, 1));
        interfaceC1540940qCa.LIZJ();
        if (this.LIZ.isValid()) {
            LJI(c1540900qCW);
            return;
        }
        interfaceC1540940qCa.LIZLLL();
        C1532960pzi.LJFF(new ARunnableS117S0100000_17(interfaceC1540940qCa, 142));
        LJI(LJII);
    }

    public C1540890qCV(C1541080qCo<?> c1541080qCo) {
        super(c1541080qCo);
        this.LJ = new AtomicReference<>(null);
    }

    @Override // X.AbstractC1541130qCt, X.InterfaceC1541260qD6
    public final boolean LIZ(C1540930qCZ c1540930qCZ) {
        if (c1540930qCZ.LIZ) {
            return false;
        }
        Runnable runnable = this.LJ.get();
        if (runnable != null && runnable != LJI) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC1541130qCt, X.InterfaceC1541260qD6
    public final boolean LIZJ(C1540930qCZ c1540930qCZ) {
        C1540870qCT c1540870qCT;
        if (c1540930qCZ.LIZ) {
            return false;
        }
        InterfaceC1541060qCm interfaceC1541060qCm = c1540930qCZ.LIZLLL;
        if (!(interfaceC1541060qCm instanceof C1540870qCT) || (c1540870qCT = (C1540870qCT) interfaceC1541060qCm) == null) {
            return false;
        }
        C1540870qCT c1540870qCT2 = (C1540870qCT) this.LIZ.LIZ.LIZLLL;
        if ((c1540870qCT.LIZJ == EnumC1540990qCf.FETCH_TRY && this.LIZLLL == null) || !C1540320qBa.LIZ(c1540870qCT2.LIZLLL, c1540870qCT.LIZLLL)) {
            return false;
        }
        AtomicReference<Runnable> atomicReference = this.LJ;
        RunnableC1541050qCl runnableC1541050qCl = LJFF;
        while (!atomicReference.compareAndSet(null, runnableC1541050qCl)) {
            if (atomicReference.get() != null) {
                AtomicReference<Runnable> atomicReference2 = this.LJ;
                RunnableC1541040qCk runnableC1541040qCk = LJI;
                RunnableC1541050qCl runnableC1541050qCl2 = LJFF;
                while (!atomicReference2.compareAndSet(runnableC1541040qCk, runnableC1541050qCl2)) {
                    if (atomicReference2.get() != runnableC1541040qCk) {
                        return false;
                    }
                }
                return true;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.AbstractC1541130qCt
    public final boolean LJ(AbstractC1541130qCt abstractC1541130qCt) throws InterruptedException {
        InterfaceC1541240qD4 interfaceC1541240qD4;
        C1540870qCT c1540870qCT;
        C1540890qCV c1540890qCV = (C1540890qCV) abstractC1541130qCt;
        C1540930qCZ c1540930qCZ = c1540890qCV.LIZ.LIZ;
        if (!c1540930qCZ.LIZ && this.LIZ.LIZ.LIZ) {
            C1540870qCT c1540870qCT2 = (C1540870qCT) c1540930qCZ.LIZLLL;
            int i = C1541000qCg.LIZ[c1540870qCT2.LIZJ.ordinal()];
            if (i != 2) {
                if (i != 3) {
                    C1534380q20 c1534380q20 = C1541270qD7.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("unexpected mode ");
                    sbLIZ.append(c1540870qCT2.LIZJ);
                    sbLIZ.append(" for cross-task reuse");
                    C1532760pzO.LIZJ(c1534380q20, "SparkPreViewOperation", "onReuse", C2188811AlT.LIZIZ(sbLIZ), null, null, 48);
                } else {
                    C1540900qCW c1540900qCW = this.LIZLLL;
                    if (c1540900qCW != null) {
                        c1540900qCW.LIZIZ(c1540890qCV);
                        c1540890qCV.LIZLLL(c1540900qCW, EnumC1541200qD0.CACHE);
                        return true;
                    }
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    ARunnableS103S0100000_3 aRunnableS103S0100000_3 = new ARunnableS103S0100000_3(countDownLatch, 64);
                    AtomicReference<Runnable> atomicReference = this.LJ;
                    RunnableC1541050qCl runnableC1541050qCl = LJFF;
                    while (!atomicReference.compareAndSet(runnableC1541050qCl, aRunnableS103S0100000_3)) {
                        if (atomicReference.get() != runnableC1541050qCl) {
                            C1540900qCW c1540900qCW2 = this.LIZLLL;
                            if (c1540900qCW2 != null) {
                                c1540900qCW2.LIZIZ(c1540890qCV);
                                c1540890qCV.LIZLLL(c1540900qCW2, EnumC1541200qD0.CACHE);
                                return true;
                            }
                            C1532760pzO.LIZJ(C1541270qD7.LIZ, "SparkPreViewOperation", "onReuse", "viewResult is not updated when sync", null, null, 48);
                            return false;
                        }
                    }
                    countDownLatch.await();
                    InterfaceC1541060qCm interfaceC1541060qCm = c1540890qCV.LIZ.LIZ.LIZLLL;
                    if ((interfaceC1541060qCm instanceof C1540870qCT) && (c1540870qCT = (C1540870qCT) interfaceC1541060qCm) != null) {
                        c1540870qCT.LJIIL = 10;
                    }
                    C1540900qCW c1540900qCW3 = this.LIZLLL;
                    if (c1540900qCW3 != null) {
                        c1540900qCW3.LIZIZ(c1540890qCV);
                        interfaceC1541240qD4 = c1540900qCW3;
                    } else {
                        interfaceC1541240qD4 = LJII;
                    }
                    c1540890qCV.LIZLLL(interfaceC1541240qD4, EnumC1541200qD0.REQUEST);
                    return true;
                }
            } else {
                C1540900qCW c1540900qCW4 = this.LIZLLL;
                if (c1540900qCW4 != null) {
                    c1540900qCW4.LIZIZ(c1540890qCV);
                    c1540890qCV.LIZLLL(c1540900qCW4, EnumC1541200qD0.CACHE);
                    return true;
                }
                ARunnableS92S0200000_23 aRunnableS92S0200000_23 = new ARunnableS92S0200000_23(c1540890qCV, this, 60);
                AtomicReference<Runnable> atomicReference2 = this.LJ;
                RunnableC1541050qCl runnableC1541050qCl2 = LJFF;
                while (!atomicReference2.compareAndSet(runnableC1541050qCl2, aRunnableS92S0200000_23)) {
                    if (atomicReference2.get() != runnableC1541050qCl2) {
                        C1540900qCW c1540900qCW5 = this.LIZLLL;
                        if (c1540900qCW5 != null) {
                            c1540900qCW5.LIZIZ(c1540890qCV);
                            c1540890qCV.LIZLLL(c1540900qCW5, EnumC1541200qD0.CACHE);
                            return true;
                        }
                        C1532760pzO.LIZJ(C1541270qD7.LIZ, "SparkPreViewOperation", "onReuse", "viewResult is not updated when async", null, null, 48);
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // X.AbstractC1541130qCt
    public final boolean LJFF(InterfaceC1541240qD4 interfaceC1541240qD4) {
        C1540900qCW c1540900qCW;
        if ((interfaceC1541240qD4 instanceof C1540900qCW) && (c1540900qCW = (C1540900qCW) interfaceC1541240qD4) != null) {
            c1540900qCW.LIZIZ(this);
            LIZLLL(c1540900qCW, EnumC1541200qD0.CACHE);
            return true;
        }
        return false;
    }

    public final void LJI(C1540900qCW c1540900qCW) {
        this.LIZLLL = c1540900qCW;
        Runnable andSet = this.LJ.getAndSet(LJI);
        if (andSet != null) {
            InterfaceC1540940qCa interfaceC1540940qCa = c1540900qCW.LIZ;
            if (interfaceC1540940qCa != null && !interfaceC1540940qCa.LJFF()) {
                C1532760pzO.LIZIZ(C1541270qD7.LIZ, "SparkPreViewOperation", "onResult", "cannot reuse result", null, null, 48);
            }
            andSet.run();
        }
        LIZLLL(c1540900qCW, null);
    }
}
