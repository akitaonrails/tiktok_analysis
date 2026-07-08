package androidx.lifecycle;

import X.AbstractC1563340qmi;
import X.C1565730qqZ;
import X.C199Y;
import X.C2188811AlT;
import X.C903300Zc8;
import X.EnumC682280QpW;
import X.InterfaceC1294060jmO;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class SharedViewModelProvider extends ViewModelProvider {
    public HashMap<String, Set<Lifecycle>> map;
    public ViewModelStore store;
    public static final Companion Companion = new Companion();
    public static final ViewModelStore globalStore = new ViewModelStore();
    public static final HashMap<String, Set<Lifecycle>> globalMap = new HashMap<>();

    public static final class Companion {
    }

    public final ViewModel get(Lifecycle lifecycle, String str, Class cls) {
        return androidx_lifecycle_SharedViewModelProvider_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_get(this, lifecycle, str, cls);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SharedViewModelProvider(ViewModelProvider.Factory factory) {
        ViewModelStore viewModelStore = globalStore;
        super(viewModelStore, factory, C903300Zc8.LIZJ);
        this.store = viewModelStore;
        this.map = globalMap;
    }

    @Override // androidx.lifecycle.ViewModelProvider
    @InterfaceC1294060jmO
    public <T extends ViewModel> T get(Class<T> cls) throws IllegalAccessException {
        throw new IllegalAccessException("Unsupport get viewmodel without lifecycle, please use method get(Lifecycle,Class) or get(Lifecycle,String,Class) instead");
    }

    public static final class ClearUselessViewModelObserver implements LifecycleEventObserver {
        public final String key;
        public final Lifecycle lifecycle;
        public final HashMap<String, Set<Lifecycle>> map;
        public final ViewModelStore store;

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                Set<Lifecycle> linkedHashSet = this.map.get(this.key);
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet<>();
                }
                Set<Lifecycle> set = linkedHashSet;
                set.remove(this.lifecycle);
                ViewModel viewModel = this.store.get(this.key);
                if (SharedVMInjector.INSTANCE.getOptimiseVMLifecycleCounter()) {
                    Set setKeys = this.store.keys();
                    ArrayList<String> arrayList = new ArrayList();
                    for (Object obj : setKeys) {
                        if (Intrinsics.LJFF(this.store.get((String) obj), viewModel)) {
                            arrayList.add(obj);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Set<Lifecycle> set2 = this.map.get(it2.next());
                        if (set2 != null) {
                            arrayList2.add(set2);
                        }
                    }
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        ((Set) it3.next()).remove(this.lifecycle);
                    }
                    if (!arrayList2.isEmpty()) {
                        Iterator it4 = arrayList2.iterator();
                        while (it4.hasNext()) {
                            if (!((Set) it4.next()).isEmpty()) {
                                return;
                            }
                        }
                    }
                    for (String str : arrayList) {
                        this.store.put(str, FakeViewModel.INSTANCE);
                        this.map.remove(str);
                    }
                    return;
                }
                if (set.isEmpty()) {
                    this.store.put(this.key, FakeViewModel.INSTANCE);
                    this.map.remove(this.key);
                }
            }
        }

        public ClearUselessViewModelObserver(Lifecycle lifecycle, String str, ViewModelStore viewModelStore, HashMap<String, Set<Lifecycle>> map) {
            this.lifecycle = lifecycle;
            this.key = str;
            this.store = viewModelStore;
            this.map = map;
        }
    }

    public final <T extends ViewModel> T get(Lifecycle lifecycle, Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("androidx.lifecycle.ViewModelProvider.DefaultKey:");
            sbLIZ.append(canonicalName);
            return (T) get(lifecycle, C2188811AlT.LIZIZ(sbLIZ), cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.ViewModelProvider
    public <T extends ViewModel> T get(String str, Class<T> cls) throws IllegalAccessException {
        throw new IllegalAccessException("Unsupport get viewmodel without lifecycle, please use method get(Lifecycle,Class) or get(Lifecycle,String,Class) instead");
    }

    public SharedViewModelProvider(ViewModelStore viewModelStore, HashMap<String, Set<Lifecycle>> map, ViewModelProvider.Factory factory) {
        super(viewModelStore, factory, C903300Zc8.LIZJ);
        this.store = viewModelStore;
        this.map = map;
    }

    public final <T extends ViewModel> T androidx_lifecycle_SharedViewModelProvider__get$___twin___(Lifecycle lifecycle, String str, Class<T> cls) {
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            try {
                return cls.newInstance();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return (T) super.get(str, cls);
            }
        }
        T t = (T) super.get(str, cls);
        Set<Lifecycle> linkedHashSet = this.map.get(str);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet<>();
        }
        Set<Lifecycle> set = linkedHashSet;
        this.map.put(str, set);
        if (!set.contains(lifecycle)) {
            set.add(lifecycle);
            lifecycle.addObserver(new ClearUselessViewModelObserver(lifecycle, str, this.store, this.map));
        }
        if (SharedVMInjector.INSTANCE.getOptimiseVMLifecycleCounter()) {
            Set setKeys = this.store.keys();
            ArrayList arrayList = new ArrayList();
            for (Object obj : setKeys) {
                if (Intrinsics.LJFF(this.store.get((String) obj), t)) {
                    arrayList.add(obj);
                }
            }
            ArrayList<Set> arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Set<Lifecycle> set2 = this.map.get(it2.next());
                if (set2 != null) {
                    arrayList2.add(set2);
                }
            }
            for (Set set3 : arrayList2) {
                if (!set3.contains(lifecycle)) {
                    set3.add(lifecycle);
                }
            }
        }
        return t;
    }

    public static ViewModel androidx_lifecycle_SharedViewModelProvider_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_get(SharedViewModelProvider sharedViewModelProvider, Lifecycle lifecycle, String str, Class cls) {
        if (lifecycle instanceof AbstractC1563340qmi) {
            AbstractC1563340qmi abstractC1563340qmi = (AbstractC1563340qmi) lifecycle;
            EnumC682280QpW enumC682280QpW = EnumC682280QpW.MAIN;
            if (abstractC1563340qmi.LJI(enumC682280QpW)) {
                Object obj = abstractC1563340qmi.LL;
                if (obj instanceof C199Y) {
                    Integer numLIZ = C1565730qqZ.LIZ(enumC682280QpW.getValue(), (Context) obj);
                    if (numLIZ != null) {
                        ViewModel viewModelAndroidx_lifecycle_SharedViewModelProvider__get$___twin___ = sharedViewModelProvider.androidx_lifecycle_SharedViewModelProvider__get$___twin___(lifecycle, str, cls);
                        C1565730qqZ.LIZIZ(numLIZ.intValue(), (Context) abstractC1563340qmi.LL);
                        return viewModelAndroidx_lifecycle_SharedViewModelProvider__get$___twin___;
                    }
                }
            }
        }
        return sharedViewModelProvider.androidx_lifecycle_SharedViewModelProvider__get$___twin___(lifecycle, str, cls);
    }
}
