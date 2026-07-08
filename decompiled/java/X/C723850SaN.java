package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS404S0200000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SaN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C723850SaN {
    public static final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());

    public static final void LJI(final Function0<Unit> function0) {
        if (Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            function0.invoke();
        } else {
            C786410Ut5.LJJZZIII(LIZ, new Runnable() { // from class: X.0R7M
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("AssembleExtKt@2b53.runOnMainThread$1");
                    try {
                        function0.invoke();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("AssembleExtKt@2b53.runOnMainThread$1");
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c8, code lost:
    
        r9 = r10.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ce, code lost:
    
        if (r9 == java.lang.Object.class) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d0, code lost:
    
        r12 = r9.getInterfaces();
        r11 = new java.util.ArrayList();
        r8 = r12.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00db, code lost:
    
        if (r7 >= r8) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00dd, code lost:
    
        r1 = r12[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e5, code lost:
    
        if (X.InterfaceC723730SaB.class.isAssignableFrom(r1) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e7, code lost:
    
        r11.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ea, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ed, code lost:
    
        r1 = r11.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f5, code lost:
    
        if (r1.hasNext() == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f7, code lost:
    
        r3.LIZLLL((java.lang.Class) r1.next(), r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0104, code lost:
    
        r9 = r9.getSuperclass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0108, code lost:
    
        if (r9 != null) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.C19EG r14, kotlin.jvm.functions.Function1 r15) {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C723850SaN.LIZIZ(X.19EG, kotlin.jvm.functions.Function1):void");
    }

    public static void LIZJ(AbstractC738140SxQ abstractC738140SxQ, Function1 function1) {
        Assembler assemblerLIZ;
        if (!abstractC738140SxQ.isParentInit && C723910SaT.LIZ(abstractC738140SxQ)) {
            assemblerLIZ = abstractC738140SxQ.getPreloader$assem_release().LJII().LIZ();
            if (assemblerLIZ == null) {
                return;
            }
        } else {
            C19EG c19egLIZ = C724240Sb0.LIZ(abstractC738140SxQ);
            if (c19egLIZ == null) {
                return;
            }
            C725220Sca c725220Sca = C725220Sca.LIZ;
            String strValueOf = String.valueOf(abstractC738140SxQ.hashCode());
            if (C725450Scx.LIZJ) {
                ArrayList<InterfaceC725440Scw> arrayList = C725430Scv.LIZIZ;
                if (arrayList.size() > 0) {
                    Iterator<InterfaceC725440Scw> it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        it2.next().onEventBegin(c725220Sca);
                    }
                }
                if (C725480Sd0.LIZ(c725220Sca)) {
                    C725430Scv.LIZ(new C723860SaO(c725220Sca, strValueOf, SystemClock.elapsedRealtimeNanos()));
                }
            }
            assemblerLIZ = C0RPA.LIZ(c19egLIZ);
            C0RTY c0rtyZQ2 = assemblerLIZ.zQ2(abstractC738140SxQ);
            if (c0rtyZQ2 == null) {
                c0rtyZQ2 = new C0RTY(assemblerLIZ.zQ2(abstractC738140SxQ.getSupervisor().LLJ));
                if (C725080ScM.LIZLLL) {
                    try {
                        InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
                        if (interfaceC723720SaA != null) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("create data store node for ");
                            sbLIZ.append(abstractC738140SxQ);
                            sbLIZ.append(", and store is ");
                            sbLIZ.append(c0rtyZQ2);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            int i = C2187451AjH.LIZ;
                            interfaceC723720SaA.log("Data-Store", strLIZIZ);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                assemblerLIZ.NQ2(abstractC738140SxQ, c0rtyZQ2);
            }
            C724710Sbl c724710SblBQ2 = Assembler.BQ2(assemblerLIZ, abstractC738140SxQ);
            if (c724710SblBQ2 == null) {
                c724710SblBQ2 = new C724710Sbl(Assembler.BQ2(assemblerLIZ, abstractC738140SxQ.getSupervisor().LLJ));
                assemblerLIZ.OQ2(abstractC738140SxQ, c724710SblBQ2);
            }
            C013C c013c = new C013C();
            AssemSupervisor assemSupervisorCQ2 = assemblerLIZ.CQ2(abstractC738140SxQ);
            if (assemSupervisorCQ2 == null) {
                Context context = abstractC738140SxQ.getContext();
                Context context2 = c19egLIZ;
                if (context != null) {
                    context2 = context;
                }
                assemSupervisorCQ2 = new AssemSupervisor(abstractC738140SxQ, context2, c0rtyZQ2, c724710SblBQ2);
                c013c.element = true;
                assemblerLIZ.PQ2(abstractC738140SxQ, assemSupervisorCQ2);
                LJI(new AwS404S0200000_3(abstractC738140SxQ, assemblerLIZ, 69));
                assemSupervisorCQ2.LLJILJILJ = abstractC738140SxQ.isAssemViewCreated$assem_release();
            }
            C723840SaM.LIZ(abstractC738140SxQ, null, assemSupervisorCQ2, assemblerLIZ);
            C725220Sca c725220Sca2 = C725220Sca.LIZ;
            String strValueOf2 = String.valueOf(abstractC738140SxQ.hashCode());
            if (C725450Scx.LIZJ) {
                ArrayList<InterfaceC725440Scw> arrayList2 = C725430Scv.LIZIZ;
                if (arrayList2.size() > 0) {
                    Iterator<InterfaceC725440Scw> it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        it3.next().onEventEnd(c725220Sca2);
                    }
                }
                if (C725480Sd0.LIZ(c725220Sca2)) {
                    C725430Scv.LIZ(new C724820Sbw(c725220Sca2, strValueOf2, SystemClock.elapsedRealtimeNanos(), Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread()), abstractC738140SxQ, c013c));
                }
            }
        }
        C723940SaW.LIZ(assemblerLIZ, function1);
    }

    public static void LIZLLL(final UIAssem uIAssem, Function1 function1) {
        Assembler assemblerLIZ;
        if (!uIAssem.isParentInit && C723910SaT.LIZ(uIAssem)) {
            assemblerLIZ = uIAssem.getPreloader$assem_release().LJII().LIZ();
            if (assemblerLIZ == null) {
                return;
            }
        } else {
            C19EG c19egLIZ = C724240Sb0.LIZ(uIAssem);
            if (c19egLIZ == null) {
                return;
            }
            C725220Sca c725220Sca = C725220Sca.LIZ;
            String strValueOf = String.valueOf(uIAssem.hashCode());
            if (C725450Scx.LIZJ) {
                ArrayList<InterfaceC725440Scw> arrayList = C725430Scv.LIZIZ;
                if (arrayList.size() > 0) {
                    Iterator<InterfaceC725440Scw> it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        it2.next().onEventBegin(c725220Sca);
                    }
                }
                if (C725480Sd0.LIZ(c725220Sca)) {
                    C725430Scv.LIZ(new C723890SaR(c725220Sca, strValueOf, SystemClock.elapsedRealtimeNanos()));
                }
            }
            assemblerLIZ = C0RPA.LIZ(c19egLIZ);
            C0RTY c0rtyZQ2 = assemblerLIZ.zQ2(uIAssem);
            if (c0rtyZQ2 == null) {
                c0rtyZQ2 = new C0RTY(assemblerLIZ.zQ2(uIAssem.getSupervisor().LLJ));
                if (C725080ScM.LIZLLL) {
                    try {
                        InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
                        if (interfaceC723720SaA != null) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("create data store node for ");
                            sbLIZ.append(uIAssem);
                            sbLIZ.append(", and store is ");
                            sbLIZ.append(c0rtyZQ2);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            int i = C2187451AjH.LIZ;
                            interfaceC723720SaA.log("Data-Store", strLIZIZ);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                assemblerLIZ.NQ2(uIAssem, c0rtyZQ2);
            }
            C724710Sbl c724710SblBQ2 = Assembler.BQ2(assemblerLIZ, uIAssem);
            if (c724710SblBQ2 == null) {
                c724710SblBQ2 = new C724710Sbl(Assembler.BQ2(assemblerLIZ, uIAssem.getSupervisor().LLJ));
                assemblerLIZ.OQ2(uIAssem, c724710SblBQ2);
            }
            C013C c013c = new C013C();
            final AssemSupervisor assemSupervisorCQ2 = assemblerLIZ.CQ2(uIAssem);
            if (assemSupervisorCQ2 == null) {
                Context context = uIAssem.getContext();
                Context context2 = c19egLIZ;
                if (context != null) {
                    context2 = context;
                }
                assemSupervisorCQ2 = new AssemSupervisor(uIAssem, context2, c0rtyZQ2, c724710SblBQ2);
                c013c.element = true;
                if (uIAssem.so()) {
                    assemSupervisorCQ2.LLJJIII = uIAssem.LJJIJL();
                } else {
                    uIAssem.bo(new InterfaceC723960SaY() { // from class: X.0SaU
                        @Override // X.InterfaceC723960SaY
                        public final void LIZ(View view) {
                            uIAssem.zo(this);
                            AssemSupervisor assemSupervisor = assemSupervisorCQ2;
                            if (assemSupervisor.LLJJIII == null) {
                                assemSupervisor.LLJJIII = view;
                            }
                        }
                    });
                }
                assemblerLIZ.PQ2(uIAssem, assemSupervisorCQ2);
                LJI(new C08C2(assemblerLIZ, uIAssem));
                assemSupervisorCQ2.LLJILJILJ = uIAssem.isAssemViewCreated$assem_release();
                uIAssem.fo(assemSupervisorCQ2, uIAssem);
            }
            C723840SaM.LIZ(uIAssem, null, assemSupervisorCQ2, assemblerLIZ);
            C725220Sca c725220Sca2 = C725220Sca.LIZ;
            String strValueOf2 = String.valueOf(uIAssem.hashCode());
            if (C725450Scx.LIZJ) {
                ArrayList<InterfaceC725440Scw> arrayList2 = C725430Scv.LIZIZ;
                if (arrayList2.size() > 0) {
                    Iterator<InterfaceC725440Scw> it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        it3.next().onEventEnd(c725220Sca2);
                    }
                }
                if (C725480Sd0.LIZ(c725220Sca2)) {
                    C725430Scv.LIZ(new C724850Sbz(c725220Sca2, strValueOf2, SystemClock.elapsedRealtimeNanos(), Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread()), uIAssem, c013c));
                }
            }
        }
        C723940SaW.LIZ(assemblerLIZ, function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x00fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(X.InterfaceC719640SKs r12, kotlin.jvm.functions.Function1 r13) {
        /*
            Method dump skipped, instruction units count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C723850SaN.LJ(X.0SKs, kotlin.jvm.functions.Function1):void");
    }

    public static final <T> T LJFF(AbstractC738140SxQ abstractC738140SxQ, String str) {
        T t;
        if (abstractC738140SxQ instanceof ReusedAssem) {
            t = (T) ((LinkedHashMap) ((ReusedAssem) abstractC738140SxQ).LLILZIL).get(str);
        } else {
            t = (T) abstractC738140SxQ.getConfig().LLILZ.get(str);
        }
        if (t == null) {
            return null;
        }
        return t;
    }

    public static boolean LJIIIIZZ(Fragment fragment, C13IQ c13iq) {
        AssemSupervisor assemSupervisorLIZJ = C724240Sb0.LIZJ(fragment);
        if (assemSupervisorLIZJ != null) {
            return assemSupervisorLIZJ.LJIIIZ(null, c13iq);
        }
        return false;
    }

    public static final boolean LJII(AbstractC738140SxQ abstractC738140SxQ, C13IQ<? extends AbstractC738140SxQ> c13iq, String str) {
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(abstractC738140SxQ);
        if (assemSupervisorLJ != null) {
            return assemSupervisorLJ.LJIIIZ(str, c13iq);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(final Fragment fragment, boolean z, C724220Say c724220Say, Function1 function1, int i) {
        final boolean z2;
        final boolean z3 = z;
        if ((i & 1) != 0) {
            z3 = false;
        }
        C724220Say c724220Say2 = null;
        if ((i & 2) == 0) {
            c724220Say2 = c724220Say;
        }
        C725220Sca c725220Sca = C725220Sca.LIZ;
        String strValueOf = String.valueOf(fragment.hashCode());
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList = C725430Scv.LIZIZ;
            if (arrayList.size() > 0) {
                Iterator<InterfaceC725440Scw> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().onEventBegin(c725220Sca);
                }
            }
            if (C725480Sd0.LIZ(c725220Sca)) {
                C725430Scv.LIZ(new C723880SaQ(c725220Sca, strValueOf, SystemClock.elapsedRealtimeNanos()));
            }
        }
        C19EG activity = fragment.getActivity();
        if (activity != null) {
            Context context = fragment.getContext();
            if (context == null) {
                context = fragment.getActivity();
            }
            if (context != null) {
                final Assembler assemblerLIZ = C0RPA.LIZ(activity);
                C0RTY c0rtyZQ2 = assemblerLIZ.zQ2(fragment);
                if (c0rtyZQ2 == null) {
                    Fragment parentFragment = fragment.getParentFragment();
                    LifecycleOwner lifecycleOwner = parentFragment;
                    if (parentFragment == null) {
                        lifecycleOwner = activity;
                    }
                    c0rtyZQ2 = new C0RTY(assemblerLIZ.zQ2(lifecycleOwner));
                    if (C725080ScM.LIZLLL) {
                        try {
                            InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
                            if (interfaceC723720SaA != null) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("create data store node for ");
                                sbLIZ.append(fragment);
                                sbLIZ.append(", and store is ");
                                sbLIZ.append(c0rtyZQ2);
                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                int i2 = C2187451AjH.LIZ;
                                interfaceC723720SaA.log("Data-Store", strLIZIZ);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                    assemblerLIZ.NQ2(fragment, c0rtyZQ2);
                }
                C724710Sbl c724710SblBQ2 = Assembler.BQ2(assemblerLIZ, fragment);
                if (c724710SblBQ2 == null) {
                    Fragment parentFragment2 = fragment.getParentFragment();
                    LifecycleOwner lifecycleOwner2 = activity;
                    if (parentFragment2 != null) {
                        lifecycleOwner2 = parentFragment2;
                    }
                    c724710SblBQ2 = new C724710Sbl(Assembler.BQ2(assemblerLIZ, lifecycleOwner2));
                    if (fragment instanceof InterfaceC723730SaB) {
                        InterfaceC723730SaB interfaceC723730SaB = (InterfaceC723730SaB) fragment;
                        Class<?>[] interfaces = interfaceC723730SaB.getClass().getInterfaces();
                        int length = interfaces.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length) {
                                break;
                            }
                            Class<?> cls = interfaces[i3];
                            if (InterfaceC723730SaB.class.isAssignableFrom(cls)) {
                                if (cls != null) {
                                    if (!c724710SblBQ2.LIZIZ.containsKey(new C634030Ott(cls, interfaceC723730SaB.LIZ()))) {
                                        break;
                                    }
                                }
                            } else {
                                i3++;
                            }
                        }
                        Class<?> superclass = interfaceC723730SaB.getClass();
                        while (superclass != Object.class) {
                            Class<?>[] interfaces2 = superclass.getInterfaces();
                            ArrayList arrayList2 = new ArrayList();
                            for (Class<?> cls2 : interfaces2) {
                                if (InterfaceC723730SaB.class.isAssignableFrom(cls2)) {
                                    arrayList2.add(cls2);
                                }
                            }
                            Iterator it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                c724710SblBQ2.LIZLLL((Class) it3.next(), interfaceC723730SaB);
                            }
                            superclass = superclass.getSuperclass();
                            if (superclass == null) {
                                break;
                            }
                        }
                    }
                    LJI(new C08C1(fragment, c724710SblBQ2, assemblerLIZ));
                    assemblerLIZ.OQ2(fragment, c724710SblBQ2);
                }
                if (fragment.getView() == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C013C c013c = new C013C();
                final AssemSupervisor assemSupervisorCQ2 = assemblerLIZ.CQ2(fragment);
                if (assemSupervisorCQ2 == null) {
                    assemSupervisorCQ2 = new AssemSupervisor(fragment, context, c0rtyZQ2, c724710SblBQ2);
                    c013c.element = true;
                    FragmentManager fragmentManager = fragment.getFragmentManager();
                    if (fragmentManager != null) {
                        fragmentManager.LJZL(new AbstractC813200VvC() { // from class: X.0SaZ
                            @Override // X.AbstractC813200VvC
                            public final void onFragmentDestroyed(FragmentManager fragmentManager2, Fragment fragment2) {
                                FragmentManager fragmentManager3;
                                super.onFragmentDestroyed(fragmentManager2, fragment2);
                                if (z3 && fragment2 == fragment) {
                                    assemSupervisorCQ2.LJIIIIZZ();
                                    assemblerLIZ.xQ2(fragment2);
                                }
                                Fragment fragment3 = fragment;
                                if (fragment2 == fragment3 && (fragmentManager3 = fragment3.getFragmentManager()) != null) {
                                    fragmentManager3.LLIILZL(this);
                                }
                            }

                            @Override // X.AbstractC813200VvC
                            public final void onFragmentViewDestroyed(FragmentManager fragmentManager2, Fragment fragment2) {
                                super.onFragmentViewDestroyed(fragmentManager2, fragment2);
                                if (!z3 && fragment2 == fragment) {
                                    assemSupervisorCQ2.LJIIIIZZ();
                                    assemblerLIZ.xQ2(fragment2);
                                }
                            }

                            @Override // X.AbstractC813200VvC
                            public final void onFragmentViewCreated(FragmentManager fragmentManager2, Fragment fragment2, View view, Bundle bundle) {
                                if (z2 && fragment2 == fragment) {
                                    AssemSupervisor assemSupervisor = assemSupervisorCQ2;
                                    if (assemSupervisor.LLJJIII == null) {
                                        assemSupervisor.LLJJIII = view;
                                    }
                                    CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList = assemSupervisor.LLJILLL;
                                    ArrayList arrayList3 = new ArrayList();
                                    for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                                        AbstractC738140SxQ abstractC738140SxQ2 = abstractC738140SxQ;
                                        if (abstractC738140SxQ2.active && abstractC738140SxQ2.hasLoaded) {
                                            arrayList3.add(abstractC738140SxQ);
                                        }
                                    }
                                    Iterator it4 = arrayList3.iterator();
                                    while (it4.hasNext()) {
                                        ((AbstractC738140SxQ) it4.next()).handleOnParentViewCreated$assem_release();
                                    }
                                }
                            }
                        }, false);
                    }
                    assemblerLIZ.PQ2(fragment, assemSupervisorCQ2);
                    assemSupervisorCQ2.LLJILJILJ = !z2;
                }
                if (!z2) {
                    View view = fragment.getView();
                    if (view != null) {
                        assemSupervisorCQ2.LLJJIII = view;
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                C723840SaM.LIZ(fragment, c724220Say2, assemSupervisorCQ2, assemblerLIZ);
                C725220Sca c725220Sca2 = C725220Sca.LIZ;
                String strValueOf2 = String.valueOf(fragment.hashCode());
                if (C725450Scx.LIZJ) {
                    ArrayList<InterfaceC725440Scw> arrayList3 = C725430Scv.LIZIZ;
                    if (arrayList3.size() > 0) {
                        Iterator<InterfaceC725440Scw> it4 = arrayList3.iterator();
                        while (it4.hasNext()) {
                            it4.next().onEventEnd(c725220Sca2);
                        }
                    }
                    if (C725480Sd0.LIZ(c725220Sca2)) {
                        C725430Scv.LIZ(new C724840Sby(c725220Sca2, strValueOf2, SystemClock.elapsedRealtimeNanos(), Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread()), fragment, c013c));
                    }
                }
                C723940SaW.LIZ(assemblerLIZ, function1);
            }
        }
    }
}
