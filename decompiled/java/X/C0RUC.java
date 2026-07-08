package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.feed.platform.ab.ComponentStrategy;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS140S0400000_11;
import kotlin.jvm.internal.AwS246S0300000_2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0RUC, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RUC {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C0RUR());
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C695620RQi());

    public static final C0RUB LJIIIIZZ() {
        return new C0RUB(EnumC695670RQn.NEVER_LAZY, false, C0CMJ.HIGH_PRIORITY.getType(), "");
    }

    public static final void LJII(String str) {
        C01GW<AbstractC1604130rqV> c01gw = C0RUX.LJ;
        C0RUX.LJ.getValue().LJ(str);
    }

    public static final C0CME LJIIJ(EnumC695670RQn enumC695670RQn) {
        switch (C695680RQo.LIZ[enumC695670RQn.ordinal()]) {
            case 1:
                return C0CME.NEVER_EXECUTE;
            case 2:
                return C0CME.FIRST_VIDEO_SHOW;
            case 3:
                return C0CME.FIRST_VIDEO_FORBID;
            case 4:
                return C0CME.FIRST_UI_FRAME;
            case 5:
                return C0CME.FIRST_VIDEO_HAS_LEFT;
            case 6:
                return C0CME.SECOND_VIDEO_HAS_LEFT;
            case 7:
                return C0CME.START_UP_END;
            default:
                return C0CME.FIRST_VIDEO_SHOW;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJFF(X.InterfaceC691660RBc r6, kotlin.jvm.functions.Function0<kotlin.Unit> r7) {
        /*
            boolean r0 = r6 instanceof X.C0RUJ
            if (r0 == 0) goto L47
            r0 = r6
            X.0RUJ r0 = (X.C0RUJ) r0
            java.lang.String r4 = r0.T1()
            if (r4 == 0) goto L4b
            X.0R8b r0 = r6.jm()
            X.0RJN r0 = r0.LIZIZ()
            if (r0 == 0) goto L4b
            androidx.fragment.app.Fragment r0 = r0.LJ
            if (r0 == 0) goto L4b
            r0 = r6
            X.0RUJ r0 = (X.C0RUJ) r0
            r0.a6()
            X.01GW r0 = X.C097300Yh.LIZIZ
            java.lang.Object r0 = r0.getValue()
            java.util.Set r0 = (java.util.Set) r0
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L4b
            X.0CM3 r1 = new X.0CM3
            X.0CME r3 = X.C0CME.SCROLL_ON_PAGE_SELECTED
            r6 = 1
            X.0CMJ r0 = X.C0CMJ.HIGH_PRIORITY
            int r2 = r0.getType()
            kotlin.jvm.internal.AwS555S0100000_11 r5 = new kotlin.jvm.internal.AwS555S0100000_11
            r0 = 1634(0x662, float:2.29E-42)
            r5.<init>(r7, r0)
            r1.<init>(r2, r3, r4, r5, r6)
            X.C312240CLu.LIZ(r1)
        L47:
            r7.invoke()
            return
        L4b:
            r0 = r6
            X.0RUJ r0 = (X.C0RUJ) r0
            java.lang.String r4 = r0.T1()
            if (r4 == 0) goto L47
            X.0R8b r0 = r6.jm()
            X.0RJN r0 = r0.LIZIZ()
            if (r0 == 0) goto L47
            androidx.fragment.app.Fragment r0 = r0.LJ
            if (r0 == 0) goto L47
            X.0RUJ r6 = (X.C0RUJ) r6
            r6.Ie()
            X.01GW r0 = X.C097600Yk.LIZIZ
            java.lang.Object r0 = r0.getValue()
            java.util.Set r0 = (java.util.Set) r0
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L47
            X.01GW r0 = X.C0B89.LIZIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L9c
            X.0CMJ r0 = X.C0CMJ.NORMAL_PRIORITY
        L85:
            int r2 = r0.getType()
            X.0CM3 r1 = new X.0CM3
            X.0CME r3 = X.C0CME.SCROLL_END
            r6 = 1
            kotlin.jvm.internal.AwS555S0100000_11 r5 = new kotlin.jvm.internal.AwS555S0100000_11
            r0 = 1633(0x661, float:2.288E-42)
            r5.<init>(r7, r0)
            r1.<init>(r2, r3, r4, r5, r6)
            X.C312240CLu.LIZ(r1)
            return
        L9c:
            X.0CMJ r0 = X.C0CMJ.HIGH_PRIORITY
            goto L85
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0RUC.LJFF(X.0RBc, kotlin.jvm.functions.Function0):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(LifecycleOwner lifecycleOwner, Assembler assembler, Function1 function1) {
        String strT1;
        Object c098200Yq;
        C0RUJ c0ruj;
        C0RUJ c0ruj2;
        boolean zM8 = false;
        C0RUS c0rus = new C0RUS();
        function1.invoke(c0rus);
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) C13LP.LJJJJZI(c0rus.LIZIZ(C2097608Jq.LJ()));
        boolean z = abstractC738140SxQ instanceof C0RUJ;
        Object obj = null;
        if (z && (c0ruj2 = (C0RUJ) abstractC738140SxQ) != null) {
            strT1 = c0ruj2.T1();
        } else {
            strT1 = null;
        }
        if (z && (c0ruj = (C0RUJ) abstractC738140SxQ) != null) {
            zM8 = c0ruj.m8();
        }
        C0RUB c0rubLIZJ = LIZJ("homepage_hot", strT1, 0, 0, zM8);
        EnumC695670RQn enumC695670RQn = c0rubLIZJ.LIZ;
        int i = C695680RQo.LIZ[enumC695670RQn.ordinal()];
        if (i != 1) {
            if (i != 8) {
                try {
                    c098200Yq = C724240Sb0.LIZ(lifecycleOwner);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                    obj = c098200Yq;
                }
                LIZLLL((C19EG) obj, enumC695670RQn, c0rubLIZJ, abstractC738140SxQ, new C0RUI(assembler, lifecycleOwner, abstractC738140SxQ));
                return;
            }
            assembler.vQ2(lifecycleOwner, new C0RUK(abstractC738140SxQ));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJI(BasePanelUIComponent basePanelUIComponent, Assembler assembler, String str, Function1 function1) {
        C0RUJ c0ruj;
        C0RUJ c0ruj2;
        boolean zM8 = false;
        C696590RUb c696590RUb = new C696590RUb();
        function1.invoke(c696590RUb);
        UIContentAssem uIContentAssem = (UIContentAssem) C13LP.LJJJJZI(c696590RUb.LIZIZ(c696590RUb.LLILZIL.LL));
        boolean z = uIContentAssem instanceof C0RUJ;
        String strT1 = null;
        if (z && (c0ruj2 = (C0RUJ) uIContentAssem) != null) {
            strT1 = c0ruj2.T1();
        }
        if (z && (c0ruj = (C0RUJ) uIContentAssem) != null) {
            zM8 = c0ruj.m8();
        }
        C0RUB c0rubLIZJ = LIZJ(str, strT1, 0, 0, zM8);
        EnumC695670RQn enumC695670RQn = c0rubLIZJ.LIZ;
        int i = C695680RQo.LIZ[enumC695670RQn.ordinal()];
        if (i != 1) {
            if (i != 8) {
                LIZLLL(C724240Sb0.LIZ(basePanelUIComponent), enumC695670RQn, c0rubLIZJ, uIContentAssem, new AwS140S0400000_11(assembler, basePanelUIComponent, c696590RUb, uIContentAssem, 9));
            } else {
                assembler.QQ2(basePanelUIComponent, new C696610RUd(c696590RUb, uIContentAssem));
            }
        }
    }

    public static final void LJIIIZ(final String str, WeakReference<C19EG> weakReference, final AbstractC738140SxQ abstractC738140SxQ, Function0<Long> function0) {
        C19EG c19eg;
        if (C299590Boj.LIZ() && ((c19eg = weakReference.get()) == null || !C0RUZ.LIZ(c19eg))) {
            return;
        }
        final Long lInvoke = function0.invoke();
        C725080ScM.LIZ().execute(new Runnable() { // from class: X.0RUF
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("DowngradeExtKt@9b6.recovery$1");
                try {
                    final AbstractC738140SxQ abstractC738140SxQ2 = abstractC738140SxQ;
                    C0CAU.LIZIZ(new Runnable() { // from class: X.0RUG
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ2;
                            C0RUJ c0ruj;
                            C1C7U.LIZ("DowngradeExtKt@9b6.recovery$1$1");
                            try {
                                InterfaceC665370Q7z interfaceC665370Q7z = abstractC738140SxQ2;
                                try {
                                    Unit unit = null;
                                    if ((interfaceC665370Q7z instanceof C0RUJ) && (c0ruj = (C0RUJ) interfaceC665370Q7z) != null) {
                                        c0ruj.lj();
                                        unit = Unit.LIZ;
                                    }
                                    C189200o6.m2constructorimpl(unit);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    C189200o6.m2constructorimpl(new C098200Yq(th));
                                }
                            } finally {
                                if (!zLIZ2) {
                                }
                            }
                            C1C7U.LIZIZ("DowngradeExtKt@9b6.recovery$1$1");
                        }
                    });
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("DowngradeExtKt@9b6.recovery$1");
            }
        });
        if (str != null) {
            C20684815ws.LJFF().submit(new Runnable() { // from class: X.01T9
                public final void LIZ() {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("tag", str);
                    c2344009Gk.LJFF("type", "end");
                    c2344009Gk.LJ(lInvoke, "duration");
                    C20684815ws.LJIILLIIL("rd_feed_component_downgrade_event", c2344009Gk.LIZ);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("DowngradeExtKt@9b6.mobDowngradeEnd$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("DowngradeExtKt@9b6.mobDowngradeEnd$1");
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZIZ(BasePanelUIComponent basePanelUIComponent, Assembler assembler, String str, Function1 function1, int i) {
        Integer num;
        Integer num2;
        C0RUJ c0ruj;
        C0RUJ c0ruj2;
        if ((i & 2) != 0) {
            str = "homepage_hot";
        }
        String strT1 = null;
        boolean zM8 = false;
        if ((i & 4) != 0) {
            num = 0;
        } else {
            num = null;
        }
        if ((i & 8) != 0) {
            num2 = 0;
        } else {
            num2 = null;
        }
        C0RUS c0rus = new C0RUS();
        function1.invoke(c0rus);
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) C13LP.LJJJJZI(c0rus.LIZIZ(C2097608Jq.LJ()));
        boolean z = abstractC738140SxQ instanceof C0RUJ;
        if (z && (c0ruj2 = (C0RUJ) abstractC738140SxQ) != null) {
            strT1 = c0ruj2.T1();
        }
        if (z && (c0ruj = (C0RUJ) abstractC738140SxQ) != null) {
            zM8 = c0ruj.m8();
        }
        C0RUB c0rubLIZJ = LIZJ(str, strT1, num, num2, zM8);
        EnumC695670RQn enumC695670RQn = c0rubLIZJ.LIZ;
        int i2 = C695680RQo.LIZ[enumC695670RQn.ordinal()];
        if (i2 != 1) {
            if (i2 != 8) {
                LIZLLL(C724240Sb0.LIZ(basePanelUIComponent), enumC695670RQn, c0rubLIZJ, abstractC738140SxQ, new AwS246S0300000_2(assembler, basePanelUIComponent, abstractC738140SxQ, 32));
            } else {
                assembler.vQ2(basePanelUIComponent, new C0RUM(abstractC738140SxQ));
            }
        }
    }

    public static final C0RUB LIZJ(String str, String str2, Integer num, Integer num2, boolean z) {
        EnumC695670RQn enumC695670RQnLIZ;
        if (str2 == null) {
            return LJIIIIZZ();
        }
        if (num2 == null || (num2.intValue() != 0 && num2.intValue() != 61)) {
            return LJIIIIZZ();
        }
        if (!Intrinsics.LJFF(str, "homepage_hot")) {
            if (num != null && C304510Bwf.LIZ() && ((Set) C097900Yn.LIZIZ.getValue()).contains(str2) && new IntRange(0, C304510Bwf.LIZIZ()).LJLJL(num.intValue())) {
                return new C0RUB(EnumC695670RQn.SPLIT_TO_FRAME, true, C0CMJ.HIGH_PRIORITY.getType(), str2);
            }
            return LJIIIIZZ();
        }
        ComponentStrategy componentStrategy = (ComponentStrategy) ((Map) LIZ.getValue()).get(str2);
        if (num == null || num.intValue() != 0) {
            EnumC695670RQn enumC695670RQnLIZ2 = null;
            if (componentStrategy != null) {
                enumC695670RQnLIZ = C695690RQp.LIZ(componentStrategy);
            } else {
                enumC695670RQnLIZ = null;
            }
            if (enumC695670RQnLIZ != EnumC695670RQn.START_UP_END) {
                if (componentStrategy != null) {
                    enumC695670RQnLIZ2 = C695690RQp.LIZ(componentStrategy);
                }
                if (enumC695670RQnLIZ2 != EnumC695670RQn.SECOND_VIDEO_HAS_LEFT) {
                    if (num != null && C304510Bwf.LIZ() && ((Set) C097800Ym.LIZIZ.getValue()).contains(str2) && new IntRange(1, C304510Bwf.LIZIZ()).LJLJL(num.intValue())) {
                        return new C0RUB(EnumC695670RQn.SPLIT_TO_FRAME, true, C0CMJ.HIGH_PRIORITY.getType(), str2);
                    }
                    return LJIIIIZZ();
                }
            }
        }
        if (componentStrategy == null) {
            if (z) {
                return new C0RUB(EnumC695670RQn.FIRST_VIDEO_SHOW, true, C0CMJ.HIGH_PRIORITY.getType(), str2);
            }
            if (((Boolean) C283200B8c.LIZ.getValue()).booleanValue() && !((Set) LIZIZ.getValue()).contains(str2)) {
                C1AF0.LIZJ("tag: " + str2 + " miss strategy");
            }
            return LJIIIIZZ();
        }
        if (C312230CLt.LJFF(LJIIJ(C695690RQp.LIZ(componentStrategy)))) {
            return LJIIIIZZ();
        }
        return new C0RUB(C695690RQp.LIZ(componentStrategy), true, componentStrategy.priority, str2, componentStrategy.timeoutDuration, componentStrategy.idleTrigger, componentStrategy.ignoreSurfaceView);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZLLL(X.C19EG r16, X.EnumC695670RQn r17, final X.C0RUB r18, final X.AbstractC738140SxQ r19, final kotlin.jvm.functions.Function0<java.lang.Long> r20) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0RUC.LIZLLL(X.19EG, X.0RQn, X.0RUB, X.0SxQ, kotlin.jvm.functions.Function0):void");
    }

    public static final void LJ(BaseCellContentComponent baseCellContentComponent, Assembler assembler, String str, Integer num, Integer num2, Function1 function1) {
        Object c098200Yq;
        Object c098200Yq2;
        boolean zBooleanValue;
        C0RUJ c0ruj;
        C0RUJ c0ruj2;
        C0RTA c0rta = new C0RTA();
        function1.invoke(c0rta);
        ReusedUIContentAssem<? extends C03H5> reusedUIContentAssem = c0rta.LLJ;
        if (reusedUIContentAssem == null) {
            reusedUIContentAssem = (ReusedUIContentAssem) C13LP.LJJJJZI(c0rta.LIZIZ(c0rta.LL.LL));
        }
        Object obj = null;
        try {
            if ((reusedUIContentAssem instanceof C0RUJ) && (c0ruj2 = (C0RUJ) reusedUIContentAssem) != null) {
                c098200Yq = c0ruj2.T1();
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str2 = (String) c098200Yq;
        try {
            if ((reusedUIContentAssem instanceof C0RUJ) && (c0ruj = (C0RUJ) reusedUIContentAssem) != null) {
                c098200Yq2 = Boolean.valueOf(c0ruj.m8());
            } else {
                c098200Yq2 = null;
            }
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
            obj = c098200Yq2;
        }
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        C0RUB c0rubLIZJ = LIZJ(str, str2, num, num2, zBooleanValue);
        EnumC695670RQn enumC695670RQn = c0rubLIZJ.LIZ;
        int i = C695680RQo.LIZ[enumC695670RQn.ordinal()];
        if (i != 1 && i != 3) {
            if (i != 8) {
                assembler.LQ2(baseCellContentComponent, new C691770RBn(c0rta, reusedUIContentAssem));
                LIZLLL(C724240Sb0.LIZ(baseCellContentComponent), enumC695670RQn, c0rubLIZJ, reusedUIContentAssem, new C0RI9(baseCellContentComponent, reusedUIContentAssem));
            } else {
                assembler.LQ2(baseCellContentComponent, new C691810RBr(c0rta, reusedUIContentAssem));
            }
        }
    }
}
