package X;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS13S1100100_11;
import kotlin.jvm.internal.AwS2S1210100_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Sx2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C737900Sx2 implements InterfaceC1731706qJ<Object, Object> {
    public Object LL;
    public final /* synthetic */ Function0<C13IQ<Object>> LLILLJJLI;
    public final /* synthetic */ InterfaceC724760Sbq LLILLL;
    public final /* synthetic */ Object LLILZ;
    public final /* synthetic */ Function0<ViewModelProvider.Factory> LLILZIL;
    public final /* synthetic */ Function0<String> LLILZLL;
    public final /* synthetic */ C737960Sx8<Object, Object, Object, Object> LLIZ;
    public final /* synthetic */ Function0<C0RTY> LLIZLLLIL;
    public final /* synthetic */ Function0<C724710Sbl> LLJ;
    public final /* synthetic */ Function0<InterfaceC665370Q7z> LLJI;
    public final /* synthetic */ Function0<InterfaceC736830SvJ<Object>> LLJIJIL;
    public final /* synthetic */ Function1<Object, Object> LLJILJIL;
    public final /* synthetic */ C1637906bB LLJILJILJ;

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.LifecycleOwner, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.0SxQ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.0SxQ, java.lang.Object] */
    public final Object LIZ(C13IQ<Object> c13iq) {
        ViewModelStore viewModelStore;
        ViewModelProvider.Factory defaultViewModelProviderFactory;
        C0RTY c0rtyInvoke;
        C737880Sx0 c737880Sx0 = C737880Sx0.LIZ;
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList = C725430Scv.LIZIZ;
            if (arrayList.size() > 0) {
                Iterator<InterfaceC725440Scw> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().onEventBegin(c737880Sx0);
                }
            }
            if (C725480Sd0.LIZ(c737880Sx0)) {
                C725430Scv.LIZ(new AwS13S1100100_11(c737880Sx0, "default", SystemClock.elapsedRealtimeNanos(), 15));
            }
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this.LLILZ);
        if (fragmentLJI != null) {
            try {
                viewModelStore = fragmentLJI.getViewModelStore();
            } catch (IllegalStateException e) {
                TryCatchGuardChecker.doCheck(e);
                viewModelStore = new ViewModelStore();
                FragmentManager fragmentManager = fragmentLJI.getFragmentManager();
                if (fragmentManager != null) {
                    fragmentManager.LJZL(new C738690SyJ(viewModelStore, 1), false);
                }
            }
            C724710Sbl c724710SblInvoke = null;
            try {
                Function0<ViewModelProvider.Factory> function0 = this.LLILZIL;
                if (function0 == null || (defaultViewModelProviderFactory = function0.invoke()) == null) {
                    defaultViewModelProviderFactory = this.LLILZ.getDefaultViewModelProviderFactory();
                }
                ViewModel viewModel = new ViewModelProvider(viewModelStore, defaultViewModelProviderFactory, C903300Zc8.LIZJ).get(this.LLILZLL.invoke(), C09R7.LIZ(c13iq));
                ?? r9 = this.LLILZ;
                Function0<C0RTY> function02 = this.LLIZLLLIL;
                Function0<C724710Sbl> function03 = this.LLJ;
                Function0<InterfaceC665370Q7z> function04 = this.LLJI;
                Function0<InterfaceC736830SvJ<Object>> function05 = this.LLJIJIL;
                Function1<Object, Object> function1 = this.LLJILJIL;
                AssemViewModel assemViewModel = (AssemViewModel) viewModel;
                if (assemViewModel._initialized) {
                    return assemViewModel;
                }
                assemViewModel.setLifecycleRef(new WeakReference<>(r9.getLifecycle()));
                if (function02 != null) {
                    c0rtyInvoke = function02.invoke();
                } else {
                    c0rtyInvoke = null;
                }
                assemViewModel.hierarchyDataStore = c0rtyInvoke;
                if (function03 != null) {
                    c724710SblInvoke = function03.invoke();
                }
                assemViewModel.hierarchyServiceStore = c724710SblInvoke;
                assemViewModel.injectHierarchyDataVScopeProducer(function04);
                assemViewModel.initialize(function05.invoke(), function1);
                C737880Sx0 c737880Sx02 = C737880Sx0.LIZ;
                if (C725450Scx.LIZJ) {
                    ArrayList<InterfaceC725440Scw> arrayList2 = C725430Scv.LIZIZ;
                    if (arrayList2.size() > 0) {
                        Iterator<InterfaceC725440Scw> it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            it3.next().onEventEnd(c737880Sx02);
                        }
                    }
                    if (C725480Sd0.LIZ(c737880Sx02)) {
                        C725430Scv.LIZ(new AwS2S1210100_11(c737880Sx02, "default", SystemClock.elapsedRealtimeNanos(), Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread()), c13iq, 12));
                    }
                }
                this.LL = assemViewModel;
                return assemViewModel;
            } catch (IllegalStateException e2) {
                TryCatchGuardChecker.doCheck(e2);
                Object obj = this.LL;
                if (this.LLJILJILJ.LIZ && obj != null) {
                    C737880Sx0 c737880Sx03 = C737880Sx0.LIZ;
                    if (C725450Scx.LIZJ) {
                        ArrayList<InterfaceC725440Scw> arrayList3 = C725430Scv.LIZIZ;
                        if (arrayList3.size() > 0) {
                            Iterator<InterfaceC725440Scw> it4 = arrayList3.iterator();
                            while (it4.hasNext()) {
                                it4.next().onEventEnd(c737880Sx03);
                            }
                        }
                        if (C725480Sd0.LIZ(c737880Sx03)) {
                            C725430Scv.LIZ(new AwS2S1210100_11(c737880Sx03, "default", SystemClock.elapsedRealtimeNanos(), Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread()), c13iq, 11));
                        }
                    }
                    return obj;
                }
                throw new C738120SxO("Can't access AssemViewModel with VMScope.Fragment after the nearest fragment is destroy of this Assem.You can set createViewModelDirectly = true when create this VM.");
            }
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.0SxQ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.0SxQ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.0SxQ, java.lang.Object] */
    @Override // X.InterfaceC1731706qJ
    public final Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
        C19EG c19egLJ;
        ViewModelProvider.Factory defaultViewModelProviderFactory;
        C0RTY c0rtyInvoke;
        C13IQ<Object> c13iqInvoke = this.LLILLJJLI.invoke();
        InterfaceC724760Sbq interfaceC724760Sbq = this.LLILLL;
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            C737880Sx0 c737880Sx0 = C737880Sx0.LIZ;
            if (C725450Scx.LIZJ) {
                ArrayList<InterfaceC725440Scw> arrayList = C725430Scv.LIZIZ;
                if (arrayList.size() > 0) {
                    Iterator<InterfaceC725440Scw> it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        it2.next().onEventBegin(c737880Sx0);
                    }
                }
                if (C725480Sd0.LIZ(c737880Sx0)) {
                    C725430Scv.LIZ(new C738080SxK(c737880Sx0, "default", SystemClock.elapsedRealtimeNanos()));
                }
            }
            Context context = this.LLILZ.getContext();
            C724710Sbl c724710SblInvoke = null;
            if (context != null && (c19egLJ = C737910Sx3.LJ(context)) != null) {
                ViewModelStore viewModelStore = c19egLJ.getViewModelStore();
                Function0<ViewModelProvider.Factory> function0 = this.LLILZIL;
                if (function0 == null || (defaultViewModelProviderFactory = function0.invoke()) == null) {
                    defaultViewModelProviderFactory = this.LLILZ.getDefaultViewModelProviderFactory();
                }
                ViewModel viewModel = new ViewModelProvider(viewModelStore, defaultViewModelProviderFactory, C903300Zc8.LIZJ).get(this.LLILZLL.invoke(), C09R7.LIZ(c13iqInvoke));
                ?? r9 = this.LLILZ;
                Function0<C0RTY> function02 = this.LLIZLLLIL;
                Function0<C724710Sbl> function03 = this.LLJ;
                Function0<InterfaceC665370Q7z> function04 = this.LLJI;
                Function0<InterfaceC736830SvJ<Object>> function05 = this.LLJIJIL;
                Function1<Object, Object> function1 = this.LLJILJIL;
                AssemViewModel assemViewModel = (AssemViewModel) viewModel;
                if (!assemViewModel._initialized) {
                    assemViewModel.setLifecycleRef(new WeakReference<>(r9.getLifecycle()));
                    if (function02 != null) {
                        c0rtyInvoke = function02.invoke();
                    } else {
                        c0rtyInvoke = null;
                    }
                    assemViewModel.hierarchyDataStore = c0rtyInvoke;
                    if (function03 != null) {
                        c724710SblInvoke = function03.invoke();
                    }
                    assemViewModel.hierarchyServiceStore = c724710SblInvoke;
                    assemViewModel.injectHierarchyDataVScopeProducer(function04);
                    assemViewModel.initialize(function05.invoke(), function1);
                    C737880Sx0 c737880Sx02 = C737880Sx0.LIZ;
                    if (C725450Scx.LIZJ) {
                        ArrayList<InterfaceC725440Scw> arrayList2 = C725430Scv.LIZIZ;
                        if (arrayList2.size() > 0) {
                            Iterator<InterfaceC725440Scw> it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                it3.next().onEventEnd(c737880Sx02);
                            }
                        }
                        if (C725480Sd0.LIZ(c737880Sx02)) {
                            C725430Scv.LIZ(new C737890Sx1(c737880Sx02, "default", SystemClock.elapsedRealtimeNanos(), Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread()), c13iqInvoke));
                        }
                    }
                }
                return assemViewModel;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        if (Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
            return LIZ(c13iqInvoke);
        }
        if (!Intrinsics.LJFF(interfaceC724760Sbq, C0RP1.LIZ) && !Intrinsics.LJFF(interfaceC724760Sbq, C0HHT.LIZ) && interfaceC724760Sbq != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Don't support this VMScope: ");
            sbLIZ.append(this.LLILLL);
            sbLIZ.append(" there");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        return this.LLIZ.LIZ();
    }

    public C737900Sx2(Function0 function0, InterfaceC724760Sbq interfaceC724760Sbq, ReusedAssem reusedAssem, Function0 function02, Function0 function03, C737960Sx8 c737960Sx8, C451660HnQ c451660HnQ, C723690Sa7 c723690Sa7, C738100SxM c738100SxM, C452080Ho6 c452080Ho6, Function1 function1, C1637906bB c1637906bB) {
        this.LLILLJJLI = function0;
        this.LLILLL = interfaceC724760Sbq;
        this.LLILZ = reusedAssem;
        this.LLILZIL = function02;
        this.LLILZLL = function03;
        this.LLIZ = c737960Sx8;
        this.LLIZLLLIL = c451660HnQ;
        this.LLJ = c723690Sa7;
        this.LLJI = c738100SxM;
        this.LLJIJIL = c452080Ho6;
        this.LLJILJIL = function1;
        this.LLJILJILJ = c1637906bB;
    }
}
