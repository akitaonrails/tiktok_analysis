package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: renamed from: X.0SxQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC738140SxQ extends C1558450qep implements LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, InterfaceC1188704kv {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] $$delegatedProperties;
    public static final C738390Sxp Companion;
    public static boolean forceTrack;
    public C0RUV<? extends AbstractC738140SxQ> _config;
    public Class<?>[] abilities;
    public volatile boolean active;
    public AssemSupervisor assemSupervisorVar;
    public String assemTagInternal;
    public final ViewModelProvider.Factory defaultViewModelProviderFactory;
    public final C01GW destroyTask$delegate;
    public boolean hasLoaded;
    public AbstractC738410Sxr interactor;
    public boolean isAssemViewCreated;
    public final C01GW isHitTrack$delegate;
    public final boolean isOnParentSetEmpty;
    public final boolean isOnPauseEmpty;
    public final boolean isOnResumeEmpty;
    public final boolean isOnStartEmpty;
    public final boolean isOnStopEmpty;
    public boolean isParentInit;
    public final LifecycleRegistry lifecycleRegistry;
    public final List<Runnable> onParentAttachTasks;
    public final InterfaceC608270NtR parent$delegate;
    public final C01GW preloader$delegate;
    public AssemSupervisor supervisor;
    public Class<Object> targetScope;
    public final C738500Sy0 uiThreadTaskExecutor;
    public final C01GW vAssemScope$delegate;
    public final C01GW viewModelStore$delegate;
    public final Map<C13IQ<? extends AssemViewModel<?>>, C13IQ<? extends AssemViewModel<?>>> vmMapping;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Sxp] */
    static {
        C2217371BqR c2217371BqR = new C2217371BqR(AbstractC738140SxQ.class, "parent", "getParent()Landroidx/lifecycle/LifecycleOwner;", 0);
        C13LE.LIZ.getClass();
        $$delegatedProperties = new InterfaceC2217461Bqa[]{c2217371BqR};
        Companion = new Object() { // from class: X.0Sxp
        };
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getActive$assem_release$annotations() {
    }

    public static /* synthetic */ void getAssemTagInternal$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getInteractor$annotations() {
    }

    public static /* synthetic */ void getVAssemScope$annotations() {
    }

    public void didUpdateConfig(C0RUV<? extends AbstractC738140SxQ> c0ruv) {
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final /* synthetic */ AbstractC903280Zc6 getDefaultViewModelCreationExtras() {
        return C738350Sxl.LIZ(this);
    }

    @Override // X.C1558450qep, X.InterfaceC665370Q7z
    public Object getHost() {
        return this;
    }

    public boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return true;
    }

    public boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return true;
    }

    public boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return true;
    }

    public boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return true;
    }

    public boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return true;
    }

    public boolean isOverrideOnDestroyAsync() {
        return true;
    }

    public boolean isOverrideOnPauseAsync() {
        return true;
    }

    public boolean isOverrideOnResumeAsync() {
        return true;
    }

    public boolean isOverrideOnStartAsync() {
        return true;
    }

    public boolean isOverrideOnStopAsync() {
        return true;
    }

    public boolean isOverrideOnViewCreatedAsync() {
        return true;
    }

    public void onCreate() {
    }

    public void onParentSet() {
    }

    public void onParentViewCreated() {
    }

    public void onPause() {
    }

    public void onResume() {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public AbstractC738140SxQ() {
        super("assem_logic_scope", null);
        this.preloader$delegate = C452501pT.LIZIZ(new C738370Sxn(this));
        this.isHitTrack$delegate = C452501pT.LIZIZ(new C725400Scs(this));
        this.destroyTask$delegate = C452501pT.LIZIZ(new C612930O2h());
        this.vmMapping = new HashMap();
        this.interactor = C738430Sxt.LIZ;
        this.vAssemScope$delegate = C452501pT.LIZIZ(new C738330Sxj(this));
        this.active = true;
        this.lifecycleRegistry = new LifecycleRegistry(this);
        this.viewModelStore$delegate = C452501pT.LIZIZ(new C738340Sxk());
        this.onParentAttachTasks = new ArrayList();
        this.parent$delegate = new C738440Sxu(this);
        this.defaultViewModelProviderFactory = new ViewModelProvider.NewInstanceFactory();
        this.uiThreadTaskExecutor = new C738500Sy0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final InterfaceC738310Sxh asAsyncLifecycle() {
        if (this instanceof InterfaceC738310Sxh) {
            return (InterfaceC738310Sxh) this;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void clearAbility() {
        InterfaceC737790Swr interfaceC737790Swr;
        if (!(this instanceof InterfaceC737790Swr) || (interfaceC737790Swr = (InterfaceC737790Swr) this) == null) {
            return;
        }
        interfaceC737790Swr.be(getVAssemScope());
    }

    private final void preloadAbility() {
        InterfaceC738300Sxg interfaceC738300Sxg;
        if (C725080ScM.LJJIII && (interfaceC738300Sxg = C725080ScM.LJJII) != null) {
            setAbilities(interfaceC738300Sxg.LIZIZ(getClass()));
            setTargetScope(interfaceC738300Sxg.LIZ(getClass()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void attachAbility() {
        InterfaceC737790Swr interfaceC737790Swr;
        InterfaceC1146704e9 interfaceC1146704e9;
        if ((this instanceof InterfaceC1146704e9) && (interfaceC1146704e9 = (InterfaceC1146704e9) this) != null) {
            interfaceC1146704e9.checkParentScope();
        }
        if (!(this instanceof InterfaceC737790Swr) || (interfaceC737790Swr = (InterfaceC737790Swr) this) == null) {
            return;
        }
        interfaceC737790Swr.pQ(getVAssemScope());
    }

    public final boolean checkSupervisorPrepared() {
        return this.supervisor != null;
    }

    public final AssemSupervisor getAssemSupervisor() {
        AssemSupervisor assemSupervisor = this.assemSupervisorVar;
        if (assemSupervisor != null) {
            return assemSupervisor;
        }
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        this.assemSupervisorVar = assemSupervisorLJ;
        return assemSupervisorLJ;
    }

    public final List<AbstractC738140SxQ> getChildren() {
        AssemSupervisor assemSupervisorLJ;
        if (C725080ScM.LJIIIIZZ) {
            assemSupervisorLJ = getAssemSupervisor();
            if (assemSupervisorLJ == null) {
                return null;
            }
        } else {
            assemSupervisorLJ = C724240Sb0.LJ(this);
            if (assemSupervisorLJ == null) {
                return null;
            }
        }
        return assemSupervisorLJ.LLJILLL;
    }

    public C0RUV<? extends AbstractC738140SxQ> getConfig() {
        C0RUV<? extends AbstractC738140SxQ> c0ruv = this._config;
        if (c0ruv == null) {
            return null;
        }
        return c0ruv;
    }

    public final List<Runnable> getDestroyTask() {
        return (List) this.destroyTask$delegate.getValue();
    }

    public final boolean getHasChildren() {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList = null;
        if (C725080ScM.LJIIIIZZ) {
            AssemSupervisor assemSupervisor = getAssemSupervisor();
            if (assemSupervisor != null) {
                copyOnWriteArrayList = assemSupervisor.LLJILLL;
            }
        } else {
            AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
            if (assemSupervisorLJ != null) {
                copyOnWriteArrayList = assemSupervisorLJ.LLJILLL;
            }
        }
        return (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) ? false : true;
    }

    public final LifecycleOwner getParent() {
        return (LifecycleOwner) this.parent$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public final AbstractC724890Sc3 getPreloader$assem_release() {
        return (AbstractC724890Sc3) this.preloader$delegate.getValue();
    }

    public final AssemSupervisor getSupervisor() {
        AssemSupervisor assemSupervisor = this.supervisor;
        if (assemSupervisor != null) {
            return assemSupervisor;
        }
        return null;
    }

    public final InterfaceC665370Q7z getVAssemScope() {
        return (InterfaceC665370Q7z) this.vAssemScope$delegate.getValue();
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public ViewModelStore getViewModelStore() {
        return (ViewModelStore) this.viewModelStore$delegate.getValue();
    }

    public final void handleOnCreate$assem_release() {
        InterfaceC724700Sbk interfaceC724700Sbk = C725080ScM.LIZJ;
        if (interfaceC724700Sbk != null) {
            interfaceC724700Sbk.LIZ();
        }
        track$assem_release(EnumC738160SxS.ON_CREATE, new C738210SxX(this));
        InterfaceC724700Sbk interfaceC724700Sbk2 = C725080ScM.LIZJ;
        if (interfaceC724700Sbk2 != null) {
            interfaceC724700Sbk2.end(getClass().getSimpleName(), "assem_oncreate_");
        }
    }

    public void handleOnDestroy$assem_release() {
        track$assem_release(EnumC738160SxS.ON_DESTROY, new AwS555S0100000_11(this, 47));
    }

    public void handleOnPause$assem_release() {
        if (!C725080ScM.LJI || !get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem()) {
            track$assem_release(EnumC738160SxS.ON_PAUSE, new AwS555S0100000_11(this, 48));
            return;
        }
        InterfaceC738360Sxm<Object, Unit> interfaceC738360Sxm = new InterfaceC738360Sxm() { // from class: X.0Sdx
            @Override // X.InterfaceC738360Sxm
            public final Unit apply(Object obj) {
                this.LIZ.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
                return Unit.LIZ;
            }
        };
        if (isOverrideOnPauseAsync()) {
            asyncLifecycle$assem_release(interfaceC738360Sxm, AFwS243S0000000_11.get$arr$(15));
        } else {
            asyncLifecycle$assem_release(interfaceC738360Sxm, null);
        }
    }

    public void handleOnResume() {
        if (C725080ScM.LJI && get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem()) {
            InterfaceC738360Sxm<Object, Unit> interfaceC738360Sxm = new InterfaceC738360Sxm() { // from class: X.0Sdv
                @Override // X.InterfaceC738360Sxm
                public final Unit apply(Object obj) {
                    this.LIZ.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
                    return Unit.LIZ;
                }
            };
            if (isOverrideOnResumeAsync()) {
                asyncLifecycle$assem_release(interfaceC738360Sxm, new C738270Sxd());
                return;
            } else {
                asyncLifecycle$assem_release(interfaceC738360Sxm, null);
                return;
            }
        }
        InterfaceC724700Sbk interfaceC724700Sbk = C725080ScM.LIZJ;
        if (interfaceC724700Sbk != null) {
            interfaceC724700Sbk.LIZ();
        }
        track$assem_release(EnumC738160SxS.ON_RESUME, new C738190SxV(this));
        InterfaceC724700Sbk interfaceC724700Sbk2 = C725080ScM.LIZJ;
        if (interfaceC724700Sbk2 != null) {
            interfaceC724700Sbk2.end(getClass().getSimpleName(), "assem_onresume_");
        }
    }

    public void handleOnStart$assem_release() {
        if (C725080ScM.LJI && get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem()) {
            this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_START);
            return;
        }
        InterfaceC724700Sbk interfaceC724700Sbk = C725080ScM.LIZJ;
        if (interfaceC724700Sbk != null) {
            interfaceC724700Sbk.LIZ();
        }
        track$assem_release(EnumC738160SxS.ON_START, new C738200SxW(this));
        InterfaceC724700Sbk interfaceC724700Sbk2 = C725080ScM.LIZJ;
        if (interfaceC724700Sbk2 != null) {
            interfaceC724700Sbk2.end(getClass().getSimpleName(), "assem_onstart_");
        }
    }

    public void handleOnStop$assem_release() {
        if (!C725080ScM.LJI || !get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem()) {
            track$assem_release(EnumC738160SxS.ON_STOP, new AwS555S0100000_11(this, 49));
            return;
        }
        InterfaceC738360Sxm<Object, Unit> interfaceC738360Sxm = new InterfaceC738360Sxm() { // from class: X.0Sdy
            @Override // X.InterfaceC738360Sxm
            public final Unit apply(Object obj) {
                this.LIZ.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
                return Unit.LIZ;
            }
        };
        if (isOverrideOnStopAsync()) {
            asyncLifecycle$assem_release(interfaceC738360Sxm, AFwS243S0000000_11.get$arr$(16));
        } else {
            asyncLifecycle$assem_release(interfaceC738360Sxm, null);
        }
    }

    public boolean isHitTrack() {
        return ((Boolean) this.isHitTrack$delegate.getValue()).booleanValue();
    }

    public void onDestroy() {
        C723850SaN.LJI(new AwS548S0100000_4(this, 35));
    }

    public final void runOnParentAttachTasks() {
        List<Runnable> list = this.onParentAttachTasks;
        if (list.isEmpty()) {
            return;
        }
        Iterator<Runnable> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().run();
        }
        list.clear();
    }

    public final void attachPreload() {
        AbstractC724890Sc3 preloader$assem_release = getPreloader$assem_release();
        preloader$assem_release.getClass();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            throw new C738130SxP("Can not attach preloader before assem is not attach to its parent.");
        }
        Assembler assemblerLIZ = C0RPA.LIZ(c19egLIZ);
        AssemSupervisor assemSupervisorCQ2 = assemblerLIZ.CQ2(this);
        if (assemSupervisorCQ2 == null) {
            C723850SaN.LIZJ(this, AFwS243S0000000_11.get$arr$(761));
            assemSupervisorCQ2 = assemblerLIZ.CQ2(this);
            if (assemSupervisorCQ2 == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        preloader$assem_release.LIZLLL(this, assemblerLIZ, assemSupervisorCQ2, null);
    }

    public final Boolean checkParentPrepared() {
        Object c098200Yq;
        try {
            c098200Yq = Boolean.valueOf(getParent() != null);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool == null) {
            return null;
        }
        bool.booleanValue();
        return Boolean.FALSE;
    }

    public final void clear$assem_release() {
        getViewModelStore().clear();
        C1554890qZ5 c1554890qZ5 = this.lazyVScopeTree;
        if (c1554890qZ5 != null) {
            c1554890qZ5.LJFF();
        }
        clearAbility();
    }

    public final Context getContext() {
        return getSupervisor().LLJIJIL;
    }

    public void handleOnParentViewCreated$assem_release() {
        onParentViewCreated();
        setAssemViewCreated$assem_release(true);
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null) {
            Iterator<AbstractC738140SxQ> it2 = assemSupervisorLJ.LIZLLL().iterator();
            while (it2.hasNext()) {
                it2.next().handleOnParentViewCreated$assem_release();
            }
            assemSupervisorLJ.LLJILJILJ = true;
        }
    }

    public final boolean isDestroy$assem_release() {
        return getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED;
    }

    public void onAssemPostCreate() {
        if (getSupervisor().LLJILJILJ) {
            handleOnParentViewCreated$assem_release();
        }
    }

    public final void preload() {
        getPreloader$assem_release().LJIIIZ();
    }

    private final boolean isAsyncLifecycle() {
        return this instanceof InterfaceC738310Sxh;
    }

    @Override // X.InterfaceC1188704kv
    public Class<?>[] getAbilities() {
        return this.abilities;
    }

    public final boolean getActive$assem_release() {
        return this.active;
    }

    public final String getAssemTag() {
        return this.assemTagInternal;
    }

    public final String getAssemTagInternal() {
        return this.assemTagInternal;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return this.defaultViewModelProviderFactory;
    }

    public final boolean getHasLoaded$assem_release() {
        return this.hasLoaded;
    }

    public final AbstractC738410Sxr getInteractor() {
        return this.interactor;
    }

    public final LifecycleRegistry getLifecycleRegistry$assem_release() {
        return this.lifecycleRegistry;
    }

    public Class<Object> getTargetScope() {
        return this.targetScope;
    }

    public final Map<C13IQ<? extends AssemViewModel<?>>, C13IQ<? extends AssemViewModel<?>>> getVmMapping$assem_release() {
        return this.vmMapping;
    }

    public boolean isAssemViewCreated$assem_release() {
        return this.isAssemViewCreated;
    }

    public final boolean isParentInit$assem_release() {
        return this.isParentInit;
    }

    public Object provideDynamicComponent() {
        return this.interactor;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public LifecycleRegistry getLifecycle() {
        return this.lifecycleRegistry;
    }

    private final void asyncOnDestroy(InterfaceC738360Sxm<Object, Unit> interfaceC738360Sxm) {
        if (isOverrideOnDestroyAsync()) {
            asyncLifecycle$assem_release(interfaceC738360Sxm, AFwS243S0000000_11.get$arr$(14));
        } else {
            asyncLifecycle$assem_release(interfaceC738360Sxm, null);
        }
    }

    private final void asyncOnPause(InterfaceC738360Sxm<Object, Unit> interfaceC738360Sxm) {
        if (isOverrideOnPauseAsync()) {
            asyncLifecycle$assem_release(interfaceC738360Sxm, AFwS243S0000000_11.get$arr$(15));
        } else {
            asyncLifecycle$assem_release(interfaceC738360Sxm, null);
        }
    }

    private final void asyncOnResume(InterfaceC738360Sxm<Object, Unit> interfaceC738360Sxm) {
        if (isOverrideOnResumeAsync()) {
            asyncLifecycle$assem_release(interfaceC738360Sxm, new C738270Sxd());
        } else {
            asyncLifecycle$assem_release(interfaceC738360Sxm, null);
        }
    }

    private final void asyncOnStart(InterfaceC738360Sxm<Object, Unit> interfaceC738360Sxm) {
        if (isOverrideOnStartAsync()) {
            asyncLifecycle$assem_release(interfaceC738360Sxm, new C738280Sxe());
        } else {
            asyncLifecycle$assem_release(interfaceC738360Sxm, null);
        }
    }

    private final void asyncOnStop(InterfaceC738360Sxm<Object, Unit> interfaceC738360Sxm) {
        if (isOverrideOnStopAsync()) {
            asyncLifecycle$assem_release(interfaceC738360Sxm, AFwS243S0000000_11.get$arr$(16));
        } else {
            asyncLifecycle$assem_release(interfaceC738360Sxm, null);
        }
    }

    public final void addonParentAttachTasks$assem_release(Runnable runnable) {
        if (this.isParentInit) {
            runnable.run();
        } else {
            this.onParentAttachTasks.add(runnable);
        }
    }

    public void onPreload(boolean z) {
        if (z) {
            preloadAbility();
        }
    }

    public void setAbilities(Class<?>[] clsArr) {
        this.abilities = clsArr;
    }

    public final void setActive$assem_release(boolean z) {
        this.active = z;
    }

    public final void setAssemTagInternal(String str) {
        this.assemTagInternal = str;
    }

    public void setAssemViewCreated$assem_release(boolean z) {
        this.isAssemViewCreated = z;
    }

    public void setConfig(C0RUV<? extends AbstractC738140SxQ> c0ruv) {
        this._config = c0ruv;
    }

    public final void setHasLoaded$assem_release(boolean z) {
        this.hasLoaded = z;
    }

    public final void setInteractor(AbstractC738410Sxr abstractC738410Sxr) {
        this.interactor = abstractC738410Sxr;
    }

    public final void setParent(LifecycleOwner lifecycleOwner) {
        this.parent$delegate.setValue(this, $$delegatedProperties[0], lifecycleOwner);
    }

    public final void setParentInit$assem_release(boolean z) {
        this.isParentInit = z;
    }

    public final void setSupervisor(AssemSupervisor assemSupervisor) {
        this.supervisor = assemSupervisor;
    }

    public void setTargetScope(Class<Object> cls) {
        this.targetScope = cls;
    }

    public final void uiThreadOnCreate$assem_release(InterfaceC738360Sxm<Object, Unit> interfaceC738360Sxm) {
        this.uiThreadTaskExecutor.LIZ(new C738490Sxz(this, interfaceC738360Sxm, null));
    }

    public final void whenDestroy$assem_release(Runnable runnable) {
        List<Runnable> destroyTask = getDestroyTask();
        synchronized (destroyTask) {
            try {
                destroyTask.add(runnable);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void asyncLifecycle$assem_release(InterfaceC738360Sxm<Object, Unit> interfaceC738360Sxm, Function1<? super InterfaceC738310Sxh, ? extends Object> function1) {
        if (!(this instanceof InterfaceC738310Sxh)) {
            interfaceC738360Sxm.apply(null);
        } else {
            this.uiThreadTaskExecutor.LIZ(new C738490Sxz(this, interfaceC738360Sxm, function1));
        }
    }

    public final void asyncOnViewCreated$assem_release(View view, InterfaceC738360Sxm<Object, Unit> interfaceC738360Sxm) {
        if (isOverrideOnViewCreatedAsync()) {
            asyncLifecycle$assem_release(interfaceC738360Sxm, new C738290Sxf(view));
        } else {
            asyncLifecycle$assem_release(interfaceC738360Sxm, null);
        }
    }

    public final void subscribeChildAssemState(Assembler assembler, InterfaceC724070Saj interfaceC724070Saj) {
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null) {
            ((List) assemSupervisorLJ.LLILLL.getValue()).add(interfaceC724070Saj);
        }
    }

    public final void track$assem_release(EnumC738160SxS enumC738160SxS, Function0<Unit> function0) {
        if (!isHitTrack() && !forceTrack) {
            function0.invoke();
        } else {
            C725430Scv.LIZLLL(C738570Sy7.LIZ, new C738510Sy1(this, enumC738160SxS), function0);
        }
    }
}
