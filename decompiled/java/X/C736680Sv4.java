package X;

import android.os.Looper;
import android.os.SystemClock;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS109S0400000_11;
import kotlin.jvm.internal.AwS13S1100100_11;
import kotlin.jvm.internal.AwS2S1210100_11;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS447S0200000_11;
import kotlin.jvm.internal.AwS479S0200000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Sv4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C736680Sv4 {
    public static <RECEIVER extends C03H5> Function0<Boolean> LIZIZ(InterfaceC725030ScH<RECEIVER> interfaceC725030ScH) {
        if (interfaceC725030ScH.getReceiverForHostVM() != null) {
            return new C725040ScI(interfaceC725030ScH);
        }
        return new C725070ScL();
    }

    public static <RECEIVER extends C03H5> InterfaceC1790830whd LIZJ(InterfaceC725030ScH<RECEIVER> interfaceC725030ScH) {
        InterfaceC1790830whd interfaceC1790830whd;
        C03H5 receiverForHostVM = interfaceC725030ScH.getReceiverForHostVM();
        if (!(receiverForHostVM instanceof InterfaceC1790830whd) || (interfaceC1790830whd = (InterfaceC1790830whd) receiverForHostVM) == null) {
            return new C736800SvG();
        }
        return interfaceC1790830whd;
    }

    public static Object LJIJJ(AssemViewModel assemViewModel, Function1 function1) {
        return function1.invoke(assemViewModel.vmDispatcher.getState());
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static void LJIJJLI(AssemViewModel assemViewModel, Function1 function1) {
        assemViewModel.vmDispatcher.LJJIJIL(new AwS590S0100000_11(function1, (Function1<? super C0RTH, Unit>) 31));
    }

    public static Object LJIJI(AssemViewModel assemViewModel, AssemViewModel assemViewModel2, Function2 function2) {
        return function2.invoke(assemViewModel.vmDispatcher.getState(), assemViewModel2.vmDispatcher.getState());
    }

    public static Object LJIJ(AssemViewModel assemViewModel, AssemViewModel assemViewModel2, AssemViewModel assemViewModel3, InterfaceC1631620sYq interfaceC1631620sYq) {
        return interfaceC1631620sYq.invoke(assemViewModel.vmDispatcher.getState(), assemViewModel2.vmDispatcher.getState(), assemViewModel3.vmDispatcher.getState());
    }

    public static <RECEIVER extends C03H5, S extends InterfaceC0148002o> C0ZP4 LJIILLIIL(InterfaceC725030ScH<RECEIVER> interfaceC725030ScH, AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super RECEIVER, ? super S, Unit> function2) {
        C0ZP4 c0zp4LJJJJ;
        C736780SvE c736780SvE = C736780SvE.LIZ;
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList = C725430Scv.LIZIZ;
            if (arrayList.size() > 0) {
                Iterator<InterfaceC725440Scw> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().onEventBegin(c736780SvE);
                }
            }
            if (C725480Sd0.LIZ(c736780SvE)) {
                C725430Scv.LIZ(new AwS13S1100100_11(c736780SvE, "default", SystemClock.elapsedRealtimeNanos(), 12));
            }
        }
        if (assemViewModel.usedInReusedScene) {
            InterfaceC725050ScJ<RECEIVER> actualReceiverHolder = interfaceC725030ScH.getActualReceiverHolder();
            InterfaceC736830SvJ<S> interfaceC736830SvJ = assemViewModel.vmDispatcher;
            LifecycleOwner actualLifecycleOwner = interfaceC725030ScH.getActualLifecycleOwnerHolder().getActualLifecycleOwner();
            C736820SvI.LIZ(interfaceC725030ScH, c1770850wBP, assemViewModel.usedInReusedScene, assemViewModel.isHolderVM());
            c0zp4LJJJJ = interfaceC736830SvJ.LJJJJ(actualLifecycleOwner, c1770850wBP, function1, new C736800SvG(), AFwS198S0000000_11.get$arr$(33), new AwS377S0200000_11(actualReceiverHolder, function2, 10));
        } else {
            LifecycleOwner ownLifecycleOwner = interfaceC725030ScH.getOwnLifecycleOwner();
            if (ownLifecycleOwner == null || !assemViewModel.useOwnerLifecycle) {
                ownLifecycleOwner = interfaceC725030ScH.getHostLifecycleOwner();
            }
            InterfaceC736830SvJ<S> interfaceC736830SvJ2 = assemViewModel.vmDispatcher;
            if (ownLifecycleOwner == null) {
                ownLifecycleOwner = interfaceC725030ScH.getActualLifecycleOwnerHolder().getActualLifecycleOwner();
            }
            C736820SvI.LIZ(interfaceC725030ScH, c1770850wBP, false, assemViewModel.isHolderVM());
            c0zp4LJJJJ = interfaceC736830SvJ2.LJJJJ(ownLifecycleOwner, c1770850wBP, function1, LIZJ(interfaceC725030ScH), LIZIZ(interfaceC725030ScH), new AwS377S0200000_11(interfaceC725030ScH, function2, 11));
        }
        C736780SvE c736780SvE2 = C736780SvE.LIZ;
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList2 = C725430Scv.LIZIZ;
            if (arrayList2.size() > 0) {
                Iterator<InterfaceC725440Scw> it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    it3.next().onEventEnd(c736780SvE2);
                }
            }
            if (C725480Sd0.LIZ(c736780SvE2)) {
                C725430Scv.LIZ(new AwS2S1210100_11(c736780SvE2, "default", SystemClock.elapsedRealtimeNanos(), Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread()), assemViewModel, 9));
            }
        }
        return c0zp4LJJJJ;
    }

    public static <RECEIVER extends C03H5, S extends InterfaceC0148002o, A> C0ZP4 LJ(InterfaceC725030ScH<RECEIVER> interfaceC725030ScH, AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super RECEIVER, ? super A, Unit> function2) {
        C0ZP4 c0zp4LJJIJLIJ;
        C736780SvE c736780SvE = C736780SvE.LIZ;
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList = C725430Scv.LIZIZ;
            if (arrayList.size() > 0) {
                Iterator<InterfaceC725440Scw> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().onEventBegin(c736780SvE);
                }
            }
            if (C725480Sd0.LIZ(c736780SvE)) {
                C725430Scv.LIZ(new C723490SZn(c736780SvE, "default", SystemClock.elapsedRealtimeNanos()));
            }
        }
        if (assemViewModel.usedInReusedScene) {
            InterfaceC725050ScJ<RECEIVER> actualReceiverHolder = interfaceC725030ScH.getActualReceiverHolder();
            if (C725080ScM.LIZLLL) {
                try {
                    InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
                    if (interfaceC723720SaA != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("selectSubscribe from ");
                        sbLIZ.append(assemViewModel);
                        sbLIZ.append(", isInit > ");
                        sbLIZ.append(assemViewModel._initialized);
                        sbLIZ.append(", thread: ");
                        sbLIZ.append(C786410Ut5.u3());
                        sbLIZ.append("，isReuse = ");
                        sbLIZ.append(assemViewModel.usedInReusedScene);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        int i = C2187451AjH.LIZ;
                        interfaceC723720SaA.log("assem_vm", strLIZIZ);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            InterfaceC736830SvJ<S> interfaceC736830SvJ = assemViewModel.vmDispatcher;
            LifecycleOwner actualLifecycleOwner = interfaceC725030ScH.getActualLifecycleOwnerHolder().getActualLifecycleOwner();
            C736820SvI.LIZ(interfaceC725030ScH, c1770850wBP, assemViewModel.usedInReusedScene, assemViewModel.isHolderVM());
            c0zp4LJJIJLIJ = interfaceC736830SvJ.LJJIJLIJ(actualLifecycleOwner, interfaceC2217241BqE, c1770850wBP, new C736800SvG(), new C736790SvF(), function1, new C736730Sv9(actualReceiverHolder, function2));
        } else {
            LifecycleOwner ownLifecycleOwner = interfaceC725030ScH.getOwnLifecycleOwner();
            if ((ownLifecycleOwner == null || !assemViewModel.useOwnerLifecycle) && (ownLifecycleOwner = interfaceC725030ScH.getHostLifecycleOwner()) == null) {
                ownLifecycleOwner = interfaceC725030ScH.getActualLifecycleOwnerHolder().getActualLifecycleOwner();
            }
            if (C725080ScM.LIZLLL) {
                try {
                    InterfaceC723720SaA interfaceC723720SaA2 = C725080ScM.LIZIZ;
                    if (interfaceC723720SaA2 != null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("selectSubscribe from ");
                        sbLIZ2.append(assemViewModel);
                        sbLIZ2.append(", isInit > ");
                        sbLIZ2.append(assemViewModel._initialized);
                        sbLIZ2.append(", thread: ");
                        sbLIZ2.append(C786410Ut5.u3());
                        sbLIZ2.append(", isReuse = ");
                        sbLIZ2.append(assemViewModel.usedInReusedScene);
                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                        int i2 = C2187451AjH.LIZ;
                        interfaceC723720SaA2.log("assem_vm", strLIZIZ2);
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
            InterfaceC736830SvJ<S> interfaceC736830SvJ2 = assemViewModel.vmDispatcher;
            C736820SvI.LIZ(interfaceC725030ScH, c1770850wBP, false, assemViewModel.isHolderVM());
            c0zp4LJJIJLIJ = interfaceC736830SvJ2.LJJIJLIJ(ownLifecycleOwner, interfaceC2217241BqE, c1770850wBP, LIZJ(interfaceC725030ScH), LIZIZ(interfaceC725030ScH), function1, new C736720Sv8(interfaceC725030ScH, function2));
        }
        C736780SvE c736780SvE2 = C736780SvE.LIZ;
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList2 = C725430Scv.LIZIZ;
            if (arrayList2.size() > 0) {
                Iterator<InterfaceC725440Scw> it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    it3.next().onEventEnd(c736780SvE2);
                }
            }
            if (C725480Sd0.LIZ(c736780SvE2)) {
                C725430Scv.LIZ(new C736690Sv5(c736780SvE2, "default", SystemClock.elapsedRealtimeNanos(), Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread()), assemViewModel));
            }
        }
        return c0zp4LJJIJLIJ;
    }

    public static /* synthetic */ C0ZP4 LJIIIIZZ(InterfaceC725030ScH interfaceC725030ScH, AssemViewModel assemViewModel, InterfaceC2217241BqE interfaceC2217241BqE, C1770850wBP c1770850wBP, Function2 function2, int i) {
        C1770850wBP c1770850wBPLIZIZ = c1770850wBP;
        if ((i & 2) != 0) {
            c1770850wBPLIZIZ = C736820SvI.LIZIZ(assemViewModel.usedInReusedScene);
        }
        return interfaceC725030ScH.selectSubscribe(assemViewModel, interfaceC2217241BqE, c1770850wBPLIZIZ, null, function2);
    }

    public static <RECEIVER extends C03H5, S extends InterfaceC0148002o, A> C0ZP4 LJIILJJIL(InterfaceC725030ScH<RECEIVER> interfaceC725030ScH, AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super RECEIVER, ? super A, Unit> function2) {
        C0ZP4 c0zp4LJJIJLIJ;
        C736780SvE c736780SvE = C736780SvE.LIZ;
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList = C725430Scv.LIZIZ;
            if (arrayList.size() > 0) {
                Iterator<InterfaceC725440Scw> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().onEventBegin(c736780SvE);
                }
            }
            if (C725480Sd0.LIZ(c736780SvE)) {
                C725430Scv.LIZ(new AwS13S1100100_11(c736780SvE, "default", SystemClock.elapsedRealtimeNanos(), 11));
            }
        }
        if (assemViewModel.usedInReusedScene) {
            InterfaceC725050ScJ<RECEIVER> actualReceiverHolder = interfaceC725030ScH.getActualReceiverHolder();
            InterfaceC736830SvJ<S> interfaceC736830SvJ = assemViewModel.vmDispatcher;
            LifecycleOwner actualLifecycleOwner = interfaceC725030ScH.getActualLifecycleOwnerHolder().getActualLifecycleOwner();
            c1770850wBP.LJFF = true;
            C736820SvI.LIZ(interfaceC725030ScH, c1770850wBP, assemViewModel.usedInReusedScene, assemViewModel.isHolderVM());
            c0zp4LJJIJLIJ = interfaceC736830SvJ.LJJIJLIJ(actualLifecycleOwner, interfaceC2217241BqE, c1770850wBP, new C736800SvG(), new C736790SvF(), function1, new AwS377S0200000_11(actualReceiverHolder, function2, 9));
        } else {
            LifecycleOwner ownLifecycleOwner = interfaceC725030ScH.getOwnLifecycleOwner();
            if (ownLifecycleOwner == null || !assemViewModel.useOwnerLifecycle) {
                ownLifecycleOwner = interfaceC725030ScH.getHostLifecycleOwner();
            }
            InterfaceC736830SvJ<S> interfaceC736830SvJ2 = assemViewModel.vmDispatcher;
            if (ownLifecycleOwner == null) {
                ownLifecycleOwner = interfaceC725030ScH.getActualLifecycleOwnerHolder().getActualLifecycleOwner();
            }
            c1770850wBP.LJFF = true;
            C736820SvI.LIZ(interfaceC725030ScH, c1770850wBP, false, assemViewModel.isHolderVM());
            c0zp4LJJIJLIJ = interfaceC736830SvJ2.LJJIJLIJ(ownLifecycleOwner, interfaceC2217241BqE, c1770850wBP, LIZJ(interfaceC725030ScH), LIZIZ(interfaceC725030ScH), function1, new C736710Sv7(interfaceC725030ScH, function2));
        }
        C736780SvE c736780SvE2 = C736780SvE.LIZ;
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList2 = C725430Scv.LIZIZ;
            if (arrayList2.size() > 0) {
                Iterator<InterfaceC725440Scw> it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    it3.next().onEventEnd(c736780SvE2);
                }
            }
            if (C725480Sd0.LIZ(c736780SvE2)) {
                C725430Scv.LIZ(new AwS2S1210100_11(c736780SvE2, "default", SystemClock.elapsedRealtimeNanos(), Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread()), assemViewModel, 8));
            }
        }
        return c0zp4LJJIJLIJ;
    }

    public static void LJIILL(InterfaceC725030ScH interfaceC725030ScH, AssemViewModel assemViewModel, C2217381BqS c2217381BqS, C1770850wBP c1770850wBP, Function2 function2, int i) {
        C1770850wBP c1770850wBP2 = c1770850wBP;
        if ((i & 2) != 0) {
            CoroutineContext coroutineContext = assemViewModel.getInternalAssemVMScope$assem_release().getCoroutineContext();
            c1770850wBP2 = new C1770850wBP();
            c1770850wBP2.LJ = coroutineContext;
            c1770850wBP2.LJFF = true;
        }
        interfaceC725030ScH.selectSubscribeOnAsync(assemViewModel, c2217381BqS, c1770850wBP2, null, function2);
    }

    public static <RECEIVER extends C03H5, S extends InterfaceC0148002o, T> C0ZP4 LIZ(InterfaceC725030ScH<RECEIVER> interfaceC725030ScH, AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1623806Xk<? extends T>> interfaceC2217241BqE, C1770850wBP<C11H9<AbstractC1623806Xk<T>>> c1770850wBP, Function2<? super RECEIVER, ? super Throwable, Unit> function2, Function1<? super RECEIVER, Unit> function1, Function2<? super RECEIVER, ? super T, Unit> function22) {
        C0ZP4 c0zp4LJJIJLIJ;
        C736780SvE c736780SvE = C736780SvE.LIZ;
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList = C725430Scv.LIZIZ;
            if (arrayList.size() > 0) {
                Iterator<InterfaceC725440Scw> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().onEventBegin(c736780SvE);
                }
            }
            if (C725480Sd0.LIZ(c736780SvE)) {
                C725430Scv.LIZ(new AwS13S1100100_11(c736780SvE, "default", SystemClock.elapsedRealtimeNanos(), 7));
            }
        }
        if (assemViewModel.usedInReusedScene) {
            InterfaceC725050ScJ<RECEIVER> actualReceiverHolder = interfaceC725030ScH.getActualReceiverHolder();
            InterfaceC736830SvJ<S> interfaceC736830SvJ = assemViewModel.vmDispatcher;
            LifecycleOwner actualLifecycleOwner = interfaceC725030ScH.getActualLifecycleOwnerHolder().getActualLifecycleOwner();
            C736820SvI.LIZ(interfaceC725030ScH, c1770850wBP, assemViewModel.usedInReusedScene, assemViewModel.isHolderVM());
            c0zp4LJJIJLIJ = interfaceC736830SvJ.LJJIJLIJ(actualLifecycleOwner, interfaceC2217241BqE, c1770850wBP, new C736800SvG(), new C736790SvF(), null, new AwS109S0400000_11(actualReceiverHolder, function1, function2, function22, 0));
        } else {
            LifecycleOwner ownLifecycleOwner = interfaceC725030ScH.getOwnLifecycleOwner();
            if (ownLifecycleOwner == null || !assemViewModel.useOwnerLifecycle) {
                ownLifecycleOwner = interfaceC725030ScH.getHostLifecycleOwner();
            }
            InterfaceC736830SvJ<S> interfaceC736830SvJ2 = assemViewModel.vmDispatcher;
            if (ownLifecycleOwner == null) {
                ownLifecycleOwner = interfaceC725030ScH.getActualLifecycleOwnerHolder().getActualLifecycleOwner();
            }
            C736820SvI.LIZ(interfaceC725030ScH, c1770850wBP, false, assemViewModel.isHolderVM());
            c0zp4LJJIJLIJ = interfaceC736830SvJ2.LJJIJLIJ(ownLifecycleOwner, interfaceC2217241BqE, c1770850wBP, LIZJ(interfaceC725030ScH), LIZIZ(interfaceC725030ScH), null, new AwS109S0400000_11(interfaceC725030ScH, function1, function2, function22, 1));
        }
        C736780SvE c736780SvE2 = C736780SvE.LIZ;
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList2 = C725430Scv.LIZIZ;
            if (arrayList2.size() > 0) {
                Iterator<InterfaceC725440Scw> it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    it3.next().onEventEnd(c736780SvE2);
                }
            }
            if (C725480Sd0.LIZ(c736780SvE2)) {
                C725430Scv.LIZ(new AwS2S1210100_11(c736780SvE2, "default", SystemClock.elapsedRealtimeNanos(), Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread()), assemViewModel, 4));
            }
        }
        return c0zp4LJJIJLIJ;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static C0ZP4 LIZLLL(AssemViewModel assemViewModel, InterfaceC725030ScH interfaceC725030ScH, C1770850wBP c1770850wBP, Function1 function1, InterfaceC1631620sYq interfaceC1631620sYq, InterfaceC2217241BqE interfaceC2217241BqE, InterfaceC2217241BqE interfaceC2217241BqE2) {
        C0ZP4 c0zp4LJJJ;
        C736780SvE c736780SvE = C736780SvE.LIZ;
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList = C725430Scv.LIZIZ;
            if (arrayList.size() > 0) {
                Iterator<InterfaceC725440Scw> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().onEventBegin(c736780SvE);
                }
            }
            if (C725480Sd0.LIZ(c736780SvE)) {
                C725430Scv.LIZ(new AwS13S1100100_11(c736780SvE, "default", SystemClock.elapsedRealtimeNanos(), 16));
            }
        }
        if (assemViewModel.usedInReusedScene) {
            InterfaceC725050ScJ actualReceiverHolder = interfaceC725030ScH.getActualReceiverHolder();
            InterfaceC736830SvJ<S> interfaceC736830SvJ = assemViewModel.vmDispatcher;
            LifecycleOwner actualLifecycleOwner = interfaceC725030ScH.getActualLifecycleOwnerHolder().getActualLifecycleOwner();
            C736820SvI.LIZ(interfaceC725030ScH, c1770850wBP, assemViewModel.usedInReusedScene, assemViewModel.isHolderVM());
            InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE3 = (InterfaceC2217241BqE<S, ? extends A>) interfaceC2217241BqE;
            InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE4 = (InterfaceC2217241BqE<S, ? extends B>) interfaceC2217241BqE2;
            C1770850wBP<C19474211Gy<A, B>> c1770850wBP2 = (C1770850wBP<C19474211Gy<A, B>>) c1770850wBP;
            c0zp4LJJJ = interfaceC736830SvJ.LJJJ(actualLifecycleOwner, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP2, new C736800SvG(), AFwS198S0000000_11.get$arr$(35), (Function1<? super Throwable, Unit>) function1, new AwS447S0200000_11(actualReceiverHolder, (InterfaceC725050ScJ<C03H5>) interfaceC1631620sYq, (InterfaceC1631620sYq<C03H5, Object, Object, Unit>) 0));
        } else {
            LifecycleOwner ownLifecycleOwner = interfaceC725030ScH.getOwnLifecycleOwner();
            if (ownLifecycleOwner == null || !assemViewModel.useOwnerLifecycle) {
                ownLifecycleOwner = interfaceC725030ScH.getHostLifecycleOwner();
            }
            InterfaceC736830SvJ<S> interfaceC736830SvJ2 = assemViewModel.vmDispatcher;
            if (ownLifecycleOwner == null) {
                ownLifecycleOwner = interfaceC725030ScH.getActualLifecycleOwnerHolder().getActualLifecycleOwner();
            }
            C736820SvI.LIZ(interfaceC725030ScH, c1770850wBP, false, assemViewModel.isHolderVM());
            c0zp4LJJJ = interfaceC736830SvJ2.LJJJ(ownLifecycleOwner, (InterfaceC2217241BqE<S, ? extends A>) interfaceC2217241BqE, (InterfaceC2217241BqE<S, ? extends B>) interfaceC2217241BqE2, (C1770850wBP<C19474211Gy<A, B>>) c1770850wBP, LIZJ(interfaceC725030ScH), LIZIZ(interfaceC725030ScH), (Function1<? super Throwable, Unit>) function1, new C725060ScK(interfaceC725030ScH, interfaceC1631620sYq));
        }
        C736780SvE c736780SvE2 = C736780SvE.LIZ;
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList2 = C725430Scv.LIZIZ;
            if (arrayList2.size() > 0) {
                Iterator<InterfaceC725440Scw> it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    it3.next().onEventEnd(c736780SvE2);
                }
            }
            if (C725480Sd0.LIZ(c736780SvE2)) {
                C725430Scv.LIZ(new AwS2S1210100_11(c736780SvE2, "default", SystemClock.elapsedRealtimeNanos(), Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread()), assemViewModel, 13));
            }
        }
        return c0zp4LJJJ;
    }

    public static /* synthetic */ C0ZP4 LJIIIZ(InterfaceC725030ScH interfaceC725030ScH, AssemViewModel assemViewModel, InterfaceC2217241BqE interfaceC2217241BqE, InterfaceC2217241BqE interfaceC2217241BqE2, C1770850wBP c1770850wBP, InterfaceC1631620sYq interfaceC1631620sYq, int i) {
        C1770850wBP c1770850wBPLIZIZ = c1770850wBP;
        if ((i & 4) != 0) {
            c1770850wBPLIZIZ = C736820SvI.LIZIZ(assemViewModel.usedInReusedScene);
        }
        return interfaceC725030ScH.selectSubscribe(assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1770850wBPLIZIZ, null, interfaceC1631620sYq);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static C0ZP4 LJIILIIL(AssemViewModel assemViewModel, InterfaceC725030ScH interfaceC725030ScH, C1770850wBP c1770850wBP, Function1 function1, InterfaceC1631620sYq interfaceC1631620sYq, InterfaceC2217241BqE interfaceC2217241BqE, InterfaceC2217241BqE interfaceC2217241BqE2) {
        C0ZP4 c0zp4LJJJ;
        C736780SvE c736780SvE = C736780SvE.LIZ;
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList = C725430Scv.LIZIZ;
            if (arrayList.size() > 0) {
                Iterator<InterfaceC725440Scw> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().onEventBegin(c736780SvE);
                }
            }
            if (C725480Sd0.LIZ(c736780SvE)) {
                C725430Scv.LIZ(new AwS13S1100100_11(c736780SvE, "default", SystemClock.elapsedRealtimeNanos(), 17));
            }
        }
        if (assemViewModel.usedInReusedScene) {
            InterfaceC725050ScJ actualReceiverHolder = interfaceC725030ScH.getActualReceiverHolder();
            InterfaceC736830SvJ<S> interfaceC736830SvJ = assemViewModel.vmDispatcher;
            LifecycleOwner actualLifecycleOwner = interfaceC725030ScH.getActualLifecycleOwnerHolder().getActualLifecycleOwner();
            c1770850wBP.LJFF = true;
            C736820SvI.LIZ(interfaceC725030ScH, c1770850wBP, assemViewModel.usedInReusedScene, assemViewModel.isHolderVM());
            InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE3 = (InterfaceC2217241BqE<S, ? extends A>) interfaceC2217241BqE;
            InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE4 = (InterfaceC2217241BqE<S, ? extends B>) interfaceC2217241BqE2;
            C1770850wBP<C19474211Gy<A, B>> c1770850wBP2 = (C1770850wBP<C19474211Gy<A, B>>) c1770850wBP;
            c0zp4LJJJ = interfaceC736830SvJ.LJJJ(actualLifecycleOwner, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP2, new C736800SvG(), AFwS198S0000000_11.get$arr$(35), (Function1<? super Throwable, Unit>) function1, new AwS447S0200000_11(actualReceiverHolder, (InterfaceC725050ScJ<C03H5>) interfaceC1631620sYq, (InterfaceC1631620sYq<C03H5, Object, Object, Unit>) 1));
        } else {
            LifecycleOwner ownLifecycleOwner = interfaceC725030ScH.getOwnLifecycleOwner();
            if (ownLifecycleOwner == null || !assemViewModel.useOwnerLifecycle) {
                ownLifecycleOwner = interfaceC725030ScH.getHostLifecycleOwner();
            }
            InterfaceC736830SvJ<S> interfaceC736830SvJ2 = assemViewModel.vmDispatcher;
            if (ownLifecycleOwner == null) {
                ownLifecycleOwner = interfaceC725030ScH.getActualLifecycleOwnerHolder().getActualLifecycleOwner();
            }
            c1770850wBP.LJFF = true;
            C736820SvI.LIZ(interfaceC725030ScH, c1770850wBP, false, assemViewModel.isHolderVM());
            c0zp4LJJJ = interfaceC736830SvJ2.LJJJ(ownLifecycleOwner, (InterfaceC2217241BqE<S, ? extends A>) interfaceC2217241BqE, (InterfaceC2217241BqE<S, ? extends B>) interfaceC2217241BqE2, (C1770850wBP<C19474211Gy<A, B>>) c1770850wBP, LIZJ(interfaceC725030ScH), LIZIZ(interfaceC725030ScH), (Function1<? super Throwable, Unit>) function1, new AwS447S0200000_11(interfaceC725030ScH, (InterfaceC725030ScH<C03H5>) interfaceC1631620sYq, (InterfaceC1631620sYq<C03H5, Object, Object, Unit>) 2));
        }
        C736780SvE c736780SvE2 = C736780SvE.LIZ;
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList2 = C725430Scv.LIZIZ;
            if (arrayList2.size() > 0) {
                Iterator<InterfaceC725440Scw> it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    it3.next().onEventEnd(c736780SvE2);
                }
            }
            if (C725480Sd0.LIZ(c736780SvE2)) {
                C725430Scv.LIZ(new AwS2S1210100_11(c736780SvE2, "default", SystemClock.elapsedRealtimeNanos(), Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread()), assemViewModel, 14));
            }
        }
        return c0zp4LJJJ;
    }

    public static <RECEIVER extends C03H5, S extends InterfaceC0148002o, A, B, C> C0ZP4 LJFF(InterfaceC725030ScH<RECEIVER> interfaceC725030ScH, AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super RECEIVER, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        C0ZP4 c0zp4LJJIL;
        C736780SvE c736780SvE = C736780SvE.LIZ;
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList = C725430Scv.LIZIZ;
            if (arrayList.size() > 0) {
                Iterator<InterfaceC725440Scw> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().onEventBegin(c736780SvE);
                }
            }
            if (C725480Sd0.LIZ(c736780SvE)) {
                C725430Scv.LIZ(new AwS13S1100100_11(c736780SvE, "default", SystemClock.elapsedRealtimeNanos(), 8));
            }
        }
        if (assemViewModel.usedInReusedScene) {
            InterfaceC725050ScJ<RECEIVER> actualReceiverHolder = interfaceC725030ScH.getActualReceiverHolder();
            InterfaceC736830SvJ<S> interfaceC736830SvJ = assemViewModel.vmDispatcher;
            LifecycleOwner actualLifecycleOwner = interfaceC725030ScH.getActualLifecycleOwnerHolder().getActualLifecycleOwner();
            C736820SvI.LIZ(interfaceC725030ScH, c1770850wBP, assemViewModel.usedInReusedScene, assemViewModel.isHolderVM());
            c0zp4LJJIL = interfaceC736830SvJ.LJJIL(actualLifecycleOwner, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, new C736800SvG(), AFwS198S0000000_11.get$arr$(28), function1, new AwS479S0200000_11(actualReceiverHolder, interfaceC1631630sYr, 0));
        } else {
            LifecycleOwner ownLifecycleOwner = interfaceC725030ScH.getOwnLifecycleOwner();
            if (ownLifecycleOwner == null || !assemViewModel.useOwnerLifecycle) {
                ownLifecycleOwner = interfaceC725030ScH.getHostLifecycleOwner();
            }
            InterfaceC736830SvJ<S> interfaceC736830SvJ2 = assemViewModel.vmDispatcher;
            if (ownLifecycleOwner == null) {
                ownLifecycleOwner = interfaceC725030ScH.getActualLifecycleOwnerHolder().getActualLifecycleOwner();
            }
            C736820SvI.LIZ(interfaceC725030ScH, c1770850wBP, false, assemViewModel.isHolderVM());
            c0zp4LJJIL = interfaceC736830SvJ2.LJJIL(ownLifecycleOwner, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, LIZJ(interfaceC725030ScH), LIZIZ(interfaceC725030ScH), function1, new C736700Sv6(interfaceC725030ScH, interfaceC1631630sYr));
        }
        C736780SvE c736780SvE2 = C736780SvE.LIZ;
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList2 = C725430Scv.LIZIZ;
            if (arrayList2.size() > 0) {
                Iterator<InterfaceC725440Scw> it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    it3.next().onEventEnd(c736780SvE2);
                }
            }
            if (C725480Sd0.LIZ(c736780SvE2)) {
                C725430Scv.LIZ(new AwS2S1210100_11(c736780SvE2, "default", SystemClock.elapsedRealtimeNanos(), Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread()), assemViewModel, 5));
            }
        }
        return c0zp4LJJIL;
    }

    public static <RECEIVER extends C03H5, S extends InterfaceC0148002o, A, B, C, D> C0ZP4 LJI(InterfaceC725030ScH<RECEIVER> interfaceC725030ScH, AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super RECEIVER, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        C0ZP4 c0zp4LJJJIL;
        C736780SvE c736780SvE = C736780SvE.LIZ;
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList = C725430Scv.LIZIZ;
            if (arrayList.size() > 0) {
                Iterator<InterfaceC725440Scw> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().onEventBegin(c736780SvE);
                }
            }
            if (C725480Sd0.LIZ(c736780SvE)) {
                C725430Scv.LIZ(new AwS13S1100100_11(c736780SvE, "default", SystemClock.elapsedRealtimeNanos(), 9));
            }
        }
        if (assemViewModel.usedInReusedScene) {
            InterfaceC725050ScJ<RECEIVER> actualReceiverHolder = interfaceC725030ScH.getActualReceiverHolder();
            InterfaceC736830SvJ<S> interfaceC736830SvJ = assemViewModel.vmDispatcher;
            LifecycleOwner actualLifecycleOwner = interfaceC725030ScH.getActualLifecycleOwnerHolder().getActualLifecycleOwner();
            C736820SvI.LIZ(interfaceC725030ScH, c1770850wBP, assemViewModel.usedInReusedScene, assemViewModel.isHolderVM());
            c0zp4LJJJIL = interfaceC736830SvJ.LJJJIL(actualLifecycleOwner, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, new C736800SvG(), AFwS198S0000000_11.get$arr$(30), function1, new C739030Syr(actualReceiverHolder, interfaceC1685420txc, 0));
        } else {
            LifecycleOwner ownLifecycleOwner = interfaceC725030ScH.getOwnLifecycleOwner();
            if (ownLifecycleOwner == null || !assemViewModel.useOwnerLifecycle) {
                ownLifecycleOwner = interfaceC725030ScH.getHostLifecycleOwner();
            }
            InterfaceC736830SvJ<S> interfaceC736830SvJ2 = assemViewModel.vmDispatcher;
            if (ownLifecycleOwner == null) {
                ownLifecycleOwner = interfaceC725030ScH.getActualLifecycleOwnerHolder().getActualLifecycleOwner();
            }
            C736820SvI.LIZ(interfaceC725030ScH, c1770850wBP, false, assemViewModel.isHolderVM());
            c0zp4LJJJIL = interfaceC736830SvJ2.LJJJIL(ownLifecycleOwner, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, LIZJ(interfaceC725030ScH), LIZIZ(interfaceC725030ScH), function1, new C736740SvA(interfaceC725030ScH, interfaceC1685420txc));
        }
        C736780SvE c736780SvE2 = C736780SvE.LIZ;
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList2 = C725430Scv.LIZIZ;
            if (arrayList2.size() > 0) {
                Iterator<InterfaceC725440Scw> it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    it3.next().onEventEnd(c736780SvE2);
                }
            }
            if (C725480Sd0.LIZ(c736780SvE2)) {
                C725430Scv.LIZ(new AwS2S1210100_11(c736780SvE2, "default", SystemClock.elapsedRealtimeNanos(), Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread()), assemViewModel, 6));
            }
        }
        return c0zp4LJJJIL;
    }

    public static <RECEIVER extends C03H5, S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 LJII(InterfaceC725030ScH<RECEIVER> interfaceC725030ScH, AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super RECEIVER, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        C0ZP4 c0zp4LJJJJJ;
        C736780SvE c736780SvE = C736780SvE.LIZ;
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList = C725430Scv.LIZIZ;
            if (arrayList.size() > 0) {
                Iterator<InterfaceC725440Scw> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().onEventBegin(c736780SvE);
                }
            }
            if (C725480Sd0.LIZ(c736780SvE)) {
                C725430Scv.LIZ(new AwS13S1100100_11(c736780SvE, "default", SystemClock.elapsedRealtimeNanos(), 10));
            }
        }
        if (assemViewModel.usedInReusedScene) {
            InterfaceC725050ScJ<RECEIVER> actualReceiverHolder = interfaceC725030ScH.getActualReceiverHolder();
            InterfaceC736830SvJ<S> interfaceC736830SvJ = assemViewModel.vmDispatcher;
            LifecycleOwner actualLifecycleOwner = interfaceC725030ScH.getActualLifecycleOwnerHolder().getActualLifecycleOwner();
            C736820SvI.LIZ(interfaceC725030ScH, c1770850wBP, assemViewModel.usedInReusedScene, assemViewModel.isHolderVM());
            c0zp4LJJJJJ = interfaceC736830SvJ.LJJJJJ(actualLifecycleOwner, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, new C736800SvG(), AFwS198S0000000_11.get$arr$(32), function1, new C739040Sys(actualReceiverHolder, interfaceC1685430txd, 0));
        } else {
            LifecycleOwner ownLifecycleOwner = interfaceC725030ScH.getOwnLifecycleOwner();
            if (ownLifecycleOwner == null || !assemViewModel.useOwnerLifecycle) {
                ownLifecycleOwner = interfaceC725030ScH.getHostLifecycleOwner();
            }
            InterfaceC736830SvJ<S> interfaceC736830SvJ2 = assemViewModel.vmDispatcher;
            if (ownLifecycleOwner == null) {
                ownLifecycleOwner = interfaceC725030ScH.getActualLifecycleOwnerHolder().getActualLifecycleOwner();
            }
            C736820SvI.LIZ(interfaceC725030ScH, c1770850wBP, false, assemViewModel.isHolderVM());
            c0zp4LJJJJJ = interfaceC736830SvJ2.LJJJJJ(ownLifecycleOwner, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, LIZJ(interfaceC725030ScH), LIZIZ(interfaceC725030ScH), function1, new C739040Sys(interfaceC725030ScH, interfaceC1685430txd, 1));
        }
        C736780SvE c736780SvE2 = C736780SvE.LIZ;
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList2 = C725430Scv.LIZIZ;
            if (arrayList2.size() > 0) {
                Iterator<InterfaceC725440Scw> it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    it3.next().onEventEnd(c736780SvE2);
                }
            }
            if (C725480Sd0.LIZ(c736780SvE2)) {
                C725430Scv.LIZ(new AwS2S1210100_11(c736780SvE2, "default", SystemClock.elapsedRealtimeNanos(), Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread()), assemViewModel, 7));
            }
        }
        return c0zp4LJJJJJ;
    }
}
