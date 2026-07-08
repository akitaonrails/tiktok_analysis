package X;

import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SaL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C723830SaL {
    public static final void LIZIZ(C03H5 c03h5, Function0<Unit> function0) {
        ReusedUIAssem reusedUIAssem;
        if ((c03h5 instanceof ReusedUIAssem) && (reusedUIAssem = (ReusedUIAssem) c03h5) != null) {
            if (reusedUIAssem.LLJJIJI) {
                function0.invoke();
                return;
            }
            return;
        }
        function0.invoke();
    }

    public static void LIZLLL(ReusedAssem reusedAssem, C13IQ c13iq) {
        LJ(reusedAssem, c13iq, true, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    @X.InterfaceC1294060jmO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <ASSEM extends com.bytedance.assem.arch.reused.ReusedUIAssem<? extends X.C03H5>> void LIZ(ASSEM r11, X.AbstractC724210Sax r12, kotlin.jvm.functions.Function1<? super com.bytedance.assem.arch.core.Assembler, kotlin.Unit> r13) {
        /*
            Method dump skipped, instruction units count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C723830SaL.LIZ(com.bytedance.assem.arch.reused.ReusedUIAssem, X.0Sax, kotlin.jvm.functions.Function1):void");
    }

    public static final <REUSED extends ReusedAssem<? extends C03H5>> void LIZJ(REUSED reused, C13IQ<? extends ReusedAssem<?>> c13iq, boolean z) {
        LJ(reused, c13iq, z, null);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0RTS] */
    public static final <REUSED extends ReusedAssem<? extends C03H5>> void LJ(final REUSED reused, final Object obj, boolean z, final Function0<Unit> function0) {
        final long j;
        Object obj2;
        C724270Sb3 c724270Sb3 = reused.LLJI;
        if (c724270Sb3 != null) {
            j = c724270Sb3.LLJI;
        } else {
            j = 0;
        }
        if (C13LP.LJJJJ(obj, C725080ScM.LJIJ)) {
            try {
                InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
                if (interfaceC723720SaA != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("safeTriggerAssemLazyLoadWithCallback ");
                    sbLIZ.append(obj);
                    sbLIZ.append(",from ");
                    sbLIZ.append(reused);
                    sbLIZ.append(", proxy: ");
                    sbLIZ.append(reused.LLJI);
                    sbLIZ.append(", item: ");
                    C724270Sb3 c724270Sb32 = reused.LLJI;
                    if (c724270Sb32 != null) {
                        obj2 = c724270Sb32.LL;
                    } else {
                        obj2 = null;
                    }
                    sbLIZ.append(obj2);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    int i = C2187451AjH.LIZ;
                    interfaceC723720SaA.log("AssemList", strLIZIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        final ?? r3 = new Runnable() { // from class: X.0RTS
            public final void LIZ() {
                C19EG c19egLIZ;
                ReusedAssem reusedAssem = reused;
                Object obj3 = obj;
                if (C725080ScM.LIZLLL) {
                    try {
                        InterfaceC723720SaA interfaceC723720SaA2 = C725080ScM.LIZIZ;
                        if (interfaceC723720SaA2 != null) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("safeTriggerAssemLazyLoad in ");
                            sbLIZ2.append(reusedAssem);
                            sbLIZ2.append(",  target: ");
                            sbLIZ2.append(obj3);
                            sbLIZ2.append(", ");
                            sbLIZ2.append(reusedAssem.getLifecycle().getCurrentState());
                            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                            int i2 = C2187451AjH.LIZ;
                            interfaceC723720SaA2.log("AssemList", strLIZIZ2);
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                    }
                }
                if (C0RTV.LIZ(reused.getLifecycle())) {
                    Object obj4 = obj;
                    if (C725080ScM.LIZLLL) {
                        try {
                            InterfaceC723720SaA interfaceC723720SaA3 = C725080ScM.LIZIZ;
                            if (interfaceC723720SaA3 != null) {
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("safeTriggerAssemLazyLoad return because lifecycle destroyed. target: ");
                                sbLIZ3.append(obj4);
                                String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
                                int i3 = C2187451AjH.LIZ;
                                interfaceC723720SaA3.log("AssemList", strLIZIZ3);
                                return;
                            }
                            return;
                        } catch (Throwable th3) {
                            TryCatchGuardChecker.doCheck(th3);
                            return;
                        }
                    }
                    return;
                }
                ReusedAssem reusedAssem2 = reused;
                if (reusedAssem2.getContext() instanceof C19EG) {
                    c19egLIZ = (C19EG) reusedAssem2.getContext();
                } else {
                    c19egLIZ = C724240Sb0.LIZ(reusedAssem2);
                    if (c19egLIZ == null) {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                Assembler assemblerLIZ = C0RPA.LIZ(c19egLIZ);
                ReusedAssem reusedAssem3 = reused;
                Object obj5 = obj;
                long j2 = j;
                Function0<Unit> function02 = function0;
                AssemSupervisor assemSupervisorCQ2 = assemblerLIZ.CQ2(reusedAssem3);
                if (assemSupervisorCQ2 == null) {
                    if (function02 != null) {
                        function02.invoke();
                        return;
                    }
                    return;
                }
                if (!assemSupervisorCQ2.LLJJ.containsKey(obj5)) {
                    if (function02 != null) {
                        function02.invoke();
                        return;
                    }
                    return;
                }
                C0RTL c0rtlRemove = assemSupervisorCQ2.LLJJ.remove(obj5);
                if (c0rtlRemove == null) {
                    if (function02 != null) {
                        function02.invoke();
                        return;
                    }
                    return;
                }
                if ((c0rtlRemove instanceof C0RTC) && C723770SaF.LIZIZ(reusedAssem3, (C0RTC) c0rtlRemove, assemblerLIZ, assemSupervisorCQ2)) {
                    return;
                }
                List<AbstractC738140SxQ> listLIZIZ = c0rtlRemove.LIZIZ(assemSupervisorCQ2.LLIZLLLIL.LL);
                for (AbstractC738140SxQ abstractC738140SxQ : listLIZIZ) {
                    abstractC738140SxQ.active = true;
                    if (C13LP.LJJJJ(C13LE.LIZ(abstractC738140SxQ.getClass()), C725080ScM.LJIJ)) {
                        try {
                            InterfaceC723720SaA interfaceC723720SaA4 = C725080ScM.LIZIZ;
                            if (interfaceC723720SaA4 != null) {
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("checkAndTriggerLazyLoad from ");
                                sbLIZ4.append(reusedAssem3);
                                sbLIZ4.append(", assem: ");
                                sbLIZ4.append(abstractC738140SxQ);
                                sbLIZ4.append(", proxy: ");
                                sbLIZ4.append(reusedAssem3.LLJI);
                                sbLIZ4.append(", item: ");
                                C724270Sb3 c724270Sb33 = reusedAssem3.LLJI;
                                sbLIZ4.append(c724270Sb33 != null ? c724270Sb33.LL : null);
                                String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ4);
                                int i4 = C2187451AjH.LIZ;
                                interfaceC723720SaA4.log("AssemList", strLIZIZ4);
                            }
                        } catch (Throwable th4) {
                            TryCatchGuardChecker.doCheck(th4);
                        }
                    }
                }
                C724240Sb0.LJII(new C0RTT(listLIZIZ, assemSupervisorCQ2, c0rtlRemove, reusedAssem3, j2, function02));
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ReusedAssembleExtKt@401b.safeTriggerAssemLazyLoadWithCallback$runnable$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ReusedAssembleExtKt@401b.safeTriggerAssemLazyLoadWithCallback$runnable$1");
            }
        };
        if (z) {
            C725080ScM.LIZ().execute(new Runnable() { // from class: X.0H8l
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ReusedAssembleExtKt@401b.safeTriggerAssemLazyLoadWithCallback$2");
                    try {
                        r3.run();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ReusedAssembleExtKt@401b.safeTriggerAssemLazyLoadWithCallback$2");
                }
            });
        } else {
            r3.run();
        }
    }
}
